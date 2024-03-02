package com.google.android.apps.camera.jni.tracking;

import android.content.Context;
import android.hardware.HardwareBuffer;
import java.nio.ByteBuffer;

public final class RoiTrackerNative {
   static {
      .mhw.a(RoiTrackerNative.class, "gcastartup");
   }

   private RoiTrackerNative() {
   }

   public static native long createHandle(Context var0, String var1, int var2, boolean var3, int var4, long var5, long var7, int var9, long var10, long var12, boolean var14);

   public static native int getCurrentTrackerIndex(long var0);

   public static native boolean getIsRefresherCalled(long var0);

   public static native void releaseHandle(long var0);

   public static native int startTracking(long var0, boolean var2, int var3, int var4, float var5, int var6, int var7, ByteBuffer var8, int var9, int var10, ByteBuffer var11, int var12, int var13, ByteBuffer var14, int var15, int var16, HardwareBuffer var17, float[] var18, boolean var19, int var20);

   public static native void stopTracking(long var0);

   public static native int updateRoi(long var0, int var2, float var3, int var4, int var5, ByteBuffer var6, int var7, int var8, ByteBuffer var9, int var10, int var11, ByteBuffer var12, int var13, int var14, float[] var15, HardwareBuffer var16, float[] var17, boolean var18, int var19);
}
