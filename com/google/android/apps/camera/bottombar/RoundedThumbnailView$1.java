package com.google.android.apps.camera.bottombar;

import android.view.View;
import android.view.View.OnClickListener;

class RoundedThumbnailView$1 implements OnClickListener {
   final RoundedThumbnailView this$0;

   public RoundedThumbnailView$1(RoundedThumbnailView var1) {
      this.this$0 = var1;
   }

   public void onClick(View var1) {
      if (var1.isClickable()) {
         if (RoundedThumbnailView.-$$Nest$fgetcallback(this.this$0).h()) {
            ((RoundedThumbnailView$Callback)RoundedThumbnailView.-$$Nest$fgetcallback(this.this$0).c()).onClickAnimationEnd();
         }

         if (RoundedThumbnailView.-$$Nest$fgetoptionalOnClickListener(this.this$0).h()) {
            ((OnClickListener)RoundedThumbnailView.-$$Nest$fgetoptionalOnClickListener(this.this$0).c()).onClick(var1);
         }

      }
   }
}
