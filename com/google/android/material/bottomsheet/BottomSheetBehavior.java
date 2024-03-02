package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.camera.imax.cyclops.audio.CmJv.ytQQGGmniJK;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BottomSheetBehavior extends .caz implements .olp {
   public int A;
   public WeakReference B;
   public WeakReference C;
   public final ArrayList D = new ArrayList();
   public int E;
   public boolean F;
   final SparseIntArray G = new SparseIntArray();
   .olo H;
   private int I = 0;
   private float J;
   private boolean K;
   private int L;
   private int M;
   private ColorStateList N;
   private int O = -1;
   private boolean P;
   private boolean Q;
   private boolean R;
   private .onr S;
   private boolean T;
   private final .ojg U = new .ojg(this);
   private ValueAnimator V;
   private boolean W;
   private int X;
   private boolean Y;
   private final float Z = 0.1F;
   public boolean a = true;
   private int aa;
   private VelocityTracker ab;
   private int ac = -1;
   private Map ad;
   private final .cja ae = new .ojb(this);
   public int b;
   public int c;
   public .onm d;
   public int e = -1;
   public int f;
   public boolean g;
   public boolean h;
   public boolean i;
   public boolean j;
   public boolean k;
   public boolean l;
   public int m;
   public int n;
   int o;
   public int p;
   public int q;
   float r = 0.5F;
   public int s;
   float t = -1.0F;
   public boolean u;
   public boolean v;
   public boolean w = true;
   public int x = 4;
   public .cjb y;
   int z;

   public BottomSheetBehavior() {
   }

   public BottomSheetBehavior(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.M = var1.getResources().getDimensionPixelSize(2131166521);
      TypedArray var6 = var1.obtainStyledAttributes(var2, .ojl.a);
      int var4 = 3;
      if (var6.hasValue(3)) {
         this.N = .oik.p(var1, var6, 3);
      }

      if (var6.hasValue(21)) {
         this.S = .onr.a(var1, var2, 2130968792, 2132084229).a();
      }

      TypedValue var9;
      if (this.S != null) {
         .onm var7 = new .onm(this.S);
         this.d = var7;
         var7.h(var1);
         ColorStateList var8 = this.N;
         if (var8 != null) {
            this.d.j(var8);
         } else {
            var9 = new TypedValue();
            var1.getTheme().resolveAttribute(16842801, var9, true);
            this.d.setTint(var9.data);
         }
      }

      ValueAnimator var10 = ValueAnimator.ofFloat(new float[]{this.Y(), 1.0F});
      this.V = var10;
      var10.setDuration(500L);
      this.V.addUpdateListener(new .oiz(this, 0));
      this.t = var6.getDimension(2, -1.0F);
      if (var6.hasValue(0)) {
         this.O = var6.getDimensionPixelSize(0, -1);
      }

      if (var6.hasValue(1)) {
         this.e = var6.getDimensionPixelSize(1, -1);
      }

      var9 = var6.peekValue(9);
      if (var9 != null && var9.data == -1) {
         this.P(var9.data);
      } else {
         this.P(var6.getDimensionPixelSize(9, -1));
      }

      this.O(var6.getBoolean(8, false));
      this.P = var6.getBoolean(13, false);
      boolean var5 = var6.getBoolean(6, true);
      if (this.a != var5) {
         this.a = var5;
         if (this.B != null) {
            this.ac();
         }

         if (!this.a || this.x != 6) {
            var4 = this.x;
         }

         this.R(var4);
         this.ah(this.x, true);
         this.ag();
      }

      this.v = var6.getBoolean(12, false);
      this.w = var6.getBoolean(4, true);
      this.I = var6.getInt(10, 0);
      float var3 = var6.getFloat(7, 0.5F);
      if (!(var3 <= 0.0F) && !(var3 >= 1.0F)) {
         this.r = var3;
         if (this.B != null) {
            this.ad();
         }

         var9 = var6.peekValue(5);
         if (var9 != null && var9.type == 16) {
            this.N(var9.data);
         } else {
            this.N(var6.getDimensionPixelOffset(5, 0));
         }

         this.b = var6.getInt(11, 500);
         this.g = var6.getBoolean(17, false);
         this.h = var6.getBoolean(18, false);
         this.i = var6.getBoolean(19, false);
         this.Q = var6.getBoolean(20, true);
         this.j = var6.getBoolean(14, false);
         this.k = var6.getBoolean(15, false);
         this.l = var6.getBoolean(16, false);
         this.R = var6.getBoolean(23, true);
         var6.recycle();
         this.J = (float)ViewConfiguration.get(var1).getScaledMaximumFlingVelocity();
      } else {
         throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
      }
   }

   public static BottomSheetBehavior I(View var0) {
      LayoutParams var1 = var0.getLayoutParams();
      if (var1 instanceof .cbc) {
         .caz var2 = ((.cbc)var1).a;
         if (var2 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior)var2;
         } else {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
         }
      } else {
         throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
      }
   }

   private final float Y() {
      if (this.d != null) {
         WeakReference var2 = this.B;
         if (var2 != null && var2.get() != null) {
            View var4 = (View)this.B.get();
            if (this.aj()) {
               WindowInsets var5 = var4.getRootWindowInsets();
               if (var5 != null) {
                  float var1 = al(this.d.b(), var5.getRoundedCorner(0));
                  .onm var3 = this.d;
                  return Math.max(var1, al(var3.a.a.c.a(var3.g()), var5.getRoundedCorner(1)));
               }
            }
         }
      }

      return 0.0F;
   }

   private final int Z() {
      if (this.K) {
         return Math.min(Math.max(this.L, this.A - this.z * 9 / 16), this.aa) + this.m;
      } else {
         if (!this.P && !this.g) {
            int var1 = this.f;
            if (var1 > 0) {
               return Math.max(this.c, var1 + this.M);
            }
         }

         return this.c + this.m;
      }
   }

   private final int aa(int var1) {
      switch(var1) {
      case 3:
         return this.G();
      case 4:
         return this.s;
      case 5:
         return this.A;
      default:
         return this.q;
      }
   }

   private final .cic ab(int var1) {
      return new .ojc(this, var1);
   }

   private final void ac() {
      int var1 = this.Z();
      if (this.a) {
         this.s = Math.max(this.A - var1, this.p);
      } else {
         this.s = this.A - var1;
      }
   }

   private final void ad() {
      this.q = (int)((float)this.A * (1.0F - this.r));
   }

   private final void ae(View var1, .chr var2, int var3) {
      .cgm.i(var1, var2, this.ab(var3));
   }

   private final void af() {
      this.E = -1;
      this.ac = -1;
      VelocityTracker var1 = this.ab;
      if (var1 != null) {
         var1.recycle();
         this.ab = null;
      }

   }

   private final void ag() {
      WeakReference var8 = this.B;
      if (var8 != null) {
         View var11 = (View)var8.get();
         if (var11 != null) {
            .cgm.f(var11, 524288);
            .cgm.f(var11, 262144);
            .cgm.f(var11, 1048576);
            int var1 = this.G.get(0, -1);
            if (var1 != -1) {
               .cgm.f(var11, var1);
               this.G.delete(0);
            }

            boolean var7 = this.a;
            byte var2 = 6;
            if (!var7 && this.x != 6) {
               SparseIntArray var9 = this.G;
               String var10 = var11.getResources().getString(2132017289);
               .cic var15 = this.ab(6);
               List var12 = .cgm.d(var11);
               var1 = 0;

               label86:
               while(true) {
                  if (var1 >= var12.size()) {
                     var1 = -1;
                     int var3 = 0;

                     while(true) {
                        int[] var13 = .cgm.a;
                        int var4 = var13.length;
                        if (var3 >= 32 || var1 != -1) {
                           break label86;
                        }

                        int var6 = var13[var3];
                        var1 = 0;

                        boolean var14;
                        for(var14 = true; var1 < var12.size(); ++var1) {
                           boolean var5;
                           if (((.chr)var12.get(var1)).a() != var6) {
                              var5 = true;
                           } else {
                              var5 = false;
                           }

                           var14 &= var5;
                        }

                        var1 = var6;
                        if (!var14) {
                           var1 = -1;
                        }

                        ++var3;
                     }
                  }

                  if (TextUtils.equals(var10, ((.chr)var12.get(var1)).b())) {
                     var1 = ((.chr)var12.get(var1)).a();
                     break;
                  }

                  ++var1;
               }

               if (var1 != -1) {
                  .cgm.e(var11, new .chr((Object)null, var1, var10, var15, (Class)null));
               }

               var9.put(0, var1);
            }

            if (this.u && this.x != 5) {
               this.ae(var11, .chr.u, 5);
            }

            switch(this.x) {
            case 3:
               if (this.a) {
                  var2 = 4;
               }

               this.ae(var11, .chr.t, var2);
               return;
            case 4:
               if (this.a) {
                  var2 = 3;
               }

               this.ae(var11, .chr.s, var2);
               return;
            case 5:
            default:
               break;
            case 6:
               this.ae(var11, .chr.t, 4);
               this.ae(var11, .chr.s, 3);
               return;
            }
         }
      }

   }

   private final void ah(int var1, boolean var2) {
      if (var1 != 2) {
         boolean var4;
         label51: {
            if (this.x == 3) {
               if (this.R) {
                  var4 = true;
                  break label51;
               }

               if (this.aj()) {
                  var4 = true;
                  break label51;
               }
            }

            var4 = false;
         }

         if (this.T != var4 && this.d != null) {
            this.T = var4;
            float var3 = 1.0F;
            ValueAnimator var5;
            if (var2) {
               var5 = this.V;
               if (var5 != null) {
                  if (var5.isRunning()) {
                     this.V.reverse();
                     return;
                  }

                  if (var4) {
                     var3 = this.Y();
                  } else {
                     var3 = 1.0F;
                  }

                  this.V.setFloatValues(new float[]{1.0F - var3, var3});
                  this.V.start();
                  return;
               }
            }

            var5 = this.V;
            if (var5 != null && var5.isRunning()) {
               this.V.cancel();
            }

            .onm var6 = this.d;
            if (this.T) {
               var3 = this.Y();
            }

            var6.k(var3);
         }
      }
   }

   private final void ai(boolean var1) {
      WeakReference var4 = this.B;
      if (var4 != null) {
         ViewParent var6 = ((View)var4.get()).getParent();
         if (var6 instanceof CoordinatorLayout) {
            CoordinatorLayout var7 = (CoordinatorLayout)var6;
            int var3 = var7.getChildCount();
            int var2 = 0;
            if (var1) {
               if (this.ad != null) {
                  return;
               }

               this.ad = new HashMap(var3);
            }

            for(; var2 < var3; ++var2) {
               View var5 = var7.getChildAt(var2);
               if (var5 != this.B.get() && var1) {
                  this.ad.put(var5, var5.getImportantForAccessibility());
               }
            }

            if (!var1) {
               this.ad = null;
            }

         }
      }
   }

   private final boolean aj() {
      WeakReference var1 = this.B;
      if (var1 != null && var1.get() != null) {
         int[] var2 = new int[2];
         ((View)this.B.get()).getLocationOnScreen(var2);
         return var2[1] == 0;
      } else {
         return false;
      }
   }

   private final boolean ak() {
      .cjb var3 = this.y;
      boolean var2 = false;
      boolean var1 = var2;
      if (var3 != null) {
         if (!this.w) {
            if (this.x == 1) {
               return true;
            }

            var1 = var2;
         } else {
            var1 = true;
         }
      }

      return var1;
   }

   private static final float al(float var0, RoundedCorner var1) {
      if (var1 != null) {
         float var2 = (float)var1.getRadius();
         if (var2 > 0.0F && var0 > 0.0F) {
            return var2 / var0;
         }
      }

      return 0.0F;
   }

   private static final int am(int var0, int var1, int var2, int var3) {
      var1 = ViewGroup.getChildMeasureSpec(var0, var1, var3);
      if (var2 == -1) {
         return var1;
      } else {
         var0 = MeasureSpec.getMode(var1);
         var1 = MeasureSpec.getSize(var1);
         switch(var0) {
         case 1073741824:
            return MeasureSpec.makeMeasureSpec(Math.min(var1, var2), 1073741824);
         default:
            var0 = var2;
            if (var1 != 0) {
               var0 = Math.min(var1, var2);
            }

            return MeasureSpec.makeMeasureSpec(var0, Integer.MIN_VALUE);
         }
      }
   }

   public final int G() {
      int var1;
      if (this.a) {
         var1 = this.p;
      } else {
         int var2 = this.o;
         if (this.Q) {
            var1 = 0;
         } else {
            var1 = this.n;
         }

         var1 = Math.max(var2, var1);
      }

      return var1;
   }

   final View H(View var1) {
      if (var1.getVisibility() != 0) {
         return null;
      } else if (.cgd.y(var1)) {
         return var1;
      } else {
         if (var1 instanceof ViewGroup) {
            ViewGroup var4 = (ViewGroup)var1;
            int var3 = var4.getChildCount();

            for(int var2 = 0; var2 < var3; ++var2) {
               var1 = this.H(var4.getChildAt(var2));
               if (var1 != null) {
                  return var1;
               }
            }
         }

         return null;
      }
   }

   public final void J(.ojd var1) {
      if (!this.D.contains(var1)) {
         this.D.add(var1);
      }

   }

   public final void K() {
      .olo var1 = this.H;
      if (var1 != null) {
         if (var1.f != null) {
            var1.f = null;
            Animator var2 = var1.a();
            var2.setDuration((long)var1.e);
            var2.start();
         } else {
            throw new IllegalStateException(ytQQGGmniJK.tXgk);
         }
      }
   }

   public final void L(int var1) {
      View var5 = (View)this.B.get();
      if (var5 != null && !this.D.isEmpty()) {
         int var3 = this.s;
         float var2;
         int var4;
         if (var1 <= var3 && var3 != this.G()) {
            var3 = this.s;
            var4 = this.G();
            var2 = (float)(var3 - var1) / (float)(var3 - var4);
         } else {
            var4 = this.s;
            var3 = this.A;
            var2 = (float)(var4 - var1) / (float)(var3 - var4);
         }

         for(var1 = 0; var1 < this.D.size(); ++var1) {
            ((.ojd)this.D.get(var1)).a(var5, var2);
         }
      }

   }

   public final void M() {
      .olo var5 = this.H;
      if (var5 != null) {
         .ol var4 = var5.f;
         var5.f = null;
         byte var3 = 4;
         if (var4 != null) {
            if (this.u) {
               .oiy var7 = new .oiy(this);
               float var1 = (float)var5.b.getHeight();
               float var2 = var5.b.getScaleY();
               ObjectAnimator var8 = ObjectAnimator.ofFloat(var5.b, View.TRANSLATION_Y, new float[]{var1 * var2});
               var8.setInterpolator(new .clf());
               var8.setDuration((long).oia.b(var5.c, var5.d, var4.a));
               var8.addListener(new .olt(var5));
               var8.addListener(var7);
               var8.start();
            } else {
               Animator var6 = var5.a();
               var6.setDuration((long).oia.b(var5.c, var5.d, var4.a));
               var6.start();
               this.Q(4);
            }
         } else {
            if (this.u) {
               var3 = 5;
            }

            this.Q(var3);
         }
      }
   }

   public final void N(int var1) {
      if (var1 >= 0) {
         this.o = var1;
         this.ah(this.x, true);
      } else {
         throw new IllegalArgumentException("offset must be greater than or equal to 0");
      }
   }

   public final void O(boolean var1) {
      if (this.u != var1) {
         this.u = var1;
         if (!var1 && this.x == 5) {
            this.Q(4);
         }

         this.ag();
      }

   }

   public final void P(int var1) {
      if (var1 == -1) {
         if (this.K) {
            return;
         }

         this.K = true;
      } else {
         if (!this.K && this.c == var1) {
            return;
         }

         this.K = false;
         this.c = Math.max(0, var1);
      }

      this.X();
   }

   public final void Q(int var1) {
      if (!this.u && var1 == 5) {
         Log.w("BottomSheetBehavior", "Cannot set state: 5");
      } else {
         int var2;
         if (var1 == 6 && this.a && this.aa(6) <= this.p) {
            var2 = 3;
         } else {
            var2 = var1;
         }

         WeakReference var3 = this.B;
         if (var3 != null && var3.get() != null) {
            View var4 = (View)this.B.get();
            .on var6 = new .on(this, var4, var2, 19);
            ViewParent var5 = var4.getParent();
            if (var5 != null && var5.isLayoutRequested() && .cga.e(var4)) {
               var4.post(var6);
            } else {
               var6.run();
            }
         } else {
            this.R(var1);
         }
      }
   }

   public final void R(int var1) {
      if (this.x != var1) {
         this.x = var1;
         byte var4 = 4;
         int var2 = var1;
         if (var1 != 4) {
            var2 = var1;
            if (var1 != 3) {
               var2 = var1;
               if (var1 != 6) {
                  var2 = var1;
                  if (this.u) {
                     var2 = var1;
                     if (var1 == 5) {
                        var2 = 5;
                     }
                  }
               }
            }
         }

         WeakReference var5 = this.B;
         if (var5 != null) {
            View var6 = (View)var5.get();
            if (var6 != null) {
               byte var3 = 0;
               if (var2 == 3) {
                  this.ai(true);
                  var1 = var2;
               } else {
                  label60: {
                     if (var2 != 6 && var2 != 5) {
                        var1 = var2;
                        if (var2 != 4) {
                           break label60;
                        }

                        var1 = var4;
                     } else {
                        var1 = var2;
                     }

                     this.ai(false);
                  }
               }

               this.ah(var1, true);

               for(var2 = var3; var2 < this.D.size(); ++var2) {
                  ((.ojd)this.D.get(var2)).b(var6, var1);
               }

               this.ag();
            }
         }
      }
   }

   public final void S(.ol var1) {
      .olo var2 = this.H;
      if (var2 != null) {
         var2.f = var1;
      }
   }

   public final void T(View var1, int var2, boolean var3) {
      label22: {
         int var5 = this.aa(var2);
         .cjb var6 = this.y;
         if (var6 != null) {
            if (var3) {
               if (var6.i(var1.getLeft(), var5)) {
                  break label22;
               }
            } else {
               int var4 = var1.getLeft();
               var6.d = var1;
               var6.c = -1;
               if (var6.g(var4, var5, 0, 0)) {
                  break label22;
               }

               if (var6.a == 0 && var6.d != null) {
                  var6.d = null;
               }
            }
         }

         this.R(var2);
         return;
      }

      this.R(2);
      this.ah(var2, true);
      this.U.a(var2);
   }

   public final void U(.ol var1) {
      .olo var2 = this.H;
      if (var2 != null) {
         if (var2.f != null) {
            var2.f = var1;
            var2.b(var1.a);
         } else {
            throw new IllegalStateException("Must call startBackProgress() before updateBackProgress()");
         }
      }
   }

   public final boolean V() {
      return this.u;
   }

   public final boolean W(View var1, float var2) {
      if (this.v) {
         return true;
      } else if (var1.getTop() < this.s) {
         return false;
      } else {
         int var7 = this.Z();
         float var3 = (float)var1.getTop();
         float var6 = this.Z;
         float var5 = (float)this.s;
         float var4 = (float)var7;
         return Math.abs(var3 + var2 * var6 - var5) / var4 > 0.5F;
      }
   }

   public final void X() {
      if (this.B != null) {
         this.ac();
         if (this.x == 4) {
            View var1 = (View)this.B.get();
            if (var1 != null) {
               var1.requestLayout();
            }
         }
      }

   }

   public final void a(.cbc var1) {
      this.B = null;
      this.y = null;
      this.H = null;
   }

   public final void b() {
      this.B = null;
      this.y = null;
      this.H = null;
   }

   public final void c(CoordinatorLayout var1, View var2, View var3, int var4) {
      int var6 = var2.getTop();
      int var7 = this.G();
      byte var10 = 3;
      if (var6 == var7) {
         this.R(3);
      } else {
         WeakReference var8 = this.C;
         if (var8 != null && var3 == var8.get() && this.Y) {
            if (this.X > 0) {
               if (!this.a && var2.getTop() > this.q) {
                  var10 = 6;
               }
            } else {
               label68: {
                  if (this.u) {
                     VelocityTracker var9 = this.ab;
                     float var5;
                     if (var9 == null) {
                        var5 = 0.0F;
                     } else {
                        var9.computeCurrentVelocity(1000, this.J);
                        var5 = this.ab.getYVelocity(this.E);
                     }

                     if (this.W(var2, var5)) {
                        var10 = 5;
                        break label68;
                     }
                  }

                  if (this.X == 0) {
                     var7 = var2.getTop();
                     if (this.a) {
                        if (Math.abs(var7 - this.p) >= Math.abs(var7 - this.s)) {
                           var10 = 4;
                        }
                        break label68;
                     }

                     var6 = this.q;
                     if (var7 < var6) {
                        if (var7 >= Math.abs(var7 - this.s)) {
                           var10 = 6;
                        }
                        break label68;
                     }

                     if (Math.abs(var7 - var6) < Math.abs(var7 - this.s)) {
                        var10 = 6;
                        break label68;
                     }
                  } else if (!this.a) {
                     var4 = var2.getTop();
                     if (Math.abs(var4 - this.q) < Math.abs(var4 - this.s)) {
                        var10 = 6;
                     } else {
                        var10 = 4;
                     }
                     break label68;
                  }

                  var10 = 4;
               }
            }

            this.T(var2, var10, false);
            this.Y = false;
         }
      }
   }

   public final boolean d(CoordinatorLayout var1, View var2, MotionEvent var3) {
      if (var2.isShown() && this.w) {
         int var6 = var3.getActionMasked();
         int var5 = var6;
         if (var6 == 0) {
            this.af();
            var5 = 0;
         }

         if (this.ab == null) {
            this.ab = VelocityTracker.obtain();
         }

         this.ab.addMovement(var3);
         Object var9 = null;
         switch(var5) {
         case 0:
            var6 = (int)var3.getX();
            this.ac = (int)var3.getY();
            if (this.x != 2) {
               WeakReference var8 = this.C;
               View var12;
               if (var8 != null) {
                  var12 = (View)var8.get();
               } else {
                  var12 = null;
               }

               if (var12 != null && var1.k(var12, var6, this.ac)) {
                  this.E = var3.getPointerId(var3.getActionIndex());
                  this.F = true;
               }
            }

            boolean var7;
            if (this.E == -1 && !var1.k(var2, var6, this.ac)) {
               var7 = true;
            } else {
               var7 = false;
            }

            this.W = var7;
            break;
         case 1:
         case 3:
            this.F = false;
            this.E = -1;
            if (this.W) {
               this.W = false;
               return false;
            }
         case 2:
         }

         if (!this.W) {
            .cjb var10 = this.y;
            if (var10 != null && var10.j(var3)) {
               return true;
            }
         }

         WeakReference var11 = this.C;
         if (var11 != null) {
            var2 = (View)var11.get();
         } else {
            var2 = (View)var9;
         }

         if (var5 == 2 && var2 != null && !this.W && this.x != 1 && !var1.k(var2, (int)var3.getX(), (int)var3.getY()) && this.y != null) {
            var5 = this.ac;
            if (var5 != -1) {
               float var4 = var3.getY();
               if (Math.abs((float)var5 - var4) > (float)this.y.b) {
                  return true;
               }
            }
         }

         return false;
      } else {
         this.W = true;
         return false;
      }
   }

   public final boolean e(CoordinatorLayout var1, View var2, int var3) {
      if (.cfx.p(var1) && !.cfx.p(var2)) {
         var2.setFitsSystemWindows(true);
      }

      WeakReference var13 = this.B;
      byte var6 = 0;
      if (var13 == null) {
         this.L = var1.getResources().getDimensionPixelSize(2131165450);
         boolean var11;
         if (!this.P && !this.K) {
            var11 = true;
         } else {
            var11 = false;
         }

         label104: {
            boolean var12 = var11;
            if (!this.g) {
               var12 = var11;
               if (!this.h) {
                  var12 = var11;
                  if (!this.i) {
                     var12 = var11;
                     if (!this.j) {
                        var12 = var11;
                        if (!this.k) {
                           var12 = var11;
                           if (!this.l) {
                              if (!var11) {
                                 break label104;
                              }

                              var12 = true;
                           }
                        }
                     }
                  }
               }
            }

            .cgd.n(var2, new .olk(new .oja(this, var12), new .olm(.cfy.e(var2), var2.getPaddingTop(), .cfy.d(var2), var2.getPaddingBottom())));
            if (.cga.e(var2)) {
               .cgb.c(var2);
            } else {
               var2.addOnAttachStateChangeListener(new .oll());
            }
         }

         var2.setWindowInsetsAnimationCallback(new .chc(new .chb(var2)));
         this.B = new WeakReference(var2);
         this.H = new .olo(var2);
         .onm var14 = this.d;
         if (var14 != null) {
            .cfx.m(var2, var14);
            var14 = this.d;
            float var5 = this.t;
            float var4 = var5;
            if (var5 == -1.0F) {
               var4 = .cgd.a(var2);
            }

            var14.i(var4);
         } else {
            ColorStateList var15 = this.N;
            if (var15 != null) {
               .cgd.j(var2, var15);
            }
         }

         this.ag();
         if (.cfx.a(var2) == 0) {
            .cfx.o(var2, 1);
         }
      }

      if (this.y == null) {
         this.y = .cjb.b(var1, this.ae);
      }

      int var9 = var2.getTop();
      var1.j(var2, var3);
      this.z = var1.getWidth();
      this.A = var1.getHeight();
      int var8 = var2.getHeight();
      this.aa = var8;
      int var7 = this.A;
      int var10 = this.n;
      var3 = var8;
      if (var7 - var8 < var10) {
         if (this.Q) {
            var3 = this.e;
            if (var3 == -1) {
               var3 = var7;
            } else {
               var3 = Math.min(var7, var3);
            }

            this.aa = var3;
         } else {
            var3 = var7 - var10;
            var7 = this.e;
            if (var7 != -1) {
               var3 = Math.min(var3, var7);
            }

            this.aa = var3;
         }
      }

      this.p = Math.max(0, this.A - var3);
      this.ad();
      this.ac();
      var3 = this.x;
      if (var3 == 3) {
         var2.offsetTopAndBottom(this.G());
      } else if (var3 == 6) {
         var2.offsetTopAndBottom(this.q);
      } else if (this.u && var3 == 5) {
         var2.offsetTopAndBottom(this.A);
      } else if (var3 == 4) {
         var2.offsetTopAndBottom(this.s);
      } else if (var3 == 1 || var3 == 2) {
         var2.offsetTopAndBottom(var9 - var2.getTop());
      }

      this.ah(this.x, false);
      this.C = new WeakReference(this.H(var2));

      for(var3 = var6; var3 < this.D.size(); ++var3) {
         ((.ojd)this.D.get(var3)).c(var2);
      }

      return true;
   }

   public final boolean g(CoordinatorLayout var1, View var2, MotionEvent var3) {
      if (!var2.isShown()) {
         return false;
      } else {
         int var5 = var3.getActionMasked();
         if (this.x == 1 && var5 == 0) {
            return true;
         } else {
            if (this.ak()) {
               this.y.e(var3);
            }

            if (var5 == 0) {
               this.af();
            }

            if (this.ab == null) {
               this.ab = VelocityTracker.obtain();
            }

            this.ab.addMovement(var3);
            if (this.ak() && var5 == 2 && !this.W) {
               float var4 = Math.abs((float)this.ac - var3.getY());
               .cjb var6 = this.y;
               if (var4 > (float)var6.b) {
                  var6.d(var2, var3.getPointerId(var3.getActionIndex()));
               }
            }

            return !this.W;
         }
      }
   }

   public final boolean k(CoordinatorLayout var1, View var2, int var3, int var4, int var5) {
      MarginLayoutParams var6 = (MarginLayoutParams)var2.getLayoutParams();
      var2.measure(am(var3, var1.getPaddingLeft() + var1.getPaddingRight() + var6.leftMargin + var6.rightMargin + var4, this.O, var6.width), am(var5, var1.getPaddingTop() + var1.getPaddingBottom() + var6.topMargin + var6.bottomMargin, this.e, var6.height));
      return true;
   }

   public final boolean l(View var1) {
      WeakReference var4 = this.C;
      boolean var3 = false;
      boolean var2 = var3;
      if (var4 != null) {
         var2 = var3;
         if (var1 == var4.get()) {
            var2 = var3;
            if (this.x != 3) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public final void m(CoordinatorLayout var1, View var2, View var3, int var4, int[] var5, int var6) {
      if (var6 != 1) {
         WeakReference var9 = this.C;
         View var10;
         if (var9 != null) {
            var10 = (View)var9.get();
         } else {
            var10 = null;
         }

         if (var3 == var10) {
            int var7 = var2.getTop();
            int var8 = var7 - var4;
            int[] var11;
            if (var4 > 0) {
               if (var8 < this.G()) {
                  var6 = var7 - this.G();
                  var5[1] = var6;
                  var11 = .cgm.a;
                  var2.offsetTopAndBottom(-var6);
                  this.R(3);
               } else {
                  if (!this.w) {
                     return;
                  }

                  var5[1] = var4;
                  var6 = -var4;
                  var11 = .cgm.a;
                  var2.offsetTopAndBottom(var6);
                  this.R(1);
               }
            } else if (var4 < 0 && !var3.canScrollVertically(-1)) {
               var6 = this.s;
               if (var8 > var6 && !this.V()) {
                  var6 = var7 - var6;
                  var5[1] = var6;
                  var11 = .cgm.a;
                  var2.offsetTopAndBottom(-var6);
                  this.R(4);
               } else {
                  if (!this.w) {
                     return;
                  }

                  var5[1] = var4;
                  var6 = -var4;
                  var11 = .cgm.a;
                  var2.offsetTopAndBottom(var6);
                  this.R(1);
               }
            }

            this.L(var2.getTop());
            this.X = var4;
            this.Y = true;
         }
      }
   }

   public final void n(CoordinatorLayout var1, View var2, int var3, int var4, int var5, int[] var6) {
   }

   public final void o(View var1, Parcelable var2) {
      .ojf var4 = (.ojf)var2;
      int var3 = this.I;
      if (var3 != 0) {
         if (var3 == -1 || (var3 & 1) == 1) {
            this.c = var4.b;
         }

         if (var3 == -1 || (var3 & 2) == 2) {
            this.a = var4.e;
         }

         if (var3 == -1 || (var3 & 4) == 4) {
            this.u = var4.f;
         }

         if (var3 == -1 || (var3 & 8) == 8) {
            this.v = var4.g;
         }
      }

      var3 = var4.a;
      if (var3 != 1 && var3 != 2) {
         this.x = var3;
      } else {
         this.x = 4;
      }
   }

   public final Parcelable p(View var1) {
      return new .ojf(BaseSavedState.EMPTY_STATE, this);
   }

   public final boolean q(CoordinatorLayout var1, View var2, View var3, int var4, int var5) {
      boolean var6 = false;
      this.X = 0;
      this.Y = false;
      if ((var4 & 2) != 0) {
         var6 = true;
      }

      return var6;
   }
}
