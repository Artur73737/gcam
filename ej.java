import android.app.LocaleManager;
import android.os.LocaleList;
import androidx.compose.foundation.BackgroundElement;
import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.FocusableElement;
import androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1;
import androidx.compose.foundation.HoverableElement;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import com.google.android.material.appbar.XD.SSYOSt;
import java.util.Set;

public class ej {
   private static boolean A(bcd var0, bcd var1) {
      bba var7 = var1.p;
      if (!var7.y) {
         IllegalStateException var15 = new IllegalStateException("visitAncestors called on an unattached node");
         throw var15;
      } else {
         var7 = var7.s;
         bmd var12 = jj.h(var1);

         int var2;
         int var3;
         boolean var4;
         boolean var5;
         boolean var6;
         bba var8;
         bba var9;
         bba var10;
         axf var11;
         axf var13;
         Object var14;
         axf var16;
         axf var17;
         bmr var18;
         bba var19;
         label202:
         while(true) {
            var4 = false;
            var6 = false;
            var5 = false;
            var14 = null;
            if (var12 == null) {
               var7 = null;
               break;
            }

            var9 = var7;
            if ((var12.n.e.r & 1024) != 0) {
               label198:
               for(; var9 != null; var9 = var9.s) {
                  if ((var9.q & 1024) != 0) {
                     var8 = var9;
                     var11 = null;

                     while(true) {
                        do {
                           if (var8 == null) {
                              continue label198;
                           }

                           var7 = var8;
                           if (var8 instanceof bcd) {
                              break label202;
                           }

                           var16 = var11;
                           if ((var8.q & 1024) == 0) {
                              break;
                           }

                           var16 = var11;
                           if (!(var8 instanceof blh)) {
                              break;
                           }

                           var10 = ((blh)var8).A;
                           var3 = 0;
                           var16 = var11;

                           for(var19 = var8; var10 != null; var3 = var2) {
                              var8 = var19;
                              var13 = var16;
                              var2 = var3;
                              if ((var10.q & 1024) != 0) {
                                 var2 = var3 + 1;
                                 if (var2 == 1) {
                                    var8 = var10;
                                    var13 = var16;
                                 } else {
                                    var17 = var16;
                                    if (var16 == null) {
                                       var17 = new axf(new bba[16]);
                                    }

                                    if (var19 != null) {
                                       var17.p(var19);
                                    }

                                    var17.p(var10);
                                    var7 = null;
                                    var13 = var17;
                                    var8 = var7;
                                 }
                              }

                              var10 = var10.t;
                              var19 = var8;
                              var16 = var13;
                           }

                           var8 = var19;
                           var11 = var16;
                        } while(var3 == 1);

                        var8 = jj.f(var16);
                        var11 = var16;
                     }
                  }
               }
            }

            var12 = var12.n();
            if (var12 != null) {
               var18 = var12.n;
               if (var18 != null) {
                  var7 = var18.d;
                  continue;
               }
            }

            var7 = null;
         }

         if (!c.E(var7, var0)) {
            throw new IllegalStateException("Non child node cannot request focus.");
         } else {
            bcc var20 = var0.c;
            bcc var21 = bcc.a;
            switch(var20.ordinal()) {
            case 0:
               D(var1);
               var0.i(bcc.b);
               v(var1);
               v(var0);
               return true;
            case 1:
               y(var0);
               if (s(var0)) {
                  D(var1);
                  var5 = true;
               } else {
                  var5 = var4;
               }

               var4 = var5;
               if (var5) {
                  v(var1);
                  return true;
               }
               break;
            case 2:
               var4 = var6;
               break;
            case 3:
               var7 = var0.p;
               if (!var7.y) {
                  throw new IllegalStateException("visitAncestors called on an unattached node");
               }

               var7 = var7.s;
               var12 = jj.h(var0);

               label159:
               while(true) {
                  while(var12 != null) {
                     var9 = var7;
                     if ((var12.n.e.r & 1024) != 0) {
                        label150:
                        for(; var9 != null; var9 = var9.s) {
                           if ((var9.q & 1024) != 0) {
                              var8 = var9;
                              var11 = null;

                              while(true) {
                                 do {
                                    if (var8 == null) {
                                       continue label150;
                                    }

                                    if (var8 instanceof bcd) {
                                       break label159;
                                    }

                                    var16 = var11;
                                    if ((var8.q & 1024) == 0) {
                                       break;
                                    }

                                    var16 = var11;
                                    if (!(var8 instanceof blh)) {
                                       break;
                                    }

                                    var10 = ((blh)var8).A;
                                    var2 = 0;
                                    var16 = var11;

                                    for(var19 = var8; var10 != null; var2 = var3) {
                                       var8 = var19;
                                       var13 = var16;
                                       var3 = var2;
                                       if ((var10.q & 1024) != 0) {
                                          var3 = var2 + 1;
                                          if (var3 == 1) {
                                             var8 = var10;
                                             var13 = var16;
                                          } else {
                                             var17 = var16;
                                             if (var16 == null) {
                                                var17 = new axf(new bba[16]);
                                             }

                                             if (var19 != null) {
                                                var17.p(var19);
                                             }

                                             var17.p(var10);
                                             var7 = null;
                                             var13 = var17;
                                             var8 = var7;
                                          }
                                       }

                                       var10 = var10.t;
                                       var19 = var8;
                                       var16 = var13;
                                    }

                                    var8 = var19;
                                    var11 = var16;
                                 } while(var2 == 1);

                                 var8 = jj.f(var16);
                                 var11 = var16;
                              }
                           }
                        }
                     }

                     var12 = var12.n();
                     if (var12 != null) {
                        var18 = var12.n;
                        if (var18 != null) {
                           var7 = var18.d;
                           continue;
                        }
                     }

                     var7 = null;
                  }

                  var8 = (bba)var14;
                  break;
               }

               bcd var22 = (bcd)var8;
               if (var22 == null && B(var0)) {
                  var0.i(bcc.a);
                  v(var0);
                  var4 = A(var0, var1);
               } else {
                  var4 = var5;
                  if (var22 != null) {
                     var4 = var5;
                     if (A(var22, var0)) {
                        var4 = A(var0, var1);
                        if (var0.c != bcc.b) {
                           throw new IllegalStateException("Deactivated node is focused");
                        }
                     }
                  }
               }
               break;
            default:
               throw new qse();
            }

            return var4;
         }
      }
   }

