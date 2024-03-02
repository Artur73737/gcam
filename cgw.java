import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class cgw extends AnimatorListenerAdapter {
   final cgy a;

   public cgw(cgy var1) {
      this.a = var1;
   }

   public final void onAnimationCancel(Animator var1) {
      this.a.c();
   }

   public final void onAnimationEnd(Animator var1) {
      this.a.a();
   }

   public final void onAnimationStart(Animator var1) {
      this.a.b();
   }
}
