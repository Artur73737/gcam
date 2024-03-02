public final class bzk {
   static final boolean[] a = new boolean[3];

   static void a(bzg var0, byv var1, bzf var2) {
      var2.q = -1;
      var2.r = -1;
      int var3;
      int var4;
      bze var5;
      if (var0.ar[0] != 2 && var2.ar[0] == 4) {
         var5 = var2.K;
         var3 = var5.g;
         var4 = var0.j() - var2.M.g;
         var5.i = var1.b(var5);
         var5 = var2.M;
         var5.i = var1.b(var5);
         var1.f(var2.K.i, var3);
         var1.f(var2.M.i, var4);
         var2.q = 2;
         var2.aa = var3;
         var3 = var4 - var3;
         var2.W = var3;
         var4 = var2.ad;
         if (var3 < var4) {
            var2.W = var4;
         }
      }

      if (var0.ar[1] != 2 && var2.ar[1] == 4) {
         var5 = var2.L;
         var4 = var5.g;
         var3 = var0.h() - var2.N.g;
         var5.i = var1.b(var5);
         bze var6 = var2.N;
         var6.i = var1.b(var6);
         var1.f(var2.L.i, var4);
         var1.f(var2.N.i, var3);
         if (var2.ac > 0 || var2.ai == 8) {
            var6 = var2.O;
            var6.i = var1.b(var6);
            var1.f(var2.O.i, var2.ac + var4);
         }

         var2.r = 2;
         var2.ab = var4;
         var3 -= var4;
         var2.X = var3;
         var4 = var2.ae;
         if (var3 < var4) {
            var2.X = var4;
         }
      }

   }

   public static final boolean b(int var0, int var1) {
      return (var0 & var1) == var1;
   }
}
