package com.google.android.apps.camera.focusindicator;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;

public class FocusIndicatorView extends ConstraintLayout implements .kfw {
   private final int[] A = new int[2];
   private volatile .ktb B;
   private final AnimatorListener C;
   private final .gau D;
   public final PointF d = new PointF(0.0F, 0.0F);
   public final .mdq e = new .mcy(false);
   public final FocusIndicatorRingView f;
   public final EyesFocusIndicatorRectView g;
   public final FocusIndicatorAccessoryView h;
   public final FocusIndicatorAccessoryView i;
   public final .gay j;
   final .gba k;
   public final .ktn l;
   public final .ktn m;
   public final .ktn n;
   final .ktn o;
   final .ktn p;
   final .ktn q;
   public .ktn r;
   public final .ktn s;
   final .ktn t;
   final .ktn u;
   final .ktn v;
   public final .ktn w;
   public final .ktn x;
   public Animator y;
   public AmbientModeSupport$AmbientController z;

   public FocusIndicatorView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.B = .ktb.a;
      this.C = new .gbd(this);
      ((LayoutInflater)var1.getSystemService("layout_inflater")).inflate(2131624034, this);
      .gau var15 = this.s(var1);
      this.D = var15;
      this.f = .gbf.b(var15.n);
      .nwu var3 = var15.n;
      Object var4 = var3.d;
      var4.getClass();
      this.g = (EyesFocusIndicatorRectView)var4;
      var4 = var3.f;
      var4.getClass();
      this.h = (FocusIndicatorAccessoryView)var4;
      this.i = .gbg.b(var3);
      this.j = .gbj.b(var15.n);
      this.k = .gbk.b(var15.n);
      .ktn var18 = (.ktn)var15.a.get();
      this.l = var18;
      .ktn var9 = (.ktn)var15.b.get();
      this.m = var9;
      .ktn var11 = (.ktn)var15.c.get();
      this.n = var11;
      .ktn var6 = (.ktn)var15.d.get();
      this.o = var6;
      .ktn var13 = (.ktn)var15.e.get();
      this.p = var13;
      .ktn var10 = (.ktn)var15.f.get();
      this.q = var10;
      this.r = (.ktn)var15.g.get();
      .ktn var19 = (.ktn)var15.h.get();
      this.s = var19;
      .ktn var7 = (.ktn)var15.i.get();
      this.t = var7;
      .ktn var12 = (.ktn)var15.j.get();
      this.u = var12;
      .ktn var8 = (.ktn)var15.k.get();
      this.v = var8;
      .ktn var5 = (.ktn)var15.l.get();
      this.w = var5;
      .ktn var16 = (.ktn)var15.m.get();
      this.x = var16;
      this.t(var18);
      this.t(var9);
      this.t(var11);
      this.t(var6);
      this.t(var13);
      this.t(var10);
      this.t(var19);
      this.t(var7);
      this.t(var12);
      this.t(var8);
      this.t(var5);
      this.t(var16);
      if (var1 instanceof .efu) {
         .flx var17 = ((.efu)var1).a();
         .flz var14 = .fmc.a;
         var17.c();
      }

   }

   FocusIndicatorView(Context var1, FocusIndicatorRingView var2, EyesFocusIndicatorRectView var3, FocusIndicatorAccessoryView var4, FocusIndicatorAccessoryView var5, .gay var6, .gba var7, .ktn var8, .ktn var9, .ktn var10, .ktn var11, .ktn var12, .ktn var13, .ktn var14, .ktn var15, .ktn var16, .ktn var17, .ktn var18, .ktn var19) {
      super(var1);
      this.B = .ktb.a;
      this.C = new .gbd(this);
      this.D = this.s(var1);
      this.f = var2;
      this.g = var3;
      this.h = var4;
      this.i = var5;
      this.j = var6;
      this.k = var7;
      this.t(var8);
      this.l = var8;
      this.t(var9);
      this.m = var9;
      this.t(var10);
      this.n = var10;
      this.t(var11);
      this.o = var11;
      this.t(var12);
      this.p = var12;
      this.t(var13);
      this.q = var13;
      this.t(var14);
      this.s = var14;
      this.t(var15);
      this.t = var15;
      this.t(var16);
      this.u = var16;
      this.t(var17);
      this.v = var17;
      this.t(var18);
      this.w = var18;
      this.t(var19);
      this.x = var19;
      if (var1 instanceof .efu) {
         .flx var21 = ((.efu)var1).a();
         .flz var20 = .fmc.a;
         var21.c();
      }

   }

   private final .gau s(Context var1) {
      return new .gau(new .nwu(var1, this));
   }

   private final void t(.ktn var1) {
      if (var1 != null) {
         var1.b(this.C);
      }

   }

   public final PointF c(PointF var1) {
      float[] var3 = new float[]{var1.x, var1.y};
      int var2 = this.B.e;
      Matrix var4 = new Matrix();
      var4.setRotate((float)var2, 0.5F, 0.5F);
      var4.mapPoints(var3);
      return new PointF(var3[0] * (float)this.getWidth(), var3[1] * (float)this.getHeight());
   }

   public final .ktm d(.otw var1) {
      this.h();
      this.k();
      this.j();
      this.l();
      if (var1.h()) {
         this.f.b((PointF)var1.c());
      } else {
         this.n();
      }

      return this.t.a();
   }

   public final .ktm e() {
      if (this.i.getVisibility() == 8) {
         return .ktn.a;
      } else {
         this.h();
         this.i.c(true);
         return this.v.a();
      }
   }

   public final .ktm f() {
      Animator var1 = this.y;
      return var1 != null && var1.isRunning() ? .ktn.a : this.o.a();
   }

   public final .ktm g(.otw var1, int var2) {
      Animator var3 = this.y;
      if (var3 != null && var3.isRunning()) {
         return .ktn.a;
      } else {
         this.k();
         this.j();
         this.m(var1, var2);
         return this.n.a();
      }
   }

   public final void h() {
      Animator var1 = this.y;
      if (var1 != null && var1.isRunning()) {
         this.y.cancel();
         this.y = null;
      }

      FocusIndicatorAccessoryView var2 = this.h;
      if (var2 != null && var2.f()) {
         this.h.a();
      }

      var2 = this.i;
      if (var2 != null && var2.f()) {
         this.i.a();
      }

   }

   public final void i() {
      this.h();
      this.k();
      this.h.c(false);
      this.o(false);
      this.j();
      this.l();
   }

   public final void j() {
      this.g.setVisibility(8);
   }

   public final void k() {
      this.k.d(0.0F);
      this.j.m(0.0F);
      this.f.invalidate();
   }

   public final void l() {
      this.i.c(false);
   }

   public final void m(.otw var1, int var2) {
      if (var1.h()) {
         PointF var7 = this.c((PointF)var1.c());
         this.f.b(var7);
         double var3 = (double)((PointF)var1.c()).x;
         Double.isNaN(var3);
         if (Math.abs(var3 - 0.5D) < 0.001D) {
            var3 = (double)((PointF)var1.c()).y;
            Double.isNaN(var3);
            Math.abs(var3 - 0.5D);
         }

         this.r((float)var2);
      } else {
         FocusIndicatorRingView var8 = this.f;
         float var5 = (float)this.getWidth();
         float var6 = (float)this.getHeight();
         var8.b(new PointF(var5 / 2.0F, var6 / 2.0F));
      }
   }

   public final void n() {
      FocusIndicatorRingView var3 = this.f;
      float var1 = (float)this.getWidth();
      float var2 = (float)this.getHeight();
      var3.b(new PointF(var1 / 2.0F, var2 / 2.0F));
   }

   public final void o(boolean var1) {
      if ((Boolean)((.mcy)this.e).d != var1) {
         this.e.a(var1);
         AmbientModeSupport$AmbientController var2 = this.z;
         if (var2 != null) {
            Object var3 = var2.a;
            .efm var4;
            if (var1) {
               var4 = (.efm)var3;
               if (!((.efl)((.mcy)var4.a).d).equals(.efl.c) && !((.efl)((.mcy)var4.a).d).equals(.efl.d)) {
                  var4.a.a(.efl.c);
                  return;
               }
            } else {
               var4 = (.efm)var3;
               if (!((.efl)((.mcy)var4.a).d).equals(.efl.g) && !((.efl)((.mcy)var4.a).d).equals(.efl.f)) {
                  var4.a.a(.efl.f);
                  return;
               }
            }
         }

      }
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      FocusIndicatorAccessoryView var2 = this.h;
      FocusIndicatorRingView var1 = this.f;
      var2.a = var1;
      this.i.a = var1;
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      this.getLocationInWindow(this.A);
      PointF var6 = this.d;
      int[] var7 = this.A;
      var6.set((float)var7[0], (float)var7[1]);
      .ktb var11 = .ktb.b(this.getDisplay(), this.getContext());
      if (var1 || var11 != this.B) {
         this.B = var11;
         FocusIndicatorRingView var14 = this.f;
         .ktb var8 = this.B;
         View var12 = (View)var14.getParent();
         .ktb var9 = var14.e;
         var14.e = var8;
         if (var14.f) {
            .ktb var10 = var14.e;
            PointF var15 = var14.d;
            var2 = var12.getWidth();
            var3 = var12.getHeight();
            .mho var13;
            switch(FocusIndicatorRingView.a(var10) - FocusIndicatorRingView.a(var9)) {
            case -270:
            case 90:
               var13 = .mho.d;
               break;
            case -180:
            case 180:
               var13 = .mho.c;
               break;
            case -90:
            case 270:
               var13 = .mho.b;
               break;
            case 0:
               var13 = .mho.a;
               break;
            default:
               throw new IllegalArgumentException();
            }

            if (var15 != null) {
               PointF var16 = new PointF();
               switch(var13.ordinal()) {
               case 1:
                  var16.set((float)var2 - var15.y, var15.x);
                  break;
               case 2:
                  var16.set((float)var2 - var15.x, (float)var3 - var15.y);
                  break;
               case 3:
                  var16.set(var15.y, (float)var3 - var15.x);
                  break;
               default:
                  var16.set(var15.x, var15.y);
               }

               var14.b(var16);
            }
         }

         var14.f = true;
         this.g.d = this.B;
         this.h.e();
         this.i.e();
      }
   }

   // $FF: synthetic method
   public final void onLayoutUpdated(.kge var1, .ktb var2) {
   }

   public final void onLayoutUpdated(.ktb var1) {
      this.requestLayout();
   }

   public final void p(float var1) {
      this.i.d(var1);
      this.j.m(var1);
      this.f.invalidate();
   }

   public final void q() {
      this.h();
      this.u.a();
   }

   public final void r(float var1) {
      Resources var6 = this.getContext().getResources();
      float var4 = (float)var6.getDisplayMetrics().widthPixels;
      float var3 = (float)var6.getDisplayMetrics().heightPixels;
      float var2;
      if (var1 > 1350.0F) {
         var2 = 1350.0F;
      } else {
         var2 = var1;
         if (var1 < 360.0F) {
            var2 = 360.0F;
         }
      }

      var1 = Math.max(var3, var4);
      var4 = Math.min(var3, var4);
      var3 = var1 / var4;
      if (this.B.e == 0) {
         var1 = var2 * var4 / 1080.0F;
      } else {
         short var5;
         if (var3 > 2.1F) {
            var5 = 2280;
         } else {
            var5 = 2060;
         }

         var1 = var2 * var1 / (float)var5;
      }

      var1 = TypedValue.applyDimension(0, var1 / 2.0F, var6.getDisplayMetrics());
      this.j.l(var1);
      this.j.k(var1 / 2.0F);
   }
}
