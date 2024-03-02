import java.util.List;

public final class awi extends awu {
   public static final awi a = new awi();

   private awi() {
      super(0, 3, 1);
   }

   public final void b(aww var1, asf var2, auw var3, asv var4) {
      asw var14 = (asw)var1.c(0);
      ast var260 = (ast)var1.c(1);
      ezu var263 = (ezu)var1.c(2);
      aut var15 = new aut();
      auw var257 = var15.b();

      int var5;
      int var6;
      int var8;
      List var266;
      label2717: {
         Throwable var10000;
         label2721: {
            boolean var12;
            Object var13;
            boolean var10001;
            label2715: {
               label2714: {
                  try {
                     var257.r();
                     var257.F(126665345, var263.a);
                     auw.Q(var257);
                     var257.S(var263.e);
                     var13 = var263.d;
                     if (var257.m > 0) {
                        break label2714;
                     }
                  } catch (Throwable var256) {
                     var10000 = var256;
                     var10001 = false;
                     break label2721;
                  }

                  var12 = false;
                  break label2715;
               }

               var12 = true;
            }

            label2707: {
               label2706: {
                  try {
                     asr.i(var12);
                     if (var3.m == 0) {
                        break label2706;
                     }
                  } catch (Throwable var255) {
                     var10000 = var255;
                     var10001 = false;
                     break label2721;
                  }

                  var12 = false;
                  break label2707;
               }

               var12 = true;
            }

            int var9;
            try {
               asr.i(var12);
               asr.i(((nxj)var13).f());
               var5 = var3.T((nxj)var13) + 1;
               var9 = var3.o;
            } catch (Throwable var254) {
               var10000 = var254;
               var10001 = false;
               break label2721;
            }

            label2696: {
               label2695: {
                  if (var9 <= var5) {
                     try {
                        if (var5 < var3.g) {
                           break label2695;
                        }
                     } catch (Throwable var253) {
                        var10000 = var253;
                        var10001 = false;
                        break label2721;
                     }
                  }

                  var12 = false;
                  break label2696;
               }

               var12 = true;
            }

            int var10;
            label2687: {
               label2686: {
                  try {
                     asr.i(var12);
                     var8 = var3.j(var5);
                     var10 = var3.h(var5);
                     if (!var3.L(var5)) {
                        break label2686;
                     }
                  } catch (Throwable var252) {
                     var10000 = var252;
                     var10001 = false;
                     break label2721;
                  }

                  var6 = 1;
                  break label2687;
               }

               try {
                  var6 = var3.i(var5);
               } catch (Throwable var251) {
                  var10000 = var251;
                  var10001 = false;
                  break label2721;
               }
            }

            try {
               var266 = pu.c(var3, var5, var257, false);
               var3.I(var8);
            } catch (Throwable var250) {
               var10000 = var250;
               var10001 = false;
               break label2721;
            }

            boolean var264;
            if (var6 > 0) {
               var264 = true;
            } else {
               var264 = false;
            }

            boolean var7;
            for(; var8 >= var9; var264 = var7) {
               int var11;
               int[] var16;
               try {
                  var11 = var3.f(var8);
                  var16 = var3.b;
                  pu.o(var16, var11, pu.f(var16, var11) - var10);
               } catch (Throwable var248) {
                  var10000 = var248;
                  var10001 = false;
                  break label2721;
               }

               var7 = var264;
               if (var264) {
                  label2723: {
                     label2669: {
                        try {
                           if (!pu.w(var3.b, var11)) {
                              break label2669;
                           }
                        } catch (Throwable var249) {
                           var10000 = var249;
                           var10001 = false;
                           break label2721;
                        }

                        var7 = false;
                        break label2723;
                     }

                     try {
                        var16 = var3.b;
                        pu.p(var16, var11, pu.i(var16, var11) - var6);
                     } catch (Throwable var247) {
                        var10000 = var247;
                        var10001 = false;
                        break label2721;
                     }

                     var7 = var264;
                  }
               }

               try {
                  var8 = var3.j(var8);
               } catch (Throwable var246) {
                  var10000 = var246;
                  var10001 = false;
                  break label2721;
               }
            }

            if (var264) {
               label2652: {
                  label2651: {
                     try {
                        if (var3.n < var6) {
                           break label2651;
                        }
                     } catch (Throwable var245) {
                        var10000 = var245;
                        var10001 = false;
                        break label2721;
                     }

                     var12 = true;
                     break label2652;
                  }

                  var12 = false;
               }

               try {
                  asr.i(var12);
                  var3.n -= var6;
               } catch (Throwable var244) {
                  var10000 = var244;
                  var10001 = false;
                  break label2721;
               }
            }

            label2644:
            try {
               var257.k();
               var257.P();
               var257.t();
               break label2717;
            } catch (Throwable var243) {
               var10000 = var243;
               var10001 = false;
               break label2644;
            }
         }

         Throwable var261 = var10000;
         var257.s();
         throw var261;
      }

      var257.s();
      lmk var262 = new lmk(var15, (byte[])null);
      if (!var266.isEmpty()) {
         int var265 = var266.size();

         for(var5 = 0; var5 < var265; ++var5) {
            nxj var258 = (nxj)var266.get(var5);
            if (var15.e(var258)) {
               var6 = var15.d(var258);
               var8 = pu.m(var15.a, var6);
               ++var6;
               if (var6 < var15.b) {
                  var6 = pu.e(var15.a, var6);
               } else {
                  var6 = var15.c.length;
               }

               Object var259;
               if (var6 - var8 > 0) {
                  var259 = var15.c[var8];
               } else {
                  var259 = asl.a;
               }

               if (var259 instanceof aug) {
                  awv var267 = new awv(var14, var263);
                  var257 = var15.b();

                  try {
                     nl.e(var257, var266, var267);
                     break;
                  } finally {
                     var257.s();
                  }
               }
            }
         }
      }

      var260.p(var263, var262);
   }

   public final String c(int var1) {
      String var2;
      if (c.n(var1, 0)) {
         var2 = "composition";
      } else if (c.n(var1, 1)) {
         var2 = "parentCompositionContext";
      } else if (c.n(var1, 2)) {
         var2 = "reference";
      } else {
         var2 = super.c(var1);
      }

      return var2;
   }
}
