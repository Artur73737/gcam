import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.View.OnTouchListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

public final class cih implements OnTouchListener {
   private static final int g = ViewConfiguration.getTapTimeout();
   public final cig a;
   public final View b;
   public boolean c;
   public boolean d;
   public boolean e;
   public final ListView f;
   private final Interpolator h;
   private Runnable i;
   private final float[] j;
   private final float[] k;
   private final int l;
   private final float[] m;
   private final float[] n;
   private final float[] o;
   private boolean p;
   private boolean q;

   public cih(ListView var1) {
      cig var6 = new cig();
      this.a = var6;
      this.h = new AccelerateInterpolator();
      float[] var7 = new float[]{0.0F, 0.0F};
      this.j = var7;
      float[] var8 = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
      this.k = var8;
      float[] var9 = new float[]{0.0F, 0.0F};
      this.m = var9;
      float[] var5 = new float[]{0.0F, 0.0F};
      this.n = var5;
      float[] var4 = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
      this.o = var4;
      this.b = var1;
      DisplayMetrics var10 = Resources.getSystem().getDisplayMetrics();
      float var3 = var10.density;
      float var2 = var10.density;
      var3 = (float)((int)(var3 * 1575.0F + 0.5F)) / 1000.0F;
      var4[0] = var3;
      var4[1] = var3;
      var2 = (float)((int)(var2 * 315.0F + 0.5F)) / 1000.0F;
      var5[0] = var2;
      var5[1] = var2;
      var8[0] = Float.MAX_VALUE;
      var8[1] = Float.MAX_VALUE;
      var7[0] = 0.2F;
      var7[1] = 0.2F;
      var9[0] = 0.001F;
      var9[1] = 0.001F;
      this.l = g;
      var6.a = 500;
      var6.b = 500;
      this.f = var1;
   }

   static float a(float var0, float var1, float var2) {
      if (var0 > var2) {
         return var2;
      } else {
         return var0 < var1 ? var1 : var0;
      }
   }

   private final float d(int var1, float var2, float var3, float var4) {
      float var5;
      float var6;
      label23: {
         var6 = a(this.j[var1] * var3, 0.0F, this.k[var1]);
         var5 = this.e(var2, var6);
         var2 = this.e(var3 - var2, var6) - var5;
         if (var2 < 0.0F) {
            var2 = -this.h.getInterpolation(-var2);
         } else {
            if (!(var2 > 0.0F)) {
               var2 = 0.0F;
               break label23;
            }

            var2 = this.h.getInterpolation(var2);
         }

         var2 = a(var2, -1.0F, 1.0F);
      }

      if (var2 == 0.0F) {
         return 0.0F;
      } else {
         var6 = this.m[var1];
         var5 = this.n[var1];
         var3 = this.o[var1];
         var4 = var6 * var4;
         return var2 > 0.0F ? a(var2 * var4, var5, var3) : -a(-var2 * var4, var5, var3);
      }
   }

   private final float e(float var1, float var2) {
      if (var2 == 0.0F) {
         return 0.0F;
      } else {
         if (var1 < var2) {
            if (var1 >= 0.0F) {
               return 1.0F - var1 / var2;
            }

            if (this.e) {
               return 1.0F;
            }
         }

         return 0.0F;
      }
   }

   private final void f() {
      boolean var8 = this.c;
      byte var2 = 0;
      if (var8) {
         this.e = false;
      } else {
         cig var9 = this.a;
         long var4 = AnimationUtils.currentAnimationTimeMillis();
         long var6 = var9.e;
         int var3 = var9.b;
         int var1 = (int)(var4 - var6);
         if (var1 > var3) {
            var1 = var3;
         } else if (var1 < 0) {
            var1 = var2;
         }

         var9.i = var1;
         var9.h = var9.a(var4);
         var9.g = var4;
      }
   }

   public final boolean b() {
      cig var8 = this.a;
      float var1 = var8.d;
      var1 /= Math.abs(var1);
      float var2 = var8.c;
      var2 /= Math.abs(var2);
      int var6 = (int)var1;
      boolean var7 = false;
      if (var6 != 0) {
         ListView var9 = this.f;
         int var5 = var9.getCount();
         if (var5 != 0) {
            int var4 = var9.getChildCount();
            int var3 = var9.getFirstVisiblePosition();
            if (var6 > 0) {
               if (var3 + var4 < var5 || var9.getChildAt(var4 - 1).getBottom() > var9.getHeight()) {
                  var7 = true;
                  return var7;
               }
            } else if (var6 < 0 && (var3 > 0 || var9.getChildAt(0).getTop() < 0)) {
               var7 = true;
               return var7;
            }
         }
      }

      if ((int)var2 == 0) {
      }

      return var7;
   }

   public final void c(boolean var1) {
      if (this.q && !var1) {
         this.f();
      }

      this.q = var1;
   }

   public final boolean onTouch(View var1, MotionEvent var2) {
      if (!this.q) {
         return false;
      } else {
         switch(var2.getActionMasked()) {
         case 0:
            this.d = true;
            this.p = false;
         case 2:
            float var3 = this.d(0, var2.getX(), (float)var1.getWidth(), (float)this.b.getWidth());
            float var4 = this.d(1, var2.getY(), (float)var1.getHeight(), (float)this.b.getHeight());
            cig var6 = this.a;
            var6.c = var3;
            var6.d = var4;
            if (!this.e && this.b()) {
               if (this.i == null) {
                  this.i = new nj(this, 11, (byte[])null);
               }

               label25: {
                  this.e = true;
                  this.c = true;
                  if (!this.p) {
                     int var5 = this.l;
                     if (var5 > 0) {
                        cfx.j(this.b, this.i, (long)var5);
                        break label25;
                     }
                  }

                  this.i.run();
               }

               this.p = true;
            }
            break;
         case 1:
         case 3:
            this.f();
         }

         return false;
      }
   }
}
