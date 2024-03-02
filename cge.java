import android.view.View;
import android.view.WindowInsets;

public final class cge {
   static int a(View var0) {
      return var0.getScrollIndicators();
   }

   public static cho b(View var0) {
      WindowInsets var1 = var0.getRootWindowInsets();
      if (var1 == null) {
         return null;
      } else {
         cho var2 = cho.m(var1);
         var2.p(var2);
         var2.o(var0.getRootView());
         return var2;
      }
   }

   static void c(View var0, int var1) {
      var0.setScrollIndicators(var1);
   }

   public static void d(View var0, int var1, int var2) {
      var0.setScrollIndicators(var1, var2);
   }
}
