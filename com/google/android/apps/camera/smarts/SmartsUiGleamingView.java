package com.google.android.apps.camera.smarts;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class SmartsUiGleamingView extends View {
   public AnimatedVectorDrawable a;
   public int b;
   private AnimatedVectorDrawable c;

   public SmartsUiGleamingView(Context var1) {
      super(var1);
   }

   public SmartsUiGleamingView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final void a() {
      .mbx.a();
      this.c.setVisible(false, false);
      this.a.setVisible(false, false);
      this.setVisibility(4);
   }

   protected final void onDraw(Canvas var1) {
      this.c.draw(var1);
      this.a.draw(var1);
   }

   public final void onFinishInflate() {
      super.onFinishInflate();
      .jla var1 = new .jla(this);
      AnimatedVectorDrawable var2 = (AnimatedVectorDrawable)this.getResources().getDrawable(2131231127, (Theme)null);
      this.c = var2;
      var2.setCallback(this);
      this.getResources().getDimensionPixelSize(2131166896);
      this.c.registerAnimationCallback(var1);
      this.c.setVisible(false, false);
      var2 = (AnimatedVectorDrawable)this.getResources().getDrawable(2131231411, (Theme)null);
      this.a = var2;
      var2.setCallback(this);
      this.b = this.getResources().getDimensionPixelSize(2131166898) / 2;
      this.a.registerAnimationCallback(var1);
      this.a.setVisible(false, false);
      this.setVisibility(4);
   }

   protected final boolean verifyDrawable(Drawable var1) {
      return var1 == this.c || var1 == this.a || super.verifyDrawable(var1);
   }
}
