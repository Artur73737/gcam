package com.google.android.libraries.vision.smartcapture;

import java.io.Closeable;
import java.nio.ByteBuffer;

public final class BurstCurator implements Closeable {
   public final .qfc a;
   public final long b;
   public boolean c;

   static {
      .noi.g();
   }

   public BurstCurator(long var1) {
      if (var1 != 0L) {
         this.b = var1;
         this.c = false;
         .qfc var3 = .qfc.b();
         this.a = var3;
         var3.d(.qlp.j);
      } else {
         throw new IllegalStateException("Could not initialize BurstCurator.");
      }
   }

   private native void nativeClose(long var1);

   public static native long nativeCreateFromOptions(byte[] var0);

   public final void close() {
      if (!this.c) {
         this.nativeClose(this.b);
         this.c = true;
      }

   }

   protected final void finalize() {
      try {
         this.close();
      } finally {
         super.finalize();
      }

   }

   public native byte[] nativeProcessMetadata(long var1, byte[] var3);

   public native byte[] nativeProcessYUV(long var1, ByteBuffer var3, int var4, int var5, ByteBuffer var6, int var7, int var8, ByteBuffer var9, int var10, int var11, int var12, int var13, byte[] var14, int var15);
}
