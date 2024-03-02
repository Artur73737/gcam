package com.google.android.libraries.microvideo.xmp.nativemotionphotos;

public final class NativeMotionPhotoProcessor {
   public static final int a = 0;

   static {
      .pfx.d("NativeMotionPhotoProc");
      System.loadLibrary("native");
   }

   private NativeMotionPhotoProcessor() {
   }

   public static native byte[] encodeVideoMetadata(byte[] var0);
}
