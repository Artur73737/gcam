import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

final class cfg {
   static int a(DisplayCutout var0) {
      return var0.getSafeInsetBottom();
   }

   static int b(DisplayCutout var0) {
      return var0.getSafeInsetLeft();
   }

   static int c(DisplayCutout var0) {
      return var0.getSafeInsetRight();
   }

   static int d(DisplayCutout var0) {
      return var0.getSafeInsetTop();
   }

   static DisplayCutout e(Rect var0, List var1) {
      return new DisplayCutout(var0, var1);
   }

   static List f(DisplayCutout var0) {
      return var0.getBoundingRects();
   }
}
