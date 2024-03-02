import java.util.concurrent.CancellationException;

public final class rhx {
   public static final riq a = new riq("UNDEFINED");
   public static final riq b = new riq("REUSABLE_CLAIMED");

   public static final void a(que var0, Object var1) {
      if (var0 instanceof rhw) {
         rhw var3 = (rhw)var0;
         Object var131 = qwp.I(var1);
         if (var3.a.f(var3.n())) {
            var3.c = var131;
            var3.f = 1;
            var3.a.a(var3.n(), var3);
         } else {
            boolean var2 = qzx.a;
            ThreadLocal var4 = rcb.a;
            ran var135 = rcb.a();
            if (var135.o()) {
               var3.c = var131;
               var3.f = 1;
               var135.m(var3);
            } else {
               var135.n(true);

               Throwable var10000;
               label1123: {
                  rbd var5;
                  boolean var10001;
                  try {
                     var5 = (rbd)var3.n().get(rbd.c);
                  } catch (Throwable var130) {
                     var10000 = var130;
                     var10001 = false;
                     break label1123;
                  }

                  label1124: {
                     if (var5 != null) {
                        try {
                           if (!var5.gU()) {
                              CancellationException var133 = var5.p();
                              var3.m(var131, var133);
                              var3.gP(pwm.br(var133));
                              break label1124;
                           }
                        } catch (Throwable var129) {
                           var10000 = var129;
                           var10001 = false;
                           break label1123;
                        }
                     }

                     rcg var132;
                     Object var6;
                     qui var136;
                     label1102: {
                        try {
                           var0 = var3.b;
                           var6 = var3.d;
                           var136 = var0.n();
                           var6 = ris.b(var136, var6);
                           if (var6 != ris.a) {
                              var132 = qzp.c(var0, var136, var6);
                              break label1102;
                           }
                        } catch (Throwable var128) {
                           var10000 = var128;
                           var10001 = false;
                           break label1123;
                        }

                        var132 = null;
                     }

                     try {
                        var3.b.gP(var1);
                     } finally {
                        label1089: {
                           if (var132 != null) {
                              try {
                                 if (!var132.Q()) {
                                    break label1089;
                                 }
                              } catch (Throwable var125) {
                                 var10000 = var125;
                                 var10001 = false;
                                 break label1123;
                              }
                           }

                           try {
                              ris.c(var136, var6);
                           } catch (Throwable var124) {
                              var10000 = var124;
                              var10001 = false;
                              break label1123;
                           }
                        }

                        try {
                           ;
                        } catch (Throwable var123) {
                           var10000 = var123;
                           var10001 = false;
                           break label1123;
                        }
                     }
                  }

                  while(true) {
                     try {
                        var2 = var135.q();
                     } catch (Throwable var126) {
                        var10000 = var126;
                        var10001 = false;
                        break;
                     }

                     if (!var2) {
                        return;
                     }
                  }
               }

               Throwable var134 = var10000;

               try {
                  var3.C(var134, (Throwable)null);
               } finally {
                  var135.l(true);
               }

            }
         }
      } else {
         var0.gP(var1);
      }
   }
}
