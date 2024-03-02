package androidx.wear.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;

public class ArcLayout extends ViewGroup {
   private int a;
   private int b;
   private float c;
   private float d;
   private boolean e;
   private final .cwn f;
   private View g;

   public ArcLayout(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ArcLayout(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public ArcLayout(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public ArcLayout(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.a = 0;
      this.d = 360.0F;
      this.f = new .cwn();
      this.g = null;
      TypedArray var5 = var1.obtainStyledAttributes(var2, .cwg.a, var3, var4);
      this.b = var5.getInt(1, 0);
      this.c = var5.getFloat(0, 0.0F);
      this.e = var5.getBoolean(2, true);
      var5.recycle();
   }

   private final float a(View var1) {
      .cwo var10 = (.cwo)var1.getLayoutParams();
      boolean var9 = var1 instanceof CurvedTextView;
      int var4;
      if (var9) {
         var4 = ((CurvedTextView)var1).a();
      } else {
         var4 = var1.getMeasuredHeight();
      }

      int var8 = this.a;
      int var6 = var10.topMargin;
      int var7 = var10.bottomMargin;
      int var5;
      if (this.e) {
         var5 = var10.topMargin;
      } else {
         var5 = var10.bottomMargin;
      }

      float var2;
      if (!var9) {
         if (this.getMeasuredWidth() >= this.getMeasuredHeight()) {
            var2 = 0.0F;
         } else {
            var2 = (float)Math.round((float)(this.getMeasuredHeight() - this.getMeasuredWidth()) / 2.0F);
         }
      } else {
         var2 = 0.0F;
      }

      float var3 = (float)var5;
      var4 = var8 - var6 - var7 - var4;
      var5 = var10.b;
      var3 += var2;
      switch(var5) {
      case 0:
         return var3;
      case 1:
         var2 = (float)var4 / 2.0F;
         break;
      case 2:
         var2 = (float)var4;
         break;
      default:
         return 0.0F;
      }

      return var3 + var2;
   }

   private static float b(float var0, float var1) {
      double var2 = Math.asin((double)(var0 / var1 / 2.0F));
      return (float)Math.toDegrees(var2 + var2);
   }

   private final void c(View var1, .cwn var2) {
      if (var1.getVisibility() == 8) {
         var2.a = 0.0F;
         var2.b = 0.0F;
         var2.c = 0.0F;
      } else {
         float var3 = (float)this.getMeasuredWidth();
         int var6 = this.a;
         float var5 = var3 / 2.0F;
         float var4 = (float)var6;
         .cwo var7 = (.cwo)var1.getLayoutParams();
         var3 = (float)var7.leftMargin;
         var4 = var5 - var4;
         var2.a = b(var3, var4);
         var2.b = b((float)var7.rightMargin, var4);
         if (var1 instanceof CurvedTextView) {
            var2.c = ((CurvedTextView)var1).b;
         } else {
            var2.c = b((float)var1.getMeasuredWidth(), var4);
         }
      }
   }

   private final void d(View var1, float var2, float[] var3) {
      Matrix var6 = new Matrix();
      .cwo var7 = (.cwo)var1.getLayoutParams();
      int var4;
      int var5;
      if (var1 instanceof CurvedTextView) {
         var2 = -var2;
         var5 = this.getMeasuredWidth() / 2;
         var4 = this.getMeasuredHeight() / 2;
         var6.postRotate(var2, (float)var5, (float)var4);
         var6.postTranslate(-var1.getX(), -var1.getY());
      } else {
         var6.postTranslate(-var7.d, -var7.e);
         if (var7.a) {
            var6.postRotate(-var2);
         }

         var4 = var1.getWidth() / 2;
         var5 = var1.getHeight() / 2;
         var6.postTranslate((float)var4, (float)var5);
      }

      var6.mapPoints(var3);
   }

   protected final boolean checkLayoutParams(LayoutParams var1) {
      return var1 instanceof .cwo;
   }

   protected final boolean drawChild(Canvas var1, View var2, long var3) {
      var1.save();
      .cwo var9 = (.cwo)var2.getLayoutParams();
      float var7 = var9.c;
      float var5;
      float var6;
      boolean var8;
      if (var2 instanceof CurvedTextView) {
         var6 = (float)this.getMeasuredWidth();
         var5 = (float)this.getMeasuredHeight();
         var1.rotate(var7, var6 / 2.0F, var5 / 2.0F);
         CurvedTextView var10 = (CurvedTextView)var2;
         if (var10.c != -1) {
            throw new IllegalArgumentException("CurvedTextView shall not set anchorType value when added intoArcLayout");
         }

         if (var10.d != -1.0F) {
            throw new IllegalArgumentException("CurvedTextView shall not set anchorAngleDegrees value when added into ArcLayout");
         }
      } else {
         var8 = var9.a;
         var6 = 0.0F;
         var5 = 0.0F;
         if (var8) {
            if (!this.e) {
               var5 = 180.0F;
            }

            var5 += var7;
         } else {
            var5 = var6;
         }

         var1.rotate(var5, var9.d, var9.e);
      }

      var8 = super.drawChild(var1, var2, var3);
      var1.restore();
      return var8;
   }

   protected final LayoutParams generateDefaultLayoutParams() {
      return new .cwo();
   }

   public final LayoutParams generateLayoutParams(AttributeSet var1) {
      return new .cwo(this.getContext(), var1);
   }

   protected final LayoutParams generateLayoutParams(LayoutParams var1) {
      return new .cwo(var1);
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      if (this.g == null && var1.getActionMasked() == 0) {
         int var4 = 0;

         View var6;
         while(true) {
            if (var4 >= this.getChildCount()) {
               return true;
            }

            var6 = this.getChildAt(var4);
            if (var6.getVisibility() == 0) {
               float var2 = ((.cwo)var6.getLayoutParams()).c;
               float[] var5 = new float[]{var1.getX(), var1.getY()};
               this.d(var6, var2, var5);
               float var3 = var5[0];
               var2 = var5[1];
               if (var6 instanceof CurvedTextView) {
                  if (((CurvedTextView)var6).c(var3, var2)) {
                     break;
                  }
               } else if (var3 >= 0.0F && var3 < (float)var6.getMeasuredWidth() && var2 >= 0.0F && var2 < (float)var6.getMeasuredHeight()) {
                  break;
               }
            }

            ++var4;
         }

         this.g = var6;
      }

      return true;
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      var2 = this.getLayoutDirection();
      byte var27 = 0;
      if (var2 != 1) {
         var1 = false;
      } else {
         var1 = true;
      }

      boolean var21 = this.e;
      var2 = this.b;
      float var16;
      if (var21 != var1) {
         var16 = 1.0F;
      } else {
         var16 = -1.0F;
      }

      float var14;
      float var15;
      float var17;
      View var22;
      if (var2 == 0) {
         var14 = this.c * var16;
      } else {
         label92: {
            var3 = 0;
            boolean var25 = false;

            for(var15 = 0.0F; var3 < this.getChildCount(); ++var3) {
               var22 = this.getChildAt(var3);
               boolean var26;
               if (((.cwo)var22.getLayoutParams()).f > 0.0F) {
                  var26 = false;
               } else {
                  var26 = true;
               }

               var25 |= var26 ^ true;
               this.c(var22, this.f);
               var15 += this.f.a();
            }

            var14 = var15;
            if (var25) {
               var17 = this.d;
               var14 = var15;
               if (var15 < var17) {
                  var14 = var17;
               }
            }

            var2 = this.b;
            if (var2 == 1) {
               var15 = this.c * var16;
               var14 /= 2.0F;
            } else {
               if (var2 != 2) {
                  var14 = 0.0F;
                  break label92;
               }

               var15 = this.c * var16;
            }

            var14 = var15 - var14;
         }
      }

      var2 = 0;
      float var18 = 0.0F;

      float var19;
      for(var17 = 0.0F; var2 < this.getChildCount(); var17 = var15) {
         var22 = this.getChildAt(var2);
         var19 = var18;
         var15 = var17;
         if (var22.getVisibility() != 8) {
            var15 = ((.cwo)var22.getLayoutParams()).f;
            if (var15 > 0.0F) {
               var19 = var18 + var15;
               this.c(var22, this.f);
               .cwn var28 = this.f;
               var15 = var17 + var28.a + var28.b;
            } else {
               this.c(var22, this.f);
               var15 = var17 + this.f.a();
               var19 = var18;
            }
         }

         ++var2;
         var18 = var19;
      }

      if (var18 > 0.0F) {
         var15 = (this.d - var17) / var18;
      } else {
         var15 = 0.0F;
      }

      for(var2 = var27; var2 < this.getChildCount(); ++var2) {
         var22 = this.getChildAt(var2);
         if (var22.getVisibility() != 8) {
            this.c(var22, this.f);
            .cwo var23 = (.cwo)var22.getLayoutParams();
            var17 = var23.f;
            .cwn var24;
            if (var17 > 0.0F) {
               var24 = this.f;
               var17 *= var15;
               var24.c = var17;
               if (!(var22 instanceof CurvedTextView)) {
                  throw new IllegalStateException("ArcLayout.LayoutParams with non zero weights are only supported for views implementing ArcLayout.Widget");
               }

               ((CurvedTextView)var22).b = var17;
            }

            var24 = this.f;
            float var20 = (var24.a + var24.c / 2.0F + var14) * var16;
            var23.c = var20;
            var4 = this.getMeasuredHeight();
            var3 = var22.getMeasuredHeight();
            var18 = this.a(var22);
            var19 = (float)((var4 - var3) / 2);
            var17 = (float)this.getMeasuredWidth();
            double var8 = (double)var20;
            Double.isNaN(var8);
            double var6 = (double)(var19 - var18);
            double var10 = var8 * 3.141592653589793D / 180.0D;
            double var12 = Math.sin(var10);
            Double.isNaN(var6);
            var8 = (double)(var17 / 2.0F);
            Double.isNaN(var8);
            var23.d = (float)(var8 + var12 * var6);
            var17 = (float)this.getMeasuredHeight();
            var8 = Math.cos(var10);
            Double.isNaN(var6);
            var10 = (double)(var17 / 2.0F);
            Double.isNaN(var10);
            var23.e = (float)(var10 - var6 * var8);
            var14 += this.f.a();
            if (var22 instanceof CurvedTextView) {
               var4 = Math.round((float)this.getMeasuredWidth() / 2.0F - (float)var22.getMeasuredWidth() / 2.0F);
               var3 = Math.round((float)this.getMeasuredHeight() / 2.0F - (float)var22.getMeasuredHeight() / 2.0F);
               var22.layout(var4, var3, var22.getMeasuredWidth() + var4, var22.getMeasuredHeight() + var3);
            } else {
               var4 = Math.round(var23.d - (float)var22.getMeasuredWidth() / 2.0F);
               var3 = Math.round(var23.e - (float)var22.getMeasuredHeight() / 2.0F);
               var22.layout(var4, var3, var22.getMeasuredWidth() + var4, var22.getMeasuredHeight() + var3);
            }
         }
      }

   }

   protected final void onMeasure(int var1, int var2) {
      int var7 = MeasureSpec.getSize(var1);
      int var6 = MeasureSpec.getSize(var2);
      int var5 = var7;
      int var4 = var6;
      if (MeasureSpec.getMode(var1) == 0) {
         var5 = var7;
         var4 = var6;
         if (MeasureSpec.getMode(var2) == 0) {
            DisplayMetrics var12 = this.getContext().getResources().getDisplayMetrics();
            var5 = var12.widthPixels;
            var4 = var12.heightPixels;
         }
      }

      if (var5 < var4) {
         var6 = var5;
      } else if (var4 < var5) {
         var5 = var4;
         var6 = var4;
      } else {
         var6 = var5;
         var5 = var4;
      }

      int var10 = var5 / 2;
      int var11 = MeasureSpec.makeMeasureSpec(var10, Integer.MIN_VALUE);
      var7 = 0;
      int var8 = 0;

      .cwo var16;
      for(var4 = 0; var7 < this.getChildCount(); ++var7) {
         View var15 = this.getChildAt(var7);
         if (var15.getVisibility() != 8) {
            int var9;
            if (var15 instanceof CurvedTextView) {
               var9 = ((CurvedTextView)var15).a();
            } else {
               this.measureChild(var15, getChildMeasureSpec(var11, 0, var15.getLayoutParams().width), getChildMeasureSpec(var11, 0, var15.getLayoutParams().height));
               var9 = var15.getMeasuredHeight();
               var4 = combineMeasuredStates(var4, var15.getMeasuredState());
            }

            var16 = (.cwo)var15.getLayoutParams();
            var8 = Math.max(var8, var9 + var16.topMargin + var16.bottomMargin);
         }
      }

      this.a = var8;
      byte var14 = 0;
      var7 = var4;

      for(var4 = var14; var4 < this.getChildCount(); var7 = var8) {
         View var13 = this.getChildAt(var4);
         var8 = var7;
         if (var13.getVisibility() != 8) {
            var8 = var7;
            if (var13 instanceof CurvedTextView) {
               var16 = (.cwo)var13.getLayoutParams();
               float var3 = this.a(var13);
               var8 = MeasureSpec.makeMeasureSpec(var10 + var10 - Math.round(var3 + var3), 1073741824);
               this.measureChild(var13, getChildMeasureSpec(var8, 0, var16.width), getChildMeasureSpec(var8, 0, var16.height));
               var8 = combineMeasuredStates(var7, var13.getMeasuredState());
            }
         }

         ++var4;
      }

      this.setMeasuredDimension(resolveSizeAndState(var6, var1, var7), resolveSizeAndState(var5, var2, var7));
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      if (this.g == null) {
         return false;
      } else {
         float[] var3 = new float[]{var1.getX(), var1.getY()};
         .cwo var2 = (.cwo)this.g.getLayoutParams();
         this.d(this.g, var2.c, var3);
         var1.offsetLocation(var3[0] - var1.getX(), var3[1] - var1.getY());
         this.g.dispatchTouchEvent(var1);
         if (var1.getActionMasked() == 1 || var1.getActionMasked() == 3) {
            this.g = null;
         }

         return true;
      }
   }

   public final void requestLayout() {
      super.requestLayout();

      for(int var1 = 0; var1 < this.getChildCount(); ++var1) {
         this.getChildAt(var1).forceLayout();
      }

   }
}
