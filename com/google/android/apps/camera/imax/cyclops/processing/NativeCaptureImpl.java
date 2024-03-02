package com.google.android.apps.camera.imax.cyclops.processing;

import android.graphics.Bitmap;
import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;

public class NativeCaptureImpl implements .gqd {
   public final int a;
   public final float b;
   private long nativeRef;

   static {
      System.loadLibrary("cyclops");
   }

   public NativeCaptureImpl() {
      this(512, 60.0F);
   }

   public NativeCaptureImpl(int var1, float var2) {
      this.nativeRef = 0L;
      this.a = var1;
      this.b = var2;
   }

   public native float getCaptureProgress();

   public native Bitmap getPreview(int var1);

   public native Texture getPreviewAsTexture();

   public native void getTrackerStats(TrackerStats var1);

   public native void initialize(int var1, int var2, int var3, int var4, int var5, float var6);

   public native void release();

   public native void setMetaData(float var1, int var2, boolean var3, int var4, boolean var5);

   public native void startCapture();

   public native int stopCapture(String var1);

   public native boolean trackTexture(float[] var1, float[] var2);
}
