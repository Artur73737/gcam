import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import java.util.ArrayList;

final class da implements TransitionListener {
   final Object a;
   final ArrayList b;
   final Object c;
   final ArrayList d;
   final dd e;

   public da(dd var1, Object var2, ArrayList var3, Object var4, ArrayList var5) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   public final void onTransitionCancel(Transition var1) {
   }

   public final void onTransitionEnd(Transition var1) {
      var1.removeListener(this);
   }

   public final void onTransitionPause(Transition var1) {
   }

   public final void onTransitionResume(Transition var1) {
   }

   public final void onTransitionStart(Transition var1) {
      Object var2 = this.a;
      if (var2 != null) {
         this.e.g(var2, this.b, (ArrayList)null);
      }

      var2 = this.c;
      if (var2 != null) {
         this.e.g(var2, this.d, (ArrayList)null);
      }

   }
}