   private static boolean B(bcd var0) {
      bmz var1 = var0.v;
      if (var1 != null) {
         boa var2 = var1.n.s;
         if (var2 != null) {
            return var2.requestFocus();
         }
      }

      throw new IllegalStateException(SSYOSt.gQrtpwXndygg);
   }

   private static int C(bcd var0, int var1) {
      Throwable var10000;
      label131: {
         boolean var10001;
         bby var3;
         Object var4;
         label134: {
            if (!var0.b) {
               var0.b = true;

               try {
                  var4 = ((bbw)var0.d()).j.eo(bbp.a(var1));
                  if (var4 != bby.a) {
                     var3 = bby.b;
                     break label134;
                  }
               } catch (Throwable var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label131;
               }

               var0.b = false;
            }

            return 1;
         }

         if (var4 == var3) {
            var0.b = false;
            return 2;
         }

         boolean var2;
         try {
            var2 = ((bby)var4).a();
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label131;
         }

         byte var11;
         if (!var2) {
            var11 = 4;
         } else {
            var11 = 3;
         }

         var0.b = false;
         return var11;
      }

      Throwable var12 = var10000;
      var0.b = false;
      throw var12;
   }

   private static void D(bcd var0) {
      jm.f(var0, new amp(var0, 12));
      bcc var2 = var0.c;
      bcc var1 = bcc.a;
      switch(var2.ordinal()) {
      case 1:
      case 3:
         var0.i(bcc.a);
         return;
      case 2:
      default:
      }
   }

   public static LocaleList a(Object var0) {
      return ((LocaleManager)var0).getApplicationLocales();
   }

   public static void b(Object var0, LocaleList var1) {
      ((LocaleManager)var0).setApplicationLocales(var1);
   }

   public static bbb h(bbb var0, long var1, bdr var3) {
      var3.getClass();
      return var0.g(new BackgroundElement(var1, var3));
   }

   // $FF: synthetic method
   public static bbb i(bbb var0, long var1) {
      return h(var0, var1, bdm.a);
   }

