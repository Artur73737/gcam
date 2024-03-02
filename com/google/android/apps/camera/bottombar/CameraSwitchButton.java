package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;

public class CameraSwitchButton extends ScalableButton implements SideButtonCombineListener {
   private Animatable buttonAnimatable;
   private final Drawable coupleSwitchAnimationDrawable;
   private final Drawable decoupleSwitchAnimationDrawable;
   private OnClickListener onClickListener;
   private final Drawable switchButtonBackground;

   public CameraSwitchButton(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.switchButtonBackground = var1.getResources().getDrawable(R$drawable.camera_switch_button_background, (Theme)null);
      this.coupleSwitchAnimationDrawable = var1.getResources().getDrawable(R$drawable.front_back_switch_button_24px_animation, (Theme)null);
      this.decoupleSwitchAnimationDrawable = var1.getResources().getDrawable(R$drawable.front_back_switch_button_animation, (Theme)null);
      this.initialize();
   }

   private void initialize() {
      super.setOnClickListener(new CameraSwitchButton$$ExternalSyntheticLambda0(this));
      this.setFocusable(false);
      Drawable var2 = this.getBackground();
      if (var2 instanceof RippleDrawable) {
         var2 = var2.getConstantState().newDrawable().mutate();
         int var1 = this.getResources().getDimensionPixelSize(R$dimen.camera_switch_button_ripple_diameter);
         ((RippleDrawable)var2).setRadius(var1 / 2);
         this.setBackground(var2);
      }

   }

   // $FF: synthetic method
   public void lambda$initialize$0$com_google_android_apps_camera_bottombar_CameraSwitchButton/* $FF was: lambda$initialize$0$com-google-android-apps-camera-bottombar-CameraSwitchButton*/(View var1) {
      this.buttonAnimatable = (Animatable)this.getDrawable();
      OnClickListener var2 = this.onClickListener;
      if (var2 != null) {
         var2.onClick(var1);
      }

      .prv.h(this);
      Animatable var3 = this.buttonAnimatable;
      if (var3 != null) {
         var3.start();
      }

   }

   public void onCouple() {
      this.setImageDrawable(this.coupleSwitchAnimationDrawable);
      this.setBackgroundColor(0);
   }

   public void onDecouple() {
      this.setImageDrawable(this.decoupleSwitchAnimationDrawable);
      this.setBackground(this.switchButtonBackground);
   }

   public void setFrontFacing(boolean var1) {
      this.setEnabled(false);
      String var2;
      if (var1) {
         var2 = this.getResources().getString(R$string.camera_id_front_desc);
      } else {
         var2 = this.getResources().getString(R$string.camera_id_back_desc);
      }

      this.setContentDescription(var2);
      this.setEnabled(true);
   }

   public void setOnClickListener(OnClickListener var1) {
      this.onClickListener = var1;
   }
}
