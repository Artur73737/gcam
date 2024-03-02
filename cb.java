import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cb extends FrameLayout {
   public boolean a;
   private final List b;
   private final List c;
   private OnApplyWindowInsetsListener d;

   public cb(Context var1, AttributeSet var2, cp var3) {
      var1.getClass();
      var2.getClass();
      super(var1, var2);
      this.b = new ArrayList();
      this.c = new ArrayList();
      this.a = true;
      String var6 = var2.getClassAttribute();
      TypedArray var7 = var1.obtainStyledAttributes(var2, as.b, 0, 0);
      String var5 = var6;
      if (var6 == null) {
         var5 = var7.getString(0);
      }

      var6 = var7.getString(1);
      var7.recycle();
      int var4 = this.getId();
      bv var16 = var3.d(var4);
      if (var5 != null && var16 == null) {
         if (var4 == -1) {
            String var10;
            if (var6 != null) {
               var10 = " with tag ".concat(var6);
            } else {
               var10 = "";
            }

            StringBuilder var12 = new StringBuilder();
            var12.append("FragmentContainerView must have an android:id to add Fragment ");
            var12.append(var5);
            var12.append(var10);
            throw new IllegalStateException(var12.toString());
         }

         cc var17 = var3.h();
         var1.getClassLoader();
         bv var14 = var17.b(var5);
         var14.getClass();
         var14.onInflate((Context)var1, var2, (Bundle)null);
         cw var8 = var3.i();
         var8.p();
         var14.N = this;
         var8.m(this.getId(), var14, var6);
         var8.o();
         ((at)var8).a.E(var8, true);
      }

      Iterator var11 = var3.a.d().iterator();

      while(var11.hasNext()) {
         llo var13 = (llo)var11.next();
         bv var9 = (bv)var13.c;
         if (var9.E == this.getId()) {
            View var15 = var9.O;
            if (var15 != null && var15.getParent() == null) {
               var9.N = this;
               var13.b();
            }
         }
      }

   }

   private final void a(View var1) {
      if (this.c.contains(var1)) {
         this.b.add(var1);
      }

   }

   public final void addView(View var1, int var2, LayoutParams var3) {
      var1.getClass();
      if (cp.g(var1) != null) {
         super.addView(var1, var2, var3);
      } else {
         throw new IllegalStateException(c.aF(var1, "Views added to a FragmentContainerView must be associated with a Fragment. View ", " is not associated with a Fragment."));
      }
   }

   public final WindowInsets dispatchApplyWindowInsets(WindowInsets var1) {
      var1.getClass();
      cho var4 = cho.m(var1);
      OnApplyWindowInsetsListener var5 = this.d;
      if (var5 != null) {
         WindowInsets var6 = var5.onApplyWindowInsets(this, var1);
         var6.getClass();
         var4 = cho.m(var6);
      } else {
         var4 = cgm.c(this, var4);
      }

      if (!var4.q()) {
         int var3 = this.getChildCount();

         for(int var2 = 0; var2 < var3; ++var2) {
            cgm.b(this.getChildAt(var2), var4);
         }
      }

      return var1;
   }

   protected final void dispatchDraw(Canvas var1) {
      var1.getClass();
      if (this.a) {
         Iterator var2 = this.b.iterator();

         while(var2.hasNext()) {
            super.drawChild(var1, (View)var2.next(), this.getDrawingTime());
         }
      }

      super.dispatchDraw(var1);
   }

   protected final boolean drawChild(Canvas var1, View var2, long var3) {
      var1.getClass();
      var2.getClass();
      return this.a && !this.b.isEmpty() && this.b.contains(var2) ? false : super.drawChild(var1, var2, var3);
   }

   public final void endViewTransition(View var1) {
      var1.getClass();
      this.c.remove(var1);
      if (this.b.remove(var1)) {
         this.a = true;
      }

      super.endViewTransition(var1);
   }

   public final WindowInsets onApplyWindowInsets(WindowInsets var1) {
      var1.getClass();
      return var1;
   }

   public final void removeAllViewsInLayout() {
      for(int var1 = this.getChildCount() - 1; var1 >= 0; --var1) {
         View var2 = this.getChildAt(var1);
         var2.getClass();
         this.a(var2);
      }

      super.removeAllViewsInLayout();
   }

   public final void removeView(View var1) {
      var1.getClass();
      this.a(var1);
      super.removeView(var1);
   }

   public final void removeViewAt(int var1) {
      View var2 = this.getChildAt(var1);
      var2.getClass();
      this.a(var2);
      super.removeViewAt(var1);
   }

   public final void removeViewInLayout(View var1) {
      var1.getClass();
      this.a(var1);
      super.removeViewInLayout(var1);
   }

   public final void removeViews(int var1, int var2) {
      for(int var3 = var1; var3 < var1 + var2; ++var3) {
         View var4 = this.getChildAt(var3);
         var4.getClass();
         this.a(var4);
      }

      super.removeViews(var1, var2);
   }

   public final void removeViewsInLayout(int var1, int var2) {
      for(int var3 = var1; var3 < var1 + var2; ++var3) {
         View var4 = this.getChildAt(var3);
         var4.getClass();
         this.a(var4);
      }

      super.removeViewsInLayout(var1, var2);
   }

   public final void setLayoutTransition(LayoutTransition var1) {
      throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
   }

   public final void setOnApplyWindowInsetsListener(OnApplyWindowInsetsListener var1) {
      var1.getClass();
      this.d = var1;
   }

   public final void startViewTransition(View var1) {
      var1.getClass();
      if (var1.getParent() == this) {
         this.c.add(var1);
      }

      super.startViewTransition(var1);
   }
}
