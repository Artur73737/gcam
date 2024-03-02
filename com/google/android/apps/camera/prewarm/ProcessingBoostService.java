package com.google.android.apps.camera.prewarm;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import java.util.concurrent.Executor;

public class ProcessingBoostService extends Service {
   public .gha a;
   public Executor b;
   private final Messenger c = new Messenger(new .iww(this));

   public final IBinder onBind(Intent var1) {
      return this.c.getBinder();
   }
}
