package com.google.android.apps.camera.bottombar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageButton;

public class RoundedThumbnailView extends ImageButton {
   private static final float HIT_STATE_CIRCLE_OPACITY_SHOW = 0.7F;
   private static final long HIT_STATE_DURATION_MS = 150L;
   private static final int MAX_THUMBNAIL_BITMAP_SIZE = 512;
   private static final int PLACEHOLDER_ICON_COLOR = -10525848;
   private static final long RIPPLE_DURATION_MS = 200L;
   private static final float RIPPLE_OPACITY_BEGIN = 0.4F;
   private static final float RIPPLE_OPACITY_END = 0.0F;
   private static final long RIPPLE_START_DELAY_MS = 100L;
   private static final float THUMBNAIL_FLASH_CIRCLE_OPACITY_BEGIN = 0.8F;
   private static final float THUMBNAIL_FLASH_CIRCLE_OPACITY_END = 0.0F;
   private static final long THUMBNAIL_FLASH_DURATION_MS = 200L;
   private static final float THUMBNAIL_REVEAL_CIRCLE_OPACITY_BEGIN = 0.5F;
   private static final float THUMBNAIL_REVEAL_CIRCLE_OPACITY_END = 0.0F;
   private static final long THUMBNAIL_SHRINK_DURATION_MS = 200L;
   private static final long THUMBNAIL_STRETCH_DURATION_MS = 200L;
   private static final .pds logger = .pds.h("com.google.android.apps.camera.bottombar.RoundedThumbnailView");
   private RoundedThumbnailView$RevealRequest backgroundRequest;
   private float badgeOffset;
   private Paint badgePaint;
   private float badgeSize;
   private Paint borderStrokePaint;
   private ValueAnimator burstFlashAnimator;
   private .otw callback;
   private float currentHitStateCircleOpacity;
   private float currentRevealCircleOpacity;
   private float currentRippleRingDiameter;
   private float currentRippleRingOpacity;
   private float currentRippleRingThickness;
   private float currentThumbnailDiameter;
   private RoundedThumbnailView$RevealRequest foregroundRequest;
   private Paint hitStateCirclePaint;
   private final ValueAnimator hitStateFadeOutAnimator;
   private float innerStrokeWidth;
   private final OnClickListener onClickListener;
   private .otw optionalOnClickListener;
   private RoundedThumbnailView$RevealRequest pendingRequest;
   private Paint revealCirclePaint;
   private ValueAnimator rippleAnimator;
   private Paint ripplePaint;
   private float rippleRingDiameterBegin;
   private float rippleRingDiameterEnd;
   private float rippleRingThicknessBegin;
   private float rippleRingThicknessEnd;
   private boolean showLockedBadge;
   private boolean shrinkTouchArea;
   private AnimatorSet thumbnailAnimatorSet;
   private float thumbnailPadding;
   private float thumbnailShrinkDiameterBegin;
   private float thumbnailShrinkDiameterEnd;
   private float thumbnailStretchDiameterBegin;
   private float thumbnailStretchDiameterEnd;
   private float thumbnailTypeIconSize;
   private int touchShrinkSize;
   private RectF viewRect;

   public RoundedThumbnailView(Context var1, AttributeSet var2) {
      super(var1, var2);
      .ote var3 = .ote.a;
      this.callback = var3;
      this.optionalOnClickListener = var3;
      this.shrinkTouchArea = false;
      this.hitStateFadeOutAnimator = ValueAnimator.ofFloat(new float[]{0.7F, 0.0F});
      this.showLockedBadge = false;
      this.onClickListener = new RoundedThumbnailView$1(this);
      this.initialize();
   }

   private void clearAnimations() {
      AnimatorSet var1 = this.thumbnailAnimatorSet;
      if (var1 != null && var1.isStarted()) {
         this.thumbnailAnimatorSet.removeAllListeners();
         this.thumbnailAnimatorSet.cancel();
         this.thumbnailAnimatorSet = null;
      }

      ValueAnimator var2 = this.rippleAnimator;
      if (var2 != null && var2.isStarted()) {
         this.rippleAnimator.removeAllListeners();
         this.rippleAnimator.cancel();
         this.rippleAnimator = null;
      }

      var2 = this.burstFlashAnimator;
      if (var2 != null && var2.isStarted()) {
         this.burstFlashAnimator.removeAllListeners();
         this.burstFlashAnimator.cancel();
         this.burstFlashAnimator = null;
      }

   }

