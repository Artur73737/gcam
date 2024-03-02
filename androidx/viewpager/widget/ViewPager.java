package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.List;

public class ViewPager extends ViewGroup {
   public static final int[] a = new int[]{16842931};
   private static final Interpolator f = new .ciz(2);
   private boolean A;
   private int B;
   private final Runnable C = new .nj(this, 19, (byte[])null);
   private int D = 0;
   public EdgeEffect b;
   public EdgeEffect c;
   public List d;
   public List e;
   private final ArrayList g = new ArrayList();
   private final .cvi h = new .cvi();
   private final Rect i = new Rect();
   private Scroller j;
   private final float k = -3.4028235E38F;
   private final float l = Float.MAX_VALUE;
   private boolean m;
   private boolean n;
   private boolean o;
   private int p;
   private int q;
   private int r;
   private final boolean s = true;
   private float t;
   private float u;
   private float v;
   private float w;
   private int x = -1;
   private VelocityTracker y;
   private boolean z = true;

   public ViewPager(Context var1) {
      super(var1);
      this.e(var1);
   }

   public ViewPager(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.e(var1);
   }

   private final int i() {
      return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
   }

   private final Rect j(Rect var1, View var2) {
      Rect var3 = var1;
      if (var1 == null) {
         var3 = new Rect();
      }

      if (var2 == null) {
         var3.set(0, 0, 0, 0);
         return var3;
      } else {
         var3.left = var2.getLeft();
         var3.right = var2.getRight();
         var3.top = var2.getTop();
         var3.bottom = var2.getBottom();

         ViewGroup var5;
         for(ViewParent var4 = var2.getParent(); var4 instanceof ViewGroup && var4 != this; var4 = var5.getParent()) {
            var5 = (ViewGroup)var4;
            var3.left += var5.getLeft();
            var3.right += var5.getRight();
            var3.top += var5.getTop();
            var3.bottom += var5.getBottom();
         }

         return var3;
      }
   }

