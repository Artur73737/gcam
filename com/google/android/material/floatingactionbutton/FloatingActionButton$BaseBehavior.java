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

public class FloatingActionButton$BaseBehavior extends .caz {
   private Rect a;
   private final boolean b;

   public FloatingActionButton$BaseBehavior() {
      this.b = true;
   }

   public FloatingActionButton$BaseBehavior(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, .okx.c);
      this.b = var3.getBoolean(0, true);
      var3.recycle();
   }

   private static boolean G(View var0) {
      LayoutParams var1 = var0.getLayoutParams();
      return var1 instanceof .cbc ? ((.cbc)var1).a instanceof BottomSheetBehavior : false;
   }

   private final boolean H(View var1, FloatingActionButton var2) {
      .cbc var3 = (.cbc)var2.getLayoutParams();
      if (this.b && var3.f == var1.getId()) {
         return var2.d == 0;
      } else {
         return false;
      }
   }

   private final boolean I(CoordinatorLayout var1, AppBarLayout var2, FloatingActionButton var3) {
      if (!this.H(var2, var3)) {
         return false;
      } else {
         if (this.a == null) {
            this.a = new Rect();
         }

         Rect var4 = this.a;
         .olc.a(var1, var2, var4);
         if (var4.bottom <= var2.d()) {
            var3.e();
         } else {
            var3.f();
         }

         return true;
      }
   }

   private final boolean J(View var1, FloatingActionButton var2) {
      if (!this.H(var1, var2)) {
         return false;
      } else {
         .cbc var3 = (.cbc)var2.getLayoutParams();
         if (var1.getTop() < var2.getHeight() / 2 + var3.topMargin) {
            var2.e();
         } else {
            var2.f();
         }

         return true;
      }
   }

   public final void a(.cbc var1) {
      if (var1.h == 0) {
         var1.h = 80;
      }

   }
}
