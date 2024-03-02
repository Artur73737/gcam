package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView extends .old implements .hj {
   private static final int[] e = new int[]{16842912};
   public boolean c;
   boolean d;
   private int i;
   private final CheckedTextView j;
   private FrameLayout k;
   private .gx l;
   private final .cfe m;

   public NavigationMenuItemView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public NavigationMenuItemView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public NavigationMenuItemView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.d = true;
      .ole var5 = new .ole(this);
      this.m = var5;
      this.r(0);
      LayoutInflater.from(var1).inflate(2131624017, this, true);
      this.i = var1.getResources().getDimensionPixelSize(2131165460);
      CheckedTextView var4 = (CheckedTextView)this.findViewById(2131427617);
      this.j = var4;
      var4.setDuplicateParentStateEnabled(true);
      .cgm.g(var4, var5);
   }

   public final .gx a() {
      return this.l;
   }

   public final boolean e() {
      return false;
   }

   public final void f(.gx var1) {
      this.l = var1;
      int var2 = var1.a;
      if (var2 > 0) {
         this.setId(var2);
      }

      boolean var4 = var1.isVisible();
      byte var3 = 1;
      byte var9;
      if (!var4) {
         var9 = 8;
      } else {
         var9 = 0;
      }

      this.setVisibility(var9);
      if (this.getBackground() == null) {
         TypedValue var6 = new TypedValue();
         StateListDrawable var5;
         if (this.getContext().getTheme().resolveAttribute(2130968945, var6, true)) {
            var5 = new StateListDrawable();
            var5.addState(e, new ColorDrawable(var6.data));
            var5.addState(EMPTY_STATE_SET, new ColorDrawable(0));
         } else {
            var5 = null;
         }

         .cfx.m(this, var5);
      }

      var4 = var1.isCheckable();
      this.refreshDrawableState();
      if (this.c != var4) {
         this.c = var4;
         this.m.d(this.j, 2048);
      }

      var4 = var1.isChecked();
      this.refreshDrawableState();
      this.j.setChecked(var4);
      CheckedTextView var11 = this.j;
      Typeface var10 = var11.getTypeface();
      if (var4 && this.d) {
         var9 = var3;
      } else {
         var9 = 0;
      }

      var11.setTypeface(var10, var9);
      this.setEnabled(var1.isEnabled());
      CharSequence var12 = var1.d;
      this.j.setText(var12);
      Drawable var13 = var1.getIcon();
      if (var13 != null) {
         var2 = this.i;
         var13.setBounds(0, 0, var2, var2);
      }

      .cik.e(this.j, var13, (Drawable)null, (Drawable)null);
      View var14 = var1.getActionView();
      if (var14 != null) {
         if (this.k == null) {
            this.k = (FrameLayout)((ViewStub)this.findViewById(2131427616)).inflate();
         }

         this.k.removeAllViews();
         this.k.addView(var14);
      }

      this.setContentDescription(var1.l);
      .ns.a(this, var1.m);
      var1 = this.l;
      FrameLayout var7;
      .ku var8;
      if (var1.d == null && var1.getIcon() == null && this.l.getActionView() != null) {
         this.j.setVisibility(8);
         var7 = this.k;
         if (var7 != null) {
            var8 = (.ku)var7.getLayoutParams();
            var8.width = -1;
            this.k.setLayoutParams(var8);
            return;
         }
      } else {
         this.j.setVisibility(0);
         var7 = this.k;
         if (var7 != null) {
            var8 = (.ku)var7.getLayoutParams();
            var8.width = -2;
            this.k.setLayoutParams(var8);
            return;
         }
      }

   }

   protected final int[] onCreateDrawableState(int var1) {
      int[] var3 = super.onCreateDrawableState(var1 + 1);
      .gx var2 = this.l;
      if (var2 != null && var2.isCheckable() && var2.isChecked()) {
         mergeDrawableStates(var3, e);
      }

      return var3;
   }
}
