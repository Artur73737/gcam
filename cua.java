import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public final class cua {
   static boolean a(View var0) {
      return var0.isAttachedToWindow();
   }

   public static Interpolator b(Context var0, int var1) {
      Interpolator var2 = AnimationUtils.loadInterpolator(var0, var1);
      cbx.d(var2, "Failed to parse interpolator, no start tag found");
      return var2;
   }
}
