package com.google.android.apps.camera.zoomui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.InsetDrawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.TextView;
import android.widget.FrameLayout.LayoutParams;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Collection$_EL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ZoomUi extends FrameLayout implements .kfw, .hgy, .hgx {
   public static final Object a = new Object();
   public static final .pds b = .pds.h("com.google.android.apps.camera.zoomui.view.ZoomUi");
   public final List c = new ArrayList();
   public final ValueAnimator d;
   public .ktb e;
   public boolean f;
   public float g;
   public ObjectAnimator h;
   public AnimatorSet i;
   public AnimatorSet j;
   public .jhd k;
   public int l;
   private final boolean m;
   private final AnimatorUpdateListener n;
   private .kge o;
   private boolean p;

   public ZoomUi(Context var1, AttributeSet var2) {
      super(var1, var2);
      .lef var4 = new .lef(this, 1);
      this.n = var4;
      this.e = .ktb.a;
      this.p = true;
      this.l = 1;
      ValueAnimator var5 = new ValueAnimator();
      this.d = var5;
      var5.addUpdateListener(var4);
      var5.setInterpolator(new .clf());
      var5.setDuration(200L);
      boolean var3;
      if (var1 instanceof .efu) {
         var3 = .mzx.dP(((.efu)var1).a());
      } else {
         var3 = false;
      }

      this.m = var3;
   }

   private final void H() {
      boolean var1;
      if (!this.p) {
         if (.kfq.o(this.o)) {
            var1 = true;
         } else {
            var1 = false;
         }
      } else {
         var1 = true;
      }

      Collection$_EL.forEach(.ozr.M(this.e(), this.f(), this.t(), this.p(), this.r(), this.q(), this.s(), this.n()), new .lbz(this, var1, 0));
      if (this.m) {
         Collection$_EL.forEach(.ozr.I(this.u(), this.o()), new .lbz(this, var1, 2));
      }

   }

   public static ObjectAnimator b(View var0, boolean var1) {
      ObjectAnimator var2;
      if (var1) {
         var2 = ObjectAnimator.ofFloat(var0, "alpha", new float[]{0.0F, 1.0F});
      } else {
         var2 = ObjectAnimator.ofFloat(var0, "alpha", new float[]{1.0F, 0.0F});
      }

      var2.setDuration(100L);
      var2.setInterpolator(new .clf());
      return var2;
   }

   public final void A(int var1, boolean var2) {
      LayoutParams var4 = (LayoutParams)this.h().getLayoutParams();
      LayoutParams var5 = (LayoutParams)this.i().getLayoutParams();
      if (var4.leftMargin != this.a(var1)) {
         var5.leftMargin = var4.leftMargin;
         var4.leftMargin = this.a(var1);
         this.i().setLayoutParams(var5);
         this.h().setLayoutParams(var4);
         TypedValue var6 = new TypedValue();
         this.getResources().getValue(2131167588, var6, true);
         float var3 = var6.getFloat();
         if (var2) {
            this.h().setAlpha(0.0F);
            this.h().setScaleY(var3);
            this.h().setScaleX(var3);
            this.i().setAlpha(1.0F);
            this.i().setVisibility(0);
            this.i().animate().alpha(0.5F).scaleX(var3).scaleY(var3).setDuration(100L).setListener(new .lch(this)).start();
            this.h().animate().alpha(1.0F).scaleY(1.0F).scaleX(1.0F).setDuration(100L).start();
         } else if (this.h().getAlpha() == 1.0F) {
            this.h().setAlpha(0.0F);
            this.h().setScaleX(0.0F);
            this.h().setScaleY(0.0F);
            this.i().setVisibility(4);
            this.h().animate().alpha(1.0F).scaleX(1.0F).scaleY(1.0F).setDuration(200L).start();
         }

         this.k().setProgress(var1);
      }
   }

   public final void B(int var1) {
      this.d.setIntValues(new int[]{((LayoutParams)this.h().getLayoutParams()).leftMargin, this.a(var1)});
      if (this.d.isRunning()) {
         this.d.end();
      }

      this.d.start();
      this.k().setProgress(var1);
   }

   public final boolean C(boolean var1, AnimatorListener var2) {
      if (!this.f) {
         return false;
      } else {
         this.h.cancel();
         if (!var1) {
            this.h.reverse();
            this.h.end();
            this.f = false;
            return false;
         } else {
            this.f = false;
            if (var2 != null) {
               this.h.addListener(var2);
            }

            this.h.reverse();
            return true;
         }
      }
   }

   public final boolean D() {
      Object var4 = a;
      synchronized(var4){}

      Throwable var10000;
      boolean var10001;
      label158: {
         int var1;
         try {
            var1 = this.l;
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label158;
         }

         boolean var3 = true;
         boolean var2 = var3;
         if (var1 != 2) {
            var2 = var3;
            if (var1 != 3) {
               if (var1 == 4) {
                  var2 = var3;
               } else {
                  var2 = false;
               }
            }
         }

         label149:
         try {
            return var2;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label149;
         }
      }

      while(true) {
         Throwable var5 = var10000;

         try {
            throw var5;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            continue;
         }
      }
   }

   public final int E(int var1) {
      .lbv var2 = .lbv.a;
      if (var1 != 0) {
         switch(var1 - 1) {
         case 2:
            var1 = this.getResources().getDimensionPixelSize(2131167601);
            break;
         case 3:
            var1 = this.getResources().getDimensionPixelSize(2131167592);
            break;
         default:
            var1 = this.getResources().getDimensionPixelSize(2131167599);
         }

         return var1;
      } else {
         throw null;
      }
   }

   public final AnimatorSet F(int var1, boolean var2) {
      int var6 = this.getResources().getDimensionPixelSize(2131167593);
      int var7 = this.getResources().getDimensionPixelSize(2131167546);
      float var4 = (float)this.getResources().getDimensionPixelSize(2131167555);
      float var3 = this.g;
      int var8 = this.getResources().getDimensionPixelSize(2131167553);
      int var5 = this.getResources().getDimensionPixelSize(2131167581);
      .lbv var9 = .lbv.a;
      if (var1 != 0) {
         switch(var1 - 1) {
         case 2:
            var1 = this.getResources().getDimensionPixelSize(2131167601);
            break;
         case 3:
            var1 = this.getResources().getDimensionPixelSize(2131167592);
            break;
         default:
            var1 = this.getResources().getDimensionPixelSize(2131167599);
         }

         var8 = (var8 - var7) / 2;
         ValueAnimator var11 = ValueAnimator.ofInt(new int[]{var1, (int)(var4 * var3)});
         var11.addUpdateListener(new .kpw(this, 17));
         ValueAnimator var13 = ValueAnimator.ofInt(new int[]{var6, var7});
         var13.addUpdateListener(new .kpw(this, 18));
         ValueAnimator var10 = ValueAnimator.ofInt(new int[]{var5, (var8 + 1) / 2 + var5});
         var10.addUpdateListener(new .kpw(this, 19));
         AnimatorSet var12 = new AnimatorSet();
         var13.setDuration(150L);
         var10.setDuration(150L);
         var11.setDuration(200L);
         var12.setInterpolator(new .clf());
         if (var2) {
            var12.play(var13).after(var11);
            var12.play(var10).with(var13);
         } else {
            var12.play(var13).with(var10);
            var12.play(var11).after(var13);
         }

         return var12;
      } else {
         throw null;
      }
   }

   public final void G(boolean var1, int var2) {
      if (var1) {
         if (var2 == 4) {
            this.r().setVisibility(0);
            this.m().setVisibility(0);
            this.q().setVisibility(0);
            this.l().setVisibility(0);
         } else if (var2 == 3) {
            this.r().setVisibility(0);
            this.m().setVisibility(0);
            this.q().setVisibility(8);
            this.l().setVisibility(8);
         }
      } else {
         this.r().setVisibility(8);
         this.q().setVisibility(8);
         this.m().setVisibility(8);
         this.l().setVisibility(8);
      }

      this.s().setTextAlignment(4);
      this.p().setTextAlignment(4);
   }

   public final int a(int var1) {
      int var4 = this.getResources().getDimensionPixelSize(2131167600);
      int var3 = this.getResources().getDimensionPixelSize(2131167589);
      Object var6 = a;
      synchronized(var6){}

      Throwable var10000;
      boolean var10001;
      label580: {
         int var5;
         try {
            var5 = this.l;
         } catch (Throwable var63) {
            var10000 = var63;
            var10001 = false;
            break label580;
         }

         label581: {
            label582: {
               byte var2 = 0;
               switch(var1) {
               case 0:
                  if (var5 != 2) {
                     if (var5 == 3) {
                        var1 = -(var4 + var3);
                     } else {
                        try {
                           var1 = -(var4 + var3) * 3 / 2;
                        } catch (Throwable var59) {
                           var10000 = var59;
                           var10001 = false;
                           break label580;
                        }
                     }
                     break label581;
                  }
                  break;
               case 1:
                  if (var5 == 2) {
                     break label582;
                  }

                  if (var5 == 3) {
                     var1 = var2;
                     break label581;
                  }
                  break;
               case 2:
                  if (var5 == 3) {
                     var1 = var4 + var3;
                     break label581;
                  }
                  break label582;
               case 3:
                  try {
                     var1 = (var4 + var3) * 3 / 2;
                     break label581;
                  } catch (Throwable var62) {
                     var10000 = var62;
                     var10001 = false;
                     break label580;
                  }
               default:
                  var1 = var2;
                  break label581;
               }

               try {
                  var1 = -(var4 + var3) / 2;
                  break label581;
               } catch (Throwable var60) {
                  var10000 = var60;
                  var10001 = false;
                  break label580;
               }
            }

            try {
               var1 = (var4 + var3) / 2;
            } catch (Throwable var61) {
               var10000 = var61;
               var10001 = false;
               break label580;
            }
         }

         label553:
         try {
            return var1;
         } catch (Throwable var58) {
            var10000 = var58;
            var10001 = false;
            break label553;
         }
      }

      while(true) {
         Throwable var7 = var10000;

         try {
            throw var7;
         } catch (Throwable var57) {
            var10000 = var57;
            var10001 = false;
            continue;
         }
      }
   }

   public final ViewGroup c() {
      return (ViewGroup)this.findViewById(2131428580);
   }

   public final ViewGroup d() {
      return (ViewGroup)this.findViewById(2131428585);
   }

   public final ImageButton e() {
      return (ImageButton)this.findViewById(2131428574);
   }

   public final ImageButton f() {
      return (ImageButton)this.findViewById(2131428575);
   }

   public final ImageView g() {
      return (ImageView)this.findViewById(2131428208);
   }

   public final ImageView h() {
      return (ImageView)this.findViewById(2131428353);
   }

   public final ImageView i() {
      return (ImageView)this.findViewById(2131428354);
   }

   public final ImageView j() {
      return (ImageView)this.findViewById(2131428211);
   }

   public final SeekBar k() {
      return (SeekBar)this.findViewById(2131428577);
   }

   final Space l() {
      return (Space)this.findViewById(2131428345);
   }

   final Space m() {
      return (Space)this.findViewById(2131428343);
   }

   public final TextView n() {
      return (TextView)this.findViewById(2131427430);
   }

   public final TextView o() {
      return (TextView)this.findViewById(2131427431);
   }

   public final void onFinishInflate() {
      Trace.beginSection("zoomUi:inflate");
      super.onFinishInflate();
      ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624299, this);
      SeekBar var10 = this.k();
      int var5 = this.getResources().getDimensionPixelSize(2131167555);
      int var4 = this.getResources().getDimensionPixelSize(2131167524);
      int var7 = this.getResources().getConfiguration().getLayoutDirection();
      var10.setMax(100000);
      ZoomKnob var9 = this.t();
      float var1;
      if (this.getResources().getDisplayMetrics().densityDpi >= 500) {
         var1 = 0.85F;
      } else {
         var1 = 1.0F;
      }

      this.g = var1;
      float var2 = (float)var9.b.getDimensionPixelSize(2131167531) / var9.b.getDisplayMetrics().scaledDensity;
      var9.h = var10;
      int var8 = var9.b.getDimensionPixelSize(2131167527);
      var9.setElevation((float)var9.b.getDimensionPixelSize(2131167580));
      var9.setGravity(17);
      var9.setTextAlignment(4);
      var9.setTextSize(var2);
      .lbw var11 = new .lbw(var9);
      .cde.b(var9.getContext(), 2131296267, var11);
      int var3 = var10.getLayoutParams().height;
      int var6 = var9.d;
      var8 /= 2;
      var9.f = (var3 - var6) / 2 - var8;
      LayoutParams var19 = (LayoutParams)var9.getLayoutParams();
      var19.bottomMargin = var9.f;
      var9.setLayoutParams(var19);
      var10.setSplitTrack(false);
      var9.g = var1;
      ImageButton var13 = this.e();
      LayoutParams var16 = (LayoutParams)var13.getLayoutParams();
      boolean var12;
      if (var7 == 1) {
         var12 = true;
      } else {
         var12 = false;
      }

      if (var12) {
         var16.rightMargin = -(var5 / 2 + var4);
      } else {
         var16.leftMargin = -(var5 / 2 + var4);
      }

      var13.setLayoutParams(var16);
      ImageButton var18 = this.f();
      LayoutParams var14 = (LayoutParams)var18.getLayoutParams();
      if (var12) {
         var14.rightMargin = var5 / 2 + var4;
      } else {
         var14.leftMargin = var5 / 2 + var4;
      }

      var18.setLayoutParams(var14);
      this.u().h();
      ObjectAnimator var15 = ObjectAnimator.ofFloat(this, "translationY", new float[]{(float).ktc.b(52.0F)});
      this.h = var15;
      var15.setDuration(300L);
      this.h.setStartDelay(150L);
      this.h.setInterpolator(new AccelerateDecelerateInterpolator());
      if (this.m) {
         this.g().setBackgroundResource(2131231054);
         android.view.ViewGroup.LayoutParams var17 = this.n().getLayoutParams();
         var17.getClass();
         var14 = (LayoutParams)var17;
         var14.topMargin = this.getResources().getDimensionPixelOffset(2131167514);
         var14.leftMargin = this.getResources().getDimensionPixelOffset(2131167508);
         var14.gravity = 51;
      }

      Trace.endSection();
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1) {
         this.onLayoutUpdated(this.o, this.e);
      }

   }

   public final void onLayoutUpdated(.kge var1, .ktb var2) {
      if (this.e == var2 && this.isLaidOut()) {
         if (!this.e.equals(.ktb.a)) {
            this.H();
         }

      } else {
         this.o = var1;
         this.e = var2;
         this.H();
         this.p = false;
         if (this.f) {
            this.setTranslationY(0.0F);
            this.h.end();
         }

      }
   }

   // $FF: synthetic method
   public final void onLayoutUpdated(.ktb var1) {
   }

   public final void onStop() {
      this.p = true;
   }

   public final TextView p() {
      return (TextView)this.findViewById(2131428579);
   }

   public final TextView q() {
      return (TextView)this.findViewById(2131428581);
   }

   public final TextView r() {
      return (TextView)this.findViewById(2131428582);
   }

   public final TextView s() {
      return (TextView)this.findViewById(2131428583);
   }

   public final ZoomKnob t() {
      return (ZoomKnob)this.findViewById(2131428570);
   }

   public final ZoomSliderView u() {
      return (ZoomSliderView)this.findViewById(2131428576);
   }

   public final void v(TextView var1, int var2, float var3, Typeface var4) {
      var1.setTextColor(var2);
      var1.setLetterSpacing(var3);
      var1.setTypeface(var4);
   }

   public final void w(boolean var1) {
      int var4;
      if (!var1) {
         SeekBar var9 = this.k();
         int var7 = this.getResources().getDimensionPixelSize(2131167546);
         var4 = this.getResources().getDimensionPixelSize(2131167583);
         float var2 = (float)this.getResources().getDimensionPixelSize(2131167603);
         float var3 = this.g;
         int var5 = this.getResources().getDimensionPixelSize(2131167554);
         int var6 = this.getResources().getDimensionPixelSize(2131167553);
         LayoutParams var8 = (LayoutParams)var9.getLayoutParams();
         var8.width = (int)((float)var5 * this.g);
         var8.height = var6;
         var9.setLayoutParams(var8);
         var9.setMax(100000);
         var6 = (var6 - var7) / 2;
         var5 = (int)(var2 * var3);
         var9.setPaddingRelative(var5, var4 + var6, var5, var6 - var4);
         var9.setClickable(true);
         this.k().setProgressDrawable(this.getResources().getDrawable(2131231050, (Theme)null));
      }

      ZoomKnob var10 = this.t();
      if (var1) {
         var10.setTextColor(.oik.c(var10, 2130968970));
      } else {
         var4 = var10.b.getDimensionPixelSize(2131167580);
         var10.f = (var10.h.getLayoutParams().height - var10.d) / 2 - var4 / 2;
         LayoutParams var11 = (LayoutParams)var10.getLayoutParams();
         var11.bottomMargin = var10.f;
         var10.setLayoutParams(var11);
         InsetDrawable var12 = new InsetDrawable(var10.b.getDrawable(2131231047, (Theme)null), var10.c);
         var10.setTextColor(var10.b.getColor(2131102416, (Theme)null));
         var10.setBackground(var12);
      }

      var10.invalidate();
   }

   public final void x() {
      .pei var4;
      for(Iterator var2 = this.c.iterator(); var2.hasNext(); var4 = .pet.a) {
         AmbientModeSupport$AmbientController var3 = (AmbientModeSupport$AmbientController)var2.next();
         int var1 = .eje.g;
      }

   }

   public final void y() {
      Iterator var1 = this.c.iterator();

      while(var1.hasNext()) {
         AmbientModeSupport$AmbientController var2 = (AmbientModeSupport$AmbientController)var1.next();
         .pei var3 = .pet.a;
         ((.eje)var2.a).c(false);
      }

   }

   public final void z(String var1) {
      this.n().setText(var1);
      if (this.m) {
         this.o().setText(var1);
      }

   }
}
