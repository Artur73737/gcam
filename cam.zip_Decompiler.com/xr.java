public final class xr {
   public static final int[] a = new int[0];
   public static final long[] b = new long[0];
   public static final Object[] c = new Object[0];

   public static final int a(long[] var0, int var1, long var2) {
      var0.getClass();
      --var1;
      int var4 = 0;

      while(var4 <= var1) {
         int var5 = var4 + var1 >>> 1;
         long var6 = var0[var5];
         if (var6 < var2) {
            var4 = var5 + 1;
         } else {
            if (var6 <= var2) {
               return var5;
            }

            var1 = var5 - 1;
         }
      }

      return ~var4;
   }

   public static final int b(int var0) {
      for(int var1 = 4; var1 < 32; ++var1) {
         int var2 = (1 << var1) - 12;
         if (var0 <= var2) {
            return var2;
         }
      }

      return var0;
   }

   public static final int c(int var0) {
      return b(var0 * 4) / 4;
   }

   public static final int d(int var0) {
      return b(var0 * 8) / 8;
   }
}
