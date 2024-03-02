package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

public final class ViewPager2 extends ViewGroup {
   public final .cvq a = new .cvq();
   public int b;
   public boolean c = false;
   LinearLayoutManager d;
   public RecyclerView e;
   public .cvt f;
   public boolean g = true;
   public final int h = -1;
   public final .ej i = new .cvu(this);
   public .cus j;
   private final Rect k = new Rect();
   private final Rect l = new Rect();
   private int m = -1;
   private Parcelable n;
   private .lp o;
   private .cvq p;
   private .cvr q;
   private .gfv r;

   public ViewPager2(Context var1) {
      super(var1);
      this.i(var1, (AttributeSet)null);
   }

   public ViewPager2(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.i(var1, var2);
   }

   public ViewPager2(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.i(var1, var2);
   }

   public ViewPager2(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.i(var1, var2);
   }

   private final void i(Context var1, AttributeSet var2) {
      this.j = new .cwb(this);
      .cwd var4 = new .cwd(this, var1);
      this.e = var4;
      var4.setId(.cfy.a());
      this.e.setDescendantFocusability(131072);
      .cvy var16 = new .cvy(this);
      this.d = var16;
      this.e.ad(var16);
      RecyclerView var17 = this.e;
      var17.G = ViewConfiguration.get(var17.getContext()).getScaledPagingTouchSlop();
      TypedArray var18 = var1.obtainStyledAttributes(var2, .cvn.a);
      .cgj.d(this, var1, .cvn.a, var2, var18, 0, 0);

      try {
         int var3 = var18.getInt(0, 0);
         this.d.U(var3);
         ((.cwb)this.j).f();
      } finally {
         var18.recycle();
      }

      this.e.setLayoutParams(new LayoutParams(-1, -1));
      RecyclerView var7 = this.e;
      .cud var9 = new .cud();
      if (var7.y == null) {
         var7.y = new ArrayList();
      }

      var7.y.add(var9);
      this.f = new .cvt(this);
      .cvt var11 = this.f;
      var7 = this.e;
      this.r = new .gfv(var11);
      .cwc var13 = new .cwc(this);
      this.o = var13;
      var13.e(var7);
      this.e.az(this.f);
      .cvq var8 = new .cvq();
      this.p = var8;
      this.f.f = var8;
      .cvv var19 = new .cvv(this);
      .cvw var15 = new .cvw(this);
      var8.d(var19);
      this.p.d(var15);
      .cus var10 = this.j;
      .cfx.o(this.e, 2);
      .cwb var12 = (.cwb)var10;
      var12.b = new .cwa(var12);
      if (.cfx.a(var12.a) == 0) {
         .cfx.o(var12.a, 1);
      }

      this.p.d(this.a);
      .cvr var14 = new .cvr();
      this.q = var14;
      this.p.d(var14);
      var7 = this.e;
      this.attachViewToParent(var7, 0, var7.getLayoutParams());
   }

   public final int a() {
      return this.d.k == 1 ? 1 : 0;
   }

   public final .lq b() {
      return this.e.m;
   }

   public final void c() {
      if (this.m != -1) {
         .lq var2 = this.b();
         if (var2 != null) {
            if (this.n != null) {
               if (var2 instanceof .cvo) {
                  ((.cvo)var2).b();
               }

               this.n = null;
            }

            int var1 = Math.max(0, Math.min(this.m, var2.a() - 1));
            this.b = var1;
            this.m = -1;
            this.e.Z(var1);
            ((.cwb)this.j).f();
         }
      }
   }

   public final boolean canScrollHorizontally(int var1) {
      return this.e.canScrollHorizontally(var1);
   }

   public final boolean canScrollVertically(int var1) {
      return this.e.canScrollVertically(var1);
   }

   public final void d(int var1, boolean var2) {
      this.h();
      this.e(var1, var2);
   }

   protected final void dispatchRestoreInstanceState(SparseArray var1) {
      Parcelable var3 = (Parcelable)var1.get(this.getId());
      if (var3 instanceof .cwe) {
         int var2 = ((.cwe)var3).a;
         var1.put(this.e.getId(), (Parcelable)var1.get(var2));
         var1.remove(var2);
      }

      super.dispatchRestoreInstanceState(var1);
      this.c();
   }

   public final void e(int var1, boolean var2) {
      .lq var9 = this.b();
      if (var9 == null) {
         if (this.m != -1) {
            this.m = Math.max(var1, 0);
         }

      } else if (var9.a() > 0) {
         int var7 = Math.min(Math.max(var1, 0), var9.a() - 1);
         if (var7 != this.b || !this.f.t()) {
            var1 = this.b;
            if (var7 != var1 || !var2) {
               this.b = var7;
               ((.cwb)this.j).f();
               boolean var8 = this.f.t();
               double var3 = (double)var1;
               double var5;
               .cvt var11;
               if (!var8) {
                  var11 = this.f;
                  var11.s();
                  .cvs var12 = var11.c;
                  var5 = (double)var12.a;
                  var3 = (double)var12.b;
                  Double.isNaN(var5);
                  Double.isNaN(var3);
                  var3 += var5;
               }

               var11 = this.f;
               byte var10;
               if (!var2) {
                  var10 = 3;
               } else {
                  var10 = 2;
               }

               var11.a = var10;
               var1 = var11.d;
               var11.d = var7;
               var11.r(2);
               if (var1 != var7) {
                  var11.q(var7);
               }

               if (!var2) {
                  this.e.Z(var7);
               } else {
                  var5 = (double)var7;
                  Double.isNaN(var5);
                  if (Math.abs(var5 - var3) > 3.0D) {
                     RecyclerView var13 = this.e;
                     if (var5 > var3) {
                        var1 = var7 - 3;
                     } else {
                        var1 = var7 + 3;
                     }

                     var13.Z(var1);
                     var13 = this.e;
                     var13.post(new .cwf(var7, var13));
                  } else {
                     this.e.af(var7);
                  }
               }
            }
         }
      }
   }

