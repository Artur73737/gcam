package com.google.android.apps.camera.ui.modeswitcher;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class MoreModesGrid extends GridLayout implements .kjn {
   public static final ColorFilter a = new ColorMatrixColorFilter(new float[]{0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F});
   private static final .pds j = .pds.h("com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid");
   public final ArrayList b = new ArrayList();
   public boolean c = false;
   public Animator d = new ObjectAnimator();
   public int e;
   public int f;
   public float g = 0.0F;
   public .otw h;
   public .jqs i;

   public MoreModesGrid(Context var1) {
      super(var1);
      this.h = .ote.a;
      this.d(var1);
   }

   public MoreModesGrid(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.h = .ote.a;
      this.d(var1);
   }

   public MoreModesGrid(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.h = .ote.a;
      this.d(var1);
   }

   public MoreModesGrid(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.h = .ote.a;
      this.d(var1);
   }

   private final void d(Context var1) {
      .mbx.a();
      this.setColumnCount(3);
      Resources var4 = var1.getResources();
      this.e = var4.getInteger(2131493026);
      this.f = var4.getInteger(2131492951);
      this.g = var4.getDimension(2131166370);
      this.setBackground(var4.getDrawable(2131231450, (Theme)null));
      int var2 = var4.getDimensionPixelOffset(2131166363);
      int var3 = var4.getDimensionPixelOffset(2131166365);
      this.setPadding(var3, var2, var3, var2);
   }

   private final void e(float var1) {
      this.setTranslationX(0.0F);
      this.setTranslationY(0.0F);
      this.setAlpha(var1);
   }

   public final Animator a(boolean var1) {
      Property var4 = View.ALPHA;
      float var3 = 0.0F;
      float var2;
      if (var1) {
         var2 = 0.0F;
      } else {
         var2 = this.getAlpha();
      }

      if (var1) {
         var3 = 1.0F;
      }

      ObjectAnimator var5 = ObjectAnimator.ofFloat(this, var4, new float[]{var2, var3});
      var5.setInterpolator(new DecelerateInterpolator());
      return var5;
   }

   public final Animator b(boolean var1) {
      Property var4 = View.TRANSLATION_X;
      float var2;
      if (var1) {
         var2 = this.g;
      } else {
         var2 = this.getTranslationX();
      }

      float var3;
      if (var1) {
         var3 = 0.0F;
      } else {
         var3 = this.g;
      }

      ObjectAnimator var5 = ObjectAnimator.ofFloat(this, var4, new float[]{var2, var3});
      var5.setInterpolator(new DecelerateInterpolator());
      return var5;
   }

   public final void c(boolean var1) {
      this.d.cancel();
      if (var1) {
         this.e(1.0F);
      } else {
         this.e(0.3F);
      }

      super.setEnabled(var1);
   }

   public final void i(.ksm var1, boolean var2) {
      ArrayList var8 = this.b;
      int var5 = var8.size();
      byte var4 = 0;
      int var3 = 0;

      .kjp var6;
      .ksm var7;
      do {
         if (var3 >= var5) {
            var6 = null;
            break;
         }

         var6 = (.kjp)var8.get(var3);
         var7 = var6.a;
         ++var3;
      } while(var7 != var1);

      if (var6 == null) {
         ((.pdq)j.b().I(4413)).t("No ModeInfo found for %s", var1);
      } else if ((!var2 || !var6.c) && (var2 || var6.c)) {
         var6.c = var2;
         View var9 = var6.b;
         if (var9 != null) {
            Drawable var10 = ((LayerDrawable)((TextView)var9).getCompoundDrawables()[1]).getDrawable(2);
            short var11;
            if (!var2) {
               var11 = var4;
            } else {
               var11 = 255;
            }

            var10.setAlpha(var11);
         }
      }
   }
}
