package com.google.android.apps.camera.jni.mallopt;

public class Mallopt {
   static {
      .mhw.a(Mallopt.class, "gcastartup");
   }

   private Mallopt() {
   }

   public static native boolean setOptions(int var0, int var1);
}
