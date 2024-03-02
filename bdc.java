public final class bdc implements Comparable {
   public static final int a = 0;
   private static final float b;

   static {
      bdb.c(1.0F);
      bdb.c(-1.0F);
      b = Float.intBitsToFloat(1056964608);
   }

   public static final float a(short var0) {
      char var2 = (char)var0;
      int var6 = var0 >>> 10 & 31;
      int var3 = var2 & 1023;
      int var5 = var2 & '耀';
      int var7;
      if (var6 == 0) {
         if (var3 != 0) {
            float var1 = Float.intBitsToFloat(var3 + 1056964608) - b;
            if (var5 == 0) {
               return var1;
            }

            return -var1;
         }

         var6 = 0;
         var7 = 0;
      } else {
         var3 <<= 13;
         if (var6 == 31) {
            short var4 = 255;
            var6 = var4;
            var7 = var3;
            if (var3 != 0) {
               var7 = 4194304 | var3;
               var6 = var4;
            }
         } else {
            var6 += 112;
            var7 = var3;
         }
      }

      return Float.intBitsToFloat(var5 << 16 | var6 << 23 | var7);
   }

   public final boolean equals(Object var1) {
      throw null;
   }

   public final int hashCode() {
      throw null;
   }

   public final String toString() {
      throw null;
   }
}
