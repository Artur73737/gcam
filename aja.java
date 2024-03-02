public final class aja extends bba implements blv {
   public float a;
   public float b;

   public aja(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public final bju a(bjw var1, bjs var2, long var3) {
      int var5;
      if (!bxt.c(this.a, Float.NaN) && bxq.d(var3) == 0) {
         var5 = qxb.k(qxb.l(var1.eJ(this.a), bxq.b(var3)), 0);
      } else {
         var5 = bxq.d(var3);
      }

      int var7 = bxq.b(var3);
      int var6;
      if (!bxt.c(this.b, Float.NaN) && bxq.c(var3) == 0) {
         var6 = qxb.k(qxb.l(var1.eJ(this.b), bxq.a(var3)), 0);
      } else {
         var6 = bxq.c(var3);
      }

      bke var8 = var2.l(car.X(var5, var7, var6, bxq.a(var3)));
      return ja.g(var1, var8.a, var8.b, new aiz(var8, 0));
   }
}
