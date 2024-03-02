package com.google.android.apps.camera.ui.views;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public class CaptureAnimationOverlay extends View {
   public final Paint a;
   public AnimatorSet b;
   public int c = 1;
   private final RectF d = new RectF();
   private final Interpolator e;
   private final Interpolator f;
   private final Interpolator g;
   private final AnimatorUpdateListener h;

   public CaptureAnimationOverlay(Context var1, AttributeSet var2) {
      super(var1, var2);
      Paint var3 = new Paint();
      this.a = var3;
      var3.setColor(-16777216);
      this.e = new LinearInterpolator();
      this.f = AnimationUtils.loadInterpolator(this.getContext(), 17563661);
      this.g = AnimationUtils.loadInterpolator(this.getContext(), 17563663);
      this.h = new .kiu(this, 12);
   }

   public final void a(boolean var1) {
      AnimatorSet var2 = this.b;
      if (var2 != null && var2.isRunning()) {
         this.b.cancel();
      }

      ValueAnimator var4;
      if (var1) {
         var4 = ValueAnimator.ofFloat(new float[]{0.0F, 0.6F});
         var4.setDuration(167L);
         var4.setInterpolator(this.f);
      } else {
         var4 = ValueAnimator.ofFloat(new float[]{0.6F, 0.0F});
         var4.setDuration(133L);
         var4.setInterpolator(this.g);
      }

      var4.addUpdateListener(this.h);
      AnimatorSet var3 = new AnimatorSet();
      this.b = var3;
      var3.play(var4);
      this.b.addListener(new .kpn(this, var1));
      this.b.start();
   }

   public final void b() {
      ValueAnimator var1 = ValueAnimator.ofFloat(new float[]{0.76F, 0.76F});
      ValueAnimator var2 = ValueAnimator.ofFloat(new float[]{0.76F, 0.0F});
      var1.setDuration(66L);
      var2.setDuration(166L);
      var1.addUpdateListener(this.h);
      var2.addUpdateListener(this.h);
      var1.setInterpolator(this.e);
      var2.setInterpolator(this.e);
      var1.addListener(new .kpl(this, var2));
      var2.addListener(new .kpm(this));
      var1.start();
   }

   public final boolean hasOverlappingRendering() {
      return false;
   }

   public final void layout(int var1, int var2, int var3, int var4) {
      super.layout(var1, var2, var3, var4);
      this.d.set(new Rect(var1, var2, var3, var4));
   }

   public final void onDraw(Canvas var1) {
      if (this.c != 1) {
         var1.drawRect(this.d, this.a);
         var1.clipRect(this.d);
      }

   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      this.d.set((float)var2, (float)var3, (float)var4, (float)var5);
   }
}
