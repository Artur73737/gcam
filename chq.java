import android.view.accessibility.AccessibilityEvent;

public final class chq {
   public static int a(AccessibilityEvent var0) {
      return var0.getContentChangeTypes();
   }

   public static void b(AccessibilityEvent var0, int var1) {
      var0.setContentChangeTypes(var1);
   }
}
