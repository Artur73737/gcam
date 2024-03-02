package com.google.android.apps.camera.zoomui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.SeekBar;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.libraries.lens.lenslite.dynamicloading.LjhL.xKbMW;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class ZoomKnob extends .jq {
   private static final .pds i = .pds.h("com.google.android.apps.camera.zoomui.view.ZoomKnob");
   public final AtomicBoolean a = new AtomicBoolean(false);
   public final Resources b;
   public final int c;
   public final int d;
   public final AtomicReference e;
   public int f;
   public float g;
   public SeekBar h;
   private final int j;
   private boolean k;
   private boolean l;
   private float m;

   public ZoomKnob(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.e = new AtomicReference(.lbs.b);
      this.k = false;
      this.l = false;
      Resources var5 = var1.getResources();
      this.b = var5;
      this.j = var5.getDimensionPixelSize(2131167555);
      int var3 = this.getResources().getDimensionPixelSize(2131167529);
      this.d = var3;
      this.c = (var3 - this.getResources().getDimensionPixelSize(2131167524)) / 2;
      if (var1 instanceof .efu) {
         .flx var6 = ((.efu)var1).a();
         Float var4 = .fmd.a;
         var6.g();
         this.l = var6.m(.fmd.ao);
         this.m = (Float)var6.i(.fmd.ap).get();
         this.k = var6.m(.fmd.ak);
      }

   }

   public final float a(float var1, float var2) {
      .lbs var3 = .lbs.a;
      switch(((.lbs)this.e.get()).ordinal()) {
      case 0:
         return 1.0F;
      case 1:
         if (var1 < 1.0F) {
            return 1.0F;
         }

         return var1;
      case 2:
      case 3:
         return var2;
      case 4:
         return var1;
      default:
         throw new IllegalArgumentException("Not a supported normalization setting: ".concat(String.valueOf(String.valueOf(this.e.get()))));
      }
   }

   public final String b(float var1, float var2, float var3) {
      float var6 = var1 / this.a(var2, var3);
      if (!Float.isNaN(var6) && !Float.isInfinite(var6) && !(var6 <= 0.0F)) {
         var2 = var6;
      } else {
         .pds var7 = i;
         ((.pdq)var7.c().I(4726)).t(xKbMW.xTxrIrTRYk, var6);
         ((.pdq)var7.c().I(4727)).D("Zoom ratio: %g, Min zoom: %g, BaseZoom: %g", var1, var2, var3);
         var2 = var1;
      }

      double var4 = (double)Math.round(var2 * 100.0F);
      Double.isNaN(var4);
      var4 = (new BigDecimal((double)((float)(var4 / 100.0D)))).setScale(2, RoundingMode.HALF_UP).doubleValue();
      DecimalFormat var8 = new DecimalFormat("0.0");
      RoundingMode var9;
      if (this.l && var1 < 1.0F) {
         var9 = RoundingMode.FLOOR;
      } else {
         var9 = RoundingMode.HALF_UP;
      }

      var8.setRoundingMode(var9);
      String var10 = String.valueOf(var8.format(var4));
      if (this.k) {
         var1 = (float)Math.round(10.0D * var4) / 10.0F;
         if (var1 >= this.m || var1 == (float)((int)var1)) {
            var10 = String.valueOf((new DecimalFormat("0")).format(Math.round(var4)));
         }
      }

      return var10.concat("×");
   }

   public final void c(boolean var1) {
      this.a.set(var1);
      LayoutParams var5 = (LayoutParams)this.getLayoutParams();
      int var4 = this.b.getDimensionPixelSize(2131167528);
      int var3 = this.b.getDimensionPixelSize(2131167524) / 2;
      int var2 = this.f;
      if (var1) {
         var2 += var4 + var3;
      }

      var5.bottomMargin = var2;
      this.setLayoutParams(var5);
   }

   public final void d(boolean var1) {
      if (var1) {
         this.h.getThumb().mutate().setAlpha(255);
      } else {
         this.h.getThumb().mutate().setAlpha(0);
      }
   }

   public final void e(int var1, float var2, float var3, float var4) {
      float var6 = (float)this.j;
      float var5 = this.g;
      LayoutParams var7 = (LayoutParams)this.getLayoutParams();
      var7.leftMargin = (int)((float)((int)(var6 * var5) / 2) * (float)(var1 - '썐') / 50000.0F);
      var7.rightMargin = 0;
      this.setLayoutParams(var7);
      this.setText(this.b(var2, var3, var4));
   }
}
