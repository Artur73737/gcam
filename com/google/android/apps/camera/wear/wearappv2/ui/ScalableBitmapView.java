package com.google.android.apps.camera.wear.wearappv2.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import java.text.DateFormat;

public class ScalableBitmapView extends View {
   static {
      DateFormat.getDateTimeInstance(2, 3);
   }

   public ScalableBitmapView(Context var1, AttributeSet var2) {
      super(var1, var2);
      new Matrix();
   }
}
