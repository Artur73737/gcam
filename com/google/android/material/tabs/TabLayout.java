package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import android.widget.FrameLayout.LayoutParams;
import androidx.viewpager.widget.ViewPager;
import androidx.window.area.reflectionguard.TU.aGGlrXh;
import com.google.android.apps.camera.ui.popupmenu.lol.nJwt;
import com.google.lullaby.modules.audio.nwj.OtvMV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@.cvh
public class TabLayout extends HorizontalScrollView {
   private static final .cez C = new .cfb(16);
   public int A;
   public .onk B;
   private final ArrayList D;
   private .ooq E;
   private int F;
   private final int G;
   private final int H;
   private final int I;
   private int J;
   private final ArrayList K;
   private .oom L;
   private ValueAnimator M;
   private .oor N;
   private boolean O;
   private final .cez P;
   private .onk Q;
   public int a;
   final .oop b;
   public int c;
   public int d;
   public int e;
   public int f;
   public final int g;
   public final int h;
   public int i;
   public ColorStateList j;
   public ColorStateList k;
   public Drawable l;
   public float m;
   public float n;
   public final int o;
   public int p;
   public int q;
   int r;
   public int s;
   public int t;
   public boolean u;
   public boolean v;
   int w;
   public boolean x;
   public final TimeInterpolator y;
   ViewPager z;

