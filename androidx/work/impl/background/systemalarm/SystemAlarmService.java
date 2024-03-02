package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import com.google.android.apps.lightcycle.panorama.vSAD.IUDuAuCIaH;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class SystemAlarmService extends .cmf implements .dcj {
   private .dcl a;
   private boolean b;

   static {
      .dae.b(IUDuAuCIaH.DbSdYumRbWcjB);
   }

   private final void b() {
      .dcl var1 = new .dcl(this);
      this.a = var1;
      if (var1.i != null) {
         .dae.a();
         Log.e(.dcl.a, "A completion listener for SystemAlarmDispatcher already exists.");
      } else {
         var1.i = this;
      }
   }

   public final void a() {
      this.b = true;
      .dae.a();
      LinkedHashMap var2 = new LinkedHashMap();
      .dgp var1 = .dgp.a;
      synchronized(var1){}

      try {
         var2.putAll(.dgp.b);
      } finally {
         ;
      }

      Iterator var6 = var2.entrySet().iterator();

      while(var6.hasNext()) {
         Entry var3 = (Entry)var6.next();
         WakeLock var7 = (WakeLock)var3.getKey();
         String var9 = (String)var3.getValue();
         if (var7 != null && var7.isHeld()) {
            .dae.a();
            String var8 = String.valueOf(var9);
            Log.w(.dgo.a, "WakeLock held for ".concat(var8));
         }
      }

      this.stopSelf();
   }

   public final void onCreate() {
      super.onCreate();
      this.b();
      this.b = false;
   }

   public final void onDestroy() {
      super.onDestroy();
      this.b = true;
      this.a.b();
   }

   public final int onStartCommand(Intent var1, int var2, int var3) {
      super.onStartCommand(var1, var2, var3);
      if (this.b) {
         .dae.a();
         this.a.b();
         this.b();
         this.b = false;
      }

      if (var1 != null) {
         this.a.d(var1, var3);
      }

      return 3;
   }
}
