import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.SparseArray;
import android.view.VelocityTracker;
import android.view.ViewGroup;

final class cxd {
   public final cww a;
   public final int b;
   public final Drawable c;
   public final boolean d;
   public final Paint e = new Paint();
   public VelocityTracker f;
   public boolean g;
   public float h;
   public float i;
   public float j;
   public float k;
   public cjv l;
   public cjv m;
   public Drawable n = null;
   private final SparseArray o = new SparseArray();

   public cxd(cww var1) {
      this.a = var1;
      this.d = var1.getResources().getConfiguration().isScreenRound();
      int var2 = Resources.getSystem().getDisplayMetrics().widthPixels;
      this.b = var2;
      int var3 = Resources.getSystem().getDisplayMetrics().heightPixels;
      ShapeDrawable var4 = new ShapeDrawable(new RectShape());
      var4.setBounds(0, 0, var2, var3);
      var4.getPaint().setColor(-16777216);
      this.c = var4;
   }

   public final ViewGroup a() {
      return this.a.getParent() instanceof ViewGroup ? (ViewGroup)this.a.getParent() : null;
   }

   public final cjv b(float var1, float var2, float var3, cjq var4, cjp var5) {
      cjv var6 = new cjv(new jaq());
      var6.i(var1);
      var6.p = 0.5F;
      cjw var7 = new cjw();
      var7.d(var2);
      var7.c(1.0F);
      var7.e(600.0F);
      var6.h();
      var6.n = (float)this.b;
      var6.h = var3;
      var6.q = var7;
      var6.g(var4);
      var6.f(var5);
      var6.d();
      return var6;
   }

   public final void c(float var1) {
      int var3 = this.a.getWidth();
      this.h = var1;
      var1 = 1.0F - (var1 + var1) / (float)var3;
      this.i = var1;
      var1 = Math.max(0.7F, Math.min(var1, 1.0F));
      this.i = var1;
      float var2 = (var1 - 1.0F) / -0.3F;
      var1 = this.j;
      if (var2 > var1) {
         this.j = var2;
         var1 = var2;
      }

      this.k = Math.min(0.3F, var1 / 2.0F);
      this.e();
   }

   public final void d() {
      this.g = false;
      this.h = 0.0F;
      this.j = 0.0F;
      this.i = 1.0F;
      this.a.setTranslationX(0.0F);
      this.a.setScaleX(1.0F);
      this.a.setScaleY(1.0F);
      this.a.setAlpha(1.0F);
      this.c.setAlpha(0);
      this.e.setColorFilter((ColorFilter)null);
      this.a.setLayerType(0, (Paint)null);
      this.a.setClipToOutline(false);
      ViewGroup var1 = this.a();
      if (var1 != null) {
         var1.setBackground(this.n);
      }

      this.n = null;
   }

   public final void e() {
      this.a.setScaleX(this.i);
      this.a.setScaleY(this.i);
      this.a.setTranslationX(this.h);
      Paint var5 = this.e;
      int var2 = (int)(Math.max(0.0F, Math.min(1.0F, this.k)) * 255.0F);
      int var3 = Color.argb(var2, 0, 0, 0);
      Object var4 = (ColorFilter)this.o.get(var2);
      if (var4 == null) {
         var4 = new PorterDuffColorFilter(var3, Mode.SRC_ATOP);
         this.o.put(var2, var4);
      }

      var5.setColorFilter((ColorFilter)var4);
      this.a.setLayerPaint(this.e);
      float var1 = this.j;
      this.c.setAlpha((int)((1.0F - var1) * 0.5F * 255.0F));
   }
}
