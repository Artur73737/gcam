import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.behavior.SwipeDismissBehavior;

public final class cvz implements cic {
   final Object a;
   private final int b;

   public cvz(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public final boolean a(View var1) {
      int var2 = this.b;
      boolean var5 = true;
      Object var7;
      ViewPager2 var8;
      switch(var2) {
      case 0:
         var8 = (ViewPager2)var1;
         var7 = this.a;
         var2 = var8.b;
         ((cwb)var7).e(var2 - 1);
         return true;
      case 1:
         var8 = (ViewPager2)var1;
         var7 = this.a;
         var2 = var8.b;
         ((cwb)var7).e(var2 + 1);
         return true;
      default:
         boolean var6 = ((SwipeDismissBehavior)this.a).G(var1);
         boolean var3 = false;
         if (var6) {
            boolean var9;
            if (cfy.c(var1) == 1) {
               var9 = true;
            } else {
               var9 = false;
            }

            label34: {
               label42: {
                  int var4 = ((SwipeDismissBehavior)this.a).c;
                  if (var4 == 0) {
                     if (var9) {
                        break label42;
                     }

                     var9 = var3;
                  }

                  if (var4 != 1 || var9) {
                     var2 = var1.getWidth();
                     break label34;
                  }
               }

               var2 = -var1.getWidth();
            }

            var1.offsetLeftAndRight(var2);
            var1.setAlpha(0.0F);
         } else {
            var5 = false;
         }

         return var5;
      }
   }
}
