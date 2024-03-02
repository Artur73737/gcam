package com.google.android.apps.camera.zoomui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.text.TextPaint;
import android.util.AttributeSet;

public class OutlineTextView extends .jq {
   private final TextPaint a = new TextPaint();
   private float b;
   private int c;

   public OutlineTextView(Context var1) {
      super(var1);
      this.a();
   }

   public OutlineTextView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public OutlineTextView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   private final void a() {
      Resources var1 = this.getResources();
      this.b = var1.getDimension(2131167577);
      this.c = var1.getColor(2131102426, (Theme)null);
   }

   protected final void onDraw(Canvas var1) {
      TextPaint var3 = this.getPaint();
      this.a.set(var3);
      int var2 = this.getCurrentTextColor();
      var3.setStyle(Style.STROKE);
      var3.setStrokeWidth(this.b);
      var3.setStrokeJoin(Join.ROUND);
      this.setTextColor(this.c);
      super.onDraw(var1);
      this.setTextColor(var2);
      var3.set(this.a);
      super.onDraw(var1);
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      this.a();
   }
}
