package com.google.android.clockwork.common.wearable.wearmaterial.pageindicator;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class WearPageIndicatorDrawable extends Drawable {
   private static final float MAX_PAGE_POS_TO_CENTER_DISTANCE = 0.5F;
   private static final int MAX_VISIBLE_INDICATORS = 6;
   private static final float OVERFLOW_FADEOUT_LENGTH = 6.0F;
   private static final float OVERFLOW_FADE_DISTANCE_TO_PAGE_POS = 1.0F;
   private .lfd canvasTransformer;
   private int dotRadius;
   private final Paint indicatorPaint;
   private float selectedAlpha;
   private final .lez state;
   private float unselectedAlpha;

   public WearPageIndicatorDrawable() {
      Paint var1 = new Paint();
      this.indicatorPaint = var1;
      this.state = new .lez();
      var1.setAntiAlias(true);
   }

   private float computeIndicatorDotRadius(int var1) {
      .lez var5 = this.state;
      if (var5.a) {
         return (float)this.dotRadius;
      } else {
         float var4 = var5.e;
         float var3 = (float)var1;
         float var2 = Math.abs(var3 - var5.f);
         var3 = Math.abs(var3 - var4);
         var2 -= 3.0F;
         var3 = .mzx.dI(1.0F - (var3 - 1.0F) / 6.0F, 0.0F, 1.0F);
         var2 = .mzx.dI(1.0F - (var2 + var2), 0.0F, 1.0F);
         return (float)this.dotRadius * var2 * var3;
      }
   }

   private boolean needsMirroring() {
      return this.isAutoMirrored() && this.getLayoutDirection() == 1;
   }

   public void draw(Canvas var1) {
      if (this.canvasTransformer != null) {
         .lez var8 = this.state;
         int var5 = var8.b;
         if (var5 > 1) {
            float var4 = .mzx.dI(var8.e, 0.0F, (float)(var5 - 1));
            var8.e = var4;
            float var2;
            float var3;
            if (var8.a) {
               var2 = (float)(var8.b - 1) / 2.0F;
               var8.f = var2;
            } else {
               var2 = var8.f;
               var3 = var8.i;
               if (var4 < var2 - 0.5F) {
                  var2 = var4 + 0.5F;
                  var8.f = var2;
                  var8.l = 2;
               } else if (var4 > var2 + 0.5F) {
                  var2 = var4 - 0.5F;
                  var8.f = var2;
                  var8.l = 1;
               } else if (var2 != var3) {
                  var5 = var8.l;
                  if (var5 == 1) {
                     var2 = Math.max(var4 - 0.5F, var8.j);
                     var8.f = var2;
                  } else if (var5 == 2) {
                     var2 = Math.min(var4 + 0.5F, var8.k);
                     var8.f = var2;
                  }
               }

               var2 = .mzx.dI(var2, var8.h, var8.g);
               var8.f = var2;
            }

            var5 = (int)Math.floor((double)var2);
            var3 = var8.f;
            var2 = (float)var5;
            if (var3 - var2 > 0.5F) {
               var2 += 0.5F;
            } else {
               var2 -= 0.5F;
            }

            var8.j = var2;
            var8.k = var2 + 1.0F;
            if (Math.abs(var3 - var2) < Math.abs(var8.f - var8.k)) {
               var2 = var8.j;
            } else {
               var2 = var8.k;
            }

            var8.i = var2;
            if (var8.a) {
               var8.c = 0;
               var8.d = var8.b - 1;
            } else {
               var8.c = (int).mzx.dI((float)Math.floor((double)(var8.f - 3.0F)), 0.0F, (float)(var8.b - 1));
               var8.d = (int).mzx.dI((float)StrictMath.ceil((double)(var8.f + 3.0F)), 0.0F, (float)(var8.b - 1));
            }

            var8 = this.state;
            var5 = var8.c;
            int var6 = var8.d;
            var3 = var8.f;
            if (this.needsMirroring()) {
               var2 = (float)var6 - this.state.e;
            } else {
               var2 = this.state.e;
            }

            var1.save();
            this.canvasTransformer.a(this.getBounds(), var1, var5, var3);

            while(var5 <= var6) {
               var4 = Math.min(1.0F, Math.abs(var2 - (float)var5));
               var3 = this.unselectedAlpha;
               int var7 = .cdg.d(-1, (int)(var3 + (this.selectedAlpha - var3) * (1.0F - var4)));
               this.indicatorPaint.setColor(var7);
               var1.drawCircle(0.0F, 0.0F, this.computeIndicatorDotRadius(var5), this.indicatorPaint);
               this.canvasTransformer.b(this.getBounds(), var1);
               ++var5;
            }

            var1.restore();
            return;
         }
      }

   }

   public int getOpacity() {
      return -3;
   }

   public void inflate(Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      super.inflate(var1, var2, var3, var4);
      TypedArray var7;
      if (var4 != null) {
         var7 = var4.obtainStyledAttributes(var3, .lfa.a, 0, 0);
      } else {
         var7 = var1.obtainAttributes(var3, .lfa.a);
      }

      this.dotRadius = var7.getDimensionPixelSize(1, 0);
      this.selectedAlpha = (float)var7.getInteger(2, 0);
      this.unselectedAlpha = (float)var7.getInteger(3, 0);
      int var6 = var7.getDimensionPixelSize(0, 0);
      if (var1.getConfiguration().isScreenRound()) {
         this.canvasTransformer = new .lfc((float)this.dotRadius, (float)var6);
      } else {
         float var5 = (float)var1.getDimensionPixelOffset(2131167430);
         this.canvasTransformer = new .lfb((float)this.dotRadius, var5, (float)var6);
      }

      var7.recycle();
   }

   public boolean isAutoMirrored() {
      return true;
   }

   public void setAlpha(int var1) {
   }

   public void setColorFilter(ColorFilter var1) {
   }

   public void setPageCount(int var1) {
      .lez var3 = this.state;
      var3.b = var1;
      boolean var2;
      if (var1 <= 6) {
         var2 = true;
      } else {
         var2 = false;
      }

      var3.a = var2;
      var3.h = 2.5F;
      var3.g = (float)(var1 - 1) - 2.5F;
      this.invalidateSelf();
   }

   public void setPagePosition(float var1) {
      this.state.e = var1;
      this.invalidateSelf();
   }
}
