package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.os.Trace;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class TimerWidget extends LinearLayoutCompat {
   public .imy a;

   public TimerWidget(Context var1) {
      super(var1);
   }

   public TimerWidget(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public TimerWidget(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public final LinearLayout a() {
      return (LinearLayout)this.findViewById(2131428336);
   }

   protected final void onFinishInflate() {
      Trace.beginSection("timerWidget:inflate");
      super.onFinishInflate();
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624230, this);
      Trace.endSection();
   }
}
