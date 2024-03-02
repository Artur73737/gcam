import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode$AmbientController;

final class cwv {
   protected final cww a;
   public final float b;
   public final int c;
   public final float d;
   public final cxd e;
   public int f;
   public float g;
   public float h;
   public float i;
   public boolean j;
   public boolean k;
   public boolean l;
   public boolean m;
   protected AmbientMode$AmbientController n;
   private final int o;

   public cwv(Context var1, cww var2) {
      this.a = var2;
      this.b = 0.33F;
      this.m = false;
      ViewConfiguration var3 = ViewConfiguration.get(var1);
      this.o = var3.getScaledTouchSlop();
      this.c = var3.getScaledMinimumFlingVelocity();
      this.d = (float)Resources.getSystem().getDisplayMetrics().widthPixels * 0.1F;
      this.e = new cxd(var2);
   }

   public final void a(MotionEvent var1) {
      if (var1.getActionMasked() == 0) {
         boolean var2;
         label23: {
            cxd var5 = this.e;
            cjv var4 = var5.l;
            boolean var3 = true;
            if (var4 != null) {
               var2 = var3;
               if (var4.m) {
                  break label23;
               }
            }

            cjv var6 = var5.m;
            if (var6 != null && var6.m) {
               var2 = var3;
            } else {
               var2 = false;
            }
         }

         this.m = var2;
      }

   }

   public final void b() {
      VelocityTracker var1 = this.e.f;
      if (var1 != null) {
         var1.recycle();
      }

      this.e.f = null;
      this.g = 0.0F;
      this.h = 0.0F;
      this.j = false;
      this.i = -2.14748365E9F;
      this.k = false;
      this.l = false;
   }

   public final void c(MotionEvent var1) {
      if (!this.j) {
         float var2 = var1.getRawX() - this.g;
         float var3 = var1.getRawY() - this.h;
         int var5 = this.o;
         float var4 = (float)(var5 * var5);
         boolean var7 = false;
         boolean var6 = var7;
         if (var2 * var2 + var3 * var3 > var4) {
            if (var2 > (float)(var5 + var5) && Math.abs(var3) < Math.abs(var2)) {
               var6 = true;
            } else {
               var6 = var7;
            }
         }

         this.j = var6;
      }

   }

   protected final boolean d(View var1, boolean var2, float var3, float var4, float var5) {
      if (var1 instanceof ViewGroup) {
         ViewGroup var12 = (ViewGroup)var1;
         int var10 = var1.getScrollX();
         int var9 = var1.getScrollY();

         for(int var8 = var12.getChildCount() - 1; var8 >= 0; --var8) {
            View var11 = var12.getChildAt(var8);
            float var6 = var4 + (float)var10;
            if (var6 >= (float)var11.getLeft() && var6 < (float)var11.getRight()) {
               float var7 = var5 + (float)var9;
               if (var7 >= (float)var11.getTop() && var7 < (float)var11.getBottom() && this.d(var11, true, var3, var6 - (float)var11.getLeft(), var7 - (float)var11.getTop())) {
                  return true;
               }
            }
         }
      }

      return var2 && var1.canScrollHorizontally((int)(-var3));
   }
}
