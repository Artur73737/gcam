import java.util.List;

public final class air implements bjt {
   final qwa a;
   final float b;
   final ail c;
   final int d;

   public air(int var1, qwa var2, float var3, ail var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   public final bju a(bjw var1, List var2, long var3) {
      bke[] var16 = new bke[var2.size()];
      ais var23 = new ais(this.d, this.a, this.b, this.c, var2, var16);
      int var14 = var2.size();
      int var10 = var23.g;
      int var7;
      if (var10 == 1) {
         var7 = bxq.d(var3);
      } else {
         var7 = bxq.c(var3);
      }

      int var8;
      if (var10 == 1) {
         var8 = bxq.b(var3);
      } else {
         var8 = bxq.a(var3);
      }

      int var9;
      if (var10 == 1) {
         var9 = bxq.c(var3);
      } else {
         var9 = bxq.d(var3);
      }

      if (var10 == 1) {
         var10 = bxq.a(var3);
      } else {
         var10 = bxq.b(var3);
      }

      var3 = car.X(var7, var8, var9, var10);
      int var12 = var1.eJ(var23.b);
      var10 = 0;
      var9 = 0;
      float var5 = 0.0F;
      var8 = 0;
      int var11 = 0;

      float var6;
      int var13;
      bke var19;
      for(var7 = 0; var10 < var14; ++var10) {
         bjs var17 = (bjs)var23.d.get(var10);
         var6 = gg.d(var23.f[var10]);
         if (var6 > 0.0F) {
            var5 += var6;
            ++var9;
         } else {
            var13 = bxq.b(var3);
            var19 = var23.e[var10];
            if (var19 == null) {
               if (var13 == Integer.MAX_VALUE) {
                  var11 = Integer.MAX_VALUE;
               } else {
                  var11 = var13 - var8;
               }

               var19 = var17.l(aio.a(car.X(0, var11, 0, bxq.a(var3)), var23.g));
            }

            var11 = Math.min(var12, var13 - var8 - var23.b(var19));
            var8 += var23.b(var19) + var11;
            var7 = Math.max(var7, var23.a(var19));
            var23.e[var10] = var19;
         }
      }

      if (var9 == 0) {
         var9 = var8 - var11;
         var8 = 0;
      } else {
         if (var5 > 0.0F && bxq.b(var3) != Integer.MAX_VALUE) {
            var10 = bxq.b(var3);
         } else {
            var10 = bxq.d(var3);
         }

         int var15 = var12 * (var9 - 1);
         var10 = var10 - var8 - var15;
         if (var5 > 0.0F) {
            var5 = (float)var10 / var5;
         } else {
            var5 = 0.0F;
         }

         qtj var20 = qxb.p(0, var14).a();

         for(var9 = 0; var20.a; var9 += qxg.e(gg.d(var23.f[var11]) * var5)) {
            var11 = var20.a();
         }

         var11 = var10 - var9;
         var10 = 0;

         for(var9 = 0; var9 < var14; ++var9) {
            if (var23.e[var9] == null) {
               bjs var21 = (bjs)var23.d.get(var9);
               ait var24 = var23.f[var9];
               var6 = gg.d(var24);
               if (!(var6 > 0.0F)) {
                  throw new IllegalStateException("All weights <= 0 should have placeables");
               }

               var13 = qxg.d(var11);
               var12 = var11 - var13;
               var13 = Math.max(0, qxg.e(var6 * var5) + var13);
               if ((var24 == null || var24.b) && var13 != Integer.MAX_VALUE) {
                  var11 = var13;
               } else {
                  var11 = 0;
               }

               var19 = var21.l(aio.a(car.X(var11, var13, 0, bxq.a(var3)), var23.g));
               var10 += var23.b(var19);
               var7 = Math.max(var7, var23.a(var19));
               var23.e[var9] = var19;
               var11 = var12;
            }
         }

         var10 = qxb.l(var10 + var15, bxq.b(var3) - var8);
         var9 = var8;
         var8 = var10;
      }

      var8 = Math.max(var9 + var8, bxq.d(var3));
      var9 = Math.max(var7, Math.max(bxq.c(var3), 0));
      int[] var25 = new int[var14];

      for(var7 = 0; var7 < var14; ++var7) {
         var25[var7] = 0;
      }

      int[] var18 = new int[var14];

      for(var7 = 0; var7 < var14; ++var7) {
         var19 = var23.e[var7];
         var19.getClass();
         var18[var7] = var23.b(var19);
      }

      var23.a.a(var8, var18, var1.j(), var1, var25);
      ora var22 = new ora(var9, var8, var14, var25);
      if (this.d == 1) {
         var8 = var22.a;
         var7 = var22.b;
      } else {
         var8 = var22.b;
         var7 = var22.a;
      }

      return ja.g(var1, var8, var7, new adb(var23, var22, var1, 5));
   }
}
