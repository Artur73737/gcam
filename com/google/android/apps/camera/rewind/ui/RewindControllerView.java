package com.google.android.apps.camera.rewind.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class RewindControllerView extends FrameLayout {
   public .ktb a;

   public RewindControllerView(Context var1) {
      super(var1);
      this.a = .ktb.a;
   }

   public RewindControllerView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a = .ktb.a;
   }

   public RewindControllerView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a = .ktb.a;
   }

   public final void a() {
      .jbc.aA(this, this.a);
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (this.a != null && var1) {
         this.a();
      }

   }

   protected final void onMeasure(int var1, int var2) {
      .ktb var3 = this.a;
      if (var3 != null && !.ktb.d(var3)) {
         super.onMeasure(var2, var1);
      } else {
         super.onMeasure(var1, var2);
      }
   }
}
