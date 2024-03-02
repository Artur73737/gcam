package com.google.android.apps.camera.keepalive;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;

public class ProcessGcService extends JobService {
   public static final .pds a = .pds.h("com.google.android.apps.camera.keepalive.ProcessGcService");
   public .gtv b;
   public Handler c;
   public .jqs d;
   public .nex e;
   private boolean f = false;

   public final void a(int var1) {
      .jqs var6 = this.d;
      .qfi var7 = .pny.d.O();
      if (!var7.b.ad()) {
         var7.p();
      }

      .pny var8 = (.pny)var7.b;
      var8.b = var1 - 1;
      var8.a |= 1;
      long var4 = SystemClock.uptimeMillis();
      long var2 = Process.getStartUptimeMillis();
      if (!var7.b.ad()) {
         var7.p();
      }

      var8 = (.pny)var7.b;
      var8.a |= 2;
      var8.c = var4 - var2;
      .pny var12 = (.pny)var7.i();
      .qfi var13 = .pka.aw.O();
      .pjz var9 = .pjz.ak;
      if (!var13.b.ad()) {
         var13.p();
      }

      .qfn var11 = var13.b;
      .pka var10 = (.pka)var11;
      var10.d = var9.at;
      var10.a |= 1;
      if (!var11.ad()) {
         var13.p();
      }

      .pka var14 = (.pka)var13.b;
      var12.getClass();
      var14.ak = var12;
      var14.c |= 2048;
      var6.F(var13);
   }

   public final boolean onStartJob(JobParameters var1) {
      if (!this.f) {
         ((.gud)((.gsr)this.getApplication()).e(.gud.class)).i(this);
         this.f = true;
      }

      if (var1.getExtras().getLong("keepalive_sig", -1L) != this.e.a) {
         this.a(4);
         .kok.G(this);
         return false;
      } else {
         this.c.post(new .gfk(this, var1, 16));
         return true;
      }
   }

   public final boolean onStopJob(JobParameters var1) {
      return false;
   }
}
