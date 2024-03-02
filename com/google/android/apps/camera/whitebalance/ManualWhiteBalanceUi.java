package com.google.android.apps.camera.whitebalance;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.FrameLayout.LayoutParams;

public class ManualWhiteBalanceUi extends FrameLayout {
   public .kge a;
   private .ksm b;
   private .ktb c;

   static {
      .ozr.L(0, 5, 10, 15, 20);
   }

   public ManualWhiteBalanceUi(Context var1, AttributeSet var2) {
      super(var1, var2);
      new .cml(false);
      this.b = .ksm.a;
      this.c = .ktb.a;
      this.a = .kge.b;
      if (var1 instanceof .efu) {
         .flx var3 = ((.efu)var1).a();
         if (var3.m(.fmd.cq)) {
            var3.f();
         }
      }

   }

   private final int f(int var1) {
      int var3 = this.getResources().getDimensionPixelSize(2131166247);
      int var2 = this.getResources().getDimensionPixelSize(2131166253);
      int var4 = this.getResources().getDimensionPixelSize(2131166246);
      var3 /= 2;
      var4 /= 2;
      return var1 / 2 + var3 + var4 + var2;
   }

   public final ImageButton a() {
      return (ImageButton)this.findViewById(2131427868);
   }

   public final SeekBar b() {
      return (SeekBar)this.findViewById(2131427869);
   }

   public final ManualWhiteBalanceKnob c() {
      return (ManualWhiteBalanceKnob)this.findViewById(2131427867);
   }

   public final void d(.ktb var1, .kge var2, .ksm var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
      if (this.c() != null) {
         .jbc.aC(this.c(), var1);
      }

      if (this.a() != null) {
         .jbc.aC(this.a(), var1);
      }

      this.e(this.b().getProgress(), this.b().getMax());
   }

   public final void e(int var1, int var2) {
      int var4 = this.getResources().getDimensionPixelSize(2131166252);
      ManualWhiteBalanceKnob var5 = this.c();
      int var3 = this.b().getWidth();
      var5.setTranslationY((float)(-(var1 - var2 / 2)) * ((float)(var3 - var4) / (float)var2));
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131623992, this);
      ImageButton var7 = (ImageButton)this.findViewById(2131427868);
      var7.getClass();
      LayoutParams var8 = (LayoutParams)var7.getLayoutParams();
      int var2 = this.getResources().getDimensionPixelSize(2131166257);
      int var1 = this.getResources().getDimensionPixelSize(2131166249);
      int var4 = this.getResources().getDimensionPixelSize(2131166256);
      int var3 = this.getResources().getDimensionPixelSize(2131166247);
      int var5 = this.getResources().getDimensionPixelSize(2131166246);
      InsetDrawable var6 = new InsetDrawable(this.getResources().getDrawable(2131231347, (Theme)null), var5);
      var8.bottomMargin = this.f(var2);
      var8.leftMargin = Math.abs(var4 - var3) / 2 - var5 + var1;
      var7.setLayoutParams(var8);
      var7.setImageDrawable(var6);
      SeekBar var10 = (SeekBar)this.findViewById(2131427869);
      var10.getClass();
      var10.setRotation(270.0F);
      LayoutParams var9 = (LayoutParams)var10.getLayoutParams();
      var1 = this.getResources().getDimensionPixelSize(2131166256);
      var4 = this.getResources().getDimensionPixelSize(2131166252);
      var3 = this.getResources().getDimensionPixelSize(2131166251);
      var5 = this.getResources().getDimensionPixelSize(2131166257);
      var2 = this.getResources().getDimensionPixelSize(2131166249);
      var9.width = var5;
      var9.leftMargin = -Math.abs(var9.width - var1) / 2 + var2;
      var10.setLayoutParams(var9);
      var10.setPadding(0, 0, 0, 0);
      var10.setVisibility(0);
      ManualWhiteBalanceKnob var11 = (ManualWhiteBalanceKnob)this.findViewById(2131427867);
      var11.getClass();
      InsetDrawable var12 = new InsetDrawable(this.getResources().getDrawable(2131231039, (Theme)null), var3);
      var9 = (LayoutParams)var11.getLayoutParams();
      var9.leftMargin = Math.abs(var1 - var4) / 2 - var3 + var2;
      var11.setLayoutParams(var9);
      var11.setBackground(var12);
      var11.setVisibility(0);
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1) {
         this.d(this.c, this.a, this.b);
      }

   }

   protected final void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      var2 = this.getResources().getDimensionPixelSize(2131166257);
      int var4;
      if (this.a.equals(.kge.d)) {
         var1 = this.getResources().getDimensionPixelSize(2131166258);
      } else {
         var4 = this.getResources().getDimensionPixelSize(2131166252);
         ImageButton var7 = (ImageButton)this.findViewById(2131427868);
         var7.getClass();
         int var5 = this.getResources().getDimensionPixelSize(2131166253);
         int var6 = var7.getMeasuredWidth();
         float var3 = (float)this.getMeasuredHeight();
         var1 = var2;
         if ((float)(var4 + var2 + var5 + var6) >= var3 * 0.9F) {
            var1 = (int)((float)var2 * 0.8F);
         }
      }

      var2 = this.getResources().getDimensionPixelSize(2131166256);
      var4 = this.getResources().getDimensionPixelSize(2131166249);
      LayoutParams var9 = (LayoutParams)this.b().getLayoutParams();
      var9.width = var1;
      var9.leftMargin = -Math.abs(var9.width - var2) / 2 + var4;
      ImageButton var8 = this.a();
      var9 = (LayoutParams)var8.getLayoutParams();
      var9.bottomMargin = this.f(var1);
      var8.setLayoutParams(var9);
   }
}
