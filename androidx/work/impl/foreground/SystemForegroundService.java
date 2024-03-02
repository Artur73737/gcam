package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.memorymonitor.Xhk.PUdPFKr;
import java.util.UUID;

public class SystemForegroundService extends .cmf implements .ddz {
   public static final String a = .dae.b("SystemFgService");
   .dea b;
   public NotificationManager c;
   private Handler d;
   private boolean e;

   private final void e() {
      this.d = new Handler(Looper.getMainLooper());
      this.c = (NotificationManager)this.getApplicationContext().getSystemService("notification");
      .dea var1 = new .dea(this.getApplicationContext());
      this.b = var1;
      if (var1.h != null) {
         .dae.a();
         Log.e(.dea.a, "A callback already exists.");
      } else {
         var1.h = this;
      }
   }

   public final void a(int var1) {
      this.d.post(new .cdb(this, var1, 3, (byte[])null));
   }

   public final void b(int var1, Notification var2) {
      this.d.post(new .on(this, var1, var2, 3));
   }

   public final void c(int var1, int var2, Notification var3) {
      this.d.post(new .jyt(this, var1, var3, var2, 1));
   }

   public final void d() {
      this.e = true;
      .dae.a();
      this.stopForeground(true);
      this.stopSelf();
   }

   public final void onCreate() {
      super.onCreate();
      this.e();
   }

   public final void onDestroy() {
      super.onDestroy();
      this.b.c();
   }

   public final int onStartCommand(Intent var1, int var2, int var3) {
      super.onStartCommand(var1, var2, var3);
      if (this.e) {
         .dae.a();
         this.b.c();
         this.e();
         this.e = false;
      }

      if (var1 != null) {
         .dea var4 = this.b;
         String var5 = var1.getAction();
         StringBuilder var10;
         if (PUdPFKr.OaRKBOjZu.equals(var5)) {
            .dae.a();
            var10 = new StringBuilder();
            var10.append("Started foreground service ");
            var10.append(var1);
            var1.toString();
            var5 = var1.getStringExtra("KEY_WORKSPEC_ID");
            var4.j.f(new .ddy(var4, var5, 0));
            var4.b(var1);
         } else if ("ACTION_NOTIFY".equals(var5)) {
            var4.b(var1);
         } else if ("ACTION_CANCEL_WORK".equals(var5)) {
            .dae.a();
            var10 = new StringBuilder();
            var10.append("Stopping foreground work for ");
            var10.append(var1);
            var1.toString();
            String var6 = var1.getStringExtra("KEY_WORKSPEC_ID");
            if (var6 != null && !TextUtils.isEmpty(var6)) {
               .dbu var9 = var4.b;
               .dga var7 = new .dga(var9, UUID.fromString(var6));
               var9.j.f(var7);
            }
         } else if ("ACTION_STOP_FOREGROUND".equals(var5)) {
            .dae.a();
            .ddz var8 = var4.h;
            if (var8 != null) {
               var8.d();
            }
         }
      }

      return 3;
   }
}
