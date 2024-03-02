package com.google.android.clockwork.common.wearable.wearmaterial.progressindicator;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import org.xmlpull.v1.XmlPullParser;

public final class ProgressSpinnerDrawable extends Drawable {
   private static final int DEFAULT_PROGRESS_COLOR = -1;
   private static final int DEFAULT_TRACK_COLOR = 452984831;
   private static final float DEFAULT_TRACK_WIDTH_DP = 3.0F;
   private static final float DEGREES_PER_RADIAN = 57.295776F;
   private static final int LEVEL_RANGE = 10000;
   private static final float MAX_DEGREES = 360.0F;
   private static final float START_OFFSET = 270.0F;
   private static final float TINY_SWEEP_ANGLE_SIZE = 0.01F;
   private static final int TRACK_ALPHA = 26;
   private float capRadiusInDegrees;
   private final Rect destSquare;
   private .lfy direction;
   private int gravity = 17;
   private final Paint paintProgress;
   private final Paint paintTrack;
   private ColorStateList progressColor = ColorStateList.valueOf(-1);
   private float rotation;
   private boolean showEmptySweepAngle;
   private float startAngle;
   private float sweepAngle;
   private final .lfz themeState = new .lfz(this);
   private ColorStateList trackColor;
   private float trackEndAngle;
   private float trackStartAngle;
   private float trackWidth;
   private final .lgc typedArrayHelper;

   public ProgressSpinnerDrawable() {
      this.direction = .lfy.a;
      this.trackEndAngle = 360.0F;
      this.destSquare = new Rect();
      Paint var1 = new Paint();
      this.paintProgress = var1;
      Paint var2 = new Paint();
      this.paintTrack = var2;
      this.typedArrayHelper = new .lgc(.lgb.a);
      this.trackWidth = Resources.getSystem().getDisplayMetrics().density * 3.0F;
      var1.setAntiAlias(true);
      var1.setStyle(Style.STROKE);
      var1.setStrokeCap(Cap.ROUND);
      var1.setStrokeWidth(this.trackWidth);
      var1.setColor(this.progressColor.getDefaultColor());
      var2.setAntiAlias(true);
      var2.setStyle(Style.STROKE);
      var2.setStrokeWidth(this.trackWidth);
      var2.setColor(this.progressColor.getDefaultColor());
   }

   private void applyGravity(Rect var1) {
      int var2 = Math.min(var1.width(), var1.height());
      Gravity.apply(this.gravity, var2, var2, var1, this.destSquare);
   }

   private void draw(Canvas var1, float var2, float var3) {
      int var8 = var1.getSaveCount();
      var1.clipRect(this.destSquare);
      var1.translate((float)this.destSquare.left, (float)this.destSquare.top);
      float var5 = (float)this.destSquare.width();
      float var4 = this.rotation;
      var5 /= 2.0F;
      var1.rotate(var4, var5, var5);
      var4 = (float)Math.ceil((double)(this.paintTrack.getStrokeWidth() / 2.0F));
      float var7 = (float)this.destSquare.right;
      float var6 = this.trackStartAngle;
      var5 = this.getMaximumSweepAngle();
      Paint var9 = this.paintTrack;
      var7 -= var4;
      var1.drawArc(var4, var4, var7, var7, var6 + 270.0F, var5, false, var9);
      var1.drawArc(var4, var4, var7, var7, var2, var3, false, this.paintProgress);
      var1.restoreToCount(var8);
   }

   private float getArcRadius() {
      float var1 = (float)this.destSquare.width();
      float var2 = this.trackWidth;
      return Math.max(var1 - var2, var2) / 2.0F;
   }

   private void obtainAttributes(TypedArray var1) {
      this.obtainThemedAttributes(var1);
      int[] var2 = .lgb.a;
      this.setTrackWidth(var1.getDimension(11, this.paintTrack.getStrokeWidth()));
      this.setTrackStartAngle(var1.getFloat(10, this.trackStartAngle));
      this.setTrackEndAngle(var1.getFloat(9, this.trackEndAngle));
      .lfy var4 = this.direction;
      .lfy var3 = .lfy.a;
      if (var1.getInt(3, var4.c) == 1) {
         var4 = .lfy.b;
      } else {
         var4 = .lfy.a;
      }

      this.setDirection(var4);
      this.showEmptySweepAngle(var1.getBoolean(2, this.showEmptySweepAngle));
      this.setStartAngle(var1.getFloat(6, this.startAngle));
      this.setSweepAngle(var1.getFloat(7, this.sweepAngle));
      this.setLevel(var1.getInt(1, this.getLevel()));
      this.setRotation(var1.getFloat(5, this.rotation));
      this.setGravity(var1.getInt(0, this.gravity));
   }

