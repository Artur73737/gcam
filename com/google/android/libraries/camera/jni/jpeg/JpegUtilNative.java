package com.google.android.libraries.camera.jni.jpeg;

import android.graphics.Rect;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

public class JpegUtilNative {
   static {
      .mhw.a(JpegUtilNative.class, "jpeg-jni");
   }

   public static int a(.mvx var0, ByteBuffer var1, Rect var2, .mho var3) {
      long var13 = SystemClock.elapsedRealtimeNanos();
      .onk.I(var1.isDirect(), "Output buffer must be direct");
      boolean var12;
      if (var2.left < var2.right) {
         var12 = true;
      } else {
         var12 = false;
      }

      .onk.K(var12, "Invalid crop rectangle: %s", var2);
      if (var2.top < var2.bottom) {
         var12 = true;
      } else {
         var12 = false;
      }

      .onk.K(var12, "Invalid crop rectangle: %s", var2);
      if (var0.a() == 35) {
         var12 = true;
      } else {
         var12 = false;
      }

      .onk.J(var12, "Only ImageFormat.YUV_420_888 is supported, found %s", var0.a());
      List var17 = var0.g();
      .mvw var16 = (.mvw)var17.get(0);
      .mvw var15 = (.mvw)var17.get(1);
      .mvw var19 = (.mvw)var17.get(2);
      .onk.H(var16.getBuffer().isDirect());
      .onk.H(var15.getBuffer().isDirect());
      .onk.H(var19.getBuffer().isDirect());
      if (var16.getPixelStride() == 1) {
         var12 = true;
      } else {
         var12 = false;
      }

      .onk.I(var12, "Pixel stride for luma (Y) plane must be 1.");
      if (var15.getPixelStride() == 2) {
         var12 = true;
      } else {
         var12 = false;
      }

      .onk.I(var12, "Pixel stride for chroma (U) plane must be 2.");
      if (var19.getPixelStride() == 2) {
         var12 = true;
      } else {
         var12 = false;
      }

      .onk.I(var12, "Pixel stride for chroma (V) plane must be 2.");
      if (var15.getRowStride() == var19.getRowStride()) {
         var12 = true;
      } else {
         var12 = false;
      }

      .onk.I(var12, "Row strides for chroma planes (UV) must match.");
      var1.clear();
      int var6 = var0.c();
      int var9 = var0.b();
      int var11 = .osh.aI(var2.left, 0, var6 - 1);
      int var7 = .osh.aI(var2.right, 0, var6);
      int var8 = .osh.aI(var2.top, 0, var9 - 1);
      int var10 = .osh.aI(var2.bottom, 0, var9);
      var6 = compressJpegFromYUV420spNative(var6, var9, var16.getBuffer(), var16.getPixelStride(), var16.getRowStride(), var15.getBuffer(), var15.getPixelStride(), var15.getRowStride(), var19.getBuffer(), var19.getPixelStride(), var19.getRowStride(), var1, 95, var11, var8, var7, var10, var3.e);
      if (var6 < var1.limit()) {
         var1.limit(var6);
      }

      Locale var18 = Locale.ROOT;
      double var4 = (double)(SystemClock.elapsedRealtimeNanos() - var13);
      Double.isNaN(var4);
      String.format(var18, "Compressed %d bytes in %.2fms", var6, var4 / 1000000.0D);
      return var6;
   }

   private static native int compressJpegFromYUV420spNative(int var0, int var1, Object var2, int var3, int var4, Object var5, int var6, int var7, Object var8, int var9, int var10, Object var11, int var12, int var13, int var14, int var15, int var16, int var17);
}
