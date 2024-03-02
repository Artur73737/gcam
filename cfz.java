import android.graphics.Rect;
import android.view.View;

public final class cfz {
   public static Rect a(View var0) {
      return var0.getClipBounds();
   }

   public static void b(View var0, Rect var1) {
      var0.setClipBounds(var1);
   }

   static boolean c(View var0) {
      return var0.isInLayout();
   }
}
