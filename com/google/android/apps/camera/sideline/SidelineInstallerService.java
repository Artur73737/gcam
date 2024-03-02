package com.google.android.apps.camera.sideline;

import android.app.NotificationChannel;
import android.app.Service;
import android.app.Notification.Builder;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.material.search.Ztp.sYWXtqVx;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SidelineInstallerService extends Service {
   public .jiw a;
   public .bbf b;

   public final IBinder onBind(Intent var1) {
      return null;
   }

   public final void onCreate() {
      ((.jix)((.gsr)this.getApplicationContext()).e(.jix.class)).t(this);
   }

   public final int onStartCommand(Intent var1, int var2, int var3) {
      byte var11;
      label48: {
         String var6 = var1.getAction();
         var6.getClass();
         switch(var6.hashCode()) {
         case -537238987:
            if (var6.equals("com.google.android.apps.camera.sideline.START_UPDATE")) {
               var11 = 0;
               break label48;
            }
            break;
         case 646839932:
            if (var6.equals("com.google.android.apps.camera.sideline.ON_INSTALL_STATUS_CHANGED")) {
               var11 = 1;
               break label48;
            }
         }

         var11 = -1;
      }

      .mxu var18;
      switch(var11) {
      case 0:
         .bbf var15 = this.b;
         NotificationChannel var19 = var15.V();
         Object var12 = var15.b;
         String var20 = var19.getId();
         this.startForeground(42014, (new Builder((Context)var12, var20)).setSmallIcon(17301633).setContentTitle(((Context)var15.b).getString(2132017696)).setContentText(((Context)var15.b).getString(2132017695)).setOngoing(true).setWhen(System.currentTimeMillis()).setShowWhen(true).setForegroundServiceBehavior(1).build());
         .jiw var13 = this.a;
         .psq var16 = var13.q;
         if (var16 != null && !var16.isDone()) {
            ((.pdq).jiw.a.b().I(3655)).q("startHalUpdate called when HAL is still updating!");
         } else {
            var13.q = .psq.g();
            var2 = (Integer)var13.t.b(.jgz.ao);
            var13.u.d(.jgz.ao, var2 + 1);
            .jjb var17 = var13.m;
            long var4 = var17.b;
            var4 = var17.c;
            var18 = var17.a;
            var17.d = SystemClock.elapsedRealtime();
            var13.k.a(3);
            var13.g.execute(new .jiu(var13));
            var13.q.c(new .jeq(var13, 5), var13.i);
            .ppw.i(.osh.aB(var13.q, 70L, TimeUnit.SECONDS, var13.h), TimeoutException.class, .iuc.d, .pre.a);
         }
         break;
      case 1:
         .jiw var14 = this.a;
         Bundle var8 = var1.getExtras();
         if (var8 == null) {
            ((.pdq).jiw.a.c().I(3649)).q("extras is null from PackageInstaller.");
         } else {
            var2 = var8.getInt("android.content.pm.extra.STATUS");
            Optional var7 = Optional.ofNullable(var8.getString(sYWXtqVx.jpQpAVEJ));
            var7.orElse((Object)null);
            switch(var2) {
            case -1:
               ((.pdq).jiw.a.b().I(3648)).q("Package installer is asking user for permission. This should not happen in HAL update!");
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
               var14.a(var2, var7);
               break;
            case 0:
               var14.c();
               .jjb var10 = var14.m;
               var18 = var10.a;
               var10.e = SystemClock.elapsedRealtime();
               var14.s = var14.p.a("SidelineInstaller#waitForHalRestart");
               .osh.aw(new .jiv(var14, SystemClock.uptimeMillis()), 3L, TimeUnit.SECONDS, var14.h);
               break;
            case 1:
               var14.b();
               var14.a(var2, var7);
               break;
            case 6:
               JobInfo var9 = (new android.app.job.JobInfo.Builder(58451, new ComponentName(var14.b, SidelineJobService.class))).setPersisted(true).setRequiresStorageNotLow(true).build();
               if (((.gsl)var14.o).a().schedule(var9) != 1) {
                  ((.pdq).jiw.a.c().I(3653)).q("Failed to schedule retry!");
               }

               var14.a(var2, var7);
               break;
            default:
               ((.pdq).jiw.a.b().I(3647)).r("Unrecognized status received from installer: %d", var2);
            }
         }
      }

      return 2;
   }
}
