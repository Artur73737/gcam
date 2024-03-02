package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class SideButtonContainer extends ConstraintLayout implements SideButtonCombineListener {
   private final Drawable containerBackground;

   public SideButtonContainer(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.containerBackground = var1.getResources().getDrawable(R$drawable.side_button_container_background, (Theme)null);
   }

   public void onCouple() {
      this.setBackground(this.containerBackground);
   }

   public void onDecouple() {
      this.setBackgroundColor(0);
   }
}
