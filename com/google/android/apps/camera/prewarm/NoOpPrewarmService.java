package com.google.android.apps.camera.prewarm;

import android.content.Intent;
import android.service.media.CameraPrewarmService;

public class NoOpPrewarmService extends CameraPrewarmService {
   public static final .pds a = .pds.h("com.google.android.apps.camera.prewarm.NoOpPrewarmService");
   public .mcm b;
   public .jqt c;
   public .jqs d;
   public .kok e;

   public final void onCooldown(boolean var1) {
      this.b.a();
      .jqs var3 = this.d;
      .qfi var2 = .pka.aw.O();
      .pjz var5 = .pjz.q;
      if (!var2.b.ad()) {
         var2.p();
      }

      .pka var4 = (.pka)var2.b;
      var4.d = var5.at;
      var4.a |= 1;
      .qfi var7 = .pkg.c.O();
      if (!var7.b.ad()) {
         var7.p();
      }

      .pkg var6 = (.pkg)var7.b;
      var6.b = 2;
      var6.a |= 1;
      if (!var2.b.ad()) {
         var2.p();
      }

      var4 = (.pka)var2.b;
      .pkg var8 = (.pkg)var7.i();
      var8.getClass();
      var4.q = var8;
      var4.a |= 131072;
      var3.F(var2);
   }

   public final void onCreate() {
      ((.iwv)((.gsr)this.getApplication()).e(.iwv.class)).o(this);
      super.onCreate();
      this.c.a();
   }

   public final void onPrewarm() {
      this.b.b(new .iwk(this, 6));
      .jqs var1 = this.d;
      .qfi var2 = .pka.aw.O();
      .pjz var3 = .pjz.q;
      if (!var2.b.ad()) {
         var2.p();
      }

      .pka var4 = (.pka)var2.b;
      var4.d = var3.at;
      var4.a |= 1;
      .qfi var7 = .pkg.c.O();
      if (!var7.b.ad()) {
         var7.p();
      }

      .pkg var5 = (.pkg)var7.b;
      var5.b = 1;
      var5.a |= 1;
      if (!var2.b.ad()) {
         var2.p();
      }

      .pka var6 = (.pka)var2.b;
      .pkg var8 = (.pkg)var7.i();
      var8.getClass();
      var6.q = var8;
      var6.a |= 131072;
      var1.F(var2);
   }

   public final int onStartCommand(Intent var1, int var2, int var3) {
      ((.ekm)this.getApplicationContext()).b().l(2);
      if (!this.e.F()) {
         ((.pdq)a.b().I(3370)).q("KeepAlive is off. Prewarm ran, but the service won't stick.");
         return 2;
      } else {
         return 1;
      }
   }
}
