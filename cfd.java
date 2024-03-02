import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeProvider;

final class cfd {
   static AccessibilityNodeProvider a(AccessibilityDelegate var0, View var1) {
      return var0.getAccessibilityNodeProvider(var1);
   }

   static boolean b(AccessibilityDelegate var0, View var1, int var2, Bundle var3) {
      return var0.performAccessibilityAction(var1, var2, var3);
   }
}
