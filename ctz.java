import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

public final class ctz {
   static ViewGroupOverlay a(ViewGroup var0, View var1) {
      ViewGroupOverlay var2 = var0.getOverlay();
      var2.add(var1);
      return var2;
   }

   static ViewGroupOverlay b(ViewGroup var0, View var1) {
      ViewGroupOverlay var2 = var0.getOverlay();
      var2.remove(var1);
      return var2;
   }

   public static void c(ctn var0, ctr var1) {
      var0.a(var1);
   }

   public static void d(ctn var0, ctr var1) {
      var0.e(var1);
   }
}
