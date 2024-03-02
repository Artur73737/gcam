import android.graphics.ColorSpace.Rgb;

// $FF: synthetic class
public final class bda implements bei {
   public final Object a;
   private final int b;

   // $FF: synthetic method
   public bda(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public final double a(double var1) {
      beo var17;
      ben var18;
      double var3;
      double var5;
      double var7;
      double var9;
      double var11;
      double var13;
      double var15;
      switch(this.b) {
      case 0:
         return ((Rgb)this.a).getEotf().applyAsDouble(var1);
      case 1:
         return ((Rgb)this.a).getOetf().applyAsDouble(var1);
      case 2:
         var18 = (ben)this.a;
         return qxb.g(var18.k.a(var1), (double)var18.e, (double)var18.f);
      case 3:
         var18 = (ben)this.a;
         return var18.n.a(qxb.g(var1, (double)var18.e, (double)var18.f));
      case 4:
         var17 = (beo)this.a;
         return bdb.e(var1, var17.b, var17.c, var17.d, var17.e, var17.a);
      case 5:
         var17 = (beo)this.a;
         var11 = var17.b;
         var9 = var17.c;
         var5 = var17.d;
         var3 = var17.e;
         var13 = var17.f;
         var7 = var17.g;
         var15 = var17.a;
         if (var1 >= var3 * var5) {
            var1 = (Math.pow(var1 - var13, 1.0D / var15) - var9) / var11;
         } else {
            var1 = (var1 - var7) / var5;
         }

         return var1;
      case 6:
         var17 = (beo)this.a;
         return bdb.f(var1, var17.b, var17.c, var17.d, var17.e, var17.a);
      default:
         var17 = (beo)this.a;
         var9 = var17.b;
         var13 = var17.c;
         var7 = var17.d;
         var3 = var17.e;
         var11 = var17.f;
         var15 = var17.g;
         var5 = var17.a;
         if (var1 >= var3) {
            var1 = Math.pow(var9 * var1 + var13, var5) + var11;
         } else {
            var1 = var7 * var1 + var15;
         }

         return var1;
      }
   }
}
