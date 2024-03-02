package com.google.android.apps.camera.autotimer.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.View.OnLayoutChangeListener;
import android.view.animation.DecelerateInterpolator;
import j$.time.Duration;

public final class AutoTimerIndicatorView extends View {
   public static final Duration a = Duration.ofMillis(250L);
   static final Duration b = Duration.ofMillis(100L);
   public final OnLayoutChangeListener c;
   final Paint d;
   final ValueAnimator e;
   public ViewPropertyAnimator f;
   private final int g;
   private final int h;
   private final int i;
   private final int j;
   private final int k;
   private final float l;
   private final float m;
   private final float n;
   private final Matrix o;
   private final Paint p;
   private final Paint q;
   private final RectF r;
   private final RectF s;
   private final RectF t;
   private final RectF u;
   private int v;
   private float w;

   public AutoTimerIndicatorView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setLayerType(2, (Paint)null);
      Resources var6 = this.getResources();
      this.h = var6.getDimensionPixelSize(2131165315);
      this.k = var6.getDimensionPixelSize(2131165318);
      this.j = var6.getDimensionPixelSize(2131165317);
      this.i = var6.getDimensionPixelSize(2131165316);
      int var5 = var6.getColor(2131099687);
      this.g = var5;
      float var3 = (float)var6.getDimensionPixelSize(2131165314);
      this.l = var3;
      this.o = new Matrix();
      this.r = new RectF();
      this.u = new RectF();
      this.s = new RectF();
      this.t = new RectF();
      Paint var7 = new Paint();
      this.d = var7;
      var7.setColor(var5);
      var7.setAntiAlias(true);
      var7 = new Paint();
      this.p = var7;
      var7.setColor(var6.getColor(2131099685));
      var7.setAntiAlias(true);
      var7 = new Paint();
      this.q = var7;
      var7.setStyle(Style.STROKE);
      var7.setColor(var6.getColor(2131099686));
      var7.setAntiAlias(true);
      var7.setStrokeCap(Cap.ROUND);
      var7.setStrokeWidth(var3);
      ValueAnimator var8 = ValueAnimator.ofFloat(new float[]{0.0F});
      this.e = var8;
      var8.addUpdateListener(new .cgv(this, 3, (byte[])null));
      var8.setInterpolator(new DecelerateInterpolator());
      var3 = (float)var6.getInteger(2131492874);
      float var4 = (float)var6.getInteger(2131492873);
      this.m = var3 / var4;
      this.n = (var4 - var3) / var4;
      this.c = new .jkd(this, 1, (byte[])null);
   }

   private static RectF c(int var0, int var1, int var2, int var3, int var4) {
      return var4 != 1 && var4 != 3 ? new RectF((float)var0, (float)var1, (float)var2, (float)var3) : new RectF((float)var1, (float)var0, (float)var3, (float)var2);
   }

   public final void a(float var1) {
      this.w = var1;
      if (this.getVisibility() == 0) {
         if (this.e.isRunning()) {
            this.e.cancel();
         }

         float var2 = (Float)this.e.getAnimatedValue();
         this.e.setFloatValues(new float[]{var2, var1});
         this.e.setDuration(b.toMillis());
         this.e.start();
      }

   }

   public final void b(int var1, int var2, int var3, int var4) {
      Display var7 = this.getDisplay();
      int var6;
      if (var7 != null) {
         var6 = var7.getRotation();
      } else {
         var6 = 0;
      }

      this.v = var6;
      this.o.reset();
      this.o.postRotate((float)(-var6 * 90), 0.5F, 0.5F);
      Matrix var9 = this.o;
      float var5 = (float)(var4 - var2);
      var9.postTranslate((float)(var3 - var1) * 0.5F, var5 * 0.5F);
      RectF var8 = c(var1, var2, var3, var4, this.v);
      this.t.top = -var8.height() * 0.5F + (float)this.i;
      RectF var10 = this.t;
      var10.bottom = var10.top + (float)this.h;
      this.t.left = -var8.width() * 0.5F + (float)this.i;
      var10 = this.t;
      var10.right = -var10.left;
      this.s.top = this.t.top;
      this.s.bottom = this.t.bottom;
   }

   protected final void onDraw(Canvas var1) {
      RectF var13 = c(this.getLeft(), this.getTop(), this.getRight(), this.getBottom(), this.v);
      float var2 = (Float)this.e.getAnimatedValue();
      int var12 = this.j;
      float var3 = var13.width();
      int var11 = this.i;
      var2 = (float)(-Math.max(var12, (int)((var3 - (float)(var11 + var11)) * var2)));
      this.s.left = var2 * 0.5F;
      var13 = this.s;
      var13.right = -var13.left;
      this.o.mapRect(this.u, this.s);
      this.o.mapRect(this.r, this.t);
      Paint var14 = this.d;
      var3 = this.w;
      var2 = this.n;
      float var4 = this.m;
      var11 = this.g;
      var14.setColor((int)((var3 * var2 + var4) * 255.0F) << 24 | var11 & 16777215);
      var13 = this.r;
      var2 = (float)this.k;
      var1.drawRoundRect(var13, var2, var2, this.p);
      var3 = this.r.left;
      float var10 = this.l;
      float var7 = this.r.top;
      float var8 = this.l;
      var4 = this.r.right;
      float var6 = this.l;
      float var5 = this.r.bottom;
      float var9 = this.l;
      var2 = (float)this.k;
      var1.drawRoundRect(var3 - var10, var7 - var8, var4 + var6, var5 + var9, var2, var2, this.q);
      var13 = this.u;
      var2 = (float)this.k;
      var1.drawRoundRect(var13, var2, var2, this.d);
   }
}
