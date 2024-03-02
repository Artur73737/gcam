import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

public final class wz extends Drawable {
   public final float a;
   public float b;
   public boolean c = false;
   public boolean d = true;
   private final Paint e;
   private final RectF f;
   private final Rect g;
   private final ColorStateList h;
   private PorterDuffColorFilter i;
   private ColorStateList j;
   private Mode k;

   public wz(ColorStateList var1, float var2) {
      this.k = Mode.SRC_IN;
      this.a = var2;
      Paint var4 = new Paint(5);
      this.e = var4;
      ColorStateList var3 = var1;
      if (var1 == null) {
         var3 = ColorStateList.valueOf(0);
      }

      this.h = var3;
      var4.setColor(var3.getColorForState(this.getState(), var3.getDefaultColor()));
      this.f = new RectF();
      this.g = new Rect();
   }

   private final PorterDuffColorFilter b(ColorStateList var1, Mode var2) {
      return var1 != null && var2 != null ? new PorterDuffColorFilter(var1.getColorForState(this.getState(), 0), var2) : null;
   }

   public final void a(Rect var1) {
      Rect var4 = var1;
      if (var1 == null) {
         var4 = this.getBounds();
      }

      this.f.set((float)var4.left, (float)var4.top, (float)var4.right, (float)var4.bottom);
      this.g.set(var4);
      if (this.c) {
         float var2 = xa.b(this.b, this.a, this.d);
         float var3 = xa.a(this.b, this.a, this.d);
         this.g.inset((int)Math.ceil((double)var3), (int)Math.ceil((double)var2));
         this.f.set(this.g);
      }

   }

   public final void draw(Canvas var1) {
      Paint var4 = this.e;
      PorterDuffColorFilter var5 = this.i;
      boolean var3 = false;
      if (var5 != null && var4.getColorFilter() == null) {
         var4.setColorFilter(this.i);
         var3 = true;
      }

      RectF var6 = this.f;
      float var2 = this.a;
      var1.drawRoundRect(var6, var2, var2, var4);
      if (var3) {
         var4.setColorFilter((ColorFilter)null);
      }

   }

   public final int getOpacity() {
      return -3;
   }

   public final void getOutline(Outline var1) {
      var1.setRoundRect(this.g, this.a);
   }

   public final boolean isStateful() {
      ColorStateList var1 = this.j;
      if (var1 == null || !var1.isStateful()) {
         var1 = this.h;
         if ((var1 == null || !var1.isStateful()) && !super.isStateful()) {
            return false;
         }
      }

      return true;
   }

   protected final void onBoundsChange(Rect var1) {
      super.onBoundsChange(var1);
      this.a(var1);
   }

   protected final boolean onStateChange(int[] var1) {
      ColorStateList var4 = this.h;
      int var2 = var4.getColorForState(var1, var4.getDefaultColor());
      boolean var3;
      if (var2 != this.e.getColor()) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (var3) {
         this.e.setColor(var2);
      }

      var4 = this.j;
      if (var4 != null) {
         Mode var5 = this.k;
         if (var5 != null) {
            this.i = this.b(var4, var5);
            return true;
         }
      }

      return var3;
   }

   public final void setAlpha(int var1) {
      this.e.setAlpha(var1);
   }

   public final void setColorFilter(ColorFilter var1) {
      this.e.setColorFilter(var1);
   }

   public final void setTintList(ColorStateList var1) {
      this.j = var1;
      this.i = this.b(var1, this.k);
      this.invalidateSelf();
   }

   public final void setTintMode(Mode var1) {
      this.k = var1;
      this.i = this.b(this.j, var1);
      this.invalidateSelf();
   }
}
