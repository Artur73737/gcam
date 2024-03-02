package com.google.android.apps.camera.processing;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.app.Notification.Builder;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class ProcessingService extends Service implements .ixt {
   private static final .pds v = .pds.h("com.google.android.apps.camera.processing.ProcessingService");
   private static final long w;
   public Builder a;
   public final Object b = new Object();
   public .ixu c;
   public .ixr d;
   public volatile boolean e = false;
   public final Object f = new Object();
   public boolean g;
   public boolean h;
   public boolean i;
   public NotificationManager j;
   public .ixp k;
   public PowerManager l;
   public .cof m;
   public .min n;
   public .mbx o;
   public Handler p;
   public .mvd q;
   public .hhy r;
   public AccessibilityManager s;
   public .hhz t;
   public .gtv u;
   private final .ixo x = new .ixo(this);
   private Thread y;
   private boolean z;

   static {
      w = TimeUnit.SECONDS.toMillis(60L);
   }

   private final void d() {
      if (!this.z) {
         this.z = true;
         ((.ixn)((.gsr)this.getApplication()).e(.ixn.class)).q(this);
         boolean var1 = this.q.a;
         this.j.deleteNotificationChannel("camera");
         Iterator var2 = this.j.getNotificationChannels().iterator();

         do {
            if (!var2.hasNext()) {
               NotificationChannel var3 = new NotificationChannel("processing", this.getText(2132018298), 2);
               var3.setShowBadge(false);
               this.j.createNotificationChannel(var3);
               return;
            }
         } while(!"processing".equals(((NotificationChannel)var2.next()).getId()));

      }
   }

   public final void a(.mhr param1) {
      // $FF: Couldn't be decompiled
   }

   public final void b(.kob param1) {
      // $FF: Couldn't be decompiled
   }

   public final void c() {
      Object var1 = this.f;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label205: {
         label210: {
            try {
               if (this.g && !this.i) {
                  this.j.notify(2, this.a.build());
                  this.g = false;
                  this.h = false;
                  Handler var3 = this.p;
                  .iwk var2 = new .iwk(this, 9);
                  var3.postDelayed(var2, 1000L);
                  break label210;
               }
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label205;
            }

            try {
               this.h = true;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label205;
            }
         }

         label193:
         try {
            return;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label193;
         }
      }

      while(true) {
         Throwable var24 = var10000;

         try {
            throw var24;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            continue;
         }
      }
   }

   public final IBinder onBind(Intent var1) {
      return null;
   }

   public final void onCreate() {
      // $FF: Couldn't be decompiled
   }

   public final void onDestroy() {
      this.c.b();
      this.u.b();
      this.m.c(this.x);
      this.stopForeground(true);
      .hhz var1 = this.t;
      .qfi var2 = .pka.aw.O();
      .qfi var4 = .plr.c.O();
      if (!var4.b.ad()) {
         var4.p();
      }

      .plr var3 = (.plr)var4.b;
      var3.b = 2;
      var3.a |= 1;
      if (!var2.b.ad()) {
         var2.p();
      }

      .pka var39 = (.pka)var2.b;
      .plr var41 = (.plr)var4.i();
      var41.getClass();
      var39.au = var41;
      var39.c |= 2097152;
      var1.a((.pka)var2.i());
      .ixp var40 = this.k;
      Object var37 = var40.a;
      synchronized(var37){}

      Throwable var10000;
      boolean var10001;
      label383: {
         .psq var35;
         label384: {
            label374: {
               try {
                  var40.f = 3;
                  if (!var40.c) {
                     break label374;
                  }

                  var40.c = false;
                  var40.b();
               } catch (Throwable var34) {
                  var10000 = var34;
                  var10001 = false;
                  break label383;
               }

               var35 = null;
               break label384;
            }

            try {
               if (var40.b.isEmpty()) {
                  var35 = var40.e;
                  var40.e = .psq.g();
                  break label384;
               }
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label383;
            }

            try {
               IllegalStateException var36 = new IllegalStateException("Service destroyed, not restarting but queue has items.");
               throw var36;
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label383;
            }
         }

         try {
            ;
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            break label383;
         }

         if (var35 != null) {
            var35.e(Object.class);
         }

         return;
      }

      while(true) {
         Throwable var38 = var10000;

         try {
            throw var38;
         } catch (Throwable var30) {
            var10000 = var30;
            var10001 = false;
            continue;
         }
      }
   }

   public final int onStartCommand(Intent param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final void onTimeout(int var1) {
      ((.pdq)v.c().I(3381)).q("Timeout imminent, shots may be dropped!");
      .hhz var2 = this.t;
      .qfi var3 = .pka.aw.O();
      .qfi var4 = .plr.c.O();
      if (!var4.b.ad()) {
         var4.p();
      }

      .plr var5 = (.plr)var4.b;
      var5.b = 3;
      var5.a |= 1;
      if (!var3.b.ad()) {
         var3.p();
      }

      .pka var7 = (.pka)var3.b;
      .plr var6 = (.plr)var4.i();
      var6.getClass();
      var7.au = var6;
      var7.c |= 2097152;
      var2.a((.pka)var3.i());
   }
}
