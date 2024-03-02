package com.google.android.apps.camera.autotimer.analysis.jni;

import java.nio.ByteBuffer;

class AnalysisImage$Plane implements .mvw {
   private final .mvw a;

   public AnalysisImage$Plane(.mvw var1) {
      this.a = var1;
   }

   public ByteBuffer getBuffer() {
      return this.a.getBuffer();
   }

   public int getPixelStride() {
      return this.a.getPixelStride();
   }

   public int getRowStride() {
      return this.a.getRowStride();
   }
}