   private void drawLockedFolderBadge(Canvas var1, float var2, float var3) {
      float var4 = this.badgeOffset;
      var1.drawCircle(var2 + var4, var4 + var3, (this.badgeSize - this.innerStrokeWidth) / 2.0F, this.badgePaint);
      Drawable var9 = this.getResources().getDrawable(R$drawable.quantum_gm_ic_lock_vd_theme_24, (Theme)null);
      var9.mutate().setTint(.jbc.V(this));
      var4 = this.badgeOffset;
      float var5 = this.badgeSize;
      float var6 = var5 / 4.0F;
      int var8 = (int)var5;
      int var7 = (int)(var4 + var2 - var6);
      var8 = var8 / 2 + var7;
      var9.setBounds(var7, var7, var8, var8);
      var9.draw(var1);
      this.borderStrokePaint.setStrokeWidth(this.innerStrokeWidth);
      var4 = this.badgeOffset;
      var1.drawCircle(var2 + var4, var3 + var4, (this.badgeSize - this.innerStrokeWidth) / 2.0F, this.borderStrokePaint);
   }

   private int getColor(int var1) {
      return this.getResources().getColor(var1, (Theme)null);
   }

   private void initialize() {
      super.setOnClickListener(this.onClickListener);
      this.setOnLongClickListener(new RoundedThumbnailView$$ExternalSyntheticLambda0(this));
      this.setClickable(true);
      this.thumbnailPadding = this.getResources().getDimension(R$dimen.rounded_thumbnail_padding);
      this.thumbnailStretchDiameterBegin = this.getResources().getDimension(R$dimen.rounded_thumbnail_diameter_min);
      float var1 = this.getResources().getDimension(R$dimen.rounded_thumbnail_diameter_max);
      this.thumbnailStretchDiameterEnd = var1;
      this.thumbnailShrinkDiameterBegin = var1;
      this.thumbnailShrinkDiameterEnd = this.getResources().getDimension(R$dimen.rounded_thumbnail_diameter_normal);
      this.thumbnailTypeIconSize = this.getResources().getDimension(R$dimen.rounded_thumbnail_type_icon_size);
      var1 = this.getResources().getDimension(R$dimen.rounded_thumbnail_ripple_ring_diameter_max);
      this.rippleRingDiameterEnd = var1;
      this.viewRect = new RectF(0.0F, 0.0F, var1, var1);
      this.rippleRingDiameterBegin = this.getResources().getDimension(R$dimen.rounded_thumbnail_ripple_ring_diameter_min);
      this.rippleRingThicknessBegin = this.getResources().getDimension(R$dimen.rounded_thumbnail_ripple_ring_thick_max);
      this.rippleRingThicknessEnd = this.getResources().getDimension(R$dimen.rounded_thumbnail_ripple_ring_thick_min);
      this.touchShrinkSize = this.getResources().getDimensionPixelOffset(R$dimen.rounded_thumbnail_shrink_size);
      Paint var3 = new Paint(1);
      this.hitStateCirclePaint = var3;
      var3.setColor(-1);
      this.hitStateCirclePaint.setStyle(Style.FILL);
      this.hitStateFadeOutAnimator.setDuration(150L);
      this.hitStateFadeOutAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
      this.hitStateFadeOutAnimator.addUpdateListener(new RoundedThumbnailView$$ExternalSyntheticLambda1(this));
      var3 = new Paint(1);
      this.ripplePaint = var3;
      var3.setColor(-1);
      this.ripplePaint.setStyle(Style.STROKE);
      var3 = new Paint(1);
      this.revealCirclePaint = var3;
      var3.setColor(-1);
      this.revealCirclePaint.setStyle(Style.FILL);
      var3 = new Paint(1);
      this.borderStrokePaint = var3;
      var3.setStyle(Style.STROKE);
      var1 = this.getResources().getDimension(R$dimen.rounded_thumbnail_inner_stroke_width);
      this.innerStrokeWidth = var1;
      this.borderStrokePaint.setStrokeWidth(var1);
      this.borderStrokePaint.setColor(-1);
      var3 = new Paint(1);
      this.badgePaint = var3;
      var3.setColor(.jbc.Z(this));
      this.badgePaint.setStyle(Style.FILL);
      this.badgeSize = this.getResources().getDimension(R$dimen.badge_size);
      this.badgeOffset = this.getResources().getDimension(R$dimen.badge_offset_from_center);
      this.setThumbnail(this.getDefaultThumbnail(.kta.a), 0, false);
      Drawable var4 = this.getBackground();
      if (var4 instanceof RippleDrawable) {
         var4 = var4.getConstantState().newDrawable().mutate();
         int var2 = this.getResources().getDimensionPixelSize(R$dimen.camera_switch_button_ripple_diameter);
         ((RippleDrawable)var4).setRadius(var2 / 2);
         this.setBackground(var4);
      }

   }

