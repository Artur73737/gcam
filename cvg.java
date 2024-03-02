import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

public final class cvg implements cfs {
   final ViewPager a;
   private final Rect b;

   public cvg(ViewPager var1) {
      this.a = var1;
      this.b = new Rect();
   }

   public final cho a(View var1, cho var2) {
      var2 = cgm.c(var1, var2);
      if (var2.q()) {
         return var2;
      } else {
         Rect var6 = this.b;
         var6.left = var2.b();
         var6.top = var2.d();
         var6.right = var2.c();
         var6.bottom = var2.a();
         int var4 = this.a.getChildCount();

         for(int var3 = 0; var3 < var4; ++var3) {
            cho var5 = cgm.b(this.a.getChildAt(var3), var2);
            var6.left = Math.min(var5.b(), var6.left);
            var6.top = Math.min(var5.d(), var6.top);
            var6.right = Math.min(var5.c(), var6.right);
            var6.bottom = Math.min(var5.a(), var6.bottom);
         }

         chf var7 = new chf(var2);
         var7.c(cdi.b(var6));
         return var7.a();
      }
   }
}
