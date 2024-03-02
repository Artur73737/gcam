package com.google.android.libraries.camera.jni.yuv;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.ByteBuffer;
import java.util.List;

public class YuvUtilNative {
   static {
      .mhw.a(YuvUtilNative.class, "yuv-jni");
   }

   public static Bitmap a(.mvx var0) {
      .mtt var4 = .mtt.a;
      List var6 = var0.g();
      .mvw var5 = (.mvw)var6.get(0);
      .mvw var3 = (.mvw)var6.get(1);
      .mvw var9 = (.mvw)var6.get(2);
      ByteBuffer var7 = var5.getBuffer();
      ByteBuffer var12 = var3.getBuffer();
      ByteBuffer var8 = var9.getBuffer();
      int var2 = var0.c();
      int var1 = var0.b();
      int[] var10 = new int[var2 * var1];
      Bitmap var11;
      if (!convertYUV420ToARGBNative(var0.c(), var0.b(), var7, var5.getPixelStride(), var5.getRowStride(), var12, var3.getPixelStride(), var3.getRowStride(), var8, var9.getPixelStride(), var9.getRowStride(), var10, var4.i)) {
         var11 = null;
      } else if (var4.j) {
         var11 = Bitmap.createBitmap(var10, var1, var2, Config.ARGB_8888);
      } else {
         var11 = Bitmap.createBitmap(var10, var2, var1, Config.ARGB_8888);
      }

      return var11;
   }

   private static native boolean convertYUV420ToARGBNative(int var0, int var1, ByteBuffer var2, int var3, int var4, ByteBuffer var5, int var6, int var7, ByteBuffer var8, int var9, int var10, int[] var11, int var12);

   public static native boolean copyYUV_420_888Native(int var0, int var1, ByteBuffer var2, ByteBuffer var3, ByteBuffer var4, int var5, int var6, int var7, ByteBuffer var8, ByteBuffer var9, ByteBuffer var10, int var11, int var12, int var13);

   public static native boolean downsampleYUV_420_888toNV21Native(int var0, int var1, ByteBuffer var2, int var3, int var4, ByteBuffer var5, int var6, int var7, ByteBuffer var8, int var9, int var10, ByteBuffer var11, ByteBuffer var12, int var13);

   private static native boolean generateCircleThumbnailNative(ByteBuffer var0, int var1, int var2, ByteBuffer var3, int var4, int var5, ByteBuffer var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int[] var14);
}
