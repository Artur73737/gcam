package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;

public class AlertDialogLayout extends LinearLayoutCompat {
   public AlertDialogLayout(Context var1) {
      super(var1);
   }

   public AlertDialogLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   private static int a(View var0) {
      int var1 = .cfx.b(var0);
      if (var1 > 0) {
         return var1;
      } else {
         if (var0 instanceof ViewGroup) {
            ViewGroup var2 = (ViewGroup)var0;
            if (var2.getChildCount() == 1) {
               return a(var2.getChildAt(0));
            }
         }

         return 0;
      }
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      int var9 = var4 - var2;
      int var7 = this.getPaddingLeft();
      int var12 = this.getPaddingRight();
      int var11 = this.getPaddingRight();
      var2 = this.getMeasuredHeight();
      int var8 = this.getChildCount();
      int var10 = super.f;
      switch(var10 & 112) {
      case 16:
         var2 = this.getPaddingTop() + (var5 - var3 - var2) / 2;
         break;
      case 80:
         var2 = this.getPaddingTop() + var5 - var3 - var2;
         break;
      default:
         var2 = this.getPaddingTop();
      }

      Drawable var15 = super.g;
      var5 = 0;
      if (var15 == null) {
         var4 = 0;
      } else {
         var4 = var15.getIntrinsicHeight();
      }

      while(var5 < var8) {
         View var16 = this.getChildAt(var5);
         var3 = var2;
         if (var16 != null) {
            var3 = var2;
            if (var16.getVisibility() != 8) {
               int var14 = var16.getMeasuredWidth();
               int var13 = var16.getMeasuredHeight();
               .ku var17 = (.ku)var16.getLayoutParams();
               int var6 = var17.gravity;
               var3 = var6;
               if (var6 < 0) {
                  var3 = var10 & 8388615;
               }

               switch(Gravity.getAbsoluteGravity(var3, .cfy.c(this)) & 7) {
               case 1:
                  var3 = (var9 - var7 - var11 - var14) / 2 + var7 + var17.leftMargin - var17.rightMargin;
                  break;
               case 5:
                  var3 = var9 - var12 - var14 - var17.rightMargin;
                  break;
               default:
                  var3 = var17.leftMargin + var7;
               }

               var6 = var2;
               if (this.s(var5)) {
                  var6 = var2 + var4;
               }

               var2 = var6 + var17.topMargin;
               var16.layout(var3, var2, var14 + var3, var2 + var13);
               var3 = var2 + var13 + var17.bottomMargin;
            }
         }

         ++var5;
         var2 = var3;
      }

   }

   protected final void onMeasure(int var1, int var2) {
      int var10 = this.getChildCount();
      View var16 = null;
      View var15 = null;
      View var14 = null;

      int var3;
      int var4;
      View var13;
      View var19;
      for(var3 = 0; var3 < var10; var14 = var19) {
         var13 = this.getChildAt(var3);
         View var17 = var16;
         View var18 = var15;
         var19 = var14;
         if (var13.getVisibility() != 8) {
            var4 = var13.getId();
            if (var4 == 2131428364) {
               var17 = var13;
               var18 = var15;
               var19 = var14;
            } else if (var4 == 2131427496) {
               var17 = var16;
               var18 = var13;
               var19 = var14;
            } else {
               if (var4 != 2131427576 && var4 != 2131427594 || var14 != null) {
                  super.onMeasure(var1, var2);
                  return;
               }

               var17 = var16;
               var18 = var15;
               var19 = var13;
            }
         }

         ++var3;
         var16 = var17;
         var15 = var18;
      }

      int var12 = MeasureSpec.getMode(var2);
      int var9 = MeasureSpec.getSize(var2);
      int var11 = MeasureSpec.getMode(var1);
      int var5 = this.getPaddingTop() + this.getPaddingBottom();
      if (var16 != null) {
         var16.measure(var1, 0);
         var5 += var16.getMeasuredHeight();
         var4 = View.combineMeasuredStates(0, var16.getMeasuredState());
      } else {
         var4 = 0;
      }

      int var6;
      if (var15 != null) {
         var15.measure(var1, 0);
         var3 = a(var15);
         var6 = var15.getMeasuredHeight() - var3;
         var5 += var3;
         var4 = View.combineMeasuredStates(var4, var15.getMeasuredState());
      } else {
         var3 = 0;
         var6 = 0;
      }

      int var7;
      int var8;
      if (var14 != null) {
         if (var12 == 0) {
            var7 = 0;
         } else {
            var7 = MeasureSpec.makeMeasureSpec(Math.max(0, var9 - var5), var12);
         }

         var14.measure(var1, var7);
         var8 = var14.getMeasuredHeight();
         var5 += var8;
         var4 = View.combineMeasuredStates(var4, var14.getMeasuredState());
      } else {
         var8 = 0;
      }

      var9 -= var5;
      if (var15 != null) {
         var7 = Math.min(var9, var6);
         if (var7 > 0) {
            var6 = var9 - var7;
            var7 += var3;
         } else {
            var7 = var3;
            var6 = var9;
         }

         var15.measure(var1, MeasureSpec.makeMeasureSpec(var7, 1073741824));
         var5 = var5 - var3 + var15.getMeasuredHeight();
         var4 = View.combineMeasuredStates(var4, var15.getMeasuredState());
         var9 = var6;
      }

      var6 = var4;
      var3 = var5;
      if (var14 != null) {
         var6 = var4;
         var3 = var5;
         if (var9 > 0) {
            var14.measure(var1, MeasureSpec.makeMeasureSpec(var8 + var9, var12));
            var3 = var5 - var8 + var14.getMeasuredHeight();
            var6 = View.combineMeasuredStates(var4, var14.getMeasuredState());
         }
      }

      var5 = 0;

      for(var7 = 0; var5 < var10; var7 = var4) {
         var13 = this.getChildAt(var5);
         var4 = var7;
         if (var13.getVisibility() != 8) {
            var4 = Math.max(var7, var13.getMeasuredWidth());
         }

         ++var5;
      }

      this.setMeasuredDimension(View.resolveSizeAndState(var7 + this.getPaddingLeft() + this.getPaddingRight(), var1, var6), View.resolveSizeAndState(var3, var2, 0));
      if (var11 != 1073741824) {
         var3 = MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);

         for(var1 = 0; var1 < var10; ++var1) {
            var14 = this.getChildAt(var1);
            if (var14.getVisibility() != 8) {
               .ku var20 = (.ku)var14.getLayoutParams();
               if (var20.width == -1) {
                  var4 = var20.height;
                  var20.height = var14.getMeasuredHeight();
                  this.measureChildWithMargins(var14, var3, 0, var2, 0);
                  var20.height = var4;
               }
            }
         }
      }

   }
}
