import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

public final class cgg {
   public static int a(View var0) {
      return var0.getImportantForAutofill();
   }

   static int b(View var0) {
      return var0.getNextClusterForwardId();
   }

   static View c(View var0, View var1, int var2) {
      return var0.keyboardNavigationClusterSearch(var1, var2);
   }

   public static AutofillId d(View var0) {
      return var0.getAutofillId();
   }

   static void e(View var0, Collection var1, int var2) {
      var0.addKeyboardNavigationClusters(var1, var2);
   }

   static void f(View var0, String... var1) {
      var0.setAutofillHints(var1);
   }

   static void g(View var0, boolean var1) {
      var0.setFocusedByDefault(var1);
   }

   public static void h(View var0, int var1) {
      var0.setImportantForAutofill(var1);
   }

   static void i(View var0, boolean var1) {
      var0.setKeyboardNavigationCluster(var1);
   }

   static void j(View var0, int var1) {
      var0.setNextClusterForwardId(var1);
   }

   static void k(View var0, CharSequence var1) {
      var0.setTooltipText(var1);
   }

   static boolean l(View var0) {
      return var0.hasExplicitFocusable();
   }

   static boolean m(View var0) {
      return var0.isFocusedByDefault();
   }

   static boolean n(View var0) {
      return var0.isImportantForAutofill();
   }

   static boolean o(View var0) {
      return var0.isKeyboardNavigationCluster();
   }

   static boolean p(View var0) {
      return var0.restoreDefaultFocus();
   }
}
