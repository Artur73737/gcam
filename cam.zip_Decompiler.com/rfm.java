public final class rfm {
   public static final riq a = new riq("NO_VALUE");

   public static final Object a(Object[] var0, long var1) {
      int var3 = var0.length;
      return var0[(int)var1 & var3 - 1];
   }

   public static final void b(Object[] var0, long var1, Object var3) {
      int var4 = var0.length;
      var0[(int)var1 & var4 - 1] = var3;
   }

   // $FF: synthetic method
   public static rfg c(int var0, int var1, int var2, int var3) {
      if ((var3 & 4) != 0) {
         var2 = 1;
      }

      if (var2 != 0) {
         if ((var3 & 2) != 0) {
            var1 = 0;
         }

         var0 &= var3 & 1 ^ 1;
         if (var0 <= 0 && var1 <= 0 && var2 != 1) {
            StringBuilder var4 = new StringBuilder();
            var4.append("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            var4.append("DROP_OLDEST");
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy DROP_OLDEST");
         } else {
            return new rfl(var0, var1 + var0, var2);
         }
      } else {
         throw null;
      }
   }
}
