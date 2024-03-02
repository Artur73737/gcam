package com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;

public class RecordSpeedSlider extends LinearLayout implements .kii {
   public final AtomicInteger a = new AtomicInteger(-1);
   public final int b = this.getResources().getDimensionPixelSize(2131166782);
   public .owf c = .owf.r();
   public .kih d;
   public int e;
   public int f;
   public int g;

   public RecordSpeedSlider(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final int a() {
      int var2 = this.c.n().size();
      int var3 = this.g;
      byte var1;
      if (var3 != 1) {
         var1 = 0;
      } else {
         var1 = 1;
      }

      if (var3 != 0) {
         return var2 + (var1 ^ 1);
      } else {
         throw null;
      }
   }

   public final int b() {
      return this.a.get();
   }

   public final int c(int var1) {
      if (var1 != this.e) {
         int var2 = this.g;
         if (var2 != 0) {
            return var2 == 2 ? var1 - 1 : var1;
         } else {
            throw null;
         }
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append(var1);
         var3.append(" is the index for back option");
         throw new IllegalArgumentException(var3.toString());
      }
   }

   public final void d() {
      this.setEnabled(false);
   }

   public final void e() {
      this.setEnabled(true);
   }

   public final void f() {
      this.setVisibility(8);
   }

   public final void g(int var1) {
      this.h(var1, false);
   }

   public final void h(int var1, boolean var2) {
      if (var1 < 0) {
         IllegalArgumentException var8 = new IllegalArgumentException(.c.aE(var1, "Illegal index: "));
         throw var8;
      } else {
         if (var1 != this.a.get()) {
            for(int var3 = 0; var3 < this.getChildCount(); ++var3) {
               TextView var5 = (TextView)this.getChildAt(var3);
               int var4;
               if (var3 == var1) {
                  GradientDrawable var6 = (GradientDrawable)this.getContext().getDrawable(2131231043);
                  if (var6 != null) {
                     this.l(var5, .oik.c(var5, 2130968970));
                     var6.setTint(.oik.c(var5, 2130969015));
                     var5.setBackground(var6);
                  }

                  var5.setSelected(true);
                  var5.sendAccessibilityEvent(4);
                  if (var1 == this.e) {
                     var4 = .oik.c(var5, 2130968970);
                     var5.getCompoundDrawables()[0].setTint(var4);
                  } else {
                     Drawable var9 = this.getContext().getDrawable(this.f);
                     var4 = .oik.c(var5, 2130968970);
                     if (var9 != null) {
                        var9.setTint(var4);
                     }

                     var4 = this.getResources().getDimensionPixelSize(2131166773);
                     var5.setCompoundDrawablesRelativeWithIntrinsicBounds(var9, (Drawable)null, (Drawable)null, (Drawable)null);
                     var5.setCompoundDrawablePadding(var4);
                     var5.setPadding(this.getResources().getDimensionPixelSize(2131166770), 0, this.b, 0);
                  }
               } else {
                  this.l(var5, .oik.c(var5, 2130968979));
                  var5.setBackground((Drawable)null);
                  var5.setSelected(false);
                  if (var3 == this.e) {
                     var4 = .oik.c(var5, 2130968979);
                     var5.getCompoundDrawables()[0].setTint(var4);
                  } else {
                     var5.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
                     var5.setCompoundDrawablePadding(0);
                     var4 = this.b;
                     var5.setPadding(var4, 0, var4, 0);
                  }
               }
            }

            this.a.set(var1);
            .kih var7 = this.d;
            if (var7 != null) {
               if (!var2) {
                  var7.c(false);
               }

               this.d.a(this, var1, var2);
               if (!var2) {
                  this.d.b(this, false);
               }
            }
         }

      }
   }

   public final void i() {
      this.setVisibility(0);
   }

   public final boolean j() {
      if (this.getChildAt(this.e) == null) {
         return false;
      } else {
         return this.getChildAt(this.e).getVisibility() == 0;
      }
   }

   public final boolean k() {
      return this.getVisibility() == 0;
   }

   public final void l(TextView var1, int var2) {
      .cde.b(this.getContext(), 2131296267, new .fds(var1));
      var1.setTextColor(var2);
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      return true;
   }
}
