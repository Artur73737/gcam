package com.google.googlex.gcam.creativecamera.portraitmode;

import java.util.concurrent.atomic.AtomicBoolean;

public final class PortraitRelightingProcessorInterface {
   private static final AtomicBoolean a = new AtomicBoolean();

   public PortraitRelightingProcessorInterface() {
      if (a.compareAndSet(false, true)) {
         init();
      }

   }

   private static native void init();

   public native long getPortraitRelightingProcessorHandle();

   public native boolean initPortraitRelightingProcessor(String var1, boolean var2, boolean var3, boolean var4, byte[] var5, byte[] var6, byte[] var7, byte[] var8, byte[] var9, byte[] var10);

   public native void release();

   public native boolean reload();

   public native void unload();
}
