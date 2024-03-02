import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class sy extends qwq implements qvi {
   final sz a;
   private final int b;

   public sy(sz var1, int var2) {
      super(0);
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object a() {
      switch(this.b) {
      case 0:
         return this.b();
      case 1:
         return this.b();
      case 2:
         return this.b();
      case 3:
         return this.b();
      case 4:
         return this.b();
      default:
         return this.b();
      }
   }

   public final Set b() {
      String var768;
      StringBuilder var1;
      AssertionError var769;
      sz var2;
      sz var771;
      Throwable var775;
      AssertionError var10000;
      boolean var10001;
      String var764;
      Object var765;
      List var766;
      Throwable var767;
      switch(this.b) {
      case 0:
         label5409: {
            NullPointerException var776;
            label5370: {
               try {
                  var1 = new StringBuilder();
                  var1.append("Camera-");
                  var1.append(this.a.a);
                  var1.append("#physicalCameraIds");
                  var768 = var1.toString();
                  var771 = this.a;
               } catch (AssertionError var755) {
                  var10000 = var755;
                  var10001 = false;
                  break label5409;
               } catch (NullPointerException var756) {
                  var776 = var756;
                  var10001 = false;
                  break label5370;
               }

               label5371: {
                  label5332: {
                     Iterator var770;
                     ArrayList var773;
                     try {
                        Trace.beginSection(var768);
                        Set var772 = sr.f(var771.b);
                        StringBuilder var3 = new StringBuilder();
                        var3.append("Loaded physicalCameraIds from ");
                        var3.append(qu.b(var771.a));
                        var3.append(": ");
                        var3.append(var772);
                        var773 = new ArrayList(pwm.aL(var772));
                        var770 = var772.iterator();
                     } catch (Throwable var753) {
                        var775 = var753;
                        var10001 = false;
                        break label5332;
                     }

                     while(true) {
                        try {
                           if (var770.hasNext()) {
                              var768 = (String)var770.next();
                              qu.c(var768);
                              var773.add(qu.a(var768));
                              continue;
                           }
                        } catch (Throwable var754) {
                           var775 = var754;
                           var10001 = false;
                           break;
                        }

                        try {
                           var765 = pwm.aG(var773);
                           break label5371;
                        } catch (Throwable var752) {
                           var775 = var752;
                           var10001 = false;
                           break;
                        }
                     }
                  }

                  var767 = var775;

                  try {
                     Trace.endSection();
                     throw var767;
                  } catch (AssertionError var748) {
                     var10000 = var748;
                     var10001 = false;
                     break label5409;
                  } catch (NullPointerException var749) {
                     var776 = var749;
                     var10001 = false;
                     break label5370;
                  }
               }

               try {
                  Trace.endSection();
                  return (Set)var765;
               } catch (AssertionError var750) {
                  var10000 = var750;
                  var10001 = false;
                  break label5409;
               } catch (NullPointerException var751) {
                  var776 = var751;
                  var10001 = false;
               }
            }

            NullPointerException var774 = var776;
            Log.w("CXCP", "Failed to getPhysicalCameraIds from Camera-".concat(this.a.a), var774);
            var765 = qth.a;
            return (Set)var765;
         }

         var769 = var10000;
         Log.w("CXCP", "Failed to getPhysicalCameraIds from Camera-".concat(this.a.a), var769);
         var765 = qth.a;
         return (Set)var765;
      case 1:
         label5381: {
            try {
               var1 = new StringBuilder();
               var1.append("Camera-");
               var1.append(this.a.a);
               var1.append("#keys");
               var764 = var1.toString();
               var2 = this.a;
            } catch (AssertionError var747) {
               var10000 = var747;
               var10001 = false;
               break label5381;
            }

            label5382: {
               label5383: {
                  try {
                     Trace.beginSection(var764);
                     var766 = var2.b.getKeys();
                  } catch (Throwable var746) {
                     var775 = var746;
                     var10001 = false;
                     break label5383;
                  }

                  var765 = var766;
                  if (var766 == null) {
                     try {
                        var765 = qtf.a;
                     } catch (Throwable var745) {
                        var775 = var745;
                        var10001 = false;
                        break label5383;
                     }
                  }

                  label5295:
                  try {
                     var765 = pwm.aG((Iterable)var765);
                     break label5382;
                  } catch (Throwable var744) {
                     var775 = var744;
                     var10001 = false;
                     break label5295;
                  }
               }

               var767 = var775;

               try {
                  Trace.endSection();
                  throw var767;
               } catch (AssertionError var742) {
                  var10000 = var742;
                  var10001 = false;
                  break label5381;
               }
            }

            try {
               Trace.endSection();
               return (Set)var765;
            } catch (AssertionError var743) {
               var10000 = var743;
               var10001 = false;
            }
         }

         var769 = var10000;
         Log.w("CXCP", "Failed to getKeys from Camera-".concat(this.a.a), var769);
         var765 = qth.a;
         return (Set)var765;
      case 2:
         label5384: {
            try {
               var1 = new StringBuilder();
               var1.append("Camera-");
               var1.append(this.a.a);
               var1.append("#availablePhysicalCameraRequestKeys");
               var768 = var1.toString();
               var771 = this.a;
            } catch (AssertionError var741) {
               var10000 = var741;
               var10001 = false;
               break label5384;
            }

            label5385: {
               label5386: {
                  try {
                     Trace.beginSection(var768);
                     var766 = sr.c(var771.b);
                  } catch (Throwable var740) {
                     var775 = var740;
                     var10001 = false;
                     break label5386;
                  }

                  var765 = var766;
                  if (var766 == null) {
                     try {
                        var765 = qtf.a;
                     } catch (Throwable var739) {
                        var775 = var739;
                        var10001 = false;
                        break label5386;
                     }
                  }

                  label5271:
                  try {
                     var765 = pwm.aG((Iterable)var765);
                     break label5385;
                  } catch (Throwable var738) {
                     var775 = var738;
                     var10001 = false;
                     break label5271;
                  }
               }

               var767 = var775;

               try {
                  Trace.endSection();
                  throw var767;
               } catch (AssertionError var736) {
                  var10000 = var736;
                  var10001 = false;
                  break label5384;
               }
            }

            try {
               Trace.endSection();
               return (Set)var765;
            } catch (AssertionError var737) {
               var10000 = var737;
               var10001 = false;
            }
         }

         var769 = var10000;
         Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-".concat(this.a.a), var769);
         var765 = qth.a;
         return (Set)var765;
      case 3:
         label5375: {
            try {
               var1 = new StringBuilder();
               var1.append("Camera-");
               var1.append(this.a.a);
               var1.append("#availableCaptureRequestKeys");
               var768 = var1.toString();
               var771 = this.a;
            } catch (AssertionError var735) {
               var10000 = var735;
               var10001 = false;
               break label5375;
            }

            label5376: {
               label5377: {
                  try {
                     Trace.beginSection(var768);
                     var766 = var771.b.getAvailableCaptureRequestKeys();
                  } catch (Throwable var734) {
                     var775 = var734;
                     var10001 = false;
                     break label5377;
                  }

                  var765 = var766;
                  if (var766 == null) {
                     try {
                        var765 = qtf.a;
                     } catch (Throwable var733) {
                        var775 = var733;
                        var10001 = false;
                        break label5377;
                     }
                  }

                  label5247:
                  try {
                     var765 = pwm.aG((Iterable)var765);
                     break label5376;
                  } catch (Throwable var732) {
                     var775 = var732;
                     var10001 = false;
                     break label5247;
                  }
               }

               var767 = var775;

               try {
                  Trace.endSection();
                  throw var767;
               } catch (AssertionError var730) {
                  var10000 = var730;
                  var10001 = false;
                  break label5375;
               }
            }

            try {
               Trace.endSection();
               return (Set)var765;
            } catch (AssertionError var731) {
               var10000 = var731;
               var10001 = false;
            }
         }

         var769 = var10000;
         Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from Camera-".concat(this.a.a), var769);
         var765 = qth.a;
         return (Set)var765;
      case 4:
         label5372: {
            try {
               var1 = new StringBuilder();
               var1.append("Camera-");
               var1.append(this.a.a);
               var1.append("#availableCaptureResultKeys");
               var764 = var1.toString();
               var2 = this.a;
            } catch (AssertionError var729) {
               var10000 = var729;
               var10001 = false;
               break label5372;
            }

            label5373: {
               label5374: {
                  try {
                     Trace.beginSection(var764);
                     var766 = var2.b.getAvailableCaptureResultKeys();
                  } catch (Throwable var728) {
                     var775 = var728;
                     var10001 = false;
                     break label5374;
                  }

                  var765 = var766;
                  if (var766 == null) {
                     try {
                        var765 = qtf.a;
                     } catch (Throwable var727) {
                        var775 = var727;
                        var10001 = false;
                        break label5374;
                     }
                  }

                  label5223:
                  try {
                     var765 = pwm.aG((Iterable)var765);
                     break label5373;
                  } catch (Throwable var726) {
                     var775 = var726;
                     var10001 = false;
                     break label5223;
                  }
               }

               var767 = var775;

               try {
                  Trace.endSection();
                  throw var767;
               } catch (AssertionError var724) {
                  var10000 = var724;
                  var10001 = false;
                  break label5372;
               }
            }

            try {
               Trace.endSection();
               return (Set)var765;
            } catch (AssertionError var725) {
               var10000 = var725;
               var10001 = false;
            }
         }

         var769 = var10000;
         Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from Camera-".concat(this.a.a), var769);
         var765 = qth.a;
         return (Set)var765;
      default:
         label5378: {
            try {
               var1 = new StringBuilder;
            } catch (AssertionError var763) {
               var10000 = var763;
               var10001 = false;
               break label5378;
            }

            try {
               var1.<init>();
               var1.append("Camera-");
               var1.append(this.a.a);
               var1.append("#availableSessionKeys");
               var764 = var1.toString();
               var2 = this.a;
            } catch (AssertionError var762) {
               var10000 = var762;
               var10001 = false;
               break label5378;
            }

            label5379: {
               label5380: {
                  try {
                     Trace.beginSection(var764);
                     var766 = sr.d(var2.b);
                  } catch (Throwable var761) {
                     var775 = var761;
                     var10001 = false;
                     break label5380;
                  }

                  var765 = var766;
                  if (var766 == null) {
                     try {
                        var765 = qtf.a;
                     } catch (Throwable var760) {
                        var775 = var760;
                        var10001 = false;
                        break label5380;
                     }
                  }

                  label5350:
                  try {
                     var765 = pwm.aG((Iterable)var765);
                     break label5379;
                  } catch (Throwable var759) {
                     var775 = var759;
                     var10001 = false;
                     break label5350;
                  }
               }

               var767 = var775;

               try {
                  Trace.endSection();
                  throw var767;
               } catch (AssertionError var757) {
                  var10000 = var757;
                  var10001 = false;
                  break label5378;
               }
            }

            try {
               Trace.endSection();
               return (Set)var765;
            } catch (AssertionError var758) {
               var10000 = var758;
               var10001 = false;
            }
         }

         var769 = var10000;
         Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-".concat(this.a.a), var769);
         var765 = qth.a;
         return (Set)var765;
      }
   }
}
