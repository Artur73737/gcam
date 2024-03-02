package com.google.android.apps.camera.rectiface.jni;

public final class RectifaceWarpfieldImpl implements .jbb, .mhq {
   public static final .pds a = .pds.h("com.google.android.apps.camera.rectiface.jni.RectifaceWarpfieldImpl");
   public long b = 0L;

   static {
      .jbc.a();
   }

   public static native long initializeImpl();

   private static native void releaseImpl(long var0);

   public final long a() {
      return this.b;
   }

   public final void close() {
      long var1 = this.b;
      if (var1 != 0L) {
         releaseImpl(var1);
         this.b = 0L;
      }

   }
}
