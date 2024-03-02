package com.google.android.apps.camera.uiutils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ReplaceableView extends View {
   public ReplaceableView(Context var1) {
      super(var1);
   }

   public ReplaceableView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final void a(View var1) {
      this.getParent().getClass();
      ViewGroup var3 = (ViewGroup)this.getParent();
      int var2 = var3.indexOfChild(this);
      var3.removeView(this);
      var3.addView(var1, var2);
   }
}
