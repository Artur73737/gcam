package com.google.android.apps.camera.ui.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public class FrontLensIndicatorOverlay extends View {
   public static final .pds a = .pds.h("com.google.android.apps.camera.ui.views.FrontLensIndicatorOverlay");
   public ValueAnimator b = null;
   public final .flm c;
   public final Paint d;
   public final Paint e;
   public final Interpolator f;
   public final Interpolator g;
   public final int h;
   public int i = 0;
   public final int j;
   public float k = 0.0F;
   public float l = 0.0F;
   public float m = 0.0F;
   public float n = 1.0F;
   public float o;
   public int p = 1;
   private final RectF q = new RectF();

   public FrontLensIndicatorOverlay(Context var1, AttributeSet var2) {
      super(var1, var2);
      .flx var5 = ((.efu)var1).a();
      int var3 = (Integer)var5.a(.fln.a).get();
      this.h = var3;
      this.c = .fln.a(var5, var3);
      this.f = new LinearInterpolator();
      this.g = AnimationUtils.loadInterpolator(this.getContext(), 17563661);
      this.j = var1.getResources().getDimensionPixelSize(2131166703);
      Paint var4 = new Paint();
      this.d = var4;
      var4.setAntiAlias(true);
      var4.setStyle(Style.STROKE);
      var4.setColor(.jbc.T(this));
      var4.setAlpha(51);
      var4 = new Paint(var4);
      this.e = var4;
      var4.setAlpha((int)(this.n * 255.0F));
   }

   protected final void onDraw(Canvas var1) {
      float var2 = this.k;
      float var3 = this.l;
      float var4 = this.m;
      int var5 = this.p;
      if (var5 == 4 || var5 == 3) {
         this.d.setStrokeWidth(this.o);
         this.e.setStrokeWidth(this.o);
         this.q.set(var2 - var4, var3 - var4, var2 + var4, var3 + var4);
         var1.drawArc(this.q, -99.0F, (float)this.i, false, this.e);
      }
   }
}
