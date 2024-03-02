package com.google.android.apps.camera.keepalive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class KeepAliveBroadcastReceiver extends BroadcastReceiver {
   public .gtz a;

   public final void onReceive(Context var1, Intent var2) {
      ((.gua)((.gsr)var1.getApplicationContext()).e(.gua.class)).h(this);
      if (this.a.a()) {
         var2.getAction();
         .kok.G(var1);
      }
   }
}
