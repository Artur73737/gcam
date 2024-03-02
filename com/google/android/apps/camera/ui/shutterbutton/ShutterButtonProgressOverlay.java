package com.google.android.apps.camera.ui.shutterbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
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

public class ShutterButtonProgressOverlay extends View {
   public final Paint a;
   public int b;
   public float c;
   public int d = 0;
   public final int e;
   public final int f;
   public boolean g = true;
   public boolean h = true;
   public AnimatorSet i = null;
   public ValueAnimator j = null;
   public int k = 1;
   private final int l;
   private final Paint m;
   private final Interpolator n;
   private final Interpolator o;
   private final int p;
   private int q = 0;
   private int r;
   private int s;
   private final RectF t = new RectF();
   private AnimatorSet u = null;

   public ShutterButtonProgressOverlay(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setVisibility(4);
      this.l = var1.getResources().getDimensionPixelSize(2131166706);
      this.e = var1.getResources().getDimensionPixelSize(2131166704);
      this.f = var1.getResources().getDimensionPixelSize(2131166707);
      this.n = new LinearInterpolator();
      this.o = AnimationUtils.loadInterpolator(this.getContext(), 17563661);
      Paint var3 = new Paint();
      this.a = var3;
      var3.setAntiAlias(true);
      var3.setStyle(Style.STROKE);
      var3.setColor(-1);
      var3.setAlpha(51);
      var3 = new Paint(var3);
      this.m = var3;
      var3.setAlpha(255);
      this.g = true;
      this.p = .jbc.X(this);
   }

   private final void c(int var1, long var2, boolean var4) {
      this.k = 4;
      if (var2 <= 0L && !var4) {
         this.d = (int)((float)var1 * 3.6F);
         this.invalidate();
      } else {
         ValueAnimator var6 = this.j;
         boolean var5;
         if (var6 != null && var6.isRunning()) {
            var5 = true;
         } else {
            var5 = false;
         }

         if (var1 < 100 && !var5) {
            if (var4) {
               var2 = 3000L;
            }

            byte var7;
            if (!var4) {
               var7 = 0;
            } else {
               var7 = -1;
            }

            var6 = this.j;
            if (var6 != null && var6.isRunning()) {
               this.j.cancel();
            }

            var6 = ValueAnimator.ofInt(new int[]{0, 360});
            this.j = var6;
            var6.setDuration(var2);
            this.j.setInterpolator(this.o);
            this.j.addUpdateListener(new .kiu(this, 8));
            this.j.setRepeatCount(var7);
            this.j.start();
         }

      }
   }

   public final void a() {
      AnimatorSet var1 = this.u;
      if (var1 != null && var1.isRunning()) {
         this.u.cancel();
      }

      ValueAnimator var3 = ValueAnimator.ofFloat(new float[]{(float)this.f, 0.0F});
      var3.setDuration(133L);
      var3.setInterpolator(this.n);
      var3.addUpdateListener(new .kiu(this, 11));
      AnimatorSet var2 = new AnimatorSet();
      this.u = var2;
      var2.play(var3);
      this.u.addListener(new .kmw(this));
      this.u.start();
   }

   public final void b(int var1, long var2, boolean var4) {
      this.m.setColor(-1);
      var1 = Math.min(100, Math.max(var1, 0));
      AnimatorSet var5;
      ValueAnimator var8;
      if (var1 == 0) {
         var5 = this.u;
         if (var5 != null && var5.isRunning()) {
            this.u.cancel();
         }

         if (this.g) {
            this.d = 0;
            this.q = 0;
            this.g = false;
            this.h = true;
            var5 = this.i;
            if (var5 != null && var5.isRunning()) {
               this.i.cancel();
            }

            ValueAnimator var7 = ValueAnimator.ofInt(new int[]{this.l, this.e});
            var7.setDuration(167L);
            var7.setInterpolator(this.o);
            var7.addUpdateListener(new .kiu(this, 9));
            var8 = ValueAnimator.ofFloat(new float[]{0.0F, (float)this.f});
            var8.setDuration(167L);
            var8.setInterpolator(this.o);
            var8.addUpdateListener(new .kiu(this, 10));
            AnimatorSet var6 = new AnimatorSet();
            this.i = var6;
            var6.playTogether(new Animator[]{var7, var8});
            this.i.addListener(new .kmv(this));
            this.i.start();
            if (var4) {
               this.c(0, var2, true);
               return;
            }
         }
      } else {
         var5 = this.i;
         if (var5 != null && var5.isRunning()) {
            this.i.cancel();
         }

         this.c(var1, var2, var4);
         if (var1 == 100) {
            var8 = this.j;
            if (var8 != null && var8.isRunning()) {
               this.j.cancel();
            }

            this.a();
            return;
         }
      }

   }

   public final void onDraw(Canvas var1) {
      if (this.k != 1) {
         if (this.h) {
            var1.drawCircle((float)this.r, (float)this.s, (float)this.b, this.a);
         }

         int var2 = this.k;
         if (var2 == 4 || var2 == 3) {
            this.a.setStrokeWidth(this.c);
            this.m.setStrokeWidth(this.c);
            RectF var5 = this.t;
            int var3 = this.r;
            int var4 = this.b;
            var2 = this.s;
            var5.set((float)(var3 - var4), (float)(var2 - var4), (float)(var3 + var4), (float)(var2 + var4));
            var2 = this.q;
            RectF var6 = this.t;
            Paint var7 = this.m;
            var1.drawArc(var6, (float)(var2 - 100), 20.0F, false, var7);
            this.q = this.d;
         }
      }
   }

   public final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1) {
         this.r = (var4 - var2) / 2;
         this.s = (var5 - var3) / 2;
      }

   }
}
