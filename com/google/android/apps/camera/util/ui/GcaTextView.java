package com.google.android.apps.camera.util.ui;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;

public class GcaTextView extends .jq {
   public GcaTextView(Context var1) {
      super(var1);
      this.a();
   }

   public GcaTextView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a();
   }

   public GcaTextView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a();
   }

   private final void a() {
      this.setSingleLine();
      this.setEllipsize(TruncateAt.MARQUEE);
      this.setMarqueeRepeatLimit(-1);
      this.postDelayed(new .ktx(this, 2), 1500L);
   }
}
