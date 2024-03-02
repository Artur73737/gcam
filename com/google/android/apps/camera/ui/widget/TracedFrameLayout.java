package com.google.android.apps.camera.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class TracedFrameLayout extends FrameLayout {
   private final .kqt a = a(this);

   public TracedFrameLayout(Context var1) {
      super(var1);
   }

   public TracedFrameLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public TracedFrameLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public TracedFrameLayout(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   private static .kqt a(View var0) {
      Object var1 = var0.getTag();
      return (.kqt)(var1 == null ? .kqs.a : new .kqu(var1.toString()));
   }

   public final void draw(Canvas var1) {
      this.a.a("draw");
      super.draw(var1);
      this.a.b();
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      this.a.a("onLayout");
      super.onLayout(var1, var2, var3, var4, var5);
      this.a.b();
   }

   protected final void onMeasure(int var1, int var2) {
      this.a.a("onMeasure");
      super.onMeasure(var1, var2);
      this.a.b();
   }
}
