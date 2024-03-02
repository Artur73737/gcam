public final class aig {
   private static final bjt a;
   private static final bjt b;

   static {
      int var0 = bar.a;
      a = a(baq.a, false);
      b = apb.b;
   }

   public static final bjt a(bar var0, boolean var1) {
      return new aif(var1, var0);
   }

   public static final void b(bbb var0, asm var1, int var2) {
      var1 = var1.b(-211209833);
      int var11;
      if ((var2 & 14) == 0) {
         byte var3;
         if (!var1.B(var0)) {
            var3 = 2;
         } else {
            var3 = 4;
         }

         var11 = var3 | var2;
      } else {
         var11 = var2;
      }

      if ((var11 & 11) == 2 && var1.G()) {
         var1.q();
      } else {
         bjt var9 = b;
         var1.u(544976794);
         var11 = lh.d(var1);
         bbb var8 = dq.l(var1, var0);
         asq var5 = (asq)var1;
         aue var7 = var5.L();
         int var4 = ble.a;
         qvi var6 = bld.a;
         var1.u(1405779621);
         var1.v();
         if (var5.p) {
            var1.j(new amc(var6, 1));
         } else {
            var1.x();
         }

         avl.a(var1, var9, bld.d);
         avl.a(var1, var7, bld.c);
         avl.a(var1, var8, bld.b);
         qvx var12 = bld.e;
         if (var5.p || !c.E(var5.O(), var11)) {
            Integer var13 = var11;
            var5.Y(var13);
            var1.h(var13, var12);
         }

         var1.m();
         var5.S();
         var5.S();
      }

      aug var10 = var1.H();
      if (var10 != null) {
         var10.c = new ajh(var0, var2, 1);
      }
   }

   // $FF: synthetic method
   public static final void c(bjs var0) {
      if (f(var0) != null) {
         throw null;
      }
   }

   public static final bjt d(bar var0, boolean var1, asm var2) {
      var2.u(56522820);
      bjt var7;
      if (c.E(var0, baq.a) && !var1) {
         var7 = a;
      } else {
         var2.u(511388516);
         boolean var4 = var2.B(var0);
         boolean var3 = var2.B(var1);
         Object var5 = var2.f();
         Object var6;
         if (!(var3 | var4) && var5 != asl.a) {
            var6 = var5;
         } else {
            var6 = a(var0, var1);
            var2.w(var6);
         }

         var2.n();
         var7 = (bjt)var6;
      }

      var2.n();
      return var7;
   }

   public static final void e(bke var0, bjs var1, bxy var2, int var3, int var4, bar var5) {
      if (f(var1) == null) {
         bkd.c(var0, var5.a(car.I(var0.a, var0.b), car.I(var3, var4), var2));
      } else {
         throw null;
      }
   }

   private static final aic f(bjs var0) {
      Object var1 = var0.c();
      return var1 instanceof aic ? (aic)var1 : null;
   }
}