   public TabLayout(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public TabLayout(Context var1, AttributeSet var2) {
      this(var1, var2, 2130970211);
   }

   public TabLayout(Context var1, AttributeSet var2, int var3) {
      super(.ope.a(var1, var2, var3, 2132084235), var2, var3);
      this.a = -1;
      this.D = new ArrayList();
      this.i = -1;
      this.F = 0;
      this.p = Integer.MAX_VALUE;
      this.w = -1;
      this.K = new ArrayList();
      this.P = new .cfa(12);
      Context var6 = this.getContext();
      this.setHorizontalScrollBarEnabled(false);
      .oop var5 = new .oop(this, var6);
      this.b = var5;
      super.addView(var5, 0, new LayoutParams(-2, -1));
      TypedArray var7 = .oli.a(var6, var2, .ook.a, var3, 2132084235, 24);
      if (this.getBackground() instanceof ColorDrawable) {
         ColorDrawable var22 = (ColorDrawable)this.getBackground();
         .onm var20 = new .onm();
         var20.j(ColorStateList.valueOf(var22.getColor()));
         var20.h(var6);
         var20.i(.cgd.a(this));
         .cfx.m(this, var20);
      }

      Drawable var23 = .oik.q(var6, var7, 5);
      Object var21 = var23;
      if (var23 == null) {
         var21 = new GradientDrawable();
      }

      Drawable var24 = ((Drawable)var21).mutate();
      this.l = var24;
      .oik.j(var24, this.F);
      int var4 = this.w;
      var3 = var4;
      if (var4 == -1) {
         var3 = this.l.getIntrinsicHeight();
      }

      var5.b(var3);
      var3 = var7.getColor(8, 0);
      this.F = var3;
      .oik.j(this.l, var3);
      this.k(false);
      var5.b(var7.getDimensionPixelSize(11, -1));
      var3 = var7.getInt(10, 0);
      if (this.s != var3) {
         this.s = var3;
         .cfx.g(var5);
      }

      label438: {
         var3 = var7.getInt(7, 0);
         switch(var3) {
         case 0:
            this.B = new .onk((byte[])null, (byte[])null);
            break label438;
         case 1:
            var21 = new .ooi();
            break;
         case 2:
            var21 = new .ooj();
            break;
         default:
            StringBuilder var29 = new StringBuilder();
            var29.append(var3);
            var29.append(nJwt.hiB);
            throw new IllegalArgumentException(var29.toString());
         }

         this.B = (.onk)var21;
      }

      this.v = var7.getBoolean(9, true);
      var5.a();
      .cfx.g(var5);
      var3 = var7.getDimensionPixelSize(16, 0);
      this.f = var3;
      this.e = var3;
      this.d = var3;
      this.c = var3;
      this.c = var7.getDimensionPixelSize(19, var3);
      this.d = var7.getDimensionPixelSize(20, this.d);
      this.e = var7.getDimensionPixelSize(18, this.e);
      this.f = var7.getDimensionPixelSize(17, this.f);
      if (.oli.d(var6)) {
         this.g = 2130970264;
      } else {
         this.g = 2130970228;
      }

      var3 = var7.getResourceId(24, 2132083448);
      this.h = var3;
      TypedArray var27 = var6.obtainStyledAttributes(var3, .fq.w);

      try {
         this.m = (float)var27.getDimensionPixelSize(0, 0);
         this.j = .oik.p(var6, var27, 3);
      } finally {
         var27.recycle();
      }

      if (var7.hasValue(22)) {
         this.i = var7.getResourceId(22, var3);
      }

      var3 = this.i;
      if (var3 != -1) {
         var27 = var6.obtainStyledAttributes(var3, .fq.w);

         label427: {
            Throwable var10000;
            label450: {
               boolean var10001;
               ColorStateList var25;
               try {
                  var27.getDimensionPixelSize(0, (int)this.m);
                  var25 = .oik.p(var6, var27, 3);
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label450;
               }

               if (var25 == null) {
                  break label427;
               }

               label422:
               try {
                  var4 = this.j.getDefaultColor();
                  var3 = var25.getDefaultColor();
                  this.j = o(var4, var25.getColorForState(new int[]{16842913}, var3));
                  break label427;
               } catch (Throwable var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label422;
               }
            }

            Throwable var26 = var10000;
            var27.recycle();
            throw var26;
         }

         var27.recycle();
      }

      if (var7.hasValue(25)) {
         this.j = .oik.p(var6, var7, 25);
      }

      if (var7.hasValue(23)) {
         var3 = var7.getColor(23, 0);
         this.j = o(this.j.getDefaultColor(), var3);
      }

      .oik.p(var6, var7, 3);
      var7.getInt(4, -1);
      this.k = .oik.p(var6, var7, 21);
      this.r = var7.getInt(6, 300);
      this.y = .oik.w(var6, 2130969792, .oia.b);
      this.G = var7.getDimensionPixelSize(14, -1);
      this.H = var7.getDimensionPixelSize(13, -1);
      this.o = var7.getResourceId(0, 0);
      this.J = var7.getDimensionPixelSize(1, 0);
      this.t = var7.getInt(15, 1);
      this.q = var7.getInt(2, 0);
      this.u = var7.getBoolean(12, false);
      this.x = var7.getBoolean(26, false);
      var7.recycle();
      Resources var28 = this.getResources();
      this.n = (float)var28.getDimensionPixelSize(2131165481);
      this.I = var28.getDimensionPixelSize(2131165479);
      var3 = this.t;
      if (var3 != 0 && var3 != 2) {
         var3 = 0;
      } else {
         var3 = Math.max(0, this.J - this.c);
      }

      .cfy.j(var5, var3, 0, 0, 0);
      label395:
      switch(this.t) {
      case 0:
         switch(this.q) {
         case 0:
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
         case 2:
            var5.setGravity(8388611);
            break label395;
         case 1:
            var5.setGravity(1);
         default:
            break label395;
         }
      case 1:
      case 2:
         if (this.q == 2) {
            Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
         }

         var5.setGravity(1);
      }

      this.k(true);
   }

   private final int m(int var1, float var2) {
      int var5 = this.t;
      byte var4 = 0;
      if (var5 != 0 && var5 != 2) {
         return 0;
      } else {
         View var9 = this.b.getChildAt(var1);
         if (var9 == null) {
            return 0;
         } else {
            ++var1;
            View var8;
            if (var1 < this.b.getChildCount()) {
               var8 = this.b.getChildAt(var1);
            } else {
               var8 = null;
            }

            var5 = var9.getWidth();
            if (var8 != null) {
               var1 = var8.getWidth();
            } else {
               var1 = var4;
            }

            int var7 = var9.getLeft();
            int var10 = var5 / 2;
            int var6 = this.getWidth() / 2;
            float var3 = (float)(var5 + var1);
            var1 = .cfy.c(this);
            var10 = var7 + var10 - var6;
            var5 = (int)(var3 * 0.5F * var2);
            if (var1 == 0) {
               var1 = var10 + var5;
            } else {
               var1 = var10 - var5;
            }

            return var1;
         }
      }
   }

   private final int n() {
      int var1 = this.G;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = this.t;
         return var1 != 0 && var1 != 2 ? 0 : this.I;
      }
   }