   private void obtainThemedAttributes(TypedArray var1) {
      int[] var2 = .lgb.a;
      if (.lgc.a(var1, 4)) {
         this.themeState.a = var1.getColorStateList(4);
      }

      if (.lgc.a(var1, 8)) {
         this.themeState.b = var1.getColorStateList(8);
      }

   }

   private void updateBounds(Rect var1) {
      this.applyGravity(var1);
      this.updateCapRadius();
      this.updateProgressPaint();
   }

   private void updateCapRadius() {
      this.capRadiusInDegrees = this.trackWidth / this.getArcRadius() * 57.295776F;
   }

   private boolean updateColors(int[] var1) {
      int var3 = this.progressColor.getColorForState(var1, -1);
      boolean var2;
      if (var3 != this.paintProgress.getColor()) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var2) {
         this.paintProgress.setColor(var3);
      }

      ColorStateList var6 = this.trackColor;
      ColorStateList var5 = var6;
      if (var6 == null) {
         var5 = this.progressColor.withAlpha(26);
      }

      int var4 = var5.getColorForState(var1, 452984831);
      boolean var7;
      if (var4 != this.paintTrack.getColor()) {
         var7 = true;
      } else {
         var7 = false;
      }

      if (var7) {
         this.paintTrack.setColor(var4);
      }

