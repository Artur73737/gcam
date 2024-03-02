package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.PorterDuff.Mode;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.Layout.Alignment;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.wear.ambient.AmbientDelegate;

public class SwitchCompat extends CompoundButton {
   private static final Property c = new .nc(Float.class);
   private static final int[] d = new int[]{16842912};
   private float A;
   private VelocityTracker B;
   private int C;
   private int D;
   private int E;
   private int F;
   private int G;
   private int H;
   private int I;
   private int J;
   private boolean K;
   private final TextPaint L;
   private ColorStateList M;
   private Layout N;
   private Layout O;
   private TransformationMethod P;
   private final .jn Q;
   private final Rect R;
   private .blj S;
   public float a;
   ObjectAnimator b;
   private Drawable e;
   private ColorStateList f;
   private Mode g;
   private boolean h;
   private boolean i;
   private Drawable j;
   private ColorStateList k;
   private Mode l;
   private boolean m;
   private boolean n;
   private int o;
   private int p;
   private int q;
   private boolean r;
   private CharSequence s;
   private CharSequence t;
   private CharSequence u;
   private CharSequence v;
   private boolean w;
   private int x;
   private int y;
   private float z;

   public SwitchCompat(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public SwitchCompat(Context var1, AttributeSet var2) {
      this(var1, var2, 2130970182);
   }

   public SwitchCompat(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.f = null;
      this.g = null;
      this.h = false;
      this.i = false;
      this.k = null;
      this.l = null;
      this.m = false;
      this.n = false;
      this.B = VelocityTracker.obtain();
      boolean var8 = true;
      this.K = true;
      this.R = new Rect();
      .ne.d(this, this.getContext());
      TextPaint var12 = new TextPaint(1);
      this.L = var12;
      var12.density = this.getResources().getDisplayMetrics().density;
      AmbientDelegate var11 = AmbientDelegate.E(var1, var2, .fq.v, var3, 0);
      .cgj.d(this, var1, .fq.v, var2, (TypedArray)var11.b, var3, 0);
      Drawable var10 = var11.v(2);
      this.e = var10;
      if (var10 != null) {
         var10.setCallback(this);
      }

      var10 = var11.v(11);
      this.j = var10;
      if (var10 != null) {
         var10.setCallback(this);
      }

      this.e(var11.x(0));
      this.d(var11.x(1));
      this.w = var11.A(3, true);
      this.o = var11.p(8, 0);
      this.p = var11.p(5, 0);
      this.q = var11.p(6, 0);
      this.r = var11.A(4, false);
      ColorStateList var15 = var11.u(9);
      if (var15 != null) {
         this.f = var15;
         this.h = true;
      }

      Mode var16 = .c.l(var11.q(10, -1), (Mode)null);
      if (this.g != var16) {
         this.g = var16;
         this.i = true;
      }

      boolean var9 = this.h;
      if (var9 || this.i) {
         var10 = this.e;
         if (var10 != null && (var9 || this.i)) {
            var10 = var10.mutate();
            this.e = var10;
            if (this.h) {
               .cdm.g(var10, this.f);
            }

            if (this.i) {
               .cdm.h(this.e, this.g);
            }

            if (this.e.isStateful()) {
               this.e.setState(this.getDrawableState());
            }
         }
      }

      var15 = var11.u(12);
      if (var15 != null) {
         this.k = var15;
         this.m = true;
      }

      var16 = .c.l(var11.q(13, -1), (Mode)null);
      if (this.l != var16) {
         this.l = var16;
         this.n = true;
      }

      var9 = this.m;
      if (var9 || this.n) {
         var10 = this.j;
         if (var10 != null && (var9 || this.n)) {
            var10 = var10.mutate();
            this.j = var10;
            if (this.m) {
               .cdm.g(var10, this.k);
            }

            if (this.n) {
               .cdm.h(this.j, this.l);
            }

            if (this.j.isStateful()) {
               this.j.setState(this.getDrawableState());
            }
         }
      }

      int var6 = var11.t(7, 0);
      if (var6 != 0) {
         AmbientDelegate var13 = AmbientDelegate.C(var1, var6, .fq.w);
         var15 = var13.u(3);
         if (var15 != null) {
            this.M = var15;
         } else {
            this.M = this.getTextColors();
         }

         var6 = var13.p(0, 0);
         float var4;
         if (var6 != 0) {
            var4 = var12.getTextSize();
            float var5 = (float)var6;
            if (var5 != var4) {
               var12.setTextSize(var5);
               this.requestLayout();
            }
         }

         var6 = var13.q(1, -1);
         int var7 = var13.q(2, -1);
         Typeface var17;
         switch(var6) {
         case 1:
            var17 = Typeface.SANS_SERIF;
            break;
         case 2:
            var17 = Typeface.SERIF;
            break;
         case 3:
            var17 = Typeface.MONOSPACE;
            break;
         default:
            var17 = null;
         }

         var4 = 0.0F;
         if (var7 > 0) {
            if (var17 == null) {
               var17 = Typeface.defaultFromStyle(var7);
            } else {
               var17 = Typeface.create(var17, var7);
            }

            this.c(var17);
            if (var17 != null) {
               var6 = var17.getStyle();
            } else {
               var6 = 0;
            }

            var6 = ~var6 & var7;
            if (1 != (var6 & 1)) {
               var8 = false;
            }

            var12.setFakeBoldText(var8);
            if ((var6 & 2) != 0) {
               var4 = -0.25F;
            }

            var12.setTextSkewX(var4);
         } else {
            var12.setFakeBoldText(false);
            var12.setTextSkewX(0.0F);
            this.c(var17);
         }

         if (var13.A(17, false)) {
            this.P = new .fu(this.getContext());
         } else {
            this.P = null;
         }

         this.e(this.s);
         this.d(this.u);
         var13.z();
      }

      .jn var18 = new .jn(this);
      this.Q = var18;
      var18.b(var2, var3);
      var11.z();
      ViewConfiguration var14 = ViewConfiguration.get(var1);
      this.y = var14.getScaledTouchSlop();
      this.C = var14.getScaledMinimumFlingVelocity();
      this.m().w(var2, var3);
      this.refreshDrawableState();
      this.setChecked(this.isChecked());
   }

   private final int g() {
      float var1;
      if (.nv.a(this)) {
         var1 = 1.0F - this.a;
      } else {
         var1 = this.a;
      }

      return (int)(var1 * (float)this.h() + 0.5F);
   }

   private final int h() {
      Drawable var1 = this.j;
      if (var1 != null) {
         Rect var2 = this.R;
         var1.getPadding(var2);
         var1 = this.e;
         Rect var3;
         if (var1 != null) {
            var3 = .ke.a(var1);
         } else {
            var3 = .ke.a;
         }

         return this.D - this.F - var2.left - var2.right - var3.left - var3.right;
      } else {
         return 0;
      }
   }

   private final Layout i(CharSequence var1) {
      TextPaint var3 = this.L;
      int var2;
      if (var1 != null) {
         var2 = (int)Math.ceil((double)Layout.getDesiredWidth(var1, var3));
      } else {
         var2 = 0;
      }

      return new StaticLayout(var1, var3, var2, Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
   }

   private final CharSequence j(CharSequence var1) {
      .blj var2 = this.m();
      TransformationMethod var3 = this.P;
      Object var4 = var2.b;
      .ckf.b();
      CharSequence var5 = var1;
      if (var3 != null) {
         var5 = var3.getTransformation(var1, this);
      }

      return var5;
   }

   private final void k() {
      if (((.ckf)((.gfv)this.S.b).a).a.a) {
         .cjx var1 = .cjx.a;
      }
   }

   private final boolean l() {
      return this.a > 0.5F;
   }

   private final .blj m() {
      if (this.S == null) {
         this.S = new .blj(this);
      }

      return this.S;
   }

   public final void a() {
      CharSequence var2 = this.u;
      Object var1 = var2;
      if (var2 == null) {
         var1 = this.getResources().getString(2132017158);
      }

      .cgk.d(this, (CharSequence)var1);
   }

   public final void b() {
      CharSequence var2 = this.s;
      Object var1 = var2;
      if (var2 == null) {
         var1 = this.getResources().getString(2132017159);
      }

      .cgk.d(this, (CharSequence)var1);
   }

   public final void c(Typeface var1) {
      if (this.L.getTypeface() != null && !this.L.getTypeface().equals(var1) || this.L.getTypeface() == null && var1 != null) {
         this.L.setTypeface(var1);
         this.requestLayout();
         this.invalidate();
      }

   }

   public final void d(CharSequence var1) {
      this.u = var1;
      this.v = this.j(var1);
      this.O = null;
      if (this.w) {
         this.k();
      }

   }

   public final void draw(Canvas var1) {
      Rect var11 = this.R;
      int var7 = this.G;
      int var5 = this.H;
      int var6 = this.I;
      int var8 = this.J;
      int var2 = this.g() + var7;
      Drawable var10 = this.e;
      Rect var13;
      if (var10 != null) {
         var13 = .ke.a(var10);
      } else {
         var13 = .ke.a;
      }

      Drawable var12 = this.j;
      int var3;
      if (var12 != null) {
         int var4;
         int var9;
         label39: {
            var12.getPadding(var11);
            var9 = var2 + var11.left;
            if (var13 != null) {
               var3 = var7;
               if (var13.left > var11.left) {
                  var3 = var7 + (var13.left - var11.left);
               }

               if (var13.top > var11.top) {
                  var2 = var13.top - var11.top + var5;
               } else {
                  var2 = var5;
               }

               var4 = var6;
               if (var13.right > var11.right) {
                  var4 = var6 - (var13.right - var11.right);
               }

               if (var13.bottom > var11.bottom) {
                  var6 = var8 - (var13.bottom - var11.bottom);
                  break label39;
               }
            } else {
               var2 = var5;
               var4 = var6;
               var3 = var7;
            }

            var6 = var8;
         }

         this.j.setBounds(var3, var2, var4, var6);
         var2 = var9;
      }

      var10 = this.e;
      if (var10 != null) {
         var10.getPadding(var11);
         var3 = var2 - var11.left;
         var2 = var2 + this.F + var11.right;
         this.e.setBounds(var3, var5, var2, var8);
         var10 = this.getBackground();
         if (var10 != null) {
            .cdm.e(var10, var3, var5, var2, var8);
         }
      }

      super.draw(var1);
   }

   public final void drawableHotspotChanged(float var1, float var2) {
      super.drawableHotspotChanged(var1, var2);
      Drawable var3 = this.e;
      if (var3 != null) {
         .cdm.d(var3, var1, var2);
      }

      var3 = this.j;
      if (var3 != null) {
         .cdm.d(var3, var1, var2);
      }

   }

   protected final void drawableStateChanged() {
      super.drawableStateChanged();
      int[] var3 = this.getDrawableState();
      Drawable var4 = this.e;
      boolean var1 = false;
      if (var4 != null && var4.isStateful()) {
         var1 = var4.setState(var3);
      }

      var4 = this.j;
      boolean var2 = var1;
      if (var4 != null) {
         var2 = var1;
         if (var4.isStateful()) {
            var2 = var1 | var4.setState(var3);
         }
      }

      if (var2) {
         this.invalidate();
      }

   }

   public final void e(CharSequence var1) {
      this.s = var1;
      this.t = this.j(var1);
      this.N = null;
      if (this.w) {
         this.k();
      }

   }

   public final void f(float var1) {
      this.a = var1;
      this.invalidate();
   }

   public final int getCompoundPaddingLeft() {
      if (!.nv.a(this)) {
         return super.getCompoundPaddingLeft();
      } else {
         int var2 = super.getCompoundPaddingLeft() + this.D;
         int var1 = var2;
         if (!TextUtils.isEmpty(this.getText())) {
            var1 = var2 + this.q;
         }

         return var1;
      }
   }

   public final int getCompoundPaddingRight() {
      if (.nv.a(this)) {
         return super.getCompoundPaddingRight();
      } else {
         int var2 = super.getCompoundPaddingRight() + this.D;
         int var1 = var2;
         if (!TextUtils.isEmpty(this.getText())) {
            var1 = var2 + this.q;
         }

         return var1;
      }
   }

   public final Callback getCustomSelectionActionModeCallback() {
      Callback var1 = super.getCustomSelectionActionModeCallback();
      .cik.f(var1);
      return var1;
   }

   public final void jumpDrawablesToCurrentState() {
      super.jumpDrawablesToCurrentState();
      Drawable var1 = this.e;
      if (var1 != null) {
         var1.jumpToCurrentState();
      }

      var1 = this.j;
      if (var1 != null) {
         var1.jumpToCurrentState();
      }

      ObjectAnimator var2 = this.b;
      if (var2 != null && var2.isStarted()) {
         this.b.end();
         this.b = null;
      }

   }

   protected final int[] onCreateDrawableState(int var1) {
      int[] var2 = super.onCreateDrawableState(var1 + 1);
      if (this.isChecked()) {
         mergeDrawableStates(var2, d);
      }

      return var2;
   }

   protected final void onDraw(Canvas var1) {
      super.onDraw(var1);
      Rect var12 = this.R;
      Drawable var13 = this.j;
      if (var13 != null) {
         var13.getPadding(var12);
      } else {
         var12.setEmpty();
      }

      int var5 = this.H;
      int var6 = this.J;
      int var4 = var12.top;
      int var7 = var12.bottom;
      Drawable var11 = this.e;
      int var2;
      if (var13 != null) {
         if (this.r && var11 != null) {
            Rect var10 = .ke.a(var11);
            var11.copyBounds(var12);
            var12.left += var10.left;
            var12.right -= var10.right;
            var2 = var1.save();
            var1.clipRect(var12, Op.DIFFERENCE);
            var13.draw(var1);
            var1.restoreToCount(var2);
         } else {
            var13.draw(var1);
         }
      }

      int var3 = var1.save();
      if (var11 != null) {
         var11.draw(var1);
      }

      Layout var14;
      if (this.l()) {
         var14 = this.N;
      } else {
         var14 = this.O;
      }

      if (var14 != null) {
         int[] var17 = this.getDrawableState();
         ColorStateList var16 = this.M;
         if (var16 != null) {
            this.L.setColor(var16.getColorForState(var17, 0));
         }

         this.L.drawableState = var17;
         if (var11 != null) {
            Rect var15 = var11.getBounds();
            var2 = var15.left + var15.right;
         } else {
            var2 = this.getWidth();
         }

         int var8 = var14.getWidth();
         var2 /= 2;
         var8 /= 2;
         int var9 = var14.getHeight();
         var4 = (var5 + var4 + (var6 - var7)) / 2;
         var5 = var9 / 2;
         var1.translate((float)(var2 - var8), (float)(var4 - var5));
         var14.draw(var1);
      }

      var1.restoreToCount(var3);
   }

   public final void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
      super.onInitializeAccessibilityEvent(var1);
      var1.setClassName("android.widget.Switch");
   }

   public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      super.onInitializeAccessibilityNodeInfo(var1);
      var1.setClassName("android.widget.Switch");
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      Drawable var8 = this.e;
      var3 = 0;
      if (var8 != null) {
         Rect var10 = this.R;
         Drawable var9 = this.j;
         if (var9 != null) {
            var9.getPadding(var10);
         } else {
            var10.setEmpty();
         }

         Rect var11 = .ke.a(this.e);
         var2 = Math.max(0, var11.left - var10.left);
         var3 = Math.max(0, var11.right - var10.right);
      } else {
         var2 = 0;
      }

      if (.nv.a(this)) {
         var4 = this.getPaddingLeft() + var2;
         var5 = this.D + var4 - var2 - var3;
      } else {
         var5 = this.getWidth() - this.getPaddingRight() - var3;
         var4 = var5 - this.D + var2 + var3;
      }

      switch(this.getGravity() & 112) {
      case 16:
         var2 = this.getPaddingTop();
         var3 = this.getHeight();
         int var7 = this.getPaddingBottom();
         int var6 = this.E;
         var2 = (var2 + var3 - var7) / 2 - var6 / 2;
         var3 = var2;
         var2 += var6;
         break;
      case 80:
         var2 = this.getHeight() - this.getPaddingBottom();
         var3 = var2 - this.E;
         break;
      default:
         var3 = this.getPaddingTop();
         var2 = this.E + var3;
      }

      this.G = var4;
      this.H = var3;
      this.J = var2;
      this.I = var5;
   }

