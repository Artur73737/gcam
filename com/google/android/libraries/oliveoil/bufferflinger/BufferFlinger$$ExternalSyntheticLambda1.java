package com.google.android.libraries.oliveoil.bufferflinger;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;

// $FF: synthetic class
public final class BufferFlinger$$ExternalSyntheticLambda1 implements Runnable {
   public BufferFlinger f$0;
   public BufferFlinger$OnBufferReleasedListener f$1;
   public BufferFlinger$OnPresentationTimestampAvailableListener f$2;
   public HardwareBuffer f$3;
   public Rect f$4;
   public Rect f$5;
   public int f$6;

   // $FF: synthetic method
   public BufferFlinger$$ExternalSyntheticLambda1(BufferFlinger var1, BufferFlinger$OnBufferReleasedListener var2, BufferFlinger$OnPresentationTimestampAvailableListener var3, HardwareBuffer var4, Rect var5, Rect var6, int var7) {
      this.f$0 = var1;
      this.f$1 = var2;
      this.f$2 = var3;
      this.f$3 = var4;
      this.f$4 = var5;
      this.f$5 = var6;
      this.f$6 = var7;
   }

   public final void run() {
      this.f$0.lambda$displayBuffer$1$com-google-android-libraries-oliveoil-bufferflinger-BufferFlinger(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
   }
}
