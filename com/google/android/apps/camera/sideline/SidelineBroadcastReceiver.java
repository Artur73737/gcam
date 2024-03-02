package com.google.android.apps.camera.sideline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SidelineBroadcastReceiver extends BroadcastReceiver {
   public .jja a;
   public .jhd b;

   public final void onReceive(Context var1, Intent var2) {
      ((.jiq)((.gsr)var1.getApplicationContext()).e(.jiq.class)).s(this);
      String var4 = var2.getAction();
      if (var4 != null) {
         byte var3;
         label28: {
            switch(var4.hashCode()) {
            case 798292259:
               if (var4.equals("android.intent.action.BOOT_COMPLETED")) {
                  var3 = 1;
                  break label28;
               }
               break;
            case 1737074039:
               if (var4.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                  var3 = 0;
                  break label28;
               }
            }

            var3 = -1;
         }

         switch(var3) {
         case 0:
            this.b.c(.jgz.ao);
         case 1:
            if (this.a.b()) {
               this.a.a();
            }
         }
      }

   }
}
