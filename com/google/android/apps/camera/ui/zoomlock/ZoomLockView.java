package com.google.android.apps.camera.ui.zoomlock;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.wear.ambient.AmbientMode$AmbientController;

public class ZoomLockView extends RelativeLayout {
   public ImageView a;
   public ImageView b;
   public ImageView c;
   public AnimatorSet d;
   public ObjectAnimator e;
   public ImageView f;
   public boolean g;
   public final .ktb h;
   public AmbientMode$AmbientController i;
   private AnimatorSet j;

   public ZoomLockView(Context var1) {
      super(var1);
      this.h = .ktb.a;
   }

   public ZoomLockView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.h = .ktb.a;
   }

   private static ObjectAnimator b(View var0) {
      ObjectAnimator var1 = ObjectAnimator.ofFloat(var0, "alpha", new float[]{0.0F, 1.0F});
      var1.setDuration(400L);
      var1.setInterpolator(new .clf());
      var1.setStartDelay(50L);
      return var1;
   }

   private final ObjectAnimator c(View var1) {
      ObjectAnimator var2 = ObjectAnimator.ofFloat(var1, "translationX", new float[]{this.getResources().getDimension(2131167542)});
      var2.setDuration(400L);
      var2.setInterpolator(new .clf());
      var2.setStartDelay(50L);
      return var2;
   }

   public final void a() {
      if (!this.g) {
         this.j.start();
      }

   }

   protected final void onFinishInflate() {
      Trace.beginSection("ZoomLockView:inflate");
      super.onFinishInflate();
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624298, this, true);
      this.a = (ImageView)this.findViewById(2131428572);
      this.b = (ImageView)this.findViewById(2131427847);
      this.c = (ImageView)this.findViewById(2131427848);
      this.f = (ImageView)this.findViewById(2131428571);
      ObjectAnimator var8 = ObjectAnimator.ofFloat(this.b, "scaleX", new float[]{1.5F});
      ObjectAnimator var4 = ObjectAnimator.ofFloat(this.b, "scaleY", new float[]{1.5F});
      var8.setDuration(200L);
      var4.setDuration(200L);
      var8.setInterpolator(new .clf());
      var4.setInterpolator(new .clf());
      var8.addListener(new .ksd(this));
      ValueAnimator var1 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{this.getResources().getColor(2131102418, (Theme)null), this.getResources().getColor(2131102417, (Theme)null)});
      var1.setDuration(200L);
      var1.addUpdateListener(new .kpw(this, 2));
      var1.addListener(new .kse(this));
      var1.setStartDelay(50L);
      ObjectAnimator var5 = this.c(this.f);
      ObjectAnimator var6 = this.c(this.a);
      ObjectAnimator var2 = b(this.f);
      ObjectAnimator var7 = b(this.a);
      var2.addListener(new .ksf(this));
      AnimatorSet var3 = new AnimatorSet();
      this.d = var3;
      var3.play(var8).with(var4);
      this.d.play(var1).after(var8);
      this.d.play(var5).with(var1);
      this.d.play(var2).with(var1);
      this.d.play(var6).with(var1);
      this.d.play(var7).with(var1);
      ObjectAnimator var9 = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0F, 0.0F});
      this.e = var9;
      var9.setDuration(200L);
      this.e.setInterpolator(new .clf());
      this.e.addListener(new .ksg(this));
      ObjectAnimator var11 = ObjectAnimator.ofFloat(this.b, "scaleX", new float[]{1.0F});
      var9 = ObjectAnimator.ofFloat(this.b, "scaleY", new float[]{1.0F});
      var11.setDuration(200L);
      var9.setDuration(200L);
      var11.setInterpolator(new .clf());
      var9.setInterpolator(new .clf());
      AnimatorSet var10 = new AnimatorSet();
      this.j = var10;
      var10.play(var11).with(var9);
      this.j.addListener(new .ksh(this));
      Trace.endSection();
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      Trace.beginSection("ZoomLockView:onLayout");
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1) {
         Trace.beginSection("ZoomLockView:applyOrientation");
         ImageView var6 = this.a;
         if (var6 != null) {
            .jbc.aC(var6, this.h);
         }

         Trace.endSection();
      }

      Trace.endSection();
   }
}
