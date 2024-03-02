import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

final class cuh extends AnimatorListenerAdapter implements ctn {
   boolean a = false;
   private final View b;
   private final int c;
   private final ViewGroup d;
   private final boolean e;
   private boolean f;

   public cuh(View var1, int var2) {
      this.b = var1;
      this.c = var2;
      this.d = (ViewGroup)var1.getParent();
      this.e = true;
      this.i(true);
   }

   private final void h() {
      if (!this.a) {
         View var3 = this.b;
         int var1 = this.c;
         int var2 = cug.b;
         var3.setTransitionVisibility(var1);
         ViewGroup var4 = this.d;
         if (var4 != null) {
            var4.invalidate();
         }
      }

      this.i(false);
   }

   private final void i(boolean var1) {
      if (this.e && this.f != var1) {
         ViewGroup var2 = this.d;
         if (var2 != null) {
            this.f = var1;
            cud.b(var2, var1);
         }
      }

   }

   public final void a(ctr var1) {
      var1.A(this);
   }

   public final void b() {
   }

   public final void c() {
      this.i(false);
      if (!this.a) {
         View var3 = this.b;
         int var1 = this.c;
         int var2 = cug.b;
         var3.setTransitionVisibility(var1);
      }

   }

   public final void d() {
      this.i(true);
      if (!this.a) {
         View var2 = this.b;
         int var1 = cug.b;
         var2.setTransitionVisibility(0);
      }

   }

   public final void e(ctr var1) {
   }

   // $FF: synthetic method
   public final void f(ctr var1) {
      ctz.c(this, var1);
   }

   // $FF: synthetic method
   public final void g(ctr var1) {
      ctz.d(this, var1);
   }

   public final void onAnimationCancel(Animator var1) {
      this.a = true;
   }

   public final void onAnimationEnd(Animator var1) {
      this.h();
   }

   public final void onAnimationEnd(Animator var1, boolean var2) {
      if (!var2) {
         this.h();
      }

   }

   public final void onAnimationRepeat(Animator var1) {
   }

   public final void onAnimationStart(Animator var1) {
   }

   public final void onAnimationStart(Animator var1, boolean var2) {
      if (var2) {
         View var4 = this.b;
         int var3 = cug.b;
         var4.setTransitionVisibility(0);
         ViewGroup var5 = this.d;
         if (var5 != null) {
            var5.invalidate();
         }
      }

   }
}
