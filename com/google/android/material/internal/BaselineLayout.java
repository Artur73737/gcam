package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup {
   private int a = -1;

   public BaselineLayout(Context var1) {
      super(var1, (AttributeSet)null, 0);
   }

   public BaselineLayout(Context var1, AttributeSet var2) {
      super(var1, var2, 0);
   }

   public BaselineLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public final int getBaseline() {
      return this.a;
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      int var9 = this.getChildCount();
      int var7 = this.getPaddingLeft();
      int var8 = this.getPaddingRight();
      int var6 = this.getPaddingTop();

      for(var3 = 0; var3 < var9; ++var3) {
         View var13 = this.getChildAt(var3);
         if (var13.getVisibility() != 8) {
            int var10 = var13.getMeasuredWidth();
            int var12 = var13.getMeasuredHeight();
            int var11 = (var4 - var2 - var8 - var7 - var10) / 2 + var7;
            if (this.a != -1 && var13.getBaseline() != -1) {
               var5 = this.a + var6 - var13.getBaseline();
            } else {
               var5 = var6;
            }

            var13.layout(var11, var5, var10 + var11, var12 + var5);
         }
      }

   }

   protected final void onMeasure(int var1, int var2) {
      int var14 = this.getChildCount();
      int var10 = 0;
      int var5 = 0;
      int var9 = 0;
      int var8 = 0;
      int var4 = -1;

      int var3;
      int var6;
      for(var3 = -1; var10 < var14; var3 = var6) {
         View var15 = this.getChildAt(var10);
         int var13 = var5;
         int var12 = var9;
         int var11 = var8;
         int var7 = var4;
         var6 = var3;
         if (var15.getVisibility() != 8) {
            this.measureChild(var15, var1, var2);
            var11 = var15.getBaseline();
            var7 = var4;
            var6 = var3;
            if (var11 != -1) {
               var7 = Math.max(var4, var11);
               var6 = Math.max(var3, var15.getMeasuredHeight() - var11);
            }

            var12 = Math.max(var9, var15.getMeasuredWidth());
            var13 = Math.max(var5, var15.getMeasuredHeight());
            var11 = View.combineMeasuredStates(var8, var15.getMeasuredState());
         }

         ++var10;
         var5 = var13;
         var9 = var12;
         var8 = var11;
         var4 = var7;
      }

      var6 = var5;
      if (var4 != -1) {
         var6 = Math.max(var5, Math.max(var3, this.getPaddingBottom()) + var4);
         this.a = var4;
      }

      var3 = Math.max(var6, this.getSuggestedMinimumHeight());
      this.setMeasuredDimension(View.resolveSizeAndState(Math.max(var9, this.getSuggestedMinimumWidth()), var1, var8), View.resolveSizeAndState(var3, var2, var8 << 16));
   }
}
