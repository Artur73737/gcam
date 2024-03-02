package com.google.android.apps.camera.optionsbar.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowInsets;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Set;

public class OptionsMenuContainer extends RelativeLayout {
   public int a;
   public .ktb b;
   public .kge c;
   public final .ktk d;
   public Animator e;
   public final ImageButton f;
   public final Context g;
   public final Set h;
   public boolean i;
   public GestureDetector j;
   public boolean k;
   public final boolean l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;

   public OptionsMenuContainer(Context var1, AttributeSet var2) {
      super(var1, var2);
      boolean var3 = false;
      this.a = 0;
      this.b = .ktb.a;
      this.h = new .xj();
      this.i = false;
      this.k = false;
      this.d = new .ktk(this, false);
      this.f = new ImageButton(var1, (AttributeSet)null, 0, 2132084978);
      this.g = var1;
      boolean var4 = var1 instanceof .efu;
      if (var4 && ((.efu)var1).a().m(.fmd.cq)) {
         var3 = true;
      }

      this.l = var3;
      if (var4) {
         .flx var6 = ((.efu)var1).a();
         .fly var5 = .fmt.a;
         var6.g();
      }

   }

   private final View q() {
      return this.findViewById(2131428012);
   }

   private final View r() {
      return this.findViewById(2131428014);
   }

   public final View a() {
      return this.l ? this.getRootView().findViewById(2131427966) : this.findViewById(2131427915);
   }

   public final View b() {
      return this.l ? this.getRootView().findViewById(2131427967) : this.findViewById(2131427916);
   }

   public final View c() {
      return this.findViewById(2131428011);
   }

   public final RelativeLayout d() {
      return (RelativeLayout)this.findViewById(2131428010);
   }

   public final OptionsMenuView e() {
      return (OptionsMenuView)this.findViewById(2131428015);
   }

   public final OptionsMenuViewContainer f() {
      return (OptionsMenuViewContainer)this.findViewById(2131428013);
   }

   public final void g(.ils var1) {
      this.h.add(var1);
   }

   public final void h() {
      Trace.beginSection("optionsMenuContainer:applyOrientation");
      View var3 = this.q();
      LayoutParams var4 = var3.getLayoutParams();
      int var1 = var4.height;
      int var2 = this.a;
      if (var2 > 0) {
         var4.height = var2;
      } else {
         var4.height = this.getResources().getDimensionPixelSize(2131166647);
      }

      if (var4.height != var1) {
         var3.setLayoutParams(var4);
      }

      LayoutParams var6 = this.q().getLayoutParams();
      var1 = this.a;
      if (var1 > 0) {
         var1 = Math.max(var1, this.o);
      } else {
         var1 = this.n;
      }

      if (var6.height != var1) {
         var6.height = var1;
         this.q().setLayoutParams(var6);
      }

      this.e().e = this.b;
      View var7 = this.c();
      var7.getClass();
      OptionsMenuViewContainer var5 = this.f();
      var5.getClass();
      var3 = this.r();
      var3.getClass();
      var4 = var7.getLayoutParams();
      var4.getClass();
      android.widget.LinearLayout.LayoutParams var10 = (android.widget.LinearLayout.LayoutParams)var4;
      LayoutParams var11 = var5.getLayoutParams();
      var11.getClass();
      var6 = var3.getLayoutParams();
      var6.getClass();
      android.widget.RelativeLayout.LayoutParams var8 = (android.widget.RelativeLayout.LayoutParams)var6;
      if (.kfq.o(this.c)) {
         if (.kge.a.equals(this.c)) {
            var10.gravity = 8388611;
            var8.topMargin = 0;
         } else if (.kge.d.equals(this.c)) {
            var8.topMargin = this.getResources().getDimensionPixelSize(2131165847);
         }

         var10.topMargin = this.getResources().getDimensionPixelSize(2131166980);
         var11.width = this.getResources().getDimensionPixelSize(2131166651);
      } else {
         var10.gravity = 8388613;
         var10.topMargin = this.getResources().getDimensionPixelSize(2131166979);
         var11.width = -1;
         var8.topMargin = 0;
      }

      this.c().setLayoutParams(var10);
      this.f().setLayoutParams(var11);
      this.r().setLayoutParams(var8);
      if (this.n()) {
         this.l(.kge.d.equals(this.c));
      }

      var5 = this.f();
      .kge var12 = this.c;
      .kge var9 = var12;
      if (var12 == null) {
         var9 = .kge.b;
      }

      .ktb var13 = this.b;
      var5.a = var9;
      var5.b = var13;
      .otw var14 = .jbc.ay(var5, var13, false);
      if (var14.h()) {
         Object var15 = var14.c();
         .ksx var16 = new .ksx(var5);
         ((ValueAnimator)var15).addListener(var16);
         ((ValueAnimator)var14.c()).start();
      }

      Trace.endSection();
   }

   public final void i() {
      this.setEnabled(false);
      this.f.setEnabled(false);
   }

   public final void j() {
      this.setEnabled(true);
      this.f.setEnabled(true);
   }

   public final void k() {
      if (this.k) {
         if (this.m()) {
            ((ViewManager)this.f.getParent()).removeView(this.f);
         }

         int var1;
         if (.kfq.o(this.c)) {
            var1 = this.n;
            android.widget.LinearLayout.LayoutParams var3 = new android.widget.LinearLayout.LayoutParams(var1, var1);
            this.f.setLayoutParams(var3);
            ((LinearLayout)this.q()).addView(this.f, 0);
         } else {
            var1 = this.n;
            android.widget.RelativeLayout.LayoutParams var2 = new android.widget.RelativeLayout.LayoutParams(var1, var1);
            var2.addRule(17, this.d().getId());
            this.f.setLayoutParams(var2);
            this.d().addView(this.f);
         }
      }
   }

