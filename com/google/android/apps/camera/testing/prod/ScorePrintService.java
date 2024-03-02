package com.google.android.apps.camera.testing.prod;

import android.app.IntentService;
import android.content.Intent;

public class ScorePrintService extends IntentService {
   private static final .pds a = .pds.h("com.google.android.apps.camera.testing.prod.ScorePrintService");

   public ScorePrintService() {
      super("CAM_ScorePrintService");
   }

   protected final void onHandleIntent(Intent var1) {
      if (var1 == null) {
         ((.pdq)a.c().I(3993)).q("No intent is given.");
      } else {
         .jun var2 = (.jun)((.qrz)((.jul)this.getApplication()).fB(new .kfq((byte[])null)).a).get();
         if (var2 == null) {
            ((.pdq)a.c().I(3992)).q("The service isn't enabled.");
         } else {
            var2.a(var1);
         }
      }
   }
}
