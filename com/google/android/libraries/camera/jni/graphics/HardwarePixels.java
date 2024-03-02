package com.google.android.libraries.camera.jni.graphics;

import android.hardware.HardwareBuffer;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

public class HardwarePixels implements .mhq {
   public final HardwareBuffer a;
   public final long b;
   public final AtomicBoolean c = new AtomicBoolean(false);

   public HardwarePixels(HardwareBuffer var1) {
      this.a = HardwareBuffers.fork(var1);
      this.b = nativeLockPlanes(var1, 3L);
   }

   public static native ByteBuffer nativeGetData(long var0, int var2, int var3, int var4);

   private static native long nativeLockPlanes(HardwareBuffer var0, long var1);

   public static native int nativePixelStride(long var0, int var2);

   public static native int nativePlaneCount(long var0);

   public static native int nativeRowStride(long var0, int var2);

   private static native void nativeUnlockBuffer(HardwareBuffer var0);

   public final void close() {
      if (this.c.compareAndSet(false, true)) {
         nativeUnlockBuffer(this.a);
         this.a.close();
      }

   }
}
