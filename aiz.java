import java.util.List;
import java.util.Map;

public final class aiz extends qwq implements qvt {
   final Object a;
   private final int b;

   public aiz(Object var1, int var2) {
      super(1);
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object eo(Object var1) {
      int var5 = this.b;
      byte var6 = -1;
      Boolean var13 = true;
      Boolean var14 = false;
      boolean var8;
      long var9;
      bhw var19;
      amg var23;
      bsq var24;
      Object var35;
      Object var38;
      List var39;
      bry var45;
      bss var53;
      switch(var5) {
      case 0:
         ((bkd)var1).getClass();
         bkd.e((bke)this.a, 0, 0);
         return qsn.a;
      case 1:
         ((bkd)var1).getClass();
         bkd.e((bke)this.a, 0, 0);
         return qsn.a;
      case 2:
         float var2 = -((Number)var1).floatValue();
         var1 = this.a;
         if (var2 < 0.0F && !((ajz)var1).c()) {
            var2 = 0.0F;
         } else if (var2 > 0.0F && !((ajz)var1).b()) {
            var2 = 0.0F;
         } else {
            ajz var54 = (ajz)var1;
            if (!(Math.abs(var54.e) <= 0.5F)) {
               StringBuilder var32 = new StringBuilder();
               var32.append("entered drag with non-zero pending scroll: ");
               var32.append(var54.e);
               throw new IllegalStateException(var32.toString());
            }

            float var3 = var54.e + var2;
            var54.e = var3;
            if (Math.abs(var3) > 0.5F) {
               float var4 = var54.e;
               bkg var28 = var54.m;
               if (var28 != null) {
                  var28.e();
               }

               if (var54.i) {
                  var3 = var54.e;
                  ajn var29 = var54.g();
                  if (!var29.b().isEmpty()) {
                     if (var4 - var3 < 0.0F) {
                        var8 = true;
                     } else {
                        var8 = false;
                     }

                     if (var8) {
                        var5 = ((ajq)pwm.ax(var29.b())).a + 1;
                     } else {
                        var5 = -1 + ((ajq)pwm.au(var29.b())).a;
                     }

                     if (var5 != var54.j && var5 >= 0 && var5 < var29.a()) {
                        if (var54.l != var8) {
                           akv var30 = var54.k;
                           if (var30 != null) {
                              var30.a();
                           }
                        }

                        var54.l = var8;
                        var54.j = var5;
                        pde var31 = var54.x;
                        var9 = var54.p;
                        Object var59 = var31.a;
                        if (var59 != null) {
                           var1 = new akw(var5, var9);
                           akx var55 = (akx)var59;
                           var55.c.p(var1);
                           if (!var55.d) {
                              var55.d = true;
                              var55.b.post((Runnable)var59);
                           }
                        } else {
                           var1 = akd.a;
                        }

                        var54.k = (akv)var1;
                     }
                  }
               }
            }

            if (!(Math.abs(var54.e) <= 0.5F)) {
               var2 -= var54.e;
               var54.e = 0.0F;
            }
         }

         return -var2;
      case 3:
         ((nd)var1).getClass();
         return new akj(this.a, 0);
      case 4:
         ((nd)var1).getClass();
         return new akj(this.a, 2);
      case 5:
         var1.getClass();
         aji var50 = (aji)((qvi)this.a).a();
         int var7 = var50.b();
         var5 = 0;

         while(true) {
            if (var5 >= var7) {
               var5 = var6;
               break;
            }

            if (c.E(var50.c(var5), var1)) {
               break;
            }

            ++var5;
         }

         return var5;
      case 6:
         var1.getClass();
         var35 = this.a;
         if (var35 != null) {
            var8 = ((azc)var35).f(var1);
         } else {
            var8 = true;
         }

         return var8;
      case 7:
         Map var27 = (Map)var1;
         var27.getClass();
         return new ald((azc)this.a, var27);
      case 8:
         var39 = (List)var1;
         var39.getClass();
         var24 = ((amn)this.a).d().i;
         if (var24 != null) {
            var45 = var24.a.a;
            amn var46 = (amn)this.a;
            var53 = var46.b;
            qnd var48 = var46.f;
            if (var48 != null) {
               var9 = var48.a;
            } else {
               var9 = bcy.f;
            }

            bss var52 = bss.u(var53, var9, 0L, (bvc)null, 0L, 0L, 16777214);
            bsp var58 = var24.a;
            var24 = var24.f(new bsp(var45, var52, var58.c, var58.d, var58.e, var58.f, var58.g, var58.h, var58.j, var58.i), var24.c);
            var39.add(var24);
         } else {
            var24 = null;
         }

         if (var24 != null) {
            var8 = true;
         } else {
            var8 = false;
         }

         return var8;
      case 9:
         var45 = (bry)var1;
         var45.getClass();
         amn var26 = (amn)this.a;
         amm var56 = var26.f();
         if (var56 != null) {
            if (!c.E(var45, var56.b)) {
               var56.b = var45;
               amf var57 = var56.d;
               if (var57 != null) {
                  var57.d(var45, var26.b, var26.g, var26.c, var26.d, var26.e);
               }
            }
         } else {
            var56 = new amm(var26.a, var45);
            amf var49 = new amf(var45, var26.b, var26.g, var26.c, var26.d, var26.e);
            var49.c(var26.d().f);
            var56.d = var49;
            var26.i(var56);
         }

         return var13;
      case 10:
         var8 = (Boolean)var1;
         if (((amn)this.a).f() == null) {
            var13 = var14;
         } else {
            amm var25 = ((amn)this.a).f();
            if (var25 != null) {
               var25.c = var8;
            }

            kd.f((bnj)this.a);
            jk.h((blv)this.a);
            jk.k((bll)this.a);
         }

         return var13;
      case 11:
         ((bkd)var1).getClass();
         bkd.b((bke)this.a, 0, 0);
         return qsn.a;
      case 12:
         var39 = (List)var1;
         var39.getClass();
         var23 = ((amq)this.a).d();
         amq var47 = (amq)this.a;
         bss var42 = var47.b;
         qnd var51 = var47.h;
         if (var51 != null) {
            var9 = var51.a;
         } else {
            var9 = bcy.f;
         }

         var53 = bss.u(var42, var9, 0L, (bvc)null, 0L, 0L, 16777214);
         bxy var16 = var23.j;
         if (var16 == null) {
            var24 = null;
         } else {
            bxr var17 = var23.f;
            if (var17 == null) {
               var24 = null;
            } else {
               var45 = new bry(var23.a);
               if (var23.l != null && var23.i != null) {
                  var9 = bxq.k(var23.k, 0, 0, 0, 0, 10);
                  var24 = new bsq(new bsp(var45, var53, qtf.a, var23.e, var23.d, var23.c, var17, var16, var23.m, var9), new bsc(new bsd(var45, var53, qtf.a, var17, var23.m), var9, var23.e, c.n(var23.c, 2)), var23.h);
               } else {
                  var24 = null;
               }
            }
         }

         if (var24 != null) {
            var39.add(var24);
         } else {
            var24 = null;
         }

         if (var24 != null) {
            var8 = true;
         } else {
            var8 = false;
         }

         return var8;
      case 13:
         bry var21 = (bry)var1;
         var21.getClass();
         var38 = this.a;
         String var22 = var21.a;
         amq var40 = (amq)var38;
         amo var43 = var40.f();
         if (var43 != null) {
            if (!c.E(var22, var43.b)) {
               var43.b = var22;
               amg var44 = var43.d;
               if (var44 != null) {
                  var44.b(var22, var40.b, var40.i, var40.c, var40.d, var40.e);
               }
            }
         } else {
            var43 = new amo(var40.a, var22);
            var23 = new amg(var22, var40.b, var40.i, var40.c, var40.d, var40.e);
            var23.a(var40.d().f);
            var43.d = var23;
            var40.h(var43);
         }

         return var13;
      case 14:
         var8 = (Boolean)var1;
         if (((amq)this.a).f() == null) {
            var13 = var14;
         } else {
            amo var20 = ((amq)this.a).f();
            if (var20 != null) {
               var20.c = var8;
            }

            kd.f((bnj)this.a);
            jk.h((blv)this.a);
            jk.k((bll)this.a);
         }

         return var13;
      case 15:
         ((bkd)var1).getClass();
         bkd.b((bke)this.a, 0, 0);
         return qsn.a;
      case 16:
         var19 = (bhw)var1;
         var19.getClass();
         amk var41 = (amk)this.a;
         var38 = var41.a.a();
         if (var38 != null) {
            ana var37 = var41.b;
            var9 = var41.c;
            if (!((bjf)var38).k() || !anb.a(var37, var9)) {
               return qsn.a;
            }

            var37.d();
         }

         var19.b();
         return qsn.a;
      case 17:
         var19 = (bhw)var1;
         var19.getClass();
         var35 = this.a;
         var9 = iy.j(var19);
         amj var36 = (amj)var35;
         var35 = var36.c.a();
         if (var35 != null) {
            ana var15 = var36.d;
            long var11 = var36.e;
            if (((bjf)var35).k() && anb.a(var15, var11)) {
               var9 = bci.f(var36.b, var9);
               var36.b = var9;
               var9 = bci.f(var36.a, var9);
               var5 = amu.a;
               if (var15.d()) {
                  var36.a = var9;
                  var36.b = bci.a;
               }
            }
         }

         var19.b();
         return qsn.a;
      case 18:
         ((Number)var1).floatValue();
         throw null;
      case 19:
         brl var34 = (brl)var1;
         var34.getClass();
         brp.j.a(var34, brr.a[3], new brg());
         amp var18 = new amp(this.a, 5);
         var34.c(brk.r, new brc(var18));
         return qsn.a;
      default:
         anz var33 = (anz)var1;
         var33.getClass();
         return c.E(var33.a, this.a);
      }
   }
}
