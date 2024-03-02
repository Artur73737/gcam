package com.google.android.apps.camera.ui.modeslider;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ModeSlider extends LinearLayout implements .kii {
   public .kih a;
   final List b = new ArrayList();
   public int c = 0;
   private final AtomicInteger d = new AtomicInteger(-1);
   private final int e;
   private final LayoutParams f;

   public ModeSlider(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.e = var1.getResources().getDimensionPixelSize(2131166351);
      LayoutParams var3 = new LayoutParams(-2, this.getResources().getDimensionPixelSize(2131166349));
      this.f = var3;
      var3.gravity = 8388627;
   }

   private final void m(TextView var1, int var2) {
      .cde.b(this.getContext(), 2131296267, new .kht(var1));
      var1.setTextColor(var2);
   }

   public final int a() {
      return this.d.get();
   }

   public final int b(.khv var1) {
      if (!this.b.contains(var1)) {
         IllegalArgumentException var4 = new IllegalArgumentException("Unsupported mode item: ".concat(var1.toString()));
         throw var4;
      } else {
         Iterator var3 = this.b.iterator();

         int var2;
         for(var2 = 0; var3.hasNext() && !((.khv)var3.next()).equals(var1); ++var2) {
         }

         return var2;
      }
   }

   public final .khv c(int var1) {
      return (.khv)this.b.get(var1);
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

   public final void g() {
      if (this.c > 0 && this.a() != -1) {
         this.getChildAt(this.a()).setLayoutParams(this.f);
         TextView var5 = (TextView)this.getChildAt(this.a());
         int var2 = Integer.MAX_VALUE;
         var5.setMaxWidth(Integer.MAX_VALUE);
         int var1;
         if (.ktc.f(this.getContext())) {
            var1 = this.getResources().getDimensionPixelSize(2131166356);
         } else {
            var1 = this.getResources().getDimensionPixelSize(2131166355);
         }

         var1 = this.c - (var1 + var1);
         int var3 = this.b.size();
         int var4 = this.getResources().getDimensionPixelSize(2131166357);
         if (this.getMeasuredWidth() > var1 && var3 > 1) {
            var1 = (var1 - (var4 + var4) - this.getChildAt(this.a()).getWidth()) / (var3 - 1);
         } else {
            var1 = var2;
         }

         for(var2 = 0; var2 < var3; ++var2) {
            if (var2 != this.a()) {
               ((TextView)this.getChildAt(var2)).setMaxWidth(var1);
            }
         }

      }
   }

   public final void h(.khu var1) {
      this.b.clear();
      this.b.addAll(var1.j);
      List var9 = var1.j;
      this.removeAllViews();
      this.d.set(-1);
      int var5 = this.b.size();
      float var3 = (float)this.getResources().getDimensionPixelSize(2131166353);
      float var2 = .ktc.a(this.getResources().getDimension(2131166352));

      int var4;
      for(var4 = 0; var4 < var5; ++var4) {
         Object var8 = ((.khv)this.b.get(var4)).c;
         Object var7 = ((.khv)this.b.get(var4)).d;
         TextView var10 = new TextView(this.getContext());
         var10.setLayoutParams(this.f);
         var10.setSingleLine(true);
         var10.setBackgroundColor(0);
         var10.setEllipsize(TruncateAt.END);
         var10.setText((CharSequence)var8);
         var10.setGravity(17);
         this.m(var10, .oik.c(var10, 2130968979));
         var10.setTextAlignment(4);
         var10.setTextSize(0, var3);
         var10.setLetterSpacing(var2);
         int var6 = this.e;
         var10.setPadding(var6, 0, var6, 0);
         var10.setContentDescription((CharSequence)var7);
         var10.setOnClickListener(new .jcg(this, var4, 2));
         this.addView(var10, var4);
      }

      var4 = this.getResources().getDimensionPixelSize(2131166357);
      this.setPadding(var4, 0, var4, 0);
      this.setOnTouchListener(new .enu(this, 17, (byte[])null));
   }

   public final void i() {
      this.setVisibility(0);
   }

   public final void j(int var1) {
      this.l(var1, false);
   }

   public final boolean k() {
      return this.getVisibility() == 0;
   }

   public final void l(int var1, boolean var2) {
      if (var1 < 0) {
         IllegalArgumentException var7 = new IllegalArgumentException(.c.aE(var1, "Illegal index: "));
         throw var7;
      } else {
         if (var1 != this.d.get()) {
            for(int var3 = 0; var3 < this.getChildCount(); ++var3) {
               TextView var5 = (TextView)this.getChildAt(var3);
               if (var3 == var1) {
                  Drawable var4 = this.getContext().getDrawable(2131231041);
                  if (var4 != null) {
                     this.m(var5, .oik.c(var5, 2130968970));
                     var4.setTint(.oik.c(var5, 2130969015));
                     var5.setBackground(var4);
                  }

                  var5.setSelected(true);
               } else {
                  var5.setBackground((Drawable)null);
                  this.m(var5, .oik.c(var5, 2130968979));
                  var5.setSelected(false);
               }
            }

            this.d.set(var1);
            this.g();
            .kih var6 = this.a;
            if (var6 != null) {
               if (!var2) {
                  var6.c(false);
               }

               this.a.a(this, var1, var2);
               if (!var2) {
                  this.a.b(this, false);
               }
            }
         }

      }
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      return true;
   }
}
