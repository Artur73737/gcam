package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.OverScroller;

public class ActionBarOverlayLayout extends ViewGroup implements .jv, .cfp, .cfq {
   static final int[] a = new int[]{2130968585, 16842841};
   private final .cfr A;
   private .nr B;
   public int b;
   public ActionBarContainer c;
   public boolean d;
   public boolean e;
   public boolean f;
   public int g;
   public .hv h;
   public ViewPropertyAnimator i;
   public final AnimatorListenerAdapter j;
   private int k;
   private ContentFrameLayout l;
   private Drawable m;
   private boolean n;
   private boolean o;
   private int p;
   private final Rect q;
   private final Rect r;
   private final Rect s;
   private .cho t;
   private .cho u;
   private .cho v;
   private .cho w;
   private OverScroller x;
   private final Runnable y;
   private final Runnable z;

   public ActionBarOverlayLayout(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ActionBarOverlayLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.b = 0;
      this.q = new Rect();
      this.r = new Rect();
      this.s = new Rect();
      new Rect();
      new Rect();
      new Rect();
      new Rect();
      this.t = .cho.a;
      .cho var3 = .cho.a;
      this.u = var3;
      this.v = var3;
      this.w = var3;
      this.j = new .hu(this);
      this.y = new .bl(this, 10, (byte[])null);
      this.z = new .bl(this, 11, (byte[])null);
      this.v(var1);
      this.A = new .cfr();
   }

   private final void v(Context var1) {
      TypedArray var4 = this.getContext().getTheme().obtainStyledAttributes(a);
      boolean var3 = false;
      this.k = var4.getDimensionPixelSize(0, 0);
      Drawable var5 = var4.getDrawable(1);
      this.m = var5;
      boolean var2;
      if (var5 == null) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.setWillNotDraw(var2);
      var4.recycle();
      if (var1.getApplicationInfo().targetSdkVersion < 19) {
         var2 = true;
      } else {
         var2 = var3;
      }

      this.n = var2;
      this.x = new OverScroller(var1);
   }

   private static final boolean w(View var0, Rect var1, boolean var2) {
      .hw var4 = (.hw)var0.getLayoutParams();
      boolean var3;
      if (var4.leftMargin != var1.left) {
         var4.leftMargin = var1.left;
         var3 = true;
      } else {
         var3 = false;
      }

      if (var4.topMargin != var1.top) {
         var4.topMargin = var1.top;
         var3 = true;
      }

      if (var4.rightMargin != var1.right) {
         var4.rightMargin = var1.right;
         var3 = true;
      }

      if (var2 && var4.bottomMargin != var1.bottom) {
         var4.bottomMargin = var1.bottom;
         return true;
      } else {
         return var3;
      }
   }

   public final void a() {
      this.i();
      this.B.c();
   }

   public final void b() {
      this.removeCallbacks(this.y);
      this.removeCallbacks(this.z);
      ViewPropertyAnimator var1 = this.i;
      if (var1 != null) {
         var1.cancel();
      }

   }

   public final void c(int var1) {
      this.i();
      switch(var1) {
      case 109:
         boolean var2 = true;
         this.d = true;
         if (this.getContext().getApplicationInfo().targetSdkVersion >= 19) {
            var2 = false;
         }

         this.n = var2;
         return;
      default:
      }
   }

   protected final boolean checkLayoutParams(LayoutParams var1) {
      return var1 instanceof .hw;
   }

   public final void d(View var1, int var2, int var3, int[] var4, int var5) {
   }

   public final void draw(Canvas var1) {
      super.draw(var1);
      if (this.m != null && !this.n) {
         int var2;
         if (this.c.getVisibility() == 0) {
            var2 = (int)((float)this.c.getBottom() + this.c.getTranslationY() + 0.5F);
         } else {
            var2 = 0;
         }

         this.m.setBounds(0, var2, this.getWidth(), this.m.getIntrinsicHeight() + var2);
         this.m.draw(var1);
      }

   }

