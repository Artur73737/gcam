package com.google.android.apps.camera.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

class RoundedThumbnailView$3 extends AnimatorListenerAdapter {
   final RoundedThumbnailView this$0;

   public RoundedThumbnailView$3(RoundedThumbnailView var1) {
      this.this$0 = var1;
   }

   public void onAnimationEnd(Animator var1) {
      if (RoundedThumbnailView.-$$Nest$fgetforegroundRequest(this.this$0) != null) {
         RoundedThumbnailView.-$$Nest$fgetforegroundRequest(this.this$0).finishRippleAnimation();
         RoundedThumbnailView.-$$Nest$mprocessRevealRequests(this.this$0);
      }

      RoundedThumbnailView.-$$Nest$fputrippleAnimator(this.this$0, (ValueAnimator)null);
   }
}
