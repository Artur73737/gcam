package com.google.android.apps.camera.ui.compositevideoview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.ViewOutlineProvider;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.VideoView;
import com.google.android.material.progressindicator.CircularProgressIndicator;

public final class CompositeVideoView extends FrameLayout {
   public VideoView a;
   public CircularProgressIndicator b;
   public .jzt c;
   private ImageView d;

   public CompositeVideoView(Context var1) {
      super(var1);
   }

   public CompositeVideoView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public CompositeVideoView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public final void a() {
      this.d.setVisibility(8);
   }

   public final void b() {
      this.b.setVisibility(8);
   }

   public final void c(int var1) {
      this.a.seekTo(var1);
      this.a.setBackground((Drawable)null);
   }

   public final void d() {
      this.setBackgroundResource(2131231107);
   }

   public final void e() {
      this.setBackgroundResource(2131231108);
   }

   public final void f(String var1) {
      this.a.setVideoURI(Uri.parse(var1));
   }

   public final void g() {
      this.b.setVisibility(8);
      this.d.setImageResource(2131231597);
      ImageView var1 = this.d;
      var1.setContentDescription(var1.getResources().getString(2132017447));
      this.d.setOnClickListener(new .hje(this, 15));
      this.d.setVisibility(0);
   }

   public final void h() {
      this.b.setVisibility(8);
      this.d.setImageResource(2131231140);
      ImageView var1 = this.d;
      var1.setContentDescription(var1.getResources().getString(2132017448));
      this.d.setOnClickListener(new .hje(this, 16));
      this.d.setVisibility(0);
   }

   public final void i() {
      this.d.setImageResource(2131231597);
      ImageView var1 = this.d;
      var1.setContentDescription(var1.getResources().getString(2132017447));
      this.d.setOnClickListener((OnClickListener)null);
      this.d.setVisibility(0);
      this.b.setVisibility(0);
   }

   public final void j() {
      this.a.start();
      this.a.setBackground((Drawable)null);
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      this.setBackgroundResource(2131231106);
      this.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
      this.setClipToOutline(true);
      LayoutInflater.from(this.getContext()).inflate(2131624004, this);
      this.a = (VideoView)this.findViewById(2131427603);
      this.d = (ImageView)this.findViewById(2131427601);
      this.b = (CircularProgressIndicator)this.findViewById(2131427602);
      GestureDetector var1 = new GestureDetector(this.getContext(), new .jzs(this));
      this.a.setOnTouchListener(new .enu(var1, 16));
      this.a.setOnClickListener(new .hje(this, 17));
      this.a.setOnCompletionListener(new .kwi(this, 1));
      this.a.setOnPreparedListener(new .kwj(this, 1));
      this.g();
   }

   protected final void onMeasure(int var1, int var2) {
      if (MeasureSpec.getMode(var1) == 1073741824) {
         var2 = MeasureSpec.makeMeasureSpec(Math.round((float)MeasureSpec.getSize(var1) * 16.0F / 9.0F), 1073741824);
      }

      super.onMeasure(var1, var2);
   }
}
