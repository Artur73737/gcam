package com.google.android.clockwork.common.wearable.wearmaterial.button;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewOverlay;

public final class WearSnapshot {
   private static final Rect b = new Rect();
   public final BitmapDrawable a;
   private final View c;

   public WearSnapshot(BitmapDrawable var1, View var2) {
      this.c = var2;
      this.a = var1;
   }

   public final ViewOverlay a() {
      return ((View)this.c.getParent()).getOverlay();
   }

   public final void b() {
      this.a().remove(this.a);
   }

   public int getAlpha() {
      return this.a.getAlpha();
   }

   public void setAlpha(int var1) {
      this.a.setAlpha(var1);
      Rect var4 = b;
      this.c.getHitRect(var4);
      int var2 = var4.top;
      var1 = var4.left;
      int var3 = var4.right;
      this.a.copyBounds(var4);
      if (this.c.getLayoutDirection() == 1) {
         var1 = var3 - var4.width();
      }

      var4.offsetTo(var1, var2);
      this.a.setBounds(var4);
   }
}
