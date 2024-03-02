import android.view.View;
import android.view.View.OnUnhandledKeyEventListener;
import android.view.autofill.AutofillId;

final class cgi {
   static CharSequence a(View var0) {
      return var0.getAccessibilityPaneTitle();
   }

   static Object b(View var0, int var1) {
      return var0.requireViewById(var1);
   }

   static void c(View var0, cgl var1) {
      xo var3 = (xo)var0.getTag(2131428309);
      xo var2 = var3;
      if (var3 == null) {
         var2 = new xo();
         var0.setTag(2131428309, var2);
      }

      var1.getClass();
      cgh var4 = new cgh(var1);
      var2.put(var1, var4);
      var0.addOnUnhandledKeyEventListener(var4);
   }

   static void d(View var0, cgl var1) {
      xo var2 = (xo)var0.getTag(2131428309);
      if (var2 != null) {
         OnUnhandledKeyEventListener var3 = (OnUnhandledKeyEventListener)var2.get(var1);
         if (var3 != null) {
            var0.removeOnUnhandledKeyEventListener(var3);
         }

      }
   }

   static void e(View var0, boolean var1) {
      var0.setAccessibilityHeading(var1);
   }

   static void f(View var0, CharSequence var1) {
      var0.setAccessibilityPaneTitle(var1);
   }

   public static void g(View var0, AutofillId var1) {
      var0.setAutofillId(var1);
   }

   static void h(View var0, boolean var1) {
      var0.setScreenReaderFocusable(var1);
   }

   static boolean i(View var0) {
      return var0.isAccessibilityHeading();
   }

   static boolean j(View var0) {
      return var0.isScreenReaderFocusable();
   }
}
