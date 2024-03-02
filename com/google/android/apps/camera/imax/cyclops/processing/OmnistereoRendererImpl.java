package com.google.android.apps.camera.imax.cyclops.processing;

import com.google.android.apps.camera.imax.cyclops.image.StereoPanorama;

public class OmnistereoRendererImpl implements .gqf {
   public int a = 0;
   public boolean b = false;
   private long exposureScalesRef = 0L;
   private long modelRef = 0L;
   private long rendererRef = 0L;

   static {
      System.loadLibrary("cyclops");
   }

   public OmnistereoRendererImpl(String var1, boolean var2, double var3, double var5) {
      this.b = this.nativeInitialize(var1, 0, var2, var3, var5);
   }

   private native boolean nativeInitialize(String var1, int var2, boolean var3, double var4, double var6);

   public final void finalize() {
      super.finalize();
      this.nativeRelease();
   }

   public native StereoPanorama getResult(boolean var1);

   public native void nativeApplyTexture(int var1, int var2, int var3, int var4);

   public native void nativeRelease();
}
