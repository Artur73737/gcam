import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

final class cvp {
   public static final MarginLayoutParams a;

   static {
      MarginLayoutParams var0 = new MarginLayoutParams(-1, -1);
      a = var0;
      var0.setMargins(0, 0, 0, 0);
   }

   public static boolean a(View var0) {
      if (var0 instanceof ViewGroup) {
         ViewGroup var4 = (ViewGroup)var0;
         LayoutTransition var3 = var4.getLayoutTransition();
         if (var3 != null && var3.isChangingLayout()) {
            return true;
         }

         int var2 = var4.getChildCount();

         for(int var1 = 0; var1 < var2; ++var1) {
            if (a(var4.getChildAt(var1))) {
               return true;
            }
         }
      }

      return false;
   }
}
