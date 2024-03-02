package com.google.android.apps.camera.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

class RoundedThumbnailView$2 extends AnimatorListenerAdapter {
   final RoundedThumbnailView this$0;

   public RoundedThumbnailView$2(RoundedThumbnailView var1) {
      this.this$0 = var1;
   }

   public void onAnimationEnd(Animator var1) {
      if (RoundedThumbnailView.-$$Nest$fgetforegroundRequest(this.this$0) != null) {
         RoundedThumbnailView.-$$Nest$fgetforegroundRequest(this.this$0).finishThumbnailAnimation();
         RoundedThumbnailView.-$$Nest$mprocessRevealRequests(this.this$0);
      }

      RoundedThumbnailView.-$$Nest$fputthumbnailAnimatorSet(this.this$0, (AnimatorSet)null);
   }
}
