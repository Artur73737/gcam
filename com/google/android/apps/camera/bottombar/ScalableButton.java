package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class ScalableButton extends .io {
   private static final float DEFAULT_SIZE = 1.0F;
   private static final float SCALED_SIZE = 1.05F;

   public ScalableButton(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.initialize();
   }

   private void initialize() {
      super.setOnTouchListener(ScalableButton$$ExternalSyntheticLambda0.INSTANCE);
   }

   // $FF: synthetic method
   static boolean lambda$initialize$0(View var0, MotionEvent var1) {
      if (var1.getAction() == 0) {
         var0.animate().scaleX(1.05F);
         var0.animate().scaleY(1.05F);
      } else if (var1.getAction() == 1) {
         var0.animate().scaleX(1.0F);
         var0.animate().scaleY(1.0F);
      }

      return false;
   }
}
