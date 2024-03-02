package com.google.android.apps.camera.dynamicdepth;

import android.hardware.camera2.CaptureResult;

public class DynamicDepthResult implements .mhq {
   public long a;

   public DynamicDepthResult(int var1, int var2, boolean var3) {
      .fsc.a();
      this.a = alloc(var1, var2, 0, false, var3, (float[])null, (float[])null);
   }

   public DynamicDepthResult(.mhs var1, int var2, boolean var3, boolean var4, .mvq var5) {
      float[] var6;
      float[] var8;
      if (var5 != null) {
         float[] var7 = (float[])var5.d(CaptureResult.LENS_INTRINSIC_CALIBRATION);
         var6 = (float[])var5.d(CaptureResult.LENS_DISTORTION);
         var8 = var7;
      } else {
         var8 = null;
         var6 = null;
      }

      this.a = alloc(var1.a, var1.b, var2, var3, var4, var8, var6);
   }

   private static native long alloc(int var0, int var1, int var2, boolean var3, boolean var4, float[] var5, float[] var6);

   private static native void dealloc(long var0);

   public final void close() {
      dealloc(this.a);
      this.a = 0L;
   }
}
