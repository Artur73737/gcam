package com.google.android.apps.camera.jni.faceobfuscation;

import android.hardware.HardwareBuffer;

public final class GpuRedactorNative {
   static {
      .mhw.a(GpuRedactorNative.class, "gcastartup");
      init();
   }

   private GpuRedactorNative() {
   }

   public static native long createRedactor(boolean var0);

   public static native void init();

   public static native boolean process(long var0, HardwareBuffer var2, boolean var3, HardwareBuffer var4, boolean var5, int var6, int var7, Object[] var8, float var9);

   public static native void releaseRedactor(long var0);
}
