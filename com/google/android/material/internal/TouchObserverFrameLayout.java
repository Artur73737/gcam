package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;

public class TouchObserverFrameLayout extends FrameLayout {
   private OnTouchListener a;

   public TouchObserverFrameLayout(Context var1) {
      super(var1);
   }

   public TouchObserverFrameLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public TouchObserverFrameLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      OnTouchListener var2 = this.a;
      if (var2 != null) {
         var2.onTouch(this, var1);
      }

      return super.onInterceptTouchEvent(var1);
   }

   public final void setOnTouchListener(OnTouchListener var1) {
      this.a = var1;
   }
}