      return var2 || var7;
   }

   private void updateProgressPaint() {
      boolean var2 = this.showEmptySweepAngle;
      float var1 = 1.0F;
      if (!var2) {
         var1 = Math.min(1.0F, this.sweepAngle * this.getArcRadius() / 57.295776F / this.trackWidth);
      }

      this.paintProgress.setStrokeWidth(var1 * this.trackWidth);
   }

   private void updateTrackCap() {
      Paint var2 = this.paintTrack;
      Cap var1;
      if (this.getMaximumSweepAngle() == 360.0F) {
         var1 = Cap.BUTT;
      } else {
         var1 = Cap.ROUND;
      }

      var2.setStrokeCap(var1);
   }

   public void applyTheme(Theme var1) {
      TypedArray var2 = var1.obtainStyledAttributes(this.typedArrayHelper.b);
      this.obtainThemedAttributes(var2);
      var2.recycle();
      this.themeState.a();
   }

   public boolean canApplyTheme() {
      return this.typedArrayHelper.c;
   }

   public void draw(Canvas var1) {
      if (this.isVisible() && !this.destSquare.isEmpty()) {
         float var4 = this.sweepAngle;
         float var3 = this.capRadiusInDegrees;
         float var2 = 0.01F;
         if (var4 <= var3 && this.showEmptySweepAngle) {
            var3 = this.trackStartAngle + this.startAngle - 0.005F;
         } else {
            if (var4 == 0.0F) {
               var2 = 0.0F;
            } else if (!(var4 <= var3)) {
               var2 = var4 - var3;
               var3 = Math.min(var2 / (360.0F - var3), 1.0F);
               var2 += (this.sweepAngle - var2) * var3;
            }

            if (this.direction == .lfy.a) {
               var3 = this.trackStartAngle + this.startAngle;
            } else {
               var3 = this.trackEndAngle - this.startAngle - var2;
            }
         }

         this.draw(var1, var3 + 270.0F, var2);
      }
   }

   public int getAlpha() {
      return this.paintProgress.getAlpha();
   }

   public ColorFilter getColorFilter() {
      return this.paintProgress.getColorFilter();
   }

   public float getMaximumSweepAngle() {
      return Math.abs(this.trackEndAngle - this.trackStartAngle);
   }

   public int getOpacity() {
      return -3;
   }

   public Insets getOpticalInsets() {
      Rect var1 = this.getBounds();
      return Insets.of(this.destSquare.left - var1.left, this.destSquare.top - var1.top, var1.right - this.destSquare.right, var1.bottom - this.destSquare.bottom);
   }

   public float getRotation() {
      return this.rotation;
   }

   public float getStartAngle() {
      return this.startAngle;
   }

   public float getSweepAngle() {
      return this.sweepAngle;
   }

   public void inflate(Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      super.inflate(var1, var2, var3, var4);
      .lgc var7 = this.typedArrayHelper;
      int var5 = 0;
      TypedArray var6;
      if (var4 != null) {
         var6 = var4.obtainStyledAttributes(var3, var7.a, 0, 0);
      } else {
         var6 = var1.obtainAttributes(var3, var7.a);
      }

      for(TypedValue var8 = new TypedValue(); var5 < 12; ++var5) {
         if (var6.hasValue(var5)) {
            var6.getValue(var5, var8);
            if (var8.type == 2) {
               var7.b[var5] = var8.data;
               var7.c = true;
            }
         }
      }

      this.obtainAttributes(var6);
      var6.recycle();
      if (!this.typedArrayHelper.c) {
         this.themeState.a();
      }

   }

   public boolean isStateful() {
      boolean var3 = this.progressColor.isStateful();
      boolean var2 = true;
      boolean var1 = var2;
      if (!var3) {
         ColorStateList var4 = this.trackColor;
         if (var4 != null) {
            if (!var4.isStateful()) {
               return false;
            }

            var1 = var2;
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   protected void onBoundsChange(Rect var1) {
      this.updateBounds(var1);
   }

   protected boolean onLevelChange(int var1) {
      float var4 = (float).cbu.b(Math.abs(var1), 0, 10000);
      float var3 = this.getMaximumSweepAngle();
      float var2 = this.sweepAngle;
      var3 = var4 * var3 / 10000.0F;
      if (var2 == var3) {
         return false;
      } else {
         this.sweepAngle = var3;
         if (!this.showEmptySweepAngle) {
            this.updateProgressPaint();
         }

         this.invalidateSelf();
         return true;
      }
   }

   protected boolean onStateChange(int[] var1) {
      return this.updateColors(var1);
   }

   public void setAlpha(int var1) {
      if (this.paintTrack.getAlpha() != var1) {
         this.paintProgress.setAlpha(var1);
         this.paintTrack.setAlpha(var1);
         this.invalidateSelf();
      }

   }

   public void setColorFilter(ColorFilter var1) {
      this.paintProgress.setColorFilter(var1);
      this.paintTrack.setColorFilter(var1);
      this.invalidateSelf();
   }

   public void setDirection(.lfy var1) {
      if (this.direction != var1) {
         this.direction = var1;
         this.invalidateSelf();
      }

   }

   public void setGravity(int var1) {
      if (this.gravity != var1) {
         this.gravity = var1;
         this.updateBounds(this.getBounds());
         this.invalidateSelf();
      }

   }

   public void setProgressColor(ColorStateList var1) {
      this.progressColor = var1;
      if (this.updateColors(this.getState())) {
         this.invalidateSelf();
      }

   }

   public void setRotation(float var1) {
      float var2 = this.rotation;
      var1 %= 360.0F;
      if (var2 != var1) {
         this.rotation = var1;
         this.invalidateSelf();
      }

   }

   public void setStartAngle(float var1) {
      var1 %= this.getMaximumSweepAngle();
      if (this.startAngle != var1) {
         this.startAngle = var1;
         this.invalidateSelf();
      }

   }

   public void setSweepAngle(float var1) {
      this.setLevel(Math.round(Math.min(Math.abs(var1), this.getMaximumSweepAngle()) / this.getMaximumSweepAngle() * 10000.0F));
   }

   public void setTrackColor(ColorStateList var1) {
      this.trackColor = var1;
      if (this.updateColors(this.getState())) {
         this.invalidateSelf();
      }

   }

   public void setTrackEndAngle(float var1) {
      if (this.trackEndAngle != var1) {
         this.trackEndAngle = var1;
         this.updateTrackCap();
         this.invalidateSelf();
      }

   }

   public void setTrackStartAngle(float var1) {
      if (this.trackStartAngle != var1) {
         this.trackStartAngle = var1;
         this.updateTrackCap();
         this.invalidateSelf();
      }

   }

   public void setTrackWidth(float var1) {
      var1 = Math.max(0.0F, var1);
      if (this.trackWidth != var1) {
         this.trackWidth = var1;
         this.paintTrack.setStrokeWidth(var1);
         this.updateCapRadius();
         this.updateProgressPaint();
         this.invalidateSelf();
      }
   }

   public void showEmptySweepAngle(boolean var1) {
      if (this.showEmptySweepAngle != var1) {
         this.showEmptySweepAngle = var1;
         this.updateProgressPaint();
         this.invalidateSelf();
      }

   }
}
