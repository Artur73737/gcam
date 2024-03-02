package com.google.android.apps.camera.cameravisionkit;

import android.animation.PointFEvaluator;
import android.animation.RectEvaluator;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

public class QrGleamingView extends View {
   public QrGleamingView(Context var1) {
      super(var1);
      new Rect();
      new Rect();
      new Rect();
      new Rect();
      new RectEvaluator(new Rect());
      new Rect();
   }

   public QrGleamingView(Context var1, AttributeSet var2) {
      super(var1, var2);
      new Rect();
      new Rect();
      new Rect();
      new Rect();
      new RectEvaluator(new Rect());
      new Rect();
   }

   protected final void onDraw(Canvas var1) {
   }

   public final void onFinishInflate() {
      super.onFinishInflate();
      TypedValue.applyDimension(1, 48.0F, this.getContext().getResources().getDisplayMetrics());
      TypedValue.applyDimension(1, 48.0F, this.getContext().getResources().getDisplayMetrics());
      TypedValue.applyDimension(1, 16.0F, this.getContext().getResources().getDisplayMetrics());
      TypedValue.applyDimension(1, 16.0F, this.getContext().getResources().getDisplayMetrics());
      this.getResources().getDrawable(2131231547, (Theme)null);
      this.getResources().getDrawable(2131231548, (Theme)null);
      this.getResources().getDrawable(2131231549, (Theme)null);
      this.getResources().getDrawable(2131231550, (Theme)null);
      new PointFEvaluator();
      new RectEvaluator();
   }
}
