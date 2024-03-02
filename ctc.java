import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

final class ctc extends AnimatorListenerAdapter implements ctn {
   private final View a;
   private boolean b = false;

   public ctc(View var1) {
      this.a = var1;
   }

   public final void a(ctr var1) {
   }

   public final void b() {
   }

   public final void c() {
      float var1;
      if (this.a.getVisibility() == 0) {
         View var3 = this.a;
         int var2 = cug.b;
         var1 = var3.getTransitionAlpha();
      } else {
         var1 = 0.0F;
      }

      this.a.setTag(2131428380, var1);
   }

   public final void d() {
      this.a.setTag(2131428380, (Object)null);
   }

   public final void e(ctr var1) {
   }

   // $FF: synthetic method
   public final void f(ctr var1) {
      ctz.c(this, var1);
   }

   public final void g(ctr var1) {
   }

   public final void onAnimationCancel(Animator var1) {
      View var3 = this.a;
      int var2 = cug.b;
      var3.setTransitionAlpha(1.0F);
   }

   public final void onAnimationEnd(Animator var1) {
      this.onAnimationEnd(var1, false);
   }

   public final void onAnimationEnd(Animator var1, boolean var2) {
      if (this.b) {
         this.a.setLayerType(0, (Paint)null);
      }

      if (!var2) {
         View var4 = this.a;
         int var3 = cug.b;
         var4.setTransitionAlpha(1.0F);
      }

   }

   public final void onAnimationStart(Animator var1) {
      if (cfx.q(this.a) && this.a.getLayerType() == 0) {
         this.b = true;
         this.a.setLayerType(2, (Paint)null);
      }

   }
}
