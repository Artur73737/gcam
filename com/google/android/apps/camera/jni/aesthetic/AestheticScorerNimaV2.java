package com.google.android.apps.camera.jni.aesthetic;

import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AestheticScorerNimaV2 implements .gsw {
   private static final .pds a = .pds.h("com.google.android.apps.camera.jni.aesthetic.AestheticScorerNimaV2");
   private long b;
   private final AtomicBoolean c = new AtomicBoolean(true);

   static {
      try {
         .mhw.a(AestheticScorerNimaV2.class, "gcastartup");
      } catch (UnsatisfiedLinkError var1) {
         if (!"Dalvik".equals(System.getProperty("java.vm.name"))) {
            .nx.e("Ignoring loading native library for non-android environments.", 'ۍ', a.c(), var1);
         } else {
            throw var1;
         }
      }
   }

   private native void nativeClose(long var1);

   private static native long nativeLoad(boolean var0);

   private native float nativeScoreYUV(long var1, int var3, int var4, Buffer var5, int var6, int var7, Buffer var8, int var9, int var10, Buffer var11, int var12, int var13, float[] var14);

   public final float a(int var1, int var2, Buffer var3, int var4, int var5, Buffer var6, int var7, int var8, Buffer var9, int var10, int var11, float[] var12) {
      return !this.c.get() ? this.nativeScoreYUV(this.b, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12) : 0.0F;
   }

   public final void b() {
      if (!this.c.getAndSet(true)) {
         this.nativeClose(this.b);
      }

   }

   public final void c(boolean var1) {
      if (this.c.getAndSet(false)) {
         this.b = nativeLoad(var1);
      }

   }

   protected final void finalize() {
      try {
         this.b();
      } finally {
         super.finalize();
      }

   }
}
