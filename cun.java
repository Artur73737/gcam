import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable2.AnimationCallback;

final class cun extends AnimationCallback {
   final cuo a;

   public cun(cuo var1) {
      this.a = var1;
   }

   public final void onAnimationEnd(Drawable var1) {
      this.a.b(var1);
   }

   public final void onAnimationStart(Drawable var1) {
      this.a.c(var1);
   }
}
