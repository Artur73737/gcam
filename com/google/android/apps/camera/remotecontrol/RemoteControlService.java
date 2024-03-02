package com.google.android.apps.camera.remotecontrol;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

public class RemoteControlService extends Service {
   public static final .pds a = .pds.h("com.google.android.apps.camera.remotecontrol.RemoteControlService");
   public .hfy b;
   public boolean c = false;
   public int d;
   public .flx e;
   public .fnh f;
   public .jbf g;
   public .ldc h = null;
   private PackageManager i;
   private int j = Integer.MIN_VALUE;
   private .cof k;
   private final ServiceConnection l = new .oqd(this, 1);
   private final .jbd m = new .jbd(this);

   protected final .flx a() {
      synchronized(this){}

      .flx var4;
      try {
         if (this.e == null) {
            Context var1 = this.getApplicationContext();
            var1.getClass();
            ((.jbh)((.gsr)var1).e(.jbh.class)).r(this);
         }

         var4 = this.e;
      } finally {
         ;
      }

      return var4;
   }

   protected final .fnh b() {
      synchronized(this){}

      .fnh var4;
      try {
         if (this.f == null) {
            Context var1 = this.getApplicationContext();
            var1.getClass();
            ((.jbh)((.gsr)var1).e(.jbh.class)).r(this);
         }

         var4 = this.f;
      } finally {
         ;
      }

      return var4;
   }

   public final .jbf c() {
      synchronized(this){}

      .jbf var4;
      try {
         if (this.g == null) {
            Context var1 = this.getApplicationContext();
            var1.getClass();
            ((.jbh)((.gsr)var1).e(.jbh.class)).r(this);
         }

         var4 = this.g;
      } finally {
         ;
      }

      return var4;
   }

   public final void d(int var1, boolean var2) {
      Intent var3 = new Intent("com.google.android.apps.camera.remotecontrol.remotekey");
      var3.putExtra("key_value", var1);
      var3.putExtra("key_down", var2);
      this.k.d(var3);
   }

   public final void e(boolean var1) {
      if (this.c) {
         .ldc var2 = this.h;
         if (var2 != null) {
            RemoteException var10000;
            boolean var10001;
            if (!var1) {
               try {
                  var2.A(2, var2.a());
                  return;
               } catch (RemoteException var3) {
                  var10000 = var3;
                  var10001 = false;
               }
            } else {
               try {
                  var2.A(1, var2.a());
                  return;
               } catch (RemoteException var4) {
                  var10000 = var4;
                  var10001 = false;
               }
            }

            RemoteException var5 = var10000;
            ((.pdq)a.b().I(3476)).q("Error when calling into Photos service");
            var5.printStackTrace();
            return;
         }
      }

   }

   public final boolean f() {
      int var2 = Binder.getCallingUid();
      boolean var5 = this.a().m(.fmd.bB);
      boolean var6 = false;
      if (!var5) {
         ((.pdq)a.b().I(3480)).q("Feature not enabled.");
         return false;
      } else if (this.j == var2) {
         return true;
      } else {
         String[] var8 = this.i.getPackagesForUid(var2);
         if (var8 != null && var8.length != 0) {
            if (this.b() != .fnh.a) {
               int var1 = .jbj.a;
               PackageManager var7 = this.i;
               if (!.jbj.a(var8[0], var7)) {
                  ((.pdq)a.b().I(3479)).q("Failed to verify calling package.");
                  return false;
               }
            }

            int var4 = this.i.checkPermission("android.permission.CAMERA", var8[0]);
            int var3 = this.i.checkPermission("android.permission.RECORD_AUDIO", var8[0]);
            boolean var9;
            if (this.i.checkPermission("android.permission.ACCESS_FINE_LOCATION", var8[0]) != 0 && this.i.checkPermission("android.permission.ACCESS_COARSE_LOCATION", var8[0]) != 0) {
               var9 = false;
            } else {
               var9 = true;
            }

            var5 = var6;
            if (var4 == 0) {
               var5 = var6;
               if (var3 == 0) {
                  var5 = var6;
                  if (var9) {
                     var5 = true;
                  }
               }
            }

            if (var5) {
               this.j = var2;
            }

            return var5;
         } else {
            ((.pdq)a.b().I(3478)).q("Failed to get calling package name.");
            return false;
         }
      }
   }

   public final IBinder onBind(Intent var1) {
      if (!this.a().m(.fmd.bB)) {
         return null;
      } else {
         this.j = Integer.MIN_VALUE;
         return this.m;
      }
   }

   public final void onCreate() {
      this.i = this.getPackageManager();
      this.b = ((.hhc)this.getApplication()).j;
      super.onCreate();
      this.k = .cof.a(this);
      this.d = 0;
      .jbf var1 = this.c();
      var1.a = false;
      var1.c = Integer.MIN_VALUE;
      var1.d = Float.MIN_VALUE;
      var1.e = 0L;
      var1.f = Float.MIN_VALUE;
      var1.g = 0L;
      this.g.c(true);
      Intent var2 = new Intent();
      var2.setClassName("com.google.android.apps.photos", "com.google.android.apps.photos.cameraassistant.CameraAssistantService");
      this.bindService(var2, this.l, 1);
   }

   public final void onDestroy() {
      ServiceConnection var1 = this.l;
      .onk.p(var1);
      this.unbindService(var1);
      this.g.c(false);
      super.onDestroy();
   }
}
