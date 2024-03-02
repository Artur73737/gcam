package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppBarLayout$BaseBehavior extends .oiq {
   public int a;
   public boolean b;
   public .oik c;
   private int e;
   private ValueAnimator f;
   private .oij g;
   private WeakReference h;

   public AppBarLayout$BaseBehavior() {
   }

   public AppBarLayout$BaseBehavior(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   private final void T(CoordinatorLayout var1, AppBarLayout var2) {
      int var8 = var2.e() + var2.getPaddingTop();
      int var9 = this.I() - var8;
      int var10 = var2.getChildCount();
      int var3 = 0;

      int var4;
      int var5;
      int var6;
      int var7;
      View var11;
      while(true) {
         if (var3 >= var10) {
            var3 = -1;
            break;
         }

         var11 = var2.getChildAt(var3);
         var7 = var11.getTop();
         var6 = var11.getBottom();
         .oil var13 = (.oil)var11.getLayoutParams();
         var5 = var7;
         var4 = var6;
         if (V(var13.a, 32)) {
            var5 = var7 - var13.topMargin;
            var4 = var6 + var13.bottomMargin;
         }

         var6 = -var9;
         if (var5 <= var6 && var4 >= var6) {
            break;
         }

         ++var3;
      }

      if (var3 >= 0) {
         var11 = var2.getChildAt(var3);
         .oil var12 = (.oil)var11.getLayoutParams();
         var7 = var12.a;
         if ((var7 & 17) == 17) {
            var4 = -var11.getTop();
            var5 = -var11.getBottom();
            if (var3 == 0 && .cfx.p(var2) && .cfx.p(var11)) {
               var4 -= var2.e();
            }

            if (V(var7, 2)) {
               var3 = var5 + .cfx.b(var11);
            } else if (V(var7, 5)) {
               var3 = .cfx.b(var11) + var5;
               if (var9 < var3) {
                  var4 = var3;
                  var3 = var5;
               }
            } else {
               var3 = var5;
            }

            var6 = var4;
            var5 = var3;
            if (V(var7, 32)) {
               var6 = var4 + var12.topMargin;
               var5 = var3 - var12.bottomMargin;
            }

            if (var9 >= (var5 + var6) / 2) {
               var5 = var6;
            }

            this.W(var1, var2, .cbu.b(var5 + var8, -var2.f(), 0));
            return;
         }
      }

   }

   private final void U(CoordinatorLayout var1, AppBarLayout var2) {
      .cgm.f(var1, .chr.m.a());
      .cgm.f(var1, .chr.n.a());
      if (var2.f() != 0) {
         int var4 = var1.getChildCount();
         boolean var5 = false;
         int var3 = 0;

         View var7;
         while(true) {
            if (var3 >= var4) {
               var7 = null;
               break;
            }

            var7 = var1.getChildAt(var3);
            if (((.cbc)var7.getLayoutParams()).a instanceof AppBarLayout$ScrollingViewBehavior) {
               break;
            }

            ++var3;
         }

         if (var7 == null) {
            return;
         }

         var4 = var2.getChildCount();

         for(var3 = 0; var3 < var4; ++var3) {
            if (((.oil)var2.getChildAt(var3).getLayoutParams()).a != 0) {
               if (.cgj.a(var1) == null) {
                  .cgm.g(var1, new .oig(this));
               }

               var4 = this.I();
               var3 = -var2.f();
               boolean var6 = true;
               if (var4 != var3) {
                  Y(var1, var2, .chr.m, false);
                  var5 = true;
               }

               if (this.I() != 0) {
                  if (var7.canScrollVertically(-1)) {
                     var3 = -var2.b();
                     if (var3 != 0) {
                        .cgm.i(var1, .chr.n, new .oih(this, var1, var2, var7, var3));
                        var5 = var6;
                     }
                  } else {
                     Y(var1, var2, .chr.n, true);
                     var5 = var6;
                  }
               }

               this.b = var5;
               return;
            }
         }
      }

   }

   private static boolean V(int var0, int var1) {
      return (var0 & var1) == var1;
   }

   private final void W(CoordinatorLayout var1, AppBarLayout var2, int var3) {
      int var5 = Math.abs(this.I() - var3);
      float var4 = Math.abs(0.0F);
      if (var4 > 0.0F) {
         var5 = Math.round((float)var5 / var4 * 1000.0F) * 3;
      } else {
         var5 = (int)(((float)var5 / (float)var2.getHeight() + 1.0F) * 150.0F);
      }

      int var6 = this.I();
      if (var6 == var3) {
         ValueAnimator var8 = this.f;
         if (var8 != null && var8.isRunning()) {
            this.f.cancel();
         }

      } else {
         ValueAnimator var7 = this.f;
         if (var7 == null) {
            var7 = new ValueAnimator();
            this.f = var7;
            var7.setInterpolator(.oia.e);
            this.f.addUpdateListener(new .ooo(this, var1, var2, 1));
         } else {
            var7.cancel();
         }

         this.f.setDuration((long)Math.min(var5, 600));
         this.f.setIntValues(new int[]{var6, var3});
         this.f.start();
      }
   }

   private static final View X(CoordinatorLayout var0) {
      int var2 = var0.getChildCount();

      for(int var1 = 0; var1 < var2; ++var1) {
         View var3 = var0.getChildAt(var1);
         if (var3 instanceof .cfn || var3 instanceof AbsListView || var3 instanceof ScrollView) {
            return var3;
         }
      }

      return null;
   }

   private static final void Y(CoordinatorLayout var0, AppBarLayout var1, .chr var2, boolean var3) {
      .cgm.i(var0, var2, new .oii(var1, var3));
   }

   private static final void Z(CoordinatorLayout var0, AppBarLayout var1, int var2, int var3, boolean var4) {
      int var8 = Math.abs(var2);
      int var7 = var1.getChildCount();
      byte var6 = 0;
      int var5 = 0;

      View var10;
      Object var11;
      while(true) {
         var11 = null;
         if (var5 >= var7) {
            var10 = null;
            break;
         }

         var10 = var1.getChildAt(var5);
         if (var8 >= var10.getTop() && var8 <= var10.getBottom()) {
            break;
         }

         ++var5;
      }

      boolean var9;
      label79: {
         if (var10 != null) {
            var5 = ((.oil)var10.getLayoutParams()).a;
            if ((var5 & 1) != 0) {
               var7 = .cfx.b(var10);
               var9 = true;
               if (var3 > 0 && (var5 & 12) != 0) {
                  if (-var2 < var10.getBottom() - var7 - var1.e()) {
                     var9 = false;
                  }
                  break label79;
               }

               if ((var5 & 2) != 0 && -var2 >= var10.getBottom() - var7 - var1.e()) {
                  break label79;
               }
            }
         }

         var9 = false;
      }

      if (var1.e) {
         var9 = var1.l(X(var0));
      }

      var9 = var1.k(var9);
      if (!var4) {
         if (!var9) {
            return;
         }

         ArrayList var12 = var0.h.g(var1);
         if (var12 == null) {
            var12 = (ArrayList)var11;
         } else {
            var12 = new ArrayList(var12);
         }

         Object var14 = var12;
         if (var12 == null) {
            var14 = Collections.emptyList();
         }

         var3 = ((List)var14).size();
         var2 = var6;

         while(true) {
            if (var2 >= var3) {
               return;
            }

            .caz var13 = ((.cbc)((View)((List)var14).get(var2)).getLayoutParams()).a;
            if (var13 instanceof AppBarLayout$ScrollingViewBehavior) {
               if (((AppBarLayout$ScrollingViewBehavior)var13).d == 0) {
                  return;
               }
               break;
            }

            ++var2;
         }
      }

      if (var1.getBackground() != null) {
         var1.getBackground().jumpToCurrentState();
      }

      if (var1.getForeground() != null) {
         var1.getForeground().jumpToCurrentState();
      }

      if (var1.getStateListAnimator() != null) {
         var1.getStateListAnimator().jumpToCurrentState();
      }
   }

   // $FF: synthetic method
   public final int H(View var1) {
      return ((AppBarLayout)var1).f();
   }

   public final int I() {
      return this.R() + this.a;
   }

   final .oij K(Parcelable var1, AppBarLayout var2) {
      int var6 = this.R();
      int var5 = var2.getChildCount();
      boolean var9 = false;

      for(int var4 = 0; var4 < var5; ++var4) {
         View var11 = var2.getChildAt(var4);
         int var7 = var11.getBottom() + var6;
         if (var11.getTop() + var6 <= 0 && var7 >= 0) {
            Object var10 = var1;
            if (var1 == null) {
               var10 = .ciy.c;
            }

            .oij var12 = new .oij((Parcelable)var10);
            boolean var8;
            if (var6 == 0) {
               var8 = true;
            } else {
               var8 = false;
            }

            var12.b = var8;
            if (!var8 && -var6 >= var2.f()) {
               var8 = true;
            } else {
               var8 = false;
            }

            var12.a = var8;
            var12.e = var4;
            if (var7 == .cfx.b(var11) + var2.e()) {
               var8 = true;
            } else {
               var8 = var9;
            }

            var12.g = var8;
            float var3 = (float)var11.getHeight();
            var12.f = (float)var7 / var3;
            return var12;
         }
      }

      return null;
   }

   final void M(.oij var1, boolean var2) {
      if (this.g == null || var2) {
         this.g = var1;
      }
   }

   public final void O(CoordinatorLayout var1, AppBarLayout var2, View var3, int var4, int[] var5) {
      if (var4 != 0) {
         int var6;
         int var7;
         if (var4 < 0) {
            var7 = -var2.f();
            int var8 = var2.b();
            var8 += var7;
            var7 = var7;
            var6 = var8;
         } else {
            var7 = -var2.f();
            var6 = 0;
         }

         if (var7 != var6) {
            var5[1] = this.P(var1, var2, var4, var7, var6);
         }
      }

      if (var2.e) {
         var2.k(var2.l(var3));
      }

   }
}
