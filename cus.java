import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Animatable2.AnimationCallback;

public class cus {
   static void a(Object var0) {
      ((AnimatedVectorDrawable)var0).clearAnimationCallbacks();
   }

   public static void b(Object var0, Object var1) {
      ((AnimatedVectorDrawable)var0).registerAnimationCallback((AnimationCallback)var1);
   }

   public static boolean c(Object var0, Object var1) {
      return ((AnimatedVectorDrawable)var0).unregisterAnimationCallback((AnimationCallback)var1);
   }

   public boolean d(int var1) {
      throw null;
   }
}
