package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.camera.facemetadata.jni.Mc.gREaEL;

public class PlayCoreDialogWrapperActivity extends Activity {
   private ResultReceiver a;

   private final void a() {
      ResultReceiver var1 = this.a;
      if (var1 != null) {
         var1.send(3, new Bundle());
      }

   }

   protected final void onActivityResult(int var1, int var2, Intent var3) {
      super.onActivityResult(var1, var2, var3);
      if (var1 == 0) {
         ResultReceiver var4 = this.a;
         if (var4 != null) {
            if (var2 == -1) {
               var4.send(1, new Bundle());
            } else if (var2 == 0) {
               var4.send(2, new Bundle());
            }
         }
      }

      this.finish();
   }

   protected final void onCreate(Bundle var1) {
      Intent var3 = this.getIntent();
      String var4 = gREaEL.bmpgMwvFBa;
      int var2 = var3.getIntExtra(var4, 0);
      if (var2 != 0) {
         this.getWindow().getDecorView().setSystemUiVisibility(var2);
         var3 = new Intent();
         var3.putExtra(var4, var2);
      } else {
         var3 = null;
      }

      super.onCreate(var1);
      if (var1 == null) {
         this.a = (ResultReceiver)this.getIntent().getParcelableExtra("result_receiver");
         var1 = this.getIntent().getExtras();
         if (var1 == null) {
            this.a();
            this.finish();
         } else {
            PendingIntent var6 = (PendingIntent)var1.get("confirmation_intent");

            try {
               this.startIntentSenderForResult(var6.getIntentSender(), 0, var3, 0, 0, 0);
            } catch (SendIntentException var5) {
               this.a();
               this.finish();
            }
         }
      } else {
         this.a = (ResultReceiver)var1.getParcelable("result_receiver");
      }
   }

   protected final void onSaveInstanceState(Bundle var1) {
      var1.putParcelable("result_receiver", this.a);
   }
}
