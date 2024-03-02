package com.google.android.apps.camera.ui.eduimageview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageView.ScaleType;

public class EduImageView extends FrameLayout {
   public ImageView a;
   public TextView b;

   public EduImageView(Context var1) {
      super(var1);
   }

   public EduImageView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public EduImageView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public static void d(Context var0) {
      Resources var1 = var0.getResources();
      .oka var2 = new .oka(var0, 2132083707);
      var2.t(var1.getString(2132017697));
      var2.m(var1.getString(2132017431));
      var2.r(var1.getString(2132017479), .hst.a);
      var2.c();
   }

   public final void a() {
      this.a.setBackgroundColor(0);
   }

   public final void b(Drawable var1, String var2) {
      this.a.setImageDrawable(var1);
      this.a.setContentDescription(var2);
      this.a.setScaleType(ScaleType.CENTER_CROP);
   }

   public final void c(String var1, String var2) {
      this.e(var1, var2, (.lmg)null);
   }

   public final void e(String var1, String var2, .lmg var3) {
      (new .kdz(this, this.getContext(), var1, var2, var3)).b(false);
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624026, this);
      this.a = (ImageView)this.findViewById(2131427769);
      this.b = (TextView)this.findViewById(2131428330);
   }
}
