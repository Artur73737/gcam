public final class ajd extends bba implements blv {
   public qvx a;
   public int b;

   public ajd(int var1, qvx var2) {
      this.b = var1;
      this.a = var2;
   }

   public final bju a(bjw var1, bjs var2, long var3) {
      int var5 = this.b;
      int var6 = 0;
      if (var5 != 1) {
         var5 = 0;
      } else {
         var5 = bxq.d(var3);
      }

      if (this.b == 2) {
         var6 = bxq.c(var3);
      }

      bke var7 = var2.l(car.X(var5, bxq.b(var3), var6, bxq.a(var3)));
      var6 = qxb.m(var7.a, bxq.d(var3), bxq.b(var3));
      var5 = qxb.m(var7.b, bxq.c(var3), bxq.a(var3));
      return ja.g(var1, var6, var5, new ajc(this, var6, var7, var5, var1));
   }
}
