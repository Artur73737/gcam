import android.view.MotionEvent;

final class bpu {
   public static final bpu a = new bpu();

   private bpu() {
   }

   public final boolean a(MotionEvent var1, int var2) {
      var1.getClass();
      float var3 = var1.getRawX(var2);
      if (!Float.isInfinite(var3) && !Float.isNaN(var3)) {
         var3 = var1.getRawY(var2);
         if (!Float.isInfinite(var3) && !Float.isNaN(var3)) {
            return true;
         }
      }

      return false;
   }
}
