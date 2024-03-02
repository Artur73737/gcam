package com.google.googlex.gcam.creativecamera.portraitmode;

import com.google.googlex.gcam.base.function.LongConsumer;
import com.google.googlex.gcam.base.function.LongFloatConsumer;
import com.google.googlex.gcam.base.function.LongStringConsumer;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PortraitOutputsInterface {
   private static final AtomicBoolean a = new AtomicBoolean();

   public PortraitOutputsInterface() {
      if (a.compareAndSet(false, true)) {
         init();
      }

   }

   private static native void init();

   public native void setCompleteCallback(long var1, LongConsumer var3);

   public native void setDebugHardwareBufferCallback(long var1, PortraitOpaqueHandleCallback var3);

   public native void setDebugImageCallback(long var1, PortraitImageCallback var3);

   public native void setDebugRgbAllocator(long var1, InterleavedU8ClientAllocator var3);

   public native void setHardwareBufferCallback(long var1, PortraitOpaqueHandleCallback var3);

   public native void setImageCallback(long var1, PortraitImageCallback var3);

   public native void setLogCallback(long var1, LongStringConsumer var3);

   public native void setProgressCallback(long var1, LongFloatConsumer var3);

   public native void setRgbAllocator(long var1, InterleavedU8ClientAllocator var3);

   public native void setSecondaryHardwareBufferCallback(long var1, PortraitOpaqueHandleCallback var3);

   public native void setSecondaryImageCallback(long var1, PortraitImageCallback var3);

   public native void setUpsampledInputHardwareBufferCallback(long var1, PortraitOpaqueHandleCallback var3);

   public native void setUpsampledInputImageCallback(long var1, PortraitImageCallback var3);
}
