import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.View;
import java.util.ArrayList;

final class cz implements TransitionListener {
   final View a;
   final ArrayList b;

   public cz(View var1, ArrayList var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void onTransitionCancel(Transition var1) {
   }

   public final void onTransitionEnd(Transition var1) {
      var1.removeListener(this);
      this.a.setVisibility(8);
      int var3 = this.b.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((View)this.b.get(var2)).setVisibility(0);
      }

   }

   public final void onTransitionPause(Transition var1) {
   }

   public final void onTransitionResume(Transition var1) {
   }

   public final void onTransitionStart(Transition var1) {
      var1.removeListener(this);
      var1.addListener(this);
   }
}