   private void processRevealRequests() {
      RoundedThumbnailView$RevealRequest var1 = this.foregroundRequest;
      if (var1 != null && var1.isFinished()) {
         this.backgroundRequest = this.foregroundRequest;
         this.foregroundRequest = null;
      }

   }

   private void runBurstFlashAnimation() {
      RoundedThumbnailView$RevealRequest var1 = this.foregroundRequest;
      if (var1 != null) {
         this.backgroundRequest = var1;
         var1.finishRippleAnimation();
         this.backgroundRequest.finishThumbnailAnimation();
      }

      this.foregroundRequest = this.backgroundRequest;
      this.pendingRequest = null;
      this.clearAnimations();
      this.setVisibility(0);
      Interpolator var2 = AnimationUtils.loadInterpolator(this.getContext(), 17563661);
      ValueAnimator var3 = ValueAnimator.ofFloat(new float[]{this.thumbnailStretchDiameterBegin, this.thumbnailShrinkDiameterEnd});
      this.burstFlashAnimator = var3;
      var3.setDuration(200L);
      this.burstFlashAnimator.setInterpolator(var2);
      this.burstFlashAnimator.setRepeatCount(-1);
      this.burstFlashAnimator.addUpdateListener(new RoundedThumbnailView$$ExternalSyntheticLambda2(this));
      this.burstFlashAnimator.addListener(new RoundedThumbnailView$4(this));
      this.burstFlashAnimator.start();
   }

