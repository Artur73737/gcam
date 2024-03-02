package com.google.android.apps.camera.wear.wearv2;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import java.util.concurrent.Executors;

public class InstallWearRequestReceiver extends BroadcastReceiver {
   public final void onReceive(Context var1, Intent var2) {
      if ("com.google.android.apps.camera.wear.INSTALL_WEAR".equals(var2.getAction())) {
         Toast.makeText(var1, 2132018681, 0).show();
         .ve var6 = new .ve(var1, Executors.newSingleThreadExecutor());
         Intent var5 = (new Intent("android.intent.action.VIEW")).setData(Uri.parse("market://details?id=com.google.android.GoogleCamera")).addCategory("android.intent.category.BROWSABLE");
         var5.getClass();
         .car.y(new .jir(var5, var6, 1));
         int var3 = .ccd.a;
         ((NotificationManager)var1.getSystemService("notification")).cancel((String)null, 1002);
         boolean var4 = var2.getBooleanExtra("isPhone", false);
         .cof.a(var1).d((new Intent("com.google.android.apps.camera.wear.INSTALL_WEAR_EVENT")).setPackage(var1.getPackageName()).putExtra("isPhone", var4));
      } else {
         throw new UnsupportedOperationException("unknown intent");
      }
   }
}
