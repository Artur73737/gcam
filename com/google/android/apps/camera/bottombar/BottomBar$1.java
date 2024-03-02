package com.google.android.apps.camera.bottombar;

import android.graphics.drawable.ColorDrawable;

class BottomBar$1 implements .ksr {
   final BottomBar this$0;

   public BottomBar$1(BottomBar var1) {
      this.this$0 = var1;
   }

   public int getColor() {
      return ((ColorDrawable)this.this$0.getBackground()).getColor();
   }

   public void setColor(int var1) {
      this.this$0.setBackgroundColor(var1);
   }
}
