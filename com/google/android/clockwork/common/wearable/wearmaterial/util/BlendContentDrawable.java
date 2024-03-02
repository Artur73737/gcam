package com.google.android.clockwork.common.wearable.wearmaterial.util;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public final class BlendContentDrawable extends DrawableWrapper {
   private .lgq blendMode;
   private final Paint contentPaint;
   private .cew contentProvider;
   private final Paint drawablePaint;
   private final RectF tmpRectF;

   public BlendContentDrawable() {
      super((Drawable)null);
      Paint var2 = new Paint();
      this.contentPaint = var2;
      Paint var1 = new Paint();
      this.drawablePaint = var1;
      this.tmpRectF = new RectF();
      this.blendMode = .lgq.a;
      var2.setXfermode(new PorterDuffXfermode(Mode.SRC_OVER));
      var1.setXfermode(new PorterDuffXfermode(Mode.SRC_ATOP));
   }

   public static BlendContentDrawable create(Drawable var0) {
      return create(var0, .lgq.a);
   }

   public static BlendContentDrawable create(Drawable var0, .lgq var1) {
      BlendContentDrawable var2 = new BlendContentDrawable();
      var2.initialize(var0, var1);
      return var2;
   }

   private void draw(Canvas var1, .cew var2) {
      if (this.useAlphaChannelBlending()) {
         this.drawWithAlphaBlending(var1, var2);
      } else {
         var2.accept(var1);
         super.draw(var1);
      }
   }

   private void drawWithAlphaBlending(Canvas var1, .cew var2) {
      this.tmpRectF.set(this.getBounds());
      int var4 = var1.saveLayer(this.tmpRectF, this.contentPaint);
      var2.accept(var1);
      int var3 = var1.saveLayer(this.tmpRectF, this.drawablePaint);
      super.draw(var1);
      var1.restoreToCount(var3);
      var1.restoreToCount(var4);
   }

   private void initialize(Drawable var1, .lgq var2) {
      this.setDrawable(var1);
      this.setBlendMode(var2);
   }

   private boolean useAlphaChannelBlending() {
      return this.blendMode != .lgq.a;
   }

   public void draw(Canvas var1) {
      .cew var2 = this.contentProvider;
      if (var2 != null) {
         this.draw(var1, var2);
      } else {
         super.draw(var1);
      }
   }

   public int getOpacity() {
      return this.useAlphaChannelBlending() ? -3 : super.getOpacity();
   }

   public void inflate(Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      super.inflate(var1, var2, var3, var4);
      TypedArray var6;
      if (var4 != null) {
         var6 = var4.obtainStyledAttributes(var3, .lgt.a, 0, 0);
      } else {
         var6 = var1.obtainAttributes(var3, .lgt.a);
      }

      this.setDrawable(var6.getDrawable(0));
      .lgq var5;
      switch(var6.getInt(1, 0)) {
      case 1:
         var5 = .lgq.b;
         break;
      case 2:
         var5 = .lgq.c;
         break;
      default:
         var5 = .lgq.a;
      }

      this.setBlendMode(var5);
      var6.recycle();
   }

   public void setBlendMode(.lgq var1) {
      this.blendMode = var1;
      Paint var2 = this.drawablePaint;
      .lgq var3 = .lgq.a;
      var2.setXfermode(new PorterDuffXfermode(var1.d));
   }

   public void setContentProvider(.cew var1) {
      if (this.contentProvider == null) {
         this.contentProvider = var1;
      }

   }
}
