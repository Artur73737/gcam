package com.google.android.apps.camera.legacy.lightcycle.panorama;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class LightCycle$LightCycleProgressCallback {
   private LightCycle$LightCycleProgressCallback() {
   }

   // $FF: synthetic method
   public LightCycle$LightCycleProgressCallback(.hdp var1) {
      this();
   }

   public static void onProgress(int var0, int var1) {
      Map var5 = .hdq.c;
      Integer var4 = var0;
      if (var5.containsKey(var4)) {
         .hej var27 = (.hej).hdq.c.get(var4);
         AtomicBoolean var26 = var27.d.b;
         synchronized(var26){}

         label230: {
            Throwable var10000;
            boolean var10001;
            label231: {
               try {
                  if (var27.d.b.get()) {
                     return;
                  }
               } catch (Throwable var25) {
                  var10000 = var25;
                  var10001 = false;
                  break label231;
               }

               try {
                  var27.d.a.b.b(.mhr.c(var1));
                  long var2 = var27.c.length();
                  if (var2 != var27.a) {
                     var27.d.a.b.K();
                     var27.a = var2;
                  }
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label231;
               }

               label217:
               try {
                  break label230;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label217;
               }
            }

            while(true) {
               Throwable var28 = var10000;

               try {
                  throw var28;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  continue;
               }
            }
         }

         var27.d.h();
      }
   }
}
