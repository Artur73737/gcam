import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

public final class cup extends AnimatorListenerAdapter {
   final cut a;

   public cup(cut var1) {
      this.a = var1;
   }

   public final void onAnimationEnd(Animator var1) {
      ArrayList var4 = new ArrayList(this.a.c);
      int var3 = var4.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((cuo)var4.get(var2)).b(this.a);
      }

   }

   public final void onAnimationStart(Animator var1) {
      ArrayList var4 = new ArrayList(this.a.c);
      int var3 = var4.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((cuo)var4.get(var2)).c(this.a);
      }

   }
}
