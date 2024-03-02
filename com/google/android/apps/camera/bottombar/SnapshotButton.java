package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

public class SnapshotButton extends ShutterButton {
   public SnapshotButton(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   protected float getDefaultScale() {
      TypedValue var1 = new TypedValue();
      this.getResources().getValue(R$dimen.snapshot_button_scale, var1, true);
      return var1.getFloat();
   }

   protected float getOuterCircleStrokeWidth() {
      return (float).ktc.b(2.0F);
   }

   public void setClickEnabled(boolean var1) {
      super.setClickEnabled(var1);
   }

   public void setMode(.klw var1, .kmn var2) {
      if (var1.equals(.klw.b)) {
         super.setMode(.klw.b, var2);
      } else {
         super.setMode(.klw.a, var2);
      }
   }

   public void wirePressedStateAnimationListener() {
      this.setListener(new SnapshotButton$1(this, new .kmn(this)));
      this.setClickEnabled(true);
   }
}
