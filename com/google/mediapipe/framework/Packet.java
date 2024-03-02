package com.google.mediapipe.framework;

public class Packet {
   public long a;

   public Packet(long var1) {
      this.a = var1;
   }

   public static Packet create(long var0) {
      return new Packet(var0);
   }

   private native long nativeGetTimestamp(long var1);

   private native void nativeReleasePacket(long var1);

   public final long a() {
      return this.nativeGetTimestamp(this.a);
   }

   public long getNativeHandle() {
      return this.a;
   }

   public native long nativeCopyPacket(long var1);

   public void release() {
      long var1 = this.a;
      if (var1 != 0L) {
         this.nativeReleasePacket(var1);
         this.a = 0L;
      }

   }
}
