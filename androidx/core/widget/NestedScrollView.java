package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.FrameLayout.LayoutParams;
import java.util.ArrayList;
import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;

public class NestedScrollView extends FrameLayout implements .cfq, .cfn {
   private static final float c = (float)(Math.log(0.78D) / Math.log(0.9D));
   private static final .cin d = new .cin();
   private static final int[] e = new int[]{16843130};
   private final .cfr A;
   private final .cfo B;
   private float C;
   public EdgeEffect a;
   public EdgeEffect b;
   private final float f;
   private long g;
   private final Rect h;
   private OverScroller i;
   private int j;
   private boolean k;
   private boolean l;
   private View m;
   private boolean n;
   private VelocityTracker o;
   private boolean p;
   private boolean q;
   private int r;
   private int s;
   private int t;
   private int u;
   private final int[] v;
   private final int[] w;
   private int x;
   private int y;
   private .cip z;

   public NestedScrollView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public NestedScrollView(Context var1, AttributeSet var2) {
      this(var1, var2, 2130969838);
   }

   public NestedScrollView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.h = new Rect();
      this.k = true;
      this.l = false;
      this.m = null;
      this.n = false;
      this.q = true;
      this.u = -1;
      this.v = new int[2];
      this.w = new int[2];
      this.a = .cik.c(var1, var2);
      this.b = .cik.c(var1, var2);
      this.f = var1.getResources().getDisplayMetrics().density * 160.0F * 386.0878F * 0.84F;
      this.i = new OverScroller(this.getContext());
      this.setFocusable(true);
      this.setDescendantFocusability(262144);
      this.setWillNotDraw(false);
      ViewConfiguration var5 = ViewConfiguration.get(this.getContext());
      this.r = var5.getScaledTouchSlop();
      this.s = var5.getScaledMinimumFlingVelocity();
      this.t = var5.getScaledMaximumFlingVelocity();
      TypedArray var6 = var1.obtainStyledAttributes(var2, e, var3, 0);
      boolean var4 = var6.getBoolean(0, false);
      if (var4 != this.p) {
         this.p = var4;
         this.requestLayout();
      }

