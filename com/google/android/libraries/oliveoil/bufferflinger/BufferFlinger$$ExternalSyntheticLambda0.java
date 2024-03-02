package com.google.android.libraries.oliveoil.bufferflinger;

import java.util.concurrent.Semaphore;

// $FF: synthetic class
public final class BufferFlinger$$ExternalSyntheticLambda0 implements Runnable {
   public BufferFlinger f$0;
   public Semaphore f$1;

   // $FF: synthetic method
   public BufferFlinger$$ExternalSyntheticLambda0(BufferFlinger var1, Semaphore var2) {
      this.f$0 = var1;
      this.f$1 = var2;
   }

   public final void run() {
      this.f$0.lambda$close$2$com-google-android-libraries-oliveoil-bufferflinger-BufferFlinger(this.f$1);
   }
}
