package com.google.android.apps.camera.optionsbar.view;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class OptionsMenuViewContainer extends LinearLayoutCompat {
   public .kge a;
   public .ktb b;

   public OptionsMenuViewContainer(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a = .kge.b;
      this.b = .ktb.a;
   }

   protected final void onMeasure(int var1, int var2) {
      if (((Activity)this.getContext()).isInMultiWindowMode() && this.a.equals(.kge.b) && !.ktb.d(this.b)) {
         View var3 = (View)this.getParent();
         super.onMeasure(MeasureSpec.makeMeasureSpec(var3.getHeight(), 1073741824), MeasureSpec.makeMeasureSpec(var3.getWidth(), Integer.MIN_VALUE));
      } else {
         super.onMeasure(var1, var2);
      }
   }
}
