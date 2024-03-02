import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout.LayoutParams;

@Deprecated
public final class cpc extends LayoutParams {
   private coz a;

   public cpc() {
      super(-1, -1);
   }

   public cpc(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var5 = var1.obtainStyledAttributes(var2, coy.a);
      float var3 = var5.getFraction(9, 1, 1, -1.0F);
      coz var7;
      if (var3 != -1.0F) {
         var7 = new coz();
         var7.a = var3;
      } else {
         var7 = null;
      }

      var3 = var5.getFraction(1, 1, 1, -1.0F);
      coz var6 = var7;
      if (var3 != -1.0F) {
         var6 = var7;
         if (var7 == null) {
            var6 = new coz();
         }

         var6.b = var3;
      }

      var3 = var5.getFraction(5, 1, 1, -1.0F);
      var7 = var6;
      if (var3 != -1.0F) {
         var7 = var6;
         if (var6 == null) {
            var7 = new coz();
         }

         var7.c = var3;
         var7.d = var3;
         var7.e = var3;
         var7.f = var3;
      }

      var3 = var5.getFraction(4, 1, 1, -1.0F);
      var6 = var7;
      if (var3 != -1.0F) {
         var6 = var7;
         if (var7 == null) {
            var6 = new coz();
         }

         var6.c = var3;
      }

      var3 = var5.getFraction(8, 1, 1, -1.0F);
      var7 = var6;
      if (var3 != -1.0F) {
         var7 = var6;
         if (var6 == null) {
            var7 = new coz();
         }

         var7.d = var3;
      }

      var3 = var5.getFraction(6, 1, 1, -1.0F);
      var6 = var7;
      if (var3 != -1.0F) {
         var6 = var7;
         if (var7 == null) {
            var6 = new coz();
         }

         var6.e = var3;
      }

      var3 = var5.getFraction(2, 1, 1, -1.0F);
      var7 = var6;
      if (var3 != -1.0F) {
         var7 = var6;
         if (var6 == null) {
            var7 = new coz();
         }

         var7.f = var3;
      }

      var3 = var5.getFraction(7, 1, 1, -1.0F);
      coz var4 = var7;
      if (var3 != -1.0F) {
         var4 = var7;
         if (var7 == null) {
            var4 = new coz();
         }

         var4.g = var3;
      }

      var3 = var5.getFraction(3, 1, 1, -1.0F);
      var6 = var4;
      if (var3 != -1.0F) {
         var6 = var4;
         if (var4 == null) {
            var6 = new coz();
         }

         var6.h = var3;
      }

      var3 = var5.getFraction(0, 1, 1, -1.0F);
      var7 = var6;
      if (var3 != -1.0F) {
         var7 = var6;
         if (var6 == null) {
            var7 = new coz();
         }

         var7.i = var3;
      }

      var5.recycle();
      this.a = var7;
   }

   public final coz a() {
      if (this.a == null) {
         this.a = new coz();
      }

      return this.a;
   }

   protected final void setBaseAttributes(TypedArray var1, int var2, int var3) {
      super.width = var1.getLayoutDimension(var2, 0);
      super.height = var1.getLayoutDimension(var3, 0);
   }
}
