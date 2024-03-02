import android.view.View;
import android.widget.PopupWindow;

public final class ciq {
   public static void a(PopupWindow var0, View var1, int var2, int var3, int var4) {
      var0.showAsDropDown(var1, var2, var3, var4);
   }

   public static boolean b(byte[] var0, byte[] var1) {
      if (var1 == null) {
         return false;
      } else if (var0.length >= var1.length) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (var0[var2] != var1[var2]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static long[] c(Object var0) {
      if (!(var0 instanceof int[])) {
         return var0 instanceof long[] ? (long[])var0 : null;
      } else {
         int[] var3 = (int[])var0;
         long[] var2 = new long[var3.length];

         for(int var1 = 0; var1 < var3.length; ++var1) {
            var2[var1] = (long)var3[var1];
         }

         return var2;
      }
   }
}
