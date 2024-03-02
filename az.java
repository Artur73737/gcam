import android.animation.AnimatorSet;

// $FF: synthetic class
public final class az implements cec {
   public final dk a;
   public final AnimatorSet b;

   // $FF: synthetic method
   public az(dk var1, AnimatorSet var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void a() {
      dk var2 = this.a;
      this.b.end();
      if (cp.S(2)) {
         StringBuilder var1 = new StringBuilder();
         var1.append("Animator from operation ");
         var1.append(var2);
         var1.append(" has been canceled");
         var1.append(".");
         var1.append(' ');
      }

   }
}