   public final void onMeasure(int var1, int var2) {
      if (this.w) {
         if (this.N == null) {
            this.N = this.i(this.t);
         }

         if (this.O == null) {
            this.O = this.i(this.v);
         }
      }

      Rect var9 = this.R;
      Drawable var10 = this.e;
      byte var6 = 0;
      int var3;
      int var4;
      if (var10 != null) {
         var10.getPadding(var9);
         var4 = this.e.getIntrinsicWidth() - var9.left - var9.right;
         var3 = this.e.getIntrinsicHeight();
      } else {
         var4 = 0;
         var3 = 0;
      }

      int var5;
      int var7;
      if (this.w) {
         var7 = Math.max(this.N.getWidth(), this.O.getWidth());
         var5 = this.o;
         var5 = var7 + var5 + var5;
      } else {
         var5 = 0;
      }

      this.F = Math.max(var5, var4);
      var10 = this.j;
      if (var10 != null) {
         var10.getPadding(var9);
         var4 = this.j.getIntrinsicHeight();
      } else {
         var9.setEmpty();
         var4 = var6;
      }

      int var8 = var9.left;
      var7 = var9.right;
      Drawable var12 = this.e;
      int var11 = var7;
      var5 = var8;
      if (var12 != null) {
         var9 = .ke.a(var12);
         var5 = Math.max(var8, var9.left);
         var11 = Math.max(var7, var9.right);
      }

      if (this.K) {
         var8 = this.p;
         var7 = this.F;
         var5 = Math.max(var8, var7 + var7 + var5 + var11);
      } else {
         var5 = this.p;
      }

      var3 = Math.max(var4, var3);
      this.D = var5;
      this.E = var3;
      super.onMeasure(var1, var2);
      if (this.getMeasuredHeight() < var3) {
         this.setMeasuredDimension(this.getMeasuredWidthAndState(), var3);
      }

   }

