import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class bqc extends View implements bnd {
   public static Method a;
   public static Field b;
   public static boolean c;
   public static boolean d;
   private static final qvx g;
   private static final ViewOutlineProvider h;
   public final bpv e;
   public boolean f;
   private final boa i;
   private final bpm j;
   private qvt k;
   private qvi l;
   private boolean m;
   private Rect n;
   private boolean o;
   private final bps p;
   private long q;
   private boolean r;
   private final dmw s;

   static {
      g = bpf.d;
      h = new bqb();
   }

   public bqc(boa var1, bpm var2, qvt var3, qvi var4) {
      super(var1.getContext());
      this.i = var1;
      this.j = var2;
      this.k = var3;
      this.l = var4;
      this.e = new bpv(var1.d);
      this.s = new dmw((byte[])null, (byte[])null);
      this.p = new bps(g);
      this.q = bdx.a;
      this.r = true;
      this.setWillNotDraw(false);
      var2.addView(this);
      View.generateViewId();
   }

   private final void k() {
      Rect var1;
      if (this.m) {
         var1 = this.n;
         if (var1 == null) {
            this.n = new Rect(0, 0, this.getWidth(), this.getHeight());
         } else {
            var1.set(0, 0, this.getWidth(), this.getHeight());
         }

         var1 = this.n;
      } else {
         var1 = null;
      }

      this.setClipBounds(var1);
   }

   private final void l(boolean var1) {
      if (var1 != this.f) {
         this.f = var1;
         this.i.h(this, var1);
      }

   }

   private final void m() {
      ViewOutlineProvider var1;
      if (this.e.a() != null) {
         var1 = h;
      } else {
         var1 = null;
      }

      this.setOutlineProvider(var1);
   }

   private final bbf n() {
      return this.getClipToOutline() && !this.e.d() ? this.e.g() : null;
   }

   public final long a(long var1, boolean var3) {
      if (var3) {
         float[] var4 = this.p.b(this);
         if (var4 != null) {
            var1 = bdf.a(var4, var1);
         } else {
            var1 = bci.b;
         }
      } else {
         var1 = bdf.a(this.p.c(this), var1);
      }

      return var1;
   }

   public final void b() {
      this.l(false);
      this.i.p();
      this.k = null;
      this.l = null;
      this.i.s(this);
      this.j.removeViewInLayout(this);
   }

   public final void c(bcw var1) {
      boolean var2;
      if (this.getElevation() > 0.0F) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.o = var2;
      if (var2) {
         var1.c();
      }

      this.j.a(var1, this, this.getDrawingTime());
      if (this.o) {
         var1.b();
      }

   }

   public final void d(bch var1, boolean var2) {
      if (var2) {
         float[] var3 = this.p.b(this);
         if (var3 != null) {
            bdf.b(var3, var1);
         } else {
            var1.c();
         }
      } else {
         bdf.b(this.p.c(this), var1);
      }
   }

   protected final void dispatchDraw(Canvas var1) {
      var1.getClass();
      dmw var4 = this.s;
      bcm var5 = (bcm)var4.a;
      Canvas var3 = var5.a;
      var5.f(var1);
      Object var7 = var4.a;
      boolean var2;
      if (this.n() == null && var1.isHardwareAccelerated()) {
         var2 = false;
      } else {
         ((bcw)var7).e();
         this.e.b((bcw)var7);
         var2 = true;
      }

      qvt var6 = this.k;
      if (var6 != null) {
         var6.eo(var7);
      }

      if (var2) {
         ((bcw)var7).d();
      }

      ((bcm)var4.a).f(var3);
      this.l(false);
   }

   public final void e(long var1) {
      int var3 = bxw.a(var1);
      if (var3 != this.getLeft()) {
         this.offsetLeftAndRight(var3 - this.getLeft());
         this.p.a();
      }

      var3 = bxw.b(var1);
      if (var3 != this.getTop()) {
         this.offsetTopAndBottom(var3 - this.getTop());
         this.p.a();
      }

   }

   public final void f(long var1) {
      int var7 = bxx.a(var1);
      int var6 = bxx.b(var1);
      if (var6 != this.getWidth() || var7 != this.getHeight()) {
         float var4 = bdx.a(this.q);
         float var3 = (float)var6;
         this.setPivotX(var4 * var3);
         var4 = bdx.b(this.q);
         float var5 = (float)var7;
         this.setPivotY(var4 * var5);
         this.e.c(et.k(var3, var5));
         this.m();
         this.layout(this.getLeft(), this.getTop(), this.getLeft() + var6, this.getTop() + var7);
         this.k();
         this.p.a();
      }
   }

   public final void forceLayout() {
   }

   public final void g(qvt var1, qvi var2) {
      this.j.addView(this);
      this.m = false;
      this.o = false;
      this.q = bdx.a;
      this.k = var1;
      this.l = var2;
   }

   public final void h() {
      if (this.f && !d) {
         kf.b(this);
         this.l(false);
      }

   }

   public final boolean hasOverlappingRendering() {
      return this.r;
   }

   public final boolean i(long var1) {
      float var3 = bci.b(var1);
      float var4 = bci.c(var1);
      if (this.m) {
         return !(var3 < 0.0F) && var3 < (float)this.getWidth() && !(var4 < 0.0F) && var4 < (float)this.getHeight();
      } else {
         return this.getClipToOutline() ? this.e.e(var1) : true;
      }
   }

   public final void invalidate() {
      if (!this.f) {
         this.l(true);
         super.invalidate();
         this.i.invalidate();
      }

   }

   public final void j(float var1, float var2, float var3, float var4, float var5, float var6, long var7, bdr var9, boolean var10, long var11, long var13, int var15, bxy var16, bxr var17) {
      var9.getClass();
      var16.getClass();
      var17.getClass();
      this.q = var7;
      this.setScaleX(var1);
      this.setScaleY(var2);
      this.setAlpha(var3);
      this.setTranslationX(0.0F);
      this.setTranslationY(0.0F);
      this.setElevation(var4);
      this.setRotation(var5);
      this.setRotationX(0.0F);
      this.setRotationY(0.0F);
      this.setPivotX(bdx.a(this.q) * (float)this.getWidth());
      this.setPivotY(bdx.b(this.q) * (float)this.getHeight());
      this.setCameraDistance((float)this.getResources().getDisplayMetrics().densityDpi * var6);
      boolean var21 = true;
      boolean var20;
      if (var10 && var9 == bdm.a) {
         var20 = true;
      } else {
         var20 = false;
      }

      this.m = var20;
      this.k();
      boolean var18;
      if (this.n() == null) {
         var18 = false;
      } else {
         var18 = true;
      }

      if (var10 && var9 != bdm.a) {
         var10 = true;
      } else {
         var10 = false;
      }

      this.setClipToOutline(var10);
      var10 = this.e.f(var9, this.getAlpha(), this.getClipToOutline(), this.getElevation(), var16, var17);
      this.m();
      bbf var22 = this.n();
      boolean var19;
      if (var22 == null) {
         var19 = false;
      } else {
         var19 = true;
      }

      if (var18 != var19 || var22 != null && var10) {
         this.invalidate();
      }

      if (!this.o && this.getElevation() > 0.0F) {
         qvi var23 = this.l;
         if (var23 != null) {
            var23.a();
         }
      }

      this.p.a();
      bqe.a.a(this, bcq.h(var11));
      bqe.a.b(this, bcq.h(var13));
      bqf.a.a(this, (bdn)null);
      if (c.n(var15, 1)) {
         this.setLayerType(2, (Paint)null);
         var10 = var21;
      } else if (c.n(var15, 2)) {
         this.setLayerType(0, (Paint)null);
         var10 = false;
      } else {
         this.setLayerType(0, (Paint)null);
         var10 = var21;
      }

      this.r = var10;
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
   }
}
