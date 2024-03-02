package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver.PendingResult;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
   public static final int a = 0;

   static {
      .dae.b("ConstrntProxyUpdtRecvr");
   }

   public final void onReceive(Context var1, Intent var2) {
      String var3;
      if (var2 != null) {
         var3 = var2.getAction();
      } else {
         var3 = null;
      }

      if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(var3)) {
         .dae.a();
      } else {
         PendingResult var4 = this.goAsync();
         .dbu.d(var1).j.f(new .dce(var2, var1, var4, 0));
      }
   }
}
