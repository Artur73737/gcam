package com.google.android.apps.camera.jupiter;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.SideButtonCombineListener;

public final class JupiterButton extends .io implements SideButtonCombineListener {
   private final Drawable a;

   public JupiterButton(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a = var1.getResources().getDrawable(2131231402, (Theme)null);
   }

   public final void onCouple() {
      this.setBackgroundColor(0);
   }

   public final void onDecouple() {
      this.setBackground(this.a);
   }
}
