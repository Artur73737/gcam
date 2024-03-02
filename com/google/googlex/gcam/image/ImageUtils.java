package com.google.googlex.gcam.image;

import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;

public final class ImageUtils {
   private ImageUtils() {
   }

   public static void a(InterleavedReadViewU8 var0, InterleavedWriteViewU8 var1) {
      long var4 = var0.a;
      boolean var3 = true;
      long var6 = InterleavedWriteViewU8.a(var1);
      boolean var2;
      if (var4 != 0L) {
         var2 = true;
      } else {
         var2 = false;
      }

      .onk.x(var2, "src is null");
      if (var6 != 0L) {
         var2 = var3;
      } else {
         var2 = false;
      }

      .onk.x(var2, "dst is null");
      copyContentsImpl(var4, var6);
   }

   private static native void copyContentsImpl(long var0, long var2);

   public static native boolean simpleRgbToAnyRgbImpl(long var0, int var2, long var3);
}
