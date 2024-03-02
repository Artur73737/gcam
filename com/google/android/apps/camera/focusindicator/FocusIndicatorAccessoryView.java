package com.google.android.apps.camera.focusindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import j$.time.Duration;
import java.util.HashMap;

public final class FocusIndicatorAccessoryView extends .io {
   public View a;
   private final Duration b;
   private Animator c = new AnimatorSet();

   FocusIndicatorAccessoryView(Context var1) {
      super(var1);
      this.b = Duration.ofMillis((long)var1.getResources().getInteger(2131492867));
   }

   public FocusIndicatorAccessoryView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.b = Duration.ofMillis((long)var1.getResources().getInteger(2131492867));
   }

   public final void a() {
      this.c.cancel();
   }

   public final void b() {
      Animator var1 = AnimatorInflater.loadAnimator(this.getContext(), 17498112);
      this.c = var1;
      var1.setDuration(this.b.toMillis());
      this.c.setTarget(this);
      this.c.addListener(new .gav(this));
      this.c.start();
   }

   public final void c(boolean var1) {
      if (var1) {
         Animator var2 = AnimatorInflater.loadAnimator(this.getContext(), 17498113);
         this.c = var2;
         var2.setDuration(this.b.toMillis());
         this.c.setTarget(this);
         this.c.addListener(new .gaw(this));
         this.c.start();
      } else {
         this.setVisibility(8);
      }
   }

   public final void d(float var1) {
      this.setImageAlpha((int)(var1 * 255.0F));
   }

   public final void e() {
      View var8 = this.a;
      var8.getClass();
      .ac var15 = (.ac)var8.getLayoutParams();
      int var4 = var15.leftMargin;
      int var2 = Math.round(this.a.getTranslationX());
      int var3 = var15.topMargin;
      int var1 = Math.round(this.a.getTranslationY());
      Point var16 = new Point(var4 + var2 + this.a.getWidth() / 2, var3 + var1 + this.a.getHeight() / 2);
      var4 = this.getResources().getDimensionPixelSize(2131166975) / 2 + this.getHeight();
      Rect var12 = new Rect(var16.x - var4, var16.y - var4, var16.x + var4, var16.y + var4);
      ConstraintLayout var17 = (ConstraintLayout)this.getParent();
      .ae var11 = new .ae();
      var3 = this.getId();
      var2 = this.a.getId();
      int var5 = this.getResources().getDimensionPixelSize(2131165554) / 2;
      int var6 = var17.getChildCount();
      var11.a.clear();

      for(var1 = 0; var1 < var6; ++var1) {
         View var10 = var17.getChildAt(var1);
         .ac var9 = (.ac)var10.getLayoutParams();
         int var7 = var10.getId();
         HashMap var14 = var11.a;
         Integer var13 = var7;
         if (!var14.containsKey(var13)) {
            var11.a.put(var13, new .ad());
         }

         .ad var18 = (.ad)var11.a.get(var13);
         var18.d = var7;
         var18.h = var9.d;
         var18.i = var9.e;
         var18.j = var9.f;
         var18.k = var9.g;
         var18.l = var9.h;
         var18.m = var9.i;
         var18.n = var9.j;
         var18.o = var9.k;
         var18.p = var9.l;
         var18.q = var9.m;
         var18.r = var9.n;
         var18.s = var9.o;
         var18.t = var9.p;
         var18.u = var9.w;
         var18.v = var9.x;
         var18.w = var9.y;
         var18.x = var9.K;
         var18.y = var9.L;
         var18.z = var9.M;
         var18.g = var9.c;
         var18.e = var9.a;
         var18.f = var9.b;
         var18.b = var9.width;
         var18.c = var9.height;
         var18.A = var9.leftMargin;
         var18.B = var9.rightMargin;
         var18.C = var9.topMargin;
         var18.D = var9.bottomMargin;
         var18.N = var9.B;
         var18.O = var9.A;
         var18.Q = var9.D;
         var18.P = var9.C;
         var18.ad = var9.E;
         var18.ae = var9.F;
         var18.af = var9.I;
         var18.ag = var9.J;
         var18.ah = var9.G;
         var18.ai = var9.H;
         var18.E = var9.getMarginEnd();
         var18.F = var9.getMarginStart();
         var18.G = var10.getVisibility();
         var18.R = var10.getAlpha();
         var18.U = var10.getRotationX();
         var18.V = var10.getRotationY();
         var18.W = var10.getScaleX();
         var18.X = var10.getScaleY();
         var18.Y = var10.getPivotX();
         var18.Z = var10.getPivotY();
         var18.aa = var10.getTranslationX();
         var18.ab = var10.getTranslationY();
         var18.ac = var10.getTranslationZ();
         if (var18.S) {
            var18.T = var10.getElevation();
         }
      }

      var11.b(var3, 3);
      var11.b(var3, 4);
      var11.b(var3, 6);
      var11.b(var3, 7);
      var1 = var12.top;
      var4 = var5 - var4;
      if (var1 >= 0) {
         var11.d(var3, 3, var2, 3, var4);
         var11.c(var3, 6, var2, 6);
         var11.c(var3, 7, var2, 7);
      } else {
         var11.c(var3, 3, var2, 3);
         var11.c(var3, 4, var2, 4);
         if (var12.left > var17.getWidth() - var12.width()) {
            var11.d(var3, 6, var2, 6, var4);
         } else {
            var11.d(var3, 7, var2, 7, var4);
         }
      }

      var11.a(var17);
      var17.c = null;
      this.setTranslationX(this.a.getTranslationX());
      this.setTranslationY(this.a.getTranslationY());
   }

   public final boolean f() {
      return this.c.isRunning();
   }
}
