package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.processing.UOb.gKVNpqGY;

public class LinearLayoutCompat extends ViewGroup {
   private boolean a;
   private int b;
   private int c;
   private int d;
   private int e;
   public int f;
   public Drawable g;
   public int h;
   private float i;
   private boolean j;
   private int[] k;
   private int[] l;
   private int m;
   private int n;
   private int o;

   public LinearLayoutCompat(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public LinearLayoutCompat(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public LinearLayoutCompat(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      boolean var5 = true;
      this.a = true;
      this.b = -1;
      this.c = 0;
      this.f = 8388659;
      AmbientDelegate var6 = AmbientDelegate.E(var1, var2, .fq.n, var3, 0);
      .cgj.d(this, var1, .fq.n, var2, (TypedArray)var6.b, var3, 0);
      var3 = var6.q(1, -1);
      if (var3 >= 0) {
         this.r(var3);
      }

      int var4 = var6.q(0, -1);
      if (var4 >= 0 && this.f != var4) {
         var3 = var4;
         if ((8388615 & var4) == 0) {
            var3 = var4 | 8388611;
         }

         var4 = var3;
         if ((var3 & 112) == 0) {
            var4 = var3 | 48;
         }

         this.f = var4;
         this.requestLayout();
      }

      if (!var6.A(2, true)) {
         this.t();
      }

      this.i = ((TypedArray)var6.b).getFloat(4, -1.0F);
      this.b = var6.q(3, -1);
      this.j = var6.A(7, false);
      Drawable var7 = var6.v(5);
      if (var7 != this.g) {
         this.g = var7;
         if (var7 != null) {
            this.h = var7.getIntrinsicWidth();
            this.m = var7.getIntrinsicHeight();
         } else {
            this.h = 0;
            this.m = 0;
         }

         if (var7 != null) {
            var5 = false;
         }

         this.setWillNotDraw(var5);
         this.requestLayout();
      }

      this.n = var6.q(8, 0);
      this.o = var6.p(6, 0);
      var6.z();
   }

   private static void a(View var0, int var1, int var2, int var3, int var4) {
      var0.layout(var1, var2, var3 + var1, var4 + var2);
   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      return var1 instanceof .ku;
   }

   protected .ku fR() {
      int var1 = this.d;
      if (var1 == 0) {
         return new .ku(-2);
      } else {
         return var1 == 1 ? new .ku(-1) : null;
      }
   }

   public .ku fS(AttributeSet var1) {
      return new .ku(this.getContext(), var1);
   }

   protected .ku fT(LayoutParams var1) {
      if (var1 instanceof .ku) {
         return new .ku((.ku)var1);
      } else {
         return var1 instanceof MarginLayoutParams ? new .ku((MarginLayoutParams)var1) : new .ku(var1);
      }
   }

   final void fU(Canvas var1, int var2) {
      this.g.setBounds(this.getPaddingLeft() + this.o, var2, this.getWidth() - this.getPaddingRight() - this.o, this.m + var2);
      this.g.draw(var1);
   }

   final void fV(Canvas var1, int var2) {
      this.g.setBounds(var2, this.getPaddingTop() + this.o, this.h + var2, this.getHeight() - this.getPaddingBottom() - this.o);
      this.g.draw(var1);
   }

   public final int getBaseline() {
      if (this.b < 0) {
         return super.getBaseline();
      } else {
         int var1 = this.getChildCount();
         int var2 = this.b;
         if (var1 > var2) {
            View var4 = this.getChildAt(var2);
            var2 = var4.getBaseline();
            if (var2 == -1) {
               if (this.b == 0) {
                  return -1;
               } else {
                  throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
               }
            } else {
               var1 = this.c;
               if (this.d == 1) {
                  int var3 = this.f & 112;
                  if (var3 != 48) {
                     switch(var3) {
                     case 16:
                        var1 += (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.e) / 2;
                        break;
                     case 80:
                        var1 = this.getBottom() - this.getTop() - this.getPaddingBottom() - this.e;
                     }
                  }
               }

               return var1 + ((.ku)var4.getLayoutParams()).topMargin + var2;
            }
         } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
         }
      }
   }

   protected final void onDraw(Canvas var1) {
      if (this.g != null) {
         int var4 = this.d;
         byte var3 = 0;
         int var2 = 0;
         View var6;
         .ku var7;
         int var8;
         if (var4 == 1) {
            for(var8 = this.getChildCount(); var2 < var8; ++var2) {
               var6 = this.getChildAt(var2);
               if (var6 != null && var6.getVisibility() != 8 && this.s(var2)) {
                  var7 = (.ku)var6.getLayoutParams();
                  this.fU(var1, var6.getTop() - var7.topMargin - this.m);
               }
            }

            if (this.s(var8)) {
               var6 = this.getChildAt(var8 - 1);
               if (var6 == null) {
                  var2 = this.getHeight() - this.getPaddingBottom() - this.m;
               } else {
                  var7 = (.ku)var6.getLayoutParams();
                  var2 = var6.getBottom() + var7.bottomMargin;
               }

               this.fU(var1, var2);
               return;
            }
         } else {
            var4 = this.getChildCount();
            boolean var5 = .nv.a(this);

            for(var2 = var3; var2 < var4; ++var2) {
               var6 = this.getChildAt(var2);
               if (var6 != null && var6.getVisibility() != 8 && this.s(var2)) {
                  var7 = (.ku)var6.getLayoutParams();
                  if (var5) {
                     var8 = var6.getRight() + var7.rightMargin;
                  } else {
                     var8 = var6.getLeft() - var7.leftMargin - this.h;
                  }

                  this.fV(var1, var8);
               }
            }

            if (this.s(var4)) {
               var6 = this.getChildAt(var4 - 1);
               if (var6 == null) {
                  if (var5) {
                     var2 = this.getPaddingLeft();
                  } else {
                     var2 = this.getWidth() - this.getPaddingRight() - this.h;
                  }
               } else {
                  var7 = (.ku)var6.getLayoutParams();
                  if (var5) {
                     var2 = var6.getLeft() - var7.leftMargin - this.h;
                  } else {
                     var2 = var6.getRight() + var7.rightMargin;
                  }
               }

               this.fV(var1, var2);
               return;
            }
         }

      }
   }

   public final void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
      super.onInitializeAccessibilityEvent(var1);
      var1.setClassName(gKVNpqGY.LLGvyeEUdJuvy);
   }

