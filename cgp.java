import android.view.ViewGroup;

public final class cgp {
   static int a(ViewGroup var0) {
      return var0.getNestedScrollAxes();
   }

   static void b(ViewGroup var0, boolean var1) {
      var0.setTransitionGroup(var1);
   }

   public static boolean c(ViewGroup var0) {
      return var0.isTransitionGroup();
   }
}