   public final void onPopulateAccessibilityEvent(AccessibilityEvent var1) {
      super.onPopulateAccessibilityEvent(var1);
      CharSequence var2;
      if (this.isChecked()) {
         var2 = this.s;
      } else {
         var2 = this.u;
      }

      if (var2 != null) {
         var1.getText().add(var2);
      }

   }

   public final boolean onTouchEvent(MotionEvent var1) {
      this.B.addMovement(var1);
      int var7 = var1.getActionMasked();
      float var4 = 0.0F;
      float var2;
      float var3;
      switch(var7) {
      case 0:
         var3 = var1.getX();
         var2 = var1.getY();
         if (this.isEnabled() && this.e != null) {
            int var9 = this.g();
            this.e.getPadding(this.R);
            int var8 = this.H;
            var7 = this.y;
            int var10 = this.G + var9 - var7;
            int var12 = this.F;
            int var13 = this.R.left;
            int var11 = this.R.right;
            var9 = this.y;
            int var14 = this.J;
            if (var3 > (float)var10 && var3 < (float)(var12 + var10 + var13 + var11 + var9) && var2 > (float)(var8 - var7) && var2 < (float)(var14 + var9)) {
               this.x = 1;
               this.z = var3;
               this.A = var2;
            }
         }
         break;
      case 1:
      case 3:
         if (this.x == 2) {
            this.x = 0;
            boolean var18;
            if (var1.getAction() == 1 && this.isEnabled()) {
               var18 = true;
            } else {
               var18 = false;
            }

            boolean var16 = this.isChecked();
            boolean var15;
            if (var18) {
               this.B.computeCurrentVelocity(1000);
               var2 = this.B.getXVelocity();
               if (Math.abs(var2) > (float)this.C) {
                  label75: {
                     if (.nv.a(this)) {
                        if (var2 < 0.0F) {
                           var15 = true;
                           break label75;
                        }
                     } else if (var2 > 0.0F) {
                        var15 = true;
                        break label75;
                     }

                     var15 = false;
                  }
               } else {
                  var15 = this.l();
               }
            } else {
               var15 = var16;
            }

            if (var15 != var16) {
               this.playSoundEffect(0);
            }

            this.setChecked(var15);
            MotionEvent var17 = MotionEvent.obtain(var1);
            var17.setAction(3);
            super.onTouchEvent(var17);
            var17.recycle();
            super.onTouchEvent(var1);
            return true;
         }

         this.x = 0;
         this.B.clear();
         break;
      case 2:
         switch(this.x) {
         case 1:
            var3 = var1.getX();
            var2 = var1.getY();
            if (!(Math.abs(var3 - this.z) > (float)this.y) && !(Math.abs(var2 - this.A) > (float)this.y)) {
               break;
            }

            this.x = 2;
            this.getParent().requestDisallowInterceptTouchEvent(true);
            this.z = var3;
            this.A = var2;
            return true;
         case 2:
            float var5 = var1.getX();
            var7 = this.h();
            var2 = var5 - this.z;
            if (var7 != 0) {
               var2 /= (float)var7;
            } else if (var2 > 0.0F) {
               var2 = 1.0F;
            } else {
               var2 = -1.0F;
            }

            var3 = var2;
            if (.nv.a(this)) {
               var3 = -var2;
            }

            float var6 = this.a;
            var2 = var3 + var6;
            if (var2 < 0.0F) {
               var2 = var4;
            } else if (var2 > 1.0F) {
               var2 = 1.0F;
            }

            if (var2 != var6) {
               this.z = var5;
               this.f(var2);
            }

            return true;
         }
      }

      return super.onTouchEvent(var1);
   }

