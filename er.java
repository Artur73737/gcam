import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EdgeEffect;
import java.util.Locale;

public class er {
   static int a(Configuration var0) {
      return var0.getLayoutDirection();
   }

   static Context b(Context var0, Configuration var1) {
      return var0.createConfigurationContext(var1);
   }

   static void c(Configuration var0, Locale var1) {
      var0.setLayoutDirection(var1);
   }

   static void d(View var0, int var1) {
      var0.setLayoutDirection(var1);
   }

   static void e(Configuration var0, Locale var1) {
      var0.setLocale(var1);
   }

   public static EdgeEffect g(Context var0) {
      return abh.a.c(var0, (AttributeSet)null);
   }

   public static float h(EdgeEffect var0) {
      var0.getClass();
      return abh.a.a(var0);
   }

   public static float i(EdgeEffect var0, float var1, float var2) {
      return abh.a.b(var0, var1, var2);
   }

   public static bcj j(bch var0) {
      return new bcj(var0.a, var0.b, var0.c, var0.d);
   }

   public static String k(float var0) {
      int var4 = Math.max(1, 0);
      float var1 = (float)Math.pow(10.0D, (double)var4);
      var0 *= var1;
      int var3 = (int)var0;
      int var2 = var3;
      if (var0 - (float)var3 >= 0.5F) {
         var2 = var3 + 1;
      }

      var0 = (float)var2 / var1;
      String var5;
      if (var4 > 0) {
         var5 = String.valueOf(var0);
      } else {
         var5 = String.valueOf((int)var0);
      }

      return var5;
   }

   public static Boolean l(bcd var0, int var1, qvt var2) {
      bcc var4 = var0.c;
      bcc var5 = bcc.a;
      int var3 = var4.ordinal();
      Object var7 = false;
      switch(var3) {
      case 0:
      case 2:
         return m(var0, var1, var2);
      case 1:
         bcd var6 = ej.k(var0);
         if (var6 != null) {
            switch(var6.c.ordinal()) {
            case 0:
            case 2:
               return t(var0, var6, var1, var2);
            case 1:
               Boolean var8 = l(var6, var1, var2);
               if (c.E(var8, var7)) {
                  if (var6.c == bcc.b) {
                     bcd var9 = ej.j(var6);
                     if (var9 != null) {
                        return t(var0, var9, var1, var2);
                     }

                     throw new IllegalStateException("ActiveParent must have a focusedChild");
                  }

                  throw new IllegalStateException("Searching for active node in inactive hierarchy");
               }

               return var8;
            case 3:
               throw new IllegalStateException("ActiveParent must have a focusedChild");
            default:
               throw new qse();
            }
         }

         throw new IllegalStateException("ActiveParent must have a focusedChild");
      case 3:
         if (((bbw)var0.d()).a) {
            var7 = var2.eo(var0);
         }

         return (Boolean)var7;
      default:
         throw new qse();
      }
   }

   public static boolean m(bcd var0, int var1, qvt var2) {
      axf var6 = new axf(new bcd[16]);
      q(var0, var6);
      if (var6.b <= 1) {
         Object var8;
         if (var6.m()) {
            var8 = null;
         } else {
            var8 = var6.a[0];
         }

         var0 = (bcd)var8;
         return var0 != null ? (Boolean)var2.eo(var0) : false;
      } else {
         int var5 = var1;
         if (c.n(var1, 7)) {
            var5 = 4;
         }

         float var3;
         float var4;
         bcj var7;
         if (!c.n(var5, 4) && !c.n(var5, 6)) {
            if (!c.n(var5, 3) && !c.n(var5, 5)) {
               throw new IllegalStateException("This function should only be used for 2-D focus search");
            }

            var7 = ej.l(var0);
            var3 = var7.d;
            var4 = var7.e;
            var7 = new bcj(var3, var4, var3, var4);
         } else {
            var7 = ej.l(var0);
            var3 = var7.b;
            var4 = var7.c;
            var7 = new bcj(var3, var4, var3, var4);
         }

         var0 = p(var6, var7, var5);
         return var0 != null ? (Boolean)var2.eo(var0) : false;
      }
   }

