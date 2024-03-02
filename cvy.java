import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

public final class cvy extends LinearLayoutManager {
   final ViewPager2 a;

   public cvy(ViewPager2 var1) {
      this.a = var1;
   }

   protected final void P(mk var1, int[] var2) {
      ViewPager2 var3 = this.a;
      if (var3.h == -1) {
         super.P(var1, var2);
      } else {
         RecyclerView var4 = var3.e;
         if (var3.a() == 0) {
            var4.getWidth();
            var4.getPaddingLeft();
            var4.getPaddingRight();
         } else {
            var4.getHeight();
            var4.getPaddingTop();
            var4.getPaddingBottom();
         }

         var2[0] = 0;
         var2[1] = 0;
      }
   }

   public final boolean bb(RecyclerView var1, View var2, Rect var3, boolean var4, boolean var5) {
      return false;
   }

   public final void n(mc var1, mk var2, View var3, cht var4) {
      cwb var7 = (cwb)this.a.j;
      int var5;
      if (var7.a.a() == 1) {
         var5 = LinearLayoutManager.bh(var3);
      } else {
         var5 = 0;
      }

      int var6;
      if (var7.a.a() == 0) {
         var6 = LinearLayoutManager.bh(var3);
      } else {
         var6 = 0;
      }

      var4.o(eze.Z(var5, 1, var6, 1, false));
   }
}
