package com.google.android.apps.camera.ui.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.time.Duration;
import j$.util.Collection$_EL;

public class ToggleUi extends FrameLayout {
   public static final Duration a = Duration.ofMillis(200L);
   private static final .pds h = .pds.h("com.google.android.apps.camera.ui.views.ToggleUi");
   public .ktb b;
   public ToggleUi$ToggleButton c;
   public TextView d;
   public ImageView e;
   public AnimatorSet f;
   public float g;
   private FrameLayout i;

   public ToggleUi(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.b = .ktb.a;
      this.g = 1.0F;
   }

   private static void h(ValueAnimator var0, AnimatorUpdateListener var1) {
      var0.addUpdateListener(var1);
      var0.setInterpolator(new .clf());
   }

   public final void a(.ktb var1) {
      this.b = var1;
      Collection$_EL.forEach(.jbc.ar(this.i), new .jnx(var1, 11));
   }

   public final void b() {
      AnimatorSet var1 = this.f;
      if (var1 != null && var1.isRunning()) {
         this.f.cancel();
      }

   }

   public final void c() {
      this.d.setVisibility(8);
      this.c.setAlpha(1.0F);
   }

   public final void d() {
      ValueAnimator var3 = ValueAnimator.ofFloat(new float[]{0.0F, this.g});
      h(var3, new .kpw(this, 1));
      ValueAnimator var1 = ValueAnimator.ofFloat(new float[]{0.0F, 1.0F});
      h(var1, new .kpw(this, 0));
      AnimatorSet var2 = new AnimatorSet();
      this.f = var2;
      var2.playTogether(new Animator[]{var3, var1});
      this.f.setDuration(a.toMillis());
      this.f.addListener(new .kpy(this));
   }

   public final void e(int var1) {
      this.e.setImageResource(var1);
   }

   public final void f(Drawable var1) {
      if (var1 != null) {
         this.c.setImageDrawable(var1);
      } else {
         ((.pdq)h.b().I(4539)).q("Invalid button image resource.");
      }
   }

   public final void g(int var1) {
      this.i.setContentDescription(this.getResources().getString(var1));
   }

   protected final void onFinishInflate() {
      Trace.beginSection("ToggleUi:inflate");
      super.onFinishInflate();
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624234, this);
      Trace.endSection();
      this.i = (FrameLayout)this.findViewById(2131428356);
      this.c = (ToggleUi$ToggleButton)this.findViewById(2131428355);
      this.e = (ImageView)this.findViewById(2131428352);
      this.d = (TextView)this.findViewById(2131428358);
      .cgm.g(this.i, new .kpx());
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1) {
         this.a(this.b);
      }

   }
}
