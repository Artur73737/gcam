package com.google.android.libraries.camera.gyro.hardwarebuffer;

import android.hardware.HardwareBuffer;

public class ReadHardwareBufferJniFunctions {
   static {
      .mhw.a(ReadHardwareBufferJniFunctions.class, "hardwarebuffer-jni");
   }

   public static native boolean isSupported();

   public static native boolean readHardwareBuffer(HardwareBuffer var0, byte[] var1, int var2, int var3, int var4);
}
