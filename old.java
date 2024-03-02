import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;

public class old extends LinearLayoutCompat {
   protected boolean a;
   boolean b;
   private Drawable c;
   private final Rect d;
   private final Rect e;
   private int i;

   public old(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public old(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public old(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.d = new Rect();
      this.e = new Rect();
      this.i = 119;
      this.a = true;
      this.b = false;
      TypedArray var4 = oli.a(var1, var2, olf.a, var3, 0);
      this.i = var4.getInt(1, this.i);
      Drawable var5 = var4.getDrawable(0);
      if (var5 != null) {
         this.setForeground(var5);
      }

      this.a = var4.getBoolean(2, true);
      var4.recycle();
   }

   public final void draw(Canvas var1) {
      super.draw(var1);
      Drawable var6 = this.c;
      if (var6 != null) {
         if (this.b) {
            this.b = false;
            Rect var4 = this.d;
            Rect var5 = this.e;
            int var2 = this.getRight() - this.getLeft();
            int var3 = this.getBottom() - this.getTop();
            if (this.a) {
               var4.set(0, 0, var2, var3);
            } else {
               var4.set(this.getPaddingLeft(), this.getPaddingTop(), var2 - this.getPaddingRight(), var3 - this.getPaddingBottom());
            }

            Gravity.apply(this.i, var6.getIntrinsicWidth(), var6.getIntrinsicHeight(), var4, var5);
            var6.setBounds(var5);
         }

         var6.draw(var1);
      }
   }

   public final void drawableHotspotChanged(float var1, float var2) {
      super.drawableHotspotChanged(var1, var2);
      Drawable var3 = this.c;
      if (var3 != null) {
         var3.setHotspot(var1, var2);
      }

   }

   protected final void drawableStateChanged() {
      super.drawableStateChanged();
      Drawable var1 = this.c;
      if (var1 != null && var1.isStateful()) {
         this.c.setState(this.getDrawableState());
      }

   }

   public final Drawable getForeground() {
      return this.c;
   }

   public final int getForegroundGravity() {
      return this.i;
   }

   public final void jumpDrawablesToCurrentState() {
      super.jumpDrawablesToCurrentState();
      Drawable var1 = this.c;
      if (var1 != null) {
         var1.jumpToCurrentState();
      }

   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      this.b |= var1;
   }

   protected final void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      this.b = true;
   }

   public final void setForeground(Drawable var1) {
      Drawable var2 = this.c;
      if (var2 != var1) {
         if (var2 != null) {
            var2.setCallback((Callback)null);
            this.unscheduleDrawable(this.c);
         }

         this.c = var1;
         this.b = true;
         if (var1 != null) {
            this.setWillNotDraw(false);
            var1.setCallback(this);
            if (var1.isStateful()) {
               var1.setState(this.getDrawableState());
            }

            if (this.i == 119) {
               var1.getPadding(new Rect());
            }
         } else {
            this.setWillNotDraw(true);
         }

         this.requestLayout();
         this.invalidate();
      }
   }

   public final void setForegroundGravity(int var1) {
      if (this.i != var1) {
         int var2 = var1;
         if ((8388615 & var1) == 0) {
            var2 = var1 | 8388611;
         }

         var1 = var2;
         if ((var2 & 112) == 0) {
            var1 = var2 | 48;
         }

         this.i = var1;
         if (var1 == 119 && this.c != null) {
            Rect var3 = new Rect();
            this.c.getPadding(var3);
         }

         this.requestLayout();
      }

   }

   protected final boolean verifyDrawable(Drawable var1) {
      return super.verifyDrawable(var1) || var1 == this.c;
   }
}
