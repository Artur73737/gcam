package com.google.android.apps.camera.ui.shutterbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class ShutterButton extends .io {
   private static final int ALL_CIRCLE_SCALES = 360;
   private static final float BUTTON_CLICK_SPLASH_FACTOR = 1.06F;
   private static final int BUTTON_CLICK_SPLASH_IN_DURATION_MS = 250;
   private static final int BUTTON_CLICK_SPLASH_OUT_DURATION_MS = 100;
   private static final int BUTTON_DISABLED_DELAY_MS = 500;
   private static final .ozr CAROUSEL_IDLE_MODES;
   static final int DISABLED_FILTER_COLOR_VALUE = 165;
   private static final int INNER_DOTS_BASE = 18;
   private static final float INTER_CIRCLE_RING_ALPHA = 0.32F;
   private static final int MSG_UPDATE_CIRCLE_PAUSE_STATE = 1001;
   private static final int MSG_UPDATE_CIRCLE_PROGRESS_STATE = 1002;
   private static final int MSG_UPDATE_CIRCLE_RESUME_STATE = 1000;
   private static final int PHOTO_DISABLE_ANIMATION_DURATION_MS = 150;
   private static final long TICK_MARK_BLINKING_INTERVAL_MS = 1000L;
   private static final int TICK_MARK_SCALE_BASE = 30;
   private static final int TICK_MARK_SCALE_SIZE = 30;
   private static final float VIDEO_RECORDING_INTER_CIRCLE_RING_ALPHA = 0.86F;
   private static final .pds logger = .pds.h("com.google.android.apps.camera.ui.shutterbutton.ShutterButton");
   private static .kly msgHandler;
   private static .klz progressState;
   private .ksm applicationMode;
   private boolean blockClickForAnimation;
   private int buttonCenterX;
   private int buttonCenterY;
   private RectF buttonRect;
   private int circleAnimationIndex;
   boolean clickEnabled;
   private final .mdm clickEnabledObservable;
   private Paint currentInnerPortraitRingPaint;
   private Paint currentMainButtonPaint;
   private Paint currentOuterPortraitRingPaint;
   private Paint currentPhotoCirclePaint;
   private Paint currentRipplePaint;
   private float currentScaleFactor;
   private .knb currentSpec;
   private final Object currentSpecLock;
   private Paint currentVideoCirclePaint;
   private int disabledFilterGreyValue;
   private final AtomicBoolean enableLongPressMotion;
   private ValueAnimator enableStateChangeAnimator;
   private final .mdh filteredClickEnabledObservable;
   private boolean forRemoteShutter;
   private .flx gcaConfig;
   private GestureDetector gestureDetector;
   private boolean hasPressAndReleaseHaptic;
   public .kna inFlightSpecBuilder;
   private Paint innerDotsCirclePaint;
   private final AtomicBoolean isAccessibleShot;
   private boolean isCircleProgressVisible;
   private boolean isCircleWaitingVisible;
   private final AtomicBoolean isLongPressInProgress;
   private boolean isVideoButtonAnimating;
   private boolean isZoomLockEnabled;
   private .kmt listener;
   private .klu longPressMotionListener;
   private MotionEvent longPressStartMotionEvent;
   private final AccessibilityAction longShotEndAccessibilityAction;
   private final AccessibilityAction longShotStartAccessibilityAction;
   private Paint mainInnerCircleButtonPaint;
   private Paint mainOuterCircleButtonPaint;
   private AnimatorSet modeTransitionAnimatorSet;
   private boolean oldPressed;
   private .klv onDrawListener;
   private final boolean[] tickMarkCircleState;
   private Paint tickMarkPaint;
   private .ksz touchCoordinate;
   private boolean visualFeedbackForEnableState;

   static {
      CAROUSEL_IDLE_MODES = .ozr.M(.klw.u, .klw.z, .klw.d, .klw.a, .klw.E, .klw.f, .klw.B, .klw.O);
      progressState = .klz.a;
   }

   public ShutterButton(Context var1, AttributeSet var2) {
      this(var1, var2, false);
   }

   public ShutterButton(Context var1, AttributeSet var2, boolean var3) {
      super(var1, var2);
      this.blockClickForAnimation = false;
      this.clickEnabled = false;
      .mdm var6 = new .mdm(new .fik(this, 7));
      this.clickEnabledObservable = var6;
      this.filteredClickEnabledObservable = .mdc.a(var6);
      this.isLongPressInProgress = new AtomicBoolean(false);
      this.enableLongPressMotion = new AtomicBoolean(false);
      this.isAccessibleShot = new AtomicBoolean(false);
      this.currentSpecLock = new Object();
      this.tickMarkCircleState = new boolean[30];
      this.isZoomLockEnabled = false;
      this.forRemoteShutter = false;
      this.hasPressAndReleaseHaptic = false;
      this.visualFeedbackForEnableState = true;
      this.longShotStartAccessibilityAction = new AccessibilityAction(2131427397, this.getResources().getString(2132017207));
      this.longShotEndAccessibilityAction = new AccessibilityAction(2131427396, this.getResources().getString(2132017193));
      this.getClass().getSimpleName();
      long var4 = (long)ViewConfiguration.getLongPressTimeout();
      if (var4 <= 0L) {
         ((.pdq)logger.c().I(4466)).s("System has invalid long press threshold value=%d ms", var4);
      }

      this.forRemoteShutter = var3;
      this.initialize(var1, var3);
      if (var1 instanceof .efu) {
         this.gcaConfig = ((.efu)var1).a();
      }

   }

   // $FF: synthetic method
   static void access$001(ShutterButton var0, boolean var1) {
      var0.setEnabled(var1);
   }

   private void animateMainButton(.klw var1, .jgq var2, .kmn var3) {
      this.cancelModeTransitionAnimations(true);
      .knb var4 = this.getCurrentSpec();
      .knb var5 = .knb.c(var1, var2, this, this.isZoomLockEnabled, this.forRemoteShutter);
      AnimatorSet var6 = var3.a(var3.b.getCurrentSpec(), var5);
      this.setSpecsForAnimatorTransition(var4, var5);
      var6.addListener(.kfq.w(new .ilb(this, var5, 5)));
      this.modeTransitionAnimatorSet = var6;
      var6.start();
   }

   private void drawInnerDots(Canvas var1) {
      .knb var3 = this.getCurrentSpec();
      this.innerDotsCirclePaint.setAlpha(var3.q);

      for(int var2 = 0; var2 < 18; ++var2) {
         var1.save();
         var1.rotate((float)var2 * 20.0F, (float)this.buttonCenterX, (float)this.buttonCenterY);
         var1.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, (float).ktc.b(1.5F) * this.currentScaleFactor, this.innerDotsCirclePaint);
         var1.restore();
      }

   }

   private void drawTickMarkForCircleEdge(Canvas var1) {
      if (progressState != .klz.a && progressState != .klz.b) {
         .knb var11 = this.getCurrentSpec();
         float var4 = (float)var11.x;
         float var5 = (float)var11.y;
         float var3 = (float)var11.z;
         int var6 = 0;

         while(true) {
            boolean[] var12 = this.tickMarkCircleState;
            if (var6 >= var12.length) {
               if (progressState == .klz.d) {
                  this.updateTickMarkBlinkingState();
               }

               return;
            }

            if (var12[var6]) {
               var1.save();
               var1.rotate((float)var6 * 12.0F, (float)this.buttonCenterX, (float)this.buttonCenterY);
               int var9 = this.buttonCenterX;
               int var10 = .ktc.b(0.5F);
               int var8 = this.buttonCenterX;
               int var7 = .ktc.b(0.5F);
               Paint var13 = this.tickMarkPaint;
               float var2 = (float)(var8 + var7);
               var1.drawRoundRect((float)(var9 - var10), var5, var2, var5 + var4, var3, var3, var13);
               var1.restore();
            }

            ++var6;
         }
      }
   }

   private void endAccessibleLongShot() {
      .kmt var1 = this.listener;
      if (var1 != null) {
         this.isAccessibleShot.set(false);
         var1.onShutterButtonLongPressRelease();
         var1.onShutterButtonPressedStateChanged(false);
      }

   }

   private ColorFilter getColorFilterToApply(boolean var1, .klw var2) {
      if (this.visualFeedbackForEnableState && !var1) {
         if (CAROUSEL_IDLE_MODES.contains(var2)) {
            int var3 = this.disabledFilterGreyValue;
            return new LightingColorFilter(Color.rgb(var3, var3, var3), 0);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private int getContentDescriptionIdForMode(.klw var1) {
      switch(var1.ordinal()) {
      case 0:
      case 1:
      case 2:
      case 35:
         return 2132017218;
      case 3:
      case 4:
         return 2132017220;
      case 5:
      case 6:
      case 40:
         if (this.applicationMode == .ksm.f) {
            return 2132017202;
         } else {
            if (this.applicationMode == .ksm.t) {
               return 2132017182;
            }

            return 2132017192;
         }
      case 7:
      case 23:
      case 24:
         return 2132017188;
      case 8:
      case 9:
      case 10:
         return 2132017198;
      case 11:
         if (this.applicationMode == .ksm.f) {
            return 2132017203;
         } else {
            if (this.applicationMode == .ksm.t) {
               return 2132017183;
            }

            return 2132017193;
         }
      case 12:
         return 2132017189;
      case 13:
         return 2132017190;
      case 14:
      case 15:
      case 16:
      case 20:
      case 21:
      case 22:
      case 25:
      case 26:
         return 2132017217;
      case 17:
      case 18:
      case 19:
         return 2132017215;
      case 27:
      case 28:
      case 29:
         return 2132017216;
      case 30:
      case 31:
      case 34:
         return 2132017194;
      case 32:
      case 33:
         return 2132017195;
      case 36:
         return 2132017193;
      case 37:
         return 2132017184;
      case 38:
         return 2132017185;
      case 39:
         return 2132017219;
      default:
         return 2132017218;
      }
   }

   private void initialize(Context var1, boolean var2) {
      this.setLayerType(2, (Paint)null);
      this.gestureDetector = new GestureDetector(var1, new .klt(this));
      Paint var3 = new Paint();
      this.currentMainButtonPaint = var3;
      var3.setAntiAlias(true);
      this.currentMainButtonPaint.setColor(-1);
      this.currentRipplePaint = new Paint(this.currentMainButtonPaint);
      var3 = new Paint();
      this.mainInnerCircleButtonPaint = var3;
      var3.setAntiAlias(true);
      var3 = new Paint();
      this.mainOuterCircleButtonPaint = var3;
      var3.setAntiAlias(true);
      this.mainOuterCircleButtonPaint.setStrokeWidth(this.getOuterCircleStrokeWidth());
      this.mainOuterCircleButtonPaint.setStyle(Style.STROKE);
      this.mainOuterCircleButtonPaint.setColor(-1);
      var3 = new Paint();
      this.innerDotsCirclePaint = var3;
      var3.setAntiAlias(true);
      var3 = new Paint(this.currentMainButtonPaint);
      this.currentPhotoCirclePaint = var3;
      var3.setColor(this.getResources().getColor(2131099736, (Theme)null));
      var3 = new Paint(this.currentMainButtonPaint);
      this.currentInnerPortraitRingPaint = var3;
      var3.setColor(this.getResources().getColor(2131101651, (Theme)null));
      var3 = new Paint(this.currentMainButtonPaint);
      this.currentOuterPortraitRingPaint = var3;
      var3.setColor(this.getResources().getColor(2131101652, (Theme)null));
      this.disabledFilterGreyValue = 255;
      var3 = new Paint(this.currentMainButtonPaint);
      this.currentVideoCirclePaint = var3;
      var3.setColor(this.getResources().getColor(2131102117, (Theme)null));
      var3 = new Paint();
      this.tickMarkPaint = var3;
      var3.setAntiAlias(true);
      this.tickMarkPaint.setColor(-1);
      this.tickMarkPaint.setStyle(Style.STROKE);
      this.tickMarkPaint.setStrokeWidth((float).ktc.b(2.3F));
      .knb var4 = .knb.c(.klw.a, .jgq.e, this, this.isZoomLockEnabled, var2);
      this.setCurrentSpec(var4);
      this.resetShutterButton();
      this.buttonRect = new RectF();
      this.currentScaleFactor = this.getDefaultScale();
      this.setOutlineProvider(new .klx(this));
      this.updateContentDescription(var4.v);
      this.setClickEnabled(false);
   }

   private boolean isLasagnaShutter(.klw var1) {
      return var1 == .klw.B || var1 == .klw.C || var1 == .klw.D;
   }

   private void resetShutterButton() {
      .knb var1 = this.getCurrentSpec();
      .klw var2 = var1.v;
      .jgq var3 = var1.w;
      this.cancelModeTransitionAnimations(false);
      this.setCurrentSpec(.knb.c(var1.v, var1.w, this, this.isZoomLockEnabled, this.forRemoteShutter));
      this.invalidate();
   }

   private void runEnableChangeAnimation(boolean var1, boolean var2) {
      ValueAnimator var6 = this.enableStateChangeAnimator;
      if (var6 != null) {
         var6.cancel();
      }

      short var3;
      if (!var1) {
         var3 = 165;
      } else {
         var3 = 255;
      }

      var6 = ValueAnimator.ofInt(new int[]{this.disabledFilterGreyValue, var3});
      this.enableStateChangeAnimator = var6;
      var6.setDuration(150L);
      this.enableStateChangeAnimator.addUpdateListener(new .kiu(this, 6));
      if (!var1) {
         var6 = this.enableStateChangeAnimator;
         long var4;
         if (!var2) {
            var4 = 0L;
         } else {
            var4 = 500L;
         }

         var6.setStartDelay(var4);
      }

      this.enableStateChangeAnimator.start();
   }

   private void setCurrentSpec(.knb param1) {
      // $FF: Couldn't be decompiled
   }

   private void setSpecsForAnimatorTransition(.knb param1, .knb param2) {
      // $FF: Couldn't be decompiled
   }

   private void setZoomLockViewEnabled(boolean var1) {
      this.isZoomLockEnabled = var1;
      this.invalidate();
   }

   private boolean shouldDrawVideoDotOrSquare(.klw var1) {
      return var1 == .klw.f || var1 == .klw.g || var1 == .klw.M || var1 == .klw.k || var1 == .klw.j || var1 == .klw.l || var1 == .klw.E || var1 == .klw.G || var1 == .klw.F || var1 == .klw.n || var1 == .klw.y || var1 == .klw.O;
   }

   private void startAccessibleLongShot() {
      .kmt var1 = this.listener;
      if (var1 != null) {
         this.isAccessibleShot.set(true);
         var1.onShutterButtonPressedStateChanged(true);
         var1.onShutterButtonLongPressed();
      }

   }

   private void updateAnimationProgressIndex(.klz var1) {
      boolean var3;
      if (this.circleAnimationIndex >= 30) {
         this.circleAnimationIndex = 0;
         var3 = this.isCircleProgressVisible;
         this.isCircleWaitingVisible = var3;
         this.isCircleProgressVisible = var3 ^ true;
      }

      int var2;
      boolean[] var4;
      if (var1 == .klz.d) {
         var3 = this.isCircleWaitingVisible ^ true;
         this.isCircleWaitingVisible = var3;
         var4 = this.tickMarkCircleState;
         var2 = this.circleAnimationIndex;
         if (var2 == 0) {
            var2 = var4.length - 1;
         } else {
            --var2;
         }

         var4[var2] = var3;
         this.invalidate();
      } else if (var1 == .klz.c) {
         var4 = this.tickMarkCircleState;
         var2 = this.circleAnimationIndex;
         if (var2 == 0) {
            var2 = var4.length - 1;
         } else {
            --var2;
         }

         var4[var2] = this.isCircleProgressVisible;
         this.invalidate();
      } else {
         if (var1 == .klz.e) {
            var4 = this.tickMarkCircleState;
            var2 = this.circleAnimationIndex;
            var4[var2] = this.isCircleProgressVisible;
            this.circleAnimationIndex = var2 + 1;
            this.invalidate();
         }

      }
   }

   private void updateButtonRect() {
      float var1 = (float)this.getCurrentSpec().t;
      float var2 = this.currentScaleFactor;
      int var3 = this.buttonCenterX;
      int var4 = (int)(var1 * var2);
      int var5 = var3 - var4;
      var3 = this.buttonCenterY - var4;
      var4 += var4;
      this.buttonRect.set((float)var5, (float)var3, (float)(var4 + var5), (float)(var3 + var4));
   }

   private void updateContentDescription(.klw var1) {
      super.setContentDescription(this.getResources().getString(this.getContentDescriptionIdForMode(var1)));
   }

   private void updateHapticsForMode(.klw var1) {
      .flx var4 = this.gcaConfig;
      boolean var3 = true;
      if (var4 != null && var4.m(.fmd.cb)) {
         this.setHapticsEnabled(true);
      } else {
         boolean var2 = var3;
         if (var1 != .klw.f) {
            var2 = var3;
            if (var1 != .klw.m) {
               if (var1 == .klw.n) {
                  var2 = var3;
               } else {
                  var2 = false;
               }
            }
         }

         this.setHapticsEnabled(var2);
      }
   }

   private void updateTickMarkBlinkingState() {
      Message var1 = msgHandler.obtainMessage(1001);
      msgHandler.sendMessageDelayed(var1, 1000L);
   }

   public void animateToScale(float var1) {
      ValueAnimator var2 = ValueAnimator.ofFloat(new float[]{this.currentScaleFactor, var1 * this.getDefaultScale()});
      var2.addUpdateListener(new .kiu(this, 5));
      var2.setDuration(250L);
      var2.setInterpolator(new .clf());
      var2.start();
   }

   public void blockClickForAnimation(boolean var1) {
      this.isEnabled();
      this.blockClickForAnimation = var1;
   }

   public void buildDrawingCache(boolean var1) {
      this.invalidate();
      super.buildDrawingCache(var1);
   }

   public void cancelModeTransitionAnimations(boolean var1) {
      AnimatorSet var2 = this.modeTransitionAnimatorSet;
      if (var2 != null) {
         if (var1) {
            var2.end();
         }

         this.modeTransitionAnimatorSet.cancel();
      }

   }

   public boolean dispatchTouchEvent(MotionEvent var1) {
      boolean var2;
      if (!(var1.getX() < 0.0F) && !(var1.getY() < 0.0F) && !(var1.getX() >= (float)this.getWidth())) {
         if (var1.getY() >= (float)this.getHeight()) {
            var2 = true;
         } else {
            var2 = false;
         }
      } else {
         var2 = true;
      }

      boolean var3;
      label109: {
         if (var2) {
            if (!this.enableLongPressMotion.get()) {
               var3 = true;
               break label109;
            }

            if (!this.isLongPressInProgress.get()) {
               var3 = true;
               break label109;
            }
         }

         var3 = false;
      }

      boolean var4;
      if (var1.getPointerCount() > 1) {
         var4 = true;
      } else {
         var4 = false;
      }

      boolean var5;
      if (var1.getAction() == 0 && var1.getDownTime() != var1.getEventTime()) {
         var5 = true;
      } else {
         var5 = false;
      }

      boolean var6;
      if (var1.getActionMasked() != 1) {
         var6 = true;
      } else {
         var6 = false;
      }

      boolean var7;
      if (var1.getActionMasked() != 6) {
         var7 = true;
      } else {
         var7 = false;
      }

      int[] var9 = new int[2];
      this.getLocationOnScreen(var9);
      int var8 = var9[0];
      Rect var11 = new Rect(var8, var9[1], this.getWidth() + var8, var9[1] + this.getHeight());
      if (this.longPressStartMotionEvent == null) {
         this.longPressStartMotionEvent = MotionEvent.obtain(var1);
      }

      .klu var12 = this.longPressMotionListener;
      MotionEvent var10 = this.longPressStartMotionEvent;
      if (var12 != null && var10 != null && this.enableLongPressMotion.get() && this.getMode() == .klw.J) {
         var12.a(var1, var10, var11, var2 ^ true);
      }

      var2 = (var3 | var4 | var5) & var6 & var7;
      if (!var2) {
         this.gestureDetector.onTouchEvent(var1);
      }

      if ((var1.getActionMasked() != 5 && var1.getActionMasked() != 6 && var1.getActionMasked() != 2 || var2) && this.isLongPressInProgress.compareAndSet(true, false)) {
         .kmt var13 = this.listener;
         if (var13 != null) {
            var13.onShutterButtonLongPressRelease();
         }
      }

      if (var1.getActionMasked() == 1) {
         this.touchCoordinate = new .ksz(var1.getX(), var1.getY(), (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight());
         if ((this.isClickEnabledAndNotBlocked() || this.getMode() == .klw.g || this.getMode() == .klw.F || this.getMode() == .klw.a) && this.getVisibility() == 0) {
            this.performHapticIfEnabled(4);
         }
      } else if (var1.getActionMasked() == 0) {
         if (this.isClickEnabledAndNotBlocked() && this.getVisibility() == 0) {
            this.performHapticIfEnabled(6);
         }

         this.performShutterTouchStart();
         this.performShutterButtonDown();
      }

      return super.dispatchTouchEvent(var1);
   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      boolean var1 = this.isPressed();
      .kmt var2;
      if (!var1 && this.isLongPressInProgress.compareAndSet(true, false)) {
         var2 = this.listener;
         if (var2 != null) {
            var2.onShutterButtonLongPressRelease();
         }
      }

      if (var1 != this.oldPressed) {
         var2 = this.listener;
         if (var2 != null) {
            var2.onShutterButtonPressedStateChanged(var1);
         }

         this.oldPressed = var1;
      }

   }

   public .mdh getClickEnabledObservable() {
      return this.filteredClickEnabledObservable;
   }

   String getContentDescriptionString() {
      return super.getContentDescription().toString();
   }

   public .knb getCurrentSpec() {
      // $FF: Couldn't be decompiled
   }

   protected float getDefaultScale() {
      return 1.0F;
   }

   public Drawable getDrawable() {
      return this.getBackground();
   }

   boolean getHapticsEnabled() {
      return this.hasPressAndReleaseHaptic;
   }

   public .klw getMode() {
      return this.getCurrentSpec().v;
   }

   AnimatorSet getModeTransitionAnimatorSet() {
      return this.modeTransitionAnimatorSet;
   }

   protected float getOuterCircleStrokeWidth() {
      return (float).ktc.b(3.0F);
   }

   public int getTimelapseTickMarkVisibleCount() {
      boolean[] var5 = this.tickMarkCircleState;
      int var4 = var5.length;
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var1 < var4; var2 = var3) {
         var3 = var2;
         if (var5[var1]) {
            var3 = var2 + 1;
         }

         ++var1;
      }

      return var2;
   }

   public boolean isClickEnabled() {
      return this.clickEnabled;
   }

   public boolean isClickEnabledAndNotBlocked() {
      return !this.blockClickForAnimation && this.clickEnabled;
   }

   // $FF: synthetic method
   public void lambda$animateMainButton$1$com_google_android_apps_camera_ui_shutterbutton_ShutterButton/* $FF was: lambda$animateMainButton$1$com-google-android-apps-camera-ui-shutterbutton-ShutterButton*/(.knb var1, Animator var2) {
      this.inFlightSpecBuilder = var1.h();
      this.invalidate();
   }

   // $FF: synthetic method
   public void lambda$animateToScale$3$com_google_android_apps_camera_ui_shutterbutton_ShutterButton/* $FF was: lambda$animateToScale$3$com-google-android-apps-camera-ui-shutterbutton-ShutterButton*/(ValueAnimator var1) {
      this.currentScaleFactor = (Float)var1.getAnimatedValue();
      this.updateButtonRect();
      this.invalidateOutline();
      this.invalidate();
   }

   // $FF: synthetic method
   public Boolean lambda$new$0$com_google_android_apps_camera_ui_shutterbutton_ShutterButton/* $FF was: lambda$new$0$com-google-android-apps-camera-ui-shutterbutton-ShutterButton*/() {
      return this.clickEnabled;
   }

   // $FF: synthetic method
   public void lambda$runEnableChangeAnimation$2$com_google_android_apps_camera_ui_shutterbutton_ShutterButton/* $FF was: lambda$runEnableChangeAnimation$2$com-google-android-apps-camera-ui-shutterbutton-ShutterButton*/(ValueAnimator var1) {
      this.disabledFilterGreyValue = (Integer)var1.getAnimatedValue();
      this.invalidate();
   }

   public void onDraw(Canvas var1) {
      .knb var8 = this.inFlightSpecBuilder.a();
      this.currentPhotoCirclePaint.setColor(var8.f);
      this.currentPhotoCirclePaint.setAlpha(var8.e);
      this.currentInnerPortraitRingPaint.setColor(this.getResources().getColor(2131101651, (Theme)null));
      this.currentOuterPortraitRingPaint.setColor(this.getResources().getColor(2131101652, (Theme)null));
      Paint var9;
      if (this.mainInnerCircleButtonPaint == null) {
         var9 = new Paint();
         this.mainInnerCircleButtonPaint = var9;
         var9.setAntiAlias(true);
         var9 = new Paint();
         this.mainOuterCircleButtonPaint = var9;
         var9.setAntiAlias(true);
         this.mainOuterCircleButtonPaint.setStrokeWidth((float).ktc.b(3.0F));
         this.mainOuterCircleButtonPaint.setStyle(Style.STROKE);
         this.mainOuterCircleButtonPaint.setColor(-1);
      }

      this.currentInnerPortraitRingPaint.setColor(this.getResources().getColor(2131099736, (Theme)null));
      this.currentOuterPortraitRingPaint.setColor(this.getResources().getColor(2131099736, (Theme)null));
      this.currentOuterPortraitRingPaint.setAlpha(127);
      this.mainInnerCircleButtonPaint.setColor(var8.s);
      var9 = this.mainInnerCircleButtonPaint;
      float var2;
      if (var8.i > 0) {
         var2 = 0.86F;
      } else {
         var2 = 0.32F;
      }

      var9.setAlpha((int)(var2 * 255.0F));
      this.currentRipplePaint.setAlpha(var8.q);
      this.currentVideoCirclePaint.setColor(var8.h);
      this.currentMainButtonPaint.setColor(var8.s);
      ColorFilter var12 = this.getColorFilterToApply(this.isEnabled(), var8.v);
      if (var12 == null) {
         this.isEnabled();
      }

      this.mainOuterCircleButtonPaint.setColorFilter(var12);
      this.mainInnerCircleButtonPaint.setColorFilter(var12);
      this.currentInnerPortraitRingPaint.setColorFilter(var12);
      this.currentOuterPortraitRingPaint.setColorFilter(var12);
      this.currentPhotoCirclePaint.setColorFilter(var12);
      this.currentVideoCirclePaint.setColorFilter(var12);
      this.currentMainButtonPaint.setColorFilter(var12);
      this.innerDotsCirclePaint.setColorFilter(var12);
      .klv var10 = this.onDrawListener;
      if (var10 != null) {
         var10.a();
         if (this.isClickEnabledAndNotBlocked()) {
            this.onDrawListener.b();
         }
      }

      this.mainOuterCircleButtonPaint.setAlpha(var8.B);
      if (!this.forRemoteShutter) {
         this.currentRipplePaint.setColor(.jbc.Z(this));
      }

      this.currentPhotoCirclePaint.setColor(var8.f);
      this.currentPhotoCirclePaint.setAlpha(var8.e);
      this.innerDotsCirclePaint.setColor(var8.C);
      var1.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, (float)var8.u * this.currentScaleFactor, this.mainOuterCircleButtonPaint);
      var1.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, (float)var8.t * this.currentScaleFactor, this.mainInnerCircleButtonPaint);
      int var6 = var8.k;
      int var5 = var8.d;
      float var3;
      float var4;
      if (var6 <= var5 || var8.j <= var5) {
         var4 = (float)this.buttonCenterX;
         var2 = (float)this.buttonCenterY;
         var3 = this.currentScaleFactor;
         var1.drawCircle(var4, var2, (float)var6 * var3, this.currentOuterPortraitRingPaint);
      }

      var5 = var8.j;
      if (var5 < var8.d) {
         var4 = (float)this.buttonCenterX;
         var3 = (float)this.buttonCenterY;
         var2 = this.currentScaleFactor;
         var1.drawCircle(var4, var3, (float)var5 * var2, this.currentInnerPortraitRingPaint);
      }

      if (var8.e > 0) {
         var1.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, (float)var8.d * this.currentScaleFactor, this.currentPhotoCirclePaint);
      }

      if (var8.p) {
         if (var8.r >= this.getResources().getDimensionPixelSize(2131165867)) {
            if (!this.isLasagnaShutter(var8.v)) {
               Paint var11 = this.currentRipplePaint;
               Resources var13 = this.getResources();
               if (var8.v == .klw.J) {
                  var5 = 2131102118;
               } else {
                  var5 = 2131100971;
               }

               var11.setColor(var13.getColor(var5, (Theme)null));
            }
         } else if (var8.v == .klw.J && var8.r == this.getResources().getDimensionPixelSize(2131166681)) {
            this.currentRipplePaint.setColor(this.getResources().getColor(2131099736, (Theme)null));
         }

         var1.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, (float)var8.r * this.currentScaleFactor, this.currentRipplePaint);
      }

      if (this.shouldDrawVideoDotOrSquare(var8.v) || this.isVideoButtonAnimating) {
         var5 = var8.g;
         if (var5 > 0) {
            var3 = (float)this.buttonCenterX;
            var2 = (float)this.buttonCenterY;
            var4 = this.currentScaleFactor;
            var1.drawCircle(var3, var2, (float)var5 * var4, this.currentVideoCirclePaint);
         }

         if (var8.i > 0 && var8.A > 0) {
            this.drawTickMarkForCircleEdge(var1);
         }
      }

      ConstantState var14 = (ConstantState)var8.l.f();
      if (var14 != null) {
         Drawable var15 = var14.newDrawable().mutate();
         var15.setColorFilter(var12);
         var5 = var8.o;
         var6 = this.buttonCenterX;
         int var7 = this.buttonCenterY;
         var15.setBounds(var6 - var5, var7 - var5, var6 + var5, var7 + var5);
         var15.getBounds();
         var15.draw(var1);
      }

   }

   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      super.onInitializeAccessibilityNodeInfo(var1);
      .klw var2 = this.getCurrentSpec().v;
      if (var2 != .klw.a && var2 != .klw.o) {
         if (var2 != .klw.J && var2 != .klw.K) {
            var1.removeAction(this.longShotStartAccessibilityAction);
            var1.removeAction(this.longShotEndAccessibilityAction);
         } else {
            if (this.isAccessibleShot.get()) {
               this.setEnabled(true);
            }

            var1.removeAction(this.longShotStartAccessibilityAction);
            var1.addAction(this.longShotEndAccessibilityAction);
         }
      } else {
         var1.removeAction(this.longShotEndAccessibilityAction);
         var1.addAction(this.longShotStartAccessibilityAction);
      }
   }

   protected void onMeasure(int var1, int var2) {
      this.updateButtonRect();
      super.onMeasure(var1, var2);
   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      this.buttonCenterX = var1 / 2;
      this.buttonCenterY = var2 / 2;
      this.updateButtonRect();
   }

   public boolean onTouchEvent(MotionEvent var1) {
      super.onTouchEvent(var1);
      return true;
   }

   public void pauseTimelapseAnimationState() {
      if (progressState != .klz.d && progressState != .klz.a) {
         this.updateTickMarkBlinkingState();
      }
   }

   public boolean performAccessibilityAction(int var1, Bundle var2) {
      if (var1 == 2131427397) {
         this.startAccessibleLongShot();
         return true;
      } else if (var1 == 2131427396) {
         this.endAccessibleLongShot();
         return true;
      } else {
         return super.performAccessibilityAction(var1, var2);
      }
   }

   public boolean performClick() {
      if (!this.isClickEnabledAndNotBlocked()) {
         this.isEnabled();
         return false;
      } else {
         boolean var1 = super.performClick();
         if (this.getVisibility() == 0) {
            .kmt var3 = this.listener;
            if (var3 != null) {
               .ksz var2 = this.touchCoordinate;
               if (var2 != null) {
                  var3.onShutterTouch(var2);
               }

               this.touchCoordinate = null;
               this.listener.onShutterButtonClick();
            }
         }

         return var1;
      }
   }

   public void performHapticIfEnabled(int var1) {
      if (this.hasPressAndReleaseHaptic) {
         this.performHapticFeedback(var1);
      }

   }

   public void performShutterButtonDown() {
      if (this.isClickEnabledAndNotBlocked() && this.getVisibility() == 0) {
         .kmt var1 = this.listener;
         if (var1 != null) {
            var1.onShutterButtonDown();
         }

      } else {
         this.isEnabled();
         this.getVisibility();
      }
   }

   public void performShutterTouchStart() {
      .kmt var1 = this.listener;
      if (var1 != null) {
         var1.onShutterTouchStart();
      }

   }

   public void resetTo(.klw var1) {
      this.resetTo(var1, this.getCurrentSpec().w);
   }

   public void resetTo(.klw var1, .jgq var2) {
      this.setCurrentSpec(.knb.c(var1, var2, this, this.isZoomLockEnabled, this.forRemoteShutter));
      this.resetShutterButton();
   }

   public void resumeTimelapseAnimationState() {
      if (progressState != .klz.c && progressState != .klz.a) {
         progressState = .klz.c;
         msgHandler.removeMessages(1001);
         Message var1 = msgHandler.obtainMessage(1000);
         msgHandler.sendMessage(var1);
      }
   }

   public void runPressedStateAnimation(boolean var1, .kmn var2) {
      .klw var3 = this.getMode();
      if (var1) {
         if (!this.isEnabled() || !this.clickEnabled) {
            this.isEnabled();
            return;
         }

         var2.b(1.06F, 100).start();
         switch(var3.ordinal()) {
         case 0:
            this.setMode(.klw.b, var2);
            return;
         case 3:
            this.setMode(.klw.e, var2);
            return;
         case 14:
            this.setMode(.klw.p, var2);
            return;
         case 17:
            this.setMode(.klw.s, var2);
            return;
         case 20:
            this.setMode(.klw.v, var2);
            return;
         case 25:
            this.setMode(.klw.A, var2);
            return;
         case 27:
            this.setMode(.klw.C, var2);
            return;
         }
      } else {
         var2.b(1.0F, 250).start();
         switch(var3.ordinal()) {
         case 1:
            this.setMode(.klw.a, var2);
            return;
         case 4:
            this.setMode(.klw.d, var2);
            return;
         case 6:
            this.setMode(.klw.l, var2);
            return;
         case 15:
            this.setMode(.klw.o, var2);
            return;
         case 18:
            this.setMode(.klw.r, var2);
            return;
         case 21:
         case 22:
            this.setMode(.klw.u, var2);
            return;
         case 26:
            this.setMode(.klw.z, var2);
            return;
         case 28:
            this.setMode(.klw.B, var2);
            return;
         case 31:
            this.setMode(.klw.G, var2);
            return;
         }
      }

   }

   public void setApplicationMode(.ksm var1) {
      this.applicationMode = var1;
   }

   public void setClickEnabled(boolean var1) {
      this.getClass().getSimpleName();
      this.isEnabled();
      this.isClickable();
      this.clickEnabled = var1;
      this.setClickable(var1);
      this.clickEnabledObservable.a();
      this.invalidate();
   }

   public void setContentDescription(int var1) {
      super.setContentDescription(this.getResources().getString(var1));
   }

   public void setEnableLongPressMotion(boolean var1) {
      this.enableLongPressMotion.set(var1);
   }

   public void setEnabled(boolean var1) {
      this.setEnabled(var1, true);
   }

   public void setEnabled(boolean var1, boolean var2) {
      this.getClass().getSimpleName();
      this.isEnabled();
      this.isClickable();
      access$001(this, var1);
      this.setClickEnabled(var1);
      this.runEnableChangeAnimation(var1, var2);
   }

   public void setHapticsEnabled(boolean var1) {
      this.hasPressAndReleaseHaptic = var1;
   }

   public void setListener(.kmt var1) {
      this.listener = var1;
   }

   public void setLongPressMotionListener(.klu var1) {
      this.longPressMotionListener = var1;
   }

   public void setMode(.klw var1, .jgq var2, .kmn var3) {
      this.updateContentDescription(var1);
      this.updateHapticsForMode(var1);
      .flx var4 = this.gcaConfig;
      if (var4 != null) {
         this.setZoomLockViewEnabled(var4.m(.fmk.p));
      }

      .knb var5 = this.getCurrentSpec();
      if (var1 != var5.v || var2 != var5.w) {
         .jgq var6 = var5.w;
         this.animateMainButton(var1, var2, var3);
         this.setTag(var1.toString());
      }
   }

   public void setMode(.klw var1, .kmn var2) {
      this.setMode(var1, this.getCurrentSpec().w, var2);
   }

   public void setOnDrawListener(.klv var1) {
      boolean var2;
      if (this.onDrawListener == null) {
         var2 = true;
      } else {
         var2 = false;
      }

      .onk.I(var2, "Cannot set on draw listener more than once.");
      this.onDrawListener = var1;
      this.invalidate();
   }

   public void setVideoButtonAnimating(boolean var1) {
      this.isVideoButtonAnimating = var1;
   }

   public void setVisualFeedbackForEnableState(boolean var1) {
      this.visualFeedbackForEnableState = var1;
   }

   public void startTimelapseCircleAnimation() {
      if (progressState == .klz.a) {
         Arrays.fill(this.tickMarkCircleState, false);
         msgHandler = new .kly(this);
      }

      this.circleAnimationIndex = 0;
      this.isCircleProgressVisible = true;
      this.isCircleWaitingVisible = true;
      progressState = .klz.b;
      this.tickMarkPaint.setColor(-1);
      this.tickMarkPaint.setXfermode(new PorterDuffXfermode(Mode.SRC));
      this.tickMarkPaint.setStyle(Style.STROKE);
      this.tickMarkPaint.setStrokeWidth((float).ktc.b(2.3F));
   }

   public void stopTimelapseCircleAnimation() {
      if (progressState != .klz.a) {
         progressState = .klz.a;
         msgHandler.removeCallbacksAndMessages((Object)null);
         this.circleAnimationIndex = 0;
         this.isCircleProgressVisible = false;
         this.isCircleWaitingVisible = false;
         Arrays.fill(this.tickMarkCircleState, false);
         this.tickMarkPaint.reset();
         this.tickMarkPaint.setAntiAlias(true);
         this.tickMarkPaint.setColor(0);
         this.tickMarkPaint.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
      }
   }

   public void updateTimelapseProgressState() {
      if (progressState != .klz.d && progressState != .klz.a) {
         Message var1 = msgHandler.obtainMessage(1002);
         msgHandler.sendMessage(var1);
      }
   }
}