   public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      super.onInitializeAccessibilityNodeInfo(var1);
      var1.setClassName("android.support.v7.widget.LinearLayoutCompat");
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      if (this.d == 1) {
         int var6 = this.getPaddingLeft();
         var11 = var4 - var2;
         var9 = this.getPaddingRight();
         var10 = this.getPaddingRight();
         var8 = this.getChildCount();
         var7 = this.f;
         switch(var7 & 112) {
         case 16:
            var2 = this.getPaddingTop() + (var5 - var3 - this.e) / 2;
            break;
         case 80:
            var2 = this.getPaddingTop() + var5 - var3 - this.e;
            break;
         default:
            var2 = this.getPaddingTop();
         }

         for(var4 = 0; var4 < var8; var2 = var3) {
            View var19 = this.getChildAt(var4);
            var3 = var2;
            if (var19 != null) {
               var3 = var2;
               if (var19.getVisibility() != 8) {
                  var13 = var19.getMeasuredWidth();
                  var12 = var19.getMeasuredHeight();
                  .ku var20 = (.ku)var19.getLayoutParams();
                  var5 = var20.gravity;
                  var3 = var5;
                  if (var5 < 0) {
                     var3 = 8388615 & var7;
                  }

                  switch(Gravity.getAbsoluteGravity(var3, .cfy.c(this)) & 7) {
                  case 1:
                     var3 = (var11 - var6 - var10 - var13) / 2 + var6 + var20.leftMargin - var20.rightMargin;
                     break;
                  case 5:
                     var3 = var11 - var9 - var13 - var20.rightMargin;
                     break;
                  default:
                     var3 = var20.leftMargin + var6;
                  }

                  var5 = var2;
                  if (this.s(var4)) {
                     var5 = var2 + this.m;
                  }

                  var2 = var5 + var20.topMargin;
                  a(var19, var3, var2, var13, var12);
                  var3 = var2 + var12 + var20.bottomMargin;
               }
            }

            ++var4;
         }
      } else {
         boolean var18 = .nv.a(this);
         var11 = this.getPaddingTop();
         var13 = var5 - var3;
         var8 = var13 - this.getPaddingBottom();
         int var14 = this.getPaddingBottom();
         var7 = this.getChildCount();
         var5 = this.f;
         var3 = var5 & 112;
         var1 = this.a;
         int[] var21 = this.k;
         int[] var25 = this.l;
         switch(Gravity.getAbsoluteGravity(8388615 & var5, .cfy.c(this))) {
         case 1:
            var2 = this.getPaddingLeft() + (var4 - var2 - this.e) / 2;
            break;
         case 5:
            var2 = this.getPaddingLeft() + var4 - var2 - this.e;
            break;
         default:
            var2 = this.getPaddingLeft();
         }

         byte var23;
         if (var18) {
            var5 = var7 - 1;
            var23 = -1;
         } else {
            var5 = 0;
            var23 = 1;
         }

         var9 = 0;

         for(var4 = var2; var9 < var7; ++var9) {
            int var17 = var5 + var23 * var9;
            View var22 = this.getChildAt(var17);
            if (var22 != null && var22.getVisibility() != 8) {
               int var15 = var22.getMeasuredWidth();
               int var16 = var22.getMeasuredHeight();
               .ku var24 = (.ku)var22.getLayoutParams();
               if (var1 && var24.height != -1) {
                  var2 = var22.getBaseline();
               } else {
                  var2 = -1;
               }

               var12 = var24.gravity;
               var10 = var12;
               if (var12 < 0) {
                  var10 = var3;
               }

               switch(var10 & 112) {
               case 16:
                  var2 = (var13 - var11 - var14 - var16) / 2 + var11 + var24.topMargin - var24.bottomMargin;
                  break;
               case 48:
                  var10 = var11 + var24.topMargin;
                  if (var2 != -1) {
                     var2 = var10 + (var21[1] - var2);
                  } else {
                     var2 = var10;
                  }
                  break;
               case 80:
                  var10 = var8 - var16 - var24.bottomMargin;
                  if (var2 != -1) {
                     var12 = var22.getMeasuredHeight();
                     var2 = var10 - (var25[2] - (var12 - var2));
                  } else {
                     var2 = var10;
                  }
                  break;
               default:
                  var2 = var11;
               }

               var10 = var4;
               if (this.s(var17)) {
                  var10 = var4 + this.h;
               }

               var4 = var10 + var24.leftMargin;
               a(var22, var4, var2, var15, var16);
               var4 += var15 + var24.rightMargin;
            }
         }
      }

   }

   protected void onMeasure(int var1, int var2) {
      float var3;
      float var4;
      int var7;
      int var8;
      int var9;
      boolean var10;
      int var11;
      int var12;
      int var13;
      boolean var15;
      boolean var16;
      int var17;
      int var18;
      int var19;
      int var20;
      int var21;
      int var22;
      boolean var24;
      View var26;
      int var37;
      boolean var39;
      .ku var40;
      View var41;
      if (this.d == 1) {
         this.e = 0;
         var17 = this.getChildCount();
         var7 = MeasureSpec.getMode(var1);
         var9 = MeasureSpec.getMode(var2);
         var18 = this.b;
         var24 = this.j;
         var19 = 0;
         var3 = 0.0F;
         var8 = 0;
         var11 = 0;
         var16 = false;
         var12 = 0;
         int var14 = 0;
         var13 = 0;
         var10 = true;

         .ku var27;
         for(var15 = false; var19 < var17; ++var19) {
            var26 = this.getChildAt(var19);
            if (var26 != null && var26.getVisibility() != 8) {
               if (this.s(var19)) {
                  this.e += this.m;
               }

               var27 = (.ku)var26.getLayoutParams();
               var3 += var27.weight;
               if (var9 == 1073741824 && var27.height == 0 && var27.weight > 0.0F) {
                  var37 = this.e;
                  this.e = Math.max(var37, var27.topMargin + var37 + var27.bottomMargin);
                  var16 = true;
               } else {
                  if (var27.height == 0 && var27.weight > 0.0F) {
                     var27.height = -2;
                     var20 = 0;
                  } else {
                     var20 = Integer.MIN_VALUE;
                  }

                  if (var3 == 0.0F) {
                     var21 = this.e;
                  } else {
                     var21 = 0;
                  }

                  this.measureChildWithMargins(var26, var1, 0, var2, var21);
                  if (var20 != Integer.MIN_VALUE) {
                     var27.height = 0;
                  }

                  var21 = var26.getMeasuredHeight();
                  var20 = this.e;
                  this.e = Math.max(var20, var20 + var21 + var27.topMargin + var27.bottomMargin);
                  if (var24) {
                     var12 = Math.max(var21, var12);
                  }
               }

               if (var18 >= 0 && var18 == var19 + 1) {
                  this.c = this.e;
               }

               if (var19 < var18 && var27.weight > 0.0F) {
                  throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
               }

               if (var7 != 1073741824 && var27.width == -1) {
                  var39 = true;
                  var15 = true;
               } else {
                  var39 = false;
               }

               var22 = var27.leftMargin + var27.rightMargin;
               var21 = var26.getMeasuredWidth() + var22;
               var14 = Math.max(var14, var21);
               var13 = View.combineMeasuredStates(var13, var26.getMeasuredState());
               if (var10 && var27.width == -1) {
                  var10 = true;
               } else {
                  var10 = false;
               }

               if (var27.weight > 0.0F) {
                  if (var39) {
                     var21 = var22;
                  }

                  var11 = Math.max(var11, var21);
               } else {
                  if (var39) {
                     var21 = var22;
                  }

                  var8 = Math.max(var8, var21);
               }
            }
         }

         var19 = var8;
         var8 = var13;
         if (this.e > 0 && this.s(var17)) {
            this.e += this.m;
         }

         label626: {
            if (var24) {
               label620: {
                  if (var9 != Integer.MIN_VALUE) {
                     if (var9 != 0) {
                        break label620;
                     }

                     var9 = 0;
                  } else {
                     var9 = var9;
                  }

                  this.e = 0;
                  var13 = 0;

                  while(true) {
                     var18 = var9;
                     if (var13 >= var17) {
                        break label626;
                     }

                     var26 = this.getChildAt(var13);
                     if (var26 != null && var26.getVisibility() != 8) {
                        var40 = (.ku)var26.getLayoutParams();
                        var18 = this.e;
                        this.e = Math.max(var18, var18 + var12 + var40.topMargin + var40.bottomMargin);
                     }

                     ++var13;
                  }
               }
            }

            var18 = var9;
         }

         var9 = this.e + this.getPaddingTop() + this.getPaddingBottom();
         this.e = var9;
         var22 = View.resolveSizeAndState(Math.max(var9, this.getSuggestedMinimumHeight()), var2, 0);
         var9 = (16777215 & var22) - this.e;
         if (!var16 && (var9 == 0 || !(var3 > 0.0F))) {
            var11 = Math.max(var19, var11);
            if (var24 && var18 != 1073741824) {
               for(var9 = 0; var9 < var17; ++var9) {
                  var26 = this.getChildAt(var9);
                  if (var26 != null && var26.getVisibility() != 8 && ((.ku)var26.getLayoutParams()).weight > 0.0F) {
                     var26.measure(MeasureSpec.makeMeasureSpec(var26.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(var12, 1073741824));
                  }
               }
            }

            var9 = var11;
         } else {
            var4 = this.i;
            if (var4 > 0.0F) {
               var3 = var4;
            }

            this.e = 0;
            var37 = 0;
            var11 = var9;
            var9 = var19;

            while(true) {
               if (var37 >= var17) {
                  this.e += this.getPaddingTop() + this.getPaddingBottom();
                  break;
               }

               var41 = this.getChildAt(var37);
               var21 = var9;
               var20 = var14;
               var19 = var11;
               var12 = var8;
               var4 = var3;
               boolean var32 = var10;
               if (var41.getVisibility() != 8) {
                  var40 = (.ku)var41.getLayoutParams();
                  float var5 = var40.weight;
                  var13 = var11;
                  var12 = var8;
                  var4 = var3;
                  if (var5 > 0.0F) {
                     float var6 = (float)var11 * var5 / var3;
                     var4 = var3 - var5;
                     var13 = (int)var6;
                     var20 = getChildMeasureSpec(var1, this.getPaddingLeft() + this.getPaddingRight() + var40.leftMargin + var40.rightMargin, var40.width);
                     if (var40.height == 0 && var18 == 1073741824) {
                        if (var13 > 0) {
                           var12 = var13;
                        } else {
                           var12 = 0;
                        }

                        var41.measure(var20, MeasureSpec.makeMeasureSpec(var12, 1073741824));
                     } else {
                        var19 = var13 + var41.getMeasuredHeight();
                        var12 = var19;
                        if (var19 < 0) {
                           var12 = 0;
                        }

                        var41.measure(var20, MeasureSpec.makeMeasureSpec(var12, 1073741824));
                     }

                     var12 = View.combineMeasuredStates(var8, var41.getMeasuredState() & -256);
                     var13 = var11 - var13;
                  }

                  var8 = var40.leftMargin + var40.rightMargin;
                  var11 = var41.getMeasuredWidth() + var8;
                  var20 = Math.max(var14, var11);
                  if (var7 == 1073741824 || var40.width != -1) {
                     var8 = var11;
                  }

                  var21 = Math.max(var9, var8);
                  boolean var30;
                  if (var10 && var40.width == -1) {
                     var30 = true;
                  } else {
                     var30 = false;
                  }

                  var9 = this.e;
                  this.e = Math.max(var9, var41.getMeasuredHeight() + var9 + var40.topMargin + var40.bottomMargin);
                  var19 = var13;
                  var32 = var30;
               }

               ++var37;
               var9 = var21;
               var14 = var20;
               var11 = var19;
               var8 = var12;
               var3 = var4;
               var10 = var32;
            }
         }

         if (var10 || var7 == 1073741824) {
            var9 = var14;
         }

         this.setMeasuredDimension(View.resolveSizeAndState(Math.max(var9 + this.getPaddingLeft() + this.getPaddingRight(), this.getSuggestedMinimumWidth()), var1, var8), var22);
         if (var15) {
            var7 = MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);

            for(var1 = 0; var1 < var17; ++var1) {
               var26 = this.getChildAt(var1);
               if (var26.getVisibility() != 8) {
                  var27 = (.ku)var26.getLayoutParams();
                  if (var27.width == -1) {
                     var8 = var27.height;
                     var27.height = var26.getMeasuredHeight();
                     this.measureChildWithMargins(var26, var7, 0, var2, 0);
                     var27.height = var8;
                  }
               }
            }
         }
      } else {
         this.e = 0;
         var17 = this.getChildCount();
         var7 = MeasureSpec.getMode(var1);
         var22 = MeasureSpec.getMode(var2);
         if (this.k == null || this.l == null) {
            this.k = new int[4];
            this.l = new int[4];
         }

         int[] var42 = this.k;
         int[] var43 = this.l;
         var42[3] = -1;
         var42[2] = -1;
         var42[1] = -1;
         var42[0] = -1;
         var43[3] = -1;
         var43[2] = -1;
         var43[1] = -1;
         var43[0] = -1;
         var24 = this.a;
         boolean var25 = this.j;
         var13 = 0;
         var3 = 0.0F;
         var18 = 0;
         int var35 = 0;
         var10 = true;
         boolean var36 = false;
         boolean var33 = false;
         var8 = 0;
         var11 = 0;

         .ku var28;
         int var31;
         boolean var34;
         for(var9 = 0; var18 < var17; var8 = var37) {
            View var29 = this.getChildAt(var18);
            if (var29 != null && var29.getVisibility() != 8) {
               if (this.s(var18)) {
                  this.e += this.h;
               }

               label643: {
                  var28 = (.ku)var29.getLayoutParams();
                  var3 += var28.weight;
                  if (var7 == 1073741824) {
                     if (var28.width == 0) {
                        if (var28.weight > 0.0F) {
                           this.e += var28.leftMargin + var28.rightMargin;
                           if (var24) {
                              var37 = MeasureSpec.makeMeasureSpec(0, 0);
                              var29.measure(var37, var37);
                           } else {
                              var36 = true;
                           }
                           break label643;
                        }

                        var37 = 1073741824;
                     } else {
                        var37 = 1073741824;
                     }
                  } else {
                     var37 = var7;
                  }

                  if (var28.width == 0 && var28.weight > 0.0F) {
                     var28.width = -2;
                     var19 = 0;
                  } else {
                     var19 = Integer.MIN_VALUE;
                  }

                  if (var3 == 0.0F) {
                     var20 = this.e;
                  } else {
                     var20 = 0;
                  }

                  this.measureChildWithMargins(var29, var1, var20, var2, 0);
                  if (var19 != Integer.MIN_VALUE) {
                     var28.width = 0;
                  }

                  var19 = var29.getMeasuredWidth();
                  if (var37 == 1073741824) {
                     this.e += var28.leftMargin + var19 + var28.rightMargin;
                  } else {
                     var37 = this.e;
                     this.e = Math.max(var37, var37 + var19 + var28.leftMargin + var28.rightMargin);
                  }

                  if (var25) {
                     var35 = Math.max(var19, var35);
                  }
               }

               if (var22 != 1073741824 && var28.height == -1) {
                  var16 = true;
                  var33 = true;
               } else {
                  var16 = false;
               }

               var19 = var28.topMargin + var28.bottomMargin;
               var20 = var29.getMeasuredHeight() + var19;
               var21 = View.combineMeasuredStates(var9, var29.getMeasuredState());
               if (var24) {
                  int var23 = var29.getBaseline();
                  if (var23 != -1) {
                     if (var28.gravity < 0) {
                        var9 = this.f;
                     } else {
                        var9 = var28.gravity;
                     }

                     var9 = (var9 & 112) >> 4 >> 1;
                     var42[var9] = Math.max(var42[var9], var23);
                     var43[var9] = Math.max(var43[var9], var20 - var23);
                  }
               }

               var13 = Math.max(var13, var20);
               if (var10 && var28.height == -1) {
                  var34 = true;
               } else {
                  var34 = false;
               }

               if (var28.weight > 0.0F) {
                  if (!var16) {
                     var19 = var20;
                  }

                  var11 = Math.max(var11, var19);
                  var31 = var8;
                  var8 = var11;
               } else {
                  if (!var16) {
                     var19 = var20;
                  }

                  var31 = Math.max(var8, var19);
                  var8 = var11;
               }

               var39 = var36;
               var36 = var34;
               var37 = var31;
               var11 = var8;
               var9 = var21;
            } else {
               var37 = var8;
               var39 = var36;
               var36 = var10;
            }

            ++var18;
            var10 = var36;
            var36 = var39;
         }

         if (this.e > 0 && this.s(var17)) {
            this.e += this.h;
         }

         label447: {
            var18 = var42[1];
            var37 = var18;
            if (var18 == -1) {
               if (var42[0] == -1 && var42[2] == -1) {
                  if (var42[3] == -1) {
                     break label447;
                  }

                  var37 = -1;
               } else {
                  var37 = -1;
               }
            }

            var13 = Math.max(var13, Math.max(var42[3], Math.max(var42[0], Math.max(var37, var42[2]))) + Math.max(var43[3], Math.max(var43[0], Math.max(var43[1], var43[2]))));
         }

         View var44;
         label629: {
            if (var25) {
               label623: {
                  if (var7 != Integer.MIN_VALUE) {
                     if (var7 != 0) {
                        break label623;
                     }

                     var37 = 0;
                     var7 = 0;
                  } else {
                     var37 = var7;
                  }

                  this.e = 0;

                  for(var18 = 0; var18 < var17; ++var18) {
                     var44 = this.getChildAt(var18);
                     if (var44 != null && var44.getVisibility() != 8) {
                        var28 = (.ku)var44.getLayoutParams();
                        var19 = this.e;
                        this.e = Math.max(var19, var19 + var35 + var28.leftMargin + var28.rightMargin);
                     }
                  }

                  var18 = var37;
                  var37 = var7;
                  break label629;
               }
            }

            var18 = var7;
            var37 = var7;
         }

         var7 = this.e + this.getPaddingLeft() + this.getPaddingRight();
         this.e = var7;
         var20 = View.resolveSizeAndState(Math.max(var7, this.getSuggestedMinimumWidth()), var1, 0);
         var19 = (16777215 & var20) - this.e;
         if (var36 || var19 != 0 && var3 > 0.0F) {
            var4 = this.i;
            if (var4 > 0.0F) {
               var3 = var4;
            }

            var42[3] = -1;
            var42[2] = -1;
            var42[1] = -1;
            var42[0] = -1;
            var43[3] = -1;
            var43[2] = -1;
            var43[1] = -1;
            var43[0] = -1;
            this.e = 0;
            var11 = var8;
            var7 = var9;
            byte var38 = 0;
            var8 = var19;
            var13 = -1;
            var9 = var11;
            var19 = var38;
            var11 = var17;
            var12 = var20;

            while(true) {
               if (var19 >= var11) {
                  var35 = var11;
                  this.e += this.getPaddingLeft() + this.getPaddingRight();
                  var11 = var42[1];
                  var8 = var11;
                  if (var11 == -1) {
                     if (var42[0] == -1 && var42[2] == -1) {
                        if (var42[3] == -1) {
                           var11 = var7;
                           var7 = var13;
                           var8 = var35;
                           break;
                        }

                        var8 = -1;
                     } else {
                        var8 = -1;
                     }
                  }

                  var13 = Math.max(var13, Math.max(var42[3], Math.max(var42[0], Math.max(var8, var42[2]))) + Math.max(var43[3], Math.max(var43[0], Math.max(var43[1], var43[2]))));
                  var11 = var7;
                  var8 = var35;
                  var7 = var13;
                  break;
               }

               var44 = this.getChildAt(var19);
               if (var44 != null && var44.getVisibility() != 8) {
                  .ku var45 = (.ku)var44.getLayoutParams();
                  var4 = var45.weight;
                  if (var4 > 0.0F) {
                     var17 = (int)((float)var8 * var4 / var3);
                     var21 = getChildMeasureSpec(var2, this.getPaddingTop() + this.getPaddingBottom() + var45.topMargin + var45.bottomMargin, var45.height);
                     if (var45.width == 0 && var37 == 1073741824) {
                        if (var17 > 0) {
                           var35 = var17;
                        } else {
                           var35 = 0;
                        }

                        var44.measure(MeasureSpec.makeMeasureSpec(var35, 1073741824), var21);
                     } else {
                        var20 = var17 + var44.getMeasuredWidth();
                        var35 = var20;
                        if (var20 < 0) {
                           var35 = 0;
                        }

                        var44.measure(MeasureSpec.makeMeasureSpec(var35, 1073741824), var21);
                     }

                     var7 = View.combineMeasuredStates(var7, var44.getMeasuredState() & -16777216);
                     var3 -= var4;
                     var8 -= var17;
                  }

                  if (var18 == 1073741824) {
                     this.e += var44.getMeasuredWidth() + var45.leftMargin + var45.rightMargin;
                  } else {
                     var35 = this.e;
                     this.e = Math.max(var35, var44.getMeasuredWidth() + var35 + var45.leftMargin + var45.rightMargin);
                  }

                  if (var22 != 1073741824 && var45.height == -1) {
                     var15 = true;
                  } else {
                     var15 = false;
                  }

                  var21 = var45.topMargin + var45.bottomMargin;
                  var20 = var44.getMeasuredHeight() + var21;
                  var17 = Math.max(var13, var20);
                  if (!var15) {
                     var13 = var20;
                  } else {
                     var13 = var21;
                  }

                  var35 = Math.max(var9, var13);
                  if (var10 && var45.height == -1) {
                     var34 = true;
                  } else {
                     var34 = false;
                  }

                  if (var24) {
                     var13 = var44.getBaseline();
                     if (var13 != -1) {
                        if (var45.gravity < 0) {
                           var31 = this.f;
                        } else {
                           var31 = var45.gravity;
                        }

                        var31 = (var31 & 112) >> 4 >> 1;
                        var42[var31] = Math.max(var42[var31], var13);
                        var43[var31] = Math.max(var43[var31], var20 - var13);
                     }
                  }

                  var10 = var34;
                  var13 = var17;
                  var9 = var35;
               }

               ++var19;
            }
         } else {
            var8 = Math.max(var8, var11);
            if (var25 && var37 != 1073741824) {
               for(var7 = 0; var7 < var17; ++var7) {
                  var26 = this.getChildAt(var7);
                  if (var26 != null && var26.getVisibility() != 8 && ((.ku)var26.getLayoutParams()).weight > 0.0F) {
                     var26.measure(MeasureSpec.makeMeasureSpec(var35, 1073741824), MeasureSpec.makeMeasureSpec(var26.getMeasuredHeight(), 1073741824));
                  }
               }
            }

            var35 = var8;
            var8 = var17;
            var11 = var9;
            var12 = var20;
            var7 = var13;
            var9 = var35;
         }

         var13 = var7;
         if (!var10) {
            var13 = var7;
            if (var22 != 1073741824) {
               var13 = var9;
            }
         }

         this.setMeasuredDimension(var12 | var11 & -16777216, View.resolveSizeAndState(Math.max(var13 + this.getPaddingTop() + this.getPaddingBottom(), this.getSuggestedMinimumHeight()), var2, var11 << 16));
         if (var33) {
            var7 = MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824);

            for(var2 = 0; var2 < var8; ++var2) {
               var41 = this.getChildAt(var2);
               if (var41.getVisibility() != 8) {
                  var40 = (.ku)var41.getLayoutParams();
                  if (var40.height == -1) {
                     var9 = var40.width;
                     var40.width = var41.getMeasuredWidth();
                     this.measureChildWithMargins(var41, var1, 0, var7, 0);
                     var40.width = var9;
                  }
               }
            }
         }
      }

   }

   public final void r(int var1) {
      if (this.d != var1) {
         this.d = var1;
         this.requestLayout();
      }

   }

   protected final boolean s(int var1) {
      boolean var3 = false;
      if (var1 == 0) {
         return (this.n & 1) != 0;
      } else if (var1 == this.getChildCount()) {
         return (this.n & 4) != 0;
      } else {
         boolean var2 = var3;
         if ((this.n & 2) != 0) {
            --var1;

            while(true) {
               if (var1 < 0) {
                  var2 = var3;
                  break;
               }

               if (this.getChildAt(var1).getVisibility() != 8) {
                  var2 = true;
                  break;
               }

               --var1;
            }
         }

         return var2;
      }
   }

   public final boolean shouldDelayChildPressedState() {
      return false;
   }

   public final void t() {
      this.a = false;
   }
}
