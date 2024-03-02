@qus(
   b = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1$emit$2",
   c = "FloatingActionButton.kt",
   d = "invokeSuspend",
   e = {325}
)
final class anp extends quw implements qvx {
   int a;
   final yt b;
   final float c;
   final qwz d;
   final ahp e;

   public anp(yt var1, float var2, qwz var3, ahp var4, que var5) {
      super(2, var5);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final Object b(Object var1) {
      label2467: {
         qul var4 = qul.a;
         Throwable var10000;
         boolean var10001;
         switch(this.a) {
         case 0:
            pwm.bs(var1);

            float var2;
            yt var3;
            ahp var5;
            ahp var313;
            try {
               var3 = this.b;
               var2 = this.c;
               var313 = (ahp)this.d.a;
               var5 = this.e;
               this.a = 1;
            } catch (Throwable var311) {
               var10000 = var311;
               var10001 = false;
               break;
            }

            aak var314;
            label2458: {
               label2478: {
                  if (var5 != null) {
                     try {
                        if (var5 instanceof ahr) {
                           break label2478;
                        }
                     } catch (Throwable var304) {
                        var10000 = var304;
                        var10001 = false;
                        break;
                     }

                     label2436:
                     try {
                        if (!(var5 instanceof ahg)) {
                           break label2436;
                        }
                        break label2478;
                     } catch (Throwable var307) {
                        var10000 = var307;
                        var10001 = false;
                        break;
                     }

                     label2431:
                     try {
                        if (!(var5 instanceof ahm)) {
                           break label2431;
                        }
                        break label2478;
                     } catch (Throwable var306) {
                        var10000 = var306;
                        var10001 = false;
                        break;
                     }

                     label2426:
                     try {
                        if (!(var5 instanceof ahj)) {
                           break label2426;
                        }
                        break label2478;
                     } catch (Throwable var305) {
                        var10000 = var305;
                        var10001 = false;
                        break;
                     }
                  } else {
                     label2477: {
                        if (var313 == null) {
                           var314 = null;
                           break label2458;
                        }

                        label2476: {
                           try {
                              if (var313 instanceof ahr) {
                                 break label2476;
                              }
                           } catch (Throwable var309) {
                              var10000 = var309;
                              var10001 = false;
                              break;
                           }

                           try {
                              if (var313 instanceof ahg) {
                                 break label2476;
                              }
                           } catch (Throwable var310) {
                              var10000 = var310;
                              var10001 = false;
                              break;
                           }

                           try {
                              if (var313 instanceof ahm) {
                                 var314 = anv.c;
                                 break label2458;
                              }
                           } catch (Throwable var303) {
                              var10000 = var303;
                              var10001 = false;
                              break;
                           }

                           try {
                              if (!(var313 instanceof ahj)) {
                                 break label2477;
                              }
                           } catch (Throwable var308) {
                              var10000 = var308;
                              var10001 = false;
                              break;
                           }
                        }

                        try {
                           var314 = anv.b;
                           break label2458;
                        } catch (Throwable var301) {
                           var10000 = var301;
                           var10001 = false;
                           break;
                        }
                     }
                  }

                  var314 = null;
                  break label2458;
               }

               try {
                  var314 = anv.a;
               } catch (Throwable var302) {
                  var10000 = var302;
                  var10001 = false;
                  break;
               }
            }

            Object var315;
            if (var314 != null) {
               try {
                  var315 = yt.h(var3, bxt.a(var2), var314, (qvt)null, this, 12);
               } catch (Throwable var297) {
                  var10000 = var297;
                  var10001 = false;
                  break;
               }

               var1 = var315;

               try {
                  if (var315 != qul.a) {
                     var1 = qsn.a;
                  }
               } catch (Throwable var296) {
                  var10000 = var296;
                  var10001 = false;
                  break;
               }
            } else {
               qul var318;
               try {
                  bxt var316 = bxt.a(var2);
                  blj var6 = var3.b;
                  ys var317 = new ys(var3, var316, (que)null);
                  var1 = blj.x(var6, var317, this);
                  var318 = qul.a;
               } catch (Throwable var300) {
                  var10000 = var300;
                  var10001 = false;
                  break;
               }

               var315 = var1;
               if (var1 != var318) {
                  try {
                     var315 = qsn.a;
                  } catch (Throwable var299) {
                     var10000 = var299;
                     var10001 = false;
                     break;
                  }
               }

               var1 = var315;
               if (var315 != var318) {
                  try {
                     var1 = qsn.a;
                  } catch (Throwable var298) {
                     var10000 = var298;
                     var10001 = false;
                     break;
                  }
               }
            }

            if (var1 == var4) {
               return var4;
            }
            break label2467;
         default:
            label2465:
            try {
               pwm.bs(var1);
               break label2467;
            } catch (Throwable var312) {
               var10000 = var312;
               var10001 = false;
               break label2465;
            }
         }

         Throwable var319 = var10000;
         this.d.a = this.e;
         throw var319;
      }

      this.d.a = this.e;
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new anp(this.b, this.c, this.d, this.e, var2);
   }
}
