package com.google.googlex.gcam;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.view.Surface;

public final class AndroidJniUtils {
   private AndroidJniUtils() {
   }

   public static native long getAHardwareBufferPtr(HardwareBuffer var0);

   public static native long lockBitmap(Bitmap var0);

   static native long lockSurface(Surface var0);

   public static native void unlockBitmap(Bitmap var0);

   static native void unlockSurface(long var0);
}
