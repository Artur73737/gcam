package com.google.android.apps.camera.jni.gyro;

public final class GyroQueueNative {
   static {
      .mhw.a(GyroQueueNative.class, "gcastartup");
   }

   public static native long createHandle(int[] var0, int[] var1);

   public static native boolean getProjectionMatrix(long var0, long var2, float var4, float var5, float var6, long var7, float[] var9);

   public static native boolean getTransformBetweenTime(long var0, long var2, float var4, float var5, float var6, long var7, float var9, float var10, float var11, long var12, float[] var14);

   public static native boolean processAndEnqueueGyro(long var0, float var2, float var3, float var4, long var5);

   public static native void releaseHandle(long var0);
}
