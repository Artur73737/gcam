package com.google.googlex.gcam.creativecamera.portraitmode;

import java.util.concurrent.atomic.AtomicBoolean;

public final class PortraitProcessorInterface implements AutoCloseable {
   private static final AtomicBoolean b = new AtomicBoolean();
   public long a = 0L;

   public PortraitProcessorInterface(long var1, long var3, boolean var5) {
      if (b.compareAndSet(false, true)) {
         init();
      }

      this.a = this.create(var1, var3, var5, false, false);
   }

   private native long create(long var1, long var3, boolean var5, boolean var6, boolean var7);

   private native long createWithLevels(long var1, long var3, int var5, int var6, boolean var7, boolean var8);

   private native void delete(long var1);

   private static native void init();

   public final void close() {
      this.delete(this.a);
      this.a = 0L;
   }

   public native boolean processImpl(long var1, long var3, long var5, long var7, long var9, long var11, long var13, boolean var15);
}