   private static ColorStateList o(int var0, int var1) {
      return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{var1, var0});
   }

   private final void p(View var1) {
      if (var1 instanceof .ool) {
         .ool var3 = (.ool)var1;
         .ooq var5 = this.d();
         CharSequence var4 = var3.a;
         Drawable var6 = var3.b;
         int var2 = var3.c;
         if (!TextUtils.isEmpty(var3.getContentDescription())) {
            var5.c = var3.getContentDescription();
            var5.b();
         }

         this.f(var5, this.D.isEmpty());
      } else {
         throw new IllegalArgumentException(aGGlrXh.YcK);
      }
   }

   private final void q(int var1) {
      if (var1 != -1) {
         if (this.getWindowToken() != null && .cga.f(this)) {
            .oop var4 = this.b;
            int var3 = var4.getChildCount();
            int var2 = 0;

            while(true) {
               if (var2 >= var3) {
                  var2 = this.getScrollX();
                  var3 = this.m(var1, 0.0F);
                  if (var2 != var3) {
                     if (this.M == null) {
                        ValueAnimator var6 = new ValueAnimator();
                        this.M = var6;
                        var6.setInterpolator(this.y);
                        this.M.setDuration((long)this.r);
                        this.M.addUpdateListener(new .oiz(this, 2));
                     }

                     this.M.setIntValues(new int[]{var2, var3});
                     this.M.start();
                  }

                  var4 = this.b;
                  var2 = this.r;
                  ValueAnimator var5 = var4.a;
                  if (var5 != null && var5.isRunning() && var4.b.a != var1) {
                     var4.a.cancel();
                  }

                  var4.d(true, var1, var2);
                  return;
               }

               if (var4.getChildAt(var2).getWidth() <= 0) {
                  break;
               }

               ++var2;
            }
         }

         this.l(var1);
      }
   }

   private final void r(int var1) {
      int var4 = this.b.getChildCount();
      if (var1 < var4) {
         for(int var2 = 0; var2 < var4; ++var2) {
            View var6 = this.b.getChildAt(var2);
            boolean var3;
            if (var2 == var1) {
               var3 = false;
            } else {
               var3 = true;
            }

            boolean var5;
            if ((var2 != var1 || var6.isSelected()) && (var2 == var1 || !var6.isSelected())) {
               var5 = var3 ^ true;
               var6.setSelected(var5);
               var6.setActivated(var5);
            } else {
               var5 = var3 ^ true;
               var6.setSelected(var5);
               var6.setActivated(var5);
               if (var6 instanceof .oos) {
                  ((.oos)var6).c();
               }
            }
         }
      }

   }

   private final void s(android.widget.LinearLayout.LayoutParams var1) {
      if (this.t == 1 && this.q == 0) {
         var1.width = 0;
         var1.weight = 1.0F;
      } else {
         var1.width = -2;
         var1.weight = 0.0F;
      }
   }

   private final boolean t() {
      int var1 = this.t;
      return var1 == 0 || var1 == 2;
   }

   private final void u(ViewPager var1, boolean var2) {
      ViewPager var4 = this.z;
      .oor var3;
      .onk var5;
      if (var4 != null) {
         var3 = this.N;
         List var7;
         if (var3 != null) {
            var7 = var4.d;
            if (var7 != null) {
               var7.remove(var3);
            }
         }

         var5 = this.Q;
         if (var5 != null) {
            var7 = this.z.e;
            if (var7 != null) {
               var7.remove(var5);
            }
         }
      }

      .oom var6 = this.L;
      if (var6 != null) {
         this.K.remove(var6);
         this.L = null;
      }

      if (var1 != null) {
         this.z = var1;
         if (this.N == null) {
            this.N = new .oor(this);
         }

         var3 = this.N;
         var3.b = 0;
         var3.a = 0;
         if (var1.d == null) {
            var1.d = new ArrayList();
         }

         var1.d.add(var3);
         .oow var8 = new .oow(var1, 1);
         this.L = var8;
         this.e(var8);
         if (this.Q == null) {
            this.Q = new .onk();
         }

         var5 = this.Q;
         if (var1.e == null) {
            var1.e = new ArrayList();
         }

         var1.e.add(var5);
         this.l(0);
      } else {
         this.z = null;
         this.g();
      }

      this.O = var2;
   }

   public final int a() {
      .ooq var1 = this.E;
      return var1 != null ? var1.d : -1;
   }

   public final void addView(View var1) {
      this.p(var1);
   }

   public final void addView(View var1, int var2) {
      this.p(var1);
   }

   public final void addView(View var1, int var2, android.view.ViewGroup.LayoutParams var3) {
      this.p(var1);
   }

   public final void addView(View var1, android.view.ViewGroup.LayoutParams var2) {
      this.p(var1);
   }

   public final int b() {
      return this.D.size();
   }

   public final .ooq c(int var1) {
      return var1 >= 0 && var1 < this.b() ? (.ooq)this.D.get(var1) : null;
   }

   public final .ooq d() {
      .ooq var1 = (.ooq)C.a();
      .ooq var2 = var1;
      if (var1 == null) {
         var2 = new .ooq();
      }

      var2.g = this;
      .cez var4 = this.P;
      .oos var5;
      if (var4 != null) {
         var5 = (.oos)var4.a();
      } else {
         var5 = null;
      }

      .oos var3 = var5;
      if (var5 == null) {
         var3 = new .oos(this, this.getContext());
      }

      var3.a(var2);
      var3.setFocusable(true);
      var3.setMinimumWidth(this.n());
      if (TextUtils.isEmpty(var2.c)) {
         var3.setContentDescription(var2.b);
      } else {
         var3.setContentDescription(var2.c);
      }

      var2.h = var3;
      if (var2.i != -1) {
         var2.h.setId(0);
      }

      return var2;
   }

   @Deprecated
   public final void e(.oom var1) {
      if (!this.K.contains(var1)) {
         this.K.add(var1);
      }

   }

   public final void f(.ooq var1, boolean var2) {
      int var3 = this.D.size();
      if (var1.g == this) {
         var1.d = var3;
         this.D.add(var3, var1);
         int var5 = this.D.size();
         ++var3;

         int var4;
         for(var4 = -1; var3 < var5; ((.ooq)this.D.get(var3)).d = var3++) {
            if (((.ooq)this.D.get(var3)).d == this.a) {
               var4 = var3;
            }
         }

         this.a = var4;
         .oos var8 = var1.h;
         var8.setSelected(false);
         var8.setActivated(false);
         .oop var6 = this.b;
         var3 = var1.d;
         android.widget.LinearLayout.LayoutParams var7 = new android.widget.LinearLayout.LayoutParams(-2, -1);
         this.s(var7);
         var6.addView(var8, var3, var7);
         if (var2) {
            var1.a();
         }
      } else {
         IllegalArgumentException var9 = new IllegalArgumentException(OtvMV.aiw);
         throw var9;
      }
   }

   public final void g() {
      for(int var1 = this.b.getChildCount() - 1; var1 >= 0; --var1) {
         .oos var2 = (.oos)this.b.getChildAt(var1);
         this.b.removeViewAt(var1);
         if (var2 != null) {
            var2.a((.ooq)null);
            var2.setSelected(false);
            this.P.b(var2);
         }

         this.requestLayout();
      }

      Iterator var4 = this.D.iterator();

      while(var4.hasNext()) {
         .ooq var3 = (.ooq)var4.next();
         var4.remove();
         var3.g = null;
         var3.h = null;
         var3.a = null;
         var3.i = -1;
         var3.b = null;
         var3.c = null;
         var3.d = -1;
         var3.e = null;
         C.b(var3);
      }

      this.E = null;
   }

   // $FF: synthetic method
   public final android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet var1) {
      return this.generateDefaultLayoutParams();
   }

   public final LayoutParams generateLayoutParams(AttributeSet var1) {
      return this.generateDefaultLayoutParams();
   }

   public final void h(.ooq var1) {
      this.i(var1, true);
   }

   public final void i(.ooq var1, boolean var2) {
      .ooq var4 = this.E;
      int var3;
      if (var4 == var1) {
         if (var4 != null) {
            for(var3 = this.K.size() - 1; var3 >= 0; --var3) {
               ((.oom)this.K.get(var3)).c();
            }

            this.q(var1.d);
            return;
         }
      } else {
         if (var1 != null) {
            var3 = var1.d;
         } else {
            var3 = -1;
         }

         if (var2) {
            if ((var4 == null || var4.d == -1) && var3 != -1) {
               this.l(var3);
            } else {
               this.q(var3);
            }

            if (var3 != -1) {
               this.r(var3);
            }
         }

         this.E = var1;
         if (var4 != null && var4.g != null) {
            for(var3 = this.K.size() - 1; var3 >= 0; --var3) {
               ((.oom)this.K.get(var3)).b(var4);
            }
         }

         if (var1 != null) {
            for(var3 = this.K.size() - 1; var3 >= 0; --var3) {
               ((.oom)this.K.get(var3)).a(var1);
            }
         }
      }

   }

   public final void j(int var1, float var2, boolean var3, boolean var4, boolean var5) {
      float var6 = (float)var1 + var2;
      int var9 = Math.round(var6);
      if (var9 >= 0 && var9 < this.b.getChildCount()) {
         ValueAnimator var11;
         if (var4) {
            .oop var12 = this.b;
            var12.b.a = Math.round(var6);
            var11 = var12.a;
            if (var11 != null && var11.isRunning()) {
               var12.a.cancel();
            }

            var12.c(var12.getChildAt(var1), var12.getChildAt(var1 + 1), var2);
         }

         var11 = this.M;
         if (var11 != null && var11.isRunning()) {
            this.M.cancel();
         }

         int var8 = this.m(var1, var2);
         int var10 = this.getScrollX();
         boolean var7;
         if (var1 < this.a() && var8 >= var10 || var1 > this.a() && var8 <= var10) {
            var7 = true;
         } else if (var1 == this.a()) {
            var7 = true;
         } else {
            var7 = false;
         }

         if (.cfy.c(this) == 1) {
            if (var1 < this.a() && var8 <= var10 || var1 > this.a() && var8 >= var10) {
               var7 = true;
            } else if (var1 == this.a()) {
               var7 = true;
            } else {
               var7 = false;
            }
         }

         if (var7 || this.A == 1 || var5) {
            if (var1 < 0) {
               var1 = 0;
            } else {
               var1 = var8;
            }

            this.scrollTo(var1, 0);
         }

         if (var3) {
            this.r(var9);
         }

      }
   }

   public final void k(boolean var1) {
      for(int var2 = 0; var2 < this.b.getChildCount(); ++var2) {
         View var3 = this.b.getChildAt(var2);
         var3.setMinimumWidth(this.n());
         this.s((android.widget.LinearLayout.LayoutParams)var3.getLayoutParams());
         if (var1) {
            var3.requestLayout();
         }
      }

   }

   public final void l(int var1) {
      this.j(var1, 0.0F, true, true, true);
   }

   protected final void onAttachedToWindow() {
      super.onAttachedToWindow();
      .onk.d(this);
      if (this.z == null) {
         ViewParent var1 = this.getParent();
         if (var1 instanceof ViewPager) {
            this.u((ViewPager)var1, true);
         }
      }

   }

   protected final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      if (this.O) {
         this.u((ViewPager)null, false);
         this.O = false;
      }

   }

   protected final void onDraw(Canvas var1) {
      for(int var2 = 0; var2 < this.b.getChildCount(); ++var2) {
         View var3 = this.b.getChildAt(var2);
         if (var3 instanceof .oos) {
            .oos var5 = (.oos)var3;
            Drawable var4 = var5.c;
            if (var4 != null) {
               var4.setBounds(var5.getLeft(), var5.getTop(), var5.getRight(), var5.getBottom());
               var5.c.draw(var1);
            }
         }
      }

      super.onDraw(var1);
   }

   public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      super.onInitializeAccessibilityNodeInfo(var1);
      .cht.b(var1).n(.dmx.n(1, this.b(), 1));
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      return this.t() && super.onInterceptTouchEvent(var1);
   }

   protected final void onMeasure(int var1, int var2) {
      Context var6 = this.getContext();
      int var5 = this.D.size();
      boolean var4 = false;

      int var3;
      for(var3 = 0; var3 < var5; ++var3) {
         .ooq var7 = (.ooq)this.D.get(var3);
      }

      var5 = Math.round(.oik.x(var6, 48));
      switch(MeasureSpec.getMode(var2)) {
      case Integer.MIN_VALUE:
         var3 = var2;
         if (this.getChildCount() == 1) {
            var3 = var2;
            if (MeasureSpec.getSize(var2) >= var5) {
               this.getChildAt(0).setMinimumHeight(var5);
               var3 = var2;
            }
         }
         break;
      case 0:
         var3 = MeasureSpec.makeMeasureSpec(var5 + this.getPaddingTop() + this.getPaddingBottom(), 1073741824);
         break;
      default:
         var3 = var2;
      }

      var5 = MeasureSpec.getSize(var1);
      if (MeasureSpec.getMode(var1) != 0) {
         var2 = this.H;
         if (var2 <= 0) {
            var2 = (int)((float)var5 - .oik.x(this.getContext(), 56));
         }

         this.p = var2;
      }

      super.onMeasure(var1, var3);
      if (this.getChildCount() == 1) {
         View var9 = this.getChildAt(0);
         boolean var8;
         switch(this.t) {
         case 0:
         case 2:
            var8 = var4;
            if (var9.getMeasuredWidth() < this.getMeasuredWidth()) {
               var8 = true;
            }
            break;
         case 1:
            if (var9.getMeasuredWidth() != this.getMeasuredWidth()) {
               var8 = true;
            } else {
               var8 = var4;
            }
            break;
         default:
            return;
         }

         if (var8) {
            var1 = getChildMeasureSpec(var3, this.getPaddingTop() + this.getPaddingBottom(), var9.getLayoutParams().height);
            var9.measure(MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824), var1);
            return;
         }
      }

   }

   public final boolean onTouchEvent(MotionEvent var1) {
      return var1.getActionMasked() == 8 && !this.t() ? false : super.onTouchEvent(var1);
   }

   public final void setElevation(float var1) {
      super.setElevation(var1);
      .onk.c(this, var1);
   }

   public final boolean shouldDelayChildPressedState() {
      return Math.max(0, this.b.getWidth() - this.getWidth() - this.getPaddingLeft() - this.getPaddingRight()) > 0;
   }
}
