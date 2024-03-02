public final class bls extends bmz {
   private static final bco u;
   public final bnl f;
   public bmo g;

   static {
      bco var0 = eu.h();
      var0.j(bcy.c);
      var0.p(1.0F);
      var0.q(1);
      u = var0;
   }

   public bls(bmd var1) {
      super(var1);
      bnl var2 = new bnl();
      this.f = var2;
      var2.v = this;
      blr var3;
      if (var1.e != null) {
         var3 = new blr(this);
      } else {
         var3 = null;
      }

      this.g = var3;
   }

   public final bke l(long var1) {
      this.q(var1);
      axf var6 = super.n.m();
      int var5 = var6.b;
      if (var5 > 0) {
         Object[] var7 = var6.a;
         int var3 = 0;

         int var4;
         do {
            ((bmd)var7[var3]).q().w();
            var4 = var3 + 1;
            var3 = var4;
         } while(var4 < var5);
      }

      bmd var8 = super.n;
      this.af(var8.h.a(this, var8.x(), var1));
      this.ab();
      return this;
   }

   public final void r(long var1, qvt var3) {
      this.al(var1, var3);
      if (!super.h) {
         this.ac();
         super.n.q().t();
      }
   }

   public final int s(bir var1) {
      bmo var3 = this.g;
      int var2;
      if (var3 != null) {
         var2 = var3.s(var1);
      } else {
         bmj var5 = (bmj)this.R();
         if (!var5.k) {
            bml var7 = var5.u;
            if (var7.p == 1) {
               bkv var4 = var5.q;
               var4.f = true;
               if (var4.b) {
                  var7.d();
               }
            } else {
               var5.q.g = true;
            }
         }

         var5.d().i = true;
         var5.f();
         var5.d().i = false;
         Integer var6 = (Integer)var5.q.h.get(var1);
         if (var6 != null) {
            return var6;
         }

         var2 = Integer.MIN_VALUE;
      }

      return var2;
   }

   // $FF: synthetic method
   public final bba t() {
      return this.f;
   }

   public final bmo u() {
      return this.g;
   }

   public final void v() {
      if (this.g == null) {
         this.g = new blr(this);
      }

   }

   public final void x(bmw var1, long var2, blq var4, boolean var5, boolean var6) {
      boolean var8;
      label110: {
         if (var1.c(super.n)) {
            if (this.aj(var2)) {
               var8 = true;
               break label110;
            }

            if (var5) {
               float var7 = this.J(var2, this.M());
               if (!Float.isInfinite(var7) && !Float.isNaN(var7)) {
                  var8 = true;
                  var6 = false;
                  break label110;
               }
            }
         }

         var8 = false;
      }

      if (var8) {
         int var10 = var4.c;
         axf var13 = super.n.l();
         int var20 = var13.b;
         if (var20 > 0) {
            Object[] var21 = var13.a;
            --var20;

            do {
               bmd var14 = (bmd)var21[var20];
               if (var14.d()) {
                  var1.b(var14, var2, var4, var5, var6);
                  long var11 = var4.a();
                  if (blk.a(var11) < 0.0F && blk.c(var11)) {
                     bba var18 = var14.s().P(jm.m(16));
                     if (var18 != null) {
                        if (!var18.n().y) {
                           throw new IllegalStateException("visitLocalDescendants called on an unattached node");
                        }

                        var18 = var18.n();
                        if ((var18.r & 16) != 0) {
                           label87:
                           for(bba var22 = var18.t; var22 != null; var22 = var22.t) {
                              if ((var22.q & 16) != 0) {
                                 bba var16 = var22;
                                 axf var15 = null;

                                 while(true) {
                                    axf var19;
                                    do {
                                       if (var16 == null) {
                                          continue label87;
                                       }

                                       if (var16 instanceof bni) {
                                          ((bni)var16).k();
                                          var19 = var15;
                                          break;
                                       }

                                       var19 = var15;
                                       if ((var16.q & 16) == 0) {
                                          break;
                                       }

                                       var19 = var15;
                                       if (!(var16 instanceof blh)) {
                                          break;
                                       }

                                       bba var23 = ((blh)var16).A;
                                       var20 = 0;

                                       int var9;
                                       for(var19 = var15; var23 != null; var20 = var9) {
                                          bba var24 = var16;
                                          axf var17 = var19;
                                          var9 = var20;
                                          if ((var23.q & 16) != 0) {
                                             var9 = var20 + 1;
                                             if (var9 == 1) {
                                                var24 = var23;
                                                var17 = var19;
                                             } else {
                                                var15 = var19;
                                                if (var19 == null) {
                                                   var15 = new axf(new bba[16]);
                                                }

                                                if (var16 != null) {
                                                   var15.p(var16);
                                                }

                                                var15.p(var23);
                                                var1 = null;
                                                var17 = var15;
                                                var24 = var1;
                                             }
                                          }

                                          var23 = var23.t;
                                          var16 = var24;
                                          var19 = var17;
                                       }

                                       var15 = var19;
                                    } while(var20 == 1);

                                    var16 = jj.f(var19);
                                    var15 = var19;
                                 }
                              }
                           }
                        }
                     }
                     break;
                  }
               }

               --var20;
            } while(var20 >= 0);
         }

         var4.c = var10;
      }
   }

   public final void y(bcw var1) {
      var1.getClass();
      boa var5 = bmg.a(super.n);
      axf var6 = super.n.l();
      int var4 = var6.b;
      if (var4 > 0) {
         Object[] var8 = var6.a;
         int var2 = 0;

         int var3;
         do {
            bmd var7 = (bmd)var8[var2];
            if (var7.d()) {
               var7.D(var1);
            }

            var3 = var2 + 1;
            var2 = var3;
         } while(var3 < var4);
      }

      if (var5.k) {
         this.ak(var1, u);
      }

   }
}
