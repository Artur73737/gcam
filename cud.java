import android.view.ViewGroup;

public final class cud {
   static int a(ViewGroup var0, int var1) {
      return var0.getChildDrawingOrder(var1);
   }

   static void b(ViewGroup var0, boolean var1) {
      var0.suppressLayout(var1);
   }
}
