import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;

public class ood extends FrameLayout {
   private static final OnTouchListener b = new ooc();
   onr a;
   private final float c;
   private final int d;
   private ColorStateList e;
   private Mode f;

   protected ood(Context var1) {
      this(var1, (AttributeSet)null);
   }

   protected ood(Context var1, AttributeSet var2) {
      super(ope.a(var1, var2, 0, 0), var2);
      Context var6 = this.getContext();
      TypedArray var7 = var6.obtainStyledAttributes(var2, oof.a);
      if (var7.hasValue(6)) {
         cgd.l(this, (float)var7.getDimensionPixelSize(6, 0));
      }

      var7.getInt(2, 0);
      if (var7.hasValue(8) || var7.hasValue(9)) {
         this.a = onr.a(var6, var2, 0, 0).a();
      }

      float var3 = var7.getFloat(3, 1.0F);
      this.c = var3;
      this.setBackgroundTintList(oik.p(var6, var7, 4));
      this.setBackgroundTintMode(c.l(var7.getInt(5, -1), Mode.SRC_IN));
      var7.getFloat(1, 1.0F);
      this.d = var7.getDimensionPixelSize(0, -1);
      var7.getDimensionPixelSize(7, -1);
      var7.recycle();
      this.setOnTouchListener(b);
      this.setFocusable(true);
      if (this.getBackground() == null) {
         int var4 = oik.e(oik.c(this, 2130969024), oik.c(this, 2130968979), var3);
         onr var8 = this.a;
         int var5;
         Object var9;
         if (var8 != null) {
            var5 = ooe.a;
            var9 = new onm(var8);
            ((onm)var9).j(ColorStateList.valueOf(var4));
         } else {
            Resources var10 = this.getResources();
            var5 = ooe.a;
            var3 = var10.getDimension(2131166568);
            var9 = new GradientDrawable();
            ((GradientDrawable)var9).setShape(0);
            ((GradientDrawable)var9).setCornerRadius(var3);
            ((GradientDrawable)var9).setColor(var4);
         }

         ColorStateList var11 = this.e;
         if (var11 != null) {
            cdm.g((Drawable)var9, var11);
         }

         cfx.m(this, (Drawable)var9);
      }
   }

   protected final void onAttachedToWindow() {
      super.onAttachedToWindow();
      cgb.c(this);
   }

   protected void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      if (this.d > 0) {
         var1 = this.getMeasuredWidth();
         int var3 = this.d;
         if (var1 > var3) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(var3, 1073741824), var2);
         }
      }

   }

   public final void setBackground(Drawable var1) {
      this.setBackgroundDrawable(var1);
   }

   public final void setBackgroundDrawable(Drawable var1) {
      Drawable var2 = var1;
      if (var1 != null) {
         var2 = var1;
         if (this.e != null) {
            var2 = var1.mutate();
            cdm.g(var2, this.e);
            cdm.h(var2, this.f);
         }
      }

      super.setBackgroundDrawable(var2);
   }

   public final void setBackgroundTintList(ColorStateList var1) {
      this.e = var1;
      if (this.getBackground() != null) {
         Drawable var2 = this.getBackground().mutate();
         cdm.g(var2, var1);
         cdm.h(var2, this.f);
         if (var2 != this.getBackground()) {
            super.setBackgroundDrawable(var2);
         }
      }

   }

   public final void setBackgroundTintMode(Mode var1) {
      this.f = var1;
      if (this.getBackground() != null) {
         Drawable var2 = this.getBackground().mutate();
         cdm.h(var2, var1);
         if (var2 != this.getBackground()) {
            super.setBackgroundDrawable(var2);
         }
      }

   }

   public final void setLayoutParams(LayoutParams var1) {
      super.setLayoutParams(var1);
      if (var1 instanceof MarginLayoutParams) {
         MarginLayoutParams var2 = (MarginLayoutParams)var1;
         new Rect(var2.leftMargin, var2.topMargin, var2.rightMargin, var2.bottomMargin);
      }

   }

   public final void setOnClickListener(OnClickListener var1) {
      OnTouchListener var2;
      if (var1 != null) {
         var2 = null;
      } else {
         var2 = b;
      }

      this.setOnTouchListener(var2);
      super.setOnClickListener(var1);
   }
}
