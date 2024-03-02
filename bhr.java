public final class bhr extends qwq implements qvy {
   final Object a;
   private final int b;

   public bhr(Object var1, int var2) {
      super(3);
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2, Object var3) {
      int var4;
      asm var12;
      switch(this.b) {
      case 0:
         bbb var8 = (bbb)var1;
         asm var7 = (asm)var2;
         ((Number)var3).intValue();
         var8.getClass();
         var7.u(811087536);
         cje var11 = (cje)var7.e(bpi.g);
         if (var11 == null) {
            var1 = bbb.d;
         } else {
            arh var13 = new arh(var11, 19);
            var3 = this.a;
            var7.u(-492369756);
            var1 = var7.f();
            if (var1 == asl.a) {
               var1 = new bht((bho)var3, var13);
               var7.w(var1);
            }

            var7.n();
            bht var15 = (bht)var1;
            var4 = 0;
            var1 = this.a;
            Object var9 = this.a;
            var7.u(-568225417);

            boolean var5;
            for(var5 = false; var4 < 4; ++var4) {
               var5 |= var7.B((new Object[]{var15, var1, false, var13})[var4]);
            }

            var1 = var7.f();
            if (var5 || var1 == asl.a) {
               var1 = new alq(var15, var9, var13, 3);
               var7.w(var1);
            }

            var7.n();
            atj.f((qvi)var1, var7);
            bht var18 = var15.b();
            if (var18 != null && var18.j()) {
               var1 = bbb.d;
            } else {
               label51: {
                  var7.u(1157296644);
                  boolean var6 = var7.B(var15);
                  var2 = var7.f();
                  if (!var6) {
                     var1 = var2;
                     if (var2 != asl.a) {
                        break label51;
                     }
                  }

                  var1 = new bhq(var15, (que)null);
                  var7.w(var1);
               }

               var7.n();
               var1 = big.a(var8, var15, (qvx)var1);
            }

            var1 = bax.a(var15, (bbb)var1);
         }

         var7.n();
         return var1;
      case 1:
         aiw var10 = (aiw)var1;
         var12 = (asm)var2;
         var4 = ((Number)var3).intValue();
         var10.getClass();
         if ((var4 & 81) == 16 && var12.G()) {
            var12.q();
         } else {
            apw.b((String)this.a, (bbb)null, 0L, 0L, 0L, 0L, 0, false, 0, 0, (qvt)null, (bss)null, var12, 0, 0, 131070);
         }

         return qsn.a;
      default:
         asm var20 = ((aur)var1).a;
         var12 = (asm)var2;
         ((Number)var3).intValue();
         var4 = lh.d(var12);
         bbb var14 = dq.l(var12, (bbb)this.a);
         var20.u(509942095);
         int var19 = ble.a;
         avl.a(var20, var14, bld.b);
         qvx var16 = bld.e;
         if (var20.F() || !c.E(var20.f(), var4)) {
            Integer var17 = var4;
            var20.w(var17);
            var20.h(var17, var16);
         }

         var20.n();
         return qsn.a;
      }
   }
}
