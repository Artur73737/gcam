import android.view.ViewGroup.MarginLayoutParams;

public final class cfk {
   static int a(MarginLayoutParams var0) {
      return var0.getLayoutDirection();
   }

   public static int b(MarginLayoutParams var0) {
      return var0.getMarginEnd();
   }

   public static int c(MarginLayoutParams var0) {
      return var0.getMarginStart();
   }

   public static void d(MarginLayoutParams var0, int var1) {
      var0.resolveLayoutDirection(var1);
   }

   static void e(MarginLayoutParams var0, int var1) {
      var0.setLayoutDirection(var1);
   }

   public static void f(MarginLayoutParams var0, int var1) {
      var0.setMarginEnd(var1);
   }

   public static void g(MarginLayoutParams var0, int var1) {
      var0.setMarginStart(var1);
   }

   static boolean h(MarginLayoutParams var0) {
      return var0.isMarginRelative();
   }
}
