package com.google.android.apps.camera.jni.facebeautification;

import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;
import java.nio.ByteBuffer;

public final class FaceBeautificationNative {
   static {
      .mhw.a(FaceBeautificationNative.class, "gcastartup");
   }

   private FaceBeautificationNative() {
   }

   public static native long createHandle(int var0, int var1, boolean var2, boolean var3, boolean var4, boolean var5);

   public static native byte[] doFaceBeautification(long var0, int var2, int var3, int var4, ByteBuffer var5, int var6, int var7, ByteBuffer var8, int var9, int var10, ByteBuffer var11, int var12, int var13, FaceToBeautify[] var14, int var15, int var16, long var17);

   public static native void releaseHandle(long var0);
}
