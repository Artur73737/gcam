package androidx.percentlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;

@Deprecated
public class PercentRelativeLayout extends RelativeLayout {
   private final .cpb a = new .cpb(this);

   public PercentRelativeLayout(Context var1) {
      super(var1);
   }

   public PercentRelativeLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public PercentRelativeLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public final .cpc a(AttributeSet var1) {
      return new .cpc(this.getContext(), var1);
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      .cpb var7 = this.a;
      var3 = var7.a.getChildCount();

      for(var2 = 0; var2 < var3; ++var2) {
         LayoutParams var8 = var7.a.getChildAt(var2).getLayoutParams();
         if (var8 instanceof .cpc) {
            .coz var6 = ((.cpc)var8).a();
            if (var6 != null) {
               if (var8 instanceof MarginLayoutParams) {
                  MarginLayoutParams var9 = (MarginLayoutParams)var8;
                  var6.b(var9);
                  var9.leftMargin = var6.j.leftMargin;
                  var9.topMargin = var6.j.topMargin;
                  var9.rightMargin = var6.j.rightMargin;
                  var9.bottomMargin = var6.j.bottomMargin;
                  .cfk.g(var9, .cfk.c(var6.j));
                  .cfk.f(var9, .cfk.b(var6.j));
               } else {
                  var6.b(var8);
               }
            }
         }
      }

   }

   protected final void onMeasure(int var1, int var2) {
      .cpb var10 = this.a;
      int var9 = MeasureSpec.getSize(var1) - var10.a.getPaddingLeft() - var10.a.getPaddingRight();
      int var6 = MeasureSpec.getSize(var2) - var10.a.getPaddingTop() - var10.a.getPaddingBottom();
      int var8 = var10.a.getChildCount();
      int var7 = 0;
      int var4 = 0;

      while(true) {
         boolean var5 = true;
         .coz var12;
         if (var4 >= var8) {
            super.onMeasure(var1, var2);
            .cpb var17 = this.a;
            var8 = var17.a.getChildCount();

            boolean var14;
            for(var14 = false; var7 < var8; var14 = var5) {
               View var19 = var17.a.getChildAt(var7);
               LayoutParams var16 = var19.getLayoutParams();
               var5 = var14;
               if (var16 instanceof .cpc) {
                  var12 = ((.cpc)var16).a();
                  var5 = var14;
                  if (var12 != null) {
                     boolean var15 = var14;
                     if ((var19.getMeasuredWidthAndState() & -16777216) == 16777216) {
                        var15 = var14;
                        if (var12.a >= 0.0F) {
                           var15 = var14;
                           if (var12.j.width == -2) {
                              var16.width = -2;
                              var15 = true;
                           }
                        }
                     }

                     var5 = var15;
                     if ((var19.getMeasuredHeightAndState() & -16777216) == 16777216) {
                        var5 = var15;
                        if (var12.b >= 0.0F) {
                           var5 = var15;
                           if (var12.j.height == -2) {
                              var16.height = -2;
                              var5 = true;
                           }
                        }
                     }
                  }
               }

               ++var7;
            }

            if (var14) {
               super.onMeasure(var1, var2);
            }

            return;
         }

         View var11 = var10.a.getChildAt(var4);
         LayoutParams var13 = var11.getLayoutParams();
         if (var13 instanceof .cpc) {
            var12 = ((.cpc)var13).a();
            if (var12 != null) {
               if (var13 instanceof MarginLayoutParams) {
                  label88: {
                     MarginLayoutParams var18 = (MarginLayoutParams)var13;
                     var12.a(var18, var9, var6);
                     var12.j.leftMargin = var18.leftMargin;
                     var12.j.topMargin = var18.topMargin;
                     var12.j.rightMargin = var18.rightMargin;
                     var12.j.bottomMargin = var18.bottomMargin;
                     .cfk.g(var12.j, .cfk.c(var18));
                     .cfk.f(var12.j, .cfk.b(var18));
                     float var3 = var12.c;
                     if (var3 >= 0.0F) {
                        var18.leftMargin = Math.round((float)var9 * var3);
                     }

                     var3 = var12.d;
                     if (var3 >= 0.0F) {
                        var18.topMargin = Math.round((float)var6 * var3);
                     }

                     var3 = var12.e;
                     if (var3 >= 0.0F) {
                        var18.rightMargin = Math.round((float)var9 * var3);
                     }

                     var3 = var12.f;
                     if (var3 >= 0.0F) {
                        var18.bottomMargin = Math.round((float)var6 * var3);
                     }

                     var3 = var12.g;
                     if (var3 >= 0.0F) {
                        .cfk.g(var18, Math.round((float)var9 * var3));
                     } else {
                        var5 = false;
                     }

                     var3 = var12.h;
                     if (var3 >= 0.0F) {
                        .cfk.f(var18, Math.round((float)var9 * var3));
                     } else if (!var5) {
                        break label88;
                     }

                     if (var11 != null) {
                        .cfk.d(var18, .cfy.c(var11));
                     }
                  }
               } else {
                  var12.a(var13, var9, var6);
               }
            }
         }

         ++var4;
      }
   }
}
