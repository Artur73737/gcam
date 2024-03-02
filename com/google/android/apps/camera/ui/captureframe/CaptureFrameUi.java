package com.google.android.apps.camera.ui.captureframe;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import j$.util.Collection$_EL;
import java.util.List;

public class CaptureFrameUi extends View {
   public final RectF a = new RectF();
   public final Paint b;
   private final List c;
   private final float d;

   public CaptureFrameUi(Context var1, AttributeSet var2) {
      super(var1, var2);
      float var3 = this.getResources().getDimension(2131165562);
      this.d = this.getResources().getDimension(2131165355);
      Paint var4 = new Paint();
      this.b = var4;
      var4.setStrokeWidth((float)this.getResources().getDimensionPixelSize(2131165563));
      var4.setAntiAlias(true);
      var4.setStyle(Style.STROKE);
      var4.setBlendMode(BlendMode.DST_ATOP);
      this.c = .oyz.p(new .jzd(this, var4, 1, var3), new .jzd(this, var4, 2, var3), new .jzd(this, var4, 3, var3), new .jzd(this, var4, 4, var3));
   }

   public final void onDraw(Canvas var1) {
      Collection$_EL.stream(this.c).forEach(new .ilb(this, var1, 4));
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      RectF var8 = this.a;
      float var6 = (float)var2;
      float var7 = this.d;
      var8.set(var6 + var7, (float)var3 + var7, (float)var4 - var7, (float)var5 - var7);
   }
}
