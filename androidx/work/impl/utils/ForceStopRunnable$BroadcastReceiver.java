package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
   static {
      .dae.b("ForceStopRunnable$Rcvr");
   }

   public final void onReceive(Context var1, Intent var2) {
      if (var2 != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(var2.getAction())) {
         .dae.a();
         long var3 = .dge.a;
         AlarmManager var8 = (AlarmManager)var1.getSystemService("alarm");
         PendingIntent var7 = .dge.a(var1, 167772160);
         long var5 = System.currentTimeMillis();
         var3 = .dge.a;
         if (var8 != null) {
            var8.setExact(0, var5 + var3, var7);
         }
      }

   }
}
