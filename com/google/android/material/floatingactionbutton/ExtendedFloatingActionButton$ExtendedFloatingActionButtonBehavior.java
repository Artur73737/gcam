package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends .caz {
   private Rect a;
   private final boolean b;
   private final boolean c;

   public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
      this.b = false;
      this.c = true;
   }

   public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, .okx.a);
      this.b = var3.getBoolean(0, false);
      this.c = var3.getBoolean(1, true);
      var3.recycle();
   }

   private static boolean G(View var0) {
      LayoutParams var1 = var0.getLayoutParams();
      return var1 instanceof .cbc ? ((.cbc)var1).a instanceof BottomSheetBehavior : false;
   }

   private final boolean H(View var1, .okk var2) {
      .cbc var3 = (.cbc)var2.getLayoutParams();
      if (!this.b && !this.c) {
         return false;
      } else {
         return var3.f == var1.getId();
      }
   }

   private final void I(CoordinatorLayout var1, AppBarLayout var2, .okk var3) {
      if (this.H(var2, var3)) {
         if (this.a == null) {
            this.a = new Rect();
         }

         Rect var5 = this.a;
         .olc.a(var1, var2, var5);
         int var4;
         if (var5.bottom <= var2.d()) {
            var4 = .okk.b;
            throw null;
         } else {
            var4 = .okk.b;
            throw null;
         }
      }
   }

   private final void J(View var1, .okk var2) {
      if (this.H(var1, var2)) {
         .cbc var3 = (.cbc)var2.getLayoutParams();
         if (var1.getTop() < var2.getHeight() / 2 + var3.topMargin) {
            throw null;
         } else {
            throw null;
         }
      }
   }

   public final void a(.cbc var1) {
      if (var1.h == 0) {
         var1.h = 80;
      }

   }
}
