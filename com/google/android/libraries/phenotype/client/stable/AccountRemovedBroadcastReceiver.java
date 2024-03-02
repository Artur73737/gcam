package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver.PendingResult;
import android.util.Log;
import java.io.IOException;

public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
   public final void onReceive(Context var1, Intent var2) {
      if ("android.accounts.action.ACCOUNT_REMOVED".equals(var2.getAction())) {
         String var3 = var2.getStringExtra("accountType");
         if ("com.google".equals(var3) || "com.google.work".equals(var3) || "cn.google".equals(var3) || "__logged_out_type".equals(var3)) {
            String var5 = var2.getExtras().getString("authAccount");
            if (!var5.contains("../") && !var5.contains("/..")) {
               .nsp.d();
               .nsp var4 = .nsp.a(var1);
               PendingResult var6 = this.goAsync();
               .osh.ao(.ppw.i(.pqp.j(.prx.q(.nua.b(var4).b(new .nrq(var5, 5), var4.b())), new .icc(var4, var5, 4), var4.b()), IOException.class, .nit.g, .pre.a), var4.b().a(new .nto(var1, var5, 1))).a(new .mft(var6, 13), .pre.a);
            } else {
               Log.w("AccountRemovedRecv", .c.aA(var5, "Got an invalid account name for P/H that includes '..':", ". Exiting."));
            }
         }
      }
   }
}
