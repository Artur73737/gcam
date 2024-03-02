package com.google.android.apps.camera.ui.modeslider;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;

public class ModeSliderUi extends FrameLayout {
   private ModeSlider a;
   private RecordSpeedSlider b;

   public ModeSliderUi(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final RecordSpeedSlider a() {
      RecordSpeedSlider var1 = this.b;
      var1.getClass();
      return var1;
   }

   public final ModeSlider b() {
      ModeSlider var1 = this.a;
      var1.getClass();
      return var1;
   }

   public final void onFinishInflate() {
      super.onFinishInflate();
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624099, this);
      ModeSlider var1 = (ModeSlider)this.findViewById(2131427929);
      var1.getClass();
      this.a = var1;
      RecordSpeedSlider var2 = (RecordSpeedSlider)this.findViewById(2131428084);
      var2.getClass();
      this.b = var2;
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1) {
         this.b().c = this.getMeasuredWidth();
         this.b().post(new .kgy(this, 5));
      }

   }
}
