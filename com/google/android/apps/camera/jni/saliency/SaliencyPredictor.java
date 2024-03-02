package com.google.android.apps.camera.jni.saliency;

import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SaliencyPredictor {
   public long a;
   public final AtomicBoolean b = new AtomicBoolean(true);

   static {
      try {
         System.loadLibrary("saliency_predictor_jni");
      } catch (UnsatisfiedLinkError var1) {
         if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            throw var1;
         }
      }
   }

   private native void nativeClose(long var1);

   public static native long nativeLoad(Boolean var0);

   public final void a() {
      if (!this.b.getAndSet(true)) {
         this.nativeClose(this.a);
      }

   }

   protected final void finalize() {
      try {
         this.a();
      } finally {
         super.finalize();
      }

   }

   public native float[] nativeGetSaliencyHeatMap(long var1, int var3, int var4, Buffer var5, int var6, int var7, Buffer var8, int var9, int var10, Buffer var11, int var12, int var13, float var14, float var15, float[] var16);
}
