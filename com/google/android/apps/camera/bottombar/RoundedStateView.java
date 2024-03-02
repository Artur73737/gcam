package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.widget.ImageButton;

@Deprecated
public class RoundedStateView extends ImageButton {
   private static final float INTER_CIRCLE_RING_ALPHA = 0.32F;
   private Paint borderStrokePaint;
   private int buttonCenterX;
   private int buttonCenterY;
   private Paint mainCircleButtonPaint;
   private float rippleRingDiameterEnd;

   public RoundedStateView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.initialize();
   }

   private void initialize() {
      this.setClickable(true);
      this.rippleRingDiameterEnd = this.getResources().getDimension(R$dimen.rounded_thumbnail_ripple_ring_diameter_max);
      Paint var1 = new Paint(1);
      this.borderStrokePaint = var1;
      var1.setStyle(Style.STROKE);
      this.borderStrokePaint.setStrokeWidth((float).ktc.b(2.0F));
      this.borderStrokePaint.setColor(-1);
      var1 = new Paint();
      this.mainCircleButtonPaint = var1;
      var1.setAntiAlias(true);
      this.mainCircleButtonPaint.setColor(Color.argb(81, 0, 0, 0));
   }

   protected void onDraw(Canvas var1) {
      var1.save();
      var1.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, this.getResources().getDimension(R$dimen.bottom_border_ring_diameter), this.borderStrokePaint);
      var1.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, this.getResources().getDimension(R$dimen.bottom_inner_circle_diameter), this.mainCircleButtonPaint);
      var1.restore();
      super.onDraw(var1);
   }

   protected void onMeasure(int var1, int var2) {
      var1 = (int)this.rippleRingDiameterEnd;
      this.setMeasuredDimension(var1, var1);
   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      this.buttonCenterX = var1 / 2;
      this.buttonCenterY = var2 / 2;
      super.onSizeChanged(var1, var2, var3, var4);
   }
}
