package com.google.android.apps.camera.filmstrip.transition;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;

public class FilmstripTransitionLayout extends FrameLayout {
   public final ValueAnimator a;
   public final ValueAnimator b;
   public boolean c = false;
   public boolean d = false;
   public FilmstripTransitionThumbnailView e;
   public RoundedThumbnailView f;
   public boolean g = true;
   public .gas h;
   public .mdh i;
   public .flx j;
   public .kva k;
   public .gam l = null;
   private final .mvd m = .mvd.a();

   public FilmstripTransitionLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setVisibility(4);
      this.b(0.0F);
      Interpolator var3 = AnimationUtils.loadInterpolator(var1, 17563661);
      ValueAnimator var4 = ValueAnimator.ofFloat(new float[]{1.0F, 0.0F});
      this.a = var4;
      var4.setDuration(250L);
      var4.setInterpolator(var3);
      var4.addUpdateListener(new .gaq(this, 1));
      var4.addListener(new .gap(this));
      var4 = ValueAnimator.ofFloat(new float[]{0.0F, 1.0F});
      this.b = var4;
      var4.setDuration(250L);
      var4.setInterpolator(var3);
      var4.addUpdateListener(new .gaq(this, 0));
      var4.addListener(new .gar(this));
   }

   public final .gat a() {
      this.f.getClass();
      SizeF var10 = new SizeF((float)this.e.a().getWidth(), (float)this.e.a().getHeight());
      float var1 = this.f.getThumbnailFinalDiameter();
      Point var11 = .jbc.ap(this.f);
      float var2 = this.f.getRippleRingMaxDiameterDp();
      RectF var16 = new RectF((float)var11.x, (float)var11.y, (float)var11.x + var2, (float)var11.y + var2);
      View var13 = this.getRootView();
      int[] var12 = .ktc.i(var13);
      int var5 = 0;
      int var4 = var12[0];
      float var3 = (float)var4;
      var2 = (float)var12[1];
      int var6 = var13.getWidth();
      int var7 = var12[1];
      int var8 = var13.getHeight();
      RectF var17 = new RectF(var3, var2, (float)(var4 + var6), (float)(var7 + var8));
      Context var14 = this.getContext();
      Point var18 = new Point();
      ((Activity)var14).getWindowManager().getDefaultDisplay().getRealSize(var18);
      RectF var19 = new RectF(0.0F, 0.0F, (float)var18.x, (float)var18.y);
      boolean var9 = this.m.b;
      if (.ktc.e(this)) {
         int[] var20 = .ktc.i(this.getRootView());
         WindowInsets var15 = this.getRootWindowInsets();
         if (this.getResources().getConfiguration().orientation == 1) {
            var4 = Math.max(var20[1] + var15.getSystemWindowInsetTop(), var15.getSystemWindowInsetBottom());
         } else {
            var5 = Math.max(var20[0] + var15.getSystemWindowInsetLeft(), var15.getSystemWindowInsetRight());
            var4 = 0;
         }

         Point var21 = new Point(var5, var4);
         var19.inset((float)var21.x, (float)var21.y);
      }

      if (this.d()) {
         var19.bottom -= (var19.bottom - var19.top) * 0.5F;
      }

      return new .gat(var10, var17, var19, var16, var1);
   }

   public final void b(float var1) {
      this.setBackgroundColor(Color.argb((int)(var1 * 255.0F), 0, 0, 0));
   }

   public final void c(float var1) {
      .gas var3 = this.h;
      var3.getClass();
      float var2 = var3.b(var1);
      this.e.setScaleX(var2);
      this.e.setScaleY(var2);
      PointF var4 = this.h.c(var1);
      this.e.setTranslationX(var4.x);
      this.e.setTranslationY(var4.y);
      var2 = this.h.a(var1);
      this.e.b(var2);
      this.b(.gas.d(var1));
   }

   public final boolean d() {
      .flx var1 = this.j;
      if (var1 != null && this.k != null && this.i != null) {
         String var2 = var1.k(.fmr.b);
         if (var2 != null && this.k.b(var2) && ((.kej)this.i.eZ()).a == .kek.e) {
            return true;
         }
      }

      return false;
   }

   public final void onFinishInflate() {
      super.onFinishInflate();
      this.e = (FilmstripTransitionThumbnailView)this.findViewById(2131428386);
   }
}
