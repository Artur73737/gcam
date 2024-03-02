import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import com.google.android.libraries.lens.lenslite.dynamicloading.LjhL.gThp;
import java.util.Set;

public final class bbu {
   public final bcd a = new bcd();
   public final bbb b;
   public bxy c;
   public final fwf d;

   public bbu(qvt var1) {
      this.d = new fwf(var1);
      this.b = new FocusOwnerImpl$modifier$1(this);
   }

   public final bxy a() {
      bxy var1 = this.c;
      if (var1 != null) {
         return var1;
      } else {
         qwp.b("layoutDirection");
         return null;
      }
   }

   public final void b(boolean var1) {
      this.c(var1, true);
   }

   public final void c(boolean var1, boolean var2) {
      bcc var4;
      if (!var1) {
         int var3 = ej.q(this.a, 8);
         var4 = bcc.a;
         if (var3 == 0) {
            throw null;
         }

         switch(var3 - 1) {
         case 1:
         case 2:
         case 3:
            return;
         }
      }

      bcd var5 = this.a;
      var4 = var5.c;
      if (ej.n(var5, var1, var2)) {
         var5 = this.a;
         bcc var6 = bcc.a;
         switch(var4.ordinal()) {
         case 0:
         case 1:
         case 2:
            var4 = bcc.a;
            break;
         case 3:
            var4 = bcc.d;
            break;
         default:
            throw new qse();
         }

         var5.i(var4);
      }

   }

   public final void d(bcd var1) {
      fwf var2 = this.d;
      var2.g((Set)var2.a, var1);
   }

