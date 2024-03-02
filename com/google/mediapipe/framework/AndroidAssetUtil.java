package com.google.mediapipe.framework;

import android.content.Context;

public final class AndroidAssetUtil {
   public static void a(Context var0) {
      synchronized(AndroidAssetUtil.class){}

      try {
         nativeInitializeAssetManager(var0, var0.getCacheDir().getAbsolutePath());
      } finally {
         ;
      }

   }

   private static native boolean nativeInitializeAssetManager(Context var0, String var1);
}
