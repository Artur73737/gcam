import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class oiq extends oit {
   private Runnable a;
   private boolean b;
   private int c = -1;
   OverScroller d;
   private int e;
   private int f = -1;
   private VelocityTracker g;

   public oiq() {
   }

   public oiq(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public int G(View var1) {
      throw null;
   }

   public int H(View var1) {
      throw null;
   }

   public int I() {
      throw null;
   }

   public int J(CoordinatorLayout var1, View var2, int var3, int var4, int var5) {
      throw null;
   }

   public void L(CoordinatorLayout var1, View var2) {
      throw null;
   }

   public boolean N(View var1) {
      throw null;
   }

   public final int P(CoordinatorLayout var1, View var2, int var3, int var4, int var5) {
      return this.J(var1, var2, this.I() - var3, var4, var5);
   }

   public final void Q(CoordinatorLayout var1, View var2, int var3) {
      this.J(var1, var2, var3, Integer.MIN_VALUE, Integer.MAX_VALUE);
   }

   public final boolean d(CoordinatorLayout var1, View var2, MotionEvent var3) {
      if (this.f < 0) {
         this.f = ViewConfiguration.get(var1.getContext()).getScaledTouchSlop();
      }

      int var4;
      if (var3.getActionMasked() == 2 && this.b) {
         var4 = this.c;
         if (var4 == -1) {
            return false;
         }

         var4 = var3.findPointerIndex(var4);
         if (var4 == -1) {
            return false;
         }

         var4 = (int)var3.getY(var4);
         if (Math.abs(var4 - this.e) > this.f) {
            this.e = var4;
            return true;
         }
      }

      if (var3.getActionMasked() == 0) {
         this.c = -1;
         int var5 = (int)var3.getX();
         var4 = (int)var3.getY();
         boolean var6;
         if (this.N(var2) && var1.k(var2, var5, var4)) {
            var6 = true;
         } else {
            var6 = false;
         }

         this.b = var6;
         if (var6) {
            this.e = var4;
            this.c = var3.getPointerId(0);
            if (this.g == null) {
               this.g = VelocityTracker.obtain();
            }

            OverScroller var7 = this.d;
            if (var7 != null && !var7.isFinished()) {
               this.d.abortAnimation();
               return true;
            }
         }
      }

      VelocityTracker var8 = this.g;
      if (var8 != null) {
         var8.addMovement(var3);
      }

      return false;
   }

   public final boolean g(CoordinatorLayout var1, View var2, MotionEvent var3) {
      boolean var6;
      VelocityTracker var9;
      label50: {
         boolean var10;
         int var11;
         switch(var3.getActionMasked()) {
         case 1:
            VelocityTracker var7 = this.g;
            if (var7 != null) {
               var7.addMovement(var3);
               this.g.computeCurrentVelocity(1000);
               float var4 = this.g.getYVelocity(this.c);
               var11 = -this.H(var2);
               Runnable var13 = this.a;
               if (var13 != null) {
                  var2.removeCallbacks(var13);
                  this.a = null;
               }

               if (this.d == null) {
                  this.d = new OverScroller(var2.getContext());
               }

               this.d.fling(0, this.R(), 0, Math.round(var4), 0, 0, var11, 0);
               if (this.d.computeScrollOffset()) {
                  oip var8 = new oip(this, var1, var2);
                  this.a = var8;
                  cfx.i(var2, var8);
                  var10 = true;
               } else {
                  this.L(var1, var2);
                  var10 = true;
               }
            } else {
               var10 = false;
            }
            break;
         case 2:
            var11 = var3.findPointerIndex(this.c);
            if (var11 == -1) {
               return false;
            }

            int var12 = (int)var3.getY(var11);
            var11 = this.e;
            this.e = var12;
            this.P(var1, var2, var11 - var12, this.G(var2), 0);
            var6 = false;
            break label50;
         case 3:
            var10 = false;
            break;
         case 4:
         case 5:
         default:
            var6 = false;
            break label50;
         case 6:
            byte var5;
            if (var3.getActionIndex() == 0) {
               var5 = 1;
            } else {
               var5 = 0;
            }

            this.c = var3.getPointerId(var5);
            this.e = (int)(var3.getY(var5) + 0.5F);
            var6 = false;
            break label50;
         }

         this.b = false;
         this.c = -1;
         var9 = this.g;
         var6 = var10;
         if (var9 != null) {
            var9.recycle();
            this.g = null;
            var6 = var10;
         }
      }

      var9 = this.g;
      if (var9 != null) {
         var9.addMovement(var3);
      }

      return this.b || var6;
   }
}
