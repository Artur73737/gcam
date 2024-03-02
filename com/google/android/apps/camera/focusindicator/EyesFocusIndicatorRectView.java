package com.google.android.apps.camera.focusindicator;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class EyesFocusIndicatorRectView extends View {
   public final RectF a = new RectF();
   public final Drawable b;
   public final Drawable c;
   public .ktb d;

   public EyesFocusIndicatorRectView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.d = .ktb.a;
      this.b = var1.getResources().getDrawable(2131231257, (Theme)null);
      this.c = var1.getResources().getDrawable(2131231256, (Theme)null);
   }

   protected final void onDraw(Canvas var1) {
      super.onDraw(var1);
      this.b.draw(var1);
      this.c.draw(var1);
   }
}
