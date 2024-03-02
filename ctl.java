import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class ctl extends AnimatorListenerAdapter {
   final ctr a;

   public ctl(ctr var1) {
      this.a = var1;
   }

   public final void onAnimationEnd(Animator var1) {
      this.a.q();
      var1.removeListener(this);
   }
}
