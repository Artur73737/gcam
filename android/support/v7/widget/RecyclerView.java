package android.support.v7.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.constraint.Pv.bmSypa;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.wear.ambient.AmbientMode$AmbientController;
import com.google.android.apps.camera.facedeblur.deeprestore.jni.lt.SFjQQF;
import com.google.android.material.snackbar.Lqt.HUJCIBIkzRDQ;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecyclerView extends ViewGroup implements .cfn {
   public static final int W = 0;
   public static final boolean a = true;
   private static final int[] aa = new int[]{16843830};
   private static final float ab = (float)(Math.log(0.78D) / Math.log(0.9D));
   private static final Class[] ac;
   public static final boolean b = true;
   public static final boolean c = true;
   public static final Interpolator d;
   static final .ml e;
   boolean A;
   public EdgeEffect B;
   public EdgeEffect C;
   public EdgeEffect D;
   public EdgeEffect E;
   public .lu F;
   public int G;
   public .lz H;
   public final int I;
   public final .mm J;
   public .kq K;
   public .ko L;
   public final .mk M;
   public boolean N;
   public boolean O;
   public boolean P;
   public .mp Q;
   public final int[] R;
   final List S;
   boolean T;
   public .mcq U;
   public final .blj V;
   private final int[] aA;
   private final int[] aB;
   private Runnable aC;
   private boolean aD;
   private int aE;
   private int aF;
   private .er aG;
   private AmbientMode$AmbientController aH;
   private final AmbientMode$AmbientController aI;
   private final float ad;
   private final .me ae;
   private final Rect af;
   private int ag;
   private boolean ah;
   private int ai;
   private final AccessibilityManager aj;
   private int ak;
   private int al;
   private int am;
   private int an;
   private VelocityTracker ao;
   private int ap;
   private int aq;
   private int ar;
   private int as;
   private final int at;
   private float au;
   private float av;
   private boolean aw;
   private List ax;
   private final int[] ay;
   private .cfo az;
   public final .mc f;
   .mg g;
   public .ju h;
   boolean i;
   public final Runnable j;
   public final Rect k;
   public final RectF l;
   public .lq m;
   public .lx n;
   public final List o;
   public final ArrayList p;
   public final ArrayList q;
   public .ma r;
   public boolean s;
   public boolean t;
   public boolean u;
   public boolean v;
   public boolean w;
   public boolean x;
   public List y;
   public boolean z;

   static {
      ac = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
      d = new .ciz(1);
      e = new .ml();
   }

   public RecyclerView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public RecyclerView(Context var1, AttributeSet var2) {
      this(var1, var2, 2130969975);
   }

   public RecyclerView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.ae = new .me(this);
      this.f = new .mc(this);
      this.V = new .blj((char[])null, (byte[])null);
      this.j = new .bl(this, 18, (byte[])null);
      this.k = new Rect();
      this.af = new Rect();
      this.l = new RectF();
      this.o = new ArrayList();
      this.p = new ArrayList();
      this.q = new ArrayList();
      this.ag = 0;
      this.z = false;
      this.A = false;
      this.ak = 0;
      this.al = 0;
      this.aG = e;
      this.F = new .kc();
      this.am = 0;
      this.an = -1;
      this.au = Float.MIN_VALUE;
      this.av = Float.MIN_VALUE;
      this.aw = true;
      this.J = new .mm(this);
      .ko var5;
      if (c) {
         var5 = new .ko();
      } else {
         var5 = null;
      }

      this.L = var5;
      this.M = new .mk();
      this.N = false;
      this.O = false;
      this.aH = new AmbientMode$AmbientController(this);
      this.P = false;
      this.ay = new int[2];
      this.aA = new int[2];
      this.aB = new int[2];
      this.R = new int[2];
      this.S = new ArrayList();
      this.aC = new .bl(this, 19, (byte[])null);
      this.aE = 0;
      this.aF = 0;
      this.aI = new AmbientMode$AmbientController(this);
      this.setScrollContainer(true);
      this.setFocusableInTouchMode(true);
      ViewConfiguration var12 = ViewConfiguration.get(var1);
      this.G = var12.getScaledTouchSlop();
      this.au = .cgn.a(var12);
      this.av = .cgn.b(var12);
      this.I = var12.getScaledMinimumFlingVelocity();
      this.at = var12.getScaledMaximumFlingVelocity();
      this.ad = var1.getResources().getDisplayMetrics().density * 160.0F * 386.0878F * 0.84F;
      boolean var4;
      if (this.getOverScrollMode() == 2) {
         var4 = true;
      } else {
         var4 = false;
      }

      this.setWillNotDraw(var4);
      this.F.l = this.aH;
      this.U = new .mcq(new AmbientMode$AmbientController(this));
      this.h = new .ju(new AmbientMode$AmbientController(this));
      if (.cgg.a(this) == 0) {
         .cgg.h(this, 8);
      }

      if (.cfx.a(this) == 0) {
         .cfx.o(this, 1);
      }

      this.aj = (AccessibilityManager)this.getContext().getSystemService("accessibility");
      this.aa(new .mp(this));
      TypedArray var10 = var1.obtainStyledAttributes(var2, .ft.a, var3, 0);
      .cgj.d(this, var1, .ft.a, var2, var10, var3, 0);
      String var8 = var10.getString(8);
      if (var10.getInt(2, -1) == -1) {
         this.setDescendantFocusability(262144);
      }

      this.i = var10.getBoolean(1, true);
      if (var10.getBoolean(3, false)) {
         StateListDrawable var13 = (StateListDrawable)var10.getDrawable(6);
         Drawable var11 = var10.getDrawable(7);
         StateListDrawable var9 = (StateListDrawable)var10.getDrawable(4);
         Drawable var7 = var10.getDrawable(5);
         if (var13 == null || var11 == null || var9 == null || var7 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(this.k()));
         }

         Resources var6 = this.getContext().getResources();
         new .km(this, var13, var11, var9, var7, var6.getDimensionPixelSize(2131165536), var6.getDimensionPixelSize(2131165538), var6.getDimensionPixelOffset(2131165537));
      }

      var10.recycle();
      this.T = var1.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
      this.aR(var1, var8, var2, var3);
      int[] var14 = aa;
      TypedArray var15 = var1.obtainStyledAttributes(var2, var14, var3, 0);
      .cgj.d(this, var1, var14, var2, var15, var3, 0);
      var4 = var15.getBoolean(0, true);
      var15.recycle();
      this.setNestedScrollingEnabled(var4);
      this.setTag(2131427790, true);
   }

   public static void H(View var0, Rect var1) {
      .ly var2 = (.ly)var0.getLayoutParams();
      Rect var3 = var2.d;
      var1.set(var0.getLeft() - var3.left - var2.leftMargin, var0.getTop() - var3.top - var2.topMargin, var0.getRight() + var3.right + var2.rightMargin, var0.getBottom() + var3.bottom + var2.bottomMargin);
   }

   private final int a(int var1, float var2) {
      float var3 = (float)this.getHeight();
      float var4 = (float)this.getWidth();
      float var5 = (float)var1 / var4;
      float var6 = var2 / var3;
      EdgeEffect var7 = this.B;
      var2 = 0.0F;
      var3 = 0.0F;
      var4 = 0.0F;
      if (var7 != null && .cik.a(var7) != 0.0F) {
         if (this.canScrollHorizontally(-1)) {
            this.B.onRelease();
            var2 = var4;
         } else {
            var2 = -.cik.b(this.B, -var5, 1.0F - var6);
            if (.cik.a(this.B) == 0.0F) {
               this.B.onRelease();
            }
         }

         this.invalidate();
      } else {
         var7 = this.D;
         if (var7 != null && .cik.a(var7) != 0.0F) {
            if (this.canScrollHorizontally(1)) {
               this.D.onRelease();
            } else {
               var2 = .cik.b(this.D, var5, var6);
               if (.cik.a(this.D) == 0.0F) {
                  this.D.onRelease();
               }
            }

            this.invalidate();
         } else {
            var2 = var3;
         }
      }

      return Math.round(var2 * (float)this.getWidth());
   }

   private final int aB(int var1, float var2) {
      float var3 = (float)this.getWidth();
      float var4 = (float)this.getHeight();
      float var5 = (float)var1 / var4;
      float var6 = var2 / var3;
      EdgeEffect var7 = this.C;
      var4 = 0.0F;
      var2 = 0.0F;
      var3 = 0.0F;
      if (var7 != null && .cik.a(var7) != 0.0F) {
         if (this.canScrollVertically(-1)) {
            this.C.onRelease();
            var2 = var3;
         } else {
            var2 = -.cik.b(this.C, -var5, var6);
            if (.cik.a(this.C) == 0.0F) {
               this.C.onRelease();
            }
         }

         this.invalidate();
      } else {
         var7 = this.E;
         if (var7 != null && .cik.a(var7) != 0.0F) {
            if (this.canScrollVertically(1)) {
               this.E.onRelease();
               var2 = var4;
            } else {
               var2 = .cik.b(this.E, var5, 1.0F - var6);
               if (.cik.a(this.E) == 0.0F) {
                  this.E.onRelease();
               }
            }

            this.invalidate();
         }
      }

      return Math.round(var2 * (float)this.getHeight());
   }

   private final .cfo aC() {
      if (this.az == null) {
         this.az = new .cfo(this);
      }

      return this.az;
   }

   private final void aD() {
      this.aM();
      this.ae(0);
   }

   private final void aE() {
      .mk var7 = this.M;
      boolean var3 = true;
      var7.b(1);
      this.G(this.M);
      this.M.i = false;
      this.ag();
      this.V.q();
      this.P();
      this.aI();
      boolean var4 = this.aw;
      .mk var8 = null;
      View var11;
      if (var4 && this.hasFocus() && this.m != null) {
         var11 = this.getFocusedChild();
      } else {
         var11 = null;
      }

      .mn var12;
      if (var11 == null) {
         var12 = var8;
      } else {
         var11 = this.j(var11);
         if (var11 == null) {
            var12 = var8;
         } else {
            var12 = this.g(var11);
         }
      }

      int var1;
      long var5;
      if (var12 == null) {
         this.aL();
      } else {
         var8 = this.M;
         if (this.m.b) {
            var5 = var12.e;
         } else {
            var5 = -1L;
         }

         var8.m = var5;
         if (this.z) {
            var1 = -1;
         } else if (var12.u()) {
            var1 = var12.d;
         } else {
            var1 = var12.a();
         }

         var8.l = var1;
         .mk var9 = this.M;
         var11 = var12.a;
         var1 = var11.getId();

         while(!var11.isFocused() && var11 instanceof ViewGroup && var11.hasFocus()) {
            View var13 = ((ViewGroup)var11).getFocusedChild();
            var11 = var13;
            if (var13.getId() != -1) {
               var1 = var13.getId();
               var11 = var13;
            }
         }

         var9.n = var1;
      }

      var7 = this.M;
      if (!var7.j || !this.O) {
         var3 = false;
      }

      var7.h = var3;
      this.O = false;
      this.N = false;
      var7.g = var7.k;
      var7.e = this.m.a();
      this.aG(this.ay);
      int var2;
      .lt var14;
      if (this.M.j) {
         var2 = this.h.a();

         for(var1 = 0; var1 < var2; ++var1) {
            var12 = h(this.h.e(var1));
            if (!var12.z() && (!var12.s() || this.m.b)) {
               .lu.s(var12);
               var12.c();
               var14 = .lu.t(var12);
               this.V.p(var12, var14);
               if (this.M.h && var12.x() && !var12.u() && !var12.z() && !var12.s()) {
                  var5 = this.d(var12);
                  this.V.n(var5, var12);
               }
            }
         }
      }

      if (this.M.k) {
         var2 = this.h.c();

         for(var1 = 0; var1 < var2; ++var1) {
            var12 = h(this.h.f(var1));
            if (!var12.z() && var12.d == -1) {
               var12.d = var12.c;
            }
         }

         var7 = this.M;
         var3 = var7.f;
         var7.f = false;
         this.n.o(this.f, var7);
         this.M.f = var3;

         for(var1 = 0; var1 < this.h.a(); ++var1) {
            .mn var15 = h(this.h.e(var1));
            if (!var15.z()) {
               .nu var16 = (.nu)((.xo)this.V.b).get(var15);
               if (var16 == null || (var16.b & 4) == 0) {
                  .lu.s(var15);
                  var3 = var15.p(8192);
                  var15.c();
                  var14 = .lu.t(var15);
                  if (var3) {
                     this.W(var15, var14);
                  } else {
                     .blj var10 = this.V;
                     var16 = (.nu)((.xo)var10.b).get(var15);
                     if (var16 == null) {
                        var16 = .nu.a();
                        ((.xo)var10.b).put(var15, var16);
                     }

                     var16.b |= 2;
                     var16.c = var14;
                  }
               }
            }
         }

         this.u();
      } else {
         this.u();
      }

      this.Q();
      this.ah(false);
      this.M.d = 2;
   }

   private final void aF() {
      this.ag();
      this.P();
      this.M.b(6);
      this.U.i();
      this.M.e = this.m.a();
      this.M.c = 0;
      .mg var3 = this.g;
      if (var3 != null) {
         int var1 = this.m.c;
         Parcelable var4 = var3.a;
         if (var4 != null) {
            this.n.S(var4);
         }

         this.g = null;
      }

      .mk var5 = this.M;
      var5.g = false;
      this.n.o(this.f, var5);
      var5 = this.M;
      var5.f = false;
      boolean var2;
      if (var5.j && this.F != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      var5.j = var2;
      var5.d = 4;
      this.Q();
      this.ah(false);
   }

   private final void aG(int[] var1) {
      int var9 = this.h.a();
      if (var9 != 0) {
         int var6 = Integer.MIN_VALUE;
         int var2 = Integer.MAX_VALUE;

         int var5;
         for(int var4 = 0; var4 < var9; var2 = var5) {
            .mn var10 = h(this.h.e(var4));
            int var8 = var6;
            var5 = var2;
            if (!var10.z()) {
               int var7 = var10.b();
               int var3 = var2;
               if (var7 < var2) {
                  var3 = var7;
               }

               var8 = var6;
               var5 = var3;
               if (var7 > var6) {
                  var5 = var3;
                  var8 = var7;
               }
            }

            ++var4;
            var6 = var8;
         }

         var1[0] = var2;
         var1[1] = var6;
      } else {
         var1[0] = -1;
         var1[1] = -1;
      }
   }

   private final void aH(MotionEvent var1) {
      int var2 = var1.getActionIndex();
      if (var1.getPointerId(var2) == this.an) {
         byte var4;
         if (var2 == 0) {
            var4 = 1;
         } else {
            var4 = 0;
         }

         this.an = var1.getPointerId(var4);
         int var3 = (int)(var1.getX(var4) + 0.5F);
         this.ar = var3;
         this.ap = var3;
         var2 = (int)(var1.getY(var4) + 0.5F);
         this.as = var2;
         this.aq = var2;
      }

   }

   private final void aI() {
      if (this.z) {
         this.U.n();
         if (this.A) {
            this.n.x();
         }
      }

      if (this.aP()) {
         this.U.k();
      } else {
         this.U.i();
      }

      boolean var2 = this.N;
      boolean var3 = true;
      boolean var1;
      if (!var2) {
         if (this.O) {
            var1 = true;
         } else {
            var1 = false;
         }
      } else {
         var1 = true;
      }

      .mk var4;
      label55: {
         var4 = this.M;
         if (this.u && this.F != null) {
            var2 = this.z;
            if (var2 || var1 || this.n.u) {
               if (!var2) {
                  var2 = true;
                  break label55;
               }

               if (this.m.b) {
                  var2 = true;
                  break label55;
               }
            }
         }

         var2 = false;
      }

      var4.j = var2;
      if (var2 && var1 && !this.z && this.aP()) {
         var2 = var3;
      } else {
         var2 = false;
      }

      var4.k = var2;
   }

   private final void aJ() {
      EdgeEffect var3 = this.B;
      boolean var2;
      if (var3 != null) {
         var3.onRelease();
         var2 = this.B.isFinished();
      } else {
         var2 = false;
      }

      var3 = this.C;
      boolean var1 = var2;
      if (var3 != null) {
         var3.onRelease();
         var1 = var2 | this.C.isFinished();
      }

      var3 = this.D;
      var2 = var1;
      if (var3 != null) {
         var3.onRelease();
         var2 = var1 | this.D.isFinished();
      }

      var3 = this.E;
      var1 = var2;
      if (var3 != null) {
         var3.onRelease();
         var1 = var2 | this.E.isFinished();
      }

      if (var1) {
         .cfx.g(this);
      }

   }

   private final void aK(View var1, View var2) {
      View var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = var1;
      }

      this.k.set(0, 0, var5.getWidth(), var5.getHeight());
      LayoutParams var7 = var5.getLayoutParams();
      Rect var9;
      if (var7 instanceof .ly) {
         .ly var8 = (.ly)var7;
         if (!var8.e) {
            var9 = var8.d;
            Rect var6 = this.k;
            var6.left -= var9.left;
            var6 = this.k;
            var6.right += var9.right;
            var6 = this.k;
            var6.top -= var9.top;
            var6 = this.k;
            var6.bottom += var9.bottom;
         }
      }

      if (var2 != null) {
         this.offsetDescendantRectToMyCoords(var2, this.k);
         this.offsetRectIntoDescendantCoords(var1, this.k);
      } else {
         var2 = null;
      }

      .lx var10 = this.n;
      var9 = this.k;
      boolean var4 = this.u;
      boolean var3;
      if (var2 == null) {
         var3 = true;
      } else {
         var3 = false;
      }

      var10.bb(this, var1, var9, var4 ^ true, var3);
   }

   private final void aL() {
      .mk var1 = this.M;
      var1.m = -1L;
      var1.l = -1;
      var1.n = -1;
   }

   private final void aM() {
      VelocityTracker var1 = this.ao;
      if (var1 != null) {
         var1.clear();
      }

      this.ai(0);
      this.aJ();
   }

   private final void aN() {
      this.J.d();
      .lx var1 = this.n;
      if (var1 != null) {
         .mj var2 = var1.t;
         if (var2 != null) {
            var2.f();
         }
      }

   }

   private final boolean aO(MotionEvent var1) {
      int var3 = var1.getAction();
      int var4 = this.q.size();

      for(int var2 = 0; var2 < var4; ++var2) {
         .ma var5 = (.ma)this.q.get(var2);
         if (var5.t(var1) && var3 != 3) {
            this.r = var5;
            return true;
         }
      }

      return false;
   }

   private final boolean aP() {
      return this.F != null && this.n.u();
   }

   private final boolean aQ(EdgeEffect var1, int var2, int var3) {
      if (var2 > 0) {
         return true;
      } else {
         float var11 = .cik.a(var1);
         float var12 = (float)var3;
         double var4 = Math.log((double)((float)Math.abs(-var2) * 0.35F / (this.ad * 0.015F)));
         double var6 = (double)ab;
         float var10 = this.ad;
         Double.isNaN(var6);
         Double.isNaN(var6);
         double var8 = var6 / (-1.0D + var6);
         var6 = (double)(var10 * 0.015F);
         var4 = Math.exp(var8 * var4);
         Double.isNaN(var6);
         return (float)(var6 * var4) < var11 * var12;
      }
   }

   private final void aR(Context param1, String param2, AttributeSet param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static boolean ak(RecyclerView var0) {
      return var0.awakenScrollBars();
   }

   public static final int ar(int var0, EdgeEffect var1, EdgeEffect var2, int var3) {
      float var4;
      float var5;
      if (var0 > 0 && var1 != null && .cik.a(var1) != 0.0F) {
         var4 = (float)(-var0);
         var5 = (float)var3;
         var3 = Math.round((float)(-var3) / 4.0F * .cik.b(var1, var4 * 4.0F / var5, 0.5F));
         if (var3 != var0) {
            var1.finish();
         }

         return var0 - var3;
      } else {
         int var6 = var0;
         if (var0 < 0) {
            var6 = var0;
            if (var2 != null) {
               var6 = var0;
               if (.cik.a(var2) != 0.0F) {
                  var5 = (float)var0;
                  var4 = (float)var3;
                  var3 = Math.round(var4 / 4.0F * .cik.b(var2, var5 * 4.0F / var4, 0.5F));
                  if (var3 != var0) {
                     var2.finish();
                  }

                  var6 = var0 - var3;
               }
            }
         }

         return var6;
      }
   }

   public static final long as() {
      return c ? System.nanoTime() : 0L;
   }

   public static .mn h(View var0) {
      return var0 == null ? null : ((.ly)var0.getLayoutParams()).c;
   }

   public static RecyclerView i(View var0) {
      if (!(var0 instanceof ViewGroup)) {
         return null;
      } else if (var0 instanceof RecyclerView) {
         return (RecyclerView)var0;
      } else {
         ViewGroup var3 = (ViewGroup)var0;
         int var2 = var3.getChildCount();

         for(int var1 = 0; var1 < var2; ++var1) {
            RecyclerView var4 = i(var3.getChildAt(var1));
            if (var4 != null) {
               return var4;
            }
         }

         return null;
      }
   }

   // $FF: synthetic method
   public static void l(RecyclerView var0, View var1, int var2, LayoutParams var3) {
      var0.attachViewToParent(var1, var2, var3);
   }

   // $FF: synthetic method
   public static void m(RecyclerView var0, int var1) {
      var0.detachViewFromParent(var1);
   }

   // $FF: synthetic method
   public static void n(RecyclerView var0, View var1, int var2, LayoutParams var3) {
      var0.attachViewToParent(var1, var2, var3);
   }

   // $FF: synthetic method
   public static void o(RecyclerView var0, View var1) {
      var0.detachViewFromParent(var1);
   }

   // $FF: synthetic method
   public static void p(RecyclerView var0, int var1, int var2) {
      var0.setMeasuredDimension(var1, var2);
   }

   public static void t(.mn var0) {
      WeakReference var1 = var0.b;
      if (var1 != null) {
         View var2 = (View)var1.get();

         while(var2 != null) {
            if (var2 == var0.a) {
               return;
            }

            ViewParent var3 = var2.getParent();
            if (var3 instanceof View) {
               var2 = (View)var3;
            } else {
               var2 = null;
            }
         }

         var0.b = null;
      }

   }

   public final void A(int var1, int var2, int var3, int var4, int[] var5, int var6, int[] var7) {
      this.aC().g(var1, var2, var3, var4, var5, var6, var7);
   }

   public final void B(int var1, int var2) {
      ++this.al;
      int var4 = this.getScrollX();
      int var3 = this.getScrollY();
      this.onScrollChanged(var4, var3, var4 - var1, var3 - var2);
      this.T(var1, var2);
      List var5 = this.ax;
      if (var5 != null) {
         for(var3 = var5.size() - 1; var3 >= 0; --var3) {
            ((.et)this.ax.get(var3)).e(this, var1, var2);
         }
      }

      --this.al;
   }

   public final void C() {
      if (this.E == null) {
         EdgeEffect var1 = this.aG.f(this);
         this.E = var1;
         if (this.i) {
            var1.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
         } else {
            var1.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
         }
      }
   }

   public final void D() {
      if (this.B == null) {
         EdgeEffect var1 = this.aG.f(this);
         this.B = var1;
         if (this.i) {
            var1.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
         } else {
            var1.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
         }
      }
   }

   public final void E() {
      if (this.D == null) {
         EdgeEffect var1 = this.aG.f(this);
         this.D = var1;
         if (this.i) {
            var1.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
         } else {
            var1.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
         }
      }
   }

   public final void F() {
      if (this.C == null) {
         EdgeEffect var1 = this.aG.f(this);
         this.C = var1;
         if (this.i) {
            var1.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
         } else {
            var1.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
         }
      }
   }

   final void G(.mk var1) {
      if (this.am == 2) {
         OverScroller var2 = this.J.a;
         var1.o = var2.getFinalX() - var2.getCurrX();
         var1.p = var2.getFinalY() - var2.getCurrY();
      } else {
         var1.o = 0;
         var1.p = 0;
      }
   }

   final void I() {
      this.E = null;
      this.C = null;
      this.D = null;
      this.B = null;
   }

   public final void J() {
      if (this.p.size() != 0) {
         .lx var1 = this.n;
         if (var1 != null) {
            var1.O("Cannot invalidate item decorations during a scroll or layout");
         }

         this.L();
         this.requestLayout();
      }
   }

   public final void K(int var1) {
      if (this.n != null) {
         this.ae(2);
         this.n.T(var1);
         this.awakenScrollBars();
      }
   }

   public final void L() {
      int var3 = this.h.c();
      byte var2 = 0;

      int var1;
      for(var1 = 0; var1 < var3; ++var1) {
         ((.ly)this.h.f(var1).getLayoutParams()).e = true;
      }

      .mc var4 = this.f;
      var3 = var4.c.size();

      for(var1 = var2; var1 < var3; ++var1) {
         .ly var5 = (.ly)((.mn)var4.c.get(var1)).a.getLayoutParams();
         if (var5 != null) {
            var5.e = true;
         }
      }

   }

   public final void M(int var1) {
      int var3 = this.h.a();

      for(int var2 = 0; var2 < var3; ++var2) {
         this.h.e(var2).offsetLeftAndRight(var1);
      }

   }

   public final void N(int var1) {
      int var3 = this.h.a();

      for(int var2 = 0; var2 < var3; ++var2) {
         this.h.e(var2).offsetTopAndBottom(var1);
      }

   }

   public final void O(int var1, int var2, boolean var3) {
      int var5 = this.h.c();

      int var4;
      for(var4 = 0; var4 < var5; ++var4) {
         .mn var7 = h(this.h.f(var4));
         if (var7 != null && !var7.z()) {
            int var6 = var7.c;
            if (var6 >= var1 + var2) {
               var7.j(-var2, var3);
               this.M.f = true;
            } else if (var6 >= var1) {
               var6 = -var2;
               var7.e(8);
               var7.j(var6, var3);
               var7.c = var1 - 1;
               this.M.f = true;
            }
         }
      }

      .mc var9 = this.f;

      for(var4 = var9.c.size() - 1; var4 >= 0; --var4) {
         .mn var8 = (.mn)var9.c.get(var4);
         if (var8 != null) {
            var5 = var8.c;
            if (var5 >= var1 + var2) {
               var8.j(-var2, var3);
            } else if (var5 >= var1) {
               var8.e(8);
               var9.i(var4);
            }
         }
      }

      this.requestLayout();
   }

   public final void P() {
      ++this.ak;
   }

   final void Q() {
      this.R(true);
   }

   public final void R(boolean var1) {
      int var2 = this.ak - 1;
      this.ak = var2;
      if (var2 <= 0) {
         this.ak = 0;
         if (var1) {
            var2 = this.ai;
            this.ai = 0;
            if (var2 != 0 && this.ao()) {
               AccessibilityEvent var4 = AccessibilityEvent.obtain();
               var4.setEventType(2048);
               .chq.b(var4, var2);
               this.sendAccessibilityEventUnchecked(var4);
            }

            for(var2 = this.S.size() - 1; var2 >= 0; --var2) {
               .mn var5 = (.mn)this.S.get(var2);
               if (var5.a.getParent() == this && !var5.z()) {
                  int var3 = var5.p;
                  if (var3 != -1) {
                     .cfx.o(var5.a, var3);
                     var5.p = -1;
                  }
               }
            }

            this.S.clear();
         }
      }

   }

   public void S(int var1) {
   }

   public void T(int var1, int var2) {
   }

   public final void U() {
      if (!this.P && this.s) {
         .cfx.i(this, this.aC);
         this.P = true;
      }

   }

   public final void V(boolean var1) {
      this.A |= var1;
      this.z = true;
      int var4 = this.h.c();
      byte var3 = 0;

      int var2;
      for(var2 = 0; var2 < var4; ++var2) {
         .mn var5 = h(this.h.f(var2));
         if (var5 != null && !var5.z()) {
            var5.e(6);
         }
      }

      this.L();
      .mc var7 = this.f;
      var4 = var7.c.size();

      for(var2 = var3; var2 < var4; ++var2) {
         .mn var6 = (.mn)var7.c.get(var2);
         if (var6 != null) {
            var6.e(6);
            var6.d((Object)null);
         }
      }

      .lq var8 = var7.f.m;
      if (var8 == null || !var8.b) {
         var7.h();
      }
   }

   public final void W(.mn var1, .lt var2) {
      var1.l(0, 8192);
      if (this.M.h && var1.x() && !var1.u() && !var1.z()) {
         long var3 = this.d(var1);
         this.V.n(var3, var1);
      }

      this.V.p(var1, var2);
   }

   public final void X() {
      .lu var1 = this.F;
      if (var1 != null) {
         var1.c();
      }

      .lx var2 = this.n;
      if (var2 != null) {
         var2.aN(this.f);
         this.n.aO(this.f);
      }

      this.f.d();
   }

   public final void Y(int var1, int var2, int[] var3) {
      this.ag();
      this.P();
      .cej.a("RV Scroll");
      this.G(this.M);
      if (var1 != 0) {
         var1 = this.n.d(var1, this.f, this.M);
      } else {
         var1 = 0;
      }

      if (var2 != 0) {
         var2 = this.n.e(var2, this.f, this.M);
      } else {
         var2 = 0;
      }

      .cej.b();
      int var5 = this.h.a();

      for(int var4 = 0; var4 < var5; ++var4) {
         View var8 = this.h.e(var4);
         .mn var9 = this.g(var8);
         if (var9 != null) {
            var9 = var9.i;
            if (var9 != null) {
               View var10 = var9.a;
               int var6 = var8.getLeft();
               int var7 = var8.getTop();
               if (var6 != var10.getLeft() || var7 != var10.getTop()) {
                  var10.layout(var6, var7, var10.getWidth() + var6, var10.getHeight() + var7);
               }
            }
         }
      }

      this.Q();
      this.ah(false);
      if (var3 != null) {
         var3[0] = var1;
         var3[1] = var2;
      }

   }

   public final void Z(int var1) {
      if (!this.w) {
         this.aj();
         .lx var2 = this.n;
         if (var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
         } else {
            var2.T(var1);
            this.awakenScrollBars();
         }
      }
   }

   public final void aA(.et var1) {
      List var2 = this.ax;
      if (var2 != null) {
         var2.remove(var1);
      }

   }

   public final void aa(.mp var1) {
      this.Q = var1;
      .cgm.g(this, var1);
   }

   public void ab(.lq var1) {
      this.suppressLayout(false);
      .lq var5 = this.m;
      if (var5 != null) {
         var5.i(this.ae);
      }

      this.X();
      this.U.n();
      var5 = this.m;
      this.m = var1;
      if (var1 != null) {
         var1.h(this.ae);
      }

      .lx var9 = this.n;
      if (var9 != null) {
         var9.bn();
      }

      .mc var7 = this.f;
      var1 = this.m;
      var7.d();
      var7.f(var5, true);
      .ktf var6 = var7.p();
      if (var5 != null) {
         --var6.a;
      }

      if (var6.a == 0) {
         for(int var2 = 0; var2 < ((SparseArray)var6.c).size(); ++var2) {
            .mb var10 = (.mb)((SparseArray)var6.c).valueAt(var2);
            ArrayList var8 = var10.a;
            int var4 = var8.size();

            for(int var3 = 0; var3 < var4; ++var3) {
               .cil.e(((.mn)var8.get(var3)).a);
            }

            var10.a.clear();
         }
      }

      if (var1 != null) {
         ++var6.a;
      }

      var7.e();
      this.M.f = true;
      this.V(false);
      this.requestLayout();
   }

   public final void ac(.lu var1) {
      .lu var2 = this.F;
      if (var2 != null) {
         var2.c();
         this.F.l = null;
      }

      this.F = var1;
      if (var1 != null) {
         var1.l = this.aH;
      }

   }

   public final void ad(.lx var1) {
      if (var1 != this.n) {
         this.aj();
         if (this.n != null) {
            .lu var4 = this.F;
            if (var4 != null) {
               var4.c();
            }

            this.n.aN(this.f);
            this.n.aO(this.f);
            this.f.d();
            if (this.s) {
               this.n.bq(this);
            }

            this.n.aX((RecyclerView)null);
            this.n = null;
         } else {
            this.f.d();
         }

         .ju var6 = this.h;
         var6.a.d();

         int var2;
         for(var2 = var6.b.size() - 1; var2 >= 0; --var2) {
            var6.c.t((View)var6.b.get(var2));
            var6.b.remove(var2);
         }

         AmbientMode$AmbientController var5 = var6.c;
         int var3 = var5.q();

         for(var2 = 0; var2 < var3; ++var2) {
            View var7 = var5.s(var2);
            ((RecyclerView)var5.a).y(var7);
            var7.clearAnimation();
         }

         ((RecyclerView)var5.a).removeAllViews();
         this.n = var1;
         if (var1 != null) {
            if (var1.s != null) {
               StringBuilder var8 = new StringBuilder();
               var8.append("LayoutManager ");
               var8.append(var1);
               var8.append(" is already attached to a RecyclerView:");
               var8.append(var1.s.k());
               throw new IllegalArgumentException(var8.toString());
            }

            this.n.aX(this);
            if (this.s) {
               this.n.aH(this);
            }
         }

         this.f.n();
         this.requestLayout();
      }
   }

   public final void ae(int var1) {
      if (var1 != this.am) {
         this.am = var1;
         if (var1 != 2) {
            this.aN();
         }

         .lx var3 = this.n;
         if (var3 != null) {
            var3.aM(var1);
         }

         this.S(var1);
         List var4 = this.ax;
         if (var4 != null) {
            for(int var2 = var4.size() - 1; var2 >= 0; --var2) {
               ((.et)this.ax.get(var2)).f(var1);
            }
         }

      }
   }

   public void af(int var1) {
      if (!this.w) {
         .lx var2 = this.n;
         if (var2 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
         } else {
            var2.ak(this, var1);
         }
      }
   }

   public final void ag() {
      int var1 = this.ag + 1;
      this.ag = var1;
      if (var1 == 1 && !this.w) {
         this.v = false;
      }

   }

   public final void ah(boolean var1) {
      int var3 = this.ag;
      int var2 = var3;
      if (var3 <= 0) {
         this.ag = 1;
         var2 = 1;
      }

      if (!var1 && !this.w) {
         this.v = false;
      }

      if (var2 == 1) {
         if (var1 && this.v && !this.w && this.n != null && this.m != null) {
            this.z();
         }

         if (!this.w) {
            this.v = false;
         }
      }

      --this.ag;
   }

   public final void ai(int var1) {
      this.aC().b(var1);
   }

   public final void aj() {
      this.ae(0);
      this.aN();
   }

   public final boolean al(int var1, int var2, int[] var3, int[] var4, int var5) {
      return this.aC().e(var1, var2, var3, var4, var5);
   }

   public boolean am(int var1, int var2) {
      .lx var11 = this.n;
      if (var11 == null) {
         Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
         return false;
      } else if (this.w) {
         return false;
      } else {
         byte var8 = var11.W();
         boolean var10 = var11.X();
         int var5;
         if (var8 != 0) {
            var5 = var1;
            if (Math.abs(var1) < this.I) {
               var5 = 0;
            }
         } else {
            var5 = 0;
         }

         if (var10) {
            var1 = var2;
            if (Math.abs(var2) < this.I) {
               var1 = 0;
            }
         } else {
            var1 = 0;
         }

         var2 = var5;
         if (var5 == 0) {
            if (var1 == 0) {
               return false;
            }

            var2 = 0;
         }

         EdgeEffect var15;
         label149: {
            if (var2 != 0) {
               var15 = this.B;
               byte var6;
               if (var15 != null && .cik.a(var15) != 0.0F) {
                  var15 = this.B;
                  var5 = -var2;
                  if (this.aQ(var15, var5, this.getWidth())) {
                     this.B.onAbsorb(var5);
                     var2 = 0;
                  }

                  var6 = 0;
                  var5 = var2;
                  var2 = var6;
                  break label149;
               }

               var15 = this.D;
               if (var15 != null && .cik.a(var15) != 0.0F) {
                  if (this.aQ(this.D, var2, this.getWidth())) {
                     this.D.onAbsorb(var2);
                     var2 = 0;
                  }

                  var6 = 0;
                  var5 = var2;
                  var2 = var6;
                  break label149;
               }
            }

            var5 = 0;
         }

         int var7;
         int var14;
         label140: {
            if (var1 != 0) {
               var15 = this.C;
               if (var15 != null && .cik.a(var15) != 0.0F) {
                  var15 = this.C;
                  var7 = -var1;
                  var14 = var1;
                  if (this.aQ(var15, var7, this.getHeight())) {
                     this.C.onAbsorb(var7);
                     var14 = 0;
                  }

                  var1 = 0;
                  break label140;
               }

               var15 = this.E;
               if (var15 != null && .cik.a(var15) != 0.0F) {
                  if (this.aQ(this.E, var1, this.getHeight())) {
                     this.E.onAbsorb(var1);
                     var14 = 0;
                  } else {
                     var14 = var1;
                  }

                  var1 = 0;
                  break label140;
               }
            }

            var14 = 0;
         }

         label131: {
            var7 = var5;
            if (var5 == 0) {
               if (var14 == 0) {
                  var7 = 0;
                  var14 = 0;
                  break label131;
               }

               var7 = 0;
            }

            var5 = this.at;
            var5 = Math.max(-var5, Math.min(var7, var5));
            var7 = this.at;
            var7 = Math.max(-var7, Math.min(var14, var7));
            this.J.a(var5, var7);
            var14 = var5;
         }

         var5 = var2;
         if (var2 == 0) {
            if (var1 == 0) {
               if (var14 == 0 && var7 == 0) {
                  return false;
               }

               return true;
            }

            var5 = 0;
         }

         float var4 = (float)var5;
         float var3 = (float)var1;
         if (!this.dispatchNestedPreFling(var4, var3)) {
            boolean var9;
            if (var8 == 0) {
               if (var10) {
                  var9 = true;
               } else {
                  var9 = false;
               }
            } else {
               var9 = true;
            }

            this.dispatchNestedFling(var4, var3, var9);
            .lz var12 = this.H;
            if (var12 != null) {
               RecyclerView var13 = var12.a;
               var11 = var13.n;
               if (var11 != null && var13.m != null) {
                  var2 = var13.I;
                  if ((Math.abs(var1) > var2 || Math.abs(var5) > var2) && var11 instanceof .mi) {
                     .mj var16 = var12.d(var11);
                     if (var16 != null) {
                        var2 = var12.a(var11, var5, var1);
                        if (var2 != -1) {
                           var16.b = var2;
                           var11.aY(var16);
                           return true;
                        }
                     }
                  }
               }
            }

            if (var9) {
               if (var10) {
                  var2 = var8 | 2;
               } else {
                  var2 = var8;
               }

               this.ax(var2, 1);
               var2 = this.at;
               var2 = Math.max(-var2, Math.min(var5, var2));
               var5 = this.at;
               var1 = Math.max(-var5, Math.min(var1, var5));
               this.J.a(var2, var1);
               return true;
            }
         }

         return false;
      }
   }

   public final boolean an() {
      return !this.u || this.z || this.U.p();
   }

   public final boolean ao() {
      AccessibilityManager var1 = this.aj;
      return var1 != null && var1.isEnabled();
   }

   public final boolean ap() {
      return this.ak > 0;
   }

   final boolean aq(int var1, int var2, MotionEvent var3, int var4) {
      this.w();
      int var11;
      int var12;
      int var13;
      int var14;
      int[] var20;
      if (this.m != null) {
         var20 = this.R;
         var20[0] = 0;
         var20[1] = 0;
         this.Y(var1, var2, var20);
         var20 = this.R;
         var13 = var20[0];
         var14 = var20[1];
         var11 = var14;
         var12 = var13;
         var13 = var1 - var13;
         var14 = var2 - var14;
      } else {
         var11 = 0;
         var12 = 0;
         var13 = 0;
         var14 = 0;
      }

      if (!this.p.isEmpty()) {
         this.invalidate();
      }

      var20 = this.R;
      var20[0] = 0;
      var20[1] = 0;
      this.A(var12, var11, var13, var14, this.aA, var4, var20);
      var20 = this.R;
      int var15 = var20[0];
      int var16 = var20[1];
      boolean var21;
      if (var15 == 0) {
         if (var16 != 0) {
            var21 = true;
         } else {
            var21 = false;
         }
      } else {
         var21 = true;
      }

      int var18 = this.ar;
      var20 = this.aA;
      int var17 = var20[0];
      this.ar = var18 - var17;
      var18 = this.as;
      int var19 = var20[1];
      this.as = var18 - var19;
      var20 = this.aB;
      var20[0] += var17;
      var20[1] += var19;
      if (this.getOverScrollMode() != 2) {
         if (var3 != null && !.ccb.e(var3, 8194)) {
            float var5 = var3.getX();
            float var7 = (float)(var13 - var15);
            float var10 = var3.getY();
            float var6 = (float)(var14 - var16);
            boolean var22;
            EdgeEffect var23;
            if (var7 < 0.0F) {
               this.D();
               var23 = this.B;
               float var8 = -var7;
               float var9 = (float)this.getWidth();
               var10 /= (float)this.getHeight();
               .cik.b(var23, var8 / var9, 1.0F - var10);
               var22 = true;
            } else if (var7 > 0.0F) {
               this.E();
               .cik.b(this.D, var7 / (float)this.getWidth(), var10 / (float)this.getHeight());
               var22 = true;
            } else {
               var22 = false;
            }

            label75: {
               if (var6 < 0.0F) {
                  this.F();
                  var23 = this.C;
                  var7 = -var6;
                  var6 = (float)this.getHeight();
                  var5 /= (float)this.getWidth();
                  .cik.b(var23, var7 / var6, var5);
               } else if (var6 > 0.0F) {
                  this.C();
                  .cik.b(this.E, var6 / (float)this.getHeight(), 1.0F - var5 / (float)this.getWidth());
               } else if (!var22 && var7 == 0.0F && var6 == 0.0F) {
                  break label75;
               }

               .cfx.g(this);
            }

            if (.ccb.e(var3, 4194304)) {
               this.aJ();
            }
         }

         this.v(var1, var2);
      }

      label62: {
         var1 = var12;
         if (var12 == 0) {
            if (var11 == 0) {
               var11 = 0;
               var1 = 0;
               break label62;
            }

            var1 = 0;
         }

         this.B(var1, var11);
      }

      if (!this.awakenScrollBars()) {
         this.invalidate();
      }

      return var21 || var1 != 0 || var11 != 0;
   }

   public final void at(.mn var1, int var2) {
      if (this.ap()) {
         var1.p = var2;
         this.S.add(var1);
      } else {
         .cfx.o(var1.a, var2);
      }
   }

   public final void au() {
      this.t = true;
   }

   public final void av(int var1, int var2) {
      this.aw(var1, var2, false);
   }

   public final void aw(int var1, int var2, boolean var3) {
      .lx var7 = this.n;
      if (var7 == null) {
         Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      } else if (!this.w) {
         boolean var6 = var7.W();
         byte var5 = 0;
         if (!var6) {
            var1 = 0;
         }

         if (!var7.X()) {
            var2 = 0;
         }

         int var4 = var1;
         if (var1 == 0) {
            if (var2 == 0) {
               return;
            }

            var4 = 0;
         }

         if (var3) {
            byte var8;
            if (var4 != 0) {
               var8 = 1;
            } else {
               var8 = var5;
            }

            int var9 = var8;
            if (var2 != 0) {
               var9 = var8 | 2;
            }

            this.ax(var9, 1);
         }

         this.J.c(var4, var2, Integer.MIN_VALUE, (Interpolator)null);
      }
   }

   public final void ax(int var1, int var2) {
      this.aC().i(var1, var2);
   }

   public final void ay(.es var1) {
      .lx var2 = this.n;
      if (var2 != null) {
         var2.O("Cannot add item decoration during a scroll  or layout");
      }

      if (this.p.isEmpty()) {
         this.setWillNotDraw(false);
      }

      this.p.add(var1);
      this.L();
      this.requestLayout();
   }

   public final void az(.et var1) {
      if (this.ax == null) {
         this.ax = new ArrayList();
      }

      this.ax.add(var1);
   }

   public final int b(.mn var1) {
      boolean var8 = var1.p(524);
      byte var5 = -1;
      if (!var8 && var1.r()) {
         .mcq var9 = this.U;
         int var2 = var1.c;
         int var6 = ((ArrayList)var9.d).size();

         int var3;
         for(int var4 = 0; var4 < var6; var2 = var3) {
            .ig var10 = (.ig)((ArrayList)var9.d).get(var4);
            switch(var10.a) {
            case 1:
               var3 = var2;
               if (var10.b <= var2) {
                  var3 = var2 + var10.d;
               }
               break;
            case 2:
               int var7 = var10.b;
               var3 = var2;
               if (var7 <= var2) {
                  var3 = var10.d;
                  if (var7 + var3 > var2) {
                     var2 = var5;
                     return var2;
                  }

                  var3 = var2 - var3;
               }
               break;
            default:
               var3 = var2;
            }

            ++var4;
         }

         return var2;
      } else {
         return -1;
      }
   }

   public final int c(View var1) {
      .mn var2 = h(var1);
      return var2 != null ? var2.a() : -1;
   }

   public final boolean checkLayoutParams(LayoutParams var1) {
      return var1 instanceof .ly && this.n.s((.ly)var1);
   }

   public final int computeHorizontalScrollExtent() {
      .lx var1 = this.n;
      if (var1 == null) {
         return 0;
      } else {
         return var1.W() ? var1.A(this.M) : 0;
      }
   }

   public final int computeHorizontalScrollOffset() {
      .lx var1 = this.n;
      if (var1 == null) {
         return 0;
      } else {
         return var1.W() ? var1.B(this.M) : 0;
      }
   }

   public final int computeHorizontalScrollRange() {
      .lx var1 = this.n;
      if (var1 == null) {
         return 0;
      } else {
         return var1.W() ? var1.C(this.M) : 0;
      }
   }

   public int computeVerticalScrollExtent() {
      .lx var1 = this.n;
      if (var1 == null) {
         return 0;
      } else {
         return var1.X() ? var1.D(this.M) : 0;
      }
   }

   public int computeVerticalScrollOffset() {
      .lx var1 = this.n;
      if (var1 == null) {
         return 0;
      } else {
         return var1.X() ? var1.E(this.M) : 0;
      }
   }

   public final int computeVerticalScrollRange() {
      .lx var1 = this.n;
      if (var1 == null) {
         return 0;
      } else {
         return var1.X() ? var1.F(this.M) : 0;
      }
   }

   final long d(.mn var1) {
      long var2;
      if (this.m.b) {
         var2 = var1.e;
      } else {
         var2 = (long)var1.c;
      }

      return var2;
   }

   public final boolean dispatchKeyEvent(KeyEvent var1) {
      if (super.dispatchKeyEvent(var1)) {
         return true;
      } else {
         boolean var4 = this.n.X();
         byte var3 = 0;
         int var2 = 0;
         int var5;
         if (var4) {
            var5 = var1.getKeyCode();
            switch(var5) {
            case 92:
            case 93:
               var2 = this.getMeasuredHeight();
               if (var5 == 93) {
                  this.av(0, var2);
               } else {
                  this.av(0, -var2);
               }

               return true;
            case 122:
            case 123:
               var4 = this.n.aa();
               if (var5 == 122) {
                  if (var4) {
                     var2 = this.m.a();
                  }
               } else if (!var4) {
                  var2 = this.m.a();
               }

               this.af(var2);
               return true;
            }
         } else if (this.n.W()) {
            var2 = var1.getKeyCode();
            switch(var2) {
            case 92:
            case 93:
               var5 = this.getMeasuredWidth();
               if (var2 == 93) {
                  this.av(var5, 0);
               } else {
                  this.av(-var5, 0);
               }

               return true;
            case 122:
            case 123:
               label51: {
                  var4 = this.n.aa();
                  if (var2 == 122) {
                     if (var4) {
                        var2 = this.m.a();
                        break label51;
                     }
                  } else if (!var4) {
                     var2 = this.m.a();
                     break label51;
                  }

                  var2 = var3;
               }

               this.af(var2);
               return true;
            }
         }

         return false;
      }
   }

   public final boolean dispatchNestedFling(float var1, float var2, boolean var3) {
      return this.aC().c(var1, var2, var3);
   }

   public final boolean dispatchNestedPreFling(float var1, float var2) {
      return this.aC().d(var1, var2);
   }

   public final boolean dispatchNestedPreScroll(int var1, int var2, int[] var3, int[] var4) {
      return this.aC().e(var1, var2, var3, var4, 0);
   }

   public final boolean dispatchNestedScroll(int var1, int var2, int var3, int var4, int[] var5) {
      return this.aC().f(var1, var2, var3, var4, var5);
   }

   public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent var1) {
      this.onPopulateAccessibilityEvent(var1);
      return true;
   }

   protected final void dispatchRestoreInstanceState(SparseArray var1) {
      this.dispatchThawSelfOnly(var1);
   }

   protected final void dispatchSaveInstanceState(SparseArray var1) {
      this.dispatchFreezeSelfOnly(var1);
   }

   public final void draw(Canvas var1) {
      super.draw(var1);
      int var3 = this.p.size();
      boolean var4 = false;

      int var2;
      for(var2 = 0; var2 < var3; ++var2) {
         ((.es)this.p.get(var2)).d(var1, this);
      }

      EdgeEffect var9 = this.B;
      int var5;
      boolean var10;
      if (var9 != null && !var9.isFinished()) {
         var5 = var1.save();
         if (this.i) {
            var2 = this.getPaddingBottom();
         } else {
            var2 = 0;
         }

         var1.rotate(270.0F);
         var1.translate((float)(-this.getHeight() + var2), 0.0F);
         var9 = this.B;
         if (var9 != null && var9.draw(var1)) {
            var10 = true;
         } else {
            var10 = false;
         }

         var1.restoreToCount(var5);
      } else {
         var10 = false;
      }

      var9 = this.C;
      boolean var11 = var10;
      if (var9 != null) {
         var11 = var10;
         if (!var9.isFinished()) {
            var5 = var1.save();
            if (this.i) {
               var1.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
            }

            var9 = this.C;
            if (var9 != null && var9.draw(var1)) {
               var11 = true;
            } else {
               var11 = false;
            }

            var11 |= var10;
            var1.restoreToCount(var5);
         }
      }

      var9 = this.D;
      var10 = var11;
      int var6;
      if (var9 != null) {
         var10 = var11;
         if (!var9.isFinished()) {
            var5 = var1.save();
            var6 = this.getWidth();
            if (this.i) {
               var3 = this.getPaddingTop();
            } else {
               var3 = 0;
            }

            var1.rotate(90.0F);
            var6 = -var6;
            var1.translate((float)var3, (float)var6);
            var9 = this.D;
            if (var9 != null && var9.draw(var1)) {
               var10 = true;
            } else {
               var10 = false;
            }

            var10 |= var11;
            var1.restoreToCount(var5);
         }
      }

      var9 = this.E;
      var11 = var10;
      if (var9 != null) {
         var11 = var10;
         if (!var9.isFinished()) {
            var5 = var1.save();
            var1.rotate(180.0F);
            if (this.i) {
               int var8 = -this.getWidth();
               int var7 = this.getPaddingRight();
               var2 = -this.getHeight();
               var6 = this.getPaddingBottom();
               var1.translate((float)(var8 + var7), (float)(var2 + var6));
            } else {
               var2 = -this.getWidth();
               var6 = -this.getHeight();
               var1.translate((float)var2, (float)var6);
            }

            var9 = this.E;
            if (var9 != null && var9.draw(var1)) {
               var11 = true;
            } else {
               var11 = var4;
            }

            var11 |= var10;
            var1.restoreToCount(var5);
         }
      }

      if (var11 || this.F != null && this.p.size() > 0 && this.F.h()) {
         .cfx.g(this);
      }
   }

   public final boolean drawChild(Canvas var1, View var2, long var3) {
      return super.drawChild(var1, var2, var3);
   }

   public final Rect e(View var1) {
      .ly var5 = (.ly)var1.getLayoutParams();
      if (!var5.e) {
         return var5.d;
      } else if (this.M.g && (var5.b() || var5.c.s())) {
         return var5.d;
      } else {
         Rect var4 = var5.d;
         var4.set(0, 0, 0, 0);
         int var3 = this.p.size();

         for(int var2 = 0; var2 < var3; ++var2) {
            this.k.set(0, 0, 0, 0);
            ((.es)this.p.get(var2)).c(this.k, var1, this);
            var4.left += this.k.left;
            var4.top += this.k.top;
            var4.right += this.k.right;
            var4.bottom += this.k.bottom;
         }

         var5.e = false;
         return var4;
      }
   }

   public final .mn f(int var1) {
      boolean var4 = this.z;
      .mn var5 = null;
      if (var4) {
         return null;
      } else {
         int var3 = this.h.c();

         .mn var6;
         for(int var2 = 0; var2 < var3; var5 = var6) {
            .mn var7 = h(this.h.f(var2));
            var6 = var5;
            if (var7 != null) {
               var6 = var5;
               if (!var7.u()) {
                  var6 = var5;
                  if (this.b(var7) == var1) {
                     if (!this.h.k(var7.a)) {
                        return var7;
                     }

                     var6 = var7;
                  }
               }
            }

            ++var2;
         }

         return var5;
      }
   }

   public final View focusSearch(View var1, int var2) {
      .lq var8 = this.m;
      boolean var7 = true;
      boolean var4;
      if (var8 != null) {
         if (this.n != null && !this.ap() && !this.w) {
            var4 = true;
         } else {
            var4 = false;
         }
      } else {
         var4 = false;
      }

      int var14;
      View var17;
      label219: {
         int var3;
         FocusFinder var16;
         label220: {
            var16 = FocusFinder.getInstance();
            if (var4) {
               var3 = var2;
               if (var2 == 2) {
                  break label220;
               }

               if (var2 == 1) {
                  var3 = 1;
                  break label220;
               }
            }

            var17 = var16.findNextFocus(this, var1, var2);
            if (var17 == null && var4) {
               this.w();
               if (this.j(var1) == null) {
                  return null;
               }

               this.ag();
               var17 = this.n.j(var1, var2, this.f, this.M);
               this.ah(false);
               var14 = var2;
               break label219;
            }

            var14 = var2;
            break label219;
         }

         label221: {
            label222: {
               if (this.n.X()) {
                  short var10;
                  if (var3 == 2) {
                     var10 = 130;
                  } else {
                     var10 = 33;
                  }

                  if (var16.findNextFocus(this, var1, var10) == null) {
                     break label222;
                  }
               }

               if (!this.n.W()) {
                  break label221;
               }

               boolean var11;
               if (this.n.ap() == 1) {
                  var11 = true;
               } else {
                  var11 = false;
               }

               if (var3 == 2) {
                  var4 = true;
               } else {
                  var4 = false;
               }

               byte var12;
               if (!(var11 ^ var4)) {
                  var12 = 17;
               } else {
                  var12 = 66;
               }

               if (var16.findNextFocus(this, var1, var12) != null) {
                  break label221;
               }
            }

            this.w();
            if (this.j(var1) == null) {
               return null;
            }

            this.ag();
            this.n.j(var1, var3, this.f, this.M);
            this.ah(false);
         }

         var17 = var16.findNextFocus(this, var1, var3);
         var14 = var3;
      }

      if (var17 != null && !var17.hasFocusable()) {
         if (this.getFocusedChild() == null) {
            return super.focusSearch(var1, var14);
         } else {
            this.aK(var17, (View)null);
            return var1;
         }
      } else {
         if (var17 != null && var17 != this && var17 != var1 && this.j(var17) != null) {
            if (var1 == null || this.j(var1) == null) {
               return var17;
            }

            this.k.set(0, 0, var1.getWidth(), var1.getHeight());
            this.af.set(0, 0, var17.getWidth(), var17.getHeight());
            this.offsetDescendantRectToMyCoords(var1, this.k);
            this.offsetDescendantRectToMyCoords(var17, this.af);
            var2 = this.n.ap();
            byte var13 = -1;
            byte var5;
            if (var2 == 1) {
               var5 = -1;
            } else {
               var5 = 1;
            }

            byte var15;
            if ((this.k.left < this.af.left || this.k.right <= this.af.left) && this.k.right < this.af.right) {
               var15 = 1;
            } else if ((this.k.right > this.af.right || this.k.left >= this.af.right) && this.k.left > this.af.left) {
               var15 = -1;
            } else {
               var15 = 0;
            }

            if ((this.k.top < this.af.top || this.k.bottom <= this.af.top) && this.k.bottom < this.af.bottom) {
               var13 = 1;
            } else if (this.k.bottom <= this.af.bottom && this.k.top < this.af.bottom || this.k.top <= this.af.top) {
               var13 = 0;
            }

            boolean var6;
            label149: {
               switch(var14) {
               case 1:
                  var6 = var7;
                  if (var13 < 0) {
                     break label149;
                  }

                  if (var13 == 0) {
                     if (var15 * var5 >= 0) {
                        return super.focusSearch(var1, var14);
                     }

                     var6 = var7;
                     break label149;
                  }
                  break;
               case 2:
                  var6 = var7;
                  if (var13 > 0) {
                     break label149;
                  }

                  if (var13 == 0) {
                     if (var15 * var5 <= 0) {
                        return super.focusSearch(var1, var14);
                     }

                     var6 = var7;
                     break label149;
                  }
                  break;
               case 17:
                  if (var15 < 0) {
                     return var17;
                  }

                  return super.focusSearch(var1, var14);
               case 33:
                  if (var13 < 0) {
                     return var17;
                  }

                  return super.focusSearch(var1, var14);
               case 66:
                  if (var15 > 0) {
                     return var17;
                  }

                  return super.focusSearch(var1, var14);
               case 130:
                  if (var13 > 0) {
                     return var17;
                  }

                  return super.focusSearch(var1, var14);
               default:
                  StringBuilder var9 = new StringBuilder();
                  var9.append("Invalid direction: ");
                  var9.append(var14);
                  var9.append(this.k());
                  throw new IllegalArgumentException(var9.toString());
               }

               var6 = false;
            }

            if (var6) {
               return var17;
            }
         }

         return super.focusSearch(var1, var14);
      }
   }

   public final .mn g(View var1) {
      ViewParent var2 = var1.getParent();
      if (var2 != null && var2 != this) {
         throw new IllegalArgumentException(.c.aH(this, var1, "View ", " is not a direct child of "));
      } else {
         return h(var1);
      }
   }

   public final LayoutParams generateDefaultLayoutParams() {
      .lx var1 = this.n;
      if (var1 != null) {
         return var1.f();
      } else {
         throw new IllegalStateException("RecyclerView has no LayoutManager".concat(this.k()));
      }
   }

   public final LayoutParams generateLayoutParams(AttributeSet var1) {
      .lx var2 = this.n;
      if (var2 != null) {
         return var2.h(this.getContext(), var1);
      } else {
         throw new IllegalStateException("RecyclerView has no LayoutManager".concat(this.k()));
      }
   }

   public final LayoutParams generateLayoutParams(LayoutParams var1) {
      .lx var2 = this.n;
      if (var2 != null) {
         return var2.g(var1);
      } else {
         throw new IllegalStateException("RecyclerView has no LayoutManager".concat(this.k()));
      }
   }

   public CharSequence getAccessibilityClassName() {
      return "android.support.v7.widget.RecyclerView";
   }

   public final int getBaseline() {
      return this.n != null ? -1 : super.getBaseline();
   }

   public final boolean getClipToPadding() {
      return this.i;
   }

   public final boolean hasNestedScrollingParent() {
      return this.aC().h(0);
   }

   public final boolean isAttachedToWindow() {
      return this.s;
   }

   public final boolean isLayoutSuppressed() {
      return this.w;
   }

   public final boolean isNestedScrollingEnabled() {
      return this.aC().a;
   }

   public final View j(View var1) {
      ViewParent var2;
      for(var2 = var1.getParent(); var2 != null && var2 != this && var2 instanceof View; var2 = var1.getParent()) {
         var1 = (View)var2;
      }

      return var2 == this ? var1 : null;
   }

   public final String k() {
      StringBuilder var1 = new StringBuilder();
      var1.append(" ");
      var1.append(super.toString());
      var1.append(", adapter:");
      var1.append(this.m);
      var1.append(", layout:");
      var1.append(this.n);
      var1.append(", context:");
      var1.append(this.getContext());
      return var1.toString();
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.ak = 0;
      boolean var3 = true;
      this.s = true;
      if (!this.u || this.isLayoutRequested()) {
         var3 = false;
      }

      this.u = var3;
      this.f.e();
      .lx var4 = this.n;
      if (var4 != null) {
         var4.aH(this);
      }

      this.P = false;
      if (c) {
         .kq var5 = (.kq).kq.a.get();
         this.K = var5;
         if (var5 == null) {
            this.K = new .kq();
            Display var6 = .cfy.f(this);
            var3 = this.isInEditMode();
            float var2 = 60.0F;
            float var1;
            if (!var3 && var6 != null) {
               var1 = var6.getRefreshRate();
               if (!(var1 >= 30.0F)) {
                  var1 = var2;
               }
            } else {
               var1 = var2;
            }

            var5 = this.K;
            var5.e = (long)(1.0E9F / var1);
            .kq.a.set(var5);
         }

         this.K.c.add(this);
      }

   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      .lu var2 = this.F;
      if (var2 != null) {
         var2.c();
      }

      this.aj();
      this.s = false;
      .lx var3 = this.n;
      if (var3 != null) {
         var3.bq(this);
      }

      this.S.clear();
      this.removeCallbacks(this.aC);

      while(.nu.a.a() != null) {
      }

      .mc var4 = this.f;

      for(int var1 = 0; var1 < var4.c.size(); ++var1) {
         .cil.e(((.mn)var4.c.get(var1)).a);
      }

      var4.f(var4.f.m, false);
      Iterator var5 = (new .qyg(this, 1)).a();

      while(var5.hasNext()) {
         .cil.f((View)var5.next()).K();
      }

      if (c) {
         .kq var6 = this.K;
         if (var6 != null) {
            var6.c.remove(this);
            this.K = null;
         }
      }

   }

   public final void onDraw(Canvas var1) {
      super.onDraw(var1);
      int var3 = this.p.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         .es var4 = (.es)this.p.get(var2);
      }

   }

   public boolean onGenericMotionEvent(MotionEvent var1) {
      if (this.n == null) {
         return false;
      } else if (this.w) {
         return false;
      } else {
         if (var1.getAction() == 8) {
            int var5 = var1.getSource();
            float var2 = 0.0F;
            float var3 = 0.0F;
            float var4 = 0.0F;
            boolean var9;
            if ((var5 & 2) != 0) {
               if (this.n.X()) {
                  var2 = -var1.getAxisValue(9);
               } else {
                  var2 = 0.0F;
               }

               if (this.n.W()) {
                  var4 = var1.getAxisValue(10);
                  var9 = false;
                  var3 = var2;
                  var2 = var4;
               } else {
                  var3 = var2;
                  var2 = 0.0F;
                  var9 = false;
               }
            } else if ((var1.getSource() & 4194304) != 0) {
               var3 = var1.getAxisValue(26);
               if (this.n.X()) {
                  var3 = -var3;
               } else {
                  var2 = var4;
                  if (this.n.W()) {
                     var2 = var3;
                  }

                  var3 = 0.0F;
               }

               var9 = this.T;
            } else {
               var2 = 0.0F;
               var9 = false;
            }

            var4 = this.av;
            int var8 = (int)(var2 * this.au);
            int var6 = (int)(var3 * var4);
            int var7;
            if (var9) {
               OverScroller var13 = this.J.a;
               var7 = var13.getFinalY();
               var5 = var13.getCurrY();
               this.aw(var8 + (var13.getFinalX() - var13.getCurrX()), var6 + (var7 - var5), true);
            } else {
               .lx var12 = this.n;
               if (var12 == null) {
                  Log.e("RecyclerView", HUJCIBIkzRDQ.woeAg);
               } else if (!this.w) {
                  int[] var11 = this.R;
                  var11[0] = 0;
                  var11[1] = 0;
                  boolean var10 = var12.W();
                  var9 = var12.X();
                  byte var15;
                  if (var10) {
                     var15 = 1;
                  } else {
                     var15 = 0;
                  }

                  var7 = var15;
                  if (var9) {
                     var7 = var15 | 2;
                  }

                  if (var1 == null) {
                     var2 = (float)this.getHeight() / 2.0F;
                  } else {
                     var2 = var1.getY();
                  }

                  if (var1 == null) {
                     var3 = (float)this.getWidth() / 2.0F;
                  } else {
                     var3 = var1.getX();
                  }

                  var5 = var8 - this.a(var8, var2);
                  var6 -= this.aB(var6, var3);
                  this.ax(var7, 1);
                  if (!var10) {
                     var7 = 0;
                  } else {
                     var7 = var5;
                  }

                  if (!var9) {
                     var8 = 0;
                  } else {
                     var8 = var6;
                  }

                  if (this.al(var7, var8, this.R, this.aA, 1)) {
                     var11 = this.R;
                     var5 -= var11[0];
                     var6 -= var11[1];
                  }

                  if (!var10) {
                     var7 = 0;
                  } else {
                     var7 = var5;
                  }

                  if (!var9) {
                     var8 = 0;
                  } else {
                     var8 = var6;
                  }

                  this.aq(var7, var8, var1, 1);
                  .kq var14 = this.K;
                  if (var14 != null) {
                     label111: {
                        var7 = var5;
                        if (var5 == 0) {
                           if (var6 == 0) {
                              break label111;
                           }

                           var7 = 0;
                        }

                        var14.a(this, var7, var6);
                     }
                  }

                  this.ai(1);
               }
            }
         }

         return false;
      }
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      if (this.w) {
         return false;
      } else {
         this.r = null;
         if (this.aO(var1)) {
            this.aD();
            return true;
         } else {
            .lx var10 = this.n;
            if (var10 == null) {
               return false;
            } else {
               byte var6 = var10.W();
               boolean var9 = var10.X();
               if (this.ao == null) {
                  this.ao = VelocityTracker.obtain();
               }

               this.ao.addMovement(var1);
               int var5 = var1.getActionMasked();
               int var4 = var1.getActionIndex();
               boolean var13;
               switch(var5) {
               case 0:
                  if (this.ah) {
                     this.ah = false;
                  }

                  this.an = var1.getPointerId(0);
                  var4 = (int)(var1.getX() + 0.5F);
                  this.ar = var4;
                  this.ap = var4;
                  var4 = (int)(var1.getY() + 0.5F);
                  this.as = var4;
                  this.aq = var4;
                  EdgeEffect var15 = this.B;
                  boolean var14;
                  if (var15 != null && .cik.a(var15) != 0.0F && !this.canScrollHorizontally(-1)) {
                     .cik.b(this.B, 0.0F, 1.0F - var1.getY() / (float)this.getHeight());
                     var14 = true;
                  } else {
                     var14 = false;
                  }

                  var15 = this.D;
                  var13 = var14;
                  if (var15 != null) {
                     var13 = var14;
                     if (.cik.a(var15) != 0.0F) {
                        var13 = var14;
                        if (!this.canScrollHorizontally(1)) {
                           .cik.b(this.D, 0.0F, var1.getY() / (float)this.getHeight());
                           var13 = true;
                        }
                     }
                  }

                  var15 = this.C;
                  var14 = var13;
                  if (var15 != null) {
                     var14 = var13;
                     if (.cik.a(var15) != 0.0F) {
                        var14 = var13;
                        if (!this.canScrollVertically(-1)) {
                           .cik.b(this.C, 0.0F, var1.getX() / (float)this.getWidth());
                           var14 = true;
                        }
                     }
                  }

                  label125: {
                     var15 = this.E;
                     if (var15 != null && .cik.a(var15) != 0.0F && !this.canScrollVertically(1)) {
                        .cik.b(this.E, 0.0F, 1.0F - var1.getX() / (float)this.getWidth());
                     } else if (!var14 && this.am != 2) {
                        break label125;
                     }

                     this.getParent().requestDisallowInterceptTouchEvent(true);
                     this.ae(1);
                     this.ai(1);
                  }

                  int[] var12 = this.aB;
                  var12[1] = 0;
                  var12[0] = 0;
                  if (var9) {
                     var4 = var6 | 2;
                  } else {
                     var4 = var6;
                  }

                  this.ax(var4, 0);
                  break;
               case 1:
                  this.ao.clear();
                  this.ai(0);
                  break;
               case 2:
                  var4 = var1.findPointerIndex(this.an);
                  if (var4 < 0) {
                     StringBuilder var11 = new StringBuilder();
                     var11.append("Error processing scroll; pointer index for id ");
                     var11.append(this.an);
                     var11.append(bmSypa.zvlD);
                     Log.e("RecyclerView", var11.toString());
                     return false;
                  }

                  float var3 = var1.getX(var4);
                  float var2 = var1.getY(var4);
                  if (this.am != 1) {
                     var5 = (int)(var2 + 0.5F);
                     var4 = (int)(var3 + 0.5F);
                     int var8 = this.ap;
                     int var7 = this.aq;
                     if (var6 != 0 && Math.abs(var4 - var8) > this.G) {
                        this.ar = var4;
                        var13 = true;
                     } else {
                        var13 = false;
                     }

                     if (var9 && Math.abs(var5 - var7) > this.G) {
                        this.as = var5;
                     } else if (!var13) {
                        break;
                     }

                     this.ae(1);
                  }
                  break;
               case 3:
                  this.aD();
               case 4:
               default:
                  break;
               case 5:
                  this.an = var1.getPointerId(var4);
                  var5 = (int)(var1.getX(var4) + 0.5F);
                  this.ar = var5;
                  this.ap = var5;
                  var4 = (int)(var1.getY(var4) + 0.5F);
                  this.as = var4;
                  this.aq = var4;
                  break;
               case 6:
                  this.aH(var1);
               }

               return this.am == 1;
            }
         }
      }
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      .cej.a("RV OnLayout");
      this.z();
      .cej.b();
      this.u = true;
   }

   protected final void onMeasure(int var1, int var2) {
      .lx var7 = this.n;
      if (var7 == null) {
         this.x(var1, var2);
      } else {
         boolean var6 = var7.Y();
         boolean var5 = false;
         if (var6) {
            int var3 = MeasureSpec.getMode(var1);
            int var4 = MeasureSpec.getMode(var2);
            this.n.bo(var1, var2);
            if (var3 == 1073741824 && var4 == 1073741824) {
               var5 = true;
            }

            this.aD = var5;
            if (!var5 && this.m != null) {
               if (this.M.d == 1) {
                  this.aE();
               }

               this.n.aU(var1, var2);
               this.M.i = true;
               this.aF();
               this.n.aW(var1, var2);
               if (this.n.ac()) {
                  this.n.aU(MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824));
                  this.M.i = true;
                  this.aF();
                  this.n.aW(var1, var2);
               }

               this.aE = this.getMeasuredWidth();
               this.aF = this.getMeasuredHeight();
            }
         } else if (this.t) {
            var7.bo(var1, var2);
         } else {
            if (this.x) {
               this.ag();
               this.P();
               this.aI();
               this.Q();
               .mk var8 = this.M;
               if (var8.k) {
                  var8.g = true;
               } else {
                  this.U.i();
                  this.M.g = false;
               }

               this.x = false;
               this.ah(false);
            } else if (this.M.k) {
               this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
               return;
            }

            .lq var9 = this.m;
            if (var9 != null) {
               this.M.e = var9.a();
            } else {
               this.M.e = 0;
            }

            this.ag();
            this.n.bo(var1, var2);
            this.ah(false);
            this.M.g = false;
         }
      }
   }

   protected final boolean onRequestFocusInDescendants(int var1, Rect var2) {
      return this.ap() ? false : super.onRequestFocusInDescendants(var1, var2);
   }

   protected final void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof .mg)) {
         super.onRestoreInstanceState(var1);
      } else {
         .mg var2 = (.mg)var1;
         this.g = var2;
         super.onRestoreInstanceState(var2.d);
         this.requestLayout();
      }
   }

   protected final Parcelable onSaveInstanceState() {
      .mg var2 = new .mg(super.onSaveInstanceState());
      .mg var1 = this.g;
      if (var1 != null) {
         var2.a = var1.a;
      } else {
         .lx var3 = this.n;
         Parcelable var4;
         if (var3 != null) {
            var4 = var3.L();
         } else {
            var4 = null;
         }

         var2.a = var4;
      }

      return var2;
   }

   protected final void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      if (var1 != var3 || var2 != var4) {
         this.I();
      }
   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var13 = this.w;
      byte var9 = 0;
      if (!var13 && !this.ah) {
         .ma var14 = this.r;
         int var4;
         if (var14 == null) {
            if (var1.getAction() == 0 || !this.aO(var1)) {
               .lx var20 = this.n;
               if (var20 == null) {
                  return false;
               }

               byte var10 = var20.W();
               var13 = var20.X();
               if (this.ao == null) {
                  this.ao = VelocityTracker.obtain();
               }

               int var5 = var1.getActionMasked();
               int var6 = var1.getActionIndex();
               var4 = var5;
               if (var5 == 0) {
                  int[] var21 = this.aB;
                  var21[1] = 0;
                  var21[0] = 0;
                  var4 = 0;
               }

               MotionEvent var22;
               label144: {
                  var22 = MotionEvent.obtain(var1);
                  int[] var15 = this.aB;
                  var22.offsetLocation((float)var15[0], (float)var15[1]);
                  float var2;
                  float var3;
                  switch(var4) {
                  case 0:
                     this.an = var1.getPointerId(0);
                     var4 = (int)(var1.getX() + 0.5F);
                     this.ar = var4;
                     this.ap = var4;
                     var4 = (int)(var1.getY() + 0.5F);
                     this.as = var4;
                     this.aq = var4;
                     if (var13) {
                        var4 = var10 | 2;
                     } else {
                        var4 = var10;
                     }

                     this.ax(var4, 0);
                     break;
                  case 1:
                     this.ao.addMovement(var22);
                     this.ao.computeCurrentVelocity(1000, (float)this.at);
                     if (var10 != 0) {
                        var2 = -this.ao.getXVelocity(this.an);
                     } else {
                        var2 = 0.0F;
                     }

                     if (var13) {
                        var3 = -this.ao.getYVelocity(this.an);
                     } else {
                        var3 = 0.0F;
                     }

                     if (var2 == 0.0F && var3 == 0.0F || !this.am((int)var2, (int)var3)) {
                        this.ae(0);
                     }

                     this.aM();
                     break label144;
                  case 2:
                     var4 = var1.findPointerIndex(this.an);
                     if (var4 < 0) {
                        StringBuilder var18 = new StringBuilder();
                        var18.append("Error processing scroll; pointer index for id ");
                        var18.append(this.an);
                        var18.append(SFjQQF.awL);
                        Log.e("RecyclerView", var18.toString());
                        return false;
                     }

                     var2 = var1.getX(var4);
                     var3 = var1.getY(var4);
                     var4 = this.ar;
                     int var11 = (int)(var2 + 0.5F);
                     var4 -= var11;
                     var5 = this.as;
                     int var12 = (int)(var3 + 0.5F);
                     int var7 = var5 - var12;
                     if (this.am != 1) {
                        boolean var19;
                        if (var10 != 0) {
                           if (var4 > 0) {
                              var4 = Math.max(0, var4 - this.G);
                           } else {
                              var4 = Math.min(0, var4 + this.G);
                           }

                           if (var4 != 0) {
                              var19 = true;
                           } else {
                              var19 = false;
                           }
                        } else {
                           var19 = false;
                        }

                        boolean var8 = var19;
                        var6 = var7;
                        if (var13) {
                           if (var7 > 0) {
                              var7 = Math.max(0, var7 - this.G);
                           } else {
                              var7 = Math.min(0, var7 + this.G);
                           }

                           var8 = var19;
                           var6 = var7;
                           if (var7 != 0) {
                              var8 = true;
                              var6 = var7;
                           }
                        }

                        var7 = var6;
                        var5 = var4;
                        if (var8) {
                           this.ae(1);
                           var7 = var6;
                           var5 = var4;
                        }
                     } else {
                        var5 = var4;
                     }

                     if (this.am == 1) {
                        var15 = this.R;
                        var15[0] = 0;
                        var15[1] = 0;
                        var5 -= this.a(var5, var1.getY());
                        var4 = var7 - this.aB(var7, var1.getX());
                        if (1 != var10) {
                           var6 = 0;
                        } else {
                           var6 = var5;
                        }

                        if (!var13) {
                           var7 = 0;
                        } else {
                           var7 = var4;
                        }

                        if (this.al(var6, var7, this.R, this.aA, 0)) {
                           var15 = this.R;
                           var6 = var5 - var15[0];
                           var7 = var15[1];
                           var15 = this.aB;
                           var5 = var15[0];
                           int[] var16 = this.aA;
                           var15[0] = var5 + var16[0];
                           var15[1] += var16[1];
                           this.getParent().requestDisallowInterceptTouchEvent(true);
                           var5 = var4 - var7;
                           var4 = var6;
                        } else {
                           var6 = var4;
                           var4 = var5;
                           var5 = var6;
                        }

                        var15 = this.aA;
                        this.ar = var11 - var15[0];
                        this.as = var12 - var15[1];
                        if (1 != var10) {
                           var6 = 0;
                        } else {
                           var6 = var4;
                        }

                        if (!var13) {
                           var7 = 0;
                        } else {
                           var7 = var5;
                        }

                        if (this.aq(var6, var7, var1, 0)) {
                           this.getParent().requestDisallowInterceptTouchEvent(true);
                        }

                        .kq var17 = this.K;
                        if (var17 != null) {
                           if (var4 == 0) {
                              if (var5 == 0) {
                                 break;
                              }

                              var4 = var9;
                           }

                           var17.a(this, var4, var5);
                        }
                     }
                     break;
                  case 3:
                     this.aD();
                  case 4:
                  default:
                     break;
                  case 5:
                     this.an = var1.getPointerId(var6);
                     var4 = (int)(var1.getX(var6) + 0.5F);
                     this.ar = var4;
                     this.ap = var4;
                     var4 = (int)(var1.getY(var6) + 0.5F);
                     this.as = var4;
                     this.aq = var4;
                     break;
                  case 6:
                     this.aH(var1);
                  }

                  this.ao.addMovement(var22);
               }

               var22.recycle();
               return true;
            }
         } else {
            var14.v(var1);
            var4 = var1.getAction();
            if (var4 == 3 || var4 == 1) {
               this.r = null;
            }
         }

         this.aD();
         return true;
      } else {
         return false;
      }
   }

   public final void q(.mn var1) {
      View var3 = var1.a;
      ViewParent var4 = var3.getParent();
      this.f.m(this.g(var3));
      if (var1.w()) {
         this.h.h(var3, -1, var3.getLayoutParams(), true);
      } else if (var4 != this) {
         this.h.g(var3, -1, true);
      } else {
         .ju var5 = this.h;
         int var2 = var5.c.r(var3);
         if (var2 >= 0) {
            var5.a.e(var2);
            var5.j(var3);
         } else {
            StringBuilder var6 = new StringBuilder();
            var6.append("view is not a child, cannot hide ");
            var6.append(var3);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(var3.toString()));
         }
      }
   }

   public final void r(.ma var1) {
      this.q.add(var1);
   }

   public final void removeDetachedView(View var1, boolean var2) {
      .mn var3 = h(var1);
      if (var3 != null) {
         if (var3.w()) {
            var3.i();
         } else if (!var3.z()) {
            StringBuilder var4 = new StringBuilder();
            var4.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
            var4.append(var3);
            var4.append(this.k());
            throw new IllegalArgumentException(var4.toString());
         }
      }

      var1.clearAnimation();
      this.y(var1);
      super.removeDetachedView(var1, var2);
   }

   public final void requestChildFocus(View var1, View var2) {
      if (!this.n.ba() && !this.ap() && var2 != null) {
         this.aK(var1, var2);
      }

      super.requestChildFocus(var1, var2);
   }

   public final boolean requestChildRectangleOnScreen(View var1, Rect var2, boolean var3) {
      return this.n.bb(this, var1, var2, var3, false);
   }

   public final void requestDisallowInterceptTouchEvent(boolean var1) {
      int var3 = this.q.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((.ma)this.q.get(var2)).u();
      }

      super.requestDisallowInterceptTouchEvent(var1);
   }

   public final void requestLayout() {
      if (this.ag == 0 && !this.w) {
         super.requestLayout();
      } else {
         this.v = true;
      }
   }

   public final void s(String var1) {
      if (this.ap()) {
         if (var1 == null) {
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(this.k()));
         } else {
            throw new IllegalStateException(var1);
         }
      } else if (this.al > 0) {
         Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(this.k())));
      }
   }

   public final void scrollBy(int var1, int var2) {
      .lx var6 = this.n;
      if (var6 == null) {
         Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      } else if (!this.w) {
         boolean var5 = var6.W();
         boolean var4 = var6.X();
         boolean var3 = var4;
         if (!var5) {
            if (!var4) {
               return;
            }

            var3 = true;
         }

         if (!var5) {
            var1 = 0;
         }

         if (!var3) {
            var2 = 0;
         }

         this.aq(var1, var2, (MotionEvent)null, 0);
      }
   }

   public final void scrollTo(int var1, int var2) {
      Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
   }

   public final void sendAccessibilityEventUnchecked(AccessibilityEvent var1) {
      if (this.ap()) {
         byte var3 = 0;
         int var2;
         if (var1 != null) {
            var2 = .chq.a(var1);
         } else {
            var2 = 0;
         }

         if (var2 == 0) {
            var2 = var3;
         }

         this.ai |= var2;
      } else {
         super.sendAccessibilityEventUnchecked(var1);
      }
   }

   public final void setClipToPadding(boolean var1) {
      if (var1 != this.i) {
         this.I();
      }

      this.i = var1;
      super.setClipToPadding(var1);
      if (this.u) {
         this.requestLayout();
      }

   }

   @Deprecated
   public final void setLayoutTransition(LayoutTransition var1) {
      if (var1 == null) {
         super.setLayoutTransition((LayoutTransition)null);
      } else {
         throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
      }
   }

   public final void setNestedScrollingEnabled(boolean var1) {
      this.aC().a(var1);
   }

   public final boolean startNestedScroll(int var1) {
      return this.aC().i(var1, 0);
   }

   public final void stopNestedScroll() {
      this.aC().b(0);
   }

   public final void suppressLayout(boolean var1) {
      if (var1 != this.w) {
         this.s("Do not suppressLayout in layout or scroll");
         if (!var1) {
            this.w = false;
            if (this.v && this.n != null && this.m != null) {
               this.requestLayout();
            }

            this.v = false;
            return;
         }

         long var2 = SystemClock.uptimeMillis();
         this.onTouchEvent(MotionEvent.obtain(var2, var2, 3, 0.0F, 0.0F, 0));
         this.w = true;
         this.ah = true;
         this.aj();
      }

   }

   final void u() {
      int var3 = this.h.c();
      byte var2 = 0;

      int var1;
      for(var1 = 0; var1 < var3; ++var1) {
         .mn var4 = h(this.h.f(var1));
         if (!var4.z()) {
            var4.f();
         }
      }

      .mc var6 = this.f;
      var3 = var6.c.size();

      for(var1 = 0; var1 < var3; ++var1) {
         ((.mn)var6.c.get(var1)).f();
      }

      var3 = var6.a.size();

      for(var1 = 0; var1 < var3; ++var1) {
         ((.mn)var6.a.get(var1)).f();
      }

      ArrayList var5 = var6.b;
      if (var5 != null) {
         var3 = var5.size();

         for(var1 = var2; var1 < var3; ++var1) {
            ((.mn)var6.b.get(var1)).f();
         }
      }

   }

   public final void v(int var1, int var2) {
      EdgeEffect var5 = this.B;
      boolean var3 = false;
      if (var5 != null && !var5.isFinished() && var1 > 0) {
         this.B.onRelease();
         var3 = this.B.isFinished();
      }

      var5 = this.D;
      boolean var4 = var3;
      if (var5 != null) {
         var4 = var3;
         if (!var5.isFinished()) {
            var4 = var3;
            if (var1 < 0) {
               this.D.onRelease();
               var4 = var3 | this.D.isFinished();
            }
         }
      }

      var5 = this.C;
      var3 = var4;
      if (var5 != null) {
         var3 = var4;
         if (!var5.isFinished()) {
            var3 = var4;
            if (var2 > 0) {
               this.C.onRelease();
               var3 = var4 | this.C.isFinished();
            }
         }
      }

      var5 = this.E;
      var4 = var3;
      if (var5 != null) {
         var4 = var3;
         if (!var5.isFinished()) {
            var4 = var3;
            if (var2 < 0) {
               this.E.onRelease();
               var4 = var3 | this.E.isFinished();
            }
         }
      }

      if (var4) {
         .cfx.g(this);
      }

   }

   public final void w() {
      if (this.u && !this.z) {
         if (this.U.p()) {
            if (this.U.o(4) && !this.U.o(11)) {
               .cej.a("RV PartialInvalidate");
               this.ag();
               this.P();
               this.U.k();
               if (!this.v) {
                  int var2 = this.h.a();
                  int var1 = 0;

                  while(true) {
                     if (var1 >= var2) {
                        this.U.h();
                        break;
                     }

                     .mn var3 = h(this.h.e(var1));
                     if (var3 != null && !var3.z() && var3.x()) {
                        this.z();
                        break;
                     }

                     ++var1;
                  }
               }

               this.ah(true);
               this.Q();
               .cej.b();
            } else {
               if (this.U.p()) {
                  .cej.a("RV FullInvalidate");
                  this.z();
                  .cej.b();
               }

            }
         }
      } else {
         .cej.a("RV FullInvalidate");
         this.z();
         .cej.b();
      }
   }

   public final void x(int var1, int var2) {
      this.setMeasuredDimension(.lx.al(var1, this.getPaddingLeft() + this.getPaddingRight(), .cfx.c(this)), .lx.al(var2, this.getPaddingTop() + this.getPaddingBottom(), .cfx.b(this)));
   }

   public final void y(View var1) {
      h(var1);
      List var3 = this.y;
      if (var3 != null) {
         for(int var2 = var3.size() - 1; var2 >= 0; --var2) {
            .cud var4 = (.cud)this.y.get(var2);
         }
      }

   }

   final void z() {
      if (this.m == null) {
         Log.w("RecyclerView", "No adapter attached; skipping layout");
      } else if (this.n == null) {
         Log.e("RecyclerView", "No layout manager attached; skipping layout");
      } else {
         .mk var9 = this.M;
         byte var3 = 0;
         var9.i = false;
         boolean var1;
         if (this.aD) {
            if (this.aE == this.getWidth()) {
               if (this.aF != this.getHeight()) {
                  var1 = true;
               } else {
                  var1 = false;
               }
            } else {
               var1 = true;
            }
         } else {
            var1 = false;
         }

         this.aE = 0;
         this.aF = 0;
         this.aD = false;
         if (this.M.d == 1) {
            this.aE();
            this.n.aT(this);
            this.aF();
         } else {
            .mcq var19 = this.U;
            if ((((ArrayList)var19.c).isEmpty() || ((ArrayList)var19.d).isEmpty()) && !var1 && this.n.C == this.getWidth() && this.n.D == this.getHeight()) {
               this.n.aT(this);
            } else {
               this.n.aT(this);
               this.aF();
            }
         }

         this.M.b(4);
         this.ag();
         this.P();
         var9 = this.M;
         var9.d = 1;
         boolean var5 = var9.j;
         Object var12 = null;
         int var2;
         long var7;
         .mn var10;
         int var17;
         .mn var20;
         .mn var26;
         if (var5) {
            for(var17 = this.h.a() - 1; var17 >= 0; --var17) {
               var20 = h(this.h.e(var17));
               if (!var20.z()) {
                  var7 = this.d(var20);
                  .lt var13 = .lu.r();
                  var13.a(var20);
                  var10 = (.mn)((.xl)this.V.a).d(var7);
                  if (var10 != null && !var10.z()) {
                     boolean var6 = this.V.t(var10);
                     var5 = this.V.t(var20);
                     if (var6 && var10 == var20) {
                        this.V.o(var20, var13);
                     } else {
                        .lt var11 = this.V.l(var10, 4);
                        this.V.o(var20, var13);
                        var13 = this.V.l(var20, 8);
                        if (var11 != null) {
                           var10.m(false);
                           if (var6) {
                              this.q(var10);
                           }

                           if (var10 != var20) {
                              if (var5) {
                                 this.q(var20);
                              }

                              var10.h = var20;
                              this.q(var10);
                              this.f.m(var10);
                              var20.m(false);
                              var20.i = var10;
                           }

                           if (this.F.n(var10, var20, var11, var13)) {
                              this.U();
                           }
                        } else {
                           int var4 = this.h.a();

                           for(var2 = 0; var2 < var4; ++var2) {
                              var26 = h(this.h.e(var2));
                              if (var26 != var20 && this.d(var26) == var7) {
                                 .lq var22 = this.m;
                                 StringBuilder var23;
                                 if (var22 != null && var22.b) {
                                    var23 = new StringBuilder();
                                    var23.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                    var23.append(var26);
                                    var23.append(" \n View Holder 2:");
                                    var23.append(var20);
                                    var23.append(this.k());
                                    throw new IllegalStateException(var23.toString());
                                 }

                                 var23 = new StringBuilder();
                                 var23.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                 var23.append(var26);
                                 var23.append(" \n View Holder 2:");
                                 var23.append(var20);
                                 var23.append(this.k());
                                 throw new IllegalStateException(var23.toString());
                              }
                           }

                           StringBuilder var28 = new StringBuilder();
                           var28.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
                           var28.append(var10);
                           var28.append(" cannot be found but it is necessary for ");
                           var28.append(var20);
                           var28.append(this.k());
                           Log.e("RecyclerView", var28.toString());
                        }
                     }
                  } else {
                     this.V.o(var20, var13);
                  }
               }
            }

            .blj var29 = this.V;
            AmbientMode$AmbientController var33 = this.aI;

            for(var17 = ((.xo)var29.b).d - 1; var17 >= 0; --var17) {
               var10 = (.mn)((.xo)var29.b).d(var17);
               .nu var21 = (.nu)((.xo)var29.b).e(var17);
               var2 = var21.b;
               if ((var2 & 3) == 3) {
                  var33.x(var10);
               } else {
                  .lt var14;
                  if ((var2 & 1) != 0) {
                     var14 = var21.c;
                     if (var14 == null) {
                        var33.x(var10);
                     } else {
                        var33.w(var10, var14, var21.d);
                     }
                  } else if ((var2 & 14) == 14) {
                     var33.v(var10, var21.c, var21.d);
                  } else if ((var2 & 12) == 12) {
                     var14 = var21.c;
                     .lt var15 = var21.d;
                     var10.m(false);
                     RecyclerView var16 = (RecyclerView)var33.a;
                     if (var16.z) {
                        if (var16.F.n(var10, var10, var14, var15)) {
                           ((RecyclerView)var33.a).U();
                        }
                     } else if (var16.F.p(var10, var14, var15)) {
                        ((RecyclerView)var33.a).U();
                     }
                  } else if ((var2 & 4) != 0) {
                     var33.w(var10, var21.c, (.lt)null);
                  } else if ((var2 & 8) != 0) {
                     var33.v(var10, var21.c, var21.d);
                  }
               }

               .nu.b(var21);
            }
         }

         this.n.aO(this.f);
         var9 = this.M;
         var9.b = var9.e;
         this.z = false;
         this.A = false;
         var9.j = false;
         var9.k = false;
         this.n.u = false;
         ArrayList var24 = this.f.b;
         if (var24 != null) {
            var24.clear();
         }

         .lx var25 = this.n;
         if (var25.z) {
            var25.y = 0;
            var25.z = false;
            this.f.n();
         }

         this.n.p(this.M);
         this.Q();
         this.ah(false);
         this.V.q();
         int[] var27 = this.ay;
         var2 = var27[0];
         var17 = var27[1];
         this.aG(var27);
         var27 = this.ay;
         if (var27[0] != var2 || var27[1] != var17) {
            this.B(0, 0);
         }

         if (this.aw && this.m != null && this.hasFocus() && this.getDescendantFocusability() != 393216 && (this.getDescendantFocusability() != 131072 || !this.isFocused())) {
            label304: {
               View var30;
               if (!this.isFocused()) {
                  var30 = this.getFocusedChild();
                  if (!this.h.k(var30)) {
                     break label304;
                  }
               }

               label213: {
                  var7 = this.M.m;
                  if (var7 != -1L) {
                     .lq var31 = this.m;
                     if (var31.b && var31 != null) {
                        var2 = this.h.c();
                        var20 = null;
                        var17 = 0;

                        while(true) {
                           var10 = var20;
                           if (var17 >= var2) {
                              break label213;
                           }

                           var10 = h(this.h.f(var17));
                           var26 = var20;
                           if (var10 != null) {
                              var26 = var20;
                              if (!var10.u()) {
                                 var26 = var20;
                                 if (var10.e == var7) {
                                    if (!this.h.k(var10.a)) {
                                       break label213;
                                    }

                                    var26 = var10;
                                 }
                              }
                           }

                           ++var17;
                           var20 = var26;
                        }
                     }
                  }

                  var10 = null;
               }

               if (var10 != null && !this.h.k(var10.a) && var10.a.hasFocusable()) {
                  var30 = var10.a;
               } else if (this.h.a() <= 0) {
                  var30 = (View)var12;
               } else {
                  label297: {
                     var9 = this.M;
                     var17 = var9.l;
                     if (var17 == -1) {
                        var17 = var3;
                     }

                     int var18 = var9.a();

                     for(var2 = var17; var2 < var18; ++var2) {
                        var20 = this.f(var2);
                        if (var20 == null) {
                           break;
                        }

                        if (var20.a.hasFocusable()) {
                           var30 = var20.a;
                           break label297;
                        }
                     }

                     var17 = Math.min(var18, var17) - 1;

                     while(true) {
                        if (var17 < 0) {
                           var30 = (View)var12;
                           break;
                        }

                        var20 = this.f(var17);
                        if (var20 == null) {
                           var30 = (View)var12;
                           break;
                        }

                        if (var20.a.hasFocusable()) {
                           var30 = var20.a;
                           break;
                        }

                        --var17;
                     }
                  }
               }

               if (var30 != null) {
                  var17 = this.M.n;
                  View var32 = var30;
                  if ((long)var17 != -1L) {
                     View var34 = var30.findViewById(var17);
                     var32 = var30;
                     if (var34 != null) {
                        var32 = var30;
                        if (var34.isFocusable()) {
                           var32 = var34;
                        }
                     }
                  }

                  var32.requestFocus();
               }
            }
         }

         this.aL();
      }
   }
}