   public static boolean n(bcd var0, bcd var1, int var2, qvt var3) {
      axf var10 = new axf(new bcd[16]);
      bba var12 = var0.p;
      if (!var12.y) {
         IllegalStateException var14 = new IllegalStateException("visitChildren called on an unattached node");
         throw var14;
      } else {
         axf var11 = new axf(new bba[16]);
         bba var6 = var12.t;
         if (var6 == null) {
            jj.j(var11, var12);
         } else {
            var11.p(var6);
         }

         while(true) {
            label92:
            while(var11.n()) {
               var12 = (bba)var11.c(var11.b - 1);
               var6 = var12;
               if ((var12.r & 1024) == 0) {
                  jj.j(var11, var12);
               } else {
                  while(var6 != null) {
                     if ((var6.q & 1024) != 0) {
                        axf var7 = null;

                        while(true) {
                           int var5;
                           axf var13;
                           do {
                              if (var6 == null) {
                                 continue label92;
                              }

                              if (var6 instanceof bcd) {
                                 var10.p((bcd)var6);
                                 var13 = var7;
                                 break;
                              }

                              var13 = var7;
                              if ((var6.q & 1024) == 0) {
                                 break;
                              }

                              var13 = var7;
                              if (!(var6 instanceof blh)) {
                                 break;
                              }

                              var12 = ((blh)var6).A;
                              var5 = 0;
                              bba var9 = var6;
                              var6 = var12;

                              bba var15;
                              for(var13 = var7; var6 != null; var9 = var15) {
                                 axf var8 = var13;
                                 int var4 = var5;
                                 var15 = var9;
                                 if ((var6.q & 1024) != 0) {
                                    var4 = var5 + 1;
                                    if (var4 == 1) {
                                       var15 = var6;
                                       var8 = var13;
                                    } else {
                                       var8 = var13;
                                       if (var13 == null) {
                                          var8 = new axf(new bba[16]);
                                       }

                                       if (var9 != null) {
                                          var8.p(var9);
                                       }

                                       var8.p(var6);
                                       var15 = null;
                                    }
                                 }

                                 var6 = var6.t;
                                 var13 = var8;
                                 var5 = var4;
                              }

                              var7 = var13;
                              var6 = var9;
                           } while(var5 == 1);

                           var6 = jj.f(var13);
                           var7 = var13;
                        }
                     }

                     var6 = var6.t;
                  }
               }
            }

            while(var10.n()) {
               var0 = p(var10, ej.l(var1), var2);
               if (var0 == null) {
                  return false;
               }

               if (((bbw)var0.d()).a) {
                  return (Boolean)var3.eo(var0);
               }

               if (t(var0, var1, var2, var3)) {
                  return true;
               }

               var10.o(var0);
            }

            return false;
         }
      }
   }

