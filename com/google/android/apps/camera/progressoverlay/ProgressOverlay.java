package com.google.android.apps.camera.progressoverlay;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class ProgressOverlay extends FrameLayout {
   public AnimatedVectorDrawable a;
   private ImageView b;

   public ProgressOverlay(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final void a() {
      super.onFinishInflate();
      LayoutInflater var1 = (LayoutInflater)this.getContext().getSystemService("layout_inflater");
      this.removeAllViewsInLayout();
      var1.inflate(2131624052, this);
      this.b = (ImageView)this.findViewById(2131427812);
      AnimatedVectorDrawable var2 = (AnimatedVectorDrawable)this.getContext().getDrawable(2131231405);
      this.a = var2;
      this.b.setImageDrawable(var2);
   }

   public final void b() {
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624177, this);
      this.b = (ImageView)this.findViewById(2131428071);
      AnimatedVectorDrawable var1 = (AnimatedVectorDrawable)this.getContext().getDrawable(2131231542);
      this.a = var1;
      this.b.setImageDrawable(var1);
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      this.b();
   }
}
