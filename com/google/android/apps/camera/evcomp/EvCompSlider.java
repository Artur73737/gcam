package com.google.android.apps.camera.evcomp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;

public class EvCompSlider extends FrameLayout {
   public final AccessibilityManager a;
   private final Paint b;
   private final Paint c;
   private final int d;
   private final int e;
   private int f;

   public EvCompSlider(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setWillNotDraw(false);
      this.d = this.getResources().getDimensionPixelSize(2131165530);
      this.e = this.getResources().getDimensionPixelSize(2131165529);
      Paint var3 = new Paint();
      this.b = var3;
      var3.setStyle(Style.FILL);
      var3.setAntiAlias(true);
      var3 = new Paint();
      this.c = var3;
      var3.setStyle(Style.STROKE);
      var3.setStrokeWidth((float)this.getResources().getDimensionPixelSize(2131165527));
      var3.setAntiAlias(true);
      this.a = (AccessibilityManager)var1.getSystemService("accessibility");
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.f = var1;
      Paint var6 = this.b;
      TileMode var5 = TileMode.MIRROR;
      var6.setShader(new LinearGradient(0.0F, 0.0F, 0.0F, (float)var1, var2, var3, var5));
      this.c.setColor(var4);
      this.setOnHoverListener(new .ftq(this, 1));
   }

   public final boolean dispatchTouchEvent(MotionEvent var1) {
      if (this.a.isTouchExplorationEnabled()) {
         for(int var2 = 0; var2 < this.getChildCount(); ++var2) {
            View var3 = this.getChildAt(var2);
            if (var3 instanceof .ftr) {
               return var3.dispatchTouchEvent(var1);
            }
         }

         return super.dispatchTouchEvent(var1);
      } else {
         return super.dispatchTouchEvent(var1);
      }
   }

   protected final void onDraw(Canvas var1) {
      super.onDraw(var1);
      int var7 = this.getMeasuredWidth();
      int var9 = this.e / 2;
      int var6 = this.getMeasuredWidth();
      int var10 = this.e / 2;
      int var8 = this.d;
      float var2 = (float)this.f;
      float var3 = (float)this.getResources().getDimensionPixelSize(2131165526);
      float var4 = (float)this.getResources().getDimensionPixelSize(2131165526);
      Paint var11 = this.b;
      float var5 = (float)(var6 - var10 + var8);
      var1.drawRoundRect((float)(var7 - var9), 0.0F, var5, var2, var3, var4, var11);
      var10 = this.getMeasuredWidth();
      var7 = this.e / 2;
      var6 = this.getMeasuredWidth();
      var9 = this.e / 2;
      var8 = this.d;
      var4 = (float)this.f;
      var3 = (float)this.getResources().getDimensionPixelSize(2131165526);
      var5 = (float)this.getResources().getDimensionPixelSize(2131165526);
      var11 = this.c;
      var2 = (float)(var6 - var9 + var8);
      var1.drawRoundRect((float)(var10 - var7), 0.0F, var2, var4, var3, var5, var11);
   }
}
