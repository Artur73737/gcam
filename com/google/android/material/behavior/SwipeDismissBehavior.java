package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class SwipeDismissBehavior extends .caz {
   public .cjb a;
   public boolean b;
   public int c = 2;
   public float d = 0.0F;
   public float e = 0.5F;
   private boolean f;
   private final .cja g = new .oix(this);

   public static float H(float var0) {
      return Math.min(Math.max(0.0F, var0), 1.0F);
   }

   public boolean G(View var1) {
      return true;
   }

   public boolean d(CoordinatorLayout var1, View var2, MotionEvent var3) {
      boolean var4 = this.f;
      switch(var3.getActionMasked()) {
      case 0:
         var4 = var1.k(var2, (int)var3.getX(), (int)var3.getY());
         this.f = var4;
         break;
      case 1:
      case 3:
         this.f = false;
      case 2:
      }

      if (var4) {
         if (this.a == null) {
            this.a = .cjb.b(var1, this.g);
         }

         if (!this.b && this.a.j(var3)) {
            return true;
         }
      }

      return false;
   }

   public final boolean e(CoordinatorLayout var1, View var2, int var3) {
      if (.cfx.a(var2) == 0) {
         .cfx.o(var2, 1);
         .cgm.f(var2, 1048576);
         if (this.G(var2)) {
            .cgm.i(var2, .chr.u, new .cvz(this, 2));
         }
      }

      return false;
   }

   public final boolean g(CoordinatorLayout var1, View var2, MotionEvent var3) {
      if (this.a == null) {
         return false;
      } else {
         if (!this.b || var3.getActionMasked() != 3) {
            this.a.e(var3);
         }

         return true;
      }
   }
}
