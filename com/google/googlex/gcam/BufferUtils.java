package com.google.googlex.gcam;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class BufferUtils {
   private BufferUtils() {
   }

   public static long a(Buffer var0) {
      var0.getClass();
      return getDirectBufferAddressImpl(var0);
   }

   public static ByteBuffer b(long var0, int var2) {
      boolean var4 = true;
      boolean var3;
      if (var0 != 0L) {
         var3 = true;
      } else {
         var3 = false;
      }

      .onk.x(var3, "ptr must not be 0.");
      if (var2 > 0) {
         var3 = var4;
      } else {
         var3 = false;
      }

      .onk.z(var3, "capacity must be positive, got: %s", var2);
      return byteBufferViewOfNativePointerImpl(var0, var2).order(ByteOrder.nativeOrder());
   }

   private static native ByteBuffer byteBufferViewOfNativePointerImpl(long var0, int var2);

   public static ByteBuffer c(ByteBuffer var0) {
      return d(var0, var0.isDirect());
   }

   public static ByteBuffer d(ByteBuffer var0, boolean var1) {
      ByteBuffer var2;
      if (var1) {
         var2 = ByteBuffer.allocateDirect(var0.capacity());
      } else {
         var2 = ByteBuffer.allocate(var0.capacity());
      }

      ByteBuffer var3 = var0.asReadOnlyBuffer();
      ByteBuffer var4 = (ByteBuffer)var3.clear();
      var2.put(var3);
      var3 = (ByteBuffer)var2.position(var0.position());
      var3 = (ByteBuffer)var2.limit(var0.limit());
      var2.order(var0.order());
      return var2;
   }

   public static void e(float[] var0, FloatVector var1) {
      var1.getClass();
      setFloatVectorImpl(var0, var1.a);
   }

   private static native long getDirectBufferAddressImpl(Buffer var0);

   private static native long getDirectBufferCapacityImpl(Buffer var0);

   public static native void setByteVectorImpl(byte[] var0, long var1);

   private static native void setFloatVectorImpl(float[] var0, long var1);
}
