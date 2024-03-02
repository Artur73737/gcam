import java.util.Map;

public final class amn extends bba implements blv, bll, bnj {
   public bry a;
   public bss b;
   public int c;
   public boolean d;
   public int e;
   public qnd f;
   public fwf g;
   private qvt h;
   private int i;
   private ami j;
   private Map k;
   private amf l;
   private qvt m;
   private final att n;

   // $FF: synthetic method
   public amn(bry var1, bss var2, fwf var3, qvt var4, int var5, boolean var6, int var7, ami var8, qnd var9) {
      this.a = var1;
      this.b = var2;
      this.g = var3;
      this.h = var4;
      this.c = var5;
      this.d = var6;
      this.e = var7;
      this.i = 1;
      this.j = var8;
      this.f = var9;
      this.n = sg.d((Object)null);
   }

   private final amf w(bxr var1) {
      amm var2 = this.f();
      amf var3;
      if (var2 != null && var2.c) {
         var3 = var2.d;
         if (var3 != null) {
            var3.c(var1);
            return var3;
         }
      }

      var3 = this.d();
      var3.c(var1);
      return var3;
   }

   public final bju a(bjw var1, bjs var2, long var3) {
      int var6;
      bsq var11;
      amf var13;
      boolean var18;
      label53: {
         bxy var14;
         label56: {
            var13 = this.w(var1);
            var14 = var1.j();
            var14.getClass();
            var11 = var13.i;
            if (var11 != null && !var11.b.a.c()) {
               bsp var12 = var11.a;
               if (var14 == var12.h) {
                  if (c.o(var3, var12.i)) {
                     break label56;
                  }

                  if (bxq.b(var3) == bxq.b(var11.a.i)) {
                     float var5 = (float)bxq.a(var3);
                     bsc var19 = var11.b;
                     if (!(var5 < var19.d) && !var19.b) {
                        break label56;
                     }
                  }
               }
            }

            bsd var20;
            label40: {
               bsd var22 = var13.g;
               if (var22 != null && var14 == var13.h) {
                  var20 = var22;
                  if (!var22.c()) {
                     break label40;
                  }
               }

               var13.h = var14;
               bry var23 = var13.a;
               bss var15 = lb.e(var13.b, var14);
               bxr var21 = var13.f;
               var21.getClass();
               fwf var16 = var13.j;
               var20 = new bsd(var23, var15, qtf.a, var21, var16);
            }

            var13.g = var20;
            long var8 = jl.i(var3, var13.d, var13.c, var20.a());
            boolean var10 = var13.d;
            var6 = var13.c;
            var13.i = var13.b(var14, var3, new bsc(var20, var8, jl.h(var10, var6, var13.e), c.n(var6, 2)));
            var18 = true;
            break label53;
         }

         var11 = var13.i;
         var11.getClass();
         if (c.o(var3, var11.a.i)) {
            var18 = false;
         } else {
            var11.getClass();
            var13.i = var13.b(var14, var3, var11.b);
            var18 = true;
         }
      }

      var11 = var13.a();
      var11.b.a.c();
      if (var18) {
         jk.g(this);
         qvt var24 = this.h;
         if (var24 != null) {
            var24.eo(var11);
         }

         ami var25 = this.j;
         if (var25 != null) {
            var25.b = aml.a(var25.b, (bjf)null, var11, 1);
         }

         this.k = pwm.ad(pwm.bq(biu.a, qxg.e(var11.d)), pwm.bq(biu.b, qxg.e(var11.e)));
      }

      int[] var26 = bxq.a;
      var3 = var11.c;
      bke var17 = var2.l(car.ac(bxx.b(var3), bxx.a(var3)));
      var3 = var11.c;
      int var7 = bxx.b(var3);
      var6 = bxx.a(var3);
      Map var27 = this.k;
      var27.getClass();
      return var1.eL(var7, var6, var27, new aiz(var17, 11));
   }

   public final void c(brl var1) {
      var1.getClass();
      qvt var3 = this.m;
      Object var2 = var3;
      if (var3 == null) {
         var2 = new aiz(this, 8);
         this.m = (qvt)var2;
      }

      amm var4 = this.f();
      if (var4 == null) {
         brr.e(var1, this.a);
      } else {
         brr.d(var1, var4.c);
         if (var4.c) {
            brr.e(var1, var4.b);
            brr.b(var1, var4.a);
         } else {
            brr.e(var1, var4.a);
         }
      }

      brr.h(var1, new aiz(this, 9));
      brr.i(var1, new aiz(this, 10));
      brr.f(var1, new amp(this, 1));
      brr.g(var1, (qvt)var2);
   }

