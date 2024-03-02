import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public final class bf implements AnimationListener {
   public static final int e = 0;
   final dk a;
   final View b;
   final bb c;
   final dl d;

   public bf(dk var1, dl var2, View var3, bb var4) {
      this.a = var1;
      this.d = var2;
      this.b = var3;
      this.c = var4;
   }

   public final void onAnimationEnd(Animation var1) {
      var1.getClass();
      dl var2 = this.d;
      var2.a.post(new dce(var2, this.b, this.c, 1));
      if (cp.S(2)) {
         StringBuilder var3 = new StringBuilder();
         var3.append("Animation from operation ");
         var3.append(this.a);
         var3.append(" has ended.");
      }

   }

   public final void onAnimationRepeat(Animation var1) {
      var1.getClass();
   }

   public final void onAnimationStart(Animation var1) {
      var1.getClass();
      if (cp.S(2)) {
         StringBuilder var2 = new StringBuilder();
         var2.append("Animation from operation ");
         var2.append(this.a);
         var2.append(" has reached onAnimationStart.");
      }

   }
}