   public final boolean e(int var1) {
      bcd var8 = ej.j(this.a);
      boolean var5 = false;
      if (var8 == null) {
         return false;
      } else {
         bxy var6 = this.a();
         var6.getClass();
         boolean var4 = c.n(var1, 1);
         bbv var9 = var8.d();
         byte var2 = 4;
         bcc var7;
         Object var17;
         if (var4) {
            var17 = ((bbw)var9).b;
         } else if (c.n(var1, 2)) {
            var17 = ((bbw)var9).c;
         } else if (c.n(var1, 5)) {
            var17 = ((bbw)var9).d;
         } else if (c.n(var1, 6)) {
            var17 = ((bbw)var9).e;
         } else {
            bby var18;
            bby var19;
            if (c.n(var1, 3)) {
               var7 = bcc.a;
               switch(var6.ordinal()) {
               case 0:
                  var19 = ((bbw)var9).h;
                  break;
               case 1:
                  var19 = ((bbw)var9).i;
                  break;
               default:
                  throw new qse();
               }

               var18 = var19;
               if (var19 == bby.a) {
                  var18 = null;
               }

               var17 = var18;
               if (var18 == null) {
                  var17 = ((bbw)var9).f;
               }
            } else if (c.n(var1, 4)) {
               var7 = bcc.a;
               switch(var6.ordinal()) {
               case 0:
                  var19 = ((bbw)var9).i;
                  break;
               case 1:
                  var19 = ((bbw)var9).h;
                  break;
               default:
                  throw new qse();
               }

               var18 = var19;
               if (var19 == bby.a) {
                  var18 = null;
               }

               var17 = var18;
               if (var18 == null) {
                  var17 = ((bbw)var9).g;
               }
            } else if (c.n(var1, 7)) {
               var17 = ((bbw)var9).j.eo(bbp.a(var1));
            } else {
               if (!c.n(var1, 8)) {
                  IllegalStateException var32 = new IllegalStateException(gThp.PrBGdCGQDlfv);
                  throw var32;
               }

               var17 = ((bbw)var9).k.eo(bbp.a(var1));
            }
         }

         if (var17 != bby.a) {
            return var17 != bby.b && ((bby)var17).a();
         } else {
            qwv var13 = new qwv();
            bcd var14 = this.a;
            var6 = this.a();
            atd var15 = new atd(var8, var1, var13, 3);
            var6.getClass();
            if (!c.n(var1, 1) && !c.n(var1, 2)) {
               if (!c.n(var1, 3) && !c.n(var1, 4) && !c.n(var1, 5) && !c.n(var1, 6)) {
                  bcd var26;
                  if (c.n(var1, 7)) {
                     var7 = bcc.a;
                     switch(var6.ordinal()) {
                     case 1:
                        var2 = 3;
                     case 0:
                        var26 = ej.j(var14);
                        if (var26 != null) {
                           var4 = er.l(var26, var2, var15);
                        } else {
                           var4 = false;
                        }
                        break;
                     default:
                        throw new qse();
                     }
                  } else {
                     if (!c.n(var1, 8)) {
                        StringBuilder var25 = new StringBuilder();
                        var25.append("Focus search invoked with invalid FocusDirection ");
                        String var31 = bbp.b(var1);
                        var25.append(var31);
                        throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(var31));
                     }

                     label232: {
                        bcd var23 = ej.j(var14);
                        if (var23 != null) {
                           bba var27 = var23.p;
                           if (!var27.y) {
                              throw new IllegalStateException("visitAncestors called on an unattached node");
                           }

                           var27 = var27.s;
                           bmd var11 = jj.h(var23);

                           label229:
                           while(true) {
                              while(true) {
                                 if (var11 == null) {
                                    break label229;
                                 }

                                 bba var24 = var27;
                                 if ((var11.n.e.r & 1024) != 0) {
                                    label220:
                                    for(; var24 != null; var24 = var24.s) {
                                       if ((var24.q & 1024) != 0) {
                                          bba var10 = var24;
                                          axf var21 = null;

                                          while(true) {
                                             int var3;
                                             axf var28;
                                             do {
                                                if (var10 == null) {
                                                   continue label220;
                                                }

                                                if (var10 instanceof bcd) {
                                                   var8 = (bcd)var10;
                                                   var28 = var21;
                                                   if (((bbw)var8.d()).a) {
                                                      var26 = var8;
                                                      break label232;
                                                   }
                                                   break;
                                                }

                                                var28 = var21;
                                                if ((var10.q & 1024) == 0) {
                                                   break;
                                                }

                                                var28 = var21;
                                                if (!(var10 instanceof blh)) {
                                                   break;
                                                }

                                                bba var20 = ((blh)var10).A;
                                                var3 = 0;

                                                int var16;
                                                for(var28 = var21; var20 != null; var3 = var16) {
                                                   bba var22 = var10;
                                                   axf var12 = var28;
                                                   var16 = var3;
                                                   if ((var20.q & 1024) != 0) {
                                                      var16 = var3 + 1;
                                                      if (var16 == 1) {
                                                         var22 = var20;
                                                         var12 = var28;
                                                      } else {
                                                         var21 = var28;
                                                         if (var28 == null) {
                                                            var21 = new axf(new bba[16]);
                                                         }

                                                         if (var10 != null) {
                                                            var21.p(var10);
                                                         }

                                                         var21.p(var20);
                                                         var6 = null;
                                                         var12 = var21;
                                                         var22 = var6;
                                                      }
                                                   }

                                                   var20 = var20.t;
                                                   var10 = var22;
                                                   var28 = var12;
                                                }

                                                var21 = var28;
                                             } while(var3 == 1);

                                             var10 = jj.f(var28);
                                             var21 = var28;
                                          }
                                       }
                                    }
                                 }

                                 var11 = var11.n();
                                 if (var11 != null) {
                                    bmr var29 = var11.n;
                                    if (var29 != null) {
                                       var27 = var29.d;
                                       continue;
                                    }
                                 }

                                 var27 = null;
                              }
                           }
                        }

                        var26 = null;
                     }

                     if (var26 != null) {
                        if (c.E(var26, var14)) {
                           var4 = false;
                        } else {
                           var4 = (Boolean)var15.eo(var26);
                        }
                     } else {
                        var4 = false;
                     }
                  }
               } else {
                  var4 = er.l(var14, var1, var15);
               }
            } else if (c.n(var1, 1)) {
               var4 = es.m(var14, var15);
            } else {
               if (!c.n(var1, 2)) {
                  throw new IllegalStateException("This function should only be used for 1-D focus search");
               }

               var4 = es.l(var14, var15);
            }

            if (!var13.a) {
               if (var4) {
                  var4 = true;
                  return var4;
               }

               var7 = this.a.c;
               bcc var30 = bcc.a;
               switch(var7.ordinal()) {
               case 0:
               case 1:
               case 2:
                  if (this.a.c.a()) {
                     var4 = var5;
                     return var4;
                  }

                  if (c.n(var1, 1) || c.n(var1, 2)) {
                     this.b(false);
                     if (!this.a.c.a()) {
                        var4 = var5;
                        return var4;
                     }

                     if (this.e(var1)) {
                        return true;
                     }
                  }
               case 3:
                  break;
               default:
                  throw new qse();
               }
            }

            var4 = var5;
            return var4;
         }
      }
   }
}
