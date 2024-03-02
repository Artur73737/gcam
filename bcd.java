public final class bcd extends bba implements blf, bna, bkr, blg {
   public boolean a;
   public boolean b;
   public bcc c;

   public bcd() {
      this.c = bcc.d;
   }

   public final bbv d() {
      bbw var11 = new bbw();
      bba var10 = super.p;
      if (!var10.y) {
         IllegalStateException var15 = new IllegalStateException("visitAncestors called on an unattached node");
         throw var15;
      } else {
         bmd var8 = jj.h(this);
         bba var3 = var10;

         while(var8 != null) {
            bba var4 = var3;
            if ((var8.n.e.r & 3072) != 0) {
               label87:
               for(; var4 != null; var4 = var4.s) {
                  int var1 = var4.q;
                  if ((var1 & 3072) != 0) {
                     if (var4 != var10 && (var1 & 1024) != 0) {
                        return var11;
                     }

                     if ((var1 & 2048) != 0) {
                        bba var7 = var4;
                        axf var6 = null;

                        while(true) {
                           axf var12;
                           do {
                              if (var7 == null) {
                                 continue label87;
                              }

                              if (var7 instanceof bbx) {
                                 ((bbx)var7).eE(var11);
                                 var12 = var6;
                                 break;
                              }

                              var12 = var6;
                              if ((var7.q & 2048) == 0) {
                                 break;
                              }

                              var12 = var6;
                              if (!(var7 instanceof blh)) {
                                 break;
                              }

                              bba var5 = ((blh)var7).A;
                              var1 = 0;

                              int var2;
                              for(var12 = var6; var5 != null; var1 = var2) {
                                 bba var14 = var7;
                                 axf var9 = var12;
                                 var2 = var1;
                                 if ((var5.q & 2048) != 0) {
                                    var2 = var1 + 1;
                                    if (var2 == 1) {
                                       var14 = var5;
                                       var9 = var12;
                                    } else {
                                       var6 = var12;
                                       if (var12 == null) {
                                          var6 = new axf(new bba[16]);
                                       }

                                       if (var7 != null) {
                                          var6.p(var7);
                                       }

                                       var6.p(var5);
                                       var3 = null;
                                       var9 = var6;
                                       var14 = var3;
                                    }
                                 }

                                 var5 = var5.t;
                                 var7 = var14;
                                 var12 = var9;
                              }

                              var6 = var12;
                           } while(var1 == 1);

                           var7 = jj.f(var12);
                           var6 = var12;
                        }
                     }
                  }
               }
            }

            var8 = var8.n();
            if (var8 != null) {
               bmr var13 = var8.n;
               if (var13 != null) {
                  var3 = var13.d;
                  continue;
               }
            }

            var3 = null;
         }

         return var11;
      }
   }

   public final void en() {
      bcc var1 = this.c;
      bcc var2 = bcc.a;
      switch(var1.ordinal()) {
      case 0:
      case 2:
         jj.k(this).w.b(true);
         return;
      case 1:
         this.h();
         this.i(bcc.d);
         return;
      case 3:
         this.h();
         return;
      default:
      }
   }

   public final void ep() {
      bcc var1 = this.c;
      this.f();
      if (var1 != this.c) {
         ej.v(this);
      }

   }

   // $FF: synthetic method
   public final Object eq(lmk var1) {
      return jj.n(this, var1);
   }

   // $FF: synthetic method
   public final bkq ex() {
      return bkp.a;
   }

   public final void f() {
      bcc var1 = this.c;
      bcc var2 = bcc.a;
      switch(var1.ordinal()) {
      case 0:
      case 2:
         qwz var3 = new qwz();
         jm.f(this, new us(var3, this, 8));
         Object var4 = var3.a;
         bbv var5;
         if (var4 == null) {
            qwp.b("focusProperties");
            var5 = null;
         } else {
            var5 = (bbv)var4;
         }

         if (!var5.b()) {
            jj.k(this).w.b(true);
            return;
         }
      case 1:
      default:
      }
   }

   public final void h() {
      bba var6 = super.p;
      axf var5 = null;

      while(true) {
         int var1;
         axf var3;
         do {
            var1 = 0;
            int var2;
            bba var4;
            bba var11;
            if (var6 == null) {
               bba var10 = super.p;
               if (!var10.y) {
                  IllegalStateException var15 = new IllegalStateException("visitAncestors called on an unattached node");
                  throw var15;
               }

               var10 = var10.s;
               bmd var8 = jj.h(this);

               while(true) {
                  while(var8 != null) {
                     var4 = var10;
                     if ((var8.n.e.r & 5120) != 0) {
                        label109:
                        for(; var4 != null; var4 = var4.s) {
                           var1 = var4.q;
                           if ((var1 & 5120) != 0 && (var1 & 1024) == 0 && var4.y) {
                              bba var14 = var4;
                              axf var12 = null;

                              while(true) {
                                 do {
                                    if (var14 == null) {
                                       continue label109;
                                    }

                                    if (var14 instanceof bbr) {
                                       ej.u((bbr)var14);
                                       var3 = var12;
                                       break;
                                    }

                                    var3 = var12;
                                    if ((var14.q & 4096) == 0) {
                                       break;
                                    }

                                    var3 = var12;
                                    if (!(var14 instanceof blh)) {
                                       break;
                                    }

                                    var11 = ((blh)var14).A;
                                    var2 = 0;

                                    for(var3 = var12; var11 != null; var2 = var1) {
                                       var6 = var14;
                                       axf var9 = var3;
                                       var1 = var2;
                                       if ((var11.q & 4096) != 0) {
                                          var1 = var2 + 1;
                                          if (var1 == 1) {
                                             var6 = var11;
                                             var9 = var3;
                                          } else {
                                             var12 = var3;
                                             if (var3 == null) {
                                                var12 = new axf(new bba[16]);
                                             }

                                             if (var14 != null) {
                                                var12.p(var14);
                                             }

                                             var12.p(var11);
                                             var3 = null;
                                             var9 = var12;
                                             var6 = var3;
                                          }
                                       }

                                       var11 = var11.t;
                                       var14 = var6;
                                       var3 = var9;
                                    }

                                    var12 = var3;
                                 } while(var2 == 1);

                                 var14 = jj.f(var3);
                                 var12 = var3;
                              }
                           }
                        }
                     }

                     var8 = var8.n();
                     if (var8 != null) {
                        bmr var13 = var8.n;
                        if (var13 != null) {
                           var10 = var13.d;
                           continue;
                        }
                     }

                     var10 = null;
                  }

                  return;
               }
            }

            if (var6 instanceof bbr) {
               ej.u((bbr)var6);
               var3 = var5;
               break;
            }

            var3 = var5;
            if ((var6.q & 4096) == 0) {
               break;
            }

            var3 = var5;
            if (!(var6 instanceof blh)) {
               break;
            }

            var4 = ((blh)var6).A;

            for(var3 = var5; var4 != null; var1 = var2) {
               var11 = var6;
               axf var7 = var3;
               var2 = var1;
               if ((var4.q & 4096) != 0) {
                  var2 = var1 + 1;
                  if (var2 == 1) {
                     var11 = var4;
                     var7 = var3;
                  } else {
                     var5 = var3;
                     if (var3 == null) {
                        var5 = new axf(new bba[16]);
                     }

                     if (var6 != null) {
                        var5.p(var6);
                     }

                     var5.p(var4);
                     var3 = null;
                     var7 = var5;
                     var11 = var3;
                  }
               }

               var4 = var4.t;
               var6 = var11;
               var3 = var7;
            }

            var5 = var3;
         } while(var1 == 1);

         var6 = jj.f(var3);
         var5 = var3;
      }
   }

   public final void i(bcc var1) {
      var1.getClass();
      this.c = var1;
   }

   public final aki j() {
      return (aki)jj.n(this, biw.a);
   }
}
