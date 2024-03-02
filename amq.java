import java.util.LinkedHashMap;
import java.util.Map;

public final class amq extends bba implements blv, bll, bnj {
   public String a;
   public bss b;
   public int c;
   public boolean d;
   public int e;
   public int f;
   public qvt g;
   public qnd h;
   public fwf i;
   private Map j;
   private amg k;
   private final att l;

   public amq(String var1, bss var2, fwf var3, int var4, boolean var5, int var6, qnd var7) {
      this.a = var1;
      this.b = var2;
      this.i = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      this.f = 1;
      this.h = var7;
      this.l = sg.d((Object)null);
   }

   public final bju a(bjw var1, bjs var2, long var3) {
      amg var20;
      label94: {
         amo var12 = this.f();
         if (var12 != null && var12.c) {
            var20 = var12.d;
            if (var20 != null) {
               var20.a(var1);
               break label94;
            }
         }

         var20 = this.d();
         var20.a(var1);
      }

      boolean var6;
      int var7;
      bsg var13;
      int var19;
      label102: {
         bxy var14 = var1.j();
         var14.getClass();
         brw var15 = var20.l;
         var6 = true;
         boolean var9 = true;
         boolean var8 = false;
         float var5;
         brw var25;
         if (var15 != null) {
            var13 = var20.i;
            if (var13 != null && !var13.c() && var14 == var20.j && (c.o(var3, var20.k) || bxq.b(var3) == bxq.b(var20.k) && !((float)bxq.a(var3) < var15.b()) && !var15.h())) {
               if (!c.o(var3, var20.k)) {
                  label72: {
                     label71: {
                        var25 = var20.l;
                        var25.getClass();
                        var3 = car.Y(var3, car.I(jl.j(var25.e()), jl.j(var25.b())));
                        var20.h = var3;
                        if (!c.n(var20.c, 3)) {
                           var19 = bxx.b(var3);
                           var5 = var25.e();
                           if ((float)var19 < var5) {
                              break label71;
                           }

                           var19 = bxx.a(var3);
                           var5 = var25.b();
                           if ((float)var19 < var5) {
                              break label71;
                           }
                        }

                        var8 = false;
                        break label72;
                     }

                     var8 = var9;
                  }

                  var20.g = var8;
               }

               var6 = false;
               break label102;
            }
         }

         var13 = var20.i;
         if (var13 == null || var14 != var20.j || var13.c()) {
            var20.j = var14;
            String var22 = var20.a;
            bss var23 = lb.e(var20.b, var14);
            bxr var28 = var20.f;
            var28.getClass();
            fwf var16 = var20.m;
            qtf var17 = qtf.a;
            var13 = la.m(var22, var23, var17, var17, var28, var16);
         }

         var20.i = var13;
         long var10 = jl.i(var3, var20.d, var20.c, var13.a());
         var9 = var20.d;
         var7 = var20.c;
         var25 = bte.e(var13, jl.h(var9, var7, var20.e), c.n(var7, 2), var10);
         var20.k = var3;
         var3 = car.Y(var3, car.I(jl.j(var25.e()), jl.j(var25.b())));
         var20.h = var3;
         if (!c.n(var20.c, 3)) {
            var7 = bxx.b(var3);
            var5 = var25.e();
            if (!((float)var7 < var5)) {
               var7 = bxx.a(var3);
               var5 = var25.b();
               if ((float)var7 < var5) {
                  var8 = true;
               }
            } else {
               var8 = true;
            }
         }

         var20.g = var8;
         var20.l = var25;
      }

      var13 = var20.i;
      if (var13 != null) {
         var13.c();
      }

      brw var26 = var20.l;
      var26.getClass();
      var3 = var20.h;
      if (var6) {
         jk.g(this);
         Map var29 = this.j;
         Object var21 = var29;
         if (var29 == null) {
            var21 = new LinkedHashMap(2);
         }

         ((Map)var21).put(biu.a, qxg.e(var26.a()));
         ((Map)var21).put(biu.b, qxg.e(var26.c()));
         this.j = (Map)var21;
      }

      var19 = bxx.b(var3);
      var7 = bxx.a(var3);
      int[] var24 = bxq.a;
      bke var27 = var2.l(car.ac(var19, var7));
      var7 = bxx.b(var3);
      var19 = bxx.a(var3);
      Map var18 = this.j;
      var18.getClass();
      return var1.eL(var7, var19, var18, new aiz(var27, 15));
   }

