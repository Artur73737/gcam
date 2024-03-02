import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public final class cjb {
   private static final Interpolator e = new ciz(0);
   public int a;
   public int b;
   public int c = -1;
   public View d;
   private float[] f;
   private float[] g;
   private float[] h;
   private float[] i;
   private int[] j;
   private int[] k;
   private int[] l;
   private int m;
   private VelocityTracker n;
   private final float o;
   private float p;
   private int q;
   private final OverScroller r;
   private final cja s;
   private boolean t;
   private final ViewGroup u;
   private final Runnable v = new nj(this, 12, (byte[])null);

   private cjb(Context var1, ViewGroup var2, cja var3) {
      if (var3 != null) {
         this.u = var2;
         this.s = var3;
         ViewConfiguration var4 = ViewConfiguration.get(var1);
         this.q = (int)(var1.getResources().getDisplayMetrics().density * 20.0F + 0.5F);
         this.b = var4.getScaledTouchSlop();
         this.o = (float)var4.getScaledMaximumFlingVelocity();
         this.p = (float)var4.getScaledMinimumFlingVelocity();
         this.r = new OverScroller(var1, e);
      } else {
         throw new NullPointerException("Callback may not be null");
      }
   }

   public static cjb b(ViewGroup var0, cja var1) {
      return new cjb(var0.getContext(), var0, var1);
   }

   private final int m(int var1, int var2, int var3) {
      if (var1 == 0) {
         return 0;
      } else {
         int var7 = this.u.getWidth();
         int var6 = var7 / 2;
         float var4 = (float)Math.sin((double)((Math.min(1.0F, (float)Math.abs(var1) / (float)var7) - 0.5F) * 0.47123894F));
         var2 = Math.abs(var2);
         if (var2 > 0) {
            float var5 = (float)var6;
            var1 = Math.round(Math.abs((var5 + var4 * var5) / (float)var2) * 1000.0F) * 4;
         } else {
            var1 = (int)(((float)Math.abs(var1) / (float)var3 + 1.0F) * 256.0F);
         }

         return Math.min(var1, 600);
      }
   }

   private final void n(int var1) {
      float[] var2 = this.f;
      if (var2 != null && this.h(var1)) {
         var2[var1] = 0.0F;
         this.g[var1] = 0.0F;
         this.h[var1] = 0.0F;
         this.i[var1] = 0.0F;
         this.j[var1] = 0;
         this.k[var1] = 0;
         this.l[var1] = 0;
         this.m &= ~(1 << var1);
      }
   }

   private final void o(float var1, float var2) {
      this.t = true;
      this.s.d(this.d, var1, var2);
      this.t = false;
      if (this.a == 1) {
         this.f(0);
      }

   }

   private final void p() {
      this.n.computeCurrentVelocity(1000, this.o);
      this.o(v(this.n.getXVelocity(this.c), this.p, this.o), v(this.n.getYVelocity(this.c), this.p, this.o));
   }

   private final void q(float var1, float var2, int var3) {
      this.x(var1, var2, var3);
      this.x(var2, var1, var3);
      this.x(var1, var2, var3);
      this.x(var2, var1, var3);
   }

   private final void r(float var1, float var2, int var3) {
      float[] var15 = this.f;
      byte var4 = 0;
      int var5;
      int[] var8;
      if (var15 == null || var15.length <= var3) {
         var5 = var3 + 1;
         float[] var11 = new float[var5];
         float[] var10 = new float[var5];
         float[] var13 = new float[var5];
         float[] var12 = new float[var5];
         var8 = new int[var5];
         int[] var14 = new int[var5];
         int[] var9 = new int[var5];
         if (var15 != null) {
            System.arraycopy(var15, 0, var11, 0, var15.length);
            var15 = this.g;
            System.arraycopy(var15, 0, var10, 0, var15.length);
            var15 = this.h;
            System.arraycopy(var15, 0, var13, 0, var15.length);
            var15 = this.i;
            System.arraycopy(var15, 0, var12, 0, var15.length);
            int[] var18 = this.j;
            System.arraycopy(var18, 0, var8, 0, var18.length);
            var18 = this.k;
            System.arraycopy(var18, 0, var14, 0, var18.length);
            var18 = this.l;
            System.arraycopy(var18, 0, var9, 0, var18.length);
         }

         this.f = var11;
         this.g = var10;
         this.h = var13;
         this.i = var12;
         this.j = var8;
         this.k = var14;
         this.l = var9;
      }

      float[] var17 = this.f;
      this.h[var3] = var1;
      var17[var3] = var1;
      var17 = this.g;
      this.i[var3] = var2;
      var17[var3] = var2;
      var8 = this.j;
      int var7 = (int)var1;
      int var6 = (int)var2;
      if (var7 < this.u.getLeft() + this.q) {
         var4 = 1;
      }

      var5 = var4;
      if (var6 < this.u.getTop() + this.q) {
         var5 = var4 | 4;
      }

      int var16 = var5;
      if (var7 > this.u.getRight() - this.q) {
         var16 = var5 | 2;
      }

      var5 = var16;
      if (var6 > this.u.getBottom() - this.q) {
         var5 = var16 | 8;
      }

      var8[var3] = var5;
      this.m |= 1 << var3;
   }

   private final void s(MotionEvent var1) {
      int var5 = var1.getPointerCount();

      for(int var4 = 0; var4 < var5; ++var4) {
         int var6 = var1.getPointerId(var4);
         if (this.u(var6)) {
            float var3 = var1.getX(var4);
            float var2 = var1.getY(var4);
            this.h[var6] = var3;
            this.i[var6] = var2;
         }
      }

   }

   private final boolean t(View var1, float var2, float var3) {
      if (var1 == null) {
         return false;
      } else {
         boolean var4;
         if (this.s.a(var1) > 0) {
            var4 = true;
         } else {
            var4 = false;
         }

         boolean var5;
         if (this.s.h() > 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         if (var4 && var5) {
            int var6 = this.b;
            return var2 * var2 + var3 * var3 > (float)(var6 * var6);
         } else if (var4) {
            return Math.abs(var2) > (float)this.b;
         } else {
            return var5 && Math.abs(var3) > (float)this.b;
         }
      }
   }

   private final boolean u(int var1) {
      return this.h(var1);
   }

   private static final float v(float var0, float var1, float var2) {
      float var3 = Math.abs(var0);
      if (var3 < var1) {
         return 0.0F;
      } else {
         var1 = var0;
         if (var3 > var2) {
            if (var0 > 0.0F) {
               return var2;
            }

            var1 = -var2;
         }

         return var1;
      }
   }

   private static final int w(int var0, int var1, int var2) {
      int var3 = Math.abs(var0);
      if (var3 < var1) {
         return 0;
      } else {
         var1 = var0;
         if (var3 > var2) {
            if (var0 > 0) {
               return var2;
            }

            var1 = -var2;
         }

         return var1;
      }
   }

   private final void x(float var1, float var2, int var3) {
      Math.abs(var1);
      Math.abs(var2);
      int var10000 = this.j[var3];
   }

   public final View a(int var1, int var2) {
      for(int var3 = this.u.getChildCount() - 1; var3 >= 0; --var3) {
         View var4 = this.u.getChildAt(var3);
         if (var1 >= var4.getLeft() && var1 < var4.getRight() && var2 >= var4.getTop() && var2 < var4.getBottom()) {
            return var4;
         }
      }

      return null;
   }

   public final void c() {
      this.c = -1;
      float[] var1 = this.f;
      if (var1 != null) {
         Arrays.fill(var1, 0.0F);
         Arrays.fill(this.g, 0.0F);
         Arrays.fill(this.h, 0.0F);
         Arrays.fill(this.i, 0.0F);
         Arrays.fill(this.j, 0);
         Arrays.fill(this.k, 0);
         Arrays.fill(this.l, 0);
         this.m = 0;
      }

      VelocityTracker var2 = this.n;
      if (var2 != null) {
         var2.recycle();
         this.n = null;
      }

   }

   public final void d(View var1, int var2) {
      if (var1.getParent() == this.u) {
         this.d = var1;
         this.c = var2;
         this.s.b(var1, var2);
         this.f(1);
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
         var3.append(this.u);
         var3.append(")");
         throw new IllegalArgumentException(var3.toString());
      }
   }

   public final void e(MotionEvent var1) {
      int var9 = var1.getActionMasked();
      int var10 = var1.getActionIndex();
      byte var8 = 0;
      byte var7 = 0;
      int var6 = var9;
      if (var9 == 0) {
         this.c();
         var6 = 0;
      }

      if (this.n == null) {
         this.n = VelocityTracker.obtain();
      }

      label118: {
         this.n.addMovement(var1);
         float var2;
         float var3;
         View var12;
         View var14;
         int var15;
         int var16;
         int var10000;
         switch(var6) {
         case 0:
            var3 = var1.getX();
            var2 = var1.getY();
            var6 = var1.getPointerId(0);
            var14 = this.a((int)var3, (int)var2);
            this.r(var3, var2, var6);
            this.k(var14, var6);
            var10000 = this.j[var6];
            return;
         case 1:
            if (this.a == 1) {
               this.p();
            }

            this.c();
            return;
         case 2:
            float var4;
            float var5;
            if (this.a != 1) {
               var15 = var1.getPointerCount();
               var6 = var8;

               while(true) {
                  if (var6 >= var15) {
                     break label118;
                  }

                  var16 = var1.getPointerId(var6);
                  if (this.u(var16)) {
                     var2 = var1.getX(var6);
                     var5 = var1.getY(var6);
                     var3 = var2 - this.f[var16];
                     var4 = var5 - this.g[var16];
                     this.q(var3, var4, var16);
                     if (this.a == 1) {
                        break label118;
                     }

                     var12 = this.a((int)var2, (int)var5);
                     if (this.t(var12, var3, var4) && this.k(var12, var16)) {
                        break label118;
                     }
                  }

                  ++var6;
               }
            }

            var6 = this.c;
            if (this.u(var6)) {
               var6 = var1.findPointerIndex(var6);
               if (var6 != -1) {
                  var2 = var1.getX(var6);
                  var4 = var1.getY(var6);
                  float[] var17 = this.h;
                  var6 = this.c;
                  var5 = var17[var6];
                  var3 = this.i[var6];
                  var6 = this.d.getLeft();
                  var16 = (int)(var2 - var5);
                  var6 += var16;
                  var15 = this.d.getTop();
                  var9 = (int)(var4 - var3);
                  var15 += var9;
                  int var11 = this.d.getLeft();
                  var10 = this.d.getTop();
                  int[] var18;
                  if (var16 != 0) {
                     var6 = this.s.f(this.d, var6);
                     var12 = this.d;
                     var18 = cgm.a;
                     var12.offsetLeftAndRight(var6 - var11);
                  }

                  if (var9 != 0) {
                     var15 = this.s.g(this.d, var15);
                     var12 = this.d;
                     var18 = cgm.a;
                     var12.offsetTopAndBottom(var15 - var10);
                  }

                  if (var16 != 0 || var9 != 0) {
                     this.s.i(this.d, var6, var15);
                  }
                  break label118;
               }
            }
            break;
         case 3:
            if (this.a == 1) {
               this.o(0.0F, 0.0F);
            }

            this.c();
            return;
         case 4:
         default:
            break;
         case 5:
            var6 = var1.getPointerId(var10);
            var2 = var1.getX(var10);
            var3 = var1.getY(var10);
            this.r(var2, var3, var6);
            if (this.a == 0) {
               this.k(this.a((int)var2, (int)var3), var6);
               var10000 = this.j[var6];
               return;
            }

            var15 = (int)var2;
            var16 = (int)var3;
            var14 = this.d;
            if (var14 != null && var15 >= var14.getLeft() && var15 < var14.getRight() && var16 >= var14.getTop() && var16 < var14.getBottom()) {
               this.k(this.d, var6);
               return;
            }
            break;
         case 6:
            var16 = var1.getPointerId(var10);
            if (this.a == 1 && var16 == this.c) {
               label127: {
                  var9 = var1.getPointerCount();

                  for(var6 = var7; var6 < var9; ++var6) {
                     var15 = var1.getPointerId(var6);
                     if (var15 != this.c) {
                        var3 = var1.getX(var6);
                        var2 = var1.getY(var6);
                        View var13 = this.a((int)var3, (int)var2);
                        var12 = this.d;
                        if (var13 == var12 && this.k(var12, var15)) {
                           if (this.c != -1) {
                              break label127;
                           }
                           break;
                        }
                     }
                  }

                  this.p();
               }
            }

            this.n(var16);
            return;
         }

         return;
      }

      this.s(var1);
   }

   public final void f(int var1) {
      this.u.removeCallbacks(this.v);
      if (this.a != var1) {
         this.a = var1;
         this.s.c(var1);
         if (this.a == 0) {
            this.d = null;
         }
      }

   }

   public final boolean g(int var1, int var2, int var3, int var4) {
      int var10 = this.d.getLeft();
      int var9 = this.d.getTop();
      var1 -= var10;
      var2 -= var9;
      if (var1 == 0) {
         if (var2 == 0) {
            this.r.abortAnimation();
            this.f(0);
            return false;
         }

         var1 = 0;
      }

      View var17 = this.d;
      int var11 = w(var3, (int)this.p, (int)this.o);
      var3 = w(var4, (int)this.p, (int)this.o);
      int var16 = Math.abs(var1);
      var4 = Math.abs(var2);
      int var14 = Math.abs(var11);
      int var12 = Math.abs(var3);
      int var13 = var14 + var12;
      int var15 = var16 + var4;
      float var5;
      if (var11 != 0) {
         var5 = (float)var14 / (float)var13;
      } else {
         var5 = (float)var16 / (float)var15;
      }

      float var6;
      if (var3 != 0) {
         var6 = (float)var12 / (float)var13;
      } else {
         var6 = (float)var4 / (float)var15;
      }

      var4 = this.m(var1, var11, this.s.a(var17));
      var3 = this.m(var2, var3, this.s.h());
      float var8 = (float)var4;
      float var7 = (float)var3;
      this.r.startScroll(var10, var9, var1, var2, (int)(var8 * var5 + var7 * var6));
      this.f(2);
      return true;
   }

   public final boolean h(int var1) {
      return (1 << var1 & this.m) != 0;
   }

   public final boolean i(int var1, int var2) {
      if (this.t) {
         return this.g(var1, var2, (int)this.n.getXVelocity(this.c), (int)this.n.getYVelocity(this.c));
      } else {
         throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
      }
   }

   public final boolean j(MotionEvent var1) {
      int var7 = var1.getActionMasked();
      int var8 = var1.getActionIndex();
      int var6 = var7;
      if (var7 == 0) {
         this.c();
         var6 = 0;
      }

      if (this.n == null) {
         this.n = VelocityTracker.obtain();
      }

      this.n.addMovement(var1);
      float var2;
      float var3;
      int var10000;
      View var17;
      switch(var6) {
      case 0:
         var2 = var1.getX();
         var3 = var1.getY();
         var6 = var1.getPointerId(0);
         this.r(var2, var3, var6);
         var17 = this.a((int)var2, (int)var3);
         if (var17 == this.d && this.a == 2) {
            this.k(var17, var6);
         }

         var10000 = this.j[var6];
         break;
      case 1:
      case 3:
         this.c();
         break;
      case 2:
         if (this.f != null && this.g != null) {
            var7 = var1.getPointerCount();

            for(var6 = 0; var6 < var7; ++var6) {
               var8 = var1.getPointerId(var6);
               if (this.u(var8)) {
                  float var4 = var1.getX(var6);
                  float var5 = var1.getY(var6);
                  var2 = var4 - this.f[var8];
                  var3 = var5 - this.g[var8];
                  View var16 = this.a((int)var4, (int)var5);
                  boolean var15 = this.t(var16, var2, var3);
                  if (var15) {
                     int var9 = var16.getLeft();
                     int var10 = (int)var2;
                     var10 = this.s.f(var16, var10 + var9);
                     int var11 = var16.getTop();
                     int var12 = (int)var3;
                     var12 = this.s.g(var16, var12 + var11);
                     int var13 = this.s.a(var16);
                     int var14 = this.s.h();
                     if ((var13 == 0 || var13 > 0 && var10 == var9) && (var14 == 0 || var14 > 0 && var12 == var11)) {
                        break;
                     }
                  }

                  this.q(var2, var3, var8);
                  if (this.a == 1 || var15 && this.k(var16, var8)) {
                     break;
                  }
               }
            }

            this.s(var1);
         }
      case 4:
      default:
         break;
      case 5:
         var6 = var1.getPointerId(var8);
         var3 = var1.getX(var8);
         var2 = var1.getY(var8);
         this.r(var3, var2, var6);
         var7 = this.a;
         if (var7 == 0) {
            var10000 = this.j[var6];
         } else if (var7 == 2) {
            var17 = this.a((int)var3, (int)var2);
            if (var17 == this.d) {
               this.k(var17, var6);
            }
         }
         break;
      case 6:
         this.n(var1.getPointerId(var8));
      }

      return this.a == 1;
   }

   final boolean k(View var1, int var2) {
      if (var1 == this.d && this.c == var2) {
         return true;
      } else if (var1 != null && this.s.e(var1, var2)) {
         this.c = var2;
         this.d(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   public final boolean l() {
      if (this.a == 2) {
         boolean var5 = this.r.computeScrollOffset();
         int var3 = this.r.getCurrX();
         int var4 = this.r.getCurrY();
         int var1 = var3 - this.d.getLeft();
         int var2 = var4 - this.d.getTop();
         int[] var6;
         View var7;
         if (var1 != 0) {
            var7 = this.d;
            var6 = cgm.a;
            var7.offsetLeftAndRight(var1);
         }

         if (var2 != 0) {
            var7 = this.d;
            var6 = cgm.a;
            var7.offsetTopAndBottom(var2);
         }

         if (var1 != 0 || var2 != 0) {
            this.s.i(this.d, var3, var4);
         }

         if (var5) {
            if (var3 != this.r.getFinalX() || var4 != this.r.getFinalY()) {
               return this.a == 2;
            }

            this.r.abortAnimation();
         }

         this.u.post(this.v);
      }

      return this.a == 2;
   }
}
