import android.view.View;
import android.view.ViewParent;

public final class cgu {
   public static void a(ViewParent var0, View var1, int var2, int var3, int[] var4) {
      var0.onNestedPreScroll(var1, var2, var3, var4);
   }

   public static void b(ViewParent var0, View var1, int var2, int var3, int var4, int var5) {
      var0.onNestedScroll(var1, var2, var3, var4, var5);
   }

   public static void c(ViewParent var0, View var1, View var2, int var3) {
      var0.onNestedScrollAccepted(var1, var2, var3);
   }

   public static void d(ViewParent var0, View var1) {
      var0.onStopNestedScroll(var1);
   }

   public static boolean e(ViewParent var0, View var1, float var2, float var3, boolean var4) {
      return var0.onNestedFling(var1, var2, var3, var4);
   }

   public static boolean f(ViewParent var0, View var1, float var2, float var3) {
      return var0.onNestedPreFling(var1, var2, var3);
   }

   public static boolean g(ViewParent var0, View var1, View var2, int var3) {
      return var0.onStartNestedScroll(var1, var2, var3);
   }
}