   private static long o(int var0, bcj var1, bcj var2) {
      long var4 = (long)Math.abs(v(var2, var0, var1));
      float var3;
      if (!c.n(var0, 3) && !c.n(var0, 4)) {
         if (!c.n(var0, 5) && !c.n(var0, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
         }

         var3 = var1.b + var1.b() / 2.0F - (var2.b + var2.b() / 2.0F);
      } else {
         var3 = var1.c + var1.a() / 2.0F - (var2.c + var2.a() / 2.0F);
      }

      long var6 = (long)Math.abs(var3);
      return 13L * var4 * var4 + var6 * var6;
   }

   private static bcd p(axf var0, bcj var1, int var2) {
      bcj var6;
      if (c.n(var2, 3)) {
         var6 = var1.f(var1.b() + 1.0F, 0.0F);
      } else if (c.n(var2, 4)) {
         var6 = var1.f(-(var1.b() + 1.0F), 0.0F);
      } else if (c.n(var2, 5)) {
         var6 = var1.f(0.0F, var1.a() + 1.0F);
      } else {
         if (!c.n(var2, 6)) {
            IllegalStateException var13 = new IllegalStateException("This function should only be used for 2-D focus search");
            throw var13;
         }

         var6 = var1.f(0.0F, -(var1.a() + 1.0F));
      }

      int var5 = var0.b;
      bcj var8 = null;
      bcd var7 = null;
      bcd var12;
      if (var5 > 0) {
         Object[] var11 = var0.a;
         int var3 = 0;

         int var4;
         do {
            bcd var10 = (bcd)var11[var3];
            var8 = var6;
            var12 = var7;
            if (ej.m(var10)) {
               bcj var9 = ej.l(var10);
               if (!u(var9, var2, var1)) {
                  var8 = var6;
                  var12 = var7;
               } else {
                  label56: {
                     if (u(var6, var2, var1) && !r(var1, var9, var6, var2)) {
                        var8 = var6;
                        var12 = var7;
                        if (r(var1, var6, var9, var2)) {
                           break label56;
                        }

                        var8 = var6;
                        var12 = var7;
                        if (o(var2, var1, var9) >= o(var2, var1, var6)) {
                           break label56;
                        }
                     }

                     var12 = var10;
                     var8 = var9;
                  }
               }
            }

            var4 = var3 + 1;
            var6 = var8;
            var7 = var12;
            var3 = var4;
         } while(var4 < var5);
      } else {
         var12 = var8;
      }

      return var12;
   }

   private static void q(blg var0, axf var1) {
      bba var9 = ((bba)var0).p;
      if (!var9.y) {
         IllegalStateException var11 = new IllegalStateException("visitChildren called on an unattached node");
         throw var11;
      } else {
         axf var8 = new axf(new bba[16]);
         bba var4 = var9.t;
         if (var4 == null) {
            jj.j(var8, var9);
         } else {
            var8.p(var4);
         }

         while(true) {
            label80:
            while(var8.n()) {
               var9 = (bba)var8.c(var8.b - 1);
               var4 = var9;
               if ((var9.r & 1024) == 0) {
                  jj.j(var8, var9);
               } else {
                  while(var4 != null) {
                     if ((var4.q & 1024) != 0) {
                        axf var5 = null;

                        while(true) {
                           int var3;
                           axf var10;
                           do {
                              if (var4 == null) {
                                 continue label80;
                              }

                              if (var4 instanceof bcd) {
                                 bcd var13 = (bcd)var4;
                                 var10 = var5;
                                 if (var13.y) {
                                    if (((bbw)var13.d()).a) {
                                       var1.p(var13);
                                       var10 = var5;
                                    } else {
                                       q(var13, var1);
                                       var10 = var5;
                                    }
                                 }
                                 break;
                              }

                              var10 = var5;
                              if ((var4.q & 1024) == 0) {
                                 break;
                              }

                              var10 = var5;
                              if (!(var4 instanceof blh)) {
                                 break;
                              }

                              var9 = ((blh)var4).A;
                              var3 = 0;
                              bba var7 = var4;
                              var4 = var9;

                              bba var12;
                              for(var10 = var5; var4 != null; var7 = var12) {
                                 axf var6 = var10;
                                 int var2 = var3;
                                 var12 = var7;
                                 if ((var4.q & 1024) != 0) {
                                    var2 = var3 + 1;
                                    if (var2 == 1) {
                                       var12 = var4;
                                       var6 = var10;
                                    } else {
                                       var6 = var10;
                                       if (var10 == null) {
                                          var6 = new axf(new bba[16]);
                                       }

                                       if (var7 != null) {
                                          var6.p(var7);
                                       }

                                       var6.p(var4);
                                       var12 = null;
                                    }
                                 }

                                 var4 = var4.t;
                                 var10 = var6;
                                 var3 = var2;
                              }

                              var5 = var10;
                              var4 = var7;
                           } while(var3 == 1);

                           var4 = jj.f(var10);
                           var5 = var10;
                        }
                     }

                     var4 = var4.t;
                  }
               }
            }

            return;
         }
      }
   }

   private static boolean r(bcj var0, bcj var1, bcj var2, int var3) {
      boolean var8 = s(var2, var3, var0);
      boolean var7 = false;
      if (!var8 && s(var1, var3, var0)) {
         label62: {
            if (c.n(var3, 3)) {
               if (!(var0.b >= var2.d)) {
                  break label62;
               }
            } else if (c.n(var3, 4)) {
               if (!(var0.d <= var2.b)) {
                  break label62;
               }
            } else if (c.n(var3, 5)) {
               if (!(var0.c >= var2.e)) {
                  break label62;
               }
            } else {
               if (!c.n(var3, 6)) {
                  throw new IllegalStateException("This function should only be used for 2-D focus search");
               }

               if (!(var0.e <= var2.c)) {
                  break label62;
               }
            }

            if (!c.n(var3, 3)) {
               if (c.n(var3, 4)) {
                  var7 = true;
               } else {
                  float var6 = v(var1, var3, var0);
                  float var4;
                  if (c.n(var3, 3)) {
                     var4 = var0.b - var2.b;
                  } else {
                     label69: {
                        float var5;
                        if (c.n(var3, 4)) {
                           var4 = var2.d;
                           var5 = var0.d;
                        } else {
                           if (c.n(var3, 5)) {
                              var4 = var0.c - var2.c;
                              break label69;
                           }

                           if (!c.n(var3, 6)) {
                              throw new IllegalStateException("This function should only be used for 2-D focus search");
                           }

                           var4 = var2.e;
                           var5 = var0.e;
                        }

                        var4 -= var5;
                     }
                  }

                  if (var6 < Math.max(1.0F, var4)) {
                     return true;
                  }
               }

               return var7;
            }
         }

         var7 = true;
      }

      return var7;
   }

   private static boolean s(bcj var0, int var1, bcj var2) {
      if (!c.n(var1, 3) && !c.n(var1, 4)) {
         if (!c.n(var1, 5) && !c.n(var1, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
         }

         if (var0.d > var2.b && var0.b < var2.d) {
            return true;
         }
      } else if (var0.e > var2.c && var0.c < var2.e) {
         return true;
      }

      return false;
   }

   private static boolean t(bcd var0, bcd var1, int var2, qvt var3) {
      if (n(var0, var1, var2, var3)) {
         return true;
      } else {
         Boolean var4 = (Boolean)ej.w(var0, var2, new bcf(var0, var1, var2, var3, 0));
         return var4 != null ? var4 : false;
      }
   }

   private static boolean u(bcj var0, int var1, bcj var2) {
      float var3;
      float var4;
      if (c.n(var1, 3)) {
         var3 = var2.d;
         var4 = var0.d;
         if ((var3 > var4 || var2.b >= var4) && var2.b > var0.b) {
            return true;
         }
      } else if (c.n(var1, 4)) {
         var3 = var2.b;
         var4 = var0.b;
         if ((var3 < var4 || var2.d <= var4) && var2.d < var0.d) {
            return true;
         }
      } else if (c.n(var1, 5)) {
         var4 = var2.e;
         var3 = var0.e;
         if ((var4 > var3 || var2.c >= var3) && var2.c > var0.c) {
            return true;
         }
      } else {
         if (!c.n(var1, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
         }

         var4 = var2.c;
         var3 = var0.c;
         if ((var4 < var3 || var2.e <= var3) && var2.e < var0.e) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static float v(bcj var0, int var1, bcj var2) {
      float var3;
      float var4;
      if (c.n(var1, 3)) {
         var3 = var2.b;
         var4 = var0.d;
      } else {
         if (c.n(var1, 4)) {
            var3 = var0.b - var2.d;
            return Math.max(0.0F, var3);
         }

         if (!c.n(var1, 5)) {
            if (!c.n(var1, 6)) {
               IllegalStateException var5 = new IllegalStateException("This function should only be used for 2-D focus search");
               throw var5;
            }

            var3 = var0.c - var2.e;
            return Math.max(0.0F, var3);
         }

         var3 = var2.c;
         var4 = var0.e;
      }

      var3 -= var4;
      return Math.max(0.0F, var3);
   }

   public EdgeEffect f(RecyclerView var1) {
      throw null;
   }
}
