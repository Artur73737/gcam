import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class css {
   static void a(Animator var0, AnimatorListenerAdapter var1) {
      var0.addPauseListener(var1);
   }

   static void b(Animator var0) {
      var0.pause();
   }

   static void c(Animator var0) {
      var0.resume();
   }
}