   public final void f() {
      .lp var2 = this.o;
      if (var2 != null) {
         View var3 = var2.b(this.d);
         if (var3 != null) {
            int var1 = LinearLayoutManager.bh(var3);
            if (var1 != this.b && this.f.b == 0) {
               this.p.c(var1);
            }

            this.c = false;
         }
      } else {
         throw new IllegalStateException("Design assumption violated.");
      }
   }

   public final boolean g() {
      return this.d.ap() == 1;
   }

   public final CharSequence getAccessibilityClassName() {
      return "androidx.viewpager.widget.ViewPager";
   }

   public final void h() {
      Object var1 = this.r.a;
   }

   public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      super.onInitializeAccessibilityNodeInfo(var1);
      .cus var4 = this.j;
      .cht var6 = .cht.b(var1);
      .cwb var7 = (.cwb)var4;
      int var2;
      int var3;
      if (var7.a.b() != null) {
         if (var7.a.a() == 1) {
            var2 = var7.a.b().a();
            var3 = 1;
         } else {
            var3 = var7.a.b().a();
            var2 = 1;
         }
      } else {
         var2 = 0;
         var3 = 0;
      }

      var6.n(.dmx.n(var2, var3, 0));
      .lq var5 = var7.a.b();
      if (var5 != null) {
         var2 = var5.a();
         if (var2 != 0) {
            ViewPager2 var8 = var7.a;
            if (var8.g) {
               if (var8.b > 0) {
                  var6.g(8192);
               }

               if (var7.a.b < var2 - 1) {
                  var6.g(4096);
               }

               var6.w(true);
               return;
            }
         }
      }

   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      int var6 = this.e.getMeasuredWidth();
      int var7 = this.e.getMeasuredHeight();
      this.k.left = this.getPaddingLeft();
      this.k.right = var4 - var2 - this.getPaddingRight();
      this.k.top = this.getPaddingTop();
      this.k.bottom = var5 - var3 - this.getPaddingBottom();
      Gravity.apply(8388659, var6, var7, this.k, this.l);
      this.e.layout(this.l.left, this.l.top, this.l.right, this.l.bottom);
      if (this.c) {
         this.f();
      }

   }

   protected final void onMeasure(int var1, int var2) {
      this.measureChild(this.e, var1, var2);
      int var9 = this.e.getMeasuredWidth();
      int var5 = this.e.getMeasuredHeight();
      int var3 = this.e.getMeasuredState();
      int var8 = this.getPaddingLeft();
      int var7 = this.getPaddingRight();
      int var4 = this.getPaddingTop();
      int var6 = this.getPaddingBottom();
      var7 = Math.max(var9 + var8 + var7, this.getSuggestedMinimumWidth());
      var4 = Math.max(var5 + var4 + var6, this.getSuggestedMinimumHeight());
      this.setMeasuredDimension(resolveSizeAndState(var7, var1, var3), resolveSizeAndState(var4, var2, var3 << 16));
   }

   protected final void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof .cwe)) {
         super.onRestoreInstanceState(var1);
      } else {
         .cwe var2 = (.cwe)var1;
         super.onRestoreInstanceState(var2.getSuperState());
         this.m = var2.b;
         this.n = var2.c;
      }
   }

   protected final Parcelable onSaveInstanceState() {
      .cwe var3 = new .cwe(super.onSaveInstanceState());
      var3.a = this.e.getId();
      int var2 = this.m;
      int var1 = var2;
      if (var2 == -1) {
         var1 = this.b;
      }

      var3.b = var1;
      Parcelable var4 = this.n;
      if (var4 != null) {
         var3.c = var4;
      } else {
         .lq var5 = this.e.m;
         if (var5 instanceof .cvo) {
            var3.c = ((.cvo)var5).a();
         }
      }

      return var3;
   }

   public final void onViewAdded(View var1) {
      throw new IllegalStateException(String.valueOf(this.getClass().getSimpleName()).concat(" does not support direct child views"));
   }

   public final boolean performAccessibilityAction(int var1, Bundle var2) {
      if (this.j.d(var1)) {
         .cus var3 = this.j;
         if (var3.d(var1)) {
            if (var1 == 8192) {
               var1 = ((.cwb)var3).a.b - 1;
            } else {
               var1 = ((.cwb)var3).a.b + 1;
            }

            ((.cwb)var3).e(var1);
            return true;
         } else {
            throw new IllegalStateException();
         }
      } else {
         return super.performAccessibilityAction(var1, var2);
      }
   }

   public final void setLayoutDirection(int var1) {
      super.setLayoutDirection(var1);
      ((.cwb)this.j).f();
   }
}
