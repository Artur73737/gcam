package com.google.vr.cardboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import com.google.android.apps.camera.contentprovider.Eboh.wAtBWCNpqMjxj;

public class VrParamsProviderJni {
   private static void a(long var0, DisplayMetrics var2, float var3, int var4) {
      nativeUpdateNativeDisplayParamsPointer(var0, var2.widthPixels, var2.heightPixels, var2.xdpi, var2.ydpi, var3, var4);
   }

   private static native void nativeUpdateNativeDisplayParamsPointer(long var0, int var2, int var3, float var4, float var5, float var6, int var7);

   private static byte[] readDeviceParams(Context var0) {
      .qno var2 = .pgn.V(var0);
      .qoa var1 = var2.b();
      var2.e();
      return var1 == null ? null : var1.J();
   }

   private static void readDisplayParams(Context var0, long var1) {
      if (var0 == null) {
         Log.w("VrParamsProviderJni", "Missing context for phone params lookup. Results may be invalid.");
         a(var1, Resources.getSystem().getDisplayMetrics(), .pgn.W((.qob)null), 0);
      } else {
         .qno var6 = .pgn.V(var0);
         .qob var5 = var6.c();
         var6.e();
         Display var7 = .pgn.Y(var0);
         DisplayMetrics var9 = .pgn.X(var7);
         if (var5 != null) {
            if ((var5.a & 1) != 0) {
               var9.xdpi = var5.b;
            }

            if ((var5.a & 2) != 0) {
               var9.ydpi = var5.c;
            }
         }

         float var3 = .pgn.W(var5);
         int var4 = .qmy.a;
         DisplayCutout var8 = var7.getCutout();
         if (var0.getResources().getConfiguration().orientation == 1) {
            var4 = .qmy.a("getSafeInsetTop", var8) + .qmy.a(wAtBWCNpqMjxj.OLiLuWMxuLJRB, var8);
         } else {
            var4 = .qmy.a("getSafeInsetLeft", var8) + .qmy.a("getSafeInsetRight", var8);
         }

         a(var1, var9, var3, var4);
      }
   }

   private static byte[] readSdkConfigurationParams(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private static byte[] readUserPrefs(Context var0) {
      .qno var1 = .pgn.V(var0);
      .qoc var2 = var1.d();
      var1.e();
      return var2 == null ? null : var2.J();
   }

   private static boolean writeDeviceParams(Context param0, byte[] param1) {
      // $FF: Couldn't be decompiled
   }
}
