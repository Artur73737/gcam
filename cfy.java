import android.graphics.Paint;
import android.view.Display;
import android.view.View;

public final class cfy {
   public static int a() {
      return View.generateViewId();
   }

   static int b(View var0) {
      return var0.getLabelFor();
   }

   public static int c(View var0) {
      return var0.getLayoutDirection();
   }

   public static int d(View var0) {
      return var0.getPaddingEnd();
   }

   public static int e(View var0) {
      return var0.getPaddingStart();
   }

   public static Display f(View var0) {
      return var0.getDisplay();
   }

   static void g(View var0, int var1) {
      var0.setLabelFor(var1);
   }

   static void h(View var0, Paint var1) {
      var0.setLayerPaint(var1);
   }

   static void i(View var0, int var1) {
      var0.setLayoutDirection(var1);
   }

   public static void j(View var0, int var1, int var2, int var3, int var4) {
      var0.setPaddingRelative(var1, var2, var3, var4);
   }

   public static boolean k(View var0) {
      return var0.isPaddingRelative();
   }
}
