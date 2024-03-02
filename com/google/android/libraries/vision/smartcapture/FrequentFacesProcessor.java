package com.google.android.libraries.vision.smartcapture;

import java.io.Closeable;
import java.nio.ByteBuffer;

public final class FrequentFacesProcessor implements Closeable {
   private final .qfc a;
   private long b;

   static {
      .noi.g();
   }

   public FrequentFacesProcessor(.qmf var1) {
      this.b = nativeCreate(var1.J());
      .qfc var2 = .qfc.b();
      this.a = var2;
      var2.d(.qlp.j);
   }

   private static native void nativeClose(long var0);

   private static native byte[] nativeComputeFamiliarFaces(long var0, ByteBuffer var2, int var3, int var4, ByteBuffer var5, int var6, int var7, ByteBuffer var8, int var9, int var10, int var11, int var12, byte[] var13);

   private static native long nativeCreate(byte[] var0);

   public final .qli a(ByteBuffer param1, int param2, int param3, ByteBuffer param4, int param5, int param6, ByteBuffer param7, int param8, int param9, int param10, int param11, .qli param12) {
      // $FF: Couldn't be decompiled
   }

   public final void close() {
      synchronized(this){}

      Throwable var10000;
      label78: {
         long var1;
         boolean var10001;
         try {
            var1 = this.b;
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label78;
         }

         if (var1 == 0L) {
            return;
         }

         label69:
         try {
            nativeClose(var1);
            this.b = 0L;
            return;
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label69;
         }
      }

      Throwable var3 = var10000;
      throw var3;
   }
}