   public final void e(View var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 == 0) {
         this.onNestedScroll(var1, var2, var3, var4, var5);
      }

   }

   public final void f(View var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      this.e(var1, var2, var3, var4, var5, var6);
   }

   public final void g(View var1, View var2, int var3, int var4) {
      if (var4 == 0) {
         this.onNestedScrollAccepted(var1, var2, var3);
      }

   }

   protected final LayoutParams generateLayoutParams(LayoutParams var1) {
      return new .hw(var1);
   }

   public final int getNestedScrollAxes() {
      return this.A.a();
   }

   public final void h(View var1, int var2) {
      if (var2 == 0) {
         this.onStopNestedScroll(var1);
      }

   }

   final void i() {
      if (this.l == null) {
         this.l = (ContentFrameLayout)this.findViewById(2131427383);
         this.c = (ActionBarContainer)this.findViewById(2131427384);
         View var1 = this.findViewById(2131427382);
         if (var1 instanceof Toolbar) {
            this.B = ((Toolbar)var1).y();
         } else {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(var1.getClass().getSimpleName())));
         }
      }
   }

   public final void j(int var1) {
      this.b();
      var1 = -Math.max(0, Math.min(var1, this.c.getHeight()));
      this.c.setTranslationY((float)var1);
   }

   public final void k(boolean var1) {
      if (var1 != this.o) {
         this.o = var1;
         if (!var1) {
            this.b();
            this.j(0);
         }
      }

   }

   public final void l(Menu var1, .hh var2) {
      this.i();
      .nr var4 = this.B;
      if (var4.f == null) {
         var4.f = new .ib(var4.a.getContext());
      }

      .ib var3 = var4.f;
      var3.e = var2;
      Toolbar var6 = var4.a;
      if (var1 != null || var6.a != null) {
         var6.l();
         .gv var7 = var6.a.a;
         if (var7 != var1) {
            if (var7 != null) {
               var7.m(var6.x);
               var7.m(var6.y);
            }

            if (var6.y == null) {
               var6.y = new .nm(var6);
            }

            var3.o();
            if (var1 != null) {
               Context var8 = var6.j;
               .gv var5 = (.gv)var1;
               var5.h(var3, var8);
               var5.h(var6.y, var6.j);
            } else {
               var3.b(var6.j, (.gv)null);
               var6.y.b(var6.j, (.gv)null);
               var3.i();
               var6.y.i();
            }

            var6.a.j(var6.k);
            var6.a.k(var3);
            var6.x = var3;
            var6.u();
            return;
         }
      }

   }

   public final void m() {
      this.i();
      this.B.f();
   }

   public final void n(Callback var1) {
      this.i();
      this.B.d = var1;
   }

   public final void o(CharSequence var1) {
      this.i();
      this.B.i(var1);
   }

   public final WindowInsets onApplyWindowInsets(WindowInsets var1) {
      this.i();
      .cho var4 = .cho.n(var1, this);
      Rect var3 = new Rect(var4.b(), var4.d(), var4.c(), var4.a());
      boolean var2 = w(this.c, var3, false);
      .cgd.f(this, var4, this.q);
      .cho var5 = var4.l(this.q.left, this.q.top, this.q.right, this.q.bottom);
      this.t = var5;
      if (!this.u.equals(var5)) {
         this.u = this.t;
         var2 = true;
      }

      if (!this.r.equals(this.q)) {
         this.r.set(this.q);
      } else if (!var2) {
         return var4.i().k().j().e();
      }

      this.requestLayout();
      return var4.i().k().j().e();
   }

   protected final void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      this.v(this.getContext());
      .cgb.c(this);
   }

   protected final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.b();
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      var5 = this.getChildCount();
      var3 = this.getPaddingLeft();
      var4 = this.getPaddingTop();

      for(var2 = 0; var2 < var5; ++var2) {
         View var10 = this.getChildAt(var2);
         if (var10.getVisibility() != 8) {
            .hw var11 = (.hw)var10.getLayoutParams();
            int var6 = var10.getMeasuredWidth();
            int var9 = var10.getMeasuredHeight();
            int var8 = var11.leftMargin + var3;
            int var7 = var11.topMargin + var4;
            var10.layout(var8, var7, var6 + var8, var9 + var7);
         }
      }

   }

   protected final void onMeasure(int var1, int var2) {
      this.i();
      this.measureChildWithMargins(this.c, var1, 0, var2, 0);
      .hw var8 = (.hw)this.c.getLayoutParams();
      int var7 = Math.max(0, this.c.getMeasuredWidth() + var8.leftMargin + var8.rightMargin);
      int var6 = Math.max(0, this.c.getMeasuredHeight() + var8.topMargin + var8.bottomMargin);
      int var5 = View.combineMeasuredStates(0, this.c.getMeasuredState());
      boolean var4;
      if ((.cfx.d(this) & 256) != 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      int var3;
      if (var4) {
         var3 = this.k;
      } else if (this.c.getVisibility() != 8) {
         var3 = this.c.getMeasuredHeight();
      } else {
         var3 = 0;
      }

      this.s.set(this.q);
      .cho var11 = this.t;
      this.v = var11;
      if (!this.d && !var4) {
         Rect var13 = this.s;
         var13.top += var3;
         var13 = this.s;
         var13.bottom = var13.bottom;
         this.v = this.v.l(0, var3, 0, 0);
      } else {
         .cdi var12 = .cdi.c(var11.b(), this.v.d() + var3, this.v.c(), this.v.a());
         .chf var9 = new .chf(this.v);
         var9.c(var12);
         this.v = var9.a();
      }

      w(this.l, this.s, true);
      if (!this.w.equals(this.v)) {
         var11 = this.v;
         this.w = var11;
         .cgm.b(this.l, var11);
      }

      this.measureChildWithMargins(this.l, var1, 0, var2, 0);
      var8 = (.hw)this.l.getLayoutParams();
      var3 = Math.max(var7, this.l.getMeasuredWidth() + var8.leftMargin + var8.rightMargin);
      var6 = Math.max(var6, this.l.getMeasuredHeight() + var8.topMargin + var8.bottomMargin);
      int var10 = View.combineMeasuredStates(var5, this.l.getMeasuredState());
      var5 = this.getPaddingLeft();
      var7 = this.getPaddingRight();
      var6 = Math.max(var6 + this.getPaddingTop() + this.getPaddingBottom(), this.getSuggestedMinimumHeight());
      this.setMeasuredDimension(View.resolveSizeAndState(Math.max(var3 + var5 + var7, this.getSuggestedMinimumWidth()), var1, var10), View.resolveSizeAndState(var6, var2, var10 << 16));
   }

   public final boolean onNestedFling(View var1, float var2, float var3, boolean var4) {
      if (this.o && var4) {
         this.x.fling(0, 0, 0, (int)var3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
         if (this.x.getFinalY() > this.c.getHeight()) {
            this.b();
            this.z.run();
         } else {
            this.b();
            this.y.run();
         }

         this.f = true;
         return true;
      } else {
         return false;
      }
   }

   public final boolean onNestedPreFling(View var1, float var2, float var3) {
      return false;
   }

   public final void onNestedPreScroll(View var1, int var2, int var3, int[] var4) {
   }

   public final void onNestedScroll(View var1, int var2, int var3, int var4, int var5) {
      var2 = this.p + var3;
      this.p = var2;
      this.j(var2);
   }

   public final void onNestedScrollAccepted(View var1, View var2, int var3) {
      .cfr var5 = this.A;
      byte var4 = 0;
      var5.b(var3, 0);
      ActionBarContainer var6 = this.c;
      if (var6 != null) {
         var3 = -((int)var6.getTranslationY());
      } else {
         var3 = var4;
      }

      this.p = var3;
      this.b();
      .hv var7 = this.h;
      if (var7 != null) {
         .fp var8 = (.fp)var7;
         .ge var9 = var8.l;
         if (var9 != null) {
            var9.a();
            var8.l = null;
         }
      }

   }

   public final boolean onStartNestedScroll(View var1, View var2, int var3) {
      return (var3 & 2) != 0 && this.c.getVisibility() == 0 ? this.o : false;
   }

   public final void onStopNestedScroll(View var1) {
      if (this.o && !this.f) {
         if (this.p <= this.c.getHeight()) {
            this.b();
            this.postDelayed(this.y, 600L);
            return;
         }

         this.b();
         this.postDelayed(this.z, 600L);
      }

   }

   @Deprecated
   public final void onWindowSystemUiVisibilityChanged(int var1) {
      super.onWindowSystemUiVisibilityChanged(var1);
      this.i();
      int var3 = this.g;
      this.g = var1;
      .hv var5 = this.h;
      if (var5 != null) {
         int var2 = var1 & 256;
         boolean var4;
         if (var2 == 0) {
            var4 = true;
         } else {
            var4 = false;
         }

         .fp var6 = (.fp)var5;
         var6.j = var4;
         if ((var1 & 4) != 0 && var2 != 0) {
            if (!var6.k) {
               var6.k = true;
               var6.x(true);
            }
         } else if (var6.k) {
            var6.k = false;
            var6.x(true);
         }
      }

      if (((var3 ^ var1) & 256) != 0 && this.h != null) {
         .cgb.c(this);
      }

   }

   protected final void onWindowVisibilityChanged(int var1) {
      super.onWindowVisibilityChanged(var1);
      this.b = var1;
      .hv var2 = this.h;
      if (var2 != null) {
         ((.fp)var2).i = var1;
      }

   }

   public final boolean p() {
      this.i();
      Toolbar var1 = this.B.a;
      if (var1.getVisibility() == 0) {
         ActionMenuView var2 = var1.a;
         if (var2 != null && var2.b) {
            return true;
         }
      }

      return false;
   }

   public final boolean q() {
      this.i();
      return this.B.k();
   }

   public final boolean r() {
      this.i();
      ActionMenuView var2 = this.B.a.a;
      boolean var1 = false;
      if (var2 != null) {
         .ib var3 = var2.c;
         if (var3 != null) {
            if (var3.k == null && !var3.l()) {
               return false;
            }

            var1 = true;
         }
      }

      return var1;
   }

   public final boolean s() {
      this.i();
      return this.B.l();
   }

   public final boolean shouldDelayChildPressedState() {
      return false;
   }

   public final boolean t(View var1, View var2, int var3, int var4) {
      return var4 == 0 && this.onStartNestedScroll(var1, var2, var3);
   }

   public final boolean u() {
      this.i();
      return this.B.m();
   }
}
