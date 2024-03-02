package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ButtonBarLayout extends LinearLayout {
   private final boolean a;
   private boolean b;
   private int c = -1;

   public ButtonBarLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var4 = var1.obtainStyledAttributes(var2, .fq.k);
      .cgj.d(this, var1, .fq.k, var2, var4, 0, 0);
      boolean var3 = var4.getBoolean(0, true);
      this.a = var3;
      var4.recycle();
      if (this.getOrientation() == 1) {
         this.b(var3);
      }

   }

   private final int a(int var1) {
      for(int var2 = this.getChildCount(); var1 < var2; ++var1) {
         if (this.getChildAt(var1).getVisibility() == 0) {
            return var1;
         }
      }

      return -1;
   }

   private final void b(boolean var1) {
      if (this.b != var1 && (var1 == 0 || this.a)) {
         this.b = (boolean)var1;
         this.setOrientation(var1);
         int var2;
         if (1 != var1) {
            var2 = 80;
         } else {
            var2 = 8388613;
         }

         this.setGravity(var2);
         View var3 = this.findViewById(2131428246);
         if (var3 != null) {
            if (1 != var1) {
               var1 = 4;
            } else {
               var1 = 8;
            }

            var3.setVisibility(var1);
         }

         for(int var4 = this.getChildCount() - 2; var4 >= 0; --var4) {
            this.bringChildToFront(this.getChildAt(var4));
         }
      }

   }

   protected final void onMeasure(int var1, int var2) {
      int var3 = MeasureSpec.getSize(var1);
      if (this.a) {
         if (var3 > this.c && this.b) {
            this.b(false);
         }

         this.c = var3;
      }

      boolean var4;
      if (!this.b && MeasureSpec.getMode(var1) == 1073741824) {
         var3 = MeasureSpec.makeMeasureSpec(var3, Integer.MIN_VALUE);
         var4 = true;
      } else {
         var3 = var1;
         var4 = false;
      }

      label58: {
         super.onMeasure(var3, var2);
         if (this.a && !this.b && (this.getMeasuredWidthAndState() & -16777216) == 16777216) {
            this.b(true);
         } else if (!var4) {
            break label58;
         }

         super.onMeasure(var1, var2);
      }

      int var7 = this.a(0);
      if (var7 >= 0) {
         View var6 = this.getChildAt(var7);
         LayoutParams var5 = (LayoutParams)var6.getLayoutParams();
         var3 = this.getPaddingTop() + var6.getMeasuredHeight() + var5.topMargin + var5.bottomMargin;
         if (this.b) {
            var7 = this.a(var7 + 1);
            if (var7 >= 0) {
               var3 += this.getChildAt(var7).getPaddingTop() + (int)(this.getResources().getDisplayMetrics().density * 16.0F);
            }
         } else {
            var3 += this.getPaddingBottom();
         }
      } else {
         var3 = 0;
      }

      if (.cfx.b(this) != var3) {
         this.setMinimumHeight(var3);
         if (var2 == 0) {
            super.onMeasure(var1, 0);
         }
      }

   }
}
