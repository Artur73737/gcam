package com.google.android.clockwork.common.wearable.wearmaterial.slider;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.wear.ambient.AmbientMode$AmbientController;
import com.google.android.clockwork.common.wearable.wearmaterial.preference.WearInlineSliderPreference;

public final class WearInlineSlider extends LinearLayout {
   public float a;
   public float b;
   public float c;
   public float d;
   public WearInlineSliderPreference e;
   private final ImageView f;
   private final ImageView g;
   private final ImageView h;
   private final SliderProgressDrawable i;
   private final .lgk j;
   private final ObjectAnimator k;
   private final Runnable l;
   private boolean m;
   private boolean n;

   public WearInlineSlider(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public WearInlineSlider(Context var1, AttributeSet var2) {
      this(var1, var2, 2130969430);
   }

   public WearInlineSlider(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 2132084617);
   }

   public WearInlineSlider(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      SliderProgressDrawable var5 = new SliderProgressDrawable();
      this.i = var5;
      this.l = new .lgl(this, 0);
      this.setOrientation(0);
      this.setClipToOutline(true);
      Context var8 = this.getContext();
      LayoutInflater.from(var8).inflate(2131624264, this, true);
      ImageView var10 = (ImageView)this.findViewById(2131427778);
      this.f = var10;
      ImageView var6 = (ImageView)this.findViewById(2131427777);
      this.g = var6;
      ImageView var7 = (ImageView)this.findViewById(2131427779);
      this.h = var7;
      var7.setOutlineProvider(new .lgm(var8.getResources().getDimensionPixelSize(2131165836)));
      var7.setClipToOutline(true);
      var7.setImageDrawable(var5);
      .lgk var12 = new .lgk(var10, var6);
      this.j = var12;
      var12.e = new AmbientMode$AmbientController(this);
      ObjectAnimator var9 = (ObjectAnimator)AnimatorInflater.loadAnimator(var8, 2130837580);
      this.k = var9;
      var9.setTarget(var5);
      TypedArray var11 = var8.obtainStyledAttributes(var2, .lgh.a, var3, var4);
      var12.a = var11.getBoolean(5, false);
      var12.a();
      this.h(var11.getFloat(2, 0.0F));
      this.i(var11.getFloat(3, 1.0F));
      this.f(var11.getFloat(1, 0.0F));
      this.g(var11.getFloat(0, 0.0F));
      var3 = var11.getColor(9, 0);
      var5.a.setColor(var3);
      var3 = var11.getColor(13, 0);
      var5.b.setColor(var3);
      this.d(var11.getBoolean(14, false));
      this.e(var11.getBoolean(15, false));
      var10.setImageDrawable(var11.getDrawable(11));
      var6.setImageDrawable(var11.getDrawable(8));
      var3 = var11.getColor(6, 0);
      var5.c.setColor(var3);
      this.a(var11.getString(7));
      this.b(var11.getString(10));
      this.c(var11.getString(12));
      var11.recycle();
      this.j();
   }

   private final void l() {
      this.removeCallbacks(this.l);
      this.post(this.l);
   }

   private final void m(float var1, boolean var2) {
      float var4 = this.d;
      float var5 = this.a;
      float var3 = 0.0F;
      if (var5 > 0.0F) {
         int var7 = Math.round((var1 - this.b) / var5);
         var1 = this.b;
         var1 = .mzx.dI((float)var7 * this.a + var1, var1, this.c);
         this.d = var1;
      } else {
         var1 = .mzx.dI(var1, this.b, this.c);
         this.d = var1;
      }

      boolean var10;
      if (var1 != var4) {
         var10 = true;
      } else {
         var10 = false;
      }

      WearInlineSliderPreference var8 = this.e;
      if (var8 != null && var10 && var8.a != var1) {
         if (var8.W(var1)) {
            var8.k(var1, false);
         } else {
            this.g(var8.a);
         }

         .cpp var9 = var8.o;
         if (var9 == null || !var9.a()) {
            .cqg var11 = var8.k;
            if (var11 != null) {
               .cqa var12 = var11.c;
               if (var12 != null) {
                  var12.B(var8);
               }
            }
         }
      }

      if (var2 || var10) {
         var4 = this.i.getFillAmount();
         if (this.n) {
            var1 = this.b - this.a;
         } else {
            var1 = this.b;
         }

         float var6 = this.d;
         var5 = this.c - var1;
         if (var5 == 0.0F) {
            var1 = var3;
         } else {
            var1 = (var6 - var1) / var5;
         }

         if (var4 != var1) {
            if (this.isLaidOut()) {
               this.k.cancel();
               this.k.setFloatValues(new float[]{this.i.getFillAmount(), var1});
               this.k.start();
            } else {
               this.i.setFillAmount(var1);
            }
         }
      }

      this.invalidate();
   }

   public final void a(CharSequence var1) {
      this.g.setContentDescription(var1);
   }

   public final void b(CharSequence var1) {
      this.f.setContentDescription(var1);
   }

   public final void c(CharSequence var1) {
      this.h.setContentDescription(var1);
   }

   public final void d(boolean var1) {
      if (this.m != var1) {
         this.m = var1;
         this.l();
      }

   }

   public final void e(boolean var1) {
      if (this.n != var1) {
         this.n = var1;
         this.l();
      }

   }

   public final void f(float var1) {
      if (this.a != var1) {
         this.a = var1;
         this.l();
      }

   }

   public final void g(float var1) {
      if (this.d != var1) {
         this.m(var1, false);
      }

   }

   public final void h(float var1) {
      if (this.b != var1) {
         this.b = var1;
         this.l();
      }

   }

   public final void i(float var1) {
      if (this.c != var1) {
         this.c = var1;
         this.l();
      }

   }

   public final void j() {
      float var1;
      float var2;
      float var3;
      label21: {
         var3 = Math.max(this.b, this.c);
         this.c = var3;
         var2 = this.a;
         if (!(var2 <= 0.0F)) {
            var1 = var2;
            if (!((var3 - this.b) % var2 > 0.0F)) {
               break label21;
            }
         }

         var1 = var3 - this.b;
         this.a = var1;
      }

      boolean var6 = this.m;
      int var4 = 0;
      if (var6) {
         var2 = var3 - this.b;
         var3 = var2 / var1;
         if (var3 <= 8.0F && var2 % var1 == 0.0F) {
            var6 = this.n;
            int var5 = (int)var3;
            var4 = var5;
            if (var6) {
               var4 = var5 + 1;
            }
         }
      }

      this.m(this.d, true);
      SliderProgressDrawable var7 = this.i;
      var7.d = (float)var4;
      var7.invalidateSelf();
      this.j.a();
   }
}
