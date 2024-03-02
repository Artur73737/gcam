import android.graphics.Rect;
import android.view.Gravity;

public final class cfi {
   public static void a(int var0, int var1, int var2, Rect var3, Rect var4, int var5) {
      Gravity.apply(var0, var1, var2, var3, var4, var5);
   }

   static void b(int var0, int var1, int var2, Rect var3, int var4, int var5, Rect var6, int var7) {
      Gravity.apply(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   static void c(int var0, Rect var1, Rect var2, int var3) {
      Gravity.applyDisplay(var0, var1, var2, var3);
   }
}
