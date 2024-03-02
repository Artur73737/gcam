package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;

public class DiagnosticsReceiver extends BroadcastReceiver {
   private static final String a = .dae.b("DiagnosticsRcvr");

   public final void onReceive(Context var1, Intent var2) {
      if (var2 != null) {
         .dae.a();

         try {
            .dbu var5 = .dbu.d(var1);
            .dam var7 = new .dam(DiagnosticsWorker.class);
            List var8 = Collections.singletonList(var7.b());
            if (!var8.isEmpty()) {
               .dbj var3 = new .dbj(var5, (String)null, 2, var8);
               var3.c();
            } else {
               IllegalArgumentException var6 = new IllegalArgumentException("enqueue needs at least one WorkRequest.");
               throw var6;
            }
         } catch (IllegalStateException var4) {
            .dae.a();
            Log.e(a, "WorkManager is not initialized", var4);
         }
      }
   }
}