   public final void l(boolean var1) {
      int var2 = this.g.getColor(2131101636);
      if (.kge.d == this.c) {
         int var3 = this.g.getColor(2131101637);
         if (!var1) {
            var2 = var3;
         }

         var3 -= var2;
         Drawable var4 = this.getBackground();
         if (!(var4 instanceof ColorDrawable) || ((ColorDrawable)var4).getColor() != var3) {
            ObjectAnimator var5 = ObjectAnimator.ofArgb(this, "backgroundColor", new int[]{var2, var3});
            var5.setDuration(250L);
            var5.setInterpolator(new .clf());
            var5.start();
         }
      } else {
         this.setBackgroundColor(var2);
      }
   }

   public final boolean m() {
      return this.f.getParent() != null;
   }

   public final boolean n() {
      return this.f().getVisibility() == 0;
   }

   public final boolean o() {
      return this.i || .kge.d.equals(this.c);
   }

   protected final void onFinishInflate() {
      Trace.beginSection("optionsMenuContainer:inflate");
      super.onFinishInflate();
      this.m = this.getResources().getDimensionPixelSize(2131166978);
      this.n = this.getResources().getDimensionPixelSize(2131166647);
      this.o = this.getResources().getDimensionPixelSize(2131166645);
      int var1 = this.getResources().getDimensionPixelOffset(2131166639);
      this.p = var1 + var1;
      var1 = this.getResources().getDimensionPixelOffset(2131166661);
      this.q = var1 + var1;
      this.r = this.getResources().getDimensionPixelOffset(2131166979);
      this.s = this.getResources().getDimensionPixelSize(2131166658);
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624138, this);
      Trace.endSection();
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1) {
         this.h();
      }

   }

   public final void onMeasure(int var1, int var2) {
      int var4 = MeasureSpec.getMode(var2);
      byte var5 = 0;
      if (var4 == 0) {
         this.e().d = 0;
      } else {
         if (.ktb.d(this.b)) {
            LayoutParams var10 = this.q().getLayoutParams();
            var4 = MeasureSpec.getSize(var2) - var10.height;
         } else {
            var4 = MeasureSpec.getSize(var1);
         }

         int var6 = var4 - this.r - this.m - this.q;
         if (this.e().a() > 0) {
            View var17 = ((ViewGroup)this.e().getChildAt(0)).getChildAt(0);
            if (var17 != null && var17.getMeasuredHeight() > 0) {
               this.s = var17.getMeasuredHeight();
               if (this.e().a() > 1) {
                  var17 = ((ViewGroup)this.e().getChildAt(0)).getChildAt(1);
                  if (var17.getMeasuredHeight() > 0 && var17.getMeasuredHeight() < this.s) {
                     this.s = var17.getMeasuredHeight();
                  }
               }
            }
         }

         int var8 = this.e().a();
         int var7 = this.s;
         .kge var18 = this.c;
         var4 = var6;
         if (var18 != null) {
            var4 = var6;
            if (var18 == .kge.d) {
               var4 = var6 - this.getResources().getDimensionPixelSize(2131165847);
            }
         }

         var6 = this.p;
         if (var4 < var8 * var7 + var6) {
            float var3 = (float)this.s;
            var4 = (int)(((float)((int)((float)(var4 - var6) / var3 - 0.5F)) + 0.5F) * var3) + var6;
         } else {
            var4 = 0;
         }

         this.e().d = var4;
      }

      super.onMeasure(var1, var2);
      var2 = this.getMeasuredWidth();
      .ktb var13 = this.b;
      View var12 = this.b();
      LinearLayout var11 = (LinearLayout)this.q();
      var4 = var11.getGravity();
      WindowInsets var14 = this.getRootWindowInsets();
      DisplayCutout var19;
      if (var14 == null) {
         var19 = null;
      } else {
         var19 = var14.getDisplayCutout();
      }

      var1 = -1;
      if (var14 != null && var19 != null) {
         .ktb var20 = .ktb.a;
         switch(var13.ordinal()) {
         case 0:
            var1 = var19.getBoundingRectTop().centerX();
            break;
         case 1:
            var1 = var19.getBoundingRectLeft().centerY();
            break;
         case 2:
            var1 = var19.getBoundingRectRight().centerY();
            break;
         case 3:
            var1 = var19.getBoundingRectBottom().centerX();
            break;
         default:
            var1 = var5;
         }

         var1 = Math.abs(var1 - var2 / 2);
      }

      boolean var9 = .kfq.o(this.c);
      byte var15 = 19;
      byte var16;
      if (!var9) {
         if (var1 >= 0 && var1 < var12.getWidth()) {
            var16 = var15;
         } else {
            var16 = 17;
         }
      } else {
         var16 = var15;
      }

      if (var4 != var16) {
         var11.setGravity(var16);
      }

   }

   public final boolean onTouchEvent(MotionEvent var1) {
      return false;
   }

   public final boolean p() {
      .ktk var2 = this.d;
      int var1 = var2.b;
      if (var1 != 0) {
         switch(var1 - 1) {
         case 0:
            return true;
         case 2:
            if (var2.a.getVisibility() == 0) {
               return true;
            }
         case 1:
            return false;
         default:
            throw new IllegalStateException("Should never be here");
         }
      } else {
         throw null;
      }
   }
}
