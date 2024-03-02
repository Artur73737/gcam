package com.google.android.apps.camera.facemetadata.conversions.jni;

public final class MeshWarpInverseNative {
   static {
      .mhw.a(MeshWarpInverseNative.class, "gcastartup");
   }

   private MeshWarpInverseNative() {
   }

   public static native void invertMeshWarp(long var0);
}
