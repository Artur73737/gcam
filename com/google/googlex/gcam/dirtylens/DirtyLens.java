package com.google.googlex.gcam.dirtylens;

import java.util.concurrent.atomic.AtomicBoolean;

public final class DirtyLens {
   private static final AtomicBoolean a = new AtomicBoolean();

   public DirtyLens() {
      if (a.compareAndSet(false, true)) {
         init();
      }

   }

   public static native boolean getDirtyLensRawScore(long var0, float[] var2);

   private static native void init();
}
