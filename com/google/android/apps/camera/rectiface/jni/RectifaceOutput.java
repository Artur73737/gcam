package com.google.android.apps.camera.rectiface.jni;

public final class RectifaceOutput {
   public final long a = initializeImpl();

   static {
      .jbc.a();
   }

   public static native int getAnglerfishFallbackStatusImpl(long var0, int var2);

   private static native int getAnglerfishFallbackStatusSizeImpl(long var0);

   private static native int getCameraFovInDegreeImpl(long var0);

   private static native float getFaceConformalityAfterShapeCorrectionImpl(long var0, int var2);

   private static native int getFaceConformalityAfterShapeCorrectionSizeImpl(long var0);

   private static native float getFaceConformalityBeforeShapeCorrectionImpl(long var0, int var2);

   private static native int getFaceConformalityBeforeShapeCorrectionSizeImpl(long var0);

   private static native int getFaceDistortionCorrectionProcessingTimeMsImpl(long var0);

   public static native boolean getIsAnglerfishAppliedImpl(long var0);

   private static native int getPortraitRelightingTimeMsImpl(long var0);

   private static native int getSegmentationTimeMsImpl(long var0);

   private static native int getShapeCorrectionModeImpl(long var0);

   private static native long initializeImpl();

   private static native void releaseImpl(long var0);

   public final float a(int var1) {
      return getFaceConformalityAfterShapeCorrectionImpl(this.a, var1);
   }

   public final float b(int var1) {
      return getFaceConformalityBeforeShapeCorrectionImpl(this.a, var1);
   }

   public final int c() {
      return getAnglerfishFallbackStatusSizeImpl(this.a);
   }

   public final int d() {
      return getCameraFovInDegreeImpl(this.a);
   }

   public final int e() {
      return getFaceConformalityAfterShapeCorrectionSizeImpl(this.a);
   }

   public final int f() {
      return getFaceConformalityBeforeShapeCorrectionSizeImpl(this.a);
   }

   public final int g() {
      return getFaceDistortionCorrectionProcessingTimeMsImpl(this.a);
   }

   public final int h() {
      return getPortraitRelightingTimeMsImpl(this.a);
   }

   public final int i() {
      return getSegmentationTimeMsImpl(this.a);
   }

   public final int j() {
      return getShapeCorrectionModeImpl(this.a);
   }

   public final void k() {
      releaseImpl(this.a);
   }
}
