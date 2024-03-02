package com.google.android.clockwork.common.wearable.wearmaterial.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.InputDevice.MotionRange;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public class FadingWearableRecyclerView extends RecyclerView {
   .lgf aa;
   .lge ab;
   .lgd ac;
   .lem ad;
   public .leq ae;
   public boolean af;
   private final Context ag;
   private final int ah;
   private final int ai;
   private boolean aj;
   private int ak;
   private long al;
   private long am;
   private Interpolator an;
   private final Interpolator ao;
   private boolean ap;
   private boolean aq;
   private int ar;
   private int as;
   private float at;
   private float au;
   private boolean av;
   private boolean aw;
   private int ax;
   private final OnPreDrawListener ay;

   public FadingWearableRecyclerView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public FadingWearableRecyclerView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public FadingWearableRecyclerView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      boolean var8 = false;
      this.aj = false;
      this.al = 75L;
      this.am = 225L;
      this.an = new PathInterpolator(0.2F, 0.2F, 0.0F, 1.0F);
      this.ao = new PathInterpolator(0.33F, 0.0F, 0.67F, 0.2F);
      this.aq = false;
      this.ar = Integer.MIN_VALUE;
      this.as = Integer.MIN_VALUE;
      this.at = -2.14748365E9F;
      this.au = -2.14748365E9F;
      this.av = true;
      this.aw = false;
      this.ay = new .ldx(this, 2);
      this.ag = var1;
      DisplayMetrics var10 = var1.getResources().getDisplayMetrics();
      int var6 = var10.widthPixels;
      this.ah = var6;
      int var7 = var10.heightPixels;
      this.ai = var7;
      this.ak = var7;
      .cgn.b(ViewConfiguration.get(var1));
      this.aa = new .lgf();
      this.ae = new .leq(this, new .leh(this));
      TypedArray var572 = var1.getTheme().obtainStyledAttributes(var2, .lej.a, var3, 0);

      label4090: {
         Throwable var10000;
         label4094: {
            boolean var9;
            boolean var10001;
            try {
               this.aj = var572.getBoolean(6, false);
               var9 = var572.getBoolean(1, false);
               this.ap = var9;
            } catch (Throwable var563) {
               var10000 = var563;
               var10001 = false;
               break label4094;
            }

            if (var9) {
               label4095: {
                  try {
                     if (this.getChildCount() > 0) {
                        this.aC();
                        break label4095;
                     }
                  } catch (Throwable var562) {
                     var10000 = var562;
                     var10001 = false;
                     break label4094;
                  }

                  try {
                     this.af = true;
                  } catch (Throwable var560) {
                     var10000 = var560;
                     var10001 = false;
                     break label4094;
                  }
               }
            } else {
               try {
                  if (this.ar != Integer.MIN_VALUE) {
                     this.setPadding(this.getPaddingLeft(), this.ar, this.getPaddingRight(), this.as);
                  }
               } catch (Throwable var561) {
                  var10000 = var561;
                  var10001 = false;
                  break label4094;
               }

               try {
                  this.af = false;
               } catch (Throwable var559) {
                  var10000 = var559;
                  var10001 = false;
                  break label4094;
               }
            }

            float var4;
            float var5;
            try {
               this.aq = var572.getBoolean(7, false);
               this.at = Math.min(var572.getFloat(10, -2.14748365E9F), 1.0F);
               this.au = Math.min(var572.getFloat(0, -2.14748365E9F), 1.0F);
               var4 = Math.min(var572.getFloat(9, -2.14748365E9F), 1.0F);
               var5 = Math.min(var572.getFloat(2, -2.14748365E9F), 1.0F);
            } catch (Throwable var558) {
               var10000 = var558;
               var10001 = false;
               break label4094;
            }

            if (var4 == -2.14748365E9F) {
               try {
                  var3 = this.getPaddingStart();
               } catch (Throwable var557) {
                  var10000 = var557;
                  var10001 = false;
                  break label4094;
               }
            } else {
               try {
                  var3 = Math.max((int)((float)var6 * var4), 0);
               } catch (Throwable var556) {
                  var10000 = var556;
                  var10001 = false;
                  break label4094;
               }
            }

            if (var5 == -2.14748365E9F) {
               try {
                  var6 = this.getPaddingEnd();
               } catch (Throwable var555) {
                  var10000 = var555;
                  var10001 = false;
                  break label4094;
               }
            } else {
               try {
                  var6 = Math.max((int)((float)var6 * var5), 0);
               } catch (Throwable var554) {
                  var10000 = var554;
                  var10001 = false;
                  break label4094;
               }
            }

            try {
               this.setPaddingRelative(var3, this.getPaddingTop(), var6, this.getPaddingBottom());
               var9 = var572.getBoolean(8, this.aw);
               this.aw = var9;
            } catch (Throwable var553) {
               var10000 = var553;
               var10001 = false;
               break label4094;
            }

            .lge var567;
            if (var9) {
               try {
                  if (this.ab == null) {
                     var567 = new .lge(this);
                     this.ab = var567;
                  }
               } catch (Throwable var552) {
                  var10000 = var552;
                  var10001 = false;
                  break label4094;
               }
            }

            try {
               var567 = this.ab;
            } catch (Throwable var551) {
               var10000 = var551;
               var10001 = false;
               break label4094;
            }

            if (var567 != null) {
               .kz var11;
               try {
                  var567.d = var9;
                  var11 = var567.b;
               } catch (Throwable var550) {
                  var10000 = var550;
                  var10001 = false;
                  break label4094;
               }

               RecyclerView var568;
               if (var9) {
                  try {
                     var568 = var567.a;
                  } catch (Throwable var549) {
                     var10000 = var549;
                     var10001 = false;
                     break label4094;
                  }
               } else {
                  var568 = null;
               }

               try {
                  var11.e(var568);
               } catch (Throwable var548) {
                  var10000 = var548;
                  var10001 = false;
                  break label4094;
               }
            }

            try {
               var9 = var572.getBoolean(3, this.av);
               this.av = var9;
            } catch (Throwable var547) {
               var10000 = var547;
               var10001 = false;
               break label4094;
            }

            if (var9) {
               try {
                  if (this.ad == null) {
                     .lem var569 = new .lem(var1);
                     this.ad = var569;
                  }
               } catch (Throwable var546) {
                  var10000 = var546;
                  var10001 = false;
                  break label4094;
               }
            }

            try {
               var3 = var572.getInteger(4, 1);
               var6 = (new int[]{1, 2})[var3];
            } catch (Throwable var545) {
               var10000 = var545;
               var10001 = false;
               break label4094;
            }

            boolean var571;
            if (var6 != 1) {
               var571 = false;
            } else {
               var571 = true;
            }

            if (var6 != 1) {
               try {
                  if (this.ac == null) {
                     .lgd var570 = new .lgd(var1, this);
                     this.ac = var570;
                  }
               } catch (Throwable var544) {
                  var10000 = var544;
                  var10001 = false;
                  break label4094;
               }
            }

            .lgd var564;
            try {
               var564 = this.ac;
            } catch (Throwable var543) {
               var10000 = var543;
               var10001 = false;
               break label4094;
            }

            if (var564 != null) {
               if (var6 == 2) {
                  var8 = true;
               }

               try {
                  var564.a = var8;
                  var564.b = var571 ^ true;
               } catch (Throwable var542) {
                  var10000 = var542;
                  var10001 = false;
                  break label4094;
               }
            }

            label4009:
            try {
               var8 = var572.getBoolean(5, true);
               this.aa.b = var8;
               break label4090;
            } catch (Throwable var541) {
               var10000 = var541;
               var10001 = false;
               break label4009;
            }
         }

         Throwable var565 = var10000;
         var572.recycle();
         throw var565;
      }

      var572.recycle();
      .leg var566 = new .leg(this.ae);
      var566.h = 450L;
      var566.i = 450L;
      var566.j = 450L;
      var566.k = 450L;
      this.ac(var566);
   }

   public final void S(int var1) {
      .lem var2 = this.ad;
      if (var2 != null) {
         var2.f.f(var1);
      }

   }

   public final void T(int var1, int var2) {
      this.ae.e();
      .lgd var10 = this.ac;
      if (var10 != null) {
         .lmk var9 = var10.j;
         if (var10.b && var10.f && (!var10.a || var10.g)) {
            boolean var4 = true;
            byte var3;
            if (var9.c(var1, var2, true)) {
               var3 = 2;
            } else if (var9.b(var1, var2, true)) {
               var3 = 3;
            } else {
               var3 = 1;
               var4 = false;
            }

            if (var4) {
               long var7 = SystemClock.elapsedRealtime();
               long var5 = var10.h;
               if (var5 == 0L || var7 - var5 > 500L || var10.i != var3) {
                  var10.h = var7;
                  var10.i = var3;
                  var10.a(20);
               }
            }
         }
      }

      .lge var11 = this.ab;
      if (var11 != null && var11.e) {
         var11.a.removeCallbacks(var11.c);
         var11.a.postDelayed(var11.c, 80L);
      }

      .lem var12 = this.ad;
      if (var12 != null) {
         var12.f.e(this, var1, var2);
      }

   }

   public final int a(int var1) {
      return this.getChildAt(var1) == null ? 0 : this.getChildAt(var1).getHeight();
   }

   public final void aB(int var1, int var2) {
      float var3 = this.at;
      byte var5 = 0;
      if (var3 == -2.14748365E9F) {
         boolean var6 = this.aq;
         int var4;
         if (!var6) {
            var4 = 0;
         } else {
            var4 = var1;
         }

         if (var6) {
            var1 = var2;
         }

         var1 = Math.max((int)((float)this.getHeight() * 0.5F - (float)var1 * 0.5F - (float)var4), 0);
      } else {
         var1 = Math.max((int)((float)this.ai * var3), 0);
      }

      var3 = this.au;
      if (var3 == -2.14748365E9F) {
         var2 = this.getPaddingBottom();
      } else {
         var2 = Math.max((int)((float)this.ai * var3), 0);
      }

      if (this.getPaddingTop() != var1 || this.getPaddingBottom() != var2) {
         this.ar = this.getPaddingTop();
         this.as = this.getPaddingBottom();
         this.setPadding(this.getPaddingLeft(), var1, this.getPaddingRight(), var2);
         .lx var7 = super.n;
         if (var7 != null) {
            View var8 = this.getFocusedChild();
            if (var8 != null) {
               var1 = .lx.bh(var8);
            } else {
               var1 = var5;
            }

            var7.T(var1);
         }
      }

   }

   public final void aC() {
      .lq var1 = super.m;
      var1.getClass();
      var1.h(new .lei(this));
      if (this.getChildCount() > 0 && this.ap && (this.getChildCount() >= 2 || !this.aq)) {
         this.aB(this.a(0), this.a(1));
      }
   }

   public final int computeVerticalScrollExtent() {
      int var1 = super.computeVerticalScrollExtent();
      this.ax = var1;
      return (int)((float)var1);
   }

   public final int computeVerticalScrollOffset() {
      int var2 = super.computeVerticalScrollOffset();
      int var1 = var2;
      if (var2 > 0) {
         var1 = (int)((float)this.ax * 0.0F + (float)var2);
      }

      return var1;
   }

   public final void invalidate() {
      super.invalidate();
      this.ae.e();
   }

   protected final void onAttachedToWindow() {
      super.onAttachedToWindow();
      if (this.aj) {
         this.setTranslationY((float)this.ak);
         ViewPropertyAnimator var1 = this.animate().withLayer();
         var1.translationY(0.0F);
         var1.setUpdateListener(new .lef(this, 2));
         var1.setStartDelay(this.al);
         var1.setDuration(this.am);
         var1.setInterpolator(this.an);
         var1.start();
         AlphaAnimation var2 = new AlphaAnimation(0.0F, 1.0F);
         var2.setDuration(225L);
         var2.setFillAfter(true);
         var2.setStartOffset(this.al);
         var2.setInterpolator(this.ao);
         this.startAnimation(var2);
      }

      this.getViewTreeObserver().addOnPreDrawListener(this.ay);
   }

   protected final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.getViewTreeObserver().removeOnPreDrawListener(this.ay);
   }

   public final boolean onGenericMotionEvent(MotionEvent var1) {
      super.onGenericMotionEvent(var1);
      boolean var5 = this.aa.a;
      .lge var6 = this.ab;
      if (var6 != null) {
         if (!var6.d) {
            var5 = false;
         } else if (var1.getAction() != 8) {
            var5 = false;
         } else if ((var1.getSource() & 4194304) != 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         var6.e = var5;
      }

      .lgd var7 = this.ac;
      if (var7 != null && var7.a && var1.getAction() == 8 && (4194304 & var1.getSource()) != 0) {
         var7.f = true;
         InputDevice var8 = var1.getDevice();
         Float var9 = null;
         if (var8 != null) {
            MotionRange var11 = var8.getMotionRange(26);
            if (var11 != null) {
               var9 = var11.getResolution();
            }
         }

         if (var9 != null) {
            label66: {
               var7.g = true;
               float var2 = var1.getAxisValue(26);
               int var4 = .lmk.a(var1);
               .lmk var12 = var7.j;
               int var3 = .lmk.a(var1);
               if (var3 > 0) {
                  if (var12.b(0, 0, false)) {
                     break label66;
                  }
               } else if (var3 < 0 && var12.c(0, 0, false)) {
                  break label66;
               }

               if (var4 != var7.e) {
                  var7.d = 0.0F;
               }

               var7.e = var4;
               var2 = var2 * var7.c / var9;
               var2 += var7.d;
               var7.d = var2;
               if (Math.abs(var2) > 45.0F) {
                  var7.d %= 45.0F;
                  var7.a(18);
               }
            }
         }
      }

      if (this.av) {
         .lem var10 = this.ad;
         if (var10 != null) {
            var10.e.onGenericMotion(this, var1);
         }
      }

      return false;
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      this.ae.e();
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      boolean var2 = super.onTouchEvent(var1);
      .lgd var3 = this.ac;
      if (var3 != null) {
         var3.f = false;
      }

      .lge var4 = this.ab;
      if (var4 != null) {
         var4.a.removeCallbacks(var4.c);
         var4.e = false;
      }

      return var2;
   }
}
