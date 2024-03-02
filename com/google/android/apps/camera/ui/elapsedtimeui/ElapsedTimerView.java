package com.google.android.apps.camera.ui.elapsedtimeui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.memorymonitor.Xhk.PUdPFKr;

public class ElapsedTimerView extends LinearLayout {
   public ElapsedTimerView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final TextView a() {
      return (TextView)this.findViewById(2131428018);
   }

   public final TextView b() {
      return (TextView)this.findViewById(2131428085);
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      ((LayoutInflater)this.getContext().getSystemService(PUdPFKr.pbkvWgc)).inflate(2131624027, this);
   }
}
