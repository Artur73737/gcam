package com.google.googlex.gcam;

import android.hardware.HardwareBuffer;

public class LockedHardwareBuffer implements AutoCloseable {
   private long a;

   private LockedHardwareBuffer(HardwareBuffer var1, long var2) {
      var1.getClass();
      var2 = lockHardwareBuffer(var1, var2);
      this.a = var2;
      boolean var4;
      if (var2 != 0L) {
         var4 = true;
      } else {
         var4 = false;
      }

      .onk.x(var4, "Failed to lock HardwareBuffer.");
   }

   public static LockedHardwareBuffer c(HardwareBuffer var0, long var1) {
      return new LockedHardwareBuffer(var0, var1);
   }

   private static native long getInterleavedReadViewU8Impl(long var0);

   private static native long getInterleavedWriteViewU8Impl(long var0);

   private static native long lockHardwareBuffer(HardwareBuffer var0, long var1);

   private static native void unlockHardwareBuffer(long var0);

   public final InterleavedReadViewU8 a() {
      return new InterleavedReadViewU8(getInterleavedReadViewU8Impl(this.a));
   }

   public final InterleavedWriteViewU8 b() {
      return new InterleavedWriteViewU8(getInterleavedWriteViewU8Impl(this.a));
   }

   public final void close() {
      long var1 = this.a;
      if (var1 != 0L) {
         unlockHardwareBuffer(var1);
         this.a = 0L;
      }

   }
}
