package com.google.android.apps.camera.facemetadata.conversions;

import android.graphics.Point;
import android.graphics.Rect;

public abstract class FaceToBeautify {
   public static .fwl a(Rect var0) {
      .fwl var1 = new .fwl();
      var0.getClass();
      var1.a = var0;
      return var1;
   }

   public abstract Rect bounds();

   public abstract Float confidence();

   public abstract float[] faceAttributes();

   public abstract Integer index();

   public abstract Point leftEarTragion();

   public abstract Point leftEye();

   public abstract Point mouthCenter();

   public abstract Point noseTip();

   public abstract Float panAngleDegrees();

   public abstract Point rightEarTragion();

   public abstract Point rightEye();
}
