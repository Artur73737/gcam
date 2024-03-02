package com.google.android.apps.camera.jni.eisutil;

import java.nio.ByteBuffer;

public final class FrameUtilNative {
   static {
      .mhw.a(FrameUtilNative.class, "gcastartup");
   }

   public static native void mirrorYUV420888(ByteBuffer var0, int var1, ByteBuffer var2, int var3, ByteBuffer var4, int var5, ByteBuffer var6, int var7, ByteBuffer var8, int var9, ByteBuffer var10, int var11, int var12, int var13, boolean var14);
}
