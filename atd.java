public final class atd extends qwq implements qvt {
   final int a;
   final Object b;
   final Object c;
   private final int d;

   public atd(agc var1, int var2, afj var3, int var4) {
      super(1);
      this.d = var4;
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public atd(ate var1, dhq var2, int var3, int var4) {
      super(1);
      this.d = var4;
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   public atd(Object var1, int var2, Object var3, int var4) {
      super(1);
      this.d = var4;
      this.b = var1;
      this.a = var2;
      this.c = var3;
   }

   // $FF: synthetic method
   public final Object eo(Object var1) {
      int var2 = this.d;
      int var3 = 0;
      int var4;
      Object var32;
      switch(var2) {
      case 0:
         var1.getClass();
         if (var1 != this.b) {
            if (var1 instanceof bai) {
               var32 = avg.a.d();
               var32.getClass();
               var4 = ((Number)var32).intValue();
               var32 = this.c;
               var3 = this.a;
               dhq var40 = (dhq)var32;
               Integer var34 = (Integer)var40.g(var1);
               if (var34 != null) {
                  var2 = var34;
               } else {
                  var2 = Integer.MAX_VALUE;
               }

               var40.h(var1, Math.min(var4 - var3, var2));
            }

            return qsn.a;
         }

         throw new IllegalStateException("A derived state calculation cannot read itself");
      case 1:
         long var11 = ((bci)var1).d;
         prl var25 = ((agc)this.c).g;
         var2 = this.a;
         bgv var26 = var25.t();
         long var9;
         if (var26 != null) {
            var9 = var26.b(var11, var2);
         } else {
            var9 = bci.a;
         }

         var11 = bci.e(var11, var9);
         var32 = this.c;
         var1 = this.b;
         agc var38 = (agc)var32;
         long var13 = var38.d(var38.e(((afj)var1).a(var38.b(var38.d(var11)))));
         var11 = bci.e(var11, var13);
         var25 = ((agc)this.c).g;
         var2 = this.a;
         var26 = var25.t();
         if (var26 != null) {
            var11 = var26.a(var13, var11, var2);
         } else {
            var11 = bci.a;
         }

         return bci.i(bci.f(bci.f(var9, var13), var11));
      case 2:
         ass var24 = (ass)var1;
         var24.getClass();
         aug var16 = (aug)this.b;
         if (var16.d == this.a && c.E(this.c, var16.f) && var24 instanceof asw) {
            var32 = this.c;
            int var6 = this.a;
            Object var17 = this.b;
            dhq var20 = (dhq)var32;
            Object var18 = var20.c;
            Object var19 = var20.b;
            int var5 = var20.a;

            for(var2 = 0; var3 < var5; var2 = var4) {
               Object[] var22 = (Object[])var18;
               var32 = var22[var3];
               var32.getClass();
               int[] var21 = (int[])var19;
               var4 = var21[var3];
               if (var4 != var6) {
                  asw var45 = (asw)var24;
                  var45.i.x(var32, var17);
                  ate var33;
                  if (var32 instanceof ate) {
                     var33 = (ate)var32;
                  } else {
                     var33 = null;
                  }

                  if (var33 != null) {
                     if (!var45.i.w(var33)) {
                        var45.j.v(var33);
                     }

                     aug var46 = (aug)var17;
                     dhq var48 = var46.e;
                     if (var48 != null) {
                        int var8 = var48.f(var33);
                        if (var8 >= 0) {
                           Object[] var36 = (Object[])var48.c;
                           Object var10000 = var36[var8];
                           int var7 = var48.a;
                           Object var23 = var48.b;
                           var4 = var8 + 1;
                           Object[] var50 = (Object[])var23;
                           pwm.bh(var50, var50, var8, var4, var7);
                           pwm.bh(var36, var36, var8, var4, var7);
                           var4 = var7 - 1;
                           var50[var4] = null;
                           var36[var4] = null;
                           var48.a = var4;
                        }

                        var4 = var2;
                        if (var48.a == 0) {
                           var46.e = null;
                           var4 = var2;
                        }
                     } else {
                        var4 = var2;
                     }
                  } else {
                     var4 = var2;
                  }
               } else {
                  if (var2 != var3) {
                     var22[var2] = var32;
                     var21[var2] = var4;
                  }

                  var4 = var2 + 1;
               }

               ++var3;
            }

            for(var3 = var2; var3 < var5; ++var3) {
               ((Object[])var18)[var3] = null;
            }

            var20.a = var2;
            if (((dhq)this.c).a == 0) {
               ((aug)this.b).f = null;
            }
         }

         return qsn.a;
      default:
         bcd var49 = (bcd)var1;
         var49.getClass();
         Boolean var27;
         if (c.E(var49, this.b)) {
            var27 = false;
         } else {
            bba var28 = var49.p;
            if (!var28.y) {
               IllegalStateException var31 = new IllegalStateException("visitAncestors called on an unattached node");
               throw var31;
            }

            var28 = var28.s;
            bmd var43 = jj.h(var49);

            boolean var15;
            label194:
            while(true) {
               while(true) {
                  var15 = true;
                  if (var43 == null) {
                     var28 = null;
                     break label194;
                  }

                  bba var35 = var28;
                  if ((var43.n.e.r & 1024) != 0) {
                     label185:
                     for(; var35 != null; var35 = var35.s) {
                        if ((var35.q & 1024) != 0) {
                           bba var42 = var35;
                           axf var39 = null;

                           while(true) {
                              axf var29;
                              do {
                                 if (var42 == null) {
                                    continue label185;
                                 }

                                 var28 = var42;
                                 if (var42 instanceof bcd) {
                                    break label194;
                                 }

                                 var29 = var39;
                                 if ((var42.q & 1024) == 0) {
                                    break;
                                 }

                                 var29 = var39;
                                 if (!(var42 instanceof blh)) {
                                    break;
                                 }

                                 bba var37 = ((blh)var42).A;
                                 var2 = 0;
                                 var29 = var39;

                                 bba var41;
                                 for(var41 = var42; var37 != null; var2 = var3) {
                                    var42 = var41;
                                    axf var47 = var29;
                                    var3 = var2;
                                    if ((var37.q & 1024) != 0) {
                                       var3 = var2 + 1;
                                       if (var3 == 1) {
                                          var42 = var37;
                                          var47 = var29;
                                       } else {
                                          axf var44 = var29;
                                          if (var29 == null) {
                                             var44 = new axf(new bba[16]);
                                          }

                                          if (var41 != null) {
                                             var44.p(var41);
                                          }

                                          var44.p(var37);
                                          var1 = null;
                                          var47 = var44;
                                          var42 = (bba)var1;
                                       }
                                    }

                                    var37 = var37.t;
                                    var41 = var42;
                                    var29 = var47;
                                 }

                                 var42 = var41;
                                 var39 = var29;
                              } while(var2 == 1);

                              var42 = jj.f(var29);
                              var39 = var29;
                           }
                        }
                     }
                  }

                  var43 = var43.n();
                  if (var43 != null) {
                     bmr var30 = var43.n;
                     if (var30 != null) {
                        var28 = var30.d;
                        continue;
                     }
                  }

                  var28 = null;
               }
            }

            if (var28 == null) {
               throw new IllegalStateException("Focus search landed at the root.");
            }

            var2 = ej.r(var49, this.a);
            if (var2 == 0) {
               throw null;
            }

            switch(var2 - 1) {
            case 0:
               var15 = ej.o(var49);
               break;
            case 1:
            case 3:
               ((qwv)this.c).a = true;
            case 2:
               break;
            default:
               throw new qse();
            }

            var27 = var15;
         }

         return var27;
      }
   }
}
