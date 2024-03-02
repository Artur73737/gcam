public final class arm {
   public static final aqf a = new aqf(0.16F, 0.12F, 0.08F, 0.12F);

   public static final void a(aqz var0, arq var1, aru var2, qvx var3, asm var4, int var5) {
      asm var12 = var4.b(-2127166334);
      byte var6;
      int var7;
      if ((var5 & 14) == 0) {
         if (!var12.B(var0)) {
            var6 = 2;
         } else {
            var6 = 4;
         }

         var7 = var6 | var5;
      } else {
         var7 = var5;
      }

      int var21 = var7;
      if ((var5 & 112) == 0) {
         if (!var12.B(var1)) {
            var6 = 16;
         } else {
            var6 = 32;
         }

         var21 = var7 | var6;
      }

      var7 = var21;
      if ((var5 & 896) == 0) {
         short var23;
         if (!var12.B(var2)) {
            var23 = 128;
         } else {
            var23 = 256;
         }

         var7 = var21 | var23;
      }

      if ((var5 & 7168) == 0) {
         short var24;
         if (!var12.D(var3)) {
            var24 = 1024;
         } else {
            var24 = 2048;
         }

         var7 |= var24;
      }

      if ((var7 & 5851) == 1170 && var12.G()) {
         var12.q();
      } else {
         var12.r();
         if ((var5 & 1) != 0 && !var12.E()) {
            var12.q();
         }

         var12.l();
         var12.u(-492369756);
         asq var13 = (asq)var12;
         Object var11 = var13.O();
         Object var18 = var11;
         if (var11 == asl.a) {
            var18 = new aqz(var0.t(), var0.j(), var0.u(), var0.k(), var0.e(), var0.w(), var0.l(), var0.x(), var0.m(), var0.I(), var0.p(), var0.J(), var0.q(), var0.a(), var0.g(), var0.y(), var0.n(), var0.H(), var0.o(), var0.G(), var0.f(), var0.d(), var0.b(), var0.h(), var0.c(), var0.i(), var0.r(), var0.s(), var0.v(), var0.z(), var0.F(), var0.A(), var0.B(), var0.C(), var0.D(), var0.E());
            var13.Y(var18);
         }

         aci var14;
         aqz var15;
         label60: {
            var13.S();
            var15 = (aqz)var18;
            var15.getClass();
            var0.getClass();
            long var8 = var0.t();
            var15.a.b(bcy.f(var8));
            var8 = var0.j();
            var15.b.b(bcy.f(var8));
            var8 = var0.u();
            var15.c.b(bcy.f(var8));
            var8 = var0.k();
            var15.d.b(bcy.f(var8));
            var8 = var0.e();
            var15.e.b(bcy.f(var8));
            var8 = var0.w();
            var15.f.b(bcy.f(var8));
            var8 = var0.l();
            var15.g.b(bcy.f(var8));
            var8 = var0.x();
            var15.h.b(bcy.f(var8));
            var8 = var0.m();
            var15.i.b(bcy.f(var8));
            var8 = var0.I();
            var15.j.b(bcy.f(var8));
            var8 = var0.p();
            var15.k.b(bcy.f(var8));
            var8 = var0.J();
            var15.l.b(bcy.f(var8));
            var8 = var0.q();
            var15.m.b(bcy.f(var8));
            var8 = var0.a();
            var15.n.b(bcy.f(var8));
            var8 = var0.g();
            var15.o.b(bcy.f(var8));
            var8 = var0.y();
            var15.p.b(bcy.f(var8));
            var8 = var0.n();
            var15.q.b(bcy.f(var8));
            var8 = var0.H();
            var15.r.b(bcy.f(var8));
            var8 = var0.o();
            var15.s.b(bcy.f(var8));
            var8 = var0.G();
            var15.t.b(bcy.f(var8));
            var8 = var0.f();
            var15.u.b(bcy.f(var8));
            var8 = var0.d();
            var15.v.b(bcy.f(var8));
            var8 = var0.b();
            var15.w.b(bcy.f(var8));
            var8 = var0.h();
            var15.x.b(bcy.f(var8));
            var8 = var0.c();
            var15.y.b(bcy.f(var8));
            var8 = var0.i();
            var15.z.b(bcy.f(var8));
            var8 = var0.r();
            var15.A.b(bcy.f(var8));
            var8 = var0.s();
            var15.B.b(bcy.f(var8));
            var8 = var0.v();
            var15.C.b(bcy.f(var8));
            var8 = var0.z();
            var15.D.b(bcy.f(var8));
            var8 = var0.F();
            var15.E.b(bcy.f(var8));
            var8 = var0.A();
            var15.F.b(bcy.f(var8));
            var8 = var0.B();
            var15.G.b(bcy.f(var8));
            var8 = var0.C();
            var15.H.b(bcy.f(var8));
            var8 = var0.D();
            var15.I.b(bcy.f(var8));
            var8 = var0.E();
            var15.J.b(bcy.f(var8));
            var14 = aqr.a(0.0F, var12, 7);
            var15.getClass();
            var12.u(1866455512);
            var8 = var15.t();
            bcy var19 = bcy.f(var8);
            var12.u(1157296644);
            boolean var10 = var12.B(var19);
            var11 = var13.O();
            if (!var10) {
               var18 = var11;
               if (var11 != asl.a) {
                  break label60;
               }
            }

            var18 = new anc(var8, bcy.i(var8, 0.4F));
            var13.Y(var18);
         }

         var13.S();
         anc var16 = (anc)var18;
         var13.S();
         ouk var20 = arb.a.b(var15);
         ouk var27 = acl.a.b(var14);
         ouk var26 = aqt.a.b(ark.a);
         ouk var25 = arr.a.b(var1);
         ouk var17 = and.a.b(var16);
         ouk var28 = arv.a.b(var2);
         ayt var29 = sr.t(var12, -1066563262, new aai(var2, var3, var7, 14, (byte[])null));
         li.g(new ouk[]{var20, var27, var26, var25, var17, var28}, var29, var12, 56);
      }

      aug var22 = var12.H();
      if (var22 != null) {
         var22.c = new arl(var0, var1, var2, var3, var5, 0);
      }
   }
}