   private final boolean k(int var1) {
      if (this.g.size() == 0) {
         if (this.z) {
            return false;
         } else {
            this.A = false;
            this.h(0, 0.0F);
            if (this.A) {
               return false;
            } else {
               throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
         }
      } else {
         int var6 = this.i();
         float var2;
         if (var6 > 0) {
            var2 = (float)this.getScrollX() / (float)var6;
         } else {
            var2 = 0.0F;
         }

         float var3;
         if (var6 > 0) {
            var3 = 0.0F / (float)var6;
         } else {
            var3 = 0.0F;
         }

         .cvi var10 = null;
         int var7 = 0;
         boolean var13 = true;
         int var8 = -1;
         float var4 = 0.0F;

         float var5;
         .cvi var12;
         while(true) {
            var12 = var10;
            if (var7 >= this.g.size()) {
               break;
            }

            .cvi var11 = (.cvi)this.g.get(var7);
            if (!var13) {
               int var9 = var11.b;
               ++var8;
               if (var9 != var8) {
                  var10 = this.h;
                  var10.e = var4 + 0.0F + var3;
                  var10.b = var8;
                  throw null;
               }
            }

            var4 = var11.e;
            var5 = var11.d;
            if (!var13) {
               var12 = var10;
               if (!(var2 >= var4)) {
                  break;
               }
            }

            if (var2 < var4 + 0.0F + var3 || var7 == this.g.size() - 1) {
               var12 = var11;
               break;
            }

            var8 = var11.b;
            var5 = var11.d;
            ++var7;
            var10 = var11;
            var13 = false;
         }

         var4 = (float)this.i();
         var2 = 0.0F / var4;
         var3 = (float)var1;
         var1 = var12.b;
         var4 = var3 / var4;
         var3 = var12.e;
         var5 = var12.d;
         this.A = false;
         this.h(var1, (var4 - var3) / (var2 + 0.0F));
         if (this.A) {
            return true;
         } else {
            IllegalStateException var14 = new IllegalStateException("onPageScrolled did not call superclass implementation");
            throw var14;
         }
      }
   }

   private final void l() {
      for(int var1 = 0; var1 < this.g.size(); ++var1) {
         boolean var2 = ((.cvi)this.g.get(var1)).c;
      }

   }

   public final void a(int var1) {
      if (this.D != var1) {
         this.D = var1;
         List var4 = this.d;
         if (var4 != null) {
            int var3 = var4.size();

            for(int var2 = 0; var2 < var3; ++var2) {
               .cvl var5 = (.cvl)this.d.get(var2);
               if (var5 != null) {
                  var5.a(var1);
               }
            }
         }

      }
   }

   public final void addFocusables(ArrayList var1, int var2, int var3) {
      int var5 = var1.size();
      int var4 = this.getDescendantFocusability();
      if (var4 != 393216) {
         for(var2 = 0; var2 < this.getChildCount(); ++var2) {
            if (this.getChildAt(var2).getVisibility() == 0) {
               this.f();
            }
         }

         if (var4 == 262144 && var5 != var1.size()) {
            return;
         }
      }

      if (this.isFocusable()) {
         if ((var3 & 1) != 1 || !this.isInTouchMode() || this.isFocusableInTouchMode()) {
            if (var1 != null) {
               var1.add(this);
            }

         }
      }
   }

   public final void addTouchables(ArrayList var1) {
      for(int var2 = 0; var2 < this.getChildCount(); ++var2) {
         if (this.getChildAt(var2).getVisibility() == 0) {
            this.f();
         }
      }

   }

   public final void addView(View var1, int var2, LayoutParams var3) {
      LayoutParams var6 = var3;
      if (!this.checkLayoutParams(var3)) {
         var6 = this.generateDefaultLayoutParams();
      }

      .cvj var7 = (.cvj)var6;
      boolean var5 = var7.a;
      boolean var4;
      if (var1.getClass().getAnnotation(.cvh.class) != null) {
         var4 = true;
      } else {
         var4 = false;
      }

      var7.a = var5 | var4;
      super.addView(var1, var2, var6);
   }

   public final void b(boolean var1) {
      if (this.m != var1) {
         this.m = var1;
      }

   }

   public final boolean c(int var1) {
      View var6 = this.findFocus();
      View var5;
      if (var6 == this) {
         var5 = null;
      } else if (var6 != null) {
         ViewParent var8 = var6.getParent();

         while(true) {
            if (!(var8 instanceof ViewGroup)) {
               StringBuilder var7 = new StringBuilder();
               var7.append(var6.getClass().getSimpleName());

               for(var8 = var6.getParent(); var8 instanceof ViewGroup; var8 = var8.getParent()) {
                  var7.append(" => ");
                  var7.append(var8.getClass().getSimpleName());
               }

               Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(var7.toString()));
               var5 = null;
               break;
            }

            if (var8 == this) {
               var5 = var6;
               break;
            }

            var8 = var8.getParent();
         }
      } else {
         var5 = var6;
      }

      var6 = FocusFinder.getInstance().findNextFocus(this, var5, var1);
      boolean var4 = false;
      if (var6 != null && var6 != var5) {
         int var2;
         int var3;
         if (var1 == 17) {
            var2 = this.j(this.i, var6).left;
            var3 = this.j(this.i, var5).left;
            if (var5 == null || var2 < var3) {
               var4 = var6.requestFocus();
            }
         } else if (var1 == 66) {
            var2 = this.j(this.i, var6).left;
            var3 = this.j(this.i, var5).left;
            if (var5 == null || var2 > var3) {
               var4 = var6.requestFocus();
            }
         }
      } else if (var1 != 17 && var1 != 1 && var1 != 66) {
      }

      if (var4) {
         this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(var1));
      }

