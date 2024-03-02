package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView.ScaleType;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.wear.ambient.AmbientMode$AmbientController;

public class FloatingActionButton extends .oln implements .ooa, .cay {
   public int a;
   public boolean b;
   public final Rect c;
   private ColorStateList e;
   private Mode f;
   private ColorStateList g;
   private int h;
   private int i;
   private int j;
   private int k;
   private final Rect l;
   private final .ip m;
   private final .okd n;
   private .oku o;

   public FloatingActionButton(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public FloatingActionButton(Context var1, AttributeSet var2) {
      this(var1, var2, 2130969287);
   }

   public FloatingActionButton(Context var1, AttributeSet var2, int var3) {
      super(.ope.a(var1, var2, var3, 2132084231), var2, var3);
      this.c = new Rect();
      this.l = new Rect();
      Context var17 = this.getContext();
      TypedArray var20 = .oli.a(var17, var2, .okx.b, var3, 2132084231);
      this.e = .oik.p(var17, var20, 1);
      this.f = .c.l(var20.getInt(2, -1), (Mode)null);
      this.g = .oik.p(var17, var20, 12);
      this.i = var20.getInt(7, -1);
      this.j = var20.getDimensionPixelSize(6, 0);
      this.h = var20.getDimensionPixelSize(3, 0);
      float var4 = var20.getDimension(4, 0.0F);
      float var5 = var20.getDimension(9, 0.0F);
      float var8 = var20.getDimension(11, 0.0F);
      this.b = var20.getBoolean(16, false);
      int var9 = this.getResources().getDimensionPixelSize(2131166487);
      int var10 = var20.getDimensionPixelSize(10, 0);
      this.k = var10;
      .oku var15 = this.i();
      if (var15.z != var10) {
         var15.z = var10;
         var15.j();
      }

      .oid var16 = .oid.a(var17, var20, 15);
      .oid var27 = .oid.a(var17, var20, 8);
      .onr var28 = .onr.b(var17, var2, var3, 2132084231, .onr.a).a();
      boolean var14 = var20.getBoolean(5, false);
      this.setEnabled(var20.getBoolean(0, true));
      var20.recycle();
      .ip var21 = new .ip(this);
      this.m = var21;
      var21.c(var2, var3);
      this.n = new .okd(this);
      this.i().i(var28);
      .oku var29 = this.i();
      ColorStateList var22 = this.e;
      Mode var18 = this.f;
      ColorStateList var23 = this.g;
      int var11 = this.h;
      .okw var30 = (.okw)var29;
      .onr var19 = var30.l;
      .cby.g(var19);
      var30.m = new .okv(var19);
      var30.m.setTintList(var22);
      if (var18 != null) {
         var30.m.setTintMode(var18);
      }

      var30.m.h(var30.B.getContext());
      Object var25;
      if (var11 > 0) {
         Context var31 = var30.B.getContext();
         var19 = var30.l;
         .cby.g(var19);
         .okf var33 = new .okf(var19);
         int var13 = .cci.a(var31, 2131099818);
         var3 = .cci.a(var31, 2131099817);
         var10 = .cci.a(var31, 2131099815);
         int var12 = .cci.a(var31, 2131099816);
         var33.c = var13;
         var33.d = var3;
         var33.e = var10;
         var33.f = var12;
         float var7 = var33.b;
         float var6 = (float)var11;
         if (var7 != var6) {
            var33.b = var6;
            var33.a.setStrokeWidth(var6 * 1.3333F);
            var33.g = true;
            var33.invalidateSelf();
         }

         var33.b(var22);
         var30.o = var33;
         .okf var24 = var30.o;
         .cby.g(var24);
         .onm var32 = var30.m;
         .cby.g(var32);
         var25 = new LayerDrawable(new Drawable[]{var24, var32});
      } else {
         var30.o = null;
         var25 = var30.m;
      }

      var30.n = new RippleDrawable(.one.b(var23), (Drawable)var25, (Drawable)null);
      var30.p = var30.n;
      this.i().u = var9;
      .oku var26 = this.i();
      if (var26.r != var4) {
         var26.r = var4;
         var26.g(var4, var26.s, var26.t);
      }

      var26 = this.i();
      if (var26.s != var5) {
         var26.s = var5;
         var26.g(var26.r, var5, var26.t);
      }

      var26 = this.i();
      if (var26.t != var8) {
         var26.t = var8;
         var26.g(var26.r, var26.s, var8);
      }

      this.i().w = var16;
      this.i().x = var27;
      this.i().q = var14;
      this.setScaleType(ScaleType.MATRIX);
   }

   // $FF: synthetic method
   public static void d(FloatingActionButton var0, Drawable var1) {
      var0.setBackgroundDrawable(var1);
   }

   private final int h(int var1) {
      int var2 = this.j;
      if (var2 != 0) {
         return var2;
      } else {
         Resources var3 = this.getResources();
         switch(var1) {
         case -1:
            if (Math.max(var3.getConfiguration().screenWidthDp, var3.getConfiguration().screenHeightDp) < 470) {
               var1 = this.h(1);
            } else {
               var1 = this.h(0);
            }

            return var1;
         case 0:
         default:
            return var3.getDimensionPixelSize(2131165455);
         case 1:
            return var3.getDimensionPixelSize(2131165454);
         }
      }
   }

   private final .oku i() {
      if (this.o == null) {
         this.o = new .okw(this, new AmbientMode$AmbientController(this));
      }

      return this.o;
   }

   public final .caz a() {
      return new FloatingActionButton$Behavior();
   }

   public final int b() {
      return this.h(this.i);
   }

   public final void c(.onr var1) {
      this.i().i(var1);
   }

   protected final void drawableStateChanged() {
      super.drawableStateChanged();
      this.i();
      this.getDrawableState();
   }

   final void e() {
      .oku var2 = this.i();
      if (var2.B.getVisibility() == 0) {
         if (var2.A == 1) {
            return;
         }
      } else if (var2.A != 2) {
         return;
      }

      Animator var1 = var2.v;
      if (var1 != null) {
         var1.cancel();
      }

      if (var2.n()) {
         .oid var3 = var2.x;
         AnimatorSet var4;
         if (var3 != null) {
            var4 = var2.c(var3, 0.0F, 0.0F, 0.0F);
         } else {
            var4 = var2.d(0.0F, 0.4F, 0.4F, .oku.d, .oku.e);
         }

         var4.addListener(new .okl(var2));
         var4.start();
      } else {
         var2.B.g(4, false);
      }
   }

   final void f() {
      .oku var3 = this.i();
      if (var3.B.getVisibility() != 0) {
         if (var3.A == 2) {
            return;
         }
      } else if (var3.A != 1) {
         return;
      }

      Animator var2 = var3.v;
      if (var2 != null) {
         var2.cancel();
      }

      .oid var5 = var3.w;
      if (var3.n()) {
         if (var3.B.getVisibility() != 0) {
            FloatingActionButton var4 = var3.B;
            float var1 = 0.0F;
            var4.setAlpha(0.0F);
            var4 = var3.B;
            if (var5 == null) {
               var1 = 0.4F;
            }

            var4.setScaleY(var1);
            var3.B.setScaleX(var1);
            var3.h(var1);
         }

         var5 = var3.w;
         AnimatorSet var6;
         if (var5 != null) {
            var6 = var3.c(var5, 1.0F, 1.0F, 1.0F);
         } else {
            var6 = var3.d(1.0F, 1.0F, 1.0F, .oku.b, .oku.c);
         }

         var6.addListener(new .okm(var3));
         var6.start();
      } else {
         var3.B.g(0, false);
         var3.B.setAlpha(1.0F);
         var3.B.setScaleY(1.0F);
         var3.B.setScaleX(1.0F);
         var3.h(1.0F);
      }
   }

   public final ColorStateList getBackgroundTintList() {
      return this.e;
   }

   public final Mode getBackgroundTintMode() {
      return this.f;
   }

   public final void jumpDrawablesToCurrentState() {
      super.jumpDrawablesToCurrentState();
      this.i();
   }

   protected final void onAttachedToWindow() {
      super.onAttachedToWindow();
      .oku var1 = this.i();
      .onm var2 = var1.m;
      if (var2 != null) {
         .onk.e(var1.B, var2);
      }

   }

   protected final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      .oku var1 = this.i();
      var1.B.getViewTreeObserver();
      OnPreDrawListener var2 = var1.C;
   }

