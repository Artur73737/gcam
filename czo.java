import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import androidx.wear.ambient.WearableControllerProvider;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarInterface.SidecarCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public final class czo implements czb {
   public static volatile czo a;
   public static final ReentrantLock b = new ReentrantLock();
   public final CopyOnWriteArrayList c;
   private final czl d;

   public czo(czl var1) {
      this.d = var1;
      this.c = new CopyOnWriteArrayList();
      if (var1 != null) {
         var1.e = new czj(new czm(this));
         SidecarInterface var2 = var1.a;
         if (var2 != null) {
            var2.setSidecarCallback((SidecarCallback)(new DistinctElementSidecarCallback(var1.b, (SidecarCallback)(new SidecarCompat$TranslatingCallback(var1)))));
         }
      }

   }

   public final void a(Context var1, Executor var2, cew var3) {
      ReentrantLock var6 = b;
      var6.lock();

      Throwable var10000;
      label1791: {
         czl var8;
         boolean var10001;
         try {
            var8 = this.d;
         } catch (Throwable var248) {
            var10000 = var248;
            var10001 = false;
            break label1791;
         }

         cyw var249;
         if (var8 == null) {
            label1740: {
               try {
                  var249 = new cyw(qtf.a);
                  var3.accept(var249);
               } catch (Throwable var234) {
                  var10000 = var234;
                  var10001 = false;
                  break label1740;
               }

               var6.unlock();
               return;
            }
         } else {
            label1795: {
               boolean var5;
               CopyOnWriteArrayList var7;
               try {
                  var7 = this.c;
                  var5 = var7.isEmpty();
               } catch (Throwable var247) {
                  var10000 = var247;
                  var10001 = false;
                  break label1795;
               }

               boolean var4 = false;
               if (!var5) {
                  label1796: {
                     Iterator var256;
                     try {
                        var256 = var7.iterator();
                     } catch (Throwable var245) {
                        var10000 = var245;
                        var10001 = false;
                        break label1795;
                     }

                     try {
                        do {
                           if (!var256.hasNext()) {
                              break label1796;
                           }
                        } while(!c.E(((czn)var256.next()).a, var1));
                     } catch (Throwable var246) {
                        var10000 = var246;
                        var10001 = false;
                        break label1795;
                     }

                     var4 = true;
                  }
               }

               czn var257;
               try {
                  var257 = new czn((Activity)var1, var2, var3);
                  this.c.add(var257);
               } catch (Throwable var244) {
                  var10000 = var244;
                  var10001 = false;
                  break label1795;
               }

               if (!var4) {
                  IBinder var251;
                  try {
                     var251 = WearableControllerProvider.a((Activity)var1);
                  } catch (Throwable var242) {
                     var10000 = var242;
                     var10001 = false;
                     break label1795;
                  }

                  if (var251 != null) {
                     try {
                        var8.b(var251, (Activity)var1);
                     } catch (Throwable var241) {
                        var10000 = var241;
                        var10001 = false;
                        break label1795;
                     }
                  } else {
                     try {
                        czk var252 = new czk(var8, (Activity)var1);
                        ((Activity)var1).getWindow().getDecorView().addOnAttachStateChangeListener(var252);
                     } catch (Throwable var240) {
                        var10000 = var240;
                        var10001 = false;
                        break label1795;
                     }
                  }
               } else {
                  Iterator var258;
                  try {
                     var258 = this.c.iterator();
                  } catch (Throwable var239) {
                     var10000 = var239;
                     var10001 = false;
                     break label1795;
                  }

                  Object var250;
                  label1764: {
                     Object var254;
                     while(true) {
                        try {
                           var5 = var258.hasNext();
                        } catch (Throwable var238) {
                           var10000 = var238;
                           var10001 = false;
                           break label1795;
                        }

                        var2 = null;
                        if (!var5) {
                           var250 = null;
                           break label1764;
                        }

                        try {
                           var254 = var258.next();
                           if (c.E(var1, ((czn)var254).a)) {
                              break;
                           }
                        } catch (Throwable var243) {
                           var10000 = var243;
                           var10001 = false;
                           break label1795;
                        }
                     }

                     var250 = var254;
                  }

                  czn var253;
                  try {
                     var253 = (czn)var250;
                  } catch (Throwable var237) {
                     var10000 = var237;
                     var10001 = false;
                     break label1795;
                  }

                  if (var253 != null) {
                     try {
                        var249 = var253.c;
                     } catch (Throwable var236) {
                        var10000 = var236;
                        var10001 = false;
                        break label1795;
                     }
                  } else {
                     var249 = var2;
                  }

                  if (var249 != null) {
                     try {
                        var257.a(var249);
                     } catch (Throwable var235) {
                        var10000 = var235;
                        var10001 = false;
                        break label1795;
                     }
                  }
               }

               var6.unlock();
               return;
            }
         }
      }

      Throwable var255 = var10000;
      var6.unlock();
      throw var255;
   }

   public final void b(cew var1) {
      ReentrantLock var3 = b;
      synchronized(var3){}

      Throwable var10000;
      label3615: {
         czl var4;
         boolean var10001;
         try {
            var4 = this.d;
         } catch (Throwable var497) {
            var10000 = var497;
            var10001 = false;
            break label3615;
         }

         if (var4 == null) {
            return;
         }

         Iterator var5;
         ArrayList var500;
         try {
            var500 = new ArrayList();
            var5 = this.c.iterator();
         } catch (Throwable var495) {
            var10000 = var495;
            var10001 = false;
            break label3615;
         }

         while(true) {
            try {
               if (!var5.hasNext()) {
                  break;
               }

               czn var6 = (czn)var5.next();
               if (var6.b == var1) {
                  var6.getClass();
                  var500.add(var6);
               }
            } catch (Throwable var496) {
               var10000 = var496;
               var10001 = false;
               break label3615;
            }
         }

         Iterator var498;
         try {
            this.c.removeAll(var500);
            var498 = var500.iterator();
         } catch (Throwable var494) {
            var10000 = var494;
            var10001 = false;
            break label3615;
         }

         label3591:
         while(true) {
            Activity var501;
            label3588:
            while(true) {
               CopyOnWriteArrayList var503;
               try {
                  if (!var498.hasNext()) {
                     return;
                  }

                  var501 = ((czn)var498.next()).a;
                  var503 = this.c;
                  if (var503.isEmpty()) {
                     break;
                  }
               } catch (Throwable var493) {
                  var10000 = var493;
                  var10001 = false;
                  break label3591;
               }

               try {
                  var5 = var503.iterator();
               } catch (Throwable var490) {
                  var10000 = var490;
                  var10001 = false;
                  break label3591;
               }

               try {
                  while(true) {
                     if (!var5.hasNext()) {
                        break label3588;
                     }

                     if (c.E(((czn)var5.next()).a, var501)) {
                        break;
                     }
                  }
               } catch (Throwable var492) {
                  var10000 = var492;
                  var10001 = false;
                  break label3591;
               }
            }

            czl var504;
            try {
               var504 = this.d;
            } catch (Throwable var489) {
               var10000 = var489;
               var10001 = false;
               break;
            }

            if (var504 != null) {
               IBinder var505;
               try {
                  var505 = WearableControllerProvider.a(var501);
               } catch (Throwable var488) {
                  var10000 = var488;
                  var10001 = false;
                  break;
               }

               if (var505 != null) {
                  SidecarInterface var7;
                  try {
                     var7 = var504.a;
                  } catch (Throwable var487) {
                     var10000 = var487;
                     var10001 = false;
                     break;
                  }

                  if (var7 != null) {
                     try {
                        var7.onWindowLayoutChangeListenerRemoved(var505);
                     } catch (Throwable var486) {
                        var10000 = var486;
                        var10001 = false;
                        break;
                     }
                  }

                  cew var506;
                  try {
                     var506 = (cew)var504.d.get(var501);
                  } catch (Throwable var485) {
                     var10000 = var485;
                     var10001 = false;
                     break;
                  }

                  if (var506 != null) {
                     try {
                        if (var501 instanceof cco) {
                           ((cco)var501).f(var506);
                        }
                     } catch (Throwable var491) {
                        var10000 = var491;
                        var10001 = false;
                        break;
                     }

                     try {
                        var504.d.remove(var501);
                     } catch (Throwable var484) {
                        var10000 = var484;
                        var10001 = false;
                        break;
                     }
                  }

                  czj var8;
                  try {
                     var8 = var504.e;
                  } catch (Throwable var483) {
                     var10000 = var483;
                     var10001 = false;
                     break;
                  }

                  if (var8 != null) {
                     ReentrantLock var507;
                     try {
                        var507 = var8.a;
                        var507.lock();
                     } catch (Throwable var482) {
                        var10000 = var482;
                        var10001 = false;
                        break;
                     }

                     try {
                        var8.b.put(var501, (Object)null);
                     } finally {
                        try {
                           var507.unlock();
                        } catch (Throwable var477) {
                           var10000 = var477;
                           var10001 = false;
                           break;
                        }
                     }
                  }

                  int var2;
                  try {
                     var2 = var504.c.size();
                     var504.c.remove(var505);
                  } catch (Throwable var480) {
                     var10000 = var480;
                     var10001 = false;
                     break;
                  }

                  if (var2 == 1) {
                     SidecarInterface var502;
                     try {
                        var502 = var504.a;
                     } catch (Throwable var479) {
                        var10000 = var479;
                        var10001 = false;
                        break;
                     }

                     if (var502 != null) {
                        try {
                           var502.onDeviceStateListenersChanged(true);
                        } catch (Throwable var478) {
                           var10000 = var478;
                           var10001 = false;
                           break;
                        }
                     }
                  }
               }
            }
         }
      }

      Throwable var499 = var10000;
      throw var499;
   }
}
