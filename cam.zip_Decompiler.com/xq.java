public final class xq {
   public static final Object a = new Object();

   public static final Object a(xp var0, int var1) {
      var1 = c.s(var0.b, var0.d, var1);
      if (var1 >= 0) {
         Object var2 = var0.c[var1];
         if (var2 != a) {
            return var2;
         }
      }

      return null;
   }

   public static final void b(xp var0) {
      int var4 = var0.d;
      int[] var5 = var0.b;
      Object[] var6 = var0.c;
      int var3 = 0;

      int var1;
      int var2;
      for(var1 = 0; var3 < var4; var1 = var2) {
         Object var7 = var6[var3];
         var2 = var1;
         if (var7 != a) {
            if (var3 != var1) {
               var5[var1] = var5[var3];
               var6[var1] = var7;
               var6[var3] = null;
            }

            var2 = var1 + 1;
         }

         ++var3;
      }

      var0.a = false;
      var0.d = var1;
   }
}
