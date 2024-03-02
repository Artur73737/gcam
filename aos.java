import java.util.List;

public final class aos extends qwq implements qvy {
   final aor a;
   final aor b;
   final List c;
   final hqs d;

   public aos(aor var1, aor var2, List var3, hqs var4) {
      super(3);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2, Object var3) {
      qvx var10 = (qvx)var1;
      asm var11 = (asm)var2;
      int var7 = ((Number)var3).intValue();
      var10.getClass();
      int var23;
      if ((var7 & 14) == 0) {
         byte var6;
         if (!var11.D(var10)) {
            var6 = 2;
         } else {
            var6 = 4;
         }

         var23 = var7 | var6;
      } else {
         var23 = var7;
      }

      if ((var23 & 91) == 18 && var11.G()) {
         var11.q();
      } else {
         boolean var9 = c.E(this.a, this.b);
         byte var8 = 75;
         short var24;
         if (!var9) {
            var24 = 75;
         } else {
            var24 = 150;
         }

         if (!var9 || pwm.az(this.c).size() == 1) {
            var8 = 0;
         }

         aak var12 = sq.g(var24, var8, zo.b);
         us var13 = new us(this.a, this.d, 5);
         var11.u(1016418159);
         var11.u(-492369756);
         var2 = var11.f();
         var3 = asl.a;
         float var5 = 1.0F;
         var1 = var2;
         float var4;
         if (var2 == var3) {
            if (!var9) {
               var4 = 1.0F;
            } else {
               var4 = 0.0F;
            }

            var1 = yu.a(var4);
            var11.w(var1);
         }

         var11.n();
         yt var14 = (yt)var1;
         Boolean var17 = var9;
         atj.e(var17, new aou(var14, var9, var12, var13, (que)null), var11);
         zc var26 = var14.a;
         var11.n();
         aak var28 = sq.g(var24, var8, zo.a);
         var11.u(2003504988);
         var11.u(-492369756);
         var2 = var11.f();
         var1 = var2;
         if (var2 == asl.a) {
            if (!var9) {
               var4 = var5;
            } else {
               var4 = 0.8F;
            }

            var1 = yu.a(var4);
            var11.w(var1);
         }

         var11.n();
         var14 = (yt)var1;
         atj.e(var17, new aov(var14, var9, var28, (que)null), var11);
         zc var18 = var14.a;
         var11.n();
         bbb var20 = brm.b(bdn.c(bbb.d, ((Number)var18.a()).floatValue(), ((Number)var18.a()).floatValue(), ((Number)var26.a()).floatValue(), 0.0F, (bdr)null, false, 131064), new aiz(this.a, 19));
         var11.u(733328855);
         var7 = bar.a;
         bjt var19 = aig.d(baq.a, false, var11);
         var11.u(-1323940314);
         int var25 = lh.d(var11);
         ata var27 = var11.c();
         var7 = ble.a;
         qvi var15 = bld.a;
         qvy var22 = iz.h(var20);
         var11.J();
         var11.v();
         if (var11.F()) {
            var11.j(var15);
         } else {
            var11.x();
         }

         var11.getClass();
         avl.a(var11, var19, bld.d);
         avl.a(var11, var27, bld.c);
         qvx var21 = bld.e;
         if (var11.F() || !c.E(var11.f(), var25)) {
            Integer var16 = var25;
            var11.w(var16);
            var11.h(var16, var21);
         }

         var11.getClass();
         var22.a(aur.a(var11), var11, 0);
         var11.u(2058660585);
         var10.a(var11, var23 & 14);
         var11.n();
         var11.m();
         var11.n();
         var11.n();
      }

      return qsn.a;
   }
}
