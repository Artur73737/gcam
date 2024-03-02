package com.google.android.apps.camera.toast;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import j$.time.Duration;

public class ToastView extends FrameLayout {
   public static final Duration d = Duration.ofMillis(300L);
   public static final Duration e = Duration.ofMillis(300L);
   public static final .pds f = .pds.h("com.google.android.apps.camera.toast.ToastView");
   private View a;
   public float g;
   public long h;
   public Runnable i;
   public Runnable j;
   public Runnable k;
   public Runnable l;
   public PopupWindow m;
   public View n;

   public ToastView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.i = .jkc.e;
      this.j = .jkc.f;
      this.k = .jkc.g;
      this.l = .jkc.h;
   }

   public void b(.jxj var1) {
      TextView var3 = (TextView)this.findViewById(2131428349);
      if (var3 != null) {
         var3.setText((CharSequence)null);
      }

      var3 = (TextView)this.findViewById(2131428348);
      if (var3 != null) {
         var3.setText((CharSequence)null);
      }

      this.h = (long)var1.a() - e.toMillis() - d.toMillis();
      this.i = new .jvs(this, 17);
      this.g(var1);
      this.e();
      this.j = var1.b;
      this.k = var1.d;
      this.l = var1.c;
      View var4 = this.findViewById(2131428346);
      this.a = var4;
      if (var4 != null) {
         int var2 = var4.getPaddingBottom();
         DisplayMetrics var5 = this.getResources().getDisplayMetrics();
         this.g = TypedValue.applyDimension(0, (float)(var2 + var2), var5);
      }

   }

   public void c() {
      this.a.setOnClickListener(new .hje(this, 10));
   }

   public void d(.ktb var1) {
   }

   public final PopupWindow e() {
      PopupWindow var1 = new PopupWindow(new View(this.getContext()), 1, 1);
      this.m = var1;
      var1.setClippingEnabled(false);
      this.m.setOutsideTouchable(true);
      return this.m;
   }

   public final void f() {
      Runnable var1 = this.i;
      if (var1 != null) {
         this.removeCallbacks(var1);
      }

      this.setAlpha(0.0F);
      this.m.dismiss();
      this.removeAllViews();
      ViewGroup var2 = (ViewGroup)this.getParent();
      if (var2 != null) {
         var2.removeView(this);
      }
   }

   public final void g(.jxj var1) {
      this.n = var1.a;
   }

   public final void h() {
      this.animate().alpha(1.0F).setDuration(d.toMillis()).withEndAction(new .jvs(this, 18)).translationYBy(-this.g).start();
   }
}
