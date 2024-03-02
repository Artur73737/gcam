public final class aiv {
   private static final bjt a;

   static {
      int var0 = bar.a;
      ail var1 = gf.k(baq.c);
      a = gg.e(1, aih.b, 0.0F, var1);
   }

   public static final bjt a(ahv var0, bat var1, asm var2) {
      bjt var9;
      label25: {
         var2.u(-837807694);
         if (c.E(var0, aib.a)) {
            int var4 = bar.a;
            if (c.E(var1, baq.c)) {
               var9 = a;
               break label25;
            }
         }

         var2.u(511388516);
         boolean var6 = var2.B(var0);
         boolean var5 = var2.B(var1);
         Object var7 = var2.f();
         Object var8;
         if (!(var6 | var5) && var7 != asl.a) {
            var8 = var7;
         } else {
            float var3 = var0.a();
            ail var10 = gf.k(var1);
            var8 = gg.e(1, new aiu(var0), var3, var10);
            var2.w(var8);
         }

         var2.n();
         var9 = (bjt)var8;
      }

      var2.n();
      return var9;
   }
}
