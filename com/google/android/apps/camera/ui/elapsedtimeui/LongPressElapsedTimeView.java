package com.google.android.apps.camera.ui.elapsedtimeui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LongPressElapsedTimeView extends LinearLayout {
   public Animation a;
   public Animation b;
   public ImageView c;
   public final Runnable d = new .jxv(this, 14);

   public LongPressElapsedTimeView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final TextView a() {
      return (TextView)this.findViewById(2131427851);
   }

   public final TextView b() {
      return (TextView)this.findViewById(2131427852);
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624073, this);
      this.setBackground(this.getResources().getDrawable(2131231811, (Theme)null));
      this.a = AnimationUtils.loadAnimation(this.getContext(), 2130771980);
      this.b = AnimationUtils.loadAnimation(this.getContext(), 2130771981);
      this.c = (ImageView)this.findViewById(2131427773);
   }
}
