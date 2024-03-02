package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.wear.ambient.SharedLibraryVersion;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import androidx.window.sidecar.SidecarInterface.SidecarCallback;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class DistinctElementSidecarCallback implements SidecarCallback {
   private final Object a = new Object();
   private SidecarDeviceState b;
   private final Map c = new WeakHashMap();
   private final SidecarCallback d;

   public DistinctElementSidecarCallback(.czi var1, SidecarCallback var2) {
      this.d = var2;
   }

   public void onDeviceStateChanged(SidecarDeviceState var1) {
      if (var1 != null) {
         Object var2 = this.a;
         synchronized(var2){}

         Throwable var10000;
         boolean var10001;
         label304: {
            label311: {
               label310: {
                  SidecarDeviceState var3;
                  try {
                     var3 = this.b;
                     if (.c.E(var3, var1)) {
                        break label310;
                     }
                  } catch (Throwable var33) {
                     var10000 = var33;
                     var10001 = false;
                     break label304;
                  }

                  if (var3 != null) {
                     try {
                        if (SharedLibraryVersion.a(var3) == SharedLibraryVersion.a(var1)) {
                           break label310;
                        }
                     } catch (Throwable var32) {
                        var10000 = var32;
                        var10001 = false;
                        break label304;
                     }
                  }
                  break label311;
               }

               try {
                  return;
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label304;
               }
            }

            label289:
            try {
               this.b = var1;
               this.d.onDeviceStateChanged(var1);
               return;
            } catch (Throwable var31) {
               var10000 = var31;
               var10001 = false;
               break label289;
            }
         }

         while(true) {
            Throwable var34 = var10000;

            try {
               throw var34;
            } catch (Throwable var29) {
               var10000 = var29;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public void onWindowLayoutChanged(IBinder var1, SidecarWindowLayoutInfo var2) {
      Object var5 = this.a;
      synchronized(var5){}

      Throwable var10000;
      boolean var10001;
      label836: {
         label832: {
            SidecarWindowLayoutInfo var6;
            try {
               var6 = (SidecarWindowLayoutInfo)this.c.get(var1);
               if (.c.E(var6, var2)) {
                  break label832;
               }
            } catch (Throwable var81) {
               var10000 = var81;
               var10001 = false;
               break label836;
            }

            if (var6 != null && var2 != null) {
               label833: {
                  List var8;
                  List var83;
                  try {
                     var83 = SharedLibraryVersion.b(var6);
                     var8 = SharedLibraryVersion.b(var2);
                  } catch (Throwable var77) {
                     var10000 = var77;
                     var10001 = false;
                     break label836;
                  }

                  if (var83 == var8) {
                     break label832;
                  }

                  int var4;
                  try {
                     if (var83.size() != var8.size()) {
                        break label833;
                     }

                     var4 = var83.size();
                  } catch (Throwable var80) {
                     var10000 = var80;
                     var10001 = false;
                     break label836;
                  }

                  int var3 = 0;

                  while(true) {
                     if (var3 >= var4) {
                        break label832;
                     }

                     label835: {
                        SidecarDisplayFeature var7;
                        SidecarDisplayFeature var9;
                        try {
                           var9 = (SidecarDisplayFeature)var83.get(var3);
                           var7 = (SidecarDisplayFeature)var8.get(var3);
                           if (.c.E(var9, var7)) {
                              break label835;
                           }
                        } catch (Throwable var79) {
                           var10000 = var79;
                           var10001 = false;
                           break label836;
                        }

                        if (var9 == null || var7 == null) {
                           break;
                        }

                        try {
                           if (var9.getType() != var7.getType() || !.c.E(var9.getRect(), var7.getRect())) {
                              break;
                           }
                        } catch (Throwable var78) {
                           var10000 = var78;
                           var10001 = false;
                           break label836;
                        }
                     }

                     ++var3;
                  }
               }
            }

            try {
               this.c.put(var1, var2);
               this.d.onWindowLayoutChanged(var1, var2);
               return;
            } catch (Throwable var76) {
               var10000 = var76;
               var10001 = false;
               break label836;
            }
         }

         label786:
         try {
            return;
         } catch (Throwable var75) {
            var10000 = var75;
            var10001 = false;
            break label786;
         }
      }

      while(true) {
         Throwable var82 = var10000;

         try {
            throw var82;
         } catch (Throwable var74) {
            var10000 = var74;
            var10001 = false;
            continue;
         }
      }
   }
}
