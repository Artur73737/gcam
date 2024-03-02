package com.google.android.apps.camera.camerafatalerror;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompleteReceiver extends BroadcastReceiver {
   public final void onReceive(Context var1, Intent var2) {
      .cqg.c(var1).edit().putBoolean("pref_key_reboot_completed", true).apply();
   }
}
