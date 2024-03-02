package com.google.android.apps.camera.ui.notificationchip;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;

public class NotificationChipView extends .jq {
   public final Context a;
   public int b;
   public boolean c;
   public .kjt d;
   public .kge e;
   public long f;
   public Runnable g;
   public final .nvr h = new .nvr();
   private LayoutParams i;

   public NotificationChipView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a = var1;
   }

   public final void a() {
      this.removeCallbacks(this.g);
   }

   public final void b() {
      if (this.getDisplay() != null && this.i != null) {
         .ktb var2 = .ktb.b(this.getDisplay(), this.a);
         LayoutParams var3 = (LayoutParams)this.getLayoutParams();
         Resources var4 = this.a.getResources();
         LayoutParams var5;
         if (.kfq.o(this.e)) {
            var5 = new LayoutParams(this.i);
            var5.topMargin = var4.getDimensionPixelSize(2131166606);
         } else if (var2 == .ktb.a) {
            int var1 = var4.getDimensionPixelSize(2131166605);
            var5 = new LayoutParams(this.i);
            var5.topMargin = var1;
         } else if (var2 == .ktb.c) {
            var5 = new LayoutParams(this.i);
            var5.bottomMargin = this.i.topMargin;
            var5.gravity = 81;
         } else {
            var5 = this.i;
         }

         if (var3.topMargin != var5.topMargin || var3.bottomMargin != var5.bottomMargin || var3.gravity != var5.gravity) {
            this.setLayoutParams(var5);
         }
      }
   }

   public final void c(int var1) {
      this.postDelayed(this.g, (long)var1);
   }

   public final void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.i = (LayoutParams)this.getLayoutParams();
   }
}
