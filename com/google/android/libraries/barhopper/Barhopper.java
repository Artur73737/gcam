package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;

public class Barhopper {
   private static final String TAG = "Barhopper";

   static {
      try {
         System.loadLibrary("barhopper");
      } catch (UnsatisfiedLinkError var1) {
         Log.w("Barhopper", "Barhopper so is not available. To use this library correctly, either depend on the :barhopper BUILD target or link the barhopper/jni target directly. This warning can be safely ignored if doing the latter.");
      }
   }

   private Barhopper() {
   }

   public static native Barcode parseRawValue(String var0, int var1);

   public static Barcode[] recognize(int var0, int var1, int var2, ByteBuffer var3, RecognitionOptions var4) {
      return recognizeStridedBufferNative(var0, var1, var2, var3, var4);
   }

   public static Barcode[] recognize(int var0, int var1, byte[] var2, RecognitionOptions var3) {
      return recognizeNative(var0, var1, var2, var3);
   }

   public static Barcode[] recognize(Bitmap var0, RecognitionOptions var1) {
      return recognizeBitmapNative(var0, var1);
   }

   public static native Barcode[] recognizeBitmapNative(Bitmap var0, RecognitionOptions var1);

   public static native Barcode[] recognizeBufferNative(int var0, int var1, ByteBuffer var2, RecognitionOptions var3);

   public static native Barcode[] recognizeNative(int var0, int var1, byte[] var2, RecognitionOptions var3);

   public static native Barcode[] recognizeStridedBufferNative(int var0, int var1, int var2, ByteBuffer var3, RecognitionOptions var4);

   public static native Barcode[] recognizeStridedNative(int var0, int var1, int var2, byte[] var3, RecognitionOptions var4);
}
