package com.google.android.gms.learning.internal.training;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public final class InAppTrainingService extends Service {
   private static final String TAG = "brella.InAppTrngSvc";
   .lsx dynamiteImpl;

   public IBinder onBind(Intent var1) {
      .lsx var2 = this.dynamiteImpl;
      if (var2 != null) {
         try {
            IBinder var4 = var2.f(var1);
            return var4;
         } catch (RemoteException var3) {
            if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
               Log.w("brella.InAppTrngSvc", "RemoteException in IInAppTrainingService.onBind", var3);
            }
         }
      }

      return new .lsj("No IInAppTrainingService implementation found");
   }

   public void onCreate() {
      super.onCreate();

      .lsx var1;
      try {
         var1 = (.lsx).lsn.a(this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", .lsy.d);
      } catch (.lsl var3) {
         if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
            Log.w("brella.InAppTrngSvc", "LoadingException during onCreate", var3);
            return;
         }

         return;
      }

      try {
         var1.g(.lpp.b(this));
      } catch (RemoteException var5) {
         if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
            Log.w("brella.InAppTrngSvc", "RemoteException during onCreate", var5);
         }
      }

      try {
         .lsp var2 = new .lsp(this.getApplicationContext());
         var1.l(var2);
      } catch (RemoteException var4) {
         if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
            Log.w("brella.InAppTrngSvc", "RemoteException during addHttpUrlConnectionFactory", var4);
         }
      }

      this.dynamiteImpl = var1;
   }

   public void onDestroy() {
      .lsx var1 = this.dynamiteImpl;
      if (var1 != null) {
         try {
            var1.h();
         } catch (RemoteException var2) {
            if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
               Log.w("brella.InAppTrngSvc", "RemoteException in IInAppTrainingService.onDestroy", var2);
            }
         }
      }

      super.onDestroy();
   }

   public void onRebind(Intent var1) {
      .lsx var2 = this.dynamiteImpl;
      if (var2 != null) {
         try {
            var2.i(var1);
            return;
         } catch (RemoteException var3) {
            if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
               Log.w("brella.InAppTrngSvc", "RemoteException in IInAppTrainingService.onRebind", var3);
            }
         }
      }

      super.onRebind(var1);
   }

   public int onStartCommand(Intent var1, int var2, int var3) {
      .lsx var5 = this.dynamiteImpl;
      if (var5 != null) {
         try {
            int var4 = var5.e(var1, var2, var3);
            return var4;
         } catch (RemoteException var6) {
            if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
               Log.w("brella.InAppTrngSvc", "RemoteException in IInAppTrainingService.onStartCommand", var6);
            }
         }
      }

      return super.onStartCommand(var1, var2, var3);
   }

   public void onTrimMemory(int var1) {
      .lsx var2 = this.dynamiteImpl;
      if (var2 != null) {
         try {
            var2.j(var1);
            return;
         } catch (RemoteException var3) {
            if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
               Log.w("brella.InAppTrngSvc", "RemoteException in IInAppTrainingService.onTrimMemory", var3);
               return;
            }
         }
      }

   }

   public boolean onUnbind(Intent var1) {
      .lsx var3 = this.dynamiteImpl;
      if (var3 != null) {
         try {
            boolean var2 = var3.k(var1);
            return var2;
         } catch (RemoteException var4) {
            if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
               Log.w("brella.InAppTrngSvc", "RemoteException in IInAppTrainingService.onUnbind", var4);
            }
         }
      }

      return super.onUnbind(var1);
   }
}
