package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageView.ScaleType;
import java.util.Collections;
import java.util.List;

public class MaterialToolbar extends Toolbar {
   private static final ScaleType[] E;
   private Integer F;
   private boolean G;
   private boolean H;
   private ScaleType I;
   private Boolean J;

   static {
      E = new ScaleType[]{ScaleType.MATRIX, ScaleType.FIT_XY, ScaleType.FIT_START, ScaleType.FIT_CENTER, ScaleType.FIT_END, ScaleType.CENTER, ScaleType.CENTER_CROP, ScaleType.CENTER_INSIDE};
   }

   public MaterialToolbar(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public MaterialToolbar(Context var1, AttributeSet var2) {
      this(var1, var2, 2130970406);
   }

   public MaterialToolbar(Context var1, AttributeSet var2, int var3) {
      super(.ope.a(var1, var2, var3, 2132084902), var2, var3);
      var1 = this.getContext();
      int[] var5 = .ois.e;
      byte var4 = 0;
      TypedArray var6 = .oli.a(var1, var2, var5, var3, 2132084902);
      Drawable var8;
      if (var6.hasValue(2)) {
         this.F = var6.getColor(2, -1);
         var8 = this.e();
         if (var8 != null) {
            this.q(var8);
         }
      }

      this.G = var6.getBoolean(4, false);
      this.H = var6.getBoolean(3, false);
      var3 = var6.getInt(1, -1);
      if (var3 >= 0 && var3 < 8) {
         this.I = E[var3];
      }

      if (var6.hasValue(0)) {
         this.J = var6.getBoolean(0, false);
      }

      var6.recycle();
      var8 = this.getBackground();
      if (var8 == null || var8 instanceof ColorDrawable) {
         .onm var7 = new .onm();
         if (var8 != null) {
            var3 = ((ColorDrawable)var8).getColor();
         } else {
            var3 = var4;
         }

         var7.j(ColorStateList.valueOf(var3));
         var7.h(var1);
         var7.i(.cgd.a(this));
         .cfx.m(this, var7);
      }
   }

   private final void B(View var1, Pair var2) {
      int var4 = this.getMeasuredWidth() / 2;
      int var3 = var1.getMeasuredWidth();
      var4 -= var3 / 2;
      var3 += var4;
      int var5 = Math.max(Math.max((Integer)var2.first - var4, 0), Math.max(var3 - (Integer)var2.second, 0));
      if (var5 > 0) {
         var4 += var5;
         var3 -= var5;
         var1.measure(MeasureSpec.makeMeasureSpec(var3 - var4, 1073741824), var1.getMeasuredHeightAndState());
      }

      var1.layout(var4, var1.getTop(), var3, var1.getBottom());
   }

   public final void n(int var1) {
      Menu var3 = this.f();
      boolean var2 = var3 instanceof .gv;
      if (var2) {
         ((.gv)var3).s();
      }

      super.n(var1);
      if (var2) {
         ((.gv)var3).r();
      }

   }

   protected final void onAttachedToWindow() {
      super.onAttachedToWindow();
      .onk.d(this);
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      var1 = this.G;
      byte var8 = 0;
      Object var12 = null;
      if (var1 || this.H) {
         List var10 = .olj.a(this, super.t);
         TextView var14;
         if (var10.isEmpty()) {
            var14 = null;
         } else {
            var14 = (TextView)Collections.min(var10, .olj.a);
         }

         List var11 = .olj.a(this, super.u);
         TextView var16;
         if (var11.isEmpty()) {
            var16 = null;
         } else {
            var16 = (TextView)Collections.max(var11, .olj.a);
         }

         if (var14 != null || var16 != null) {
            var2 = this.getMeasuredWidth();
            int var9 = var2 / 2;
            var3 = this.getPaddingLeft();
            var4 = var2 - this.getPaddingRight();

            int var6;
            for(var5 = 0; var5 < this.getChildCount(); var4 = var6) {
               View var13 = this.getChildAt(var5);
               int var7 = var3;
               var6 = var4;
               if (var13.getVisibility() != 8) {
                  var7 = var3;
                  var6 = var4;
                  if (var13 != var14) {
                     var7 = var3;
                     var6 = var4;
                     if (var13 != var16) {
                        var2 = var3;
                        if (var13.getRight() < var9) {
                           var2 = var3;
                           if (var13.getRight() > var3) {
                              var2 = var13.getRight();
                           }
                        }

                        var7 = var2;
                        var6 = var4;
                        if (var13.getLeft() > var9) {
                           var7 = var2;
                           var6 = var4;
                           if (var13.getLeft() < var4) {
                              var6 = var13.getLeft();
                              var7 = var2;
                           }
                        }
                     }
                  }
               }

               ++var5;
               var3 = var7;
            }

            Pair var22 = new Pair(var3, var4);
            if (this.G && var14 != null) {
               this.B(var14, var22);
            }

            if (this.H && var16 != null) {
               this.B(var16, var22);
            }
         }
      }

      ImageView var15 = super.e;
      Drawable var17;
      if (var15 != null) {
         var17 = var15.getDrawable();
      } else {
         var17 = null;
      }

      if (var17 == null) {
         var15 = (ImageView)var12;
      } else {
         var2 = var8;

         while(true) {
            if (var2 >= this.getChildCount()) {
               var15 = (ImageView)var12;
               break;
            }

            View var18 = this.getChildAt(var2);
            if (var18 instanceof ImageView) {
               ImageView var19 = (ImageView)var18;
               Drawable var23 = var19.getDrawable();
               if (var23 != null && var23.getConstantState() != null && var23.getConstantState().equals(var17.getConstantState())) {
                  var15 = var19;
                  break;
               }
            }

            ++var2;
         }
      }

      if (var15 != null) {
         Boolean var20 = this.J;
         if (var20 != null) {
            var15.setAdjustViewBounds(var20);
         }

         ScaleType var21 = this.I;
         if (var21 != null) {
            var15.setScaleType(var21);
         }
      }

   }

   public final void q(Drawable var1) {
      Drawable var2 = var1;
      if (var1 != null) {
         var2 = var1;
         if (this.F != null) {
            var2 = var1.mutate();
            .cdm.f(var2, this.F);
         }
      }

      super.q(var2);
   }

   public final void setElevation(float var1) {
      super.setElevation(var1);
      .onk.c(this, var1);
   }
}
