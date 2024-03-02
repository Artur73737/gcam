package com.google.android.apps.camera.facedeblur.deeprestore.jni;

import java.nio.ByteBuffer;

public final class DeepRestoreNative {
   static {
      .mhw.a(DeepRestoreNative.class, "gcastartup");
   }

   private DeepRestoreNative() {
   }

   public static native long createHandle(String var0, ByteBuffer var1, String var2, boolean var3, boolean var4, boolean var5);

   public static native int deepRestoreFaceDeblurRgb(long var0, long var2, long var4, float var6, long[] var7, long[] var8, boolean var9, boolean var10, long var11, int var13);

   public static native void releaseHandle(long var0);
}