   protected final void onMeasure(int var1, int var2) {
      int var3 = this.b();
      this.a = (var3 - this.k) / 2;
      this.i().k();
      var1 = Math.min(View.resolveSize(var3, var1), View.resolveSize(var3, var2));
      this.setMeasuredDimension(this.c.left + var1 + this.c.right, var1 + this.c.top + this.c.bottom);
   }

   protected final void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof .ooh)) {
         super.onRestoreInstanceState(var1);
      } else {
         .ooh var2 = (.ooh)var1;
         super.onRestoreInstanceState(var2.d);
         .okd var3 = this.n;
         Bundle var4 = (Bundle)var2.a.get("expandableWidgetHelper");
         .cby.g(var4);
         var3.b = var4.getBoolean("expanded", false);
         var3.c = var4.getInt("expandedComponentIdHint", 0);
         if (var3.b) {
            ViewParent var5 = var3.a.getParent();
            if (var5 instanceof CoordinatorLayout) {
               ((CoordinatorLayout)var5).b(var3.a);
            }
         }

      }
   }

   protected final Parcelable onSaveInstanceState() {
      Parcelable var2 = super.onSaveInstanceState();
      Object var1 = var2;
      if (var2 == null) {
         var1 = new Bundle();
      }

      .ooh var3 = new .ooh((Parcelable)var1);
      .xo var6 = var3.a;
      .okd var4 = this.n;
      Bundle var5 = new Bundle();
      var5.putBoolean("expanded", var4.b);
      var5.putInt("expandedComponentIdHint", var4.c);
      var6.put("expandableWidgetHelper", var5);
      return var3;
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      if (var1.getAction() == 0) {
         Rect var3 = this.l;
         var3.set(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
         var3.left += this.c.left;
         var3.top += this.c.top;
         var3.right -= this.c.right;
         var3.bottom -= this.c.bottom;
         int var2 = -this.o.b();
         var3.inset(var2, var2);
         if (!this.l.contains((int)var1.getX(), (int)var1.getY())) {
            return false;
         }
      }

      return super.onTouchEvent(var1);
   }

   public final void setBackgroundColor(int var1) {
   }

   public final void setBackgroundDrawable(Drawable var1) {
   }

   public final void setBackgroundResource(int var1) {
   }

   public final void setBackgroundTintList(ColorStateList var1) {
      if (this.e != var1) {
         this.e = var1;
         .oku var3 = this.i();
         .onm var2 = var3.m;
         if (var2 != null) {
            var2.setTintList(var1);
         }

         .okf var4 = var3.o;
         if (var4 != null) {
            var4.b(var1);
         }
      }

   }

   public final void setBackgroundTintMode(Mode var1) {
      if (this.f != var1) {
         this.f = var1;
         .onm var2 = this.i().m;
         if (var2 != null) {
            var2.setTintMode(var1);
         }
      }

   }

   public final void setElevation(float var1) {
      super.setElevation(var1);
      this.i().l(var1);
   }

   public final void setImageDrawable(Drawable var1) {
      if (this.getDrawable() != var1) {
         super.setImageDrawable(var1);
         this.i().j();
      }

   }

   public final void setImageResource(int var1) {
      this.m.e(var1);
      Drawable var2 = this.getDrawable();
      if (var2 != null) {
         var2.clearColorFilter();
      }
   }

   public final void setScaleX(float var1) {
      super.setScaleX(var1);
      this.i();
   }

   public final void setScaleY(float var1) {
      super.setScaleY(var1);
      this.i();
   }

   public final void setTranslationX(float var1) {
      super.setTranslationX(var1);
      this.i();
   }

   public final void setTranslationY(float var1) {
      super.setTranslationY(var1);
      this.i();
   }

   public final void setTranslationZ(float var1) {
      super.setTranslationZ(var1);
      this.i();
   }
}
