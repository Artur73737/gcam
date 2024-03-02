package com.google.android.apps.camera.bottombar;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class BottomBarController implements .kfw {
   private static final .pds logger = .pds.h("com.google.android.apps.camera.bottombar.BottomBarController");
   private final BottomBar bottomBar;
   private final CameraSwitchButton cameraSwitchButton;
   private final .flx gcaConfig;
   private boolean isJupiterButtonShowed;
   private boolean isNeedReEnableJupiterButton;
   private boolean isSelfieFlashOn;
   private boolean isSocialShareOpened;
   private .otw jupiterButton;
   private final BottomBarListener listenerDispatcher;
   private final List listeners;
   private final Object lock;
   private .ksm mode;
   private final RoundedThumbnailView thumbnailButton;

   public BottomBarController(BottomBar var1, .flx var2) {
      this.jupiterButton = .ote.a;
      this.listenerDispatcher = new BottomBarController$1(this);
      this.bottomBar = var1;
      this.gcaConfig = var2;
      this.cameraSwitchButton = var1.getCameraSwitchButton();
      this.thumbnailButton = var1.getThumbnailButton();
      this.lock = new Object();
      this.listeners = new ArrayList();
      this.mode = .ksm.a;
   }

   private .otw getJupiterButton() {
      return (.otw)(this.jupiterButton.h() && this.isJupiterButtonShowed ? this.jupiterButton : .ote.a);
   }

   public void addListener(BottomBarListener param1) {
      // $FF: Couldn't be decompiled
   }

   public void announceAccessibilityForThumbnail(String var1) {
      RoundedThumbnailView var2 = this.thumbnailButton;
      if (var2 != null) {
         var2.announceForAccessibility(var1);
      }

   }

   public .mhq disableCameraSwitchAwhile() {
      this.setCameraSwitchEnabled(false);
      return new BottomBarController$$ExternalSyntheticLambda0(this);
   }

   public void disableJupiterButton() {
      this.isJupiterButtonShowed = false;
      this.bottomBar.replaceSideButton(BottomBar$SideButtonPosition.RIGHT, .ote.a, true);
   }

   public void enableJupiterButton() {
      if (!this.mode.equals(.ksm.h) && !this.mode.equals(.ksm.i)) {
         if (!this.isJupiterButtonShowed) {
            this.isJupiterButtonShowed = true;
            if (.kfq.y(this.mode)) {
               this.bottomBar.replaceSideButton(BottomBar$SideButtonPosition.RIGHT, this.getJupiterButton(), true);
            }

         }
      }
   }

   public void exitJupiterSession() {
      this.bottomBar.disableSideButtons(BottomBar$SideButtonPosition.CENTER_RIGHT, .ote.a);
   }

   public .ksr getBackgroundColorProperty() {
      return this.bottomBar.getBackgroundColorProperty();
   }

   public int getBottomBarAreaPixels() {
      return this.bottomBar.getHeight() * this.bottomBar.getWidth();
   }

   // $FF: synthetic method
   public void lambda$disableCameraSwitchAwhile$4$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$disableCameraSwitchAwhile$4$com-google-android-apps-camera-bottombar-BottomBarController*/() {
      this.setCameraSwitchEnabled(true);
   }

   // $FF: synthetic method
   public void lambda$lowerAccessibilityImportanceAwhile$3$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$lowerAccessibilityImportanceAwhile$3$com-google-android-apps-camera-bottombar-BottomBarController*/() {
      this.setImportantForAccessibility(1);
   }

   // $FF: synthetic method
   public void lambda$makeClickableAwhile$1$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$makeClickableAwhile$1$com-google-android-apps-camera-bottombar-BottomBarController*/() {
      this.setClickable(false);
   }

   // $FF: synthetic method
   public void lambda$onLayoutUpdated$13$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$onLayoutUpdated$13$com-google-android-apps-camera-bottombar-BottomBarController*/() {
      if (.ktc.f(this.bottomBar.getContext())) {
         if (this.isJupiterButtonShowed) {
            this.disableJupiterButton();
            this.isNeedReEnableJupiterButton = true;
            return;
         }
      } else if (this.isNeedReEnableJupiterButton) {
         this.enableJupiterButton();
         this.isNeedReEnableJupiterButton = false;
         return;
      }

   }

   // $FF: synthetic method
   public void lambda$setJupiterButton$0$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$setJupiterButton$0$com-google-android-apps-camera-bottombar-BottomBarController*/(View var1) {
      this.listenerDispatcher.onJupiterButtonClicked();
   }

   // $FF: synthetic method
   public void lambda$setSideButtonsClickable$2$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$setSideButtonsClickable$2$com-google-android-apps-camera-bottombar-BottomBarController*/(boolean var1) {
      this.bottomBar.setSideButtonsClickable(var1);
   }

   // $FF: synthetic method
   public void lambda$wireListeners$10$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$wireListeners$10$com-google-android-apps-camera-bottombar-BottomBarController*/(View var1) {
      this.listenerDispatcher.onCancelButtonPressed();
   }

   // $FF: synthetic method
   public void lambda$wireListeners$11$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$wireListeners$11$com-google-android-apps-camera-bottombar-BottomBarController*/(View var1) {
      this.listenerDispatcher.onCancelButtonPressed();
   }

   // $FF: synthetic method
   public void lambda$wireListeners$12$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$wireListeners$12$com-google-android-apps-camera-bottombar-BottomBarController*/(View var1) {
      this.listenerDispatcher.onReviewPlayButtonPressed();
   }

   // $FF: synthetic method
   public void lambda$wireListeners$5$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$wireListeners$5$com-google-android-apps-camera-bottombar-BottomBarController*/(View var1) {
      this.listenerDispatcher.onCameraSwitchButtonClicked();
   }

   // $FF: synthetic method
   public void lambda$wireListeners$6$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$wireListeners$6$com-google-android-apps-camera-bottombar-BottomBarController*/(View var1) {
      this.listenerDispatcher.onThumbnailButtonClicked();
   }

   // $FF: synthetic method
   public void lambda$wireListeners$7$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$wireListeners$7$com-google-android-apps-camera-bottombar-BottomBarController*/(View var1) {
      this.listenerDispatcher.onShutterButtonClicked();
   }

   // $FF: synthetic method
   public void lambda$wireListeners$8$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$wireListeners$8$com-google-android-apps-camera-bottombar-BottomBarController*/(View var1) {
      this.listenerDispatcher.onSnapshotButtonClicked();
   }

   // $FF: synthetic method
   public void lambda$wireListeners$9$com_google_android_apps_camera_bottombar_BottomBarController/* $FF was: lambda$wireListeners$9$com-google-android-apps-camera-bottombar-BottomBarController*/(View var1) {
      this.listenerDispatcher.onRetakeButtonPressed();
   }

   public .mhq lowerAccessibilityImportanceAwhile() {
      this.setImportantForAccessibility(4);
      return new BottomBarController$$ExternalSyntheticLambda13(this);
   }

   public .mhq makeClickableAwhile() {
      this.setClickable(true);
      return new BottomBarController$$ExternalSyntheticLambda1(this);
   }

   public void onLayoutUpdated(.kge var1, .ktb var2) {
      if (var1 != .kge.d && var1 != .kge.c) {
         if (var1 == .kge.b && ((Activity)this.bottomBar.getContext()).isInMultiWindowMode()) {
            this.bottomBar.post(new BottomBarController$$ExternalSyntheticLambda11(this));
            return;
         }

         if (this.isNeedReEnableJupiterButton) {
            this.enableJupiterButton();
            this.isNeedReEnableJupiterButton = false;
            return;
         }
      } else if (this.isJupiterButtonShowed) {
         this.disableJupiterButton();
         this.isNeedReEnableJupiterButton = true;
      }

   }

   // $FF: synthetic method
   public void onLayoutUpdated(.ktb var1) {
   }

   public void pauseRecording() {
      this.bottomBar.getPauseResumeButton().transitionToResumeState();
   }

   public void removeListener(BottomBarListener param1) {
      // $FF: Couldn't be decompiled
   }

   public void resetCameraSwitch(boolean var1) {
      this.bottomBar.getCameraSwitchButton().setFrontFacing(var1);
   }

   public void resumeRecording() {
      this.bottomBar.getPauseResumeButton().transitionToPauseState();
   }

   public void returnToPhotoIntent() {
      this.bottomBar.changeMultipleSideButtons(.oze.n(BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.cameraSwitchButton)), true);
   }

   public void returnToVideoIntent() {
      this.bottomBar.changeMultipleSideButtons(.oze.n(BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.cameraSwitchButton)), true);
   }

   public void setCameraSwitchEnabled(boolean var1) {
      this.bottomBar.getCameraSwitchButton().setEnabled(var1);
   }

   public void setClickable(boolean var1) {
      this.bottomBar.setClickable(var1);
      this.bottomBar.setPressed(false);
   }

   public void setImportantForAccessibility(int var1) {
      this.bottomBar.setImportantForAccessibility(var1);
   }

   public void setJupiterButton(View var1) {
      if (!this.jupiterButton.h()) {
         .otw var2 = .otw.j(var1);
         this.jupiterButton = var2;
         ((View)var2.c()).setOnClickListener(new BottomBarController$$ExternalSyntheticLambda12(this));
         this.bottomBar.addView(BottomBar$SideButtonPosition.RIGHT, (View)this.jupiterButton.c());
      }

   }

   public void setLayoutListener(BottomBarLayoutListener var1) {
      this.bottomBar.setLayoutListener(var1);
   }

   public void setSelfieFlashState(boolean var1) {
      this.isSelfieFlashOn = var1;
   }

   public void setSideButtonsClickable(boolean var1) {
      this.bottomBar.post(new BottomBarController$$ExternalSyntheticLambda10(this, var1));
   }

   public void setSnapshotButtonClickEnabled(boolean var1) {
      this.bottomBar.getSnapshotButton().setClickEnabled(var1);
   }

   public void setSocialShareState(boolean var1) {
      this.isSocialShareOpened = var1;
   }

   public void startAutoTimerCapturing() {
      if (!this.isSelfieFlashOn) {
         this.bottomBar.fadeBackground(false, true);
      }

      this.bottomBar.changeMultipleSideButtons(.oze.o(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.thumbnailButton), BottomBar$SideButtonPosition.RIGHT, .ote.a), true);
   }

   public void startCountdown() {
      this.bottomBar.clearSideButtons(true);
      this.bottomBar.fadeBackground(false, true);
   }

   public void startImaxCapture(boolean var1) {
      RoundedThumbnailView var4 = this.thumbnailButton;
      boolean var2 = false;
      var4.setClickable(false);
      .ktb var5 = this.bottomBar.getUiOrientation();
      if (var5 != .ktb.c) {
         if (var5 == .ktb.b) {
            var2 = true;
         }
      } else {
         var2 = true;
      }

      boolean var3 = var2;
      if (var1) {
         var3 = var2 ^ true;
      }

      this.bottomBar.fadeBackground(var3, true);
      this.bottomBar.changeMultipleSideButtons(.oze.n(BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.bottomBar.getCancelButton())), true);
   }

   public void startJupiterSession() {
      this.enableJupiterButton();
      this.bottomBar.disableSideButtons(BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.cameraSwitchButton));
   }

   public void startLongShot() {
      this.bottomBar.clearSideButtons(true);
   }

   public void startNoPDPortraitCapture() {
      this.bottomBar.changeMultipleSideButtons(.oze.n(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.thumbnailButton)), true);
   }

   public void startPanoramaCalibration() {
      this.bottomBar.changeMultipleSideButtons(.oze.o(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.bottomBar.getRetakeButton()), BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.bottomBar.getCancelButton())), true);
   }

   public void startPhotoSphereCapture() {
      this.bottomBar.changeMultipleSideButtons(.oze.o(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.bottomBar.getRetakeButton()), BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.bottomBar.getCancelButton())), true);
   }

   public void startRecording(boolean var1, boolean var2) {
      if (!this.isSelfieFlashOn) {
         this.bottomBar.fadeBackground(false, true);
      }

      Object var5;
      if (var1) {
         PauseResumeButton var3 = this.bottomBar.getPauseResumeButton();
         var3.getClass();
         var5 = .otw.j(var3);
      } else {
         var5 = .ote.a;
      }

      Object var6;
      if (var2) {
         SnapshotButton var4 = this.bottomBar.getSnapshotButton();
         var4.getClass();
         var6 = .otw.j(var4);
      } else {
         var6 = .ote.a;
      }

      this.bottomBar.changeMultipleSideButtons(.oze.o(BottomBar$SideButtonPosition.CENTER_LEFT, var5, BottomBar$SideButtonPosition.CENTER_RIGHT, var6), true);
   }

   public void startVideoIntentRecording() {
      if (!this.isSelfieFlashOn) {
         this.bottomBar.fadeBackground(false, true);
      }

      this.bottomBar.clearSideButtons(true);
   }

   public void stopAutoTimerCapturing() {
      if (!this.isSocialShareOpened) {
         this.bottomBar.changeMultipleSideButtons(.oze.p(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.thumbnailButton), BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.cameraSwitchButton), BottomBar$SideButtonPosition.RIGHT, this.getJupiterButton()), true);
      }
   }

   public void stopCountdown() {
      this.switchToMode(this.mode);
      if (!this.gcaConfig.m(.fms.g) && this.mode == .ksm.g) {
         this.startNoPDPortraitCapture();
      }

   }

   public void stopImaxCapture() {
      this.thumbnailButton.setClickable(true);
      this.bottomBar.fadeBackground(true, true);
      this.bottomBar.changeMultipleSideButtons(.oze.n(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.thumbnailButton)), true);
   }

   public void stopLongShot() {
      this.bottomBar.changeMultipleSideButtons(.oze.p(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.thumbnailButton), BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.cameraSwitchButton), BottomBar$SideButtonPosition.RIGHT, this.getJupiterButton()), true);
   }

   public void stopNoPDPortraitCapture() {
      this.bottomBar.changeMultipleSideButtons(.oze.o(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.thumbnailButton), BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.cameraSwitchButton)), true);
   }

   public void stopPanoramaCapture() {
      this.bottomBar.changeMultipleSideButtons(.oze.n(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.thumbnailButton)), true);
   }

   public void stopPhotoSphereCapture() {
      this.bottomBar.changeMultipleSideButtons(.oze.o(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.thumbnailButton), BottomBar$SideButtonPosition.RIGHT, this.getJupiterButton()), true);
   }

   public void stopRecording(boolean var1, boolean var2) {
      if (!this.isSelfieFlashOn) {
         this.bottomBar.fadeBackground(true, true);
      }

      Object var3;
      if (var2) {
         var3 = .otw.j(this.thumbnailButton);
      } else {
         var3 = .ote.a;
      }

      Object var4;
      if (var1) {
         var4 = .otw.j(this.cameraSwitchButton);
      } else {
         var4 = .ote.a;
      }

      this.bottomBar.changeMultipleSideButtons(.oze.p(BottomBar$SideButtonPosition.CENTER_LEFT, var3, BottomBar$SideButtonPosition.CENTER_RIGHT, var4, BottomBar$SideButtonPosition.RIGHT, this.getJupiterButton()), true);
      this.bottomBar.getPauseResumeButton().resetButton();
   }

   public void switchCamera() {
      this.cameraSwitchButton.callOnClick();
   }

   public void switchToMode(.ksm var1) {
      this.mode = var1;
      this.bottomBar.fadeBackground(true, true);
      .ksm var2 = .ksm.a;
      switch(var1.ordinal()) {
      case 0:
      case 9:
      case 14:
      case 16:
      case 18:
         throw new UnsupportedOperationException("Unsupported application mode ".concat(String.valueOf(String.valueOf(var1))));
      case 1:
      case 2:
      case 6:
      case 11:
      case 12:
      case 13:
      case 21:
      case 22:
         this.bottomBar.changeMultipleSideButtons(.oze.p(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.thumbnailButton), BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.cameraSwitchButton), BottomBar$SideButtonPosition.RIGHT, this.getJupiterButton()), true);
         return;
      case 3:
      case 4:
      case 5:
      case 19:
         this.bottomBar.changeMultipleSideButtons(.oze.n(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.thumbnailButton)), true);
         return;
      case 7:
      case 8:
         this.bottomBar.changeMultipleSideButtons(.oze.n(BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.cameraSwitchButton)), true);
         return;
      case 10:
      case 15:
         this.bottomBar.clearSideButtons(true);
         return;
      case 17:
         this.bottomBar.changeMultipleSideButtons(.oze.p(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.thumbnailButton), BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.bottomBar.getLeftSideCancelButton()), BottomBar$SideButtonPosition.RIGHT, this.getJupiterButton()), true);
         return;
      case 20:
         BottomBar var7 = this.bottomBar;
         BottomBar$SideButtonPosition var6 = BottomBar$SideButtonPosition.CENTER_LEFT;
         .otw var4 = .otw.j(this.thumbnailButton);
         BottomBar$SideButtonPosition var5 = BottomBar$SideButtonPosition.CENTER_RIGHT;
         .flx var8 = this.gcaConfig;
         .flz var3 = .flj.a;
         var8.e();
         var7.changeMultipleSideButtons(.oze.p(var6, var4, var5, .ote.a, BottomBar$SideButtonPosition.RIGHT, this.getJupiterButton()), true);
         return;
      default:
      }
   }

   public void switchToPhotoIntentReview() {
      this.bottomBar.changeMultipleSideButtons(.oze.n(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.bottomBar.getRetakeButton())), true);
   }

   public void switchToVideoIntentReview() {
      this.bottomBar.fadeBackground(true, true);
      this.bottomBar.changeMultipleSideButtons(.oze.o(BottomBar$SideButtonPosition.CENTER_LEFT, .otw.j(this.bottomBar.getRetakeButton()), BottomBar$SideButtonPosition.CENTER_RIGHT, .otw.j(this.bottomBar.getReviewPlayButton())), true);
   }

   public void wireListeners() {
      .mbx.a();
      this.bottomBar.getCameraSwitchButton().setOnClickListener(new BottomBarController$$ExternalSyntheticLambda2(this));
      this.bottomBar.getThumbnailButton().setOnClickListener(new BottomBarController$$ExternalSyntheticLambda3(this));
      this.bottomBar.getPauseResumeButton().setListener(this.listenerDispatcher);
      this.bottomBar.getShutterButton().setOnClickListener(new BottomBarController$$ExternalSyntheticLambda4(this));
      this.bottomBar.getSnapshotButton().setOnClickListener(new BottomBarController$$ExternalSyntheticLambda5(this));
      this.bottomBar.getSnapshotButton().wirePressedStateAnimationListener();
      this.bottomBar.getRetakeButton().setOnClickListener(new BottomBarController$$ExternalSyntheticLambda6(this));
      this.bottomBar.getCancelButton().setOnClickListener(new BottomBarController$$ExternalSyntheticLambda7(this));
      this.bottomBar.getLeftSideCancelButton().setOnClickListener(new BottomBarController$$ExternalSyntheticLambda8(this));
      this.bottomBar.getReviewPlayButton().setOnClickListener(new BottomBarController$$ExternalSyntheticLambda9(this));
      this.setClickable(true);
   }
}
