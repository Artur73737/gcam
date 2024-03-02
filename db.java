import android.transition.Transition;
import android.transition.Transition.TransitionListener;

final class db implements TransitionListener {
   final Runnable a;

   public db(Runnable var1) {
      this.a = var1;
   }

   public final void onTransitionCancel(Transition var1) {
   }

   public final void onTransitionEnd(Transition var1) {
      this.a.run();
   }

   public final void onTransitionPause(Transition var1) {
   }

   public final void onTransitionResume(Transition var1) {
   }

   public final void onTransitionStart(Transition var1) {
   }
}
