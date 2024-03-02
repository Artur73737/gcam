package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver.PendingResult;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
   public final void onReceive(Context var1, Intent var2) {
      String var7 = var2.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
      if (var7 != null) {
         if (!var7.contains("../") && !var7.contains("/..")) {
            .nsp var3 = .nsp.a(var1);
            Map var5 = .nty.a(var1);
            if (!var5.isEmpty()) {
               .nty var4 = (.nty)var5.get(var7);
               if (var4 != null && var4.e == 7) {
                  PendingResult var6 = this.goAsync();
                  .prx var8 = (.prx).osh.aB(.pqp.j(.prx.q(.pqp.i(.prx.q(.nua.b(var3).a()), new .nrq(var7, 3), var3.b())), new .nue(var4, var7, var3, 0), var3.b()), 25L, TimeUnit.SECONDS, var3.b());
                  var8.c(new .mni(var8, var7, var6, 8), var3.b());
               }
            }
         } else {
            Log.w("PhenotypeBackgroundRecv", .c.aA(var7, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
         }
      }
   }
}
