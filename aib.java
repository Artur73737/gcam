public final class aib {
   public static final ahv a = new ahy();
   public static final aia b = new ahz();
   public static final ahw c = new ahu();

   public static final void a(int var0, int[] var1, int[] var2, boolean var3) {
      byte var8 = 0;
      int var5 = 0;
      int var6 = 0;

      while(true) {
         int var7 = var1.length;
         if (var5 >= var7) {
            float var4 = (float)(var0 - var6) / 2.0F;
            if (!var3) {
               var0 = 0;

               for(var5 = var8; var5 < var7; ++var0) {
                  var6 = var1[var5];
                  var2[var0] = qxg.e(var4);
                  var4 += (float)var6;
                  ++var5;
               }
            } else {
               var0 = var7;

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     break;
                  }

                  var5 = var1[var0];
                  var2[var0] = qxg.e(var4);
                  var4 += (float)var5;
               }
            }

            return;
         }

         var6 += var1[var5];
         ++var5;
      }
   }

   public static final void b(int[] var0, int[] var1) {
      int var3 = 0;
      int var4 = 0;

      for(int var2 = 0; var3 < var0.length; ++var2) {
         int var5 = var0[var3];
         var1[var2] = var4;
         var4 += var5;
         ++var3;
      }

   }
}
