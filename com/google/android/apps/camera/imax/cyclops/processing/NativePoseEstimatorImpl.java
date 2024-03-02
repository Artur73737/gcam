package com.google.android.apps.camera.imax.cyclops.processing;

import com.google.geo.lightfield.processing.ProgressCallback;

public class NativePoseEstimatorImpl implements .gqh {
   static {
      System.loadLibrary("cyclops");
   }

   public native boolean computePose(String var1, ProgressCallback var2);
}
