package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ActionMode.Callback;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout {
   public Drawable a;
   public Drawable b;
   public Drawable c;
   public boolean d;
   public boolean e;
   private boolean f;
   private View g;
   private View h;
   private int i;

   public ActionBarContainer(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ActionBarContainer(Context var1, AttributeSet var2) {
      super(var1, var2);
      .cfx.m(this, new .hs(this));
      TypedArray var4 = var1.obtainStyledAttributes(var2, .fq.a);
      boolean var3 = false;
      this.a = var4.getDrawable(0);
      this.b = var4.getDrawable(2);
      this.i = var4.getDimensionPixelSize(13, -1);
      if (this.getId() == 2131428258) {
         this.d = true;
         this.c = var4.getDrawable(1);
      }

      var4.recycle();
      if (this.d) {
         if (this.c == null) {
            var3 = true;
         }
      } else if (this.a == null && this.b == null) {
         var3 = true;
      }

      this.setWillNotDraw(var3);
   }

   public final void a(boolean var1) {
      this.f = var1;
      int var2;
      if (!var1) {
         var2 = 262144;
      } else {
         var2 = 393216;
      }

      this.setDescendantFocusability(var2);
   }

   protected final void drawableStateChanged() {
      super.drawableStateChanged();
      Drawable var1 = this.a;
      if (var1 != null && var1.isStateful()) {
         this.a.setState(this.getDrawableState());
      }

      var1 = this.b;
      if (var1 != null && var1.isStateful()) {
         this.b.setState(this.getDrawableState());
      }

      var1 = this.c;
      if (var1 != null && var1.isStateful()) {
         this.c.setState(this.getDrawableState());
      }

   }

   public final void jumpDrawablesToCurrentState() {
      super.jumpDrawablesToCurrentState();
      Drawable var1 = this.a;
      if (var1 != null) {
         var1.jumpToCurrentState();
      }

      var1 = this.b;
      if (var1 != null) {
         var1.jumpToCurrentState();
      }

      var1 = this.c;
      if (var1 != null) {
         var1.jumpToCurrentState();
      }

   }

   public final void onFinishInflate() {
      super.onFinishInflate();
      this.g = this.findViewById(2131427382);
      this.h = this.findViewById(2131427391);
   }

   public final boolean onHoverEvent(MotionEvent var1) {
      super.onHoverEvent(var1);
      return true;
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      return this.f || super.onInterceptTouchEvent(var1);
   }

   public final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (this.d) {
         Drawable var6 = this.c;
         if (var6 == null) {
            return;
         }

         var6.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
      } else {
         boolean var7;
         if (this.a != null) {
            var3 = this.g.getVisibility();
            var7 = true;
            if (var3 == 0) {
               this.a.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
            } else {
               View var8 = this.h;
               if (var8 != null && var8.getVisibility() == 0) {
                  this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
               } else {
                  this.a.setBounds(0, 0, 0, 0);
               }
            }
         } else {
            var7 = false;
         }

         this.e = false;
         if (!var7) {
            return;
         }
      }

      this.invalidate();
   }

   public final void onMeasure(int var1, int var2) {
      int var3 = var2;
      if (this.g == null) {
         var3 = var2;
         if (MeasureSpec.getMode(var2) == Integer.MIN_VALUE) {
            int var4 = this.i;
            var3 = var2;
            if (var4 >= 0) {
               var3 = MeasureSpec.makeMeasureSpec(Math.min(var4, MeasureSpec.getSize(var2)), Integer.MIN_VALUE);
            }
         }
      }

      super.onMeasure(var1, var3);
      if (this.g != null) {
         MeasureSpec.getMode(var3);
      }
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      super.onTouchEvent(var1);
      return true;
   }

   public final void setVisibility(int var1) {
      super.setVisibility(var1);
      Drawable var3 = this.a;
      boolean var2;
      if (var1 == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var3 != null) {
         var3.setVisible(var2, false);
      }

      var3 = this.b;
      if (var3 != null) {
         var3.setVisible(var2, false);
      }

      var3 = this.c;
      if (var3 != null) {
         var3.setVisible(var2, false);
      }

   }

   public final ActionMode startActionModeForChild(View var1, Callback var2) {
      return null;
   }

   public final ActionMode startActionModeForChild(View var1, Callback var2, int var3) {
      return var3 != 0 ? super.startActionModeForChild(var1, var2, var3) : null;
   }

   protected final boolean verifyDrawable(Drawable var1) {
      return var1 == this.a && !this.d || var1 == this.c && this.d || super.verifyDrawable(var1);
   }
}
