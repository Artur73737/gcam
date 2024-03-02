package com.google.vr.ndk.base;

import android.app.Activity;
import android.os.PowerManager;
import android.util.Log;
import android.view.Window;

public final class AndroidCompat {
   private AndroidCompat() {
   }

   public static void setSustainedPerformanceMode(Activity var0, boolean var1) {
      String var2 = .qmx.a;
      if (((PowerManager)var0.getSystemService("power")).isSustainedPerformanceModeSupported()) {
         Window var3 = var0.getWindow();
         if (var3 == null) {
            Log.e(.qmx.a, "Activity does not have a window");
         } else {
            var3.setSustainedPerformanceMode(var1);
         }
      }
   }

   public static boolean setVrModeEnabled(Activity var0, boolean var1) {
      return .qmx.a(var0, var1);
   }
}
