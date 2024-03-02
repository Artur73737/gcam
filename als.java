import android.graphics.Rect;
import android.view.View;

final class als implements ali {
   final blf a;

   public als(blf var1) {
      this.a = var1;
   }

   public final Object b(bjf var1, qvi var2, que var3) {
      View var7 = (View)jj.l(this.a, bou.e);
      long var4 = iy.d(var1);
      bcj var6 = (bcj)var2.a();
      if (var6 != null) {
         var6 = var6.g(var4);
      } else {
         var6 = null;
      }

      if (var6 != null) {
         var7.requestRectangleOnScreen(new Rect((int)var6.b, (int)var6.c, (int)var6.d, (int)var6.e), false);
      }

      return qsn.a;
   }
}
