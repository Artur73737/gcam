package com.google.android.apps.camera.jni.lensoffset;

public final class LensOffsetQueueNative {
   static {
      .mhw.a(LensOffsetQueueNative.class, "gcastartup");
   }

   private LensOffsetQueueNative() {
   }

   public static native long createHandle(int var0, int var1, int var2);

   public static native boolean getLensOffsetAtTime(long var0, long var2, float[] var4);

   public static native boolean processAndEnqueueLensOffset(long var0, long var2, float var4, float var5);

   public static native void releaseHandle(long var0);
}
