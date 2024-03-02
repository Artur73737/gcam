public final class xt {
   public static final int a = 0;
   private static final float[] b;
   private static final float[] c;

   static {
      float[] var11 = new float[101];
      b = var11;
      float[] var12 = new float[101];
      c = var12;
      int var10 = 0;
      float var1 = 0.0F;

      label36:
      for(float var2 = 0.0F; var10 < 100; ++var10) {
         float var5 = (float)var10;
         float var0 = 1.0F;

         while(true) {
            float var4 = var5 / 100.0F;
            float var3 = (var0 - var1) / 2.0F + var1;
            float var8 = 1.0F - var3;
            float var6 = var3 * 3.0F * var8;
            float var9 = var3 * var3 * var3;
            float var7 = (var8 * 0.175F + var3 * 0.35000002F) * var6 + var9;
            if ((double)Math.abs(var7 - var4) < 1.0E-5D) {
               var11[var10] = var6 * (var8 * 0.5F + var3) + var9;
               var0 = 1.0F;

               while(true) {
                  var3 = (var0 - var2) / 2.0F + var2;
                  var6 = 1.0F - var3;
                  var5 = var3 * 3.0F * var6;
                  var8 = var3 * var3 * var3;
                  var7 = (var6 * 0.5F + var3) * var5 + var8;
                  if ((double)Math.abs(var7 - var4) < 1.0E-5D) {
                     var12[var10] = var5 * (var6 * 0.175F + var3 * 0.35000002F) + var8;
                     continue label36;
                  }

                  if (var7 > var4) {
                     var0 = var3;
                  } else {
                     var2 = var3;
                  }
               }
            }

            if (var7 > var4) {
               var0 = var3;
            } else {
               var1 = var3;
            }
         }
      }

      var12[100] = 1.0F;
      var11[100] = 1.0F;
   }

   public static final xs a(float var0) {
      int var5 = (int)(var0 * 100.0F);
      float var1;
      if (var5 < 100) {
         float var2 = (float)var5 / 100.0F;
         int var4 = var5 + 1;
         var1 = (float)var4 / 100.0F;
         float[] var6 = b;
         float var3 = var6[var5];
         var1 = (var6[var4] - var3) / (var1 - var2);
         var2 = var3 + (var0 - var2) * var1;
         var0 = var1;
         var1 = var2;
      } else {
         var0 = 0.0F;
         var1 = 1.0F;
      }

      return new xs(var1, var0);
   }
}