   public static bcd j(bcd var0) {
      bcc var3 = var0.c;
      bxy var4 = bxy.a;
      bcc var11 = bcc.a;
      axf var7;
      bba var8;
      bba var10;
      switch(var3.ordinal()) {
      case 0:
      case 2:
         return var0;
      case 1:
         var8 = var0.p;
         if (!var8.y) {
            throw new IllegalStateException("visitChildren called on an unattached node");
         }

         var7 = new axf(new bba[16]);
         var10 = var8.t;
         if (var10 == null) {
            jj.j(var7, var8);
         } else {
            var7.p(var10);
         }
         break;
      case 3:
         return null;
      default:
         throw new qse();
      }

      while(true) {
         label84:
         while(var7.n()) {
            var8 = (bba)var7.c(var7.b - 1);
            var10 = var8;
            if ((var8.r & 1024) == 0) {
               jj.j(var7, var8);
            } else {
               while(var10 != null) {
                  if ((var10.q & 1024) != 0) {
                     axf var12 = null;

                     while(true) {
                        int var2;
                        axf var9;
                        do {
                           if (var10 == null) {
                              continue label84;
                           }

                           if (var10 instanceof bcd) {
                              var0 = j((bcd)var10);
                              if (var0 != null) {
                                 return var0;
                              }

                              var9 = var12;
                              break;
                           }

                           var9 = var12;
                           if ((var10.q & 1024) == 0) {
                              break;
                           }

                           var9 = var12;
                           if (!(var10 instanceof blh)) {
                              break;
                           }

                           var8 = ((blh)var10).A;
                           var2 = 0;
                           bba var6 = var10;
                           var10 = var8;

                           bba var13;
                           for(var9 = var12; var10 != null; var6 = var13) {
                              axf var5 = var9;
                              int var1 = var2;
                              var13 = var6;
                              if ((var10.q & 1024) != 0) {
                                 var1 = var2 + 1;
                                 if (var1 == 1) {
                                    var13 = var10;
                                    var5 = var9;
                                 } else {
                                    var5 = var9;
                                    if (var9 == null) {
                                       var5 = new axf(new bba[16]);
                                    }

                                    if (var6 != null) {
                                       var5.p(var6);
                                    }

                                    var5.p(var10);
                                    var13 = null;
                                 }
                              }

                              var10 = var10.t;
                              var9 = var5;
                              var2 = var1;
                           }

                           var12 = var9;
                           var10 = var6;
                        } while(var2 == 1);

                        var10 = jj.f(var9);
                        var12 = var9;
                     }
                  }

                  var10 = var10.t;
               }
            }
         }

         return null;
      }
   }

   public static bcd k(bcd var0) {
      var0.getClass();
      bba var8 = var0.p;
      if (!var8.y) {
         return null;
      } else {
         axf var7 = new axf(new bba[16]);
         bba var3 = var8.t;
         if (var3 == null) {
            jj.j(var7, var8);
         } else {
            var7.p(var3);
         }

         while(true) {
            label78:
            while(var7.n()) {
               var8 = (bba)var7.c(var7.b - 1);
               bba var4 = var8;
               if ((var8.r & 1024) == 0) {
                  jj.j(var7, var8);
               } else {
                  while(var4 != null) {
                     if ((var4.q & 1024) != 0) {
                        axf var10 = null;

                        while(true) {
                           int var2;
                           axf var9;
                           label69:
                           do {
                              if (var4 == null) {
                                 continue label78;
                              }

                              if (var4 instanceof bcd) {
                                 var0 = (bcd)var4;
                                 bcc var11 = var0.c;
                                 bxy var12 = bxy.a;
                                 bcc var13 = bcc.a;
                                 switch(var11.ordinal()) {
                                 case 0:
                                 case 1:
                                 case 2:
                                    return var0;
                                 default:
                                    var9 = var10;
                                    break label69;
                                 }
                              }

                              var9 = var10;
                              if ((var4.q & 1024) == 0) {
                                 break;
                              }

                              var9 = var10;
                              if (!(var4 instanceof blh)) {
                                 break;
                              }

                              var8 = ((blh)var4).A;
                              var2 = 0;
                              bba var6 = var4;
                              var4 = var8;

                              for(var9 = var10; var4 != null; var6 = var3) {
                                 axf var5 = var9;
                                 int var1 = var2;
                                 var3 = var6;
                                 if ((var4.q & 1024) != 0) {
                                    var1 = var2 + 1;
                                    if (var1 == 1) {
                                       var3 = var4;
                                       var5 = var9;
                                    } else {
                                       var5 = var9;
                                       if (var9 == null) {
                                          var5 = new axf(new bba[16]);
                                       }

                                       if (var6 != null) {
                                          var5.p(var6);
                                       }

                                       var5.p(var4);
                                       var3 = null;
                                    }
                                 }

                                 var4 = var4.t;
                                 var9 = var5;
                                 var2 = var1;
                              }

                              var10 = var9;
                              var4 = var6;
                           } while(var2 == 1);

                           var4 = jj.f(var9);
                           var10 = var9;
                        }
                     }

                     var4 = var4.t;
                  }
               }
            }

            return null;
         }
      }
   }

