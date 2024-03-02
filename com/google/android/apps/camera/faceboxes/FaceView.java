package com.google.android.apps.camera.faceboxes;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import java.util.HashMap;

public class FaceView extends .fwc {
   private final Paint b;

   public FaceView(Context var1, AttributeSet var2) {
      super(var1, var2);
      Resources var3 = this.getResources();
      Paint var4 = new Paint();
      this.b = var4;
      var4.setAntiAlias(true);
      var4.setStyle(Style.FILL);
      var4.setStrokeWidth(var3.getDimension(2131165535));
      var4.setColor(var3.getColor(2131099845, (Theme)null));
      new HashMap();
   }
}
