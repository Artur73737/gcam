package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.util.ArrayList;

public class GvrApi {
   static {
      "robolectric".equals(Build.FINGERPRINT);
      ThreadPolicy var1 = StrictMode.allowThreadDiskReads();

      try {
         .qnv.a();
      } finally {
         StrictMode.setThreadPolicy(var1);
      }

   }

   private static native long nativeGetUserPrefs(long var0);

   private static native boolean nativeIsFeatureSupported(long var0, int var2);

   public static native boolean nativeUserPrefsIsFeatureEnabled(long var0, int var2);

   private static void requestFeatures(Context var0, long var1, int[] var3, int[] var4, PendingIntent var5) {
      .qnx[] var10 = .qnx.a(var3);
      .qnx[] var14 = .qnx.a(var4);
      .qny var13 = new .qny(nativeGetUserPrefs(var1));
      Intent var9 = (new Intent("com.google.intent.action.vr.REQUEST_FEATURE")).setComponent(.qnp.a).setFlags(268435456);
      ArrayList var11 = new ArrayList();
      int var8 = var10.length;
      byte var7 = 0;

      int var6;
      for(var6 = 0; var6 < var8; ++var6) {
         .qnx var12 = var10[var6];
         if (nativeIsFeatureSupported(var1, var12.c) && !var13.a(var12)) {
            var11.add(var12.d);
         }
      }

      if (!var11.isEmpty()) {
         var9.putExtra("required_features", (String[])var11.toArray(new String[var11.size()]));
      }

      var11 = new ArrayList();
      var8 = var14.length;

      for(var6 = var7; var6 < var8; ++var6) {
         .qnx var15 = var14[var6];
         if (nativeIsFeatureSupported(var1, var15.c) && !var13.a(var15)) {
            var11.add(var15.d);
         }
      }

      if (!var11.isEmpty()) {
         var9.putExtra("optional_features", (String[])var11.toArray(new String[var11.size()]));
      }

      if (var9.getExtras() != null) {
         var9.putExtra("pending_intent", var5);
         var0.startActivity(var9);
      }

   }

   public long getNativeGvrContext() {
      throw null;
   }
}