   public static bcj l(bcd var0) {
      var0.getClass();
      bmz var1 = var0.v;
      return var1 != null ? iy.g(var1).h(var1, false) : bcj.a;
   }

   public static boolean m(bcd var0) {
      var0.getClass();
      bmz var1 = var0.v;
      if (var1 != null && var1.n.d()) {
         bmz var2 = var0.v;
         if (var2 != null && var2.n.ad()) {
            return true;
         }
      }

      return false;
   }

   public static boolean n(bcd var0, boolean var1, boolean var2) {
      bcc var5 = var0.c;
      bcc var4 = bcc.a;
      boolean var3;
      switch(var5.ordinal()) {
      case 0:
         var0.i(bcc.d);
         if (var2) {
            v(var0);
            return true;
         }

         var3 = true;
         break;
      case 1:
         if (z(var0, var1, var2)) {
            var0.i(bcc.d);
            if (var2) {
               v(var0);
               return true;
            }

            var3 = true;
         } else {
            var3 = false;
         }
         break;
      case 2:
         var3 = var1;
         if (var1) {
            var0.i(bcc.d);
            var3 = var1;
            if (var2) {
               v(var0);
               return true;
            }
         }
         break;
      case 3:
         var3 = true;
         break;
      default:
         throw new qse();
      }

      return var3;
   }

   public static boolean o(bcd var0) {
      bcc var7 = var0.c;
      bcc var6 = bcc.a;
      int var1 = var7.ordinal();
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = true;
      switch(var1) {
      case 0:
      case 2:
         v(var0);
         var3 = var5;
         break;
      case 1:
         if (s(var0)) {
            D(var0);
            var3 = true;
         }

         if (var3) {
            v(var0);
            return true;
         }
         break;
      case 3:
         bba var13 = var0.p;
         if (!var13.y) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
         }

         var13 = var13.s;
         bmd var11 = jj.h(var0);

         label110:
         while(true) {
            while(true) {
               var7 = null;
               if (var11 == null) {
                  var13 = var7;
                  break label110;
               }

               bba var8 = var13;
               if ((var11.n.e.r & 1024) != 0) {
                  label101:
                  for(; var8 != null; var8 = var8.s) {
                     if ((var8.q & 1024) != 0) {
                        bba var15 = var8;
                        axf var10 = null;

                        while(true) {
                           int var2;
                           axf var14;
                           do {
                              if (var15 == null) {
                                 continue label101;
                              }

                              if (var15 instanceof bcd) {
                                 var13 = var15;
                                 break label110;
                              }

                              var14 = var10;
                              if ((var15.q & 1024) == 0) {
                                 break;
                              }

                              var14 = var10;
                              if (!(var15 instanceof blh)) {
                                 break;
                              }

                              bba var9 = ((blh)var15).A;
                              var2 = 0;
                              var14 = var10;

                              bba var18;
                              for(var18 = var15; var9 != null; var2 = var1) {
                                 var15 = var18;
                                 axf var12 = var14;
                                 var1 = var2;
                                 if ((var9.q & 1024) != 0) {
                                    var1 = var2 + 1;
                                    if (var1 == 1) {
                                       var15 = var9;
                                       var12 = var14;
                                    } else {
                                       axf var16 = var14;
                                       if (var14 == null) {
                                          var16 = new axf(new bba[16]);
                                       }

                                       if (var18 != null) {
                                          var16.p(var18);
                                       }

                                       var16.p(var9);
                                       var6 = null;
                                       var12 = var16;
                                       var15 = var6;
                                    }
                                 }

                                 var9 = var9.t;
                                 var18 = var15;
                                 var14 = var12;
                              }

                              var15 = var18;
                              var10 = var14;
                           } while(var2 == 1);

                           var15 = jj.f(var14);
                           var10 = var14;
                        }
                     }
                  }
               }

               var11 = var11.n();
               if (var11 != null) {
                  bmr var17 = var11.n;
                  if (var17 != null) {
                     var13 = var17.d;
                     continue;
                  }
               }

               var13 = null;
            }
         }

         bcd var19 = (bcd)var13;
         if (var19 != null) {
            var3 = A(var19, var0);
         } else {
            if (B(var0)) {
               D(var0);
               var3 = true;
            } else {
               var3 = var4;
            }

            if (var3) {
               v(var0);
               return true;
            }
         }
         break;
      default:
         throw new qse();
      }

