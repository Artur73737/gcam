package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import android.util.Log;
import com.google.android.apps.camera.bottombar.dagger.QiTx.DeBfHrQZSt;
import com.google.android.apps.camera.ui.popupmenu.lol.nJwt;
import com.google.android.clockwork.common.wearable.wearmaterial.button.jKIE.tRYpVduhjf;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DaydreamApi implements AutoCloseable {
   private static volatile Boolean g = null;
   public final Context a;
   public final ArrayList b = new ArrayList();
   public int c;
   public final ServiceConnection d = new .qnq(this);
   public .qok e;
   public .qoh f;
   private boolean h;
   private final AtomicInteger i = new AtomicInteger();

   protected DaydreamApi(Context var1) {
      this.a = var1;
   }

   private final void b(Intent var1) {
      List var2 = this.a.getPackageManager().queryIntentActivities(var1, 0);
      if (var2 == null || var2.isEmpty()) {
         String var3 = var1.toString();
         throw new ActivityNotFoundException(nJwt.yod.concat(var3));
      }
   }

   private final void c() {
      if (this.h) {
         throw new IllegalStateException(tRYpVduhjf.xcRZh);
      }
   }

   public static DaydreamApi create(Context var0) {
      if (Looper.getMainLooper() != Looper.myLooper()) {
         throw new IllegalStateException("DaydreamApi must only be used from the main thread.");
      } else if (!var0.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
         return null;
      } else {
         DaydreamApi var3 = new DaydreamApi(var0);

         label64: {
            .qog var10000;
            label72: {
               int var1;
               boolean var10001;
               try {
                  var1 = VrCoreUtils.getVrCoreClientApiVersion(var3.a);
                  var3.c = var1;
               } catch (.qog var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label72;
               }

               if (var1 < 8) {
                  try {
                     Log.e("DaydreamApi", .c.aK(var1, "VrCore out of date, current version: ", ", required version: 8"));
                     break label64;
                  } catch (.qog var4) {
                     var10000 = var4;
                     var10001 = false;
                  }
               } else {
                  label75: {
                     Intent var2;
                     label60: {
                        try {
                           var2 = new Intent("com.google.vr.vrcore.BIND_SDK_SERVICE");
                           var2.setPackage("com.google.vr.vrcore");
                           if (var3.a.getApplicationContext() != null) {
                              var0 = var3.a.getApplicationContext();
                              break label60;
                           }
                        } catch (.qog var9) {
                           var10000 = var9;
                           var10001 = false;
                           break label75;
                        }

                        try {
                           var0 = var3.a;
                        } catch (.qog var6) {
                           var10000 = var6;
                           var10001 = false;
                           break label75;
                        }
                     }

                     try {
                        if (var0.bindService(var2, var3.d, 1)) {
                           return var3;
                        }
                     } catch (.qog var8) {
                        var10000 = var8;
                        var10001 = false;
                        break label75;
                     }

                     try {
                        Log.e("DaydreamApi", "Unable to bind to VrCoreSdkService");
                        break label64;
                     } catch (.qog var5) {
                        var10000 = var5;
                        var10001 = false;
                     }
                  }
               }
            }

            .qog var10 = var10000;
            Log.e("DaydreamApi", "VrCore not available: ".concat(var10.toString()));
         }

         Log.w("DaydreamApi", "Failed to initialize DaydreamApi object.");
         return null;
      }
   }

   public static Intent createVrIntent(ComponentName var0) {
      Intent var1 = new Intent();
      var1.setComponent(var0);
      setupVrIntent(var1);
      return var1;
   }

   private final void d(PendingIntent var1, ComponentName var2) {
      this.a(new .qnu(this, var1, var2, 1));
   }

   public static Intent setupVrIntent(Intent var0) {
      var0.addCategory(DeBfHrQZSt.rvvJiv);
      var0.addFlags(335609856);
      return var0;
   }

   protected final void a(Runnable var1) {
      if (this.e != null) {
         var1.run();
      } else {
         this.b.add(var1);
      }
   }

   public void close() {
      if (!this.h) {
         this.h = true;
         this.a(new .qns(this, 1));
      }
   }

   public void exitFromVr(Activity var1, int var2, Intent var3) {
      this.c();
      Intent var4 = var3;
      if (var3 == null) {
         var4 = new Intent();
      }

      PendingIntent var5 = var1.createPendingResult(var2, var4, 1073741824);
      this.a(new .qnu(this, new .qns(var5, 3), var5, 0));
   }

   public void launchInVr(PendingIntent var1) {
      this.c();
      this.d(var1, (ComponentName)null);
   }

   public void launchInVr(ComponentName var1) {
      this.c();
      if (var1 != null) {
         Intent var2 = createVrIntent(var1);
         this.b(var2);
         this.d(PendingIntent.getActivity(this.a, 0, var2, 1073741824), var2.getComponent());
      } else {
         throw new IllegalArgumentException("Null argument 'componentName' passed to launchInVr");
      }
   }

   public void launchInVr(Intent var1) {
      this.c();
      if (var1 != null) {
         this.b(var1);
         this.d(PendingIntent.getActivity(this.a, this.i.incrementAndGet(), var1, 1207959552), var1.getComponent());
      } else {
         throw new IllegalArgumentException("Null argument 'intent' passed to launchInVr");
      }
   }

   public void launchInVrForResult(Activity var1, PendingIntent var2, int var3) {
      this.c();
      this.a(new .qnr(this, new .qnt(var1, var2, var3)));
   }

   public void launchVrHomescreen() {
      this.c();
      this.a(new .qns(this, 0));
   }
}
