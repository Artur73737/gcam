package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.camera.ui.layout.GcaLayout;

public class CameraAppRootLayout extends GcaLayout {
   public CameraAppRootLayout(Context var1) {
      super(var1);
   }

   public CameraAppRootLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public CameraAppRootLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (.kfq.p(this.getContext(), this.getDisplay())) {
         var2 = this.getRootWindowInsets().getStableInsetTop();
      } else {
         var2 = 0;
      }

      this.setPadding(0, var2, 0, 0);
   }
}
