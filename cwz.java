import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

public class cwz implements AnimatorListener {
   private boolean a;

   public void a() {
   }

   public final void onAnimationCancel(Animator var1) {
      this.a = true;
   }

   public final void onAnimationEnd(Animator var1) {
      if (!this.a) {
         this.a();
      }

   }

   public final void onAnimationRepeat(Animator var1) {
   }

   public final void onAnimationStart(Animator var1) {
      this.a = false;
   }
}
