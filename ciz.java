import android.view.animation.Interpolator;

public final class ciz implements Interpolator {
   private final int a;

   public ciz(int var1) {
      this.a = var1;
   }

   public final float getInterpolation(float var1) {
      int var2 = this.a;
      --var1;
      switch(var2) {
      case 0:
      case 1:
      case 2:
         return var1 * var1 * var1 * var1 * var1 + 1.0F;
      default:
         return Math.abs(var1);
      }
   }
}
