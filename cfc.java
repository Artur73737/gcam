import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class cfc extends AccessibilityDelegate {
   final cfe a;

   public cfc(cfe var1) {
      this.a = var1;
   }

   public final boolean dispatchPopulateAccessibilityEvent(View var1, AccessibilityEvent var2) {
      return this.a.f(var1, var2);
   }

   public final AccessibilityNodeProvider getAccessibilityNodeProvider(View var1) {
      eze var2 = this.a.i(var1);
      return var2 != null ? (AccessibilityNodeProvider)var2.a : null;
   }

   public final void onInitializeAccessibilityEvent(View var1, AccessibilityEvent var2) {
      this.a.a(var1, var2);
   }

   public final void onInitializeAccessibilityNodeInfo(View var1, AccessibilityNodeInfo var2) {
      cht var4 = cht.b(var2);
      int[] var5 = cgm.a;
      var4.v(Boolean.valueOf(cgi.j(var1)));
      var4.q(Boolean.valueOf(cgi.i(var1)));
      var4.t(cgi.a(var1));
      var4.x(cgk.b(var1));
      this.a.b(var1, var4);
      var2.getText();
      List var6 = cfe.S(var1);

      for(int var3 = 0; var3 < var6.size(); ++var3) {
         var4.h((chr)var6.get(var3));
      }

   }

   public final void onPopulateAccessibilityEvent(View var1, AccessibilityEvent var2) {
      this.a.c(var1, var2);
   }

   public final boolean onRequestSendAccessibilityEvent(ViewGroup var1, View var2, AccessibilityEvent var3) {
      return this.a.g(var1, var2, var3);
   }

   public final boolean performAccessibilityAction(View var1, int var2, Bundle var3) {
      return this.a.h(var1, var2, var3);
   }

   public final void sendAccessibilityEvent(View var1, int var2) {
      this.a.d(var1, var2);
   }

   public final void sendAccessibilityEventUnchecked(View var1, AccessibilityEvent var2) {
      this.a.e(var1, var2);
   }
}
