public final class aiy extends bba implements blv {
   public float a;
   public float b;
   public float c;
   public float d;
   public boolean e;
   private final int f;

   public aiy(float var1, float var2, float var3, float var4, int var5) {
      this.f = var5;
      this.b = var1;
      this.a = var2;
      this.c = var3;
      this.d = var4;
      this.e = true;
   }

   public aiy(float var1, float var2, float var3, float var4, boolean var5, int var6) {
      this.f = var6;
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public final bju a(bjw var1, bjs var2, long var3) {
      int var5;
      int var6;
      bke var13;
      switch(this.f) {
      case 0:
         boolean var12 = bxt.c(this.c, Float.NaN);
         int var8 = 0;
         if (!var12) {
            var6 = qxb.k(var1.eJ(this.c), 0);
         } else {
            var6 = Integer.MAX_VALUE;
         }

         int var7;
         if (!bxt.c(this.d, Float.NaN)) {
            var7 = qxb.k(var1.eJ(this.d), 0);
         } else {
            var7 = Integer.MAX_VALUE;
         }

         int var9;
         if (!bxt.c(this.a, Float.NaN)) {
            var9 = qxb.k(qxb.l(var1.eJ(this.a), var6), 0);
            var5 = var9;
            if (var9 == Integer.MAX_VALUE) {
               var5 = 0;
            }
         } else {
            var5 = 0;
         }

         if (!bxt.c(this.b, Float.NaN)) {
            var9 = qxb.k(qxb.l(var1.eJ(this.b), var7), 0);
            if (var9 != Integer.MAX_VALUE) {
               var8 = var9;
            }
         }

         long var10 = car.X(var5, var6, var8, var7);
         if (this.e) {
            var3 = car.X(qxb.m(bxq.d(var10), bxq.d(var3), bxq.b(var3)), qxb.m(bxq.b(var10), bxq.d(var3), bxq.b(var3)), qxb.m(bxq.c(var10), bxq.c(var3), bxq.a(var3)), qxb.m(bxq.a(var10), bxq.c(var3), bxq.a(var3)));
         } else {
            if (!bxt.c(this.a, Float.NaN)) {
               var5 = bxq.d(var10);
            } else {
               var5 = qxb.l(bxq.d(var3), bxq.b(var10));
            }

            if (!bxt.c(this.c, Float.NaN)) {
               var6 = bxq.b(var10);
            } else {
               var6 = qxb.k(bxq.b(var3), bxq.d(var10));
            }

            if (!bxt.c(this.b, Float.NaN)) {
               var7 = bxq.c(var10);
            } else {
               var7 = qxb.l(bxq.c(var3), bxq.a(var10));
            }

            if (!bxt.c(this.d, Float.NaN)) {
               var8 = bxq.a(var10);
            } else {
               var8 = qxb.k(bxq.a(var3), bxq.c(var10));
            }

            var3 = car.X(var5, var6, var7, var8);
         }

         var13 = var2.l(var3);
         return ja.g(var1, var13.a, var13.b, new aiz(var13, 1));
      default:
         var6 = var1.eJ(this.b) + var1.eJ(this.c);
         var5 = var1.eJ(this.a) + var1.eJ(this.d);
         var13 = var2.l(car.Z(var3, -var6, -var5));
         return ja.g(var1, car.W(var3, var13.a + var6), car.V(var3, var13.b + var5), new adb(this, var13, var1, 3));
      }
   }
}
