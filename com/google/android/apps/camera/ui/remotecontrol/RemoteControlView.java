package com.google.android.apps.camera.ui.remotecontrol;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.FrameLayout.LayoutParams;

public class RemoteControlView extends FrameLayout {
   public TextView a;
   public TextView b;
   public TextView c;
   public TextView d;
   public View e;
   public View f;
   private LinearLayout g;
   private int h;

   public RemoteControlView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   private final void b(int var1) {
      LayoutParams var2 = (LayoutParams)this.g.getLayoutParams();
      var2.topMargin = this.h;
      var2.bottomMargin = this.h;
      var2.gravity = var1 | 1;
      this.g.setLayoutParams(var2);
   }

   public final void a() {
      this.b.setText("--");
      this.a.setText("--");
      this.c.setText("");
      this.e.setVisibility(8);
      this.d.setText("");
      this.f.setVisibility(8);
   }

   protected final void onFinishInflate() {
      Trace.beginSection("RemoteControlUi:inflate");
      super.onFinishInflate();
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624179, this);
      this.a = (TextView)this.findViewById(2131427619);
      this.b = (TextView)this.findViewById(2131428036);
      this.c = (TextView)this.findViewById(2131428443);
      this.d = (TextView)this.findViewById(2131428446);
      this.e = this.findViewById(2131428444);
      this.f = this.findViewById(2131428447);
      this.g = (LinearLayout)this.findViewById(2131428088);
      this.h = this.getResources().getDimensionPixelSize(2131166800);
      this.a();
      Trace.endSection();
   }

   public final void onMeasure(int var1, int var2) {
      switch(.ktb.b(this.getDisplay(), this.getContext()).ordinal()) {
      case 0:
      case 3:
         LayoutParams var3 = (LayoutParams)this.g.getLayoutParams();
         var3.topMargin = this.h;
         var3.gravity = 49;
         this.g.setLayoutParams(var3);
         break;
      case 1:
         this.b(80);
         break;
      case 2:
         this.b(48);
      }

      super.onMeasure(var1, var2);
   }
}
