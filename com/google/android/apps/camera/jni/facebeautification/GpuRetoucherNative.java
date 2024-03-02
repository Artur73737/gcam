package com.google.android.apps.camera.jni.facebeautification;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify2;

public final class GpuRetoucherNative {
   static {
      .mhw.a(GpuRetoucherNative.class, "gcastartup");
   }

   private GpuRetoucherNative() {
   }

   public static native long createRetoucher(boolean var0, int var1);

   public static native boolean process(long var0, HardwareBuffer var2, boolean var3, HardwareBuffer var4, boolean var5, int var6, int var7, FaceToBeautify2[] var8, int var9);

   public static native void releaseRetoucher(long var0);
}
