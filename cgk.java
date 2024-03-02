import android.view.View;

public final class cgk {
   static int a(View var0) {
      return var0.getImportantForContentCapture();
   }

   static CharSequence b(View var0) {
      return var0.getStateDescription();
   }

   public static void c(View var0, int var1) {
      var0.setImportantForContentCapture(var1);
   }

   public static void d(View var0, CharSequence var1) {
      var0.setStateDescription(var1);
   }

   static boolean e(View var0) {
      return var0.isImportantForContentCapture();
   }
}