   public final void c(brl var1) {
      var1.getClass();
      qvt var3 = this.g;
      Object var2 = var3;
      if (var3 == null) {
         var2 = new aiz(this, 12);
         this.g = (qvt)var2;
      }

      amo var4 = this.f();
      if (var4 == null) {
         brr.e(var1, new bry(this.a));
      } else {
         brr.d(var1, var4.c);
         if (var4.c) {
            brr.e(var1, new bry(var4.b));
            brr.b(var1, new bry(var4.a));
         } else {
            brr.e(var1, new bry(var4.a));
         }
      }

      brr.h(var1, new aiz(this, 13));
      brr.i(var1, new aiz(this, 14));
      brr.f(var1, new amp(this, 0));
      brr.g(var1, (qvt)var2);
   }

   public final amg d() {
      if (this.k == null) {
         this.k = new amg(this.a, this.b, this.i, this.c, this.d, this.e);
      }

      amg var1 = this.k;
      var1.getClass();
      return var1;
   }

   // $FF: synthetic method
   public final void es() {
   }

   // $FF: synthetic method
   public final boolean et() {
      return false;
   }

   public final void eu(bmf var1) {
      brw var11 = this.d().l;
      if (var11 == null) {
         throw new IllegalArgumentException("no paragraph");
      } else {
         bcw var10 = var1.m().b();
         boolean var6 = this.d().g;
         if (var6) {
            int var3 = bxx.b(this.d().h);
            int var2 = bxx.a(this.d().h);
            bcj var194 = es.h(bci.a, et.k((float)var3, (float)var2));
            var10.e();
            bcq.d(var10, var194);
         }

         label1563: {
            Throwable var10000;
            label1566: {
               bxd var7;
               boolean var10001;
               try {
                  var7 = this.b.o();
               } catch (Throwable var193) {
                  var10000 = var193;
                  var10001 = false;
                  break label1566;
               }

               bxd var195 = var7;
               if (var7 == null) {
                  try {
                     var195 = bxd.a;
                  } catch (Throwable var192) {
                     var10000 = var192;
                     var10001 = false;
                     break label1566;
                  }
               }

               bdq var8;
               try {
                  var8 = this.b.e();
               } catch (Throwable var191) {
                  var10000 = var191;
                  var10001 = false;
                  break label1566;
               }

               bdq var197 = var8;
               if (var8 == null) {
                  try {
                     var197 = bdq.a;
                  } catch (Throwable var190) {
                     var10000 = var190;
                     var10001 = false;
                     break label1566;
                  }
               }

               gf var9;
               try {
                  var9 = this.b.v();
               } catch (Throwable var189) {
                  var10000 = var189;
                  var10001 = false;
                  break label1566;
               }

               Object var198 = var9;
               if (var9 == null) {
                  try {
                     var198 = bex.a;
                  } catch (Throwable var188) {
                     var10000 = var188;
                     var10001 = false;
                     break label1566;
                  }
               }

               qnd var199;
               try {
                  var199 = this.h;
               } catch (Throwable var187) {
                  var10000 = var187;
                  var10001 = false;
                  break label1566;
               }

               long var4;
               if (var199 != null) {
                  try {
                     var4 = var199.a;
                  } catch (Throwable var186) {
                     var10000 = var186;
                     var10001 = false;
                     break label1566;
                  }
               } else {
                  try {
                     var4 = bcy.f;
                  } catch (Throwable var185) {
                     var10000 = var185;
                     var10001 = false;
                     break label1566;
                  }
               }

               label1567: {
                  try {
                     if (var4 != bcy.f) {
                        break label1567;
                     }
                  } catch (Throwable var184) {
                     var10000 = var184;
                     var10001 = false;
                     break label1566;
                  }

                  try {
                     if (this.b.b() != bcy.f) {
                        var4 = this.b.b();
                        break label1567;
                     }
                  } catch (Throwable var183) {
                     var10000 = var183;
                     var10001 = false;
                     break label1566;
                  }

                  try {
                     var4 = bcy.a;
                  } catch (Throwable var182) {
                     var10000 = var182;
                     var10001 = false;
                     break label1566;
                  }
               }

               label1509:
               try {
                  var11.j(var10, var4, var197, var195, (gf)var198);
                  break label1563;
               } catch (Throwable var181) {
                  var10000 = var181;
                  var10001 = false;
                  break label1509;
               }
            }

            Throwable var196 = var10000;
            if (var6) {
               var10.d();
            }

            throw var196;
         }

         if (var6) {
            var10.d();
         }

      }
   }

   public final amo f() {
      return (amo)this.l.a();
   }

   public final void g() {
      this.h((amo)null);
   }

   public final void h(amo var1) {
      this.l.b(var1);
   }
}
