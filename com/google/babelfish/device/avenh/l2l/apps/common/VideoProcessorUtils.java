package com.google.babelfish.device.avenh.l2l.apps.common;

import java.nio.ByteBuffer;

public final class VideoProcessorUtils {
   static {
      System.loadLibrary("l2l_video_processor_utils_jni");
   }

   public static native void nativeRotateFrame(ByteBuffer var0, int var1, int var2, int var3, ByteBuffer var4);
}
