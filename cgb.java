import android.view.View;
import android.view.WindowInsets;

public final class cgb {
   static WindowInsets a(View var0, WindowInsets var1) {
      return var0.dispatchApplyWindowInsets(var1);
   }

   static WindowInsets b(View var0, WindowInsets var1) {
      return var0.onApplyWindowInsets(var1);
   }

   public static void c(View var0) {
      var0.requestApplyInsets();
   }
}