      return var4;
   }

   public final boolean canScrollHorizontally(int var1) {
      return false;
   }

   protected final boolean checkLayoutParams(LayoutParams var1) {
      return var1 instanceof .cvj && super.checkLayoutParams(var1);
   }

   public final void computeScroll() {
      if (!this.j.isFinished() && this.j.computeScrollOffset()) {
         int var2 = this.getScrollX();
         int var3 = this.getScrollY();
         int var4 = this.j.getCurrX();
         int var1 = this.j.getCurrY();
         if (var2 != var4 || var3 != var1) {
            this.scrollTo(var4, var1);
            if (!this.k(var4)) {
               this.j.abortAnimation();
               this.scrollTo(0, var1);
            }
         }

         .cfx.g(this);
      } else {
         this.l();
      }
   }

   protected final boolean d(View var1, boolean var2, int var3, int var4, int var5) {
      if (var1 instanceof ViewGroup) {
         ViewGroup var11 = (ViewGroup)var1;
         int var7 = var1.getScrollX();
         int var8 = var1.getScrollY();

         for(int var6 = var11.getChildCount() - 1; var6 >= 0; --var6) {
            View var12 = var11.getChildAt(var6);
            int var9 = var4 + var7;
            if (var9 >= var12.getLeft() && var9 < var12.getRight()) {
               int var10 = var5 + var8;
               if (var10 >= var12.getTop() && var10 < var12.getBottom() && this.d(var12, true, var3, var9 - var12.getLeft(), var10 - var12.getTop())) {
                  return true;
               }
            }
         }
      }

      return var2 && var1.canScrollHorizontally(-var3);
   }

   public final boolean dispatchKeyEvent(KeyEvent var1) {
      if (!super.dispatchKeyEvent(var1)) {
         boolean var2;
         if (var1.getAction() == 0) {
            switch(var1.getKeyCode()) {
            case 21:
               if (var1.hasModifiers(2)) {
                  var2 = false;
               } else {
                  var2 = this.c(17);
               }
               break;
            case 22:
               if (var1.hasModifiers(2)) {
                  var2 = false;
               } else {
                  var2 = this.c(66);
               }
               break;
            case 61:
               if (var1.hasNoModifiers()) {
                  var2 = this.c(2);
               } else if (var1.hasModifiers(1)) {
                  var2 = this.c(1);
               } else {
                  var2 = false;
               }
               break;
            default:
               var2 = false;
            }
         } else {
            var2 = false;
         }

         if (!var2) {
            return false;
         }
      }

      return true;
   }

   public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent var1) {
      if (var1.getEventType() == 4096) {
         return super.dispatchPopulateAccessibilityEvent(var1);
      } else {
         int var3 = this.getChildCount();

         for(int var2 = 0; var2 < var3; ++var2) {
            if (this.getChildAt(var2).getVisibility() == 0) {
               this.f();
            }
         }

         return false;
      }
   }

   public final void draw(Canvas var1) {
      super.draw(var1);
      if (this.getOverScrollMode() == 0) {
         float var2;
         float var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         boolean var10;
         if (!this.b.isFinished()) {
            var6 = var1.save();
            var5 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
            var7 = this.getWidth();
            var1.rotate(270.0F);
            var4 = -var5;
            var8 = this.getPaddingTop();
            var2 = this.k;
            var3 = (float)var7;
            var1.translate((float)(var4 + var8), var2 * var3);
            this.b.setSize(var5, var7);
            var10 = this.b.draw(var1);
            var1.restoreToCount(var6);
         } else {
            var10 = false;
         }

         boolean var11 = var10;
         if (!this.c.isFinished()) {
            var5 = var1.save();
            var7 = this.getWidth();
            int var9 = this.getHeight();
            var4 = this.getPaddingTop();
            var6 = this.getPaddingBottom();
            var1.rotate(90.0F);
            var8 = -this.getPaddingTop();
            var3 = -(this.l + 1.0F);
            var2 = (float)var7;
            var1.translate((float)var8, var3 * var2);
            this.c.setSize(var9 - var4 - var6, var7);
            var11 = var10 | this.c.draw(var1);
            var1.restoreToCount(var5);
         }

         if (var11) {
            .cfx.g(this);
         }

      } else {
         this.b.finish();
         this.c.finish();
      }
   }

   final void e(Context var1) {
      this.setWillNotDraw(false);
      this.setDescendantFocusability(262144);
      this.setFocusable(true);
      this.j = new Scroller(var1, f);
      ViewConfiguration var3 = ViewConfiguration.get(var1);
      float var2 = var1.getResources().getDisplayMetrics().density;
      this.r = var3.getScaledPagingTouchSlop();
      var3.getScaledMaximumFlingVelocity();
      this.b = new EdgeEffect(var1);
      this.c = new EdgeEffect(var1);
      this.p = (int)(var2 * 16.0F);
      .cgm.g(this, new .cvk());
      if (.cfx.a(this) == 0) {
         .cfx.o(this, 1);
      }

      .cgd.n(this, new .cvg(this));
   }

   final void f() {
      if (this.g.size() > 0) {
         Object var1 = ((.cvi)this.g.get(0)).a;
         throw null;
      }
   }

   final .cvi g() {
      for(int var1 = 0; var1 < this.g.size(); ++var1) {
         .cvi var2 = (.cvi)this.g.get(var1);
         if (var2.b == 0) {
            return var2;
         }
      }

      return null;
   }

   protected final LayoutParams generateDefaultLayoutParams() {
      return new .cvj();
   }

   public final LayoutParams generateLayoutParams(AttributeSet var1) {
      return new .cvj(this.getContext(), var1);
   }

   protected final LayoutParams generateLayoutParams(LayoutParams var1) {
      return this.generateDefaultLayoutParams();
   }

   protected final int getChildDrawingOrder(int var1, int var2) {
      throw null;
   }

   protected final void h(int var1, float var2) {
      int var3 = this.B;
      byte var8 = 0;
      int var4;
      if (var3 > 0) {
         int var9 = this.getScrollX();
         var3 = this.getPaddingLeft();
         var4 = this.getPaddingRight();
         int var10 = this.getWidth();
         int var11 = this.getChildCount();

         int var5;
         for(int var6 = 0; var6 < var11; var4 = var5) {
            View var13 = this.getChildAt(var6);
            .cvj var12 = (.cvj)var13.getLayoutParams();
            int var7 = var3;
            var5 = var4;
            if (var12.a) {
               switch(var12.b & 7) {
               case 1:
                  var5 = Math.max((var10 - var13.getMeasuredWidth()) / 2, var3);
                  break;
               case 2:
               case 4:
               default:
                  var5 = var3;
                  var3 = var3;
                  break;
               case 3:
                  var7 = var13.getWidth() + var3;
                  var5 = var3;
                  var3 = var7;
                  break;
               case 5:
                  var5 = var13.getMeasuredWidth();
                  var7 = var4 + var13.getMeasuredWidth();
                  var5 = var10 - var4 - var5;
                  var4 = var7;
               }

               var5 = var5 + var9 - var13.getLeft();
               if (var5 != 0) {
                  var13.offsetLeftAndRight(var5);
               }

               var5 = var4;
               var7 = var3;
            }

            ++var6;
            var3 = var7;
         }
      }

      List var14 = this.d;
      if (var14 != null) {
         var4 = var14.size();

         for(var3 = var8; var3 < var4; ++var3) {
            .cvl var15 = (.cvl)this.d.get(var3);
            if (var15 != null) {
               var15.b(var1, var2);
            }
         }
      }

      this.A = true;
   }

   protected final void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.z = true;
   }

   protected final void onDetachedFromWindow() {
      this.removeCallbacks(this.C);
      Scroller var1 = this.j;
      if (var1 != null && !var1.isFinished()) {
         this.j.abortAnimation();
      }

      super.onDetachedFromWindow();
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      int var9 = var1.getAction() & 255;
      byte var8 = 0;
      if (var9 != 3 && var9 != 1) {
         float var2;
         if (var9 != 0) {
            if (this.n) {
               return true;
            }

            if (this.o) {
               return false;
            }

            switch(var9) {
            case 2:
               int var13 = this.x;
               if (var13 != -1) {
                  var13 = var1.findPointerIndex(var13);
                  float var5 = var1.getX(var13);
                  float var6 = var5 - this.t;
                  float var3 = Math.abs(var6);
                  float var4 = var1.getY(var13);
                  var2 = Math.abs(var4 - this.w);
                  float var7;
                  if (var6 != 0.0F) {
                     var7 = this.t;
                     if ((this.s || (!(var7 < (float)this.q) || !(var6 > 0.0F)) && (!(var7 > (float)(this.getWidth() - this.q)) || !(var6 < 0.0F))) && this.d(this, false, (int)var6, (int)var5, (int)var4)) {
                        this.t = var5;
                        this.u = var4;
                        this.o = true;
                        return false;
                     }
                  }

                  var7 = (float)this.r;
                  if (var3 > var7 && var3 * 0.5F > var2) {
                     this.n = true;
                     ViewParent var14 = this.getParent();
                     if (var14 != null) {
                        var14.requestDisallowInterceptTouchEvent(true);
                     }

                     this.a(1);
                     if (var6 > 0.0F) {
                        var2 = this.v + (float)this.r;
                     } else {
                        var2 = this.v - (float)this.r;
                     }

                     this.t = var2;
                     this.u = var4;
                     this.b(true);
                  } else if (var2 > var7) {
                     this.o = true;
                  }

                  if (this.n) {
                     var3 = this.t - var5;
                     this.t = var5;
                     var4 /= (float)this.getHeight();
                     var5 = (float)this.getWidth();
                     var2 = .cik.a(this.b);
                     var5 = var3 / var5;
                     if (var2 != 0.0F) {
                        var2 = -.cik.b(this.b, -var5, 1.0F - var4);
                     } else if (.cik.a(this.c) != 0.0F) {
                        var2 = .cik.b(this.c, var5, var4);
                     } else {
                        var2 = 0.0F;
                     }

                     var2 *= (float)this.getWidth();
                     if (!(Math.abs(var3 - var2) < 1.0E-4F)) {
                        this.getScrollX();
                        this.i();
                        .cvi var12 = (.cvi)this.g.get(0);
                        ArrayList var15 = this.g;
                        .cvi var16 = (.cvi)var15.get(var15.size() - 1);
                        if (var12.b != 0) {
                           var2 = var12.e;
                        }

                        var13 = var16.b;
                        throw null;
                     }

                     if (var2 != 0.0F) {
                        .cfx.g(this);
                     }
                  }
               }
               break;
            case 6:
               var9 = var1.getActionIndex();
               if (var1.getPointerId(var9) == this.x) {
                  if (var9 == 0) {
                     var8 = 1;
                  }

                  this.t = var1.getX(var8);
                  this.x = var1.getPointerId(var8);
                  VelocityTracker var10 = this.y;
                  if (var10 != null) {
                     var10.clear();
                  }
               }
            }
         } else {
            var2 = var1.getX();
            this.v = var2;
            this.t = var2;
            var2 = var1.getY();
            this.w = var2;
            this.u = var2;
            this.x = var1.getPointerId(0);
            this.o = false;
            this.j.computeScrollOffset();
            if (.cik.a(this.b) == 0.0F && .cik.a(this.c) == 0.0F) {
               this.l();
               this.n = false;
            } else {
               this.n = true;
               this.a(1);
               if (.cik.a(this.b) != 0.0F) {
                  .cik.b(this.b, 0.0F, 1.0F - this.u / (float)this.getHeight());
               }

               if (.cik.a(this.c) != 0.0F) {
                  .cik.b(this.c, 0.0F, this.u / (float)this.getHeight());
               }
            }
         }

         if (this.y == null) {
            this.y = VelocityTracker.obtain();
         }

         this.y.addMovement(var1);
         return this.n;
      } else {
         this.x = -1;
         this.n = false;
         this.o = false;
         VelocityTracker var11 = this.y;
         if (var11 != null) {
            var11.recycle();
            this.y = null;
         }

         this.b.onRelease();
         this.c.onRelease();
         if (this.b.isFinished()) {
            this.c.isFinished();
         }

         return false;
      }
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      int var17 = this.getChildCount();
      int var7 = this.getPaddingLeft();
      int var6 = this.getPaddingTop();
      int var9 = this.getPaddingRight();
      int var8 = this.getPaddingBottom();
      int var18 = this.getScrollX();
      int var13 = 0;
      int var12 = 0;

      while(true) {
         int var19 = var5 - var3;
         int var20 = var4 - var2;
         if (var13 >= var17) {
            for(var2 = 0; var2 < var17; ++var2) {
               View var23 = this.getChildAt(var2);
               if (var23.getVisibility() != 8 && !((.cvj)var23.getLayoutParams()).a) {
                  this.f();
               }
            }

            this.B = var12;
            if (this.z) {
               .cvi var24 = this.g();
               if (var24 != null) {
                  var2 = (int)((float)this.i() * Math.max(this.k, Math.min(var24.e, this.l)));
               } else {
                  var2 = 0;
               }

               this.l();
               this.scrollTo(var2, 0);
               this.k(var2);
            }

            this.z = false;
            return;
         }

         View var22 = this.getChildAt(var13);
         int var16 = var7;
         int var15 = var6;
         int var14 = var9;
         int var11 = var8;
         int var10 = var12;
         if (var22.getVisibility() != 8) {
            .cvj var21 = (.cvj)var22.getLayoutParams();
            var16 = var7;
            var15 = var6;
            var14 = var9;
            var11 = var8;
            var10 = var12;
            if (var21.a) {
               var14 = var21.b;
               switch(var14 & 7) {
               case 1:
                  var10 = Math.max((var20 - var22.getMeasuredWidth()) / 2, var7);
                  break;
               case 2:
               case 4:
               default:
                  var10 = var7;
                  var7 = var7;
                  break;
               case 3:
                  var11 = var22.getMeasuredWidth() + var7;
                  var10 = var7;
                  var7 = var11;
                  break;
               case 5:
                  var10 = var22.getMeasuredWidth();
                  var11 = var9 + var22.getMeasuredWidth();
                  var10 = var20 - var9 - var10;
                  var9 = var11;
               }

               switch(var14 & 112) {
               case 16:
                  var11 = Math.max((var19 - var22.getMeasuredHeight()) / 2, var6);
                  break;
               case 48:
                  var14 = var22.getMeasuredHeight() + var6;
                  var11 = var6;
                  var6 = var14;
                  break;
               case 80:
                  var11 = var22.getMeasuredHeight();
                  var14 = var8 + var22.getMeasuredHeight();
                  var11 = var19 - var8 - var11;
                  var8 = var14;
                  break;
               default:
                  var11 = var6;
                  var6 = var6;
               }

               var10 += var18;
               var22.layout(var10, var11, var22.getMeasuredWidth() + var10, var22.getMeasuredHeight() + var11);
               var10 = var12 + 1;
               var11 = var8;
               var14 = var9;
               var15 = var6;
               var16 = var7;
            }
         }

         ++var13;
         var7 = var16;
         var6 = var15;
         var9 = var14;
         var8 = var11;
         var12 = var10;
      }
   }

   protected final void onMeasure(int var1, int var2) {
      this.setMeasuredDimension(getDefaultSize(0, var1), getDefaultSize(0, var2));
      var1 = this.getMeasuredWidth();
      this.q = Math.min(var1 / 10, this.p);
      var1 = var1 - this.getPaddingLeft() - this.getPaddingRight();
      var2 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
      int var13 = this.getChildCount();
      int var9 = 0;

      while(true) {
         int var12 = 1073741824;
         int var5;
         int var6;
         View var14;
         .cvj var15;
         if (var9 >= var13) {
            MeasureSpec.makeMeasureSpec(var1, 1073741824);
            var5 = MeasureSpec.makeMeasureSpec(var2, 1073741824);
            var6 = this.getChildCount();

            for(var2 = 0; var2 < var6; ++var2) {
               var14 = this.getChildAt(var2);
               if (var14.getVisibility() != 8) {
                  var15 = (.cvj)var14.getLayoutParams();
                  if (var15 == null || !var15.a) {
                     float var4 = (float)var1;
                     float var3 = var15.c;
                     var14.measure(MeasureSpec.makeMeasureSpec((int)(var4 * 0.0F), 1073741824), var5);
                  }
               }
            }

            return;
         }

         var14 = this.getChildAt(var9);
         var6 = var1;
         var5 = var2;
         if (var14.getVisibility() != 8) {
            var15 = (.cvj)var14.getLayoutParams();
            var6 = var1;
            var5 = var2;
            if (var15 != null) {
               var6 = var1;
               var5 = var2;
               if (var15.a) {
                  var6 = var15.b;
                  var5 = var6 & 7;
                  var6 &= 112;
                  boolean var10 = true;
                  boolean var16;
                  if (var6 != 48) {
                     if (var6 == 80) {
                        var16 = true;
                     } else {
                        var16 = false;
                     }
                  } else {
                     var16 = true;
                  }

                  if (var5 != 3 && var5 != 5) {
                     var10 = false;
                  }

                  int var7 = Integer.MIN_VALUE;
                  if (var16) {
                     var7 = 1073741824;
                     var5 = Integer.MIN_VALUE;
                  } else if (var10) {
                     var5 = 1073741824;
                  } else {
                     var5 = Integer.MIN_VALUE;
                  }

                  int var8;
                  if (var15.width != -2) {
                     if (var15.width != -1) {
                        var8 = var15.width;
                        var7 = 1073741824;
                     } else {
                        var8 = var1;
                        var7 = 1073741824;
                     }
                  } else {
                     var8 = var1;
                  }

                  if (var15.height != -2) {
                     if (var15.height != -1) {
                        var5 = var15.height;
                     } else {
                        var5 = var2;
                     }
                  } else {
                     var12 = var5;
                     var5 = var2;
                  }

                  var14.measure(MeasureSpec.makeMeasureSpec(var8, var7), MeasureSpec.makeMeasureSpec(var5, var12));
                  if (var16) {
                     var5 = var2 - var14.getMeasuredHeight();
                     var6 = var1;
                  } else {
                     var6 = var1;
                     var5 = var2;
                     if (var10) {
                        var6 = var1 - var14.getMeasuredWidth();
                        var5 = var2;
                     }
                  }
               }
            }
         }

         ++var9;
         var1 = var6;
         var2 = var5;
      }
   }

   protected final boolean onRequestFocusInDescendants(int var1, Rect var2) {
      int var3 = this.getChildCount();
      byte var4;
      if ((var1 & 2) != 0) {
         var4 = 1;
         var1 = 0;
      } else {
         var1 = var3 - 1;
         var4 = -1;
         var3 = -1;
      }

      for(; var1 != var3; var1 += var4) {
         if (this.getChildAt(var1).getVisibility() == 0) {
            this.f();
         }
      }

      return false;
   }

   public final void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof .cvm)) {
         super.onRestoreInstanceState(var1);
      } else {
         .cvm var4 = (.cvm)var1;
         super.onRestoreInstanceState(var4.d);
         int var2 = var4.a;
         Parcelable var3 = var4.b;
         ClassLoader var5 = var4.e;
      }
   }

   public final Parcelable onSaveInstanceState() {
      .cvm var1 = new .cvm(super.onSaveInstanceState());
      var1.a = 0;
      return var1;
   }

   protected final void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      if (var1 != var3) {
         float var5;
         if (var3 > 0 && !this.g.isEmpty()) {
            if (!this.j.isFinished()) {
               Scroller var10 = this.j;
               this.i();
               var10.setFinalX(0);
               return;
            }

            int var8 = this.getPaddingLeft();
            var4 = this.getPaddingRight();
            int var7 = this.getPaddingLeft();
            int var6 = this.getPaddingRight();
            var5 = (float)this.getScrollX();
            var2 = this.getScrollY();
            this.scrollTo((int)(var5 / (float)(var3 - var7 - var6) * (float)(var1 - var8 - var4)), var2);
            return;
         }

         .cvi var9 = this.g();
         if (var9 != null) {
            var5 = Math.min(var9.e, this.l);
         } else {
            var5 = 0.0F;
         }

         var4 = this.getPaddingLeft();
         var3 = this.getPaddingRight();
         var2 = this.getScrollX();
         var1 = (int)(var5 * (float)(var1 - var4 - var3));
         if (var1 != var2) {
            this.l();
            this.scrollTo(var1, this.getScrollY());
         }
      }

   }

   public final boolean onTouchEvent(MotionEvent var1) {
      if (var1.getAction() == 0) {
         var1.getEdgeFlags();
      }

      return false;
   }

   protected final boolean verifyDrawable(Drawable var1) {
      return super.verifyDrawable(var1) || var1 == null;
   }
}
