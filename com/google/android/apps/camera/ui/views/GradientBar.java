package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;

public class GradientBar extends View {
   public GradientBar(Context var1) {
      super(var1);
   }

   public GradientBar(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      Trace.beginSection("gradientBar:onLayout");
      super.onLayout(var1, var2, var3, var4, var5);
      Trace.endSection();
   }
}
