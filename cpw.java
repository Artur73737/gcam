import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class cpw extends es {
   public Drawable a;
   public int b;
   public boolean c;
   final cqa d;

   public cpw(cqa var1) {
      this.d = var1;
      this.c = true;
   }

   private final boolean o(View var1, RecyclerView var2) {
      mn var7 = var2.g(var1);
      boolean var6 = var7 instanceof cqj;
      boolean var5 = false;
      boolean var4 = var5;
      if (var6) {
         var4 = var5;
         if (((cqj)var7).v) {
            var4 = this.c;
            int var3 = var2.indexOfChild(var1);
            if (var3 < var2.getChildCount() - 1) {
               mn var8 = var2.g(var2.getChildAt(var3 + 1));
               if (var8 instanceof cqj && ((cqj)var8).u) {
                  var4 = true;
               } else {
                  var4 = var5;
               }
            }
         }
      }

      return var4;
   }

   public final void c(Rect var1, View var2, RecyclerView var3) {
      if (this.o(var2, var3)) {
         var1.bottom = this.b;
      }

   }

   public final void d(Canvas var1, RecyclerView var2) {
      if (this.a != null) {
         int var4 = var2.getChildCount();
         int var5 = var2.getWidth();

         for(int var3 = 0; var3 < var4; ++var3) {
            View var7 = var2.getChildAt(var3);
            if (this.o(var7, var2)) {
               int var6 = (int)var7.getY() + var7.getHeight();
               this.a.setBounds(0, var6, var5, this.b + var6);
               this.a.draw(var1);
            }
         }

      }
   }
}
