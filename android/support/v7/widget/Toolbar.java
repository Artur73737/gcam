package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup implements .cfl {
   public .gt A;
   public boolean B;
   public final .ve C;
   public AmbientMode$AmbientController D;
   private int E;
   private int F;
   private int G;
   private int H;
   private ColorStateList I;
   private ColorStateList J;
   private boolean K;
   private boolean L;
   private final ArrayList M;
   private final int[] N;
   private .nr O;
   private OnBackInvokedCallback P;
   private OnBackInvokedDispatcher Q;
   private final Runnable R;
   private final AmbientMode$AmbientController S;
   public ActionMenuView a;
   public TextView b;
   public TextView c;
   public ImageButton d;
   public ImageView e;
   public Drawable f;
   public CharSequence g;
   public ImageButton h;
   public View i;
   public Context j;
   public int k;
   public int l;
   public int m;
   public int n;
   public int o;
   public int p;
   public int q;
   public int r;
   public .ms s;
   public CharSequence t;
   public CharSequence u;
   public final ArrayList v;
   public ArrayList w;
   public .ib x;
   public .nm y;
   public .hh z;

   public Toolbar(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public Toolbar(Context var1, AttributeSet var2) {
      this(var1, var2, 2130970406);
   }

   public Toolbar(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.H = 8388627;
      this.M = new ArrayList();
      this.v = new ArrayList();
      this.N = new int[2];
      this.C = new .ve(new .nj(this, 1));
      this.w = new ArrayList();
      this.S = new AmbientMode$AmbientController(this);
      this.R = new .nj(this, 2, (byte[])null);
      AmbientDelegate var7 = AmbientDelegate.E(this.getContext(), var2, .fq.x, var3, 0);
      .cgj.d(this, var1, .fq.x, var2, (TypedArray)var7.b, var3, 0);
      this.l = var7.t(28, 0);
      this.m = var7.t(19, 0);
      this.H = var7.r(0, this.H);
      this.n = var7.r(2, 48);
      int var4 = var7.o(22, 0);
      var3 = var4;
      if (var7.B(27)) {
         var3 = var7.o(27, var4);
      }

      this.r = var3;
      this.q = var3;
      this.p = var3;
      this.o = var3;
      var3 = var7.o(25, -1);
      if (var3 >= 0) {
         this.o = var3;
      }

      var3 = var7.o(24, -1);
      if (var3 >= 0) {
         this.p = var3;
      }

      var3 = var7.o(26, -1);
      if (var3 >= 0) {
         this.q = var3;
      }

      var3 = var7.o(23, -1);
      if (var3 >= 0) {
         this.r = var3;
      }

      this.E = var7.p(13, -1);
      var4 = var7.o(9, Integer.MIN_VALUE);
      int var6 = var7.o(5, Integer.MIN_VALUE);
      var3 = var7.p(7, 0);
      int var5 = var7.p(8, 0);
      this.k();
      .ms var8 = this.s;
      var8.h = false;
      if (var3 != Integer.MIN_VALUE) {
         var8.e = var3;
         var8.a = var3;
      }

      if (var5 != Integer.MIN_VALUE) {
         var8.f = var5;
         var8.b = var5;
      }

      if (var4 != Integer.MIN_VALUE || var6 != Integer.MIN_VALUE) {
         var8.a(var4, var6);
      }

      this.F = var7.o(10, Integer.MIN_VALUE);
      this.G = var7.o(6, Integer.MIN_VALUE);
      this.f = var7.v(4);
      this.g = var7.x(3);
      CharSequence var9 = var7.x(21);
      if (!TextUtils.isEmpty(var9)) {
         this.t(var9);
      }

      var9 = var7.x(18);
      if (!TextUtils.isEmpty(var9)) {
         this.s(var9);
      }

      this.j = this.getContext();
      this.r(var7.t(17, 0));
      Drawable var10 = var7.v(16);
      if (var10 != null) {
         this.q(var10);
      }

      var9 = var7.x(15);
      if (!TextUtils.isEmpty(var9)) {
         this.p(var9);
      }

      var10 = var7.v(11);
      if (var10 != null) {
         this.o(var10);
      }

      CharSequence var11 = var7.x(12);
      if (!TextUtils.isEmpty(var11)) {
         if (!TextUtils.isEmpty(var11)) {
            this.I();
         }

         ImageView var13 = this.e;
         if (var13 != null) {
            var13.setContentDescription(var11);
         }
      }

      TextView var12;
      ColorStateList var14;
      if (var7.B(29)) {
         var14 = var7.u(29);
         this.I = var14;
         var12 = this.b;
         if (var12 != null) {
            var12.setTextColor(var14);
         }
      }

      if (var7.B(20)) {
         var14 = var7.u(20);
         this.J = var14;
         var12 = this.c;
         if (var12 != null) {
            var12.setTextColor(var14);
         }
      }

      if (var7.B(14)) {
         this.n(var7.t(14, 0));
      }

      var7.z();
   }

   protected static final .nn A(LayoutParams var0) {
      if (var0 instanceof .nn) {
         return new .nn((.nn)var0);
      } else if (var0 instanceof .dv) {
         return new .nn((.dv)var0);
      } else {
         return var0 instanceof MarginLayoutParams ? new .nn((MarginLayoutParams)var0) : new .nn(var0);
      }
   }

   private final int B(int var1) {
      int var3 = .cfy.c(this);
      int var2 = Gravity.getAbsoluteGravity(var1, var3) & 7;
      var1 = var2;
      switch(var2) {
      case 2:
      case 4:
      default:
         if (var3 != 1) {
            return 3;
         } else {
            var1 = 5;
         }
      case 1:
      case 3:
      case 5:
         return var1;
      }
   }

   private final int C(View var1, int var2) {
      .nn var7 = (.nn)var1.getLayoutParams();
      int var5 = var1.getMeasuredHeight();
      if (var2 > 0) {
         var2 = (var5 - var2) / 2;
      } else {
         var2 = 0;
      }

      int var4 = var7.a & 112;
      int var3 = var4;
      switch(var4) {
      default:
         var3 = this.H & 112;
      case 16:
      case 48:
      case 80:
         switch(var3) {
         case 48:
            return this.getPaddingTop() - var2;
         case 80:
            return this.getHeight() - this.getPaddingBottom() - var5 - var7.bottomMargin - var2;
         default:
            var3 = this.getPaddingTop();
            int var6 = this.getPaddingBottom();
            var4 = this.getHeight();
            var2 = (var4 - var3 - var6 - var5) / 2;
            if (var2 < var7.topMargin) {
               var2 = var7.topMargin;
            } else {
               var4 = var4 - var6 - var5 - var2 - var3;
               if (var4 < var7.bottomMargin) {
                  var2 = Math.max(0, var2 - (var7.bottomMargin - var4));
               }
            }

            return var3 + var2;
         }
      }
   }

   private final int D(View var1, int var2, int[] var3, int var4) {
      .nn var6 = (.nn)var1.getLayoutParams();
      int var5 = var6.leftMargin - var3[0];
      var2 += Math.max(0, var5);
      var3[0] = Math.max(0, -var5);
      var4 = this.C(var1, var4);
      var5 = var1.getMeasuredWidth();
      var1.layout(var2, var4, var2 + var5, var1.getMeasuredHeight() + var4);
      return var2 + var5 + var6.rightMargin;
   }

   private final int E(View var1, int var2, int[] var3, int var4) {
      .nn var6 = (.nn)var1.getLayoutParams();
      int var5 = var6.rightMargin - var3[1];
      var2 -= Math.max(0, var5);
      var3[1] = Math.max(0, -var5);
      var5 = this.C(var1, var4);
      var4 = var1.getMeasuredWidth();
      var1.layout(var2 - var4, var5, var2, var1.getMeasuredHeight() + var5);
      return var2 - (var4 + var6.leftMargin);
   }

   private final int F(View var1, int var2, int var3, int var4, int var5, int[] var6) {
      MarginLayoutParams var10 = (MarginLayoutParams)var1.getLayoutParams();
      int var8 = var10.leftMargin - var6[0];
      int var9 = var10.rightMargin - var6[1];
      int var7 = Math.max(0, var8) + Math.max(0, var9);
      var6[0] = Math.max(0, -var8);
      var6[1] = Math.max(0, -var9);
      var1.measure(getChildMeasureSpec(var2, this.getPaddingLeft() + this.getPaddingRight() + var7 + var3, var10.width), getChildMeasureSpec(var4, this.getPaddingTop() + this.getPaddingBottom() + var10.topMargin + var10.bottomMargin + var5, var10.height));
      return var1.getMeasuredWidth() + var7;
   }

   private final void G(List var1, int var2) {
      int var5 = .cfy.c(this);
      int var4 = this.getChildCount();
      int var3 = Gravity.getAbsoluteGravity(var2, .cfy.c(this));
      var1.clear();
      View var6;
      .nn var7;
      if (var5 == 1) {
         for(var2 = var4 - 1; var2 >= 0; --var2) {
            var6 = this.getChildAt(var2);
            var7 = (.nn)var6.getLayoutParams();
            if (var7.b == 0 && this.K(var6) && this.B(var7.a) == var3) {
               var1.add(var6);
            }
         }
      } else {
         for(var2 = 0; var2 < var4; ++var2) {
            var6 = this.getChildAt(var2);
            var7 = (.nn)var6.getLayoutParams();
            if (var7.b == 0 && this.K(var6) && this.B(var7.a) == var3) {
               var1.add(var6);
            }
         }
      }

   }

   private final void H(View var1, boolean var2) {
      LayoutParams var3 = var1.getLayoutParams();
      .nn var4;
      if (var3 == null) {
         var4 = z();
      } else if (!this.checkLayoutParams(var3)) {
         var4 = A(var3);
      } else {
         var4 = (.nn)var3;
      }

      var4.b = 1;
      if (var2 && this.i != null) {
         var1.setLayoutParams(var4);
         this.v.add(var1);
      } else {
         this.addView(var1, var4);
      }
   }

   private final void I() {
      if (this.e == null) {
         this.e = new AppCompatImageView(this.getContext());
      }

   }

   private final boolean J(View var1) {
      return var1.getParent() == this || this.v.contains(var1);
   }

   private final boolean K(View var1) {
      return var1 != null && var1.getParent() == this && var1.getVisibility() != 8;
   }

   private static final int L(View var0) {
      MarginLayoutParams var1 = (MarginLayoutParams)var0.getLayoutParams();
      return .cfk.c(var1) + .cfk.b(var1);
   }

   private static final int M(View var0) {
      MarginLayoutParams var1 = (MarginLayoutParams)var0.getLayoutParams();
      return var1.topMargin + var1.bottomMargin;
   }

   private final void N(View var1, int var2, int var3, int var4, int var5) {
      MarginLayoutParams var7 = (MarginLayoutParams)var1.getLayoutParams();
      int var6 = getChildMeasureSpec(var2, this.getPaddingLeft() + this.getPaddingRight() + var7.leftMargin + var7.rightMargin + var3, var7.width);
      var3 = getChildMeasureSpec(var4, this.getPaddingTop() + this.getPaddingBottom() + var7.topMargin + var7.bottomMargin, var7.height);
      var4 = MeasureSpec.getMode(var3);
      var2 = var3;
      if (var4 != 1073741824) {
         var2 = var3;
         if (var5 >= 0) {
            var2 = var5;
            if (var4 != 0) {
               var2 = Math.min(MeasureSpec.getSize(var3), var5);
            }

            var2 = MeasureSpec.makeMeasureSpec(var2, 1073741824);
         }
      }

      var1.measure(var6, var2);
   }

   public static final .nn z() {
      return new .nn();
   }

   public final int a() {
      .ms var2 = this.s;
      if (var2 != null) {
         int var1;
         if (var2.g) {
            var1 = var2.a;
         } else {
            var1 = var2.b;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public final int b() {
      .ms var2 = this.s;
      if (var2 != null) {
         int var1;
         if (var2.g) {
            var1 = var2.b;
         } else {
            var1 = var2.a;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public final int c() {
      ActionMenuView var2 = this.a;
      int var1;
      if (var2 != null) {
         .gv var3 = var2.a;
         if (var3 != null && var3.hasVisibleItems()) {
            var1 = Math.max(this.a(), Math.max(this.G, 0));
            return var1;
         }
      }

      var1 = this.a();
      return var1;
   }

   protected final boolean checkLayoutParams(LayoutParams var1) {
      return super.checkLayoutParams(var1) && var1 instanceof .nn;
   }

   public final int d() {
      int var1;
      if (this.e() != null) {
         var1 = Math.max(this.b(), Math.max(this.F, 0));
      } else {
         var1 = this.b();
      }

      return var1;
   }

   public final Drawable e() {
      ImageButton var1 = this.d;
      return var1 != null ? var1.getDrawable() : null;
   }

   public final Menu f() {
      this.l();
      ActionMenuView var1 = this.a;
      if (var1.a == null) {
         Menu var4 = var1.g();
         if (this.y == null) {
            this.y = new .nm(this);
         }

         this.a.c.o();
         .nm var3 = this.y;
         Context var2 = this.j;
         ((.gv)var4).h(var3, var2);
         this.u();
      }

      return this.a.g();
   }

   public final MenuInflater g() {
      return new .gc(this.getContext());
   }

   public final CharSequence h() {
      ImageButton var1 = this.d;
      return var1 != null ? var1.getContentDescription() : null;
   }

   public final ArrayList i() {
      ArrayList var3 = new ArrayList();
      Menu var2 = this.f();

      for(int var1 = 0; var1 < var2.size(); ++var1) {
         var3.add(var2.getItem(var1));
      }

      return var3;
   }

   public final void j() {
      .nm var1 = this.y;
      .gx var2;
      if (var1 == null) {
         var2 = null;
      } else {
         var2 = var1.b;
      }

      if (var2 != null) {
         var2.collapseActionView();
      }

   }

   public final void k() {
      if (this.s == null) {
         this.s = new .ms();
      }

   }

   public final void l() {
      if (this.a == null) {
         ActionMenuView var1 = new ActionMenuView(this.getContext());
         this.a = var1;
         var1.j(this.k);
         var1 = this.a;
         var1.e = this.S;
         var1.i(this.z, new .if(this, 2));
         .nn var2 = z();
         var2.a = this.n & 112 | 8388613;
         this.a.setLayoutParams(var2);
         this.H(this.a, false);
      }

   }

   public final void m() {
      if (this.d == null) {
         this.d = new .io(this.getContext(), (AttributeSet)null, 2130970405);
         .nn var1 = z();
         var1.a = this.n & 112 | 8388611;
         this.d.setLayoutParams(var1);
      }

   }

   public void n(int var1) {
      this.g().inflate(var1, this.f());
   }

   public final void o(Drawable var1) {
      ImageView var2;
      if (var1 != null) {
         this.I();
         if (!this.J(this.e)) {
            this.H(this.e, true);
         }
      } else {
         var2 = this.e;
         if (var2 != null && this.J(var2)) {
            this.removeView(this.e);
            this.v.remove(this.e);
         }
      }

      var2 = this.e;
      if (var2 != null) {
         var2.setImageDrawable(var1);
      }

   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.u();
   }

   protected final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.removeCallbacks(this.R);
      this.u();
   }

   public final boolean onHoverEvent(MotionEvent var1) {
      int var4 = var1.getActionMasked();
      byte var3 = 9;
      int var2 = var4;
      if (var4 == 9) {
         this.L = false;
         var2 = 9;
      }

      if (!this.L) {
         boolean var5 = super.onHoverEvent(var1);
         if (var2 == 9) {
            var2 = var3;
            if (!var5) {
               this.L = true;
               var2 = var3;
            }
         }
      }

      if (var2 == 10 || var2 == 3) {
         this.L = false;
      }

      return true;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      var2 = .cfy.c(this);
      int var11 = this.getWidth();
      int var14 = this.getHeight();
      int var7 = this.getPaddingLeft();
      int var10 = this.getPaddingRight();
      int var9 = var11 - var10;
      int var12 = this.getPaddingTop();
      int var13 = this.getPaddingBottom();
      int[] var18 = this.N;
      var18[1] = 0;
      var18[0] = 0;
      var4 = .cfx.b(this);
      int var6;
      if (var4 >= 0) {
         var6 = Math.min(var4, var5 - var3);
      } else {
         var6 = 0;
      }

      boolean var8;
      if (var2 == 1) {
         var8 = true;
      } else {
         var8 = false;
      }

      label205: {
         if (this.K(this.d)) {
            if (var8) {
               var4 = this.E(this.d, var9, var18, var6);
               var5 = var7;
               break label205;
            }

            var5 = this.D(this.d, var7, var18, var6);
         } else {
            var5 = var7;
         }

         var4 = var9;
      }

      var3 = var5;
      var2 = var4;
      if (this.K(this.h)) {
         if (var8) {
            var2 = this.E(this.h, var4, var18, var6);
            var3 = var5;
         } else {
            var3 = this.D(this.h, var5, var18, var6);
            var2 = var4;
         }
      }

      var5 = var3;
      var4 = var2;
      if (this.K(this.a)) {
         if (var8) {
            var5 = this.D(this.a, var3, var18, var6);
            var4 = var2;
         } else {
            var4 = this.E(this.a, var2, var18, var6);
            var5 = var3;
         }
      }

      if (.cfy.c(this) == 1) {
         var2 = this.c();
      } else {
         var2 = this.d();
      }

      if (.cfy.c(this) == 1) {
         var3 = this.d();
      } else {
         var3 = this.c();
      }

      var18[0] = Math.max(0, var2 - var5);
      var18[1] = Math.max(0, var3 - (var9 - var4));
      var5 = Math.max(var5, var2);
      var3 = Math.min(var4, var9 - var3);
      var2 = var5;
      var4 = var3;
      if (this.K(this.i)) {
         if (var8) {
            var4 = this.E(this.i, var3, var18, var6);
            var2 = var5;
         } else {
            var2 = this.D(this.i, var5, var18, var6);
            var4 = var3;
         }
      }

      var3 = var2;
      var5 = var4;
      if (this.K(this.e)) {
         if (var8) {
            var5 = this.E(this.e, var4, var18, var6);
            var3 = var2;
         } else {
            var3 = this.D(this.e, var2, var18, var6);
            var5 = var4;
         }
      }

      boolean var15 = this.K(this.b);
      var1 = this.K(this.c);
      .nn var16;
      if (var15) {
         var16 = (.nn)this.b.getLayoutParams();
         var4 = var16.topMargin;
         var2 = this.b.getMeasuredHeight();
         var2 = var16.bottomMargin + var4 + var2;
      } else {
         var2 = 0;
      }

      if (var1) {
         var16 = (.nn)this.c.getLayoutParams();
         var2 += var16.topMargin + this.c.getMeasuredHeight() + var16.bottomMargin;
      }

      int var21;
      if (!var15 && !var1) {
         var2 = var3;
      } else {
         TextView var23;
         if (var15) {
            var23 = this.b;
         } else {
            var23 = this.c;
         }

         TextView var17;
         if (var1) {
            var17 = this.c;
         } else {
            var17 = this.b;
         }

         var16 = (.nn)var23.getLayoutParams();
         .nn var24 = (.nn)var17.getLayoutParams();
         boolean var20;
         if (var15 && this.b.getMeasuredWidth() > 0) {
            var20 = true;
         } else if (var1 && this.c.getMeasuredWidth() > 0) {
            var20 = true;
         } else {
            var20 = false;
         }

         switch(this.H & 112) {
         case 48:
            var2 = this.getPaddingTop() + var16.topMargin + this.q;
            break;
         case 80:
            var2 = var14 - var13 - var24.bottomMargin - this.r - var2;
            break;
         default:
            var9 = (var14 - var12 - var13 - var2) / 2;
            if (var9 < var16.topMargin + this.q) {
               var2 = var16.topMargin + this.q;
            } else {
               var2 = var14 - var13 - var2 - var9 - var12;
               if (var2 < var16.bottomMargin + this.r) {
                  var2 = Math.max(0, var9 - (var24.bottomMargin + this.r - var2));
               } else {
                  var2 = var9;
               }
            }

            var2 += var12;
         }

         if (var8) {
            if (var20) {
               var21 = this.o;
            } else {
               var21 = 0;
            }

            var21 -= var18[1];
            var5 -= Math.max(0, var21);
            var18[1] = Math.max(0, -var21);
            if (var15) {
               var16 = (.nn)this.b.getLayoutParams();
               var9 = var5 - this.b.getMeasuredWidth();
               var21 = this.b.getMeasuredHeight() + var2;
               this.b.layout(var9, var2, var5, var21);
               var2 = var9 - this.p;
               var9 = var21 + var16.bottomMargin;
            } else {
               var9 = var2;
               var2 = var5;
            }

            if (var1) {
               var16 = (.nn)this.c.getLayoutParams();
               var21 = var9 + var16.topMargin;
               var9 = this.c.getMeasuredWidth();
               var12 = this.c.getMeasuredHeight();
               this.c.layout(var5 - var9, var21, var5, var12 + var21);
               var21 = var5 - this.p;
               var9 = var16.bottomMargin;
            } else {
               var21 = var5;
            }

            if (var20) {
               var5 = Math.min(var2, var21);
            }

            var2 = var3;
         } else {
            if (var20) {
               var21 = this.o;
            } else {
               var21 = 0;
            }

            var21 -= var18[0];
            var3 += Math.max(0, var21);
            var18[0] = Math.max(0, -var21);
            if (var15) {
               var16 = (.nn)this.b.getLayoutParams();
               var9 = this.b.getMeasuredWidth() + var3;
               var21 = this.b.getMeasuredHeight() + var2;
               this.b.layout(var3, var2, var9, var21);
               var2 = var9 + this.p;
               var9 = var21 + var16.bottomMargin;
            } else {
               var9 = var2;
               var2 = var3;
            }

            if (var1) {
               var16 = (.nn)this.c.getLayoutParams();
               var12 = var9 + var16.topMargin;
               var9 = this.c.getMeasuredWidth() + var3;
               var21 = this.c.getMeasuredHeight();
               this.c.layout(var3, var12, var9, var21 + var12);
               var21 = var9 + this.p;
               var9 = var16.bottomMargin;
            } else {
               var21 = var3;
            }

            if (var20) {
               var2 = Math.max(var2, var21);
            } else {
               var2 = var3;
            }
         }
      }

      this.G(this.M, 3);
      var4 = this.M.size();

      for(var3 = 0; var3 < var4; ++var3) {
         var2 = this.D((View)this.M.get(var3), var2, var18, var6);
      }

      this.G(this.M, 5);
      var4 = this.M.size();

      for(var3 = 0; var3 < var4; ++var3) {
         var5 = this.E((View)this.M.get(var3), var5, var18, var6);
      }

      this.G(this.M, 1);
      ArrayList var26 = this.M;
      var9 = var18[0];
      var21 = var18[1];
      var12 = var26.size();
      var4 = 0;

      for(var3 = 0; var4 < var12; ++var4) {
         View var25 = (View)var26.get(var4);
         .nn var19 = (.nn)var25.getLayoutParams();
         var9 = var19.leftMargin - var9;
         var21 = var19.rightMargin - var21;
         var13 = Math.max(0, var9);
         var14 = Math.max(0, var21);
         var9 = Math.max(0, -var9);
         var21 = Math.max(0, -var21);
         var3 += var13 + var25.getMeasuredWidth() + var14;
      }

      byte var22 = 0;
      var7 = var7 + (var11 - var7 - var10) / 2 - var3 / 2;
      var3 += var7;
      if (var7 >= var2) {
         if (var3 > var5) {
            var2 = var7 - (var3 - var5);
         } else {
            var2 = var7;
         }
      }

      var5 = this.M.size();
      var3 = var2;

      for(var2 = var22; var2 < var5; ++var2) {
         var3 = this.D((View)this.M.get(var2), var3, var18, var6);
      }

      this.M.clear();
   }

   protected final void onMeasure(int var1, int var2) {
      int[] var15 = this.N;
      byte var9 = .nv.a(this);
      boolean var13 = this.K(this.d);
      byte var10 = 0;
      int var3;
      int var5;
      int var6;
      if (var13) {
         this.N(this.d, var1, 0, var2, this.E);
         var3 = this.d.getMeasuredWidth() + L(this.d);
         var6 = Math.max(0, this.d.getMeasuredHeight() + M(this.d));
         var5 = View.combineMeasuredStates(0, this.d.getMeasuredState());
      } else {
         var3 = 0;
         var6 = 0;
         var5 = 0;
      }

      int var7 = var3;
      int var4 = var6;
      var3 = var5;
      if (this.K(this.h)) {
         this.N(this.h, var1, 0, var2, this.E);
         var7 = this.h.getMeasuredWidth() + L(this.h);
         var4 = Math.max(var6, this.h.getMeasuredHeight() + M(this.h));
         var3 = View.combineMeasuredStates(var5, this.h.getMeasuredState());
      }

      var5 = this.d();
      var6 = Math.max(var5, var7);
      var15[var9] = Math.max(0, var5 - var7);
      if (this.K(this.a)) {
         this.N(this.a, var1, var6, var2, this.E);
         var5 = this.a.getMeasuredWidth() + L(this.a);
         var4 = Math.max(var4, this.a.getMeasuredHeight() + M(this.a));
         var3 = View.combineMeasuredStates(var3, this.a.getMeasuredState());
      } else {
         var5 = 0;
      }

      var7 = this.c();
      int var8 = var6 + Math.max(var7, var5);
      var15[var9 ^ 1] = Math.max(0, var7 - var5);
      if (this.K(this.i)) {
         var8 += this.F(this.i, var1, var8, var2, 0, var15);
         var7 = Math.max(var4, this.i.getMeasuredHeight() + M(this.i));
         var6 = View.combineMeasuredStates(var3, this.i.getMeasuredState());
      } else {
         var6 = var3;
         var7 = var4;
      }

      var5 = var7;
      var3 = var6;
      var4 = var8;
      if (this.K(this.e)) {
         var4 = var8 + this.F(this.e, var1, var8, var2, 0, var15);
         var5 = Math.max(var7, this.e.getMeasuredHeight() + M(this.e));
         var3 = View.combineMeasuredStates(var6, this.e.getMeasuredState());
      }

      int var11 = this.getChildCount();
      var8 = 0;
      var6 = var4;

      int var16;
      for(var7 = var5; var8 < var11; var6 = var4) {
         View var14 = this.getChildAt(var8);
         var16 = var7;
         var5 = var3;
         var4 = var6;
         if (((.nn)var14.getLayoutParams()).b == 0) {
            var16 = var7;
            var5 = var3;
            var4 = var6;
            if (this.K(var14)) {
               var4 = var6 + this.F(var14, var1, var6, var2, 0, var15);
               var16 = Math.max(var7, var14.getMeasuredHeight() + M(var14));
               var5 = View.combineMeasuredStates(var3, var14.getMeasuredState());
            }
         }

         ++var8;
         var7 = var16;
         var3 = var5;
      }

      int var12 = this.q + this.r;
      var11 = this.o + this.p;
      if (this.K(this.b)) {
         this.F(this.b, var1, var6 + var11, var2, var12, var15);
         var5 = this.b.getMeasuredWidth() + L(this.b);
         var8 = this.b.getMeasuredHeight();
         var4 = M(this.b);
         var3 = View.combineMeasuredStates(var3, this.b.getMeasuredState());
         var4 += var8;
      } else {
         var4 = 0;
         var5 = var10;
      }

      var16 = var5;
      int var17 = var4;
      var8 = var3;
      if (this.K(this.c)) {
         var16 = Math.max(var5, this.F(this.c, var1, var6 + var11, var2, var4 + var12, var15));
         var17 = var4 + this.c.getMeasuredHeight() + M(this.c);
         var8 = View.combineMeasuredStates(var3, this.c.getMeasuredState());
      }

      var5 = Math.max(var7, var17);
      var17 = this.getPaddingLeft();
      var7 = this.getPaddingRight();
      var3 = this.getPaddingTop();
      var4 = this.getPaddingBottom();
      this.setMeasuredDimension(View.resolveSizeAndState(Math.max(var6 + var16 + var17 + var7, this.getSuggestedMinimumWidth()), var1, -16777216 & var8), View.resolveSizeAndState(Math.max(var5 + var3 + var4, this.getSuggestedMinimumHeight()), var2, var8 << 16));
   }

   protected final void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof .no)) {
         super.onRestoreInstanceState(var1);
      } else {
         .no var3 = (.no)var1;
         super.onRestoreInstanceState(var3.d);
         ActionMenuView var4 = this.a;
         .gv var5;
         if (var4 != null) {
            var5 = var4.a;
         } else {
            var5 = null;
         }

         int var2 = var3.a;
         if (var2 != 0 && this.y != null && var5 != null) {
            MenuItem var6 = var5.findItem(var2);
            if (var6 != null) {
               var6.expandActionView();
            }
         }

         if (var3.b) {
            this.removeCallbacks(this.R);
            this.post(this.R);
         }

      }
   }

   public final void onRtlPropertiesChanged(int var1) {
      super.onRtlPropertiesChanged(var1);
      this.k();
      .ms var5 = this.s;
      boolean var4 = var5.g;
      boolean var3 = true;
      if (var1 != 1) {
         var3 = false;
      }

      if (var3 != var4) {
         var5.g = var3;
         if (var5.h) {
            int var2;
            if (var3) {
               var2 = var5.d;
               var1 = var2;
               if (var2 == Integer.MIN_VALUE) {
                  var1 = var5.e;
               }

               var5.a = var1;
               var2 = var5.c;
               var1 = var2;
               if (var2 == Integer.MIN_VALUE) {
                  var1 = var5.f;
               }

               var5.b = var1;
            } else {
               var2 = var5.c;
               var1 = var2;
               if (var2 == Integer.MIN_VALUE) {
                  var1 = var5.e;
               }

               var5.a = var1;
               var2 = var5.d;
               var1 = var2;
               if (var2 == Integer.MIN_VALUE) {
                  var1 = var5.f;
               }

               var5.b = var1;
            }
         } else {
            var5.a = var5.e;
            var5.b = var5.f;
         }
      }
   }

   protected final Parcelable onSaveInstanceState() {
      .no var1 = new .no(super.onSaveInstanceState());
      .nm var2 = this.y;
      if (var2 != null) {
         .gx var3 = var2.b;
         if (var3 != null) {
            var1.a = var3.a;
         }
      }

      var1.b = this.w();
      return var1;
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      int var3 = var1.getActionMasked();
      int var2 = var3;
      if (var3 == 0) {
         this.K = false;
         var2 = 0;
      }

      var3 = var2;
      if (!this.K) {
         boolean var4 = super.onTouchEvent(var1);
         var3 = var2;
         if (var2 == 0) {
            if (!var4) {
               this.K = true;
            }

            var3 = 0;
         }
      }

      if (var3 == 1 || var3 == 3) {
         this.K = false;
      }

      return true;
   }

   public final void p(CharSequence var1) {
      if (!TextUtils.isEmpty(var1)) {
         this.m();
      }

      ImageButton var2 = this.d;
      if (var2 != null) {
         var2.setContentDescription(var1);
         .ns.a(this.d, var1);
      }

   }

   public void q(Drawable var1) {
      ImageButton var2;
      if (var1 != null) {
         this.m();
         if (!this.J(this.d)) {
            this.H(this.d, true);
         }
      } else {
         var2 = this.d;
         if (var2 != null && this.J(var2)) {
            this.removeView(this.d);
            this.v.remove(this.d);
         }
      }

      var2 = this.d;
      if (var2 != null) {
         var2.setImageDrawable(var1);
      }

   }

   public final void r(int var1) {
      if (this.k != var1) {
         this.k = var1;
         if (var1 == 0) {
            this.j = this.getContext();
            return;
         }

         this.j = new ContextThemeWrapper(this.getContext(), var1);
      }

   }

   public final void s(CharSequence var1) {
      TextView var6;
      if (!TextUtils.isEmpty(var1)) {
         if (this.c == null) {
            Context var4 = this.getContext();
            .jq var3 = new .jq(var4);
            this.c = var3;
            var3.setSingleLine();
            this.c.setEllipsize(TruncateAt.END);
            int var2 = this.m;
            if (var2 != 0) {
               this.c.setTextAppearance(var4, var2);
            }

            ColorStateList var5 = this.J;
            if (var5 != null) {
               this.c.setTextColor(var5);
            }
         }

         if (!this.J(this.c)) {
            this.H(this.c, true);
         }
      } else {
         var6 = this.c;
         if (var6 != null && this.J(var6)) {
            this.removeView(this.c);
            this.v.remove(this.c);
         }
      }

      var6 = this.c;
      if (var6 != null) {
         var6.setText(var1);
      }

      this.u = var1;
   }

   public final void t(CharSequence var1) {
      TextView var6;
      if (!TextUtils.isEmpty(var1)) {
         if (this.b == null) {
            Context var4 = this.getContext();
            .jq var3 = new .jq(var4);
            this.b = var3;
            var3.setSingleLine();
            this.b.setEllipsize(TruncateAt.END);
            int var2 = this.l;
            if (var2 != 0) {
               this.b.setTextAppearance(var4, var2);
            }

            ColorStateList var5 = this.I;
            if (var5 != null) {
               this.b.setTextColor(var5);
            }
         }

         if (!this.J(this.b)) {
            this.H(this.b, true);
         }
      } else {
         var6 = this.b;
         if (var6 != null && this.J(var6)) {
            this.removeView(this.b);
            this.v.remove(this.b);
         }
      }

      var6 = this.b;
      if (var6 != null) {
         var6.setText(var1);
      }

      this.t = var1;
   }

   public final void u() {
      OnBackInvokedDispatcher var1 = .nl.b(this);
      if (this.v() && var1 != null && .cga.e(this) && this.B) {
         if (this.Q == null) {
            if (this.P == null) {
               this.P = .nl.a(new .nj(this, 0));
            }

            .nl.c(var1, this.P);
            this.Q = var1;
            return;
         }
      } else {
         var1 = this.Q;
         if (var1 != null) {
            .nl.d(var1, this.P);
            this.Q = null;
            return;
         }
      }

   }

   public final boolean v() {
      .nm var1 = this.y;
      return var1 != null && var1.b != null;
   }

   public final boolean w() {
      ActionMenuView var1 = this.a;
      return var1 != null && var1.m();
   }

   public final boolean x() {
      ActionMenuView var1 = this.a;
      if (var1 != null) {
         .ib var2 = var1.c;
         if (var2 != null && var2.m()) {
            return true;
         }
      }

      return false;
   }

   public final .nr y() {
      if (this.O == null) {
         this.O = new .nr(this, true);
      }

      return this.O;
   }
}