   private void runPendingRequestAnimation() {
      RoundedThumbnailView$RevealRequest var2 = this.pendingRequest;
      .onk.p(var2);
      boolean var1 = var2.isAnimationDisabled() ^ true;
      if (var1) {
         this.backgroundRequest = null;
         var2 = this.foregroundRequest;
         if (var2 != null) {
            this.backgroundRequest = var2;
            var2.finishRippleAnimation();
            this.backgroundRequest.finishThumbnailAnimation();
         }
      }

      var2 = this.pendingRequest;
      this.foregroundRequest = var2;
      this.pendingRequest = null;
      if (!var1) {
         if (this.thumbnailAnimatorSet == null) {
            this.currentThumbnailDiameter = this.thumbnailShrinkDiameterEnd;
            this.currentRevealCircleOpacity = 0.0F;
            .onk.p(var2);
            var2.finishThumbnailAnimation();
         }

         if (this.rippleAnimator == null) {
            var2 = this.foregroundRequest;
            .onk.p(var2);
            var2.finishRippleAnimation();
         }

         this.invalidate();
      } else {
         this.clearAnimations();
         this.setVisibility(0);
         Interpolator var4 = AnimationUtils.loadInterpolator(this.getContext(), 17563661);
         ValueAnimator var5 = ValueAnimator.ofFloat(new float[]{this.thumbnailStretchDiameterBegin, this.thumbnailStretchDiameterEnd});
         var5.setDuration(200L);
         var5.setInterpolator(var4);
         var5.addUpdateListener(new RoundedThumbnailView$$ExternalSyntheticLambda3(this));
         ValueAnimator var3 = ValueAnimator.ofFloat(new float[]{this.thumbnailShrinkDiameterBegin, this.thumbnailShrinkDiameterEnd});
         var3.setDuration(200L);
         var3.setInterpolator(var4);
         var3.addUpdateListener(new RoundedThumbnailView$$ExternalSyntheticLambda4(this));
         AnimatorSet var7 = new AnimatorSet();
         this.thumbnailAnimatorSet = var7;
         var7.playSequentially(new Animator[]{var5, var3});
         this.thumbnailAnimatorSet.addListener(new RoundedThumbnailView$2(this));
         this.thumbnailAnimatorSet.start();
         Interpolator var6 = AnimationUtils.loadInterpolator(this.getContext(), 17563662);
         var3 = ValueAnimator.ofFloat(new float[]{this.rippleRingDiameterBegin, this.rippleRingDiameterEnd});
         this.rippleAnimator = var3;
         var3.setDuration(200L);
         this.rippleAnimator.setInterpolator(var6);
         this.rippleAnimator.addListener(new RoundedThumbnailView$3(this));
         this.rippleAnimator.addUpdateListener(new RoundedThumbnailView$$ExternalSyntheticLambda5(this));
         this.rippleAnimator.setStartDelay(100L);
         this.rippleAnimator.start();
         var2 = this.foregroundRequest;
         .onk.p(var2);
         this.announceForAccessibility(var2.getAccessibilityString());
      }
   }

   private void stopBurstFlashAnimation() {
      ValueAnimator var1 = this.burstFlashAnimator;
      if (var1 != null) {
         var1.setRepeatCount(0);
      }

   }

   public boolean dispatchTouchEvent(MotionEvent var1) {
      return this.shrinkTouchArea && var1.getAction() == 0 && var1.getY() < (float)this.touchShrinkSize ? false : super.dispatchTouchEvent(var1);
   }

   public void flashThumbnail() {
      .mbx.a();
      this.runBurstFlashAnimation();
   }

   public Bitmap getDefaultThumbnail(.kta var1) {
      int var5 = (int)this.thumbnailShrinkDiameterEnd;
      Bitmap var6 = Bitmap.createBitmap(var5, var5, Config.ARGB_8888);
      var6.eraseColor(this.getColor(R$color.indicator_background));
      .kta var7 = .kta.a;
      int var4 = var1.ordinal();
      Drawable var8 = null;
      switch(var4) {
      case 0:
         var6.eraseColor(-10525848);
         return var6;
      case 1:
         var8 = this.getResources().getDrawable(R$drawable.quantum_gm_ic_lock_vd_theme_24, (Theme)null);
         var8.mutate().setTint(.jbc.V(this));
         var6.eraseColor(.jbc.Z(this));
         break;
      case 2:
         var8 = this.getResources().getDrawable(R$drawable.ic_camera_thumbnail, (Theme)null);
         break;
      case 3:
         var8 = this.getResources().getDrawable(R$drawable.ic_burst_thumbnail, (Theme)null);
         break;
      case 4:
         var8 = this.getResources().getDrawable(R$drawable.ic_videocam_thumbnail, (Theme)null);
         break;
      case 5:
         var8 = this.getResources().getDrawable(R$drawable.quantum_gm_ic_lock_vd_theme_24, (Theme)null);
      }

      Canvas var9 = new Canvas(var6);
      if (var8 != null) {
         float var2 = (float)var5;
         float var3 = this.thumbnailTypeIconSize;
         var5 = (int)var3;
         var4 = (int)((var2 - var3) / 2.0F);
         var5 += var4;
         var8.setBounds(var4, var4, var5, var5);
         var8.draw(var9);
      }

      return var6;
   }

   public float getRippleRingMaxDiameterDp() {
      return this.rippleRingDiameterEnd;
   }

   public float getThumbnailFinalDiameter() {
      return this.thumbnailShrinkDiameterEnd;
   }

