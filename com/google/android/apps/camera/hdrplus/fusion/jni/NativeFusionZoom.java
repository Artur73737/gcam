package com.google.android.apps.camera.hdrplus.fusion.jni;

import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

public class NativeFusionZoom {
   public static final boolean a(.glw var0) {
      return nativeLoadModelIntoCache(var0.J());
   }

   public static native long nativeClone(long var0, long var2);

   public static native boolean nativeInitialize(String var0, String var1, Boolean var2);

   private static native boolean nativeLoadModelIntoCache(byte[] var0);

   public static native long nativeProcess(byte[] var0, byte[] var1, InterleavedU8ClientAllocator var2, FusionProgressCallback var3);

   public static native long nativeRetrieveMoreDebugImage(long var0, long var2);

   public static native int nativeRetrieveResultStatus(long var0);
}
