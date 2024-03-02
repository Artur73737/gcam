package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatButton;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.Layout.Alignment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends AppCompatButton implements Checkable, .ooa {
   private static final int[] b = new int[]{16842911};
   private static final int[] c = new int[]{16842912};
   private final .ojo d;
   private final LinkedHashSet e;
   private Mode f;
   private ColorStateList g;
   private Drawable h;
   private int i;
   private int j;
   private int k;
   private int l;
   private boolean m;
   private boolean n;
   private int o;

   public MaterialButton(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public MaterialButton(Context var1, AttributeSet var2) {
      this(var1, var2, 2130969695);
   }

   public MaterialButton(Context var1, AttributeSet var2, int var3) {
      super(.ope.a(var1, var2, var3, 2132084803), var2, var3);
      this.e = new LinkedHashSet();
      this.m = false;
      this.n = false;
      Context var9 = this.getContext();
      TypedArray var12 = .oli.a(var9, var2, .ojq.a, var3, 2132084803);
      this.l = var12.getDimensionPixelSize(12, 0);
      this.f = .c.l(var12.getInt(15, -1), Mode.SRC_IN);
      this.g = .oik.p(this.getContext(), var12, 14);
      this.h = .oik.q(this.getContext(), var12, 10);
      this.o = var12.getInteger(11, 1);
      this.i = var12.getDimensionPixelSize(13, 0);
      .ojo var13 = new .ojo(this, .onr.a(var9, var2, var3, 2132084803).a());
      this.d = var13;
      var13.c = var12.getDimensionPixelOffset(1, 0);
      var13.d = var12.getDimensionPixelOffset(2, 0);
      var13.e = var12.getDimensionPixelOffset(3, 0);
      var13.f = var12.getDimensionPixelOffset(4, 0);
      if (var12.hasValue(8)) {
         var3 = var12.getDimensionPixelSize(8, -1);
         var13.g = var3;
         var13.d(var13.b.d((float)var3));
      }

      var13.h = var12.getDimensionPixelSize(20, 0);
      var13.i = .c.l(var12.getInt(7, -1), Mode.SRC_IN);
      var13.j = .oik.p(var13.a.getContext(), var12, 6);
      var13.k = .oik.p(var13.a.getContext(), var12, 19);
      var13.l = .oik.p(var13.a.getContext(), var12, 16);
      var13.o = var12.getBoolean(5, false);
      var13.r = var12.getDimensionPixelSize(9, 0);
      var13.p = var12.getBoolean(21, true);
      var3 = .cfy.e(var13.a);
      int var5 = var13.a.getPaddingTop();
      int var7 = .cfy.d(var13.a);
      int var6 = var13.a.getPaddingBottom();
      if (var12.hasValue(0)) {
         var13.c();
      } else {
         MaterialButton var14 = var13.a;
         .onm var10 = new .onm(var13.b);
         var10.h(var13.a.getContext());
         .cdm.g(var10, var13.j);
         Mode var11 = var13.i;
         if (var11 != null) {
            .cdm.h(var10, var11);
         }

         float var4 = (float)var13.h;
         ColorStateList var16 = var13.k;
         var10.m(var4);
         var10.l(var16);
         .onm var17 = new .onm(var13.b);
         var17.setTint(0);
         var17.m((float)var13.h);
         var17.l(ColorStateList.valueOf(0));
         var13.m = new .onm(var13.b);
         .cdm.f(var13.m, -1);
         var13.q = new RippleDrawable(.one.b(var13.l), new InsetDrawable(new LayerDrawable(new Drawable[]{var17, var10}), var13.c, var13.e, var13.d, var13.f), var13.m);
         var14.setBackgroundDrawable(var13.q);
         .onm var15 = var13.a();
         if (var15 != null) {
            var15.i((float)var13.r);
            var15.setState(var13.a.getDrawableState());
         }
      }

      .cfy.j(var13.a, var3 + var13.c, var5 + var13.e, var7 + var13.d, var6 + var13.f);
      var12.recycle();
      this.setCompoundDrawablePadding(this.l);
      boolean var8;
      if (this.h != null) {
         var8 = true;
      } else {
         var8 = false;
      }

      this.g(var8);
   }

   private final void a() {
      if (this.j()) {
         .cik.e(this, this.h, (Drawable)null, (Drawable)null);
      } else if (this.i()) {
         .cik.e(this, (Drawable)null, (Drawable)null, this.h);
      } else {
         if (this.k()) {
            .cik.e(this, (Drawable)null, this.h, (Drawable)null);
         }

      }
   }

   private final void g(boolean var1) {
      Drawable var6 = this.h;
      if (var6 != null) {
         var6 = var6.mutate();
         this.h = var6;
         .cdm.g(var6, this.g);
         Mode var9 = this.f;
         if (var9 != null) {
            .cdm.h(this.h, var9);
         }

         int var3 = this.i;
         int var2 = var3;
         if (var3 == 0) {
            var2 = this.h.getIntrinsicWidth();
         }

         int var4 = this.i;
         var3 = var4;
         if (var4 == 0) {
            var3 = this.h.getIntrinsicHeight();
         }

         var6 = this.h;
         var4 = this.j;
         int var5 = this.k;
         var6.setBounds(var4, var5, var2 + var4, var3 + var5);
         this.h.setVisible(true, var1);
      }

      if (var1) {
         this.a();
      } else {
         Drawable[] var8 = .cit.h(this);
         var6 = var8[0];
         Drawable var7 = var8[1];
         Drawable var10 = var8[2];
         if (this.j() && var6 != this.h || this.i() && var10 != this.h || this.k() && var7 != this.h) {
            this.a();
         }

      }
   }

   private final void h(int var1, int var2) {
      if (this.h != null && this.getLayout() != null) {
         boolean var7 = this.j();
         boolean var5 = true;
         int var4;
         if (!var7 && !this.i()) {
            if (this.k()) {
               this.j = 0;
               if (this.o == 16) {
                  this.k = 0;
                  this.g(false);
                  return;
               }

               var4 = this.i;
               var1 = var4;
               if (var4 == 0) {
                  var1 = this.h.getIntrinsicHeight();
               }

               if (this.getLineCount() > 1) {
                  var4 = this.getLayout().getHeight();
               } else {
                  TextPaint var10 = this.getPaint();
                  String var9 = this.getText().toString();
                  String var15 = var9;
                  if (this.getTransformationMethod() != null) {
                     var15 = this.getTransformationMethod().getTransformation(var9, this).toString();
                  }

                  Rect var14 = new Rect();
                  var10.getTextBounds(var15, 0, var15.length(), var14);
                  var4 = Math.min(var14.height(), this.getLayout().getHeight());
               }

               var1 = Math.max(0, (var2 - var4 - this.getPaddingTop() - var1 - this.l - this.getPaddingBottom()) / 2);
               if (this.k != var1) {
                  this.k = var1;
                  this.g(false);
                  return;
               }
            }
         } else {
            Alignment var8;
            label113: {
               this.k = 0;
               label108:
               switch(this.getTextAlignment()) {
               case 1:
                  switch(this.getGravity() & 8388615) {
                  case 1:
                     break label108;
                  case 5:
                  case 8388613:
                     break;
                  default:
                     var8 = Alignment.ALIGN_NORMAL;
                     break label113;
                  }
               case 3:
               case 6:
                  var8 = Alignment.ALIGN_OPPOSITE;
                  break label113;
               case 2:
               case 5:
               default:
                  var8 = Alignment.ALIGN_NORMAL;
                  break label113;
               case 4:
               }

               var8 = Alignment.ALIGN_CENTER;
            }

            var2 = this.o;
            if (var2 == 1 || var2 == 3 || var2 == 2 && var8 == Alignment.ALIGN_NORMAL || this.o == 4 && var8 == Alignment.ALIGN_OPPOSITE) {
               this.j = 0;
               this.g(false);
               return;
            }

            var4 = this.i;
            var2 = var4;
            if (var4 == 0) {
               var2 = this.h.getIntrinsicWidth();
            }

            int var6 = this.getLineCount();
            float var3 = 0.0F;

            for(var4 = 0; var4 < var6; ++var4) {
               var3 = Math.max(var3, this.getLayout().getLineWidth(var4));
            }

            var2 = var1 - (int)Math.ceil((double)var3) - .cfy.d(this) - var2 - this.l - .cfy.e(this);
            var1 = var2;
            if (var8 == Alignment.ALIGN_CENTER) {
               var1 = var2 / 2;
            }

            boolean var11;
            if (.cfy.c(this) != 1) {
               var11 = false;
            } else {
               var11 = true;
            }

            boolean var12;
            if (this.o != 4) {
               var12 = false;
            } else {
               var12 = var5;
            }

            int var13 = var1;
            if (var11 != var12) {
               var13 = -var1;
            }

            if (this.j != var13) {
               this.j = var13;
               this.g(false);
            }
         }

      }
   }

   private final boolean i() {
      int var1 = this.o;
      return var1 == 3 || var1 == 4;
   }

   private final boolean j() {
      int var1 = this.o;
      return var1 == 1 || var1 == 2;
   }

   private final boolean k() {
      int var1 = this.o;
      return var1 == 16 || var1 == 32;
   }

   private final boolean l() {
      .ojo var1 = this.d;
      return var1 != null && !var1.n;
   }

   final String b() {
      if (!TextUtils.isEmpty((CharSequence)null)) {
         return null;
      } else {
         Class var1;
         if (!this.f()) {
            var1 = Button.class;
         } else {
            var1 = CompoundButton.class;
         }

         return var1.getName();
      }
   }

   public final void c(.onr var1) {
      if (this.l()) {
         this.d.d(var1);
      } else {
         throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
      }
   }

   public final void d(ColorStateList var1) {
      if (this.l()) {
         .ojo var2 = this.d;
         if (var2.j != var1) {
            var2.j = var1;
            if (var2.a() != null) {
               .cdm.g(var2.a(), var2.j);
               return;
            }
         }
      } else {
         .ii var3 = super.a;
         if (var3 != null) {
            var3.g(var1);
            return;
         }
      }

   }

   public final void e(Mode var1) {
      if (this.l()) {
         .ojo var2 = this.d;
         if (var2.i != var1) {
            var2.i = var1;
            if (var2.a() != null && var2.i != null) {
               .cdm.h(var2.a(), var2.i);
               return;
            }
         }
      } else {
         .ii var3 = super.a;
         if (var3 != null) {
            var3.h(var1);
            return;
         }
      }

   }

   public final boolean f() {
      .ojo var1 = this.d;
      return var1 != null && var1.o;
   }

   public final ColorStateList getBackgroundTintList() {
      ColorStateList var1;
      if (this.l()) {
         var1 = this.d.j;
      } else {
         .ii var2 = super.a;
         if (var2 != null) {
            var1 = var2.a();
         } else {
            var1 = null;
         }
      }

      return var1;
   }

   public final Mode getBackgroundTintMode() {
      Mode var1;
      if (this.l()) {
         var1 = this.d.i;
      } else {
         .ii var2 = super.a;
         if (var2 != null) {
            var1 = var2.b();
         } else {
            var1 = null;
         }
      }

      return var1;
   }

   public final boolean isChecked() {
      return this.m;
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      if (this.l()) {
         .onk.e(this, this.d.a());
      }

   }

   protected final int[] onCreateDrawableState(int var1) {
      int[] var2 = super.onCreateDrawableState(var1 + 2);
      if (this.f()) {
         mergeDrawableStates(var2, b);
      }

      if (this.m) {
         mergeDrawableStates(var2, c);
      }

      return var2;
   }

   public final void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
      super.onInitializeAccessibilityEvent(var1);
      var1.setClassName(this.b());
      var1.setChecked(this.m);
   }

   public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      super.onInitializeAccessibilityNodeInfo(var1);
      var1.setClassName(this.b());
      var1.setCheckable(this.f());
      var1.setChecked(this.m);
      var1.setClickable(this.isClickable());
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      this.h(this.getMeasuredWidth(), this.getMeasuredHeight());
   }

   public final void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof .ojn)) {
         super.onRestoreInstanceState(var1);
      } else {
         .ojn var2 = (.ojn)var1;
         super.onRestoreInstanceState(var2.d);
         this.setChecked(var2.a);
      }
   }

   public final Parcelable onSaveInstanceState() {
      .ojn var1 = new .ojn(super.onSaveInstanceState());
      var1.a = this.m;
      return var1;
   }

   protected final void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
      super.onTextChanged(var1, var2, var3, var4);
      this.h(this.getMeasuredWidth(), this.getMeasuredHeight());
   }

   public final boolean performClick() {
      if (this.d.p) {
         this.toggle();
      }

      return super.performClick();
   }

   public final void refreshDrawableState() {
      super.refreshDrawableState();
      if (this.h != null) {
         int[] var1 = this.getDrawableState();
         if (this.h.setState(var1)) {
            this.invalidate();
         }
      }

   }

   public final void setBackground(Drawable var1) {
      this.setBackgroundDrawable(var1);
   }

   public final void setBackgroundColor(int var1) {
      if (this.l()) {
         .ojo var2 = this.d;
         if (var2.a() != null) {
            var2.a().setTint(var1);
         }

      } else {
         super.setBackgroundColor(var1);
      }
   }

   public final void setBackgroundDrawable(Drawable var1) {
      if (this.l()) {
         if (var1 != this.getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.d.c();
            super.setBackgroundDrawable(var1);
         } else {
            this.getBackground().setState(var1.getState());
         }
      } else {
         super.setBackgroundDrawable(var1);
      }
   }

   public final void setBackgroundResource(int var1) {
      Drawable var2;
      if (var1 != 0) {
         var2 = .fr.a(this.getContext(), var1);
      } else {
         var2 = null;
      }

      this.setBackgroundDrawable(var2);
   }

   public final void setBackgroundTintList(ColorStateList var1) {
      this.d(var1);
   }

   public final void setBackgroundTintMode(Mode var1) {
      this.e(var1);
   }

   public final void setChecked(boolean var1) {
      if (this.f() && this.isEnabled() && this.m != var1) {
         this.m = var1;
         this.refreshDrawableState();
         if (this.getParent() instanceof .ojp) {
            .ojp var3 = (.ojp)this.getParent();
            throw null;
         } else if (!this.n) {
            this.n = true;
            Iterator var2 = this.e.iterator();

            while(var2.hasNext()) {
               ((.ojm)var2.next()).a();
            }

            this.n = false;
         }
      }
   }

   public final void setElevation(float var1) {
      super.setElevation(var1);
      if (this.l()) {
         this.d.a().i(var1);
      }

   }

   public final void setTextAlignment(int var1) {
      super.setTextAlignment(var1);
      this.h(this.getMeasuredWidth(), this.getMeasuredHeight());
   }

   public final void toggle() {
      this.setChecked(this.m ^ true);
   }
}
