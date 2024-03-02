package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import j$.util.DesugarArrays;

public class LinearMinibarImpl extends LinearLayoutCompat implements .imb {
   public static final int a = 0;
   private static final int[] b = new int[]{2131427918, 2131427919, 2131427920, 2131427921};
   private boolean c = true;

   public LinearMinibarImpl(Context var1) {
      super(var1);
   }

   public LinearMinibarImpl(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public LinearMinibarImpl(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   private final View u() {
      return this.findViewById(2131427917);
   }

   private final View v() {
      return this.findViewById(2131427922);
   }

   private final View w() {
      return this.findViewById(2131427923);
   }

   private final View x() {
      return this.findViewById(2131427925);
   }

   private final View y() {
      return this.findViewById(2131427926);
   }

   private final ImageView z() {
      return (ImageView)this.findViewById(2131427924);
   }

   public final ImageView a(int var1) {
      return (ImageView)this.findViewById(b[var1]);
   }

   public final void b() {
      this.u().setVisibility(8);
   }

   public final void c() {
      this.u().setVisibility(8);
      this.z().setVisibility(8);
   }

   public final void d() {
      this.u().animate().rotationX(0.0F).setDuration(250L).start();
      String var1 = this.getResources().getString(2132018084);
      this.u().setContentDescription(var1);
   }

   public final void e() {
      this.u().animate().rotationX(180.0F).setDuration(250L).start();
      String var1 = this.getResources().getString(2132018085);
      this.u().setContentDescription(var1);
   }

   public final void f() {
      this.c = true;
   }

   public final void g(int var1, boolean var2, int var3, String var4) {
      ImageView var5 = this.a(var1);
      if (!var2) {
         var5.setVisibility(8);
      } else {
         var5.setImageResource(var3);
         var5.setContentDescription(var4);
         var5.setVisibility(0);
      }
   }

   public final void h(.jgl var1) {
      .ksm var2 = .ksm.a;
      .jgl var3 = .jgl.a;
      switch(var1.ordinal()) {
      case 0:
         this.w().setVisibility(8);
         this.v().setVisibility(8);
         return;
      case 1:
         this.w().setVisibility(8);
         this.v().setVisibility(0);
         return;
      default:
         this.w().setVisibility(0);
         this.v().setVisibility(8);
      }
   }

   public final void i(.ksm var1) {
      .ksm var2 = .ksm.a;
      .jgl var3 = .jgl.a;
      switch(var1.ordinal()) {
      case 1:
      case 7:
         this.z().setImageResource(2131231186);
         return;
      case 3:
         this.z().setImageResource(2131231185);
         return;
      case 4:
         this.z().setImageResource(2131231187);
         return;
      case 6:
         this.z().setImageResource(2131231182);
         return;
      case 11:
      case 21:
      case 22:
         this.z().setImageResource(2131231183);
         return;
      case 12:
         this.z().setImageResource(2131231184);
         return;
      default:
         this.z().setImageResource(2131231659);
      }
   }

   public final void j(boolean var1) {
      ImageView var3 = this.z();
      byte var2;
      if (!var1) {
         var2 = 8;
      } else {
         var2 = 0;
      }

      var3.setVisibility(var2);
   }

   public final void k() {
      this.u().setVisibility(0);
   }

   public final void l(boolean var1) {
      if (var1) {
         this.y().setVisibility(0);
         this.x().setVisibility(8);
      } else {
         this.x().setVisibility(0);
         this.y().setVisibility(8);
      }
   }

   public final void m() {
      this.x().setVisibility(8);
      this.y().setVisibility(8);
   }

   public final boolean n() {
      return DesugarArrays.stream((Object[])(new View[]{this.v(), this.w(), this.x(), this.y()})).noneMatch(.hik.n);
   }

   public final boolean o() {
      for(int var1 = this.getChildCount() - 1; var1 >= 0; --var1) {
         View var2 = this.getChildAt(var1);
         if (var2.getVisibility() == 0 && !var2.equals(this.u())) {
            return false;
         }
      }

      return true;
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      this.setBackgroundTintList(ColorStateList.valueOf(.jbc.Y(this)));
   }

   public final void p() {
   }

   public final void q(.ktb var1) {
      for(int var2 = 0; var2 < this.getChildCount(); ++var2) {
         View var3 = this.getChildAt(var2);
         if (var3 != this.u()) {
            .jbc.aD(var3, var1, this.c);
         }
      }

      this.c = false;
   }
}
