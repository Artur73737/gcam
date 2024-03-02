import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class xa extends Drawable {
   private static final double a = Math.cos(Math.toRadians(45.0D));

   public static float a(float var0, float var1, boolean var2) {
      float var9 = var0;
      if (var2) {
         double var5 = (double)var0;
         double var7 = a;
         double var3 = (double)var1;
         Double.isNaN(var3);
         Double.isNaN(var5);
         var9 = (float)(var5 + (1.0D - var7) * var3);
      }

      return var9;
   }

   public static float b(float var0, float var1, boolean var2) {
      float var9 = var0 * 1.5F;
      var0 = var9;
      if (var2) {
         double var7 = a;
         double var5 = (double)var1;
         double var3 = (double)var9;
         Double.isNaN(var5);
         Double.isNaN(var3);
         var0 = (float)(var3 + (1.0D - var7) * var5);
      }

      return var0;
   }

   public final void draw(Canvas var1) {
      throw null;
   }

   public final int getOpacity() {
      throw null;
   }

   public final boolean getPadding(Rect var1) {
      throw null;
   }

   public final boolean isStateful() {
      throw null;
   }

   protected final void onBoundsChange(Rect var1) {
      throw null;
   }

   protected final boolean onStateChange(int[] var1) {
      throw null;
   }

   public final void setAlpha(int var1) {
      throw null;
   }

   public final void setColorFilter(ColorFilter var1) {
      throw null;
   }
}
