package com.google.android.apps.camera.app.silentfeedback;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class SilentFeedbackService extends Service {
   private final Object a = new Object();
   private int b = 0;
   private int c = 0;

   public final void a() {
      Object var3 = this.a;
      synchronized(var3){}

      Integer var2;
      label224: {
         Throwable var10000;
         boolean var10001;
         label225: {
            int var1;
            try {
               var1 = this.b - 1;
               this.b = var1;
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label225;
            }

            if (var1 == 0) {
               try {
                  var2 = this.c;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label225;
               }
            } else {
               var2 = null;
            }

            label211:
            try {
               break label224;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label211;
            }
         }

         while(true) {
            Throwable var24 = var10000;

            try {
               throw var24;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               continue;
            }
         }
      }

      if (var2 != null) {
         this.stopSelf(var2);
      }

   }

   public final IBinder onBind(Intent var1) {
      return null;
   }

   public final int onStartCommand(Intent param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }
}
