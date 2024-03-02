package com.google.android.apps.camera.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class ReviewImageView extends ImageView {
   public ReviewImageView(Context var1) {
      super(var1);
   }

   public ReviewImageView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public ReviewImageView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public ReviewImageView(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   private final void c() {
      BitmapDrawable var1 = (BitmapDrawable)this.getDrawable();
      if (var1 != null && !var1.getBitmap().isRecycled()) {
         var1.getBitmap().recycle();
      }

   }

   public final void a() {
      this.c();
      this.setVisibility(8);
      this.setImageDrawable((Drawable)null);
   }

   public final void b(Bitmap var1) {
      this.c();
      this.setVisibility(0);
      this.setImageBitmap(var1);
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      BitmapDrawable var11 = (BitmapDrawable)this.getDrawable();
      if (var11 != null && var11.getBitmap() != null) {
         Bitmap var12 = var11.getBitmap();
         float var9 = (float)var12.getWidth();
         float var8 = (float)var12.getHeight();
         float var10 = (float)this.getWidth();
         float var6 = (float)this.getHeight();
         Matrix var13 = new Matrix();
         float var7 = Math.min(var6 / var8, var10 / var9);
         var13.setScale(var7, var7);
         var13.postTranslate(var10 / 2.0F - var9 * var7 / 2.0F, var6 / 2.0F - var8 * var7 / 2.0F);
         this.setImageMatrix(var13);
         this.setScaleType(ScaleType.MATRIX);
      }
   }
}
