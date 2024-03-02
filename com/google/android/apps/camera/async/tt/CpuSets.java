package com.google.android.apps.camera.async.tt;

public final class CpuSets {
   private CpuSets() {
   }

   public static .lir a(int var0) {
      long var1 = nativeDropCpuFromSet(var0, 2);
      return var1 == 0L ? null : new .lir(var1);
   }

   private static native long nativeDropCpuFromSet(int var0, int var1);

   public static native void nativeRestoreCpuSet(int var0, long var1);
}
