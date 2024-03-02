package com.google.android.apps.camera.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

class RoundedThumbnailView$4 extends AnimatorListenerAdapter {
   final RoundedThumbnailView this$0;

   public RoundedThumbnailView$4(RoundedThumbnailView var1) {
      this.this$0 = var1;
   }

   public void onAnimationEnd(Animator var1) {
      RoundedThumbnailView.-$$Nest$fputburstFlashAnimator(this.this$0, (ValueAnimator)null);
   }
}
