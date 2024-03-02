package com.google.android.apps.camera.bottombar;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Shader.TileMode;

class RoundedThumbnailView$RevealRequest {
   private String accessibilityString;
   private boolean animationDisabled;
   private boolean rippleAnimationFinished;
   private boolean thumbnailAnimationFinished;
   private Paint thumbnailPaint;
   private float viewSize;

   private RoundedThumbnailView$RevealRequest(float var1, String var2) {
      this.accessibilityString = var2;
      this.viewSize = var1;
   }

   static RoundedThumbnailView$RevealRequest createAnimatedRevealRequest(float var0, String var1) {
      return new RoundedThumbnailView$RevealRequest(var0, var1);
   }

   static RoundedThumbnailView$RevealRequest createNonAnimatedRevealRequest(float var0, String var1) {
      RoundedThumbnailView$RevealRequest var2 = new RoundedThumbnailView$RevealRequest(var0, var1);
      var2.animationDisabled = true;
      return var2;
   }

   private void precomputeThumbnailPaint(Bitmap var1, int var2) {
      if (this.thumbnailPaint == null) {
         if (var1 == null) {
            return;
         }

         if (var1.getWidth() != var1.getHeight()) {
            return;
         }

         BitmapShader var4 = new BitmapShader(var1, TileMode.CLAMP, TileMode.CLAMP);
         if ((float)var1.getWidth() != this.viewSize) {
            RectF var6 = new RectF(0.0F, 0.0F, (float)var1.getWidth(), (float)var1.getHeight());
            float var3 = this.viewSize;
            RectF var5 = new RectF(0.0F, 0.0F, var3, var3);
            Matrix var7 = new Matrix();
            var7.setRectToRect(var6, var5, ScaleToFit.FILL);
            var7.preRotate((float)var2, var6.width() / 2.0F, var6.height() / 2.0F);
            var4.setLocalMatrix(var7);
         }

         Paint var8 = new Paint();
         this.thumbnailPaint = var8;
         var8.setAntiAlias(true);
         this.thumbnailPaint.setShader(var4);
      }

   }

   public void finishRippleAnimation() {
      this.rippleAnimationFinished = true;
   }

   public void finishThumbnailAnimation() {
      this.thumbnailAnimationFinished = true;
   }

   public String getAccessibilityString() {
      return this.accessibilityString;
   }

   public Paint getThumbnailPaint() {
      return this.thumbnailPaint;
   }

   public boolean isAnimationDisabled() {
      return this.animationDisabled;
   }

   public boolean isFinished() {
      return this.thumbnailAnimationFinished && this.rippleAnimationFinished;
   }

   public void setThumbnailBitmap(Bitmap var1, int var2) {
      Bitmap var6 = var1;
      if (var1.getWidth() != var1.getHeight()) {
         int var4 = var1.getWidth();
         int var5 = var1.getHeight();
         int var3 = 512;
         if (var4 > 512 || var5 > 512) {
            if (var4 > var5) {
               var4 = var5 * 512 / var4;
            } else {
               var3 = var4 * 512 / var5;
               var4 = 512;
            }

            var1 = Bitmap.createScaledBitmap(var1, var3, var4, false);
         }

         var3 = var1.getWidth();
         var4 = var1.getHeight();
         if (var3 >= var4) {
            var6 = Bitmap.createBitmap(var1, var3 / 2 - var4 / 2, 0, var4, var4);
         } else {
            var6 = Bitmap.createBitmap(var1, 0, var4 / 2 - var3 / 2, var3, var3);
         }
      }

      this.precomputeThumbnailPaint(var6, var2);
   }
}
