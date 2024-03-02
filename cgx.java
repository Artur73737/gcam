import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewPropertyAnimator;

public final class cgx {
   public static ViewPropertyAnimator a(ViewPropertyAnimator var0, AnimatorUpdateListener var1) {
      return var0.setUpdateListener(var1);
   }
}
