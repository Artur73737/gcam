package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;

public final class AnalyticsService extends Service implements .liq {
   private .nom a;

   private final .nom c() {
      if (this.a == null) {
         this.a = new .nom(this, (byte[])null);
      }

      return this.a;
   }

   public final boolean a(int var1) {
      return this.stopSelfResult(var1);
   }

   public final void b(JobParameters var1) {
      throw new UnsupportedOperationException();
   }

   public final IBinder onBind(Intent var1) {
      this.c();
      return null;
   }

   public final void onCreate() {
      super.onCreate();
      this.c().v();
   }

   public final void onDestroy() {
      this.c().w();
      super.onDestroy();
   }

   public final int onStartCommand(Intent var1, int var2, int var3) {
      this.c().z(var1, var3);
      return 2;
   }
}
