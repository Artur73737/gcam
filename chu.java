import android.view.accessibility.AccessibilityRecord;

public final class chu {
   static int a(AccessibilityRecord var0) {
      return var0.getMaxScrollX();
   }

   static int b(AccessibilityRecord var0) {
      return var0.getMaxScrollY();
   }

   public static void c(AccessibilityRecord var0, int var1) {
      var0.setMaxScrollX(var1);
   }

   public static void d(AccessibilityRecord var0, int var1) {
      var0.setMaxScrollY(var1);
   }
}
