package com.google.android.apps.camera.ui.layout;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicReference;

public class GcaLayout extends ConstraintLayout {
   public .oup a;
   public AtomicReference b;
   public .flx c;
   public .mve d;
   public .mdq e;
   protected boolean f;

   public GcaLayout(Context var1) {
      super(var1);
      this.a(var1);
   }

   public GcaLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var1);
   }

   public GcaLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var1);
   }

   private final void a(Context var1) {
      ((.kfs)((.gss)var1).b(.kfs.class)).a(this);
      .flx var3 = this.c;
      if (var3 != null) {
         this.f = var3.m(.fmd.cq);
         .flx var2 = this.c;
         .flz var4 = .fmc.a;
         var2.c();
      }

   }

   protected final boolean checkLayoutParams(LayoutParams var1) {
      return var1 instanceof .kft;
   }

   public final boolean gb(.kge var1) {
      return this.f || var1.equals(.kge.a) || var1.equals(.kge.d) || var1.equals(.kge.e);
   }

   public final .cad generateDefaultLayoutParams() {
      return new .kft();
   }

   public final .cad generateLayoutParams(AttributeSet var1) {
      return new .kft(this.getContext(), var1);
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      Object var6 = this.getTag();
      .onk.p(var6);
      Trace.beginSection(String.valueOf(var6.toString()).concat(".onLayout"));
      super.onLayout(var1, var2, var3, var4, var5);
      Trace.endSection();
   }

   public void onMeasure(int var1, int var2) {
      Object var9 = this.getTag();
      .onk.p(var9);
      Trace.beginSection(String.valueOf(var9.toString()).concat(".onMeasure"));
      var9 = this.a.a();
      .onk.p(var9);
      .kgk var15 = (.kgk)var9;
      .kgh var12 = var15.b;
      .kgj var11 = var15.a;
      .cap var10 = new .cap();
      var10.e(this);
      Trace.beginSection("GcaLayout#applyLayoutLogic");
      .kgp var16 = var15.c;
      int var5 = this.getChildCount();
      .kge var13 = var11.i;
      float var3 = this.getRotation();
      .kge var14 = .kge.a;
      int var6 = var13.ordinal();
      int var4 = 0;
      switch(var6) {
      case 0:
         var9 = new .kgb(var11, var10, this.getContext(), this.d);
         break;
      case 1:
      case 2:
         if (this.f) {
            boolean var8;
            if (var3 != 0.0F) {
               var8 = true;
            } else {
               var8 = false;
            }

            if (this.d.o) {
               var9 = new .kfz(var11, var10, this.getContext(), this.d, var8);
            } else {
               var9 = new .kfy(var11, var10, this.getContext(), this.d, var8);
            }
         } else {
            var9 = new .kga(var11, var10, this.getContext(), this.d, var12, var16);
         }
         break;
      case 3:
         var9 = new .kgc(var11, var10, this.getContext(), this.d);
         break;
      default:
         var9 = new .kgd(var11, var10, this.getContext(), this.d);
      }

      if (this.gb(var13)) {
         this.b.set(.kgk.a(var11, var12, (.kgp)null, (.kgo)var9));
      }

      ((.kgo)var9).o();
      ((.kgo)var9).z();

      for(; var4 < var5; ++var4) {
         View var17 = this.getChildAt(var4);
         var6 = ((.kft)var17.getLayoutParams()).ax;
         if (var6 != 0) {
            int var7 = var17.getId();
            var10.d(var7, 3);
            var10.d(var7, 6);
            var10.d(var7, 7);
            var10.d(var7, 4);
            switch(var6 - 1) {
            case 0:
               ((.kgo)var9).I(var17);
               break;
            case 1:
               ((.kgo)var9).w(var17);
               break;
            case 2:
               ((.kgo)var9).C(var17);
               break;
            case 3:
               ((.kgo)var9).p(var17);
               break;
            case 4:
               ((.kgo)var9).E(var17);
               break;
            case 5:
               ((.kgo)var9).t(var17);
               break;
            case 6:
               ((.kgo)var9).G(var17);
               break;
            case 7:
               ((.kgo)var9).F(var17);
               break;
            case 8:
               ((.kgo)var9).r(var17);
               break;
            case 9:
               ((.kgo)var9).x(var17);
               break;
            case 10:
               ((.kgo)var9).v(var17);
               break;
            case 11:
               ((.kgo)var9).q(var17);
               break;
            case 12:
               ((.kgo)var9).s(var17);
               break;
            case 13:
               ((.kgo)var9).B(var17);
               break;
            case 14:
               ((.kgo)var9).y(var17);
               break;
            case 15:
               ((.kgo)var9).u(var17);
               break;
            case 16:
               ((.kgo)var9).D(var17);
               break;
            default:
               ((.kgo)var9).A(var17);
            }
         } else {
            var17.requestLayout();
         }
      }

      Trace.endSection();
      var10.c(this);
      super.onMeasure(var1, var2);
      Trace.endSection();
   }
}
