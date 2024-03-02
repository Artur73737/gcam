import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import java.util.List;

// $FF: synthetic class
public final class bob implements AccessibilityStateChangeListener {
   public final bol a;

   // $FF: synthetic method
   public bob(bol var1) {
      this.a = var1;
   }

   public final void onAccessibilityStateChanged(boolean var1) {
      bol var3 = this.a;
      Object var2;
      if (var1) {
         var2 = var3.d.getEnabledAccessibilityServiceList(-1);
      } else {
         var2 = qtf.a;
      }

      var3.g = (List)var2;
   }
}
