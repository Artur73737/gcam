import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

final class cui extends AnimatorListenerAdapter implements ctn {
   final cuk a;
   private final ViewGroup b;
   private final View c;
   private final View d;
   private boolean e;

   public cui(cuk var1, ViewGroup var2, View var3, View var4) {
      this.a = var1;
      this.e = true;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   private final void h() {
      this.d.setTag(2131428151, (Object)null);
      this.b.getOverlay().remove(this.c);
      this.e = false;
   }

   public final void a(ctr var1) {
      var1.A(this);
   }

   public final void b() {
      if (this.e) {
         this.h();
      }

   }

   public final void c() {
   }

   public final void d() {
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

   public final void onAnimationEnd(Animator var1) {
      this.h();
   }

   public final void onAnimationEnd(Animator var1, boolean var2) {
      if (!var2) {
         this.h();
      }

   }

   public final void onAnimationPause(Animator var1) {
      this.b.getOverlay().remove(this.c);
   }

   public final void onAnimationResume(Animator var1) {
      if (this.c.getParent() == null) {
         this.b.getOverlay().add(this.c);
      } else {
         this.a.m();
      }
   }

   public final void onAnimationStart(Animator var1, boolean var2) {
      if (var2) {
         this.d.setTag(2131428151, this.c);
         this.b.getOverlay().add(this.c);
         this.e = true;
      }

   }
}
