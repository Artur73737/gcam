package com.google.android.apps.camera.gesturecapture.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import androidx.wear.ambient.AmbientDelegate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CatcherView extends .fro {
   public final Paint a;
   public final Paint c;
   public final Path d;
   public final Path e;
   public final PathMeasure f;
   public final Context g;
   public final Rect h;
   public final Rect i;
   public final RectF j;
   public final Set k = Collections.synchronizedSet(new HashSet());
   public float l;
   public float m;
   public float n;
   public int o = 0;
   public int p = 0;
   public AnimatorSet q;
   public int r = 4;
   public AmbientDelegate s;
   private final Paint t;
   private final Paint u;
   private final Paint v;

   public CatcherView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.g = var1;
      this.j = new RectF();
      this.h = new Rect();
      this.u = new Paint(1);
      this.a = new Paint(1);
      this.d = new Path();
      this.f = new PathMeasure();
      this.t = new Paint();
      this.c = new Paint(1);
      this.e = new Path();
      Paint var3 = new Paint(1);
      this.v = var3;
      var3.setColor(-65536);
      this.i = new Rect();
   }

   public final ValueAnimator b(float var1, float var2, long var3) {
      ValueAnimator var5 = ValueAnimator.ofFloat(new float[]{var1, var2});
      var5.addUpdateListener(new .cgv(this, 12));
      var5.addListener(new .gfa(this, var1));
      var5.addListener(new .gfb(this, var1));
      var5.setDuration(var3);
      var5.setInterpolator(new DecelerateInterpolator());
      return var5;
   }

   protected final void onDraw(Canvas var1) {
      int var4 = this.p;
      if (var4 != 0) {
         this.a.setStrokeWidth((float)var4);
         this.t.setStrokeWidth((float)this.p);
         this.u.setStrokeWidth((float)this.p);
         this.c.setStrokeWidth((float)this.p);
         this.v.setStrokeWidth((float)this.p);
      }

      var4 = this.r;
      if (var4 != 0) {
         if (var4 != 1) {
            if (this.q != null) {
               this.e.reset();
               if (this.i.right - this.i.left > 0 && this.i.bottom - this.i.top > 0) {
                  var1.drawRect(this.i, this.v);
               }

               float var2;
               float var3;
               if (this.r == 6) {
                  var3 = this.m;
                  var2 = this.l;
                  this.f.getSegment(0.0F, var3 * var2, this.e, true);
                  var1.drawRoundRect(this.j, 30.0F, 30.0F, this.a);
                  var1.drawPath(this.e, this.c);
               }

               if (this.r == 2) {
                  var2 = this.m;
                  var3 = this.l;
                  this.f.getSegment(0.0F, var2 * var3, this.e, true);
                  RectF var5 = new RectF();
                  this.e.computeBounds(var5, false);
                  var2 = this.n;
                  var1.scale(var2, var2, var5.left + (var5.right - var5.left) / 2.0F, var5.top + (var5.bottom - var5.top) / 2.0F);
                  var1.drawPath(this.e, this.c);
               }

               if (this.r == 3) {
                  this.f.getSegment(0.0F, 0.0F, this.e, true);
                  var1.drawPath(this.e, this.c);
                  return;
               }
            } else {
               AmbientDelegate var7 = this.s;
               Paint var8 = this.t;
               Paint var6 = this.u;
               var4 = ((CatcherView)var7.a).r;
               if (var4 == 0) {
                  throw null;
               }

               if (var4 != 1) {
                  if (var4 == 6) {
                     var1.scale(0.0F, 0.0F, ((RectF)var7.c).left + (((RectF)var7.c).right - ((RectF)var7.c).left) / 2.0F, ((RectF)var7.c).top + (((RectF)var7.c).bottom - ((RectF)var7.c).top) / 2.0F);
                     var1.drawRoundRect((RectF)var7.c, 30.0F, 30.0F, var8);
                  }

                  if (((CatcherView)var7.a).r == 2) {
                     var1.scale(0.0F, 0.0F, ((RectF)var7.c).left + (((RectF)var7.c).right - ((RectF)var7.c).left) / 2.0F, ((RectF)var7.c).top + (((RectF)var7.c).bottom - ((RectF)var7.c).top) / 2.0F);
                     var1.drawRoundRect((RectF)var7.c, 30.0F, 30.0F, var6);
                     return;
                  }
               }
            }

         }
      } else {
         throw null;
      }
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      this.a.setStyle(Style.STROKE);
      this.a.setColor(-1);
      this.a.setAlpha(76);
      this.a.setStrokeWidth(8.0F);
      this.t.setColor(-1);
      this.t.setStrokeWidth(8.0F);
      this.t.setStyle(Style.STROKE);
      this.u.setStyle(Style.STROKE);
      this.u.setStrokeWidth(8.0F);
      this.u.setColor(this.g.getColor(2131099856));
      this.c.setStyle(Style.STROKE);
      this.c.setStrokeWidth(8.0F);
      this.c.setColor(-1);
      this.v.setStyle(Style.STROKE);
      this.v.setStrokeWidth(8.0F);
   }
}