   public float getThumbnailPadding() {
      return this.thumbnailPadding;
   }

   public boolean hasOverlappingRendering() {
      return true;
   }

   // $FF: synthetic method
   public boolean lambda$initialize$0$com_google_android_apps_camera_bottombar_RoundedThumbnailView/* $FF was: lambda$initialize$0$com-google-android-apps-camera-bottombar-RoundedThumbnailView*/(View var1) {
      if (!var1.isClickable()) {
         return false;
      } else {
         return this.callback.h() ? ((RoundedThumbnailView$Callback)this.callback.c()).onLongPress() : false;
      }
   }

   // $FF: synthetic method
   public void lambda$initialize$1$com_google_android_apps_camera_bottombar_RoundedThumbnailView/* $FF was: lambda$initialize$1$com-google-android-apps-camera-bottombar-RoundedThumbnailView*/(ValueAnimator var1) {
      this.currentHitStateCircleOpacity = (Float)var1.getAnimatedValue();
      this.invalidate();
   }

   // $FF: synthetic method
   public void lambda$runBurstFlashAnimation$5$com_google_android_apps_camera_bottombar_RoundedThumbnailView/* $FF was: lambda$runBurstFlashAnimation$5$com-google-android-apps-camera-bottombar-RoundedThumbnailView*/(ValueAnimator var1) {
      this.currentThumbnailDiameter = (Float)var1.getAnimatedValue();
      this.currentRevealCircleOpacity = var1.getAnimatedFraction() * -0.8F + 0.8F;
      this.invalidate();
   }

   // $FF: synthetic method
   public void lambda$runPendingRequestAnimation$2$com_google_android_apps_camera_bottombar_RoundedThumbnailView/* $FF was: lambda$runPendingRequestAnimation$2$com-google-android-apps-camera-bottombar-RoundedThumbnailView*/(ValueAnimator var1) {
      this.currentThumbnailDiameter = (Float)var1.getAnimatedValue();
      this.currentRevealCircleOpacity = var1.getAnimatedFraction() * -0.5F + 0.5F;
      this.invalidate();
   }

   // $FF: synthetic method
   public void lambda$runPendingRequestAnimation$3$com_google_android_apps_camera_bottombar_RoundedThumbnailView/* $FF was: lambda$runPendingRequestAnimation$3$com-google-android-apps-camera-bottombar-RoundedThumbnailView*/(ValueAnimator var1) {
      this.currentThumbnailDiameter = (Float)var1.getAnimatedValue();
      this.invalidate();
   }

   // $FF: synthetic method
   public void lambda$runPendingRequestAnimation$4$com_google_android_apps_camera_bottombar_RoundedThumbnailView/* $FF was: lambda$runPendingRequestAnimation$4$com-google-android-apps-camera-bottombar-RoundedThumbnailView*/(ValueAnimator var1) {
      this.currentRippleRingDiameter = (Float)var1.getAnimatedValue();
      float var2 = var1.getAnimatedFraction();
      float var3 = this.rippleRingThicknessBegin;
      this.currentRippleRingThickness = var3 + (this.rippleRingThicknessEnd - var3) * var2;
      this.currentRippleRingOpacity = var2 * -0.4F + 0.4F;
      this.invalidate();
   }

