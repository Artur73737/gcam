package com.google.android.apps.camera.imax.cyclops.image;

import com.google.android.apps.camera.imax.cyclops.audio.AudioTrack;
import com.google.android.apps.camera.imax.cyclops.metadata.PanoMeta;

public final class CyclopsPhotoWriter {
   static {
      System.loadLibrary("cyclops");
   }

   public static native boolean writeToFile(byte[] var0, byte[] var1, PanoMeta var2, AudioTrack var3, String var4);
}
