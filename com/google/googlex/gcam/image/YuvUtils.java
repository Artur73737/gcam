package com.google.googlex.gcam.image;

import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvReadView;

public final class YuvUtils {
   public static boolean a(YuvReadView var0, InterleavedWriteViewU8 var1) {
      long var4 = var0.a;
      boolean var3 = true;
      long var6 = InterleavedWriteViewU8.a(var1);
      boolean var2;
      if (var4 != 0L) {
         var2 = true;
      } else {
         var2 = false;
      }

      .onk.x(var2, "src view is null");
      if (var6 != 0L) {
         var2 = var3;
      } else {
         var2 = false;
      }

      .onk.x(var2, "dst view is null");
      return yuvToRgbImpl(var4, var6);
   }

   public static native boolean rgbToYuvImpl(long var0, long var2);

   private static native boolean yuvToRgbImpl(long var0, long var2);
}
