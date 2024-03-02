package com.google.android.apps.camera.faceobfuscation.api;

import android.graphics.PointF;
import android.graphics.RectF;

public abstract class FaceToObfuscate {
   public static .fxl c(int var0, RectF var1) {
      .fxl var2 = new .fxl();
      var2.a = var0;
      var2.e = (byte)(var2.e | 1);
      var2.b = var1;
      return var2;
   }

   public abstract float a();

   public abstract int b();

   public abstract RectF bounds();

   public abstract float faceRoll();

   public abstract PointF leftEye();

   public abstract PointF rightEye();
}