      var6.recycle();
      this.A = new .cfr();
      this.B = new .cfo(this);
      this.setNestedScrollingEnabled(true);
      .cgm.g(this, d);
   }

   private final void A(int var1, int var2, int[] var3) {
      int var4 = this.getScrollY();
      this.scrollBy(0, var1);
      var4 = this.getScrollY() - var4;
      if (var3 != null) {
         var3[1] += var4;
      }

      this.B.g(0, var4, 0, var1 - var4, (int[])null, var2, var3);
   }

   private final void B(MotionEvent var1) {
      int var2 = var1.getActionIndex();
      if (var1.getPointerId(var2) == this.u) {
         byte var4;
         if (var2 == 0) {
            var4 = 1;
         } else {
            var4 = 0;
         }

         this.j = (int)var1.getY(var4);
         this.u = var1.getPointerId(var4);
         VelocityTracker var3 = this.o;
         if (var3 != null) {
            var3.clear();
         }
      }

   }

   private final void C() {
      VelocityTracker var1 = this.o;
      if (var1 != null) {
         var1.recycle();
         this.o = null;
      }

   }

   private final void D(boolean var1) {
      if (var1) {
         this.o(2, 1);
      } else {
         this.i(1);
      }

      this.y = this.getScrollY();
      .cfx.g(this);
   }

   private final void E(View var1) {
      var1.getDrawingRect(this.h);
      this.offsetDescendantRectToMyCoords(var1, this.h);
      int var2 = this.a(this.h);
      if (var2 != 0) {
         this.scrollBy(0, var2);
      }

   }

   private final boolean F(View var1) {
      return !this.H(var1, 0, this.getHeight());
   }

   private static boolean G(View var0, View var1) {
      if (var0 == var1) {
         return true;
      } else {
         ViewParent var2 = var0.getParent();
         return var2 instanceof ViewGroup && G((View)var2, var1);
      }
   }

   private final boolean H(View var1, int var2, int var3) {
      var1.getDrawingRect(this.h);
      this.offsetDescendantRectToMyCoords(var1, this.h);
      return this.h.bottom + var2 >= this.getScrollY() && this.h.top - var2 <= this.getScrollY() + var3;
   }

   private final boolean I(int var1, int var2, int var3) {
      int var4 = this.getHeight();
      int var9 = this.getScrollY();
      int var10 = var4 + var9;
      ArrayList var17 = this.getFocusables(2);
      int var11 = var17.size();
      View var15 = null;
      int var7 = 0;

      boolean var6;
      for(boolean var8 = false; var7 < var11; var8 = var6) {
         View var16 = (View)var17.get(var7);
         var4 = var16.getTop();
         int var12 = var16.getBottom();
         View var14 = var15;
         var6 = var8;
         if (var2 < var12) {
            var14 = var15;
            var6 = var8;
            if (var4 < var3) {
               boolean var5;
               if (var2 < var4 && var12 < var3) {
                  var5 = true;
               } else {
                  var5 = false;
               }

               if (var15 == null) {
                  var14 = var16;
                  var6 = var5;
               } else {
                  label87: {
                     boolean var18;
                     if (var1 == 33) {
                        if (var4 >= var15.getTop()) {
                           var18 = false;
                        } else {
                           var18 = true;
                        }
                     } else if (var12 > var15.getBottom()) {
                        var18 = true;
                     } else {
                        var18 = false;
                     }

                     if (var8) {
                        var14 = var15;
                        var6 = var8;
                        if (!var5) {
                           break label87;
                        }

                        var14 = var15;
                        var6 = var8;
                        if (!var18) {
                           break label87;
                        }
                     } else {
                        if (var5) {
                           var14 = var16;
                           var6 = true;
                           break label87;
                        }

                        var14 = var15;
                        var6 = var8;
                        if (!var18) {
                           break label87;
                        }
                     }

                     var14 = var16;
                     var6 = var8;
                  }
               }
            }
         }

         ++var7;
         var15 = var14;
      }

      Object var19 = var15;
      if (var15 == null) {
         var19 = this;
      }

      boolean var13;
      if (var2 >= var9 && var3 <= var10) {
         var13 = false;
      } else {
         if (var1 == 33) {
            var2 -= var9;
         } else {
            var2 = var3 - var10;
         }

         this.w(var2, 0, 1, true);
         var13 = true;
      }

      if (var19 != this.findFocus()) {
         ((View)var19).requestFocus(var1);
      }

      return var13;
   }

   private final boolean J(EdgeEffect var1, int var2) {
      if (var2 > 0) {
         return true;
      } else {
         float var10 = .cik.a(var1);
         float var11 = (float)this.getHeight();
         double var5 = Math.log((double)((float)Math.abs(-var2) * 0.35F / (this.f * 0.015F)));
         double var3 = (double)c;
         float var9 = this.f;
         Double.isNaN(var3);
         Double.isNaN(var3);
         double var7 = var3 / (-1.0D + var3);
         var3 = (double)(var9 * 0.015F);
         var5 = Math.exp(var7 * var5);
         Double.isNaN(var3);
         return (float)(var3 * var5) < var10 * var11;
      }
   }

   private final boolean K(MotionEvent var1) {
      boolean var2;
      if (.cik.a(this.a) != 0.0F) {
         .cik.b(this.a, 0.0F, var1.getX() / (float)this.getWidth());
         var2 = true;
      } else {
         var2 = false;
      }

      if (.cik.a(this.b) != 0.0F) {
         .cik.b(this.b, 0.0F, 1.0F - var1.getX() / (float)this.getWidth());
         return true;
      } else {
         return var2;
      }
   }

   private final void L(int var1, int var2, boolean var3) {
      if (this.getChildCount() != 0) {
         if (AnimationUtils.currentAnimationTimeMillis() - this.g > 250L) {
            View var10 = this.getChildAt(0);
            LayoutParams var11 = (LayoutParams)var10.getLayoutParams();
            int var6 = var10.getHeight();
            int var7 = var11.topMargin;
            int var8 = var11.bottomMargin;
            int var9 = this.getHeight();
            int var4 = this.getPaddingTop();
            int var5 = this.getPaddingBottom();
            var1 = this.getScrollY();
            var2 = Math.max(0, Math.min(var2 + var1, Math.max(0, var6 + var7 + var8 - (var9 - var4 - var5))));
            this.i.startScroll(this.getScrollX(), var1, 0, var2 - var1, 250);
            this.D(var3);
         } else {
            if (!this.i.isFinished()) {
               this.x();
            }

            this.scrollBy(var1, var2);
         }

         this.g = AnimationUtils.currentAnimationTimeMillis();
      }
   }

   private static int v(int var0, int var1, int var2) {
      if (var1 < var2 && var0 >= 0) {
         return var1 + var0 > var2 ? var2 - var1 : var0;
      } else {
         return 0;
      }
   }

   private final int w(int var1, int var2, int var3, boolean var4) {
      if (var3 == 1) {
         this.o(2, 1);
      }

      int var9;
      int var10;
      if (this.k(0, var1, this.w, this.v, var3)) {
         var10 = this.w[1];
         var9 = this.v[1];
         var10 = var1 - var10;
         var1 = var9;
         var9 = var10;
      } else {
         var9 = var1;
         var1 = 0;
      }

      int var13 = this.getScrollY();
      int var12 = this.b();
      var10 = this.getOverScrollMode();
      boolean var16;
      if ((var10 == 0 || var10 == 1 && this.b() > 0) && !var4) {
         var16 = true;
      } else {
         var16 = false;
      }

      boolean var11;
      if (this.q(var9, 0, var13, var12) && !this.n(var3)) {
         var11 = true;
      } else {
         var11 = false;
      }

      int var14 = this.getScrollY() - var13;
      int[] var15 = this.w;
      var15[1] = 0;
      this.p(var14, var9 - var14, this.v, var3, var15);
      var14 = this.v[1];
      var9 -= this.w[1];
      var13 += var9;
      float var5;
      float var6;
      float var7;
      EdgeEffect var17;
      if (var13 < 0) {
         if (var16) {
            var17 = this.a;
            var9 = -var9;
            var7 = (float)this.getHeight();
            var5 = (float)var2;
            var6 = (float)this.getWidth();
            .cik.b(var17, (float)var9 / var7, var5 / var6);
            if (!this.b.isFinished()) {
               this.b.onRelease();
            }
         }
      } else if (var13 > var12 && var16) {
         var17 = this.b;
         var7 = (float)var9;
         float var8 = (float)this.getHeight();
         var5 = (float)var2;
         var6 = (float)this.getWidth();
         .cik.b(var17, var7 / var8, 1.0F - var5 / var6);
         if (!this.a.isFinished()) {
            this.a.onRelease();
         }
      }

      if (this.a.isFinished() && this.b.isFinished()) {
         if (var11 && var3 == 0) {
            this.o.clear();
         }
      } else {
         .cfx.g(this);
      }

      if (var3 == 1) {
         this.i(1);
         this.a.onRelease();
         this.b.onRelease();
      }

      return var1 + var14;
   }

   private final void x() {
      this.i.abortAnimation();
      this.i(1);
   }

   private final void y() {
      this.u = -1;
      this.n = false;
      this.C();
      this.i(0);
      this.a.onRelease();
      this.b.onRelease();
   }

   private final void z() {
      if (this.o == null) {
         this.o = VelocityTracker.obtain();
      }

   }

   protected final int a(Rect var1) {
      int var2 = this.getChildCount();
      byte var5 = 0;
      if (var2 == 0) {
         return 0;
      } else {
         int var6 = this.getHeight();
         int var3 = this.getScrollY();
         int var4 = var3 + var6;
         int var7 = this.getVerticalFadingEdgeLength();
         var2 = var3;
         if (var1.top > 0) {
            var2 = var3 + var7;
         }

         View var9 = this.getChildAt(0);
         LayoutParams var8 = (LayoutParams)var9.getLayoutParams();
         if (var1.bottom < var9.getHeight() + var8.topMargin + var8.bottomMargin) {
            var3 = var4 - var7;
         } else {
            var3 = var4;
         }

         if (var1.bottom > var3 && var1.top > var2) {
            if (var1.height() > var6) {
               var2 = var1.top - var2;
            } else {
               var2 = var1.bottom - var3;
            }

            var2 = Math.min(var2, var9.getBottom() + var8.bottomMargin - var4);
         } else if (var1.top < var2 && var1.bottom < var3) {
            if (var1.height() > var6) {
               var2 = -(var3 - var1.bottom);
            } else {
               var2 = -(var2 - var1.top);
            }

            var2 = Math.max(var2, -this.getScrollY());
         } else {
            var2 = var5;
         }

         return var2;
      }
   }

   public final void addView(View var1) {
      if (this.getChildCount() <= 0) {
         super.addView(var1);
      } else {
         throw new IllegalStateException("ScrollView can host only one direct child");
      }
   }

   public final void addView(View var1, int var2) {
      if (this.getChildCount() <= 0) {
         super.addView(var1, var2);
      } else {
         throw new IllegalStateException("ScrollView can host only one direct child");
      }
   }

   public final void addView(View var1, int var2, android.view.ViewGroup.LayoutParams var3) {
      if (this.getChildCount() <= 0) {
         super.addView(var1, var2, var3);
      } else {
         throw new IllegalStateException("ScrollView can host only one direct child");
      }
   }

   public final void addView(View var1, android.view.ViewGroup.LayoutParams var2) {
      if (this.getChildCount() <= 0) {
         super.addView(var1, var2);
      } else {
         throw new IllegalStateException("ScrollView can host only one direct child");
      }
   }

   public final int b() {
      if (this.getChildCount() > 0) {
         View var1 = this.getChildAt(0);
         LayoutParams var2 = (LayoutParams)var1.getLayoutParams();
         return Math.max(0, var1.getHeight() + var2.topMargin + var2.bottomMargin - (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()));
      } else {
         return 0;
      }
   }

   public final void c(int var1) {
      if (this.getChildCount() > 0) {
         this.i.fling(this.getScrollX(), this.getScrollY(), 0, var1, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
         this.D(true);
      }

   }

   public final int computeHorizontalScrollExtent() {
      return super.computeHorizontalScrollExtent();
   }

   public final int computeHorizontalScrollOffset() {
      return super.computeHorizontalScrollOffset();
   }

   public final int computeHorizontalScrollRange() {
      return super.computeHorizontalScrollRange();
   }

   public final void computeScroll() {
      if (!this.i.isFinished()) {
         this.i.computeScrollOffset();
         int var5 = this.i.getCurrY();
         int var4 = var5 - this.y;
         int var6 = this.getHeight();
         float var1;
         float var2;
         int var3;
         if (var4 > 0 && .cik.a(this.a) != 0.0F) {
            var2 = (float)(-var4);
            var1 = (float)var6;
            var3 = Math.round((float)(-var6) / 4.0F * .cik.b(this.a, var2 * 4.0F / var1, 0.5F));
            if (var3 != var4) {
               this.a.finish();
            }

            var3 = var4 - var3;
         } else {
            var3 = var4;
            if (var4 < 0) {
               var3 = var4;
               if (.cik.a(this.b) != 0.0F) {
                  var2 = (float)var4;
                  var1 = (float)var6;
                  var3 = Math.round(var1 / 4.0F * .cik.b(this.b, var2 * 4.0F / var1, 0.5F));
                  if (var3 != var4) {
                     this.b.finish();
                  }

                  var3 = var4 - var3;
               }
            }
         }

         this.y = var5;
         int[] var7 = this.w;
         var7[1] = 0;
         this.k(0, var3, var7, (int[])null, 1);
         var4 = var3 - this.w[1];
         var5 = this.b();
         var3 = var4;
         if (var4 != 0) {
            var3 = this.getScrollY();
            this.q(var4, this.getScrollX(), var3, var5);
            var3 = this.getScrollY() - var3;
            int[] var8 = this.w;
            var8[1] = 0;
            var7 = this.v;
            var4 -= var3;
            this.p(var3, var4, var7, 1, var8);
            var3 = var4 - this.w[1];
         }

         if (var3 != 0) {
            var4 = this.getOverScrollMode();
            if (var4 == 0 || var4 == 1 && var5 > 0) {
               if (var3 < 0) {
                  if (this.a.isFinished()) {
                     this.a.onAbsorb((int)this.i.getCurrVelocity());
                  }
               } else if (this.b.isFinished()) {
                  this.b.onAbsorb((int)this.i.getCurrVelocity());
               }
            }

            this.x();
         }

         if (!this.i.isFinished()) {
            .cfx.g(this);
         } else {
            this.i(1);
         }
      }
   }

   public final int computeVerticalScrollExtent() {
      return super.computeVerticalScrollExtent();
   }

   public final int computeVerticalScrollOffset() {
      return Math.max(0, super.computeVerticalScrollOffset());
   }

   public final int computeVerticalScrollRange() {
      int var1 = this.getChildCount();
      int var3 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
      if (var1 == 0) {
         return var3;
      } else {
         View var4 = this.getChildAt(0);
         LayoutParams var5 = (LayoutParams)var4.getLayoutParams();
         var1 = var4.getBottom() + var5.bottomMargin;
         int var2 = this.getScrollY();
         var3 = Math.max(0, var1 - var3);
         if (var2 < 0) {
            var1 -= var2;
         } else if (var2 > var3) {
            return var1 + (var2 - var3);
         }

         return var1;
      }
   }

   public final void d(View var1, int var2, int var3, int[] var4, int var5) {
      this.k(var2, var3, var4, (int[])null, var5);
   }

   public final boolean dispatchKeyEvent(KeyEvent var1) {
      return super.dispatchKeyEvent(var1) || this.l(var1);
   }

   public final boolean dispatchNestedFling(float var1, float var2, boolean var3) {
      return this.B.c(var1, var2, var3);
   }

   public final boolean dispatchNestedPreFling(float var1, float var2) {
      return this.B.d(var1, var2);
   }

   public final boolean dispatchNestedPreScroll(int var1, int var2, int[] var3, int[] var4) {
      return this.k(var1, var2, var3, var4, 0);
   }

   public final boolean dispatchNestedScroll(int var1, int var2, int var3, int var4, int[] var5) {
      return this.B.f(var1, var2, var3, var4, var5);
   }

   public final void draw(Canvas var1) {
      super.draw(var1);
      int var9 = this.getScrollY();
      boolean var11 = this.a.isFinished();
      byte var6 = 0;
      int var2;
      int var3;
      int var4;
      int var5;
      int var7;
      int var8;
      int var10;
      if (!var11) {
         var10 = var1.save();
         var2 = this.getWidth();
         var8 = this.getHeight();
         var7 = Math.min(0, var9);
         if (.cio.a(this)) {
            var2 -= this.getPaddingLeft() + this.getPaddingRight();
            var3 = this.getPaddingLeft();
         } else {
            var3 = 0;
         }

         var5 = var8;
         var4 = var7;
         if (.cio.a(this)) {
            var5 = var8 - (this.getPaddingTop() + this.getPaddingBottom());
            var4 = var7 + this.getPaddingTop();
         }

         var1.translate((float)var3, (float)var4);
         this.a.setSize(var2, var5);
         if (this.a.draw(var1)) {
            .cfx.g(this);
         }

         var1.restoreToCount(var10);
      }

      if (!this.b.isFinished()) {
         var10 = var1.save();
         var2 = this.getWidth();
         var7 = this.getHeight();
         var8 = Math.max(this.b(), var9) + var7;
         if (.cio.a(this)) {
            var2 -= this.getPaddingLeft() + this.getPaddingRight();
            var3 = this.getPaddingLeft();
         } else {
            var3 = var6;
         }

         var5 = var8;
         var4 = var7;
         if (.cio.a(this)) {
            var4 = var7 - (this.getPaddingTop() + this.getPaddingBottom());
            var5 = var8 - this.getPaddingBottom();
         }

         var1.translate((float)(var3 - var2), (float)var5);
         var1.rotate(180.0F, (float)var2, 0.0F);
         this.b.setSize(var2, var4);
         if (this.b.draw(var1)) {
            .cfx.g(this);
         }

         var1.restoreToCount(var10);
      }

   }

   public final void e(View var1, int var2, int var3, int var4, int var5, int var6) {
      this.A(var5, var6, (int[])null);
   }

   public final void f(View var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      this.A(var5, var6, var7);
   }

   public final void g(View var1, View var2, int var3, int var4) {
      this.A.b(var3, var4);
      this.o(2, var4);
   }

   protected final float getBottomFadingEdgeStrength() {
      if (this.getChildCount() == 0) {
         return 0.0F;
      } else {
         View var5 = this.getChildAt(0);
         LayoutParams var4 = (LayoutParams)var5.getLayoutParams();
         int var1 = this.getVerticalFadingEdgeLength();
         int var2 = this.getHeight();
         int var3 = this.getPaddingBottom();
         var2 = var5.getBottom() + var4.bottomMargin - this.getScrollY() - (var2 - var3);
         return var2 < var1 ? (float)var2 / (float)var1 : 1.0F;
      }
   }

   public final int getNestedScrollAxes() {
      return this.A.a();
   }

   protected final float getTopFadingEdgeStrength() {
      if (this.getChildCount() == 0) {
         return 0.0F;
      } else {
         int var1 = this.getVerticalFadingEdgeLength();
         int var2 = this.getScrollY();
         return var2 < var1 ? (float)var2 / (float)var1 : 1.0F;
      }
   }

   public final void h(View var1, int var2) {
      this.A.c(var2);
      this.i(var2);
   }

   public final boolean hasNestedScrollingParent() {
      return this.n(0);
   }

   public final void i(int var1) {
      this.B.b(var1);
   }

   public final boolean isNestedScrollingEnabled() {
      return this.B.a;
   }

   public final boolean j(int var1) {
      View var5 = this.findFocus();
      View var4 = var5;
      if (var5 == this) {
         var4 = null;
      }

      var5 = FocusFinder.getInstance().findNextFocus(this, var4, var1);
      int var2 = (int)((float)this.getHeight() * 0.5F);
      if (var5 != null && this.H(var5, var2, this.getHeight())) {
         var5.getDrawingRect(this.h);
         this.offsetDescendantRectToMyCoords(var5, this.h);
         this.w(this.a(this.h), 0, 1, true);
         var5.requestFocus(var1);
      } else {
         if (var1 == 33 && this.getScrollY() < var2) {
            var2 = this.getScrollY();
         } else if (var1 == 130 && this.getChildCount() > 0) {
            var5 = this.getChildAt(0);
            LayoutParams var6 = (LayoutParams)var5.getLayoutParams();
            var2 = Math.min(var5.getBottom() + var6.bottomMargin - (this.getScrollY() + this.getHeight() - this.getPaddingBottom()), var2);
         }

         if (var2 == 0) {
            return false;
         }

         int var3 = var2;
         if (var1 != 130) {
            var3 = -var2;
         }

         this.w(var3, 0, 1, true);
      }

      if (var4 != null && var4.isFocused() && this.F(var4)) {
         var1 = this.getDescendantFocusability();
         this.setDescendantFocusability(131072);
         this.requestFocus();
         this.setDescendantFocusability(var1);
      }

      return true;
   }

   public final boolean k(int var1, int var2, int[] var3, int[] var4, int var5) {
      return this.B.e(var1, var2, var3, var4, var5);
   }

   public final boolean l(KeyEvent var1) {
      this.h.setEmpty();
      int var3 = this.getChildCount();
      short var2 = 130;
      boolean var4 = false;
      if (var3 > 0) {
         View var6 = this.getChildAt(0);
         LayoutParams var5 = (LayoutParams)var6.getLayoutParams();
         if (var6.getHeight() + var5.topMargin + var5.bottomMargin > this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()) {
            if (var1.getAction() == 0) {
               switch(var1.getKeyCode()) {
               case 19:
                  if (var1.isAltPressed()) {
                     var4 = this.m(33);
                  } else {
                     var4 = this.j(33);
                  }
                  break;
               case 20:
                  if (var1.isAltPressed()) {
                     var4 = this.m(130);
                  } else {
                     var4 = this.j(130);
                  }
                  break;
               case 62:
                  if (var1.isShiftPressed()) {
                     var2 = 33;
                  }

                  this.r(var2);
                  return false;
               case 92:
                  return this.m(33);
               case 93:
                  return this.m(130);
               case 122:
                  this.r(33);
                  return false;
               case 123:
                  this.r(130);
                  return false;
               }
            }

            return var4;
         }
      }

      if (this.isFocused() && var1.getKeyCode() != 4) {
         View var8 = this.findFocus();
         View var7 = var8;
         if (var8 == this) {
            var7 = null;
         }

         var7 = FocusFinder.getInstance().findNextFocus(this, var7, 130);
         if (var7 != null && var7 != this && var7.requestFocus(130)) {
            return true;
         }
      }

      return false;
   }

   public final boolean m(int var1) {
      int var3 = this.getHeight();
      this.h.top = 0;
      this.h.bottom = var3;
      if (var1 == 130) {
         int var2 = this.getChildCount();
         if (var2 > 0) {
            View var5 = this.getChildAt(var2 - 1);
            LayoutParams var4 = (LayoutParams)var5.getLayoutParams();
            this.h.bottom = var5.getBottom() + var4.bottomMargin + this.getPaddingBottom();
            Rect var6 = this.h;
            var6.top = var6.bottom - var3;
         }
      }

      return this.I(var1, this.h.top, this.h.bottom);
   }

   protected final void measureChild(View var1, int var2, int var3) {
      android.view.ViewGroup.LayoutParams var4 = var1.getLayoutParams();
      var1.measure(getChildMeasureSpec(var2, this.getPaddingLeft() + this.getPaddingRight(), var4.width), MeasureSpec.makeMeasureSpec(0, 0));
   }

   protected final void measureChildWithMargins(View var1, int var2, int var3, int var4, int var5) {
      MarginLayoutParams var6 = (MarginLayoutParams)var1.getLayoutParams();
      var1.measure(getChildMeasureSpec(var2, this.getPaddingLeft() + this.getPaddingRight() + var6.leftMargin + var6.rightMargin + var3, var6.width), MeasureSpec.makeMeasureSpec(var6.topMargin + var6.bottomMargin, 0));
   }

   public final boolean n(int var1) {
      return this.B.h(var1);
   }

   public final boolean o(int var1, int var2) {
      return this.B.i(var1, var2);
   }

   public final void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.l = false;
   }

   public final boolean onGenericMotionEvent(MotionEvent var1) {
      if (var1.getAction() == 8 && !this.n) {
         float var2;
         int var5;
         if (.ccb.e(var1, 2)) {
            var2 = var1.getAxisValue(9);
            var5 = (int)var1.getX();
         } else if (.ccb.e(var1, 4194304)) {
            var2 = var1.getAxisValue(26);
            var5 = this.getWidth() / 2;
         } else {
            var2 = 0.0F;
            var5 = 0;
         }

         if (var2 != 0.0F) {
            float var4 = this.C;
            float var3 = var4;
            if (var4 == 0.0F) {
               TypedValue var8 = new TypedValue();
               Context var7 = this.getContext();
               if (!var7.getTheme().resolveAttribute(16842829, var8, true)) {
                  throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
               }

               var3 = var8.getDimension(var7.getResources().getDisplayMetrics());
               this.C = var3;
            }

            boolean var6 = .ccb.e(var1, 8194);
            this.w(-((int)(var2 * var3)), var5, 1, var6);
            return true;
         }
      }

      return false;
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      int var3 = var1.getAction();
      boolean var6 = true;
      boolean var5 = true;
      int var2 = var3;
      if (var3 == 2) {
         if (this.n) {
            return true;
         }

         var2 = 2;
      }

      switch(var2 & 255) {
      case 0:
         var3 = (int)var1.getY();
         var2 = (int)var1.getX();
         if (this.getChildCount() > 0) {
            int var4 = this.getScrollY();
            View var7 = this.getChildAt(0);
            if (var3 >= var7.getTop() - var4 && var3 < var7.getBottom() - var4 && var2 >= var7.getLeft() && var2 < var7.getRight()) {
               this.j = var3;
               this.u = var1.getPointerId(0);
               VelocityTracker var9 = this.o;
               if (var9 == null) {
                  this.o = VelocityTracker.obtain();
               } else {
                  var9.clear();
               }

               this.o.addMovement(var1);
               this.i.computeScrollOffset();
               if (!this.K(var1) && this.i.isFinished()) {
                  var5 = false;
               }

               this.n = var5;
               this.o(2, 0);
               break;
            }
         }

         if (!this.K(var1)) {
            if (!this.i.isFinished()) {
               var5 = var6;
            } else {
               var5 = false;
            }
         } else {
            var5 = var6;
         }

         this.n = var5;
         this.C();
         break;
      case 1:
      case 3:
         this.n = false;
         this.u = -1;
         this.C();
         if (this.i.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.b())) {
            .cfx.g(this);
         }

         this.i(0);
         break;
      case 2:
         var3 = this.u;
         if (var3 != -1) {
            var2 = var1.findPointerIndex(var3);
            if (var2 == -1) {
               Log.e("NestedScrollView", .c.aK(var3, DzzpnVggahPIX.XVIxoZTKes, " in onInterceptTouchEvent"));
            } else {
               var2 = (int)var1.getY(var2);
               if (Math.abs(var2 - this.j) > this.r && (2 & this.getNestedScrollAxes()) == 0) {
                  this.n = true;
                  this.j = var2;
                  this.z();
                  this.o.addMovement(var1);
                  this.x = 0;
                  ViewParent var8 = this.getParent();
                  if (var8 != null) {
                     var8.requestDisallowInterceptTouchEvent(true);
                  }
               }
            }
         }
      case 4:
      case 5:
      default:
         break;
      case 6:
         this.B(var1);
      }

      return this.n;
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      var2 = 0;
      this.k = false;
      View var8 = this.m;
      if (var8 != null && G(var8, this)) {
         this.E(this.m);
      }

      this.m = null;
      if (!this.l) {
         if (this.z != null) {
            this.scrollTo(this.getScrollX(), this.z.a);
            this.z = null;
         }

         if (this.getChildCount() > 0) {
            var8 = this.getChildAt(0);
            LayoutParams var9 = (LayoutParams)var8.getLayoutParams();
            var2 = var8.getMeasuredHeight() + var9.topMargin + var9.bottomMargin;
         }

         int var6 = this.getPaddingTop();
         int var7 = this.getPaddingBottom();
         var4 = this.getScrollY();
         var2 = v(var4, var5 - var3 - var6 - var7, var2);
         if (var2 != var4) {
            this.scrollTo(this.getScrollX(), var2);
         }
      }

      this.scrollTo(this.getScrollX(), this.getScrollY());
      this.l = true;
   }

   protected final void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      if (this.p) {
         if (MeasureSpec.getMode(var2) != 0) {
            if (this.getChildCount() > 0) {
               View var4 = this.getChildAt(0);
               LayoutParams var5 = (LayoutParams)var4.getLayoutParams();
               var2 = var4.getMeasuredHeight();
               int var3 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - var5.topMargin - var5.bottomMargin;
               if (var2 < var3) {
                  var4.measure(getChildMeasureSpec(var1, this.getPaddingLeft() + this.getPaddingRight() + var5.leftMargin + var5.rightMargin, var5.width), MeasureSpec.makeMeasureSpec(var3, 1073741824));
               }
            }

         }
      }
   }

   public final boolean onNestedFling(View var1, float var2, float var3, boolean var4) {
      if (!var4) {
         this.dispatchNestedFling(0.0F, var3, true);
         this.c((int)var3);
         return true;
      } else {
         return false;
      }
   }

   public final boolean onNestedPreFling(View var1, float var2, float var3) {
      return this.dispatchNestedPreFling(var2, var3);
   }

   public final void onNestedPreScroll(View var1, int var2, int var3, int[] var4) {
      this.d(var1, var2, var3, var4, 0);
   }

   public final void onNestedScroll(View var1, int var2, int var3, int var4, int var5) {
      this.A(var5, 0, (int[])null);
   }

   public final void onNestedScrollAccepted(View var1, View var2, int var3) {
      this.g(var1, var2, var3, 0);
   }

   protected final void onOverScrolled(int var1, int var2, boolean var3, boolean var4) {
      super.scrollTo(var1, var2);
   }

   protected final boolean onRequestFocusInDescendants(int var1, Rect var2) {
      int var3;
      if (var1 == 2) {
         var3 = 130;
      } else {
         var3 = var1;
         if (var1 == 1) {
            var3 = 33;
         }
      }

      View var4;
      if (var2 == null) {
         var4 = FocusFinder.getInstance().findNextFocus(this, (View)null, var3);
      } else {
         var4 = FocusFinder.getInstance().findNextFocusFromRect(this, var2, var3);
      }

      if (var4 == null) {
         return false;
      } else {
         return this.F(var4) ? false : var4.requestFocus(var3, var2);
      }
   }

   protected final void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof .cip)) {
         super.onRestoreInstanceState(var1);
      } else {
         .cip var2 = (.cip)var1;
         super.onRestoreInstanceState(var2.getSuperState());
         this.z = var2;
         this.requestLayout();
      }
   }

   protected final Parcelable onSaveInstanceState() {
      .cip var1 = new .cip(super.onSaveInstanceState());
      var1.a = this.getScrollY();
      return var1;
   }

   protected final void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      View var5 = this.findFocus();
      if (var5 != null && this != var5) {
         if (this.H(var5, 0, var4)) {
            var5.getDrawingRect(this.h);
            this.offsetDescendantRectToMyCoords(var5, this.h);
            var1 = this.a(this.h);
            if (var1 != 0) {
               if (this.q) {
                  this.s(var1);
                  return;
               }

               this.scrollBy(0, var1);
            }
         }

      }
   }

   public final boolean onStartNestedScroll(View var1, View var2, int var3) {
      return this.t(var1, var2, var3, 0);
   }

   public final void onStopNestedScroll(View var1) {
      this.h(var1, 0);
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      this.z();
      int var7 = var1.getActionMasked();
      int var6 = var7;
      if (var7 == 0) {
         this.x = 0;
         var6 = 0;
      }

      MotionEvent var10 = MotionEvent.obtain(var1);
      float var3 = (float)this.x;
      float var2 = 0.0F;
      var10.offsetLocation(0.0F, var3);
      ViewParent var11;
      VelocityTracker var13;
      switch(var6) {
      case 0:
         if (this.getChildCount() == 0) {
            return false;
         }

         if (this.n) {
            var11 = this.getParent();
            if (var11 != null) {
               var11.requestDisallowInterceptTouchEvent(true);
            }
         }

         if (!this.i.isFinished()) {
            this.x();
         }

         var7 = (int)var1.getY();
         var6 = var1.getPointerId(0);
         this.j = var7;
         this.u = var6;
         this.o(2, 0);
         break;
      case 1:
         var13 = this.o;
         var13.computeCurrentVelocity(1000, (float)this.t);
         var6 = (int)var13.getYVelocity(this.u);
         if (Math.abs(var6) >= this.s) {
            if (.cik.a(this.a) != 0.0F) {
               if (this.J(this.a, var6)) {
                  this.a.onAbsorb(var6);
               } else {
                  this.c(-var6);
               }
            } else if (.cik.a(this.b) != 0.0F) {
               EdgeEffect var14 = this.b;
               var6 = -var6;
               if (this.J(var14, var6)) {
                  this.b.onAbsorb(var6);
               } else {
                  this.c(var6);
               }
            } else {
               var6 = -var6;
               var2 = (float)var6;
               if (!this.dispatchNestedPreFling(0.0F, var2)) {
                  this.dispatchNestedFling(0.0F, var2, true);
                  this.c(var6);
               }
            }
         } else if (this.i.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.b())) {
            .cfx.g(this);
         }

         this.y();
         break;
      case 2:
         int var9 = var1.findPointerIndex(this.u);
         if (var9 == -1) {
            StringBuilder var12 = new StringBuilder();
            var12.append("Invalid pointerId=");
            var12.append(this.u);
            var12.append(" in onTouchEvent");
            Log.e("NestedScrollView", var12.toString());
         } else {
            int var8 = (int)var1.getY(var9);
            var7 = this.j - var8;
            float var4 = var1.getX(var9) / (float)this.getWidth();
            float var5 = (float)this.getHeight();
            var3 = .cik.a(this.a);
            var5 = (float)var7 / var5;
            if (var3 != 0.0F) {
               var3 = -.cik.b(this.a, -var5, var4);
               var2 = var3;
               if (.cik.a(this.a) == 0.0F) {
                  this.a.onRelease();
                  var2 = var3;
               }
            } else if (.cik.a(this.b) != 0.0F) {
               var3 = .cik.b(this.b, var5, 1.0F - var4);
               var2 = var3;
               if (.cik.a(this.b) == 0.0F) {
                  this.b.onRelease();
                  var2 = var3;
               }
            }

            var6 = Math.round(var2 * (float)this.getHeight());
            if (var6 != 0) {
               this.invalidate();
            }

            var7 -= var6;
            var6 = var7;
            if (!this.n) {
               var6 = var7;
               if (Math.abs(var7) > this.r) {
                  var11 = this.getParent();
                  if (var11 != null) {
                     var11.requestDisallowInterceptTouchEvent(true);
                  }

                  this.n = true;
                  if (var7 > 0) {
                     var6 = var7 - this.r;
                  } else {
                     var6 = var7 + this.r;
                  }
               }
            }

            if (this.n) {
               var6 = this.w(var6, (int)var1.getX(var9), 0, false);
               this.j = var8 - var6;
               this.x += var6;
            }
         }
         break;
      case 3:
         if (this.n && this.getChildCount() > 0 && this.i.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.b())) {
            .cfx.g(this);
         }

         this.y();
      case 4:
      default:
         break;
      case 5:
         var6 = var1.getActionIndex();
         this.j = (int)var1.getY(var6);
         this.u = var1.getPointerId(var6);
         break;
      case 6:
         this.B(var1);
         this.j = (int)var1.getY(var1.findPointerIndex(this.u));
      }

      var13 = this.o;
      if (var13 != null) {
         var13.addMovement(var10);
      }

      var10.recycle();
      return true;
   }

   public final void p(int var1, int var2, int[] var3, int var4, int[] var5) {
      this.B.g(0, var1, 0, var2, var3, var4, var5);
   }

   final boolean q(int var1, int var2, int var3, int var4) {
      this.getOverScrollMode();
      super.computeHorizontalScrollRange();
      super.computeHorizontalScrollExtent();
      this.computeVerticalScrollRange();
      super.computeVerticalScrollExtent();
      boolean var6;
      if (var2 > 0) {
         var6 = true;
      } else if (var2 < 0) {
         var6 = true;
      } else {
         var6 = false;
      }

      var1 += var3;
      boolean var5;
      if (var1 > var4) {
         var5 = true;
      } else if (var1 < 0) {
         var5 = true;
         var4 = 0;
      } else {
         var4 = var1;
         var5 = false;
      }

      if (var5 && !this.n(1)) {
         this.i.springBack(0, var4, 0, 0, 0, this.b());
      }

      super.scrollTo(0, var4);
      return var6 || var5;
   }

   public final void r(int var1) {
      int var2 = this.getHeight();
      if (var1 == 130) {
         this.h.top = this.getScrollY() + var2;
         int var3 = this.getChildCount();
         if (var3 > 0) {
            View var5 = this.getChildAt(var3 - 1);
            LayoutParams var4 = (LayoutParams)var5.getLayoutParams();
            var3 = var5.getBottom() + var4.bottomMargin + this.getPaddingBottom();
            if (this.h.top + var2 > var3) {
               this.h.top = var3 - var2;
            }
         }
      } else {
         this.h.top = this.getScrollY() - var2;
         if (this.h.top < 0) {
            this.h.top = 0;
         }
      }

      Rect var6 = this.h;
      var6.bottom = var6.top + var2;
      this.I(var1, this.h.top, this.h.bottom);
   }

   public final void requestChildFocus(View var1, View var2) {
      if (!this.k) {
         this.E(var2);
      } else {
         this.m = var2;
      }

      super.requestChildFocus(var1, var2);
   }

   public final boolean requestChildRectangleOnScreen(View var1, Rect var2, boolean var3) {
      var2.offset(var1.getLeft() - var1.getScrollX(), var1.getTop() - var1.getScrollY());
      int var4 = this.a(var2);
      boolean var5;
      if (var4 != 0) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (var5) {
         if (var3) {
            this.scrollBy(0, var4);
         } else {
            this.s(var4);
         }
      }

      return var5;
   }

   public final void requestDisallowInterceptTouchEvent(boolean var1) {
      if (var1) {
         this.C();
      }

      super.requestDisallowInterceptTouchEvent(var1);
   }

   public final void requestLayout() {
      this.k = true;
      super.requestLayout();
   }

   public final void s(int var1) {
      this.L(0, var1, false);
   }

   public final void scrollTo(int var1, int var2) {
      if (this.getChildCount() > 0) {
         View var16 = this.getChildAt(0);
         LayoutParams var15 = (LayoutParams)var16.getLayoutParams();
         int var13 = this.getWidth();
         int var11 = this.getPaddingLeft();
         int var9 = this.getPaddingRight();
         int var12 = var16.getWidth();
         int var10 = var15.leftMargin;
         int var14 = var15.rightMargin;
         int var6 = this.getHeight();
         int var7 = this.getPaddingTop();
         int var4 = this.getPaddingBottom();
         int var5 = var16.getHeight();
         int var3 = var15.topMargin;
         int var8 = var15.bottomMargin;
         var1 = v(var1, var13 - var11 - var9, var12 + var10 + var14);
         var2 = v(var2, var6 - var7 - var4, var5 + var3 + var8);
         if (var1 != this.getScrollX() || var2 != this.getScrollY()) {
            super.scrollTo(var1, var2);
         }
      }

   }

   public final void setNestedScrollingEnabled(boolean var1) {
      this.B.a(var1);
   }

   public final boolean shouldDelayChildPressedState() {
      return true;
   }

   public final boolean startNestedScroll(int var1) {
      return this.o(var1, 0);
   }

   public final void stopNestedScroll() {
      this.i(0);
   }

   public final boolean t(View var1, View var2, int var3, int var4) {
      return (var3 & 2) != 0;
   }

   public final void u(int var1) {
      this.L(-this.getScrollX(), var1 - this.getScrollY(), true);
   }
}
