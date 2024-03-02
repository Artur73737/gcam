package com.google.android.apps.camera.camcorder.ui.stabilization;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuButton;

public class StabilizationUi extends FrameLayout {
   public final .oze a;
   public PopupMenuButton b;
   public FrameLayout c;
   public .ktb d;
   public .ktb e;
   public .kge f;
   private ValueAnimator g;

   public StabilizationUi(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a = .oze.q(.fes.a, 2131231669, .fes.b, 2131231666, .fes.d, 2131231668, .fes.c, 2131231665);
      this.d = .ktb.a;
      this.e = .ktb.a;
      this.f = .kge.b;
   }

   public final void a(.ktb var1) {
      this.d = var1;
      .jbc.aC(this.b, var1);
   }

   public final void b(boolean var1, boolean var2) {
      float var3;
      if (!.fjn.O(this.f, this.e)) {
         var3 = 0.0F;
      } else {
         var3 = 0.7F;
      }

      if (!var2) {
         if (!var1) {
            var3 = 1.0F;
         }

         this.b.setAlpha(var3);
      } else {
         this.g.cancel();
         ValueAnimator var4 = ValueAnimator.ofFloat(new float[]{1.0F, var3});
         var4.setDuration(1000L);
         var4.setInterpolator(new LinearInterpolator());
         var4.setRepeatCount(-1);
         var4.setRepeatMode(2);
         var4.addUpdateListener(new .cgv(this, 4, (byte[])null));
         if (var1) {
            var4.start();
         } else {
            this.b.setAlpha(1.0F);
         }

         this.g = var4;
      }
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624225, this);
      this.c = (FrameLayout)this.findViewById(2131428267);
      PopupMenuButton var1 = (PopupMenuButton)this.findViewById(2131428266);
      this.b = var1;
      Integer var2 = (Integer)this.a.get(.fes.a);
      var2.getClass();
      var1.setImageResource(var2);
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1) {
         this.a(this.d);
      }

   }
}
