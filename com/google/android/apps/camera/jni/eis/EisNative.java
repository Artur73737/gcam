package com.google.android.apps.camera.jni.eis;

public final class EisNative {
   static {
      .mhw.a(EisNative.class, "gcastartup");
   }

   public static native long createHandle(int var0, int var1, int var2, float var3, boolean var4, int var5, String var6);

   public static native int getNumStrips(long var0);

   public static native boolean getTransformBetweenFrames(long var0, long var2, long var4, long var6, long var8, long var10, long var12, long var14, long var16, int var18, int var19, boolean var20, boolean var21, float var22, float var23, float var24, float var25, float var26, float var27, int var28, int var29, int var30, float[] var31);

   public static native long processFrame(long var0, byte[] var2, int var3, int var4, long var5, long var7, long var9, long var11, float var13, float var14, float var15, boolean var16, long var17, float[] var19, float[] var20, float[] var21, int var22, boolean var23);

   public static native boolean processGyro(long var0, float var2, float var3, float var4, long var5);

   public static native boolean processLensOffset(long var0, float var2, float var3, long var4, int var6);

   public static native void releaseHandle(long var0);

   public static native void setActiveArraySize(long var0, int var2, int var3);

   public static native void setCropWindowSize(long var0, int var2, int var3);

   public static native void setStabilizationStrength(long var0, float var2);
}
