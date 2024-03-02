import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class ctk extends AnimatorListenerAdapter {
   final xh a;
   final ctr b;

   public ctk(ctr var1, xh var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void onAnimationEnd(Animator var1) {
      this.a.remove(var1);
      this.b.i.remove(var1);
   }

   public final void onAnimationStart(Animator var1) {
      this.b.i.add(var1);
   }
}
