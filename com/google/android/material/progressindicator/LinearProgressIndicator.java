package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;

public final class LinearProgressIndicator extends .olw {
   public LinearProgressIndicator(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public LinearProgressIndicator(Context var1, AttributeSet var2) {
      this(var1, var2, 2130969640);
   }

   public LinearProgressIndicator(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3, 2132084834);
      Context var7 = this.getContext();
      .omw var4 = (.omw)this.a;
      .omo var5 = new .omo(var4);
      Object var6;
      if (var4.g == 0) {
         var6 = new .omr(var4);
      } else {
         var6 = new .omv(var7, var4);
      }

      this.setIndeterminateDrawable(new .omn(var7, var4, var5, (.omm)var6));
      var7 = this.getContext();
      .omw var8 = (.omw)this.a;
      this.setProgressDrawable(new .omg(var7, var8, new .omo(var8)));
   }

   public final void g(int var1) {
      .olx var2 = this.a;
      if (var2 == null || ((.omw)var2).g != 0 || !this.isIndeterminate()) {
         super.g(var1);
      }
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      .omw var6 = (.omw)this.a;
      var2 = var6.h;
      var1 = true;
      if (var2 != 1 && (.cfy.c(this) != 1 || ((.omw)this.a).h != 2) && (.cfy.c(this) != 0 || ((.omw)this.a).h != 3)) {
         var1 = false;
      }

      var6.i = var1;
   }

   protected final void onSizeChanged(int var1, int var2, int var3, int var4) {
      int var5 = this.getPaddingLeft();
      int var6 = this.getPaddingRight();
      var3 = this.getPaddingTop();
      var4 = this.getPaddingBottom();
      .omn var7 = this.c();
      var1 -= var5 + var6;
      var2 -= var3 + var4;
      if (var7 != null) {
         var7.setBounds(0, 0, var1, var2);
      }

      .omg var8 = this.b();
      if (var8 != null) {
         var8.setBounds(0, 0, var1, var2);
      }

   }
}
