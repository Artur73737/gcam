package com.google.android.apps.camera.rewind;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.VibrationEffect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.material.search.Ztp.sYWXtqVx;
import java.util.List;

public class RewindThumbnailScrollView extends HorizontalScrollView {
   private static final .pds h = .pds.h("com.google.android.apps.camera.rewind.RewindThumbnailScrollView");
   public SparseArray a;
   public final Context b;
   public final Drawable c;
   public final LayoutParams d;
   public int e = -1;
   public ObjectAnimator f;
   public .jby g;
   private final int i;
   private final PropertyValuesHolder j;
   private LayoutInflater k;
   private int l;
   private int m;
   private int n;
   private int o = -1;

   public RewindThumbnailScrollView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.b = var1;
      Drawable var3 = var1.getDrawable(2131231439);
      var3.getClass();
      this.c = var3;
      this.i = this.getResources().getDimensionPixelSize(2131166320);
      this.d = new LayoutParams(-2, -1, 83);
      this.j = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0F, -7.0F});
   }

   public final int a() {
      if (this.a == null) {
         ((.pdq)((.pdq)h.c().g(.pet.a, sYWXtqVx.CCiGKPnlaXLRSb)).I(3501)).r("Thumbnail scroller is uninitialized, returning %d", -1);
         return -1;
      } else {
         return this.o;
      }
   }

   public final int b() {
      synchronized(this){}

      int var1;
      try {
         this.d("Cannot get the maximum scrollable X when uninitialized.");
         var1 = this.l;
      } finally {
         ;
      }

      return var1;
   }

   public final int c(int var1) {
      int var2 = this.l;
      return Math.min(var2, Math.max(0, var1 * var2 / this.m));
   }

   public final void d(String var1) {
      if (this.a == null) {
         throw new IllegalStateException(var1);
      }
   }

   public final void e(List var1, int var2) {
      synchronized(this){}

      Throwable var10000;
      label92: {
         int var3;
         LinearLayout var17;
         boolean var10001;
         try {
            int var5 = this.i;
            int var4 = var1.size();
            var3 = (var2 - var5) / 2;
            var4 = var5 * var4 / 4;
            this.l = var3 + var3 + var4 - var2;
            this.m = var1.size() - 1;
            var2 = this.l;
            var5 = var1.size();
            this.n = var2 / (var5 + var5);
            SparseArray var6 = new SparseArray(var1.size());
            this.a = var6;
            var17 = (LinearLayout)this.findViewById(2131427892);
            MarginLayoutParams var7 = (MarginLayoutParams)var17.getLayoutParams();
            var7.setMarginStart(var3);
            var7.setMarginEnd(var3);
            var7.width = var4;
            var17.setLayoutParams(var7);
            var17.setClipToOutline(true);
            this.d.leftMargin = var3 + this.i / 2 - this.c.getIntrinsicWidth() / 2;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label92;
         }

         var2 = 0;

         while(true) {
            try {
               if (var2 >= var1.size()) {
                  return;
               }

               FrameLayout var8 = (FrameLayout)this.k.inflate(2131624093, (ViewGroup)null);
               ImageView var18 = (ImageView)var8.findViewById(2131427890);
               var18.setImageBitmap(((.jcn)var1.get(var2)).d());
               var3 = this.i;
               LayoutParams var9 = new LayoutParams(var3, var3);
               var18.setLayoutParams(var9);
               var17.addView(var8);
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break;
            }

            var2 += 4;
         }
      }

      Throwable var16 = var10000;
      throw var16;
   }

   public final void f(int var1) {
      if (this.f == null) {
         var1 = this.c(var1);
         ObjectAnimator var2 = ObjectAnimator.ofInt(this, "scrollX", new int[]{this.getScrollX(), var1});
         var2.setAutoCancel(true);
         var2.setDuration(200L);
         var2.setInterpolator(new AccelerateDecelerateInterpolator());
         var2.addListener(.kfq.w(new .iry(this, 4)));
         this.f = var2;
         var2.start();
      }

   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      this.k = LayoutInflater.from(this.getContext());
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      return this.f == null && super.onInterceptTouchEvent(var1);
   }

   protected final void onScrollChanged(int var1, int var2, int var3, int var4) {
      super.onScrollChanged(var1, var2, var3, var4);
      if (this.a != null) {
         var2 = this.n;
         var3 = this.m;
         var1 = Math.min(var3, Math.max(0, (var1 + var2) * var3 / this.l));
         var2 = this.o;
         if (var2 != var1) {
            View var6 = (View)this.a.get(var2);
            View var7 = (View)this.a.get(var1);
            if (var6 != null) {
               ObjectAnimator.ofPropertyValuesHolder(var6, new PropertyValuesHolder[]{this.j}).reverse();
            }

            if (var7 != null) {
               ObjectAnimator.ofPropertyValuesHolder(var7, new PropertyValuesHolder[]{this.j}).start();
            }

            this.o = var1;
            .jby var8 = this.g;
            if (var8 != null) {
               .jcd var12 = var8.a;
               List var9 = var8.b;
               ImageView var10 = var8.c;
               RewindExportShotView var13 = var8.d;
               .jcn var14 = (.jcn)var9.get(var1);
               boolean var5 = var12.p.z(var14);
               var10.setImageDrawable(var12.x(var14));
               String var11;
               if (var5) {
                  var11 = var13.a;
               } else {
                  var11 = var13.b;
               }

               if (!((TextView)var13.getCurrentView()).getText().toString().equals(var11)) {
                  var13.setText(var11);
               }

               if (var5) {
                  var12.n.g(VibrationEffect.createOneShot(50L, -1));
               }
            }
         }

      }
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      if (this.a != null && var1.getAction() == 1) {
         SparseArray var2 = this.a;
         var2.getClass();
         if (var2.get(this.o) != null) {
            this.f(this.o);
         }
      }

      return super.onTouchEvent(var1);
   }
}
