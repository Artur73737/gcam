package com.google.googlex.gcam.imageproc;

import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;

public final class Resample {
   private Resample() {
   }

   public static void a(InterleavedReadViewU8 var0, .ptz var1, InterleavedWriteViewU8 var2) {
      long var5 = var0.a;
      boolean var4 = true;
      long var7 = InterleavedWriteViewU8.a(var2);
      boolean var3;
      if (var5 != 0L) {
         var3 = true;
      } else {
         var3 = false;
      }

      .onk.x(var3, "src is null");
      if (var7 != 0L) {
         var3 = var4;
      } else {
         var3 = false;
      }

      .onk.x(var3, "dst is null");
      rotateInterleavedU8Impl(var5, var1.j, var7);
   }

   public static void b(YuvReadView var0, .ptz var1, YuvWriteView var2) {
      long var5 = var0.a;
      boolean var4 = true;
      long var7 = YuvWriteView.c(var2);
      boolean var3;
      if (var5 != 0L) {
         var3 = true;
      } else {
         var3 = false;
      }

      .onk.x(var3, "src is null");
      if (var7 != 0L) {
         var3 = var4;
      } else {
         var3 = false;
      }

      .onk.x(var3, "dst is null");
      rotateYuvImpl(var5, var1.j, var7);
   }

   public static native boolean downsampleImpl(long var0, int var2, long var3);

   public static native boolean resampleLanczosYuvImpl(long var0, float var2, long var3);

   private static native boolean rotateInterleavedU8Impl(long var0, int var2, long var3);

   private static native boolean rotateYuvImpl(long var0, int var2, long var3);

   private static native int[] rotatedSizeImpl(int var0, int var1, int var2);
}
