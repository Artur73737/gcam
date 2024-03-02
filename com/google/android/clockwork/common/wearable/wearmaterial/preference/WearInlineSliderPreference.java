package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.google.android.clockwork.common.wearable.wearmaterial.slider.WearInlineSlider;

public class WearInlineSliderPreference extends Preference {
   public float a;
   private final float b;
   private final float c;
   private final float d;
   private final boolean e;
   private final boolean f;
   private CharSequence g;
   private CharSequence h;
   private CharSequence i;

   public WearInlineSliderPreference(Context var1, AttributeSet var2) {
      super(var1, var2, 2130969429, 0);
      TypedArray var3 = var1.obtainStyledAttributes(var2, .lfw.c, 2130969429, 0);
      this.b = var3.getFloat(3, 0.0F);
      this.c = var3.getFloat(2, 1.0F);
      this.f = var3.getBoolean(4, false);
      this.d = var3.getFloat(0, 1.0F);
      this.e = var3.getBoolean(1, false);
      if (var3.hasValue(7)) {
         this.g = var3.getString(7);
      }

      if (var3.hasValue(10)) {
         this.h = var3.getString(10);
      }

      if (var3.hasValue(12)) {
         this.i = var3.getString(12);
      }

      var3.recycle();
   }

   public final void a(.cqj var1) {
      super.a(var1);
      WearInlineSlider var3 = (WearInlineSlider)var1.a;
      var3.e = this;
      var3.h(this.b);
      var3.i(this.c);
      var3.g(this.a);
      var3.f(this.d);
      var3.d(this.e);
      var3.e(this.f);
      CharSequence var2 = this.h;
      if (var2 != null) {
         var3.b(var2);
      }

      var2 = this.g;
      if (var2 != null) {
         var3.a(var2);
      }

      var2 = this.i;
      if (var2 != null) {
         var3.c(var2);
      }

   }

   protected final Object f(TypedArray var1, int var2) {
      return var1.getFloat(var2, 0.0F);
   }

   protected final void h(Object var1) {
      Object var2 = var1;
      if (var1 == null) {
         var2 = this.b;
      }

      this.k(this.p((Float)var2), true);
   }

   public final void k(float var1, boolean var2) {
      if (this.a != var1) {
         this.a = var1;
         if (this.aa() && var1 != this.p(Float.NaN)) {
            Editor var3 = super.k.b();
            var3.putFloat(super.r, var1);
            super.U(var3);
         }

         if (var2) {
            this.d();
            return;
         }
      }

   }
}
