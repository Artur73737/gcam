import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

public final class ctd extends cuk {
   public ctd() {
   }

   public ctd(int var1) {
      super.r = var1;
   }

   private static float K(cuc var0, float var1) {
      if (var0 != null) {
         Float var2 = (Float)var0.a.get("android:fade:transitionAlpha");
         if (var2 != null) {
            return var2;
         }
      }

      return var1;
   }

   private final Animator L(View var1, float var2, float var3) {
      if (var2 == var3) {
         return null;
      } else {
         int var4 = cug.b;
         var1.setTransitionAlpha(var2);
         ObjectAnimator var5 = ObjectAnimator.ofFloat(var1, cug.a, new float[]{var3});
         ctc var6 = new ctc(var1);
         var5.addListener(var6);
         this.i().x(var6);
         return var5;
      }
   }

   public final void c(cuc var1) {
      cuk.J(var1);
      Float var4 = (Float)var1.b.getTag(2131428380);
      Float var3 = var4;
      if (var4 == null) {
         if (var1.b.getVisibility() == 0) {
            View var5 = var1.b;
            int var2 = cug.b;
            var3 = var5.getTransitionAlpha();
         } else {
            var3 = 0.0F;
         }
      }

      var1.a.put("android:fade:transitionAlpha", var3);
   }

   public final Animator e(View var1, cuc var2) {
      int var3 = cug.b;
      return this.L(var1, K(var2, 0.0F), 1.0F);
   }

   public final Animator f(View var1, cuc var2, cuc var3) {
      int var4 = cug.b;
      Animator var5 = this.L(var1, K(var2, 1.0F), 0.0F);
      if (var5 == null) {
         var1.setTransitionAlpha(K(var3, 1.0F));
      }

      return var5;
   }
}