      return var3;
   }

   public static boolean p(bcd var0) {
      int var1 = r(var0, 7);
      bcc var2 = bcc.a;
      if (var1 != 0) {
         switch(var1 - 1) {
         case 0:
            return o(var0);
         case 1:
         case 3:
            return false;
         case 2:
            return true;
         default:
            throw new qse();
         }
      } else {
         throw null;
      }
   }

   public static int q(bcd var0, int var1) {
      bcc var7 = var0.c;
      bcc var6 = bcc.a;
      int var2 = var7.ordinal();
      byte var3 = 2;
      switch(var2) {
      case 0:
      case 3:
         return 1;
      case 1:
         int var4 = q(y(var0), var1);
         var2 = var4;
         if (var4 == 1) {
            var2 = 0;
         }

         if (var2 == 0) {
            byte var14;
            if (!var0.a) {
               var0.a = true;

               label167: {
                  Throwable var10000;
                  label187: {
                     Object var15;
                     bby var17;
                     boolean var10001;
                     try {
                        var15 = ((bbw)var0.d()).k.eo(bbp.a(var1));
                        if (var15 == bby.a) {
                           break label167;
                        }

                        var17 = bby.b;
                     } catch (Throwable var13) {
                        var10000 = var13;
                        var10001 = false;
                        break label187;
                     }

                     if (var15 == var17) {
                        var0.a = false;
                        var14 = var3;
                        return var14;
                     }

                     boolean var5;
                     try {
                        var5 = ((bby)var15).a();
                     } catch (Throwable var12) {
                        var10000 = var12;
                        var10001 = false;
                        break label187;
                     }

                     if (!var5) {
                        var14 = 4;
                     } else {
                        var14 = 3;
                     }

                     var0.a = false;
                     return var14;
                  }

                  Throwable var16 = var10000;
                  var0.a = false;
                  throw var16;
               }

               var0.a = false;
            }

            var14 = 1;
            return var14;
         }
         break;
      case 2:
         var2 = var3;
         break;
      default:
         throw new qse();
      }

      return var2;
   }

   public static int r(bcd var0, int var1) {
      bcc var5 = var0.c;
      bcc var6 = bcc.a;
      switch(var5.ordinal()) {
      case 0:
      case 2:
         return 1;
      case 1:
         return q(y(var0), var1);
      case 3:
         bba var14 = var0.p;
         if (!var14.y) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
         } else {
            var14 = var14.s;
            bmd var9 = jj.h(var0);
            bba var11 = var14;

            int var2;
            int var3;
            byte var4;
            label107:
            while(true) {
               var4 = 0;
               var5 = null;
               if (var9 == null) {
                  var11 = var5;
                  break;
               }

               bba var15 = var11;
               if ((var9.n.e.r & 1024) != 0) {
                  label103:
                  for(; var15 != null; var15 = var15.s) {
                     if ((var15.q & 1024) != 0) {
                        var14 = var15;
                        axf var8 = null;

                        while(true) {
                           axf var12;
                           do {
                              if (var14 == null) {
                                 continue label103;
                              }

                              if (var14 instanceof bcd) {
                                 var11 = var14;
                                 break label107;
                              }

                              var12 = var8;
                              if ((var14.q & 1024) == 0) {
                                 break;
                              }

                              var12 = var8;
                              if (!(var14 instanceof blh)) {
                                 break;
                              }

                              bba var7 = ((blh)var14).A;
                              var3 = 0;
                              var12 = var8;

                              bba var17;
                              for(var17 = var14; var7 != null; var3 = var2) {
                                 var14 = var17;
                                 axf var10 = var12;
                                 var2 = var3;
                                 if ((var7.q & 1024) != 0) {
                                    var2 = var3 + 1;
                                    if (var2 == 1) {
                                       var14 = var7;
                                       var10 = var12;
                                    } else {
                                       axf var16 = var12;
                                       if (var12 == null) {
                                          var16 = new axf(new bba[16]);
                                       }

                                       if (var17 != null) {
                                          var16.p(var17);
                                       }

                                       var16.p(var7);
                                       var0 = null;
                                       var10 = var16;
                                       var14 = var0;
                                    }
                                 }

                                 var7 = var7.t;
                                 var17 = var14;
                                 var12 = var10;
                              }

                              var14 = var17;
                              var8 = var12;
                           } while(var3 == 1);

                           var14 = jj.f(var12);
                           var8 = var12;
                        }
                     }
                  }
               }

               var9 = var9.n();
               if (var9 != null) {
                  bmr var13 = var9.n;
                  if (var13 != null) {
                     var11 = var13.d;
                     continue;
                  }
               }

               var11 = null;
            }

            var0 = (bcd)var11;
            if (var0 == null) {
               return 1;
            } else {
               switch(var0.c.ordinal()) {
               case 0:
                  return C(var0, var1);
               case 1:
                  return r(var0, var1);
               case 2:
                  var3 = 2;
                  break;
               case 3:
                  var2 = r(var0, var1);
                  if (var2 == 1) {
                     var2 = var4;
                  }

                  var3 = var2;
                  if (var2 == 0) {
                     return C(var0, var1);
                  }
                  break;
               default:
                  throw new qse();
               }

               return var3;
            }
         }
      default:
         throw new qse();
      }
   }

   // $FF: synthetic method
   static boolean s(bcd var0) {
      return z(var0, false, true);
   }

   public static bcb t(bbr var0) {
      var0.getClass();
      bba var6 = var0.n();
      axf var5 = null;

      while(true) {
         int var2;
         axf var3;
         label127:
         do {
            var2 = 0;
            int var1;
            bba var4;
            axf var7;
            bcc var12;
            if (var6 == null) {
               if (!var0.n().y) {
                  IllegalStateException var11 = new IllegalStateException("visitChildren called on an unattached node");
                  throw var11;
               }

               var7 = new axf(new bba[16]);
               bba var15 = var0.n().t;
               if (var15 == null) {
                  jj.j(var7, var0.n());
               } else {
                  var7.p(var15);
               }

               while(true) {
                  label107:
                  while(var7.n()) {
                     bba var8 = (bba)var7.c(var7.b - 1);
                     var4 = var8;
                     if ((var8.r & 1024) == 0) {
                        jj.j(var7, var8);
                     } else {
                        while(var4 != null) {
                           if ((var4.q & 1024) != 0) {
                              var3 = null;

                              while(true) {
                                 axf var9;
                                 label98:
                                 do {
                                    if (var4 == null) {
                                       continue label107;
                                    }

                                    if (var4 instanceof bcd) {
                                       var12 = ((bcd)var4).c;
                                       bcc var10 = bcc.a;
                                       switch(var12.ordinal()) {
                                       case 0:
                                       case 1:
                                       case 2:
                                          return var12;
                                       default:
                                          var9 = var3;
                                          break label98;
                                       }
                                    }

                                    var9 = var3;
                                    if ((var4.q & 1024) == 0) {
                                       break;
                                    }

                                    var9 = var3;
                                    if (!(var4 instanceof blh)) {
                                       break;
                                    }

                                    var8 = ((blh)var4).A;
                                    var1 = 0;
                                    var6 = var4;
                                    var4 = var8;

                                    for(var9 = var3; var4 != null; var6 = var15) {
                                       var5 = var9;
                                       var2 = var1;
                                       var15 = var6;
                                       if ((var4.q & 1024) != 0) {
                                          var2 = var1 + 1;
                                          if (var2 == 1) {
                                             var15 = var4;
                                             var5 = var9;
                                          } else {
                                             var5 = var9;
                                             if (var9 == null) {
                                                var5 = new axf(new bba[16]);
                                             }

                                             if (var6 != null) {
                                                var5.p(var6);
                                             }

                                             var5.p(var4);
                                             var15 = null;
                                          }
                                       }

                                       var4 = var4.t;
                                       var9 = var5;
                                       var1 = var2;
                                    }

                                    var3 = var9;
                                    var4 = var6;
                                 } while(var1 == 1);

                                 var4 = jj.f(var9);
                                 var3 = var9;
                              }
                           }

                           var4 = var4.t;
                        }
                     }
                  }

                  return bcc.d;
               }
            }

            if (var6 instanceof bcd) {
               var12 = ((bcd)var6).c;
               bcc var13 = bcc.a;
               switch(var12.ordinal()) {
               case 0:
               case 1:
               case 2:
                  return var12;
               default:
                  var3 = var5;
                  break label127;
               }
            }

            var3 = var5;
            if ((var6.q & 1024) == 0) {
               break;
            }

            var3 = var5;
            if (!(var6 instanceof blh)) {
               break;
            }

            var4 = ((blh)var6).A;

            for(var3 = var5; var4 != null; var2 = var1) {
               bba var14 = var6;
               var7 = var3;
               var1 = var2;
               if ((var4.q & 1024) != 0) {
                  var1 = var2 + 1;
                  if (var1 == 1) {
                     var14 = var4;
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
                     var14 = var3;
                  }
               }

               var4 = var4.t;
               var6 = var14;
               var3 = var7;
            }

            var5 = var3;
         } while(var2 == 1);

         var6 = jj.f(var3);
         var5 = var3;
      }
   }

   public static void u(bbr var0) {
      fwf var1 = jj.k(var0).w.d;
      var1.g((Set)var1.b, var0);
   }

   public static void v(bcd var0) {
      var0.getClass();
      bba var9 = var0.p;
      if (!var9.y) {
         IllegalStateException var14 = new IllegalStateException("visitAncestors called on an unattached node");
         throw var14;
      } else {
         bmd var7 = jj.h(var0);
         bba var10 = var9;

         while(var7 != null) {
            bba var3 = var10;
            if ((var7.n.e.r & 5120) != 0) {
               label87:
               for(; var3 != null; var3 = var3.s) {
                  int var1 = var3.q;
                  if ((var1 & 5120) != 0) {
                     if (var3 != var9 && (var1 & 1024) != 0) {
                        return;
                     }

                     if ((var1 & 4096) != 0) {
                        bba var6 = var3;
                        axf var5 = null;

                        while(true) {
                           int var2;
                           axf var11;
                           do {
                              if (var6 == null) {
                                 continue label87;
                              }

                              if (var6 instanceof bbr) {
                                 bbr var12 = (bbr)var6;
                                 var12.d(t(var12));
                                 var11 = var5;
                                 break;
                              }

                              var11 = var5;
                              if ((var6.q & 4096) == 0) {
                                 break;
                              }

                              var11 = var5;
                              if (!(var6 instanceof blh)) {
                                 break;
                              }

                              bba var4 = ((blh)var6).A;
                              var2 = 0;

                              for(var11 = var5; var4 != null; var2 = var1) {
                                 bba var15 = var6;
                                 axf var8 = var11;
                                 var1 = var2;
                                 if ((var4.q & 4096) != 0) {
                                    var1 = var2 + 1;
                                    if (var1 == 1) {
                                       var15 = var4;
                                       var8 = var11;
                                    } else {
                                       var5 = var11;
                                       if (var11 == null) {
                                          var5 = new axf(new bba[16]);
                                       }

                                       if (var6 != null) {
                                          var5.p(var6);
                                       }

                                       var5.p(var4);
                                       var0 = null;
                                       var8 = var5;
                                       var15 = var0;
                                    }
                                 }

                                 var4 = var4.t;
                                 var6 = var15;
                                 var11 = var8;
                              }

                              var5 = var11;
                           } while(var2 == 1);

                           var6 = jj.f(var11);
                           var5 = var11;
                        }
                     }
                  }
               }
            }

            var7 = var7.n();
            if (var7 != null) {
               bmr var13 = var7.n;
               if (var13 != null) {
                  var10 = var13.d;
                  continue;
               }
            }

            var10 = null;
         }

      }
   }

   public static Object w(bcd var0, int var1, qvt var2) {
      var0.getClass();
      bba var6 = var0.p;
      if (!var6.y) {
         IllegalStateException var19 = new IllegalStateException("visitAncestors called on an unattached node");
         throw var19;
      } else {
         var6 = var6.s;
         bmd var11 = jj.h(var0);

         int var3;
         int var4;
         byte var5;
         bba var7;
         Object var13;
         Object var14;
         label146:
         while(true) {
            var5 = 1;
            var14 = null;
            var13 = null;
            if (var11 == null) {
               var7 = null;
               break;
            }

            bba var8 = var6;
            if ((var11.n.e.r & 1024) != 0) {
               label142:
               for(; var8 != null; var8 = var8.s) {
                  if ((var8.q & 1024) != 0) {
                     var7 = var8;
                     axf var10 = null;

                     while(true) {
                        axf var20;
                        do {
                           if (var7 == null) {
                              continue label142;
                           }

                           if (var7 instanceof bcd) {
                              break label146;
                           }

                           var20 = var10;
                           if ((var7.q & 1024) == 0) {
                              break;
                           }

                           var20 = var10;
                           if (!(var7 instanceof blh)) {
                              break;
                           }

                           bba var9 = ((blh)var7).A;
                           var4 = 0;
                           var20 = var10;

                           bba var25;
                           for(var25 = var7; var9 != null; var4 = var3) {
                              var7 = var25;
                              axf var12 = var20;
                              var3 = var4;
                              if ((var9.q & 1024) != 0) {
                                 var3 = var4 + 1;
                                 if (var3 == 1) {
                                    var7 = var9;
                                    var12 = var20;
                                 } else {
                                    axf var21 = var20;
                                    if (var20 == null) {
                                       var21 = new axf(new bba[16]);
                                    }

                                    if (var25 != null) {
                                       var21.p(var25);
                                    }

                                    var21.p(var9);
                                    var6 = null;
                                    var12 = var21;
                                    var7 = var6;
                                 }
                              }

                              var9 = var9.t;
                              var25 = var7;
                              var20 = var12;
                           }

                           var7 = var25;
                           var10 = var20;
                        } while(var4 == 1);

                        var7 = jj.f(var20);
                        var10 = var20;
                     }
                  }
               }
            }

            var11 = var11.n();
            if (var11 != null) {
               bmr var22 = var11.n;
               if (var22 != null) {
                  var6 = var22.d;
                  continue;
               }
            }

            var6 = null;
         }

         bcd var23 = (bcd)var7;
         if (var23 != null && c.E(var23.j(), var0.j())) {
            return null;
         } else {
            aki var24 = var0.j();
            Object var15;
            if (var24 != null) {
               byte var17;
               if (c.n(var1, 5)) {
                  var17 = 5;
               } else if (c.n(var1, 6)) {
                  var17 = 6;
               } else if (c.n(var1, 3)) {
                  var17 = 3;
               } else if (c.n(var1, 4)) {
                  var17 = 4;
               } else if (c.n(var1, 1)) {
                  var17 = 2;
               } else {
                  if (!c.n(var1, 2)) {
                     throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                  }

                  var17 = var5;
               }

               if (var24.c.aK() > 0 && !((ajz)var24.c.a).g().b().isEmpty()) {
                  if (var24.c(var17)) {
                     lmk var16 = var24.c;
                     var3 = Math.min(var16.aK() - 1, ((ajq)pwm.ax(((ajz)var16.a).g().b())).a);
                  } else {
                     var3 = Math.max(0, ((ajz)var24.c.a).e());
                  }

                  qwz var26 = new qwz();
                  var26.a = var24.b.aH(var3, var3);

                  for(var15 = var13; var15 == null && var24.b((akf)var26.a, var17); var15 = var2.eo(new akh(var24, var26, var17))) {
                     akf var18 = (akf)var26.a;
                     var4 = var18.a;
                     var3 = var18.b;
                     if (var24.c(var17)) {
                        ++var3;
                     } else {
                        --var4;
                     }

                     var18 = var24.b.aH(var4, var3);
                     var24.b.aI((akf)var26.a);
                     var26.a = var18;
                     var24.c.aL();
                  }

                  var24.b.aI((akf)var26.a);
                  var24.c.aL();
               } else {
                  var15 = var2.eo(aki.a);
               }
            } else {
               var15 = var14;
            }

            return var15;
         }
      }
   }

   // $FF: synthetic method
   public static bbb x(bbb var0, lmk var1, aci var2, boolean var3, bri var4, qvi var5, int var6) {
      var1.getClass();
      bay var8 = bbb.d;
      var8.getClass();
      boolean var7 = false;
      bbb var11 = dq.m(var8, new ack(var2, var1, 0));
      if ((var6 & 4) == 0) {
         var7 = true;
      }

      var3 |= var7 ^ true;
      Object var10;
      if (var3) {
         var10 = new HoverableElement(var1);
      } else {
         var10 = bbb.d;
      }

      bbb var9 = var11.g((bbb)var10);
      FocusableKt$FocusableInNonTouchModeElement$1 var12 = abv.a;
      if (var3) {
         var10 = bax.a(new FocusableElement(var1), FocusTargetNode$FocusTargetElement.a);
      } else {
         var10 = bbb.d;
      }

      if ((var6 & 16) != 0) {
         var4 = null;
      }

      return bpr.a(var0, bpr.a(var9, bax.a(var12, (bbb)var10)).g(new ClickableElement(var1, var3, var4, var5)));
   }

   private static bcd y(bcd var0) {
      var0 = k(var0);
      if (var0 != null) {
         return var0;
      } else {
         throw new IllegalArgumentException("ActiveParent with no focused child");
      }
   }

   private static boolean z(bcd var0, boolean var1, boolean var2) {
      var0 = k(var0);
      return var0 != null ? n(var0, var1, var2) : true;
   }

   public void c() {
   }

   public void d(int var1, int var2) {
   }

   public void e(int var1, int var2) {
   }

   public void f() {
   }

   public void g(int var1, Object var2) {
      this.f();
   }
}
