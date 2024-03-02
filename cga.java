import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public final class cga {
   static int a(View var0) {
      return var0.getAccessibilityLiveRegion();
   }

   static void b(ViewParent var0, View var1, View var2, int var3) {
      var0.notifySubtreeAccessibilityStateChanged(var1, var2, var3);
   }

   static void c(View var0, int var1) {
      var0.setAccessibilityLiveRegion(var1);
   }

   static void d(AccessibilityEvent var0, int var1) {
      var0.setContentChangeTypes(var1);
   }

   public static boolean e(View var0) {
      return var0.isAttachedToWindow();
   }

   public static boolean f(View var0) {
      return var0.isLaidOut();
   }

   static boolean g(View var0) {
      return var0.isLayoutDirectionResolved();
   }
}
