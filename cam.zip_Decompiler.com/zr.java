public final class zr implements zq {
   private final float a;
   private final float b;
   private final float c;
   private final zw d;

   public zr() {
      this(0.0F, 0.0F);
   }

   // $FF: synthetic method
   public zr(float var1, float var2) {
      this(var1, var2, 0.01F);
   }

   public zr(float var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      zw var4 = new zw();
      if (!(var1 < 0.0F)) {
         var4.d = var1;
         var4.c = false;
         if (!(var4.a() <= 0.0F)) {
            var4.b = Math.sqrt((double)var2);
            var4.c = false;
            this.d = var4;
         } else {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
         }
      } else {
         throw new IllegalArgumentException("Damping ratio must be non-negative");
      }
   }

   public final float b(float var1, float var2, float var3) {
      return 0.0F;
   }

   public final float c(long var1, float var3, float var4, float var5) {
      zw var6 = this.d;
      var6.a = var4;
      return Float.intBitsToFloat((int)(var6.b(var3, var5, var1 / 1000000L) >> 32));
   }

   public final float d(long var1, float var3, float var4, float var5) {
      zw var6 = this.d;
      var6.a = var4;
      return Float.intBitsToFloat((int)(var6.b(var3, var5, var1 / 1000000L) & 4294967295L));
   }

   public final long e(float var1, float var2, float var3) {
      zw var32 = this.d;
      float var26 = var32.a();
      float var27 = var32.d;
      float var28 = this.c;
      var1 = (var1 - var2) / var28;
      var2 = var3 / var28;
      double var6 = (double)var26;
      double var10 = (double)var27;
      Double.isNaN(var10);
      Double.isNaN(var10);
      double var4 = (var10 + var10) * Math.sqrt(var6);
      Double.isNaN(var6);
      var6 = var4 * var4 - var6 * 4.0D;
      zj var34 = dp.e(var6);
      double var8 = var34.a;
      var4 = -var4;
      var34.a = (var8 + var4) * 0.5D;
      var34.b *= 0.5D;
      zj var33 = dp.e(var6);
      var6 = -var33.a;
      var8 = -var33.b;
      var33.a = (var6 + var4) * 0.5D;
      var33.b = var8 * 0.5D;
      var6 = (double)var1;
      var4 = (double)var2;
      long var30;
      if (var6 == 0.0D && var4 == 0.0D) {
         var30 = 0L;
      } else {
         if (var6 < 0.0D) {
            Double.isNaN(var4);
            var4 = -var4;
         }

         double var14 = Math.abs(var6);
         var6 = Double.MAX_VALUE;
         var8 = -1.0D;
         double var12;
         double var16;
         double var18;
         double var20;
         double var22;
         int var29;
         if (var10 > 1.0D) {
            var18 = var34.a;
            var16 = var33.a;
            var22 = var18 - var16;
            var20 = (var18 * var14 - var4) / var22;
            var14 -= var20;
            var12 = Math.log(Math.abs(1.0D / var14)) / var18;
            var10 = Math.log(Math.abs(1.0D / var20)) / var16;
            if (!Double.isInfinite(var12) && !Double.isNaN(var12)) {
               var4 = var12;
               if (!Double.isInfinite(var10)) {
                  var4 = var12;
                  if (!Double.isNaN(var10)) {
                     var4 = Math.max(var12, var10);
                  }
               }
            } else {
               var4 = var10;
            }

            var12 = var14 * var18;
            var10 = Math.log(var12 / (-var20 * var16)) / (var16 - var18);
            if (!Double.isNaN(var10) && !(var10 <= 0.0D)) {
               if (var10 > 0.0D && -(Math.exp(var18 * var10) * var14 + Math.exp(var10 * var16) * var20) < 1.0D) {
                  if (var20 > 0.0D && var14 < 0.0D) {
                     var4 = 0.0D;
                  }
               } else {
                  var4 = Math.log(-(var20 * var16 * var16) / (var12 * var18)) / var22;
                  var8 = 1.0D;
               }
            }

            var10 = Math.exp(var18 * var4);
            var22 = var20 * var16;
            if (!(Math.abs(var10 * var12 + Math.exp(var16 * var4) * var22) < 1.0E-4D)) {
               for(var29 = 0; var6 > 0.001D && var29 < 100; var6 = var10) {
                  var10 = var18 * var4;
                  var6 = Math.exp(var10);
                  double var24 = var16 * var4;
                  var6 = var4 - (var6 * var14 + Math.exp(var24) * var20 + var8) / (Math.exp(var10) * var12 + Math.exp(var24) * var22);
                  var10 = Math.abs(var4 - var6);
                  ++var29;
                  var4 = var6;
               }
            }
         } else if (var10 < 1.0D) {
            var6 = var34.a;
            var4 = (var4 - var6 * var14) / var34.b;
            var4 = Math.log(1.0D / Math.sqrt(var14 * var14 + var4 * var4)) / var6;
         } else {
            var18 = var34.a;
            var16 = var18 * var14;
            var20 = var4 - var16;
            var10 = Math.log(Math.abs(1.0D / var14)) / var18;
            var12 = Math.log(Math.abs(1.0D / var20));
            var4 = var12;

            for(var29 = 0; var29 < 6; ++var29) {
               var4 = var12 - Math.log(Math.abs(var4 / var18));
            }

            var4 /= var18;
            if (!Double.isInfinite(var10) && !Double.isNaN(var10)) {
               if (!Double.isInfinite(var4) && !Double.isNaN(var4)) {
                  var4 = Math.max(var10, var4);
               } else {
                  var4 = var10;
               }
            }

            var12 = -(var16 + var20) / (var18 * var20);
            var22 = var18 * var12;
            var10 = Math.exp(var22);
            var22 = Math.exp(var22);
            if (!Double.isNaN(var12) && !(var12 <= 0.0D)) {
               if (var12 > 0.0D && -(var10 * var14 + var20 * var12 * var22) < 1.0D) {
                  if (var20 < 0.0D && var14 > 0.0D) {
                     var4 = 0.0D;
                  }
               } else {
                  var4 = -(2.0D / var18) - var14 / var20;
                  var8 = 1.0D;
               }
            }

            var29 = 0;
            var10 = var6;
            var6 = var4;

            while(true) {
               var4 = var6;
               if (!(var10 > 0.001D)) {
                  break;
               }

               var4 = var6;
               if (var29 >= 100) {
                  break;
               }

               var4 = var18 * var6;
               var4 = var6 - ((var20 * var6 + var14) * Math.exp(var4) + var8) / (((var4 + 1.0D) * var20 + var16) * Math.exp(var4));
               var10 = Math.abs(var6 - var4);
               ++var29;
               var6 = var4;
            }
         }

         var30 = (long)(var4 * 1000.0D);
      }

      return var30 * 1000000L;
   }

   // $FF: synthetic method
   public final aaq f() {
      return dq.h(this);
   }
}
