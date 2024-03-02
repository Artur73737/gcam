package com.google.android.clockwork.common.wearable.wearmaterial.picker;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.util.ArraySet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.clockwork.common.wearable.wearmaterial.util.BlendContentDrawable;
import java.util.Set;

public class CenteredRecyclerView extends RecyclerView {
   public final Set aa;
   public final Set ab;
   public final .lfo ac;
   public OnPreDrawListener ad;
   public boolean ae;
   public int af;
   public .lff ag;
   public float ah;
   public float ai;
   public Animator aj;
   private final Handler ak;
   private final Runnable al;
   private final Animator am;
   private final Animator an;
   private int ao;
   private boolean ap;
   private BlendContentDrawable aq;
   private final .lmk ar;

   public CenteredRecyclerView(Context var1) {
      this(var1, (AttributeSet)null, 0);
   }

   public CenteredRecyclerView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public CenteredRecyclerView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.aa = new ArraySet();
      this.ab = new ArraySet();
      this.al = new .kyp(this, 17);
      this.ad = new .ldx(this, 3);
      this.ao = -1;
      this.ag = null;
      this.ah = 1.0F;
      this.ai = 1.0F;
      this.ap = true;
      this.ar = new .lmk(var1);
      this.ak = new Handler();
      this.setClipToPadding(false);
      Animator var6 = AnimatorInflater.loadAnimator(this.getContext(), 2130837582);
      this.am = var6;
      Animator var5 = AnimatorInflater.loadAnimator(this.getContext(), 2130837581);
      this.an = var5;
      this.ac((.lu)null);
      int var4 = .lx.aw(var1, var2, var3, 0).a;
      this.getContext();
      this.ad(new .lfe(var4));
      .lfq var10;
      if (var4 == 0) {
         var10 = new .lfq(1);
      } else {
         var10 = new .lfq(0);
      }

      this.ac = var10;
      TypedArray var11 = this.getContext().obtainStyledAttributes(var2, .lfp.a, var3, 0);

      try {
         this.ah = var11.getFloat(2, this.ah);
         this.ai = var11.getFloat(1, this.ai);
         this.ap = var11.getBoolean(0, this.ap);
         Drawable var12 = var11.getDrawable(3);
         if (var12 instanceof BlendContentDrawable) {
            BlendContentDrawable var13 = (BlendContentDrawable)var12;
            this.aq = var13;
            .bw var7 = new .bw(this, 9);
            var13.setContentProvider(var7);
            this.aq.setCallback(this);
            PickerVignetteDrawable var14 = aG(this.aq);
            var6.setTarget(var14);
            var5.setTarget(var14);
         }
      } finally {
         var11.recycle();
      }

      this.setOverScrollMode(2);
      this.aa(new .lfj(this));
   }

   private static PickerVignetteDrawable aG(BlendContentDrawable var0) {
      Drawable var1 = var0.getDrawable();
      return var1 instanceof PickerVignetteDrawable ? (PickerVignetteDrawable)var1 : null;
   }

   public final int a(View var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var3 = .mzx.dK(this.ac, this, true);
         int var4 = this.ac.b(var1);
         float var2 = this.ac.a(var1);
         return var4 + (int)((float)Math.round(Math.abs(var2)) * Math.signum(var2)) - var3;
      }
   }

   public final PickerVignetteDrawable aB() {
      BlendContentDrawable var1 = this.aq;
      return var1 == null ? null : aG(var1);
   }

   public final void aC() {
      if ((.lfk)super.m != null) {
         throw null;
      }
   }

   // $FF: synthetic method
   public final void aD(Canvas var1) {
      super.dispatchDraw(var1);
   }

   public final void aE(int var1) {
      .lfk var2 = (.lfk)super.m;
      if (var2 != null && var1 >= 0 && var2.a() > 0) {
         throw null;
      }
   }

   public final void aF() {
      if ((.lfk)super.m != null) {
         throw null;
      }
   }

   public final void ab(.lq var1) {
      .lfk var2 = (.lfk)super.m;
      if (var1 != var2) {
         this.ao = -1;
         this.ae = false;
         this.af = 0;
         if (var2 == null) {
            ViewTreeObserver var3 = this.getRootView().getViewTreeObserver();
            var3.removeOnPreDrawListener(this.ad);
            var3.addOnPreDrawListener(this.ad);
            super.ab(var1);
         } else {
            throw null;
         }
      }
   }

   public final void af(int var1) {
      .lx var2 = super.n;
      if (var2 != null) {
         .lfl var3 = new .lfl(this.getContext(), this.ah);
         var3.b = var1;
         var2.aY(var3);
      }
   }

   public final boolean am(int var1, int var2) {
      if (this.ap) {
         return super.am(var1, var2);
      } else {
         if (this.ar.e()) {
            int var3 = super.I;
            if (Math.abs(var1) >= var3 || Math.abs(var2) >= var3) {
               byte var4;
               if (var1 >= 0) {
                  if (var2 < 0) {
                     var4 = -1;
                  } else {
                     var4 = 1;
                  }
               } else {
                  var4 = -1;
               }

               this.aF();
               this.aE(var4 - 1);
               return true;
            }
         }

         return false;
      }
   }

   protected final void dispatchDraw(Canvas var1) {
      BlendContentDrawable var2 = this.aq;
      if (var2 == null) {
         super.dispatchDraw(var1);
      } else {
         var2.draw(var1);
      }
   }

   protected final void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.aC();
   }

   protected final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.getRootView().getViewTreeObserver().removeOnPreDrawListener(this.ad);
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1 || this.ao == -1) {
         if (this.ao == -1) {
            this.ao = 0;
         }

         var2 = this.ac.d(this);
         if (this.ao != var2 && this.getChildCount() > 0) {
            this.ao = var2;
            .lfo var6 = this.ac;
            if (this.getChildCount() > 0 && var6.h(this)) {
               var1 = true;
            } else {
               var1 = false;
            }

            this.ae = var1;
            this.af = .mzx.dK(this.ac, this, var1);
            this.ak.removeCallbacks(this.al);
            this.ak.postAtFrontOfQueue(this.al);
         }

         if (this.getChildCount() >= 2) {
            BlendContentDrawable var7 = this.aq;
            if (var7 != null) {
               var7.setBounds(0, 0, this.getWidth(), this.getHeight());
               PickerVignetteDrawable var8 = aG(var7);
               if (var8 != null) {
                  var3 = this.ac.d(this);
                  var2 = this.ac.d(this.getChildAt(0));
                  var8.setClearArea((var3 - var2) / 2, (var3 + var2) / 2);
                  return;
               }
            }
         }
      }

   }

   protected final boolean verifyDrawable(Drawable var1) {
      return var1 == this.aq || super.verifyDrawable(var1);
   }
}