   public final void setAllCaps(boolean var1) {
      super.setAllCaps(var1);
      this.m();
      .ckf.b();
   }

   public final void setChecked(boolean var1) {
      super.setChecked(var1);
      var1 = this.isChecked();
      if (var1) {
         this.b();
      } else {
         this.a();
      }

      IBinder var4 = this.getWindowToken();
      float var3 = 0.0F;
      float var2 = 0.0F;
      ObjectAnimator var5;
      if (var4 != null && .cga.f(this)) {
         if (var1) {
            var2 = 1.0F;
         }

         var5 = ObjectAnimator.ofFloat(this, c, new float[]{var2});
         this.b = var5;
         var5.setDuration(250L);
         .nd.a(this.b, true);
         this.b.start();
      } else {
         var5 = this.b;
         if (var5 != null) {
            var5.cancel();
         }

         if (!var1) {
            var2 = var3;
         } else {
            var2 = 1.0F;
         }

         this.f(var2);
      }
   }

   public final void setFilters(InputFilter[] var1) {
      this.m();
      .ckf.b();
      super.setFilters(var1);
   }

   public final void toggle() {
      this.setChecked(this.isChecked() ^ true);
   }

   protected final boolean verifyDrawable(Drawable var1) {
      return super.verifyDrawable(var1) || var1 == this.e || var1 == this.j;
   }
}
