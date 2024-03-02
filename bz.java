import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

final class bz extends AnimationSet implements Runnable {
   private final ViewGroup a;
   private final View b;
   private boolean c;
   private boolean d;
   private boolean e = true;

   public bz(Animation var1, ViewGroup var2, View var3) {
      super(false);
      this.a = var2;
      this.b = var3;
      this.addAnimation(var1);
      var2.post(this);
   }

   public final boolean getTransformation(long var1, Transformation var3) {
      this.e = true;
      if (this.c) {
         return !this.d;
      } else {
         if (!super.getTransformation(var1, var3)) {
            this.c = true;
            cft.b(this.a, this);
         }

         return true;
      }
   }

   public final boolean getTransformation(long var1, Transformation var3, float var4) {
      this.e = true;
      if (this.c) {
         return !this.d;
      } else {
         if (!super.getTransformation(var1, var3, var4)) {
            this.c = true;
            cft.b(this.a, this);
         }

         return true;
      }
   }

   public final void run() {
      if (!this.c && this.e) {
         this.e = false;
         this.a.post(this);
      } else {
         this.a.endViewTransition(this.b);
         this.d = true;
      }
   }
}