   public final amf d() {
      if (this.l == null) {
         this.l = new amf(this.a, this.b, this.g, this.c, this.d, this.e);
      }

      amf var1 = this.l;
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
      ami var7 = this.j;
      if (var7 != null && (amr)var7.a.b().get(var7.c) != null) {
         throw null;
      } else {
         bcw var10 = var1.m().b();
         bsq var194 = this.w(var1).a();
         bsc var11 = var194.b;
         boolean var2;
         if (var194.g() && !c.n(this.c, 3)) {
            var2 = true;
         } else {
            var2 = false;
         }

         long var5;
         if (var2) {
            var5 = var194.c;
            int var4 = bxx.b(var5);
            int var3 = bxx.a(var5);
            bcj var195 = es.h(bci.a, et.k((float)var4, (float)var3));
            var10.e();
            bcq.d(var10, var195);
         }

         label1710: {
            Throwable var10000;
            label1713: {
               bxd var198;
               boolean var10001;
               try {
                  var198 = this.b.o();
               } catch (Throwable var193) {
                  var10000 = var193;
                  var10001 = false;
                  break label1713;
               }

               bxd var196 = var198;
               if (var198 == null) {
                  try {
                     var196 = bxd.a;
                  } catch (Throwable var192) {
                     var10000 = var192;
                     var10001 = false;
                     break label1713;
                  }
               }

               bdq var8;
               try {
                  var8 = this.b.e();
               } catch (Throwable var191) {
                  var10000 = var191;
                  var10001 = false;
                  break label1713;
               }

               bdq var199 = var8;
               if (var8 == null) {
                  try {
                     var199 = bdq.a;
                  } catch (Throwable var190) {
                     var10000 = var190;
                     var10001 = false;
                     break label1713;
                  }
               }

               gf var9;
               try {
                  var9 = this.b.v();
               } catch (Throwable var189) {
                  var10000 = var189;
                  var10001 = false;
                  break label1713;
               }

               Object var200 = var9;
               if (var9 == null) {
                  try {
                     var200 = bex.a;
                  } catch (Throwable var188) {
                     var10000 = var188;
                     var10001 = false;
                     break label1713;
                  }
               }

               qnd var201;
               try {
                  var201 = this.f;
               } catch (Throwable var187) {
                  var10000 = var187;
                  var10001 = false;
                  break label1713;
               }

               if (var201 != null) {
                  try {
                     var5 = var201.a;
                  } catch (Throwable var186) {
                     var10000 = var186;
                     var10001 = false;
                     break label1713;
                  }
               } else {
                  try {
                     var5 = bcy.f;
                  } catch (Throwable var185) {
                     var10000 = var185;
                     var10001 = false;
                     break label1713;
                  }
               }

               label1716: {
                  try {
                     if (var5 != bcy.f) {
                        break label1716;
                     }
                  } catch (Throwable var184) {
                     var10000 = var184;
                     var10001 = false;
                     break label1713;
                  }

                  try {
                     if (this.b.b() != bcy.f) {
                        var5 = this.b.b();
                        break label1716;
                     }
                  } catch (Throwable var183) {
                     var10000 = var183;
                     var10001 = false;
                     break label1713;
                  }

                  try {
                     var5 = bcy.a;
                  } catch (Throwable var182) {
                     var10000 = var182;
                     var10001 = false;
                     break label1713;
                  }
               }

               label1652:
               try {
                  var11.c(var10, var5, var199, var196, (gf)var200);
                  break label1710;
               } catch (Throwable var181) {
                  var10000 = var181;
                  var10001 = false;
                  break label1652;
               }
            }

            Throwable var197 = var10000;
            if (var2) {
               var10.d();
            }

            throw var197;
         }

         if (var2) {
            var10.d();
         }

      }
   }

   public final amm f() {
      return (amm)this.n.a();
   }

   public final void g() {
      this.i((amm)null);
   }

   public final void h(boolean var1, boolean var2, boolean var3, boolean var4) {
      if ((var2 || var1 && this.m != null) && super.y) {
         kd.f(this);
      }

      if (var2 || var3 || var4) {
         this.d().d(this.a, this.b, this.g, this.c, this.d, this.e);
         if (super.y) {
            jk.h(this);
         }

         jk.k(this);
      }

      if (var1) {
         jk.k(this);
      }

   }

   public final void i(amm var1) {
      this.n.b(var1);
   }

   public final boolean j(bry var1) {
      if (c.E(this.a, var1)) {
         return false;
      } else {
         this.a = var1;
         this.g();
         return true;
      }
   }

   public final boolean k(qvt var1, ami var2) {
      boolean var3;
      if (!c.E(this.h, var1)) {
         this.h = var1;
         var3 = true;
      } else {
         var3 = false;
      }

      boolean var4 = c.E((Object)null, (Object)null);
      if (!c.E(this.j, var2)) {
         this.j = var2;
         return true;
      } else {
         return var3 | var4 ^ true;
      }
   }

   public final boolean l(qnd var1, bss var2) {
      boolean var3 = c.E(var1, this.f);
      this.f = var1;
      return var3 ^ true || !var2.s(this.b);
   }

   public final boolean m(bss var1, int var2, boolean var3, fwf var4, int var5) {
      boolean var7 = this.b.t(var1);
      this.b = var1;
      boolean var6 = c.E((Object)null, (Object)null);
      if (this.i != 1) {
         this.i = 1;
         var6 = true;
      } else {
         var6 = var6 ^ true | var7 ^ true;
      }

      if (this.e != var2) {
         this.e = var2;
         var6 = true;
      }

      if (this.d != var3) {
         this.d = var3;
         var6 = true;
      }

      if (!c.E(this.g, var4)) {
         this.g = var4;
         var6 = true;
      }

      if (!c.n(this.c, var5)) {
         this.c = var5;
         return true;
      } else {
         return var6;
      }
   }
}
