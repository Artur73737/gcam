public final class bmr {
   public final bmd a;
   public final bls b;
   public bmz c;
   public final bba d;
   public bba e;
   public axf f;
   public axf g;
   private bmq h;

   public bmr(bmd var1) {
      this.a = var1;
      bls var2 = new bls(var1);
      this.b = var2;
      this.c = var2;
      bnl var3 = var2.f;
      this.d = var3;
      this.e = var3;
   }

   public static final bba k(baz var0, bba var1) {
      Object var3;
      if (var0 instanceof bmp) {
         var3 = ((bmp)var0).a();
         ((bba)var3).q = jm.i((bba)var3);
      } else {
         var3 = new bky(var0);
      }

      if (!((bba)var3).y) {
         ((bba)var3).w = true;
         bba var2 = var1.t;
         if (var2 != null) {
            var2.s = (bba)var3;
            ((bba)var3).t = var2;
         }

         var1.t = (bba)var3;
         ((bba)var3).s = var1;
         return (bba)var3;
      } else {
         throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
      }
   }

   public static final bba l(bba var0) {
      if (var0.y) {
         jm.k(var0, -1, 2);
         var0.t();
         var0.q();
      }

      bba var1 = var0.t;
      bba var2 = var0.s;
      if (var1 != null) {
         var1.s = var2;
         var0.t = null;
      }

      if (var2 != null) {
         var2.t = var1;
         var0.s = null;
      }

      var2.getClass();
      return var2;
   }

   public static final void m(baz var0, baz var1, bba var2) {
      if (var0 instanceof bmp && var1 instanceof bmp) {
         bmp var5 = (bmp)var1;
         bms var4 = bmt.a;
         var2.getClass();
         var5.b(var2);
         if (var2.y) {
            jm.l(var2);
         } else {
            var2.x = true;
         }
      } else if (var2 instanceof bky) {
         bky var3 = (bky)var2;
         var1.getClass();
         if (var3.y) {
            var3.l();
         }

         var3.a = var1;
         var3.q = jm.g(var1);
         if (var3.y) {
            var3.j(false);
         }

         if (var2.y) {
            jm.l(var2);
         } else {
            var2.x = true;
         }
      } else {
         throw new IllegalStateException("Unknown Modifier.Node type");
      }
   }

   public final int a() {
      return this.e.r;
   }

   public final void b() {
      for(bba var1 = this.e; var1 != null; var1 = var1.t) {
         var1.p();
      }

   }

   public final void c() {
      for(bba var1 = this.d; var1 != null; var1 = var1.s) {
         if (var1.y) {
            var1.q();
         }
      }

   }

   public final void d(bba var1, bmz var2) {
      for(var1 = var1.s; var1 != null; var1 = var1.s) {
         if (var1 == bmt.a) {
            bmd var3 = this.a.n();
            bmz var4;
            if (var3 != null) {
               var4 = var3.r();
            } else {
               var4 = null;
            }

            var2.p = var4;
            this.c = var2;
            return;
         }

         if ((var1.q & 2) != 0) {
            break;
         }

         var1.u(var2);
      }

   }

   public final void e() {
      for(bba var1 = this.e; var1 != null; var1 = var1.t) {
         var1.s();
         if (var1.w) {
            jm.j(var1);
         }

         if (var1.x) {
            jm.l(var1);
         }

         var1.w = false;
         var1.x = false;
      }

   }

   public final void f() {
      for(bba var1 = this.d; var1 != null; var1 = var1.s) {
         if (var1.y) {
            var1.t();
         }
      }

   }

   public final void g(int var1, axf var2, axf var3, bba var4, boolean var5) {
      bmq var24 = this.h;
      bmq var31;
      if (var24 == null) {
         var24 = new bmq(this, var4, var1, var2, var3, var5);
         var31 = var24;
         this.h = var24;
      } else {
         var24.a = var4;
         var24.b = var1;
         var24.c = var2;
         var24.d = var3;
         var24.e = var5;
         var31 = var24;
      }

      int var7 = var2.b - var1;
      int var6 = var3.b - var1;
      var1 = (var7 + var6 + 1) / 2;
      hyh var42 = new hyh(var1 * 3);
      hyh var28 = new hyh(var1 * 4);
      var28.i(0, var7, 0, var6);
      var1 = var1 + var1 + 1;
      int[] var25 = new int[var1];
      int[] var27 = new int[var1];
      int[] var26 = new int[5];
      var1 = var7;

      while(true) {
         boolean var18 = false;
         byte var9 = 0;
         int var8;
         int var10;
         int var11;
         int var12;
         int var13;
         int var39;
         if (var28.a == 0) {
            var7 = var42.a;
            if (var7 % 3 != 0) {
               IllegalStateException var37 = new IllegalStateException("Array size not a multiple of 3");
               throw var37;
            }

            if (var7 > 3) {
               var42.j(0, var7 - 3);
            }

            var7 = 0;
            var42.h(var1, var6, 0);
            var1 = 0;

            for(var6 = 0; var6 < var42.a; var6 = var39) {
               var12 = var42.f(var6);
               var8 = var6 + 2;
               var13 = var42.f(var8);
               var10 = var42.f(var6 + 1);
               var11 = var42.f(var8);
               var8 = var42.f(var8);
               var39 = var6 + 3;

               while(true) {
                  var6 = var1;
                  bba var30;
                  bba var32;
                  if (var7 >= var12 - var13) {
                     for(; var6 < var10 - var11; ++var6) {
                        var1 = var31.b;
                        var30 = var31.a;
                        var31.a = k((baz)var31.d.a[var1 + var6], var30);
                        if (var31.e) {
                           var32 = var31.a;
                           var30 = var32.t;
                           var30.getClass();
                           bmz var33 = var30.v;
                           var33.getClass();
                           blv var34 = jj.g(var32);
                           if (var34 != null) {
                              blx var36 = new blx(var31.f.a, var34);
                              var31.a.u(var36);
                              var31.f.d(var31.a, var36);
                              var36.p = var33.p;
                              var36.o = var33;
                              var33.p = var36;
                           } else {
                              var31.a.u(var33);
                           }

                           var31.a.p();
                           var31.a.s();
                           jm.j(var31.a);
                        } else {
                           var31.a.w = true;
                        }
                     }

                     for(var1 = var6; var8 > 0; --var8) {
                        var30 = var31.a.t;
                        var30.getClass();
                        var31.a = var30;
                        var2 = var31.c;
                        var6 = var31.b;
                        baz var38 = (baz)var2.a[var6 + var7];
                        baz var35 = (baz)var31.d.a[var6 + var1];
                        if (!c.E(var38, var35)) {
                           m(var38, var35, var31.a);
                        }

                        ++var7;
                        ++var1;
                     }
                     break;
                  }

                  var30 = var31.a;
                  var32 = var30.t;
                  var32.getClass();
                  if ((var32.q & 2) != 0) {
                     bmz var44 = var32.v;
                     var44.getClass();
                     bmz var43 = var44.p;
                     var44 = var44.o;
                     var44.getClass();
                     if (var43 != null) {
                        var43.o = var44;
                     }

                     var44.p = var43;
                     var31.f.d(var30, var44);
                  }

                  var31.a = l(var32);
                  ++var7;
               }
            }

            this.h();
            return;
         }

         boolean var40;
         label226: {
            var7 = var28.g();
            var11 = var28.g();
            var10 = var28.g();
            var8 = var28.g();
            int var21 = var10 - var8;
            int var22 = var7 - var11;
            int var17 = var1;
            int var16 = var6;
            hyh var29 = var28;
            int var15 = var8;
            int var14 = var10;
            var13 = var11;
            var12 = var7;
            if (var21 > 0) {
               if (var22 <= 0) {
                  var12 = var6;
                  var39 = var7;
                  var7 = var8;
                  var8 = var11;
                  var40 = var18;
                  var11 = var10;
                  var6 = var1;
                  var1 = var12;
                  break label226;
               }

               blc.b(var25, 1, var8);
               blc.b(var27, 1, var10);
               var12 = var21;
               int var41 = var9;
               var39 = var6;

               while(true) {
                  int var19 = var12;
                  var17 = var1;
                  var16 = var39;
                  var29 = var28;
                  var15 = var8;
                  var14 = var10;
                  var13 = var11;
                  var12 = var7;
                  if (var41 >= (var21 + var22 + 1) / 2) {
                     break;
                  }

                  int var23 = var19 - var22;
                  var13 = Math.abs(var23) % 2;
                  var14 = -var41;
                  var12 = var1;
                  var15 = var14;
                  var6 = var11;
                  var1 = var10;

                  int var20;
                  for(var11 = var13; var15 <= var41; var39 = var13) {
                     if (var15 == var14 || var15 != var41 && blc.a(var25, var15 + 1) > blc.a(var25, var15 - 1)) {
                        var10 = blc.a(var25, var15 + 1);
                        var16 = var10;
                     } else {
                        var16 = blc.a(var25, var15 - 1);
                        var10 = var16 + 1;
                     }

                     var13 = var39;
                     var39 = var6 + (var10 - var8) - var15;
                     if (var41 != 0 && var10 == var16) {
                        var20 = var39 - 1;
                        var39 = var39;
                        var17 = var20;
                     } else {
                        var17 = var39;
                        var39 = var39;
                     }

                     while(var10 < var1 && var39 < var7 && var31.a(var10, var39)) {
                        ++var10;
                        ++var39;
                     }

                     blc.b(var25, var15, var10);
                     if (var11 == 1) {
                        var20 = var23 - var15;
                        if (var20 >= var14 + 1 && var20 <= var41 - 1 && blc.a(var27, var20) <= var10) {
                           jm.o(var16, var17, var10, var39, false, var26);
                           var40 = true;
                           var39 = var7;
                           var7 = var8;
                           var8 = var6;
                           var11 = var1;
                           var6 = var12;
                           var1 = var13;
                           break label226;
                        }
                     }

                     var15 += 2;
                  }

                  var13 = var39;
                  var39 = var6;
                  var10 = var14;

                  for(var6 = var7; var10 <= var41; var1 = var1) {
                     if (var10 == var14 || var10 != var41 && blc.a(var27, var10 + 1) < blc.a(var27, var10 - 1)) {
                        var7 = blc.a(var27, var10 + 1);
                        var15 = var7;
                     } else {
                        var15 = blc.a(var27, var10 - 1);
                        var7 = var15 - 1;
                     }

                     var17 = var6 - (var1 - var7 - var10);
                     if (var41 != 0 && var7 == var15) {
                        var16 = var17 + 1;
                     } else {
                        var16 = var17;
                     }

                     while(var7 > var8 && var17 > var39) {
                        var11 = var7 - 1;
                        var20 = var17 - 1;
                        if (!var31.a(var11, var20)) {
                           break;
                        }

                        var17 = var20;
                        var7 = var11;
                     }

                     var11 = var1;
                     blc.b(var27, var10, var7);
                     if (var23 % 2 == 0) {
                        var1 = var23 - var10;
                        if (var1 >= var14 && var1 <= var41 && blc.a(var25, var1) >= var7) {
                           jm.o(var7, var17, var15, var16, true, var26);
                           var40 = true;
                           var7 = var8;
                           var8 = var39;
                           var39 = var6;
                           var6 = var12;
                           var1 = var13;
                           break label226;
                        }
                     }

                     var10 += 2;
                  }

                  ++var41;
                  var11 = var39;
                  var10 = var1;
                  var39 = var13;
                  var1 = var12;
                  var12 = var19;
                  var7 = var6;
               }
            }

            var6 = var17;
            var1 = var16;
            var28 = var29;
            var7 = var15;
            var11 = var14;
            var8 = var13;
            var39 = var12;
            var40 = false;
         }

         if (var40) {
            if (bnk.a(var26) > 0) {
               if (bnk.c(var26) - bnk.e(var26) != bnk.b(var26) - bnk.d(var26)) {
                  if (var26[4] != 0) {
                     var42.h(bnk.d(var26), bnk.e(var26), bnk.a(var26));
                  } else if (bnk.c(var26) - bnk.e(var26) > bnk.b(var26) - bnk.d(var26)) {
                     var42.h(bnk.d(var26), bnk.e(var26) + 1, bnk.a(var26));
                  } else {
                     var42.h(bnk.d(var26) + 1, bnk.e(var26), bnk.a(var26));
                  }
               } else {
                  var42.h(bnk.d(var26), bnk.e(var26), bnk.b(var26) - bnk.d(var26));
               }
            }

            var28.i(var7, bnk.d(var26), var8, bnk.e(var26));
            var28.i(bnk.b(var26), var11, bnk.c(var26), var39);
            var7 = var1;
            var1 = var6;
            var6 = var7;
         } else {
            var7 = var6;
            var6 = var1;
            var1 = var7;
         }
      }
   }

   public final void h() {
      bba var2 = this.d.s;

      for(int var1 = 0; var2 != null && var2 != bmt.a; var2 = var2.s) {
         var1 |= var2.q;
         var2.r = var1;
      }

   }

   public final void i() {
      Object var2 = this.b;

      bmz var1;
      for(bba var3 = this.d.s; var3 != null; var3 = var3.s) {
         blv var4 = jj.g(var3);
         if (var4 != null) {
            var1 = var3.v;
            blx var6;
            if (var1 != null) {
               var6 = (blx)var1;
               blv var5 = var6.f;
               var6.f = var4;
               if (var5 != var3) {
                  var6.aa();
               }
            } else {
               var6 = new blx(this.a, var4);
               var3.u(var6);
            }

            ((bmz)var2).p = var6;
            var6.o = (bmz)var2;
            var2 = var6;
         } else {
            var3.u((bmz)var2);
         }
      }

      bmd var7 = this.a.n();
      if (var7 != null) {
         var1 = var7.r();
      } else {
         var1 = null;
      }

      ((bmz)var2).p = var1;
      this.c = (bmz)var2;
   }

   public final boolean j(int var1) {
      return (var1 & this.a()) != 0;
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append("[");
      bba var2 = this.e;
      bba var1 = var2;
      if (var2 == this.d) {
         var3.append("]");
      } else {
         while(var1 != null && var1 != this.d) {
            var3.append(var1.toString());
            if (var1.t == this.d) {
               var3.append("]");
               break;
            }

            var3.append(",");
            var1 = var1.t;
         }
      }

      return var3.toString();
   }
}
