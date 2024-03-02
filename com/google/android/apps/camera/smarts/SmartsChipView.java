package com.google.android.apps.camera.smarts;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SmartsChipView extends LinearLayout {
   public FrameLayout a;
   public TextView b;
   public FrameLayout c;
   public boolean d = false;
   public boolean e = false;
   public Runnable f;
   public Runnable g;
   public CharSequence h = "";
   public boolean i = true;
   public boolean j = true;
   public boolean k;
   public boolean l;
   public .kge m;
   public .mbv n;
   public int o = 1;
   private ImageView p;
   private ImageView q;
   private int r;
   private int s;
   private int t;
   private int u;
   private int v;

   public SmartsChipView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.m = .kge.b;
      this.n = new .mbv();
   }

   public final void a(int var1) {
      ViewPropertyAnimator var3 = this.animate();
      float var2;
      if (var1 == 0) {
         var2 = 1.0F;
      } else {
         var2 = 0.0F;
      }

      var3.alpha(var2).setDuration((long)this.v).setListener(new .jjy(this, var1)).start();
   }

   public final void b() {
      this.h = "";
      this.e = false;
      this.d = false;
      this.a(8);
      Runnable var1 = this.g;
      if (var1 != null) {
         var1.run();
      }

      var1 = this.f;
      if (var1 != null) {
         var1.run();
      }

      this.n.close();
      this.f = null;
   }

   public final void c(.jjk var1) {
      .jkj var12 = var1.g;
      boolean var9 = var1.a;
      this.j = var1.c;
      this.k = var1.d;
      this.o = var1.h;
      this.i = var1.b;
      this.l = var1.e;
      this.m = var1.f;
      boolean var10 = .ktb.d(.ktb.a(var12.e.b().e));
      boolean var7 = .ktb.a(var12.e.b().e).equals(.ktb.c);
      boolean var8 = .ktb.a(var12.e.b().e).equals(.ktb.b);
      boolean var11 = this.k;
      boolean var6 = true;
      int var3;
      boolean var4;
      if (!var11) {
         var3 = this.o;
         if (var3 == 0) {
            throw null;
         }

         if (var3 != 1) {
            var4 = true;
         } else {
            var4 = false;
         }
      } else {
         var4 = true;
      }

      .fnu var13 = var12.g;
      .nom var14 = var12.h;
      var11 = .kfq.o(this.m);
      boolean var5;
      if (this.m.equals(.kge.e)) {
         label98: {
            if (!var10) {
               var3 = this.o;
               if (var3 == 0) {
                  throw null;
               }

               if (var3 == 4) {
                  var4 = true;
                  break label98;
               }
            }

            var4 = false;
         }

         if (var4) {
            var3 = this.s;
         } else {
            var3 = 0;
         }
      } else if (!var11) {
         boolean var15;
         label147: {
            label155: {
               if (!var7 || !(Boolean)((.mcy)var13.c).d) {
                  if (!var10) {
                     break label155;
                  }

                  var3 = this.o;
                  if (var3 == 0) {
                     throw null;
                  }

                  if (var3 != 4) {
                     break label155;
                  }
               }

               var15 = true;
               break label147;
            }

            if (var8 && (Boolean)((.mcy)var14.b).d) {
               var15 = true;
            } else {
               var15 = false;
            }
         }

         if ((!var7 || !(Boolean)((.mcy)var13.b).d) && (!var10 || !var4 || !this.i) && (!var8 || !(Boolean)((.mcy)var14.a).d)) {
            var5 = false;
         } else {
            var5 = true;
         }

         int var17;
         if (var10 && !this.l && this.j) {
            var17 = this.t;
         } else {
            var17 = 0;
         }

         int var16;
         if (!var15 && !var5) {
            var16 = 0;
         } else {
            var16 = this.s;
         }

         var16 += var17;
         var4 = var15;
         var3 = var16;
      } else {
         var4 = false;
         var3 = 0;
      }

      if (!var9 && var12.d) {
         var5 = var6;
      } else {
         var5 = false;
      }

      float var2 = (float)var3;
      if (var2 != this.getTranslationY()) {
         if (var5) {
            this.animate().translationY(var2).setDuration((long)this.v).start();
         } else {
            this.setTranslationY(var2);
         }
      }

      if (var12.d) {
         if (var4) {
            if (this.getVisibility() == 0) {
               this.a(8);
               return;
            }
         } else if (this.getVisibility() == 8) {
            this.a(0);
         }
      }

   }

   public final void d(.mdq var1, .jkj var2) {
      this.n.d(var1.eY(new .irz(this, var2, 5), .cck.a(this.getContext())));
   }

   public final void e(.jkj var1) {
      if (var1.r()) {
         .jlp var2 = var1.b;
         String var5 = var2.c;
         Drawable var6 = var2.d;
         Runnable var4 = var2.e;
         Runnable var3 = var2.h;
         if (var5 != null) {
            this.b.setText(var5);
            this.b.setVisibility(0);
         } else {
            this.b.setVisibility(8);
         }

         if (var6 != null) {
            this.p.setImageDrawable(var6);
            this.p.setVisibility(0);
         } else {
            this.p.setVisibility(8);
         }

         if (var4 != null) {
            this.a.setClickable(true);
            .imx var8 = new .imx(var1, var4, 4, (byte[])null);
            .enu var9 = new .enu(this, 7);
            this.a.setOnClickListener(var8);
            this.a.setOnTouchListener(var9);
            this.b.setOnClickListener(var8);
            this.b.setOnTouchListener(var9);
         } else {
            this.a.setClickable(false);
         }

         TextView var7;
         if (var3 != null) {
            this.q.setVisibility(0);
            this.q.setClickable(true);
            this.q.setOnClickListener(new .khb(this, var1, var3, 1));
            this.q.setContentDescription(this.getResources().getString(2132017475));
            var7 = this.b;
            var7.setPaddingRelative(var7.getPaddingLeft(), this.b.getPaddingTop(), 0, this.b.getPaddingBottom());
         } else {
            this.q.setVisibility(8);
            this.q.setContentDescription("");
            var7 = this.b;
            var7.setPaddingRelative(var7.getPaddingLeft(), this.b.getPaddingTop(), this.u, this.b.getPaddingBottom());
         }

         this.a.setVisibility(0);
         this.a.setContentDescription(var2.g);
      } else {
         this.a.setVisibility(8);
         this.a.setContentDescription("");
      }

      this.b.setMaxWidth(this.r);
      this.c.setVisibility(8);
      this.c.setContentDescription("");
   }

   public final void onFinishInflate() {
      super.onFinishInflate();
      this.a = (FrameLayout)this.findViewById(2131428216);
      this.p = (ImageView)this.findViewById(2131428218);
      this.b = (TextView)this.findViewById(2131428219);
      this.q = (ImageView)this.findViewById(2131428217);
      this.c = (FrameLayout)this.findViewById(2131428214);
      ImageView var1 = (ImageView)this.findViewById(2131428215);
      this.s = this.getContext().getResources().getDimensionPixelSize(2131166921);
      this.t = -.ktc.b(56.0F);
      this.v = this.getResources().getInteger(2131493028);
      this.getResources().getDimensionPixelSize(2131166904);
      this.r = this.getResources().getDimensionPixelSize(2131166905);
      this.u = this.getResources().getDimensionPixelSize(2131166908);
      .jjw var2 = new .jjw(this);
      this.a.setAccessibilityDelegate(new .jjx(this, var2));
      this.c.setAccessibilityDelegate(var2);
      this.b.setMovementMethod(new ScrollingMovementMethod());
   }
}
