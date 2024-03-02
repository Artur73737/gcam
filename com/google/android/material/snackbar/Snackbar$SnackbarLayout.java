package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public final class Snackbar$SnackbarLayout extends .ood {
   public Snackbar$SnackbarLayout(Context var1) {
      super(var1);
   }

   public Snackbar$SnackbarLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   protected final void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      var2 = this.getChildCount();
      int var5 = this.getMeasuredWidth();
      int var3 = this.getPaddingLeft();
      int var4 = this.getPaddingRight();

      for(var1 = 0; var1 < var2; ++var1) {
         View var6 = this.getChildAt(var1);
         if (var6.getLayoutParams().width == -1) {
            var6.measure(MeasureSpec.makeMeasureSpec(var5 - var3 - var4, 1073741824), MeasureSpec.makeMeasureSpec(var6.getMeasuredHeight(), 1073741824));
         }
      }

   }
}
