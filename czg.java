import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.DisplayFeature;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public final class czg implements Consumer, cew {
   private final Context a;
   private final ReentrantLock b;
   private cyw c;
   private final Set d;

   public czg(Context var1) {
      var1.getClass();
      super();
      this.a = var1;
      this.b = new ReentrantLock();
      this.d = new LinkedHashSet();
   }

   public void accept(WindowLayoutInfo var1) {
      var1.getClass();
      ReentrantLock var5 = this.b;
      var5.lock();

      label2870: {
         Throwable var10000;
         label2874: {
            cza var4;
            cyx var6;
            Iterator var8;
            boolean var10001;
            cya var291;
            ArrayList var295;
            try {
               Context var3 = this.a;
               var4 = cza.a;
               WindowManager var290 = (WindowManager)var3.getSystemService(WindowManager.class);
               cho var287 = cho.m(var290.getCurrentWindowMetrics().getWindowInsets());
               Rect var7 = var290.getCurrentWindowMetrics().getBounds();
               var7.getClass();
               var291 = new cya(var7);
               var6 = new cyx(var291, var287);
               List var284 = var1.getDisplayFeatures();
               var284.getClass();
               var295 = new ArrayList();
               var8 = var284.iterator();
            } catch (Throwable var276) {
               var10000 = var276;
               var10001 = false;
               break label2874;
            }

            while(true) {
               boolean var2;
               DisplayFeature var288;
               try {
                  if (!var8.hasNext()) {
                     break;
                  }

                  var288 = (DisplayFeature)var8.next();
                  var2 = var288 instanceof FoldingFeature;
               } catch (Throwable var283) {
                  var10000 = var283;
                  var10001 = false;
                  break label2874;
               }

               var4 = null;
               cyp var285 = null;
               if (var2) {
                  label2859: {
                     label2876: {
                        FoldingFeature var9;
                        cyo var286;
                        label2857: {
                           label2877: {
                              try {
                                 var288.getClass();
                                 var9 = (FoldingFeature)var288;
                                 switch(var9.getType()) {
                                 case 1:
                                    break label2877;
                                 case 2:
                                    break;
                                 default:
                                    break label2876;
                                 }
                              } catch (Throwable var282) {
                                 var10000 = var282;
                                 var10001 = false;
                                 break label2874;
                              }

                              try {
                                 var286 = cyo.b;
                                 break label2857;
                              } catch (Throwable var275) {
                                 var10000 = var275;
                                 var10001 = false;
                                 break label2874;
                              }
                           }

                           try {
                              var286 = cyo.a;
                           } catch (Throwable var274) {
                              var10000 = var274;
                              var10001 = false;
                              break label2874;
                           }
                        }

                        cyn var289;
                        label2841: {
                           label2840: {
                              label2878: {
                                 try {
                                    switch(var9.getState()) {
                                    case 1:
                                       break label2878;
                                    case 2:
                                       break;
                                    default:
                                       break label2840;
                                    }
                                 } catch (Throwable var281) {
                                    var10000 = var281;
                                    var10001 = false;
                                    break label2874;
                                 }

                                 try {
                                    var289 = cyn.b;
                                    break label2841;
                                 } catch (Throwable var273) {
                                    var10000 = var273;
                                    var10001 = false;
                                    break label2874;
                                 }
                              }

                              try {
                                 var289 = cyn.a;
                                 break label2841;
                              } catch (Throwable var272) {
                                 var10000 = var272;
                                 var10001 = false;
                                 break label2874;
                              }
                           }

                           var285 = var4;
                           break label2859;
                        }

                        cya var10;
                        Rect var11;
                        label2824: {
                           try {
                              var11 = var9.getBounds();
                              var11.getClass();
                              var10 = new cya(var11);
                              var11 = var6.a();
                              if (var10.a() != 0 || var10.b() != 0) {
                                 break label2824;
                              }
                           } catch (Throwable var280) {
                              var10000 = var280;
                              var10001 = false;
                              break label2874;
                           }

                           var285 = var4;
                           break label2859;
                        }

                        label2879: {
                           try {
                              if (var10.b() != var11.width() && var10.a() != var11.height()) {
                                 break label2879;
                              }
                           } catch (Throwable var279) {
                              var10000 = var279;
                              var10001 = false;
                              break label2874;
                           }

                           label2807: {
                              try {
                                 if (var10.b() >= var11.width() || var10.a() >= var11.height()) {
                                    break label2807;
                                 }
                              } catch (Throwable var278) {
                                 var10000 = var278;
                                 var10001 = false;
                                 break label2874;
                              }

                              var285 = var4;
                              break label2859;
                           }

                           label2799: {
                              try {
                                 if (var10.b() == var11.width() && var10.a() == var11.height()) {
                                    break label2799;
                                 }
                              } catch (Throwable var277) {
                                 var10000 = var277;
                                 var10001 = false;
                                 break label2874;
                              }

                              try {
                                 Rect var296 = var9.getBounds();
                                 var296.getClass();
                                 var291 = new cya(var296);
                                 var285 = new cyp(var291, var286, var289);
                                 break label2859;
                              } catch (Throwable var271) {
                                 var10000 = var271;
                                 var10001 = false;
                                 break label2874;
                              }
                           }

                           var285 = var4;
                           break label2859;
                        }

                        var285 = var4;
                        break label2859;
                     }

                     var285 = var4;
                  }
               }

               if (var285 != null) {
                  try {
                     var295.add(var285);
                  } catch (Throwable var270) {
                     var10000 = var270;
                     var10001 = false;
                     break label2874;
                  }
               }
            }

            Iterator var293;
            try {
               cyw var292 = new cyw(var295);
               this.c = var292;
               var293 = this.d.iterator();
            } catch (Throwable var269) {
               var10000 = var269;
               var10001 = false;
               break label2874;
            }

            while(true) {
               try {
                  if (!var293.hasNext()) {
                     break label2870;
                  }

                  ((cew)var293.next()).accept(this.c);
               } catch (Throwable var268) {
                  var10000 = var268;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var294 = var10000;
         var5.unlock();
         throw var294;
      }

      var5.unlock();
   }

   public final void addListener(cew var1) {
      var1.getClass();
      ReentrantLock var2 = this.b;
      var2.lock();

      label112: {
         Throwable var10000;
         label116: {
            boolean var10001;
            cyw var3;
            try {
               var3 = this.c;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label116;
            }

            if (var3 != null) {
               try {
                  var1.accept(var3);
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label116;
               }
            }

            label104:
            try {
               this.d.add(var1);
               break label112;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label104;
            }
         }

         Throwable var16 = var10000;
         var2.unlock();
         throw var16;
      }

      var2.unlock();
   }

   public final boolean isEmpty() {
      return this.d.isEmpty();
   }

   public final void removeListener(cew var1) {
      var1.getClass();
      ReentrantLock var2 = this.b;
      var2.lock();

      try {
         this.d.remove(var1);
      } finally {
         var2.unlock();
      }

   }
}