   protected void onDraw(Canvas var1) {
      super.onDraw(var1);
      float var2 = (float)this.getWidth();
      float var5 = (float)this.getHeight();
      float var4 = this.rippleRingDiameterEnd;
      float var3 = this.thumbnailShrinkDiameterEnd;
      var1.clipRect(this.viewRect);
      var2 /= 2.0F;
      var5 /= 2.0F;
      RoundedThumbnailView$RevealRequest var7 = this.backgroundRequest;
      float var6;
      Paint var8;
      if (var7 != null) {
         var8 = var7.getThumbnailPaint();
         if (var8 != null) {
            var6 = var3 / var4;
            var1.save();
            var1.scale(var6, var6, var2, var5);
            var1.drawRoundRect(this.viewRect, var2, var5, var8);
            var6 = this.innerStrokeWidth / var6;
            this.borderStrokePaint.setStrokeWidth(var6);
            var1.drawCircle(var2, var5, var2 - var6 / 2.0F, this.borderStrokePaint);
            var1.restore();
         }
      }

      if (this.foregroundRequest != null) {
         if (this.currentRippleRingThickness > 0.0F) {
            ValueAnimator var9 = this.rippleAnimator;
            if (var9 != null && var9.isRunning()) {
               this.ripplePaint.setAlpha((int)(this.currentRippleRingOpacity * 255.0F));
               this.ripplePaint.setStrokeWidth(this.currentRippleRingThickness);
               var1.save();
               var1.drawCircle(var2, var5, this.currentRippleRingDiameter / 2.0F, this.ripplePaint);
               var1.restore();
            }
         }

         var6 = this.currentThumbnailDiameter / this.rippleRingDiameterEnd;
         var1.save();
         var1.scale(var6, var6, var2, var5);
         var7 = this.foregroundRequest;
         .onk.p(var7);
         var8 = var7.getThumbnailPaint();
         if (var8 != null) {
            var1.drawRoundRect(this.viewRect, var2, var5, var8);
            var6 = this.innerStrokeWidth / var6;
            this.borderStrokePaint.setStrokeWidth(var6);
            var1.drawCircle(var2, var5, var2 - var6 / 2.0F, this.borderStrokePaint);
         }

         this.revealCirclePaint.setAlpha((int)(this.currentRevealCircleOpacity * 255.0F));
         var1.drawCircle(var2, var5, this.rippleRingDiameterEnd / 2.0F, this.revealCirclePaint);
         var1.restore();
      }

      if (this.showLockedBadge) {
         this.drawLockedFolderBadge(var1, var2, var5);
      }

      if (this.currentHitStateCircleOpacity > 0.0F) {
         var1.save();
         var3 /= var4;
         var1.scale(var3, var3, var2, var5);
         this.hitStateCirclePaint.setAlpha((int)(this.currentHitStateCircleOpacity * 255.0F));
         var1.drawCircle(var2, var5, this.rippleRingDiameterEnd / 2.0F, this.hitStateCirclePaint);
         var1.restore();
      }

   }

   protected void onMeasure(int var1, int var2) {
      var1 = (int)this.rippleRingDiameterEnd;
      this.setMeasuredDimension(var1, var1);
   }

   public void resetThumbnailView() {
      this.setPressed(false);
      this.invalidate();
   }

   public void setCallback(RoundedThumbnailView$Callback var1) {
      this.callback = .otw.j(var1);
   }

   public void setClickable(boolean var1) {
      super.setClickable(var1);
   }

   public void setOnClickListener(OnClickListener var1) {
      this.optionalOnClickListener = .otw.i(var1);
   }

   public void setPressed(boolean var1) {
      super.setPressed(var1);
      if (var1) {
         this.currentHitStateCircleOpacity = 0.7F;
         this.invalidate();
      } else {
         if (this.currentHitStateCircleOpacity > 0.0F) {
            this.hitStateFadeOutAnimator.start();
         }

      }
   }

   public void setThumbnail(Bitmap var1, int var2, boolean var3) {
      var1.getClass();
      .mbx.a();
      this.showLockedBadge = var3;
      if (this.pendingRequest == null) {
         this.pendingRequest = RoundedThumbnailView$RevealRequest.createNonAnimatedRevealRequest(this.rippleRingDiameterEnd, "");
      }

      this.pendingRequest.setThumbnailBitmap(var1, var2);
      if (this.getVisibility() != 0) {
         this.backgroundRequest = null;
         this.foregroundRequest = null;
      }

      this.runPendingRequestAnimation();
   }

   public void startRevealThumbnailAnimation(String var1) {
      .mbx.a();
      this.pendingRequest = RoundedThumbnailView$RevealRequest.createAnimatedRevealRequest((float)this.getMeasuredWidth(), var1);
   }

   public void stopFlashThumbnail() {
      .mbx.a();
      this.stopBurstFlashAnimation();
   }
}
