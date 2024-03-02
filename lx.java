import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;
import java.util.ArrayList;

public abstract class lx {
   public int A;
   public int B;
   public int C;
   public int D;
   public final blj E;
   public final blj F;
   private final nt L;
   private final nt M;
   ju r;
   public RecyclerView s;
   public mj t;
   public boolean u;
   public boolean v;
   public final boolean w;
   public final boolean x;
   public int y;
   public boolean z;

   public lx() {
      lv var1 = new lv(this, 1);
      this.L = var1;
      lv var2 = new lv(this, 0);
      this.M = var2;
      this.E = new blj(var1);
      this.F = new blj(var2);
      this.u = false;
      this.v = false;
      this.w = true;
      this.x = true;
   }

   public static boolean aZ(int var0, int var1, int var2) {
      int var3 = MeasureSpec.getMode(var1);
      var1 = MeasureSpec.getSize(var1);
      if (var2 > 0 && var0 != var2) {
         return false;
      } else {
         switch(var3) {
         case Integer.MIN_VALUE:
            if (var1 >= var0) {
               return true;
            }

            return false;
         case 0:
            return true;
         case 1073741824:
            if (var1 == var0) {
               return true;
            }

            return false;
         default:
            return false;
         }
      }
   }

   public static int al(int var0, int var1, int var2) {
      int var4 = MeasureSpec.getMode(var0);
      int var3 = MeasureSpec.getSize(var0);
      var0 = var3;
      switch(var4) {
      case Integer.MIN_VALUE:
         return Math.min(var3, Math.max(var1, var2));
      default:
         var0 = Math.max(var1, var2);
      case 1073741824:
         return var0;
      }
   }

   public static int an(int var0, int var1, int var2, int var3, boolean var4) {
      label59: {
         var2 = Math.max(0, var0 - var2);
         if (var4) {
            if (var3 >= 0) {
               var0 = 1073741824;
               return MeasureSpec.makeMeasureSpec(var3, var0);
            }

            if (var3 != -1) {
               break label59;
            }

            var0 = var1;
            switch(var1) {
            case Integer.MIN_VALUE:
            case 1073741824:
               break;
            case 0:
            default:
               break label59;
            }
         } else {
            if (var3 >= 0) {
               var0 = 1073741824;
               return MeasureSpec.makeMeasureSpec(var3, var0);
            }

            if (var3 == -1) {
               var0 = var1;
            } else {
               if (var3 != -2) {
                  break label59;
               }

               if (var1 != Integer.MIN_VALUE && var1 != 1073741824) {
                  var0 = 0;
               } else {
                  var0 = Integer.MIN_VALUE;
               }
            }
         }

         var3 = var2;
         return MeasureSpec.makeMeasureSpec(var3, var0);
      }

      var0 = 0;
      var3 = 0;
      return MeasureSpec.makeMeasureSpec(var3, var0);
   }

   public static lw aw(Context var0, AttributeSet var1, int var2, int var3) {
      lw var4 = new lw();
      TypedArray var5 = var0.obtainStyledAttributes(var1, ft.a, var2, var3);
      var4.a = var5.getInt(0, 1);
      var4.b = var5.getInt(10, 1);
      var4.c = var5.getBoolean(9, false);
      var4.d = var5.getBoolean(11, false);
      var5.recycle();
      return var4;
   }

   private final void bM(View var1, int var2, boolean var3) {
      mn var7 = RecyclerView.h(var1);
      if (!var3 && !var7.u()) {
         this.s.V.r(var7);
      } else {
         this.s.V.m(var7);
      }

      ly var6 = (ly)var1.getLayoutParams();
      if (!var7.A() && !var7.v()) {
         if (var1.getParent() == this.s) {
            int var5 = this.r.d(var1);
            int var4 = var2;
            if (var2 == -1) {
               var4 = this.r.a();
            }

            StringBuilder var12;
            if (var5 == -1) {
               var12 = new StringBuilder();
               var12.append(TRoaEYDrhZZT.AQJ);
               var12.append(this.s.indexOfChild(var1));
               var12.append(this.s.k());
               throw new IllegalStateException(var12.toString());
            }

            if (var5 != var4) {
               lx var11 = this.s.n;
               View var10 = var11.ay(var5);
               if (var10 == null) {
                  var12 = new StringBuilder();
                  var12.append("Cannot move a child from non-existing index:");
                  var12.append(var5);
                  var12.append(var11.s.toString());
                  throw new IllegalArgumentException(var12.toString());
               }

               var11.aG(var5);
               ly var8 = (ly)var10.getLayoutParams();
               mn var9 = RecyclerView.h(var10);
               if (var9.u()) {
                  var11.s.V.m(var9);
               } else {
                  var11.s.V.r(var9);
               }

               var11.r.h(var10, var4, var8, var9.u());
            }
         } else {
            this.r.g(var1, var2, false);
            var6.e = true;
            mj var13 = this.t;
            if (var13 != null && var13.f && mj.n(var1) == var13.b) {
               var13.g = var1;
            }
         }
      } else {
         if (var7.v()) {
            var7.o();
         } else {
            var7.h();
         }

         this.r.h(var1, var2, var1.getLayoutParams(), false);
      }

      if (var6.f) {
         var7.a.invalidate();
         var6.f = false;
      }

   }

   public static final int bd(View var0) {
      return ((ly)var0.getLayoutParams()).d.bottom;
   }

   public static final int be(View var0) {
      Rect var1 = ((ly)var0.getLayoutParams()).d;
      return var0.getMeasuredHeight() + var1.top + var1.bottom;
   }

   public static final int bf(View var0) {
      Rect var1 = ((ly)var0.getLayoutParams()).d;
      return var0.getMeasuredWidth() + var1.left + var1.right;
   }

   public static final int bg(View var0) {
      return ((ly)var0.getLayoutParams()).d.left;
   }

   public static final int bh(View var0) {
      return ((ly)var0.getLayoutParams()).a();
   }

   public static final int bi(View var0) {
      return ((ly)var0.getLayoutParams()).d.right;
   }

   public static final int bk(View var0) {
      return ((ly)var0.getLayoutParams()).d.top;
   }

   public static final void bm(View var0, int var1, int var2, int var3, int var4) {
      ly var5 = (ly)var0.getLayoutParams();
      Rect var6 = var5.d;
      var0.layout(var1 + var6.left + var5.leftMargin, var2 + var6.top + var5.topMargin, var3 - var6.right - var5.rightMargin, var4 - var6.bottom - var5.bottomMargin);
   }

   public static final int br(View var0) {
      return var0.getBottom() + bd(var0);
   }

   public static final int bs(View var0) {
      return var0.getLeft() - bg(var0);
   }

   public static final int bt(View var0) {
      return var0.getRight() + bi(var0);
   }

   public static final int bu(View var0) {
      return var0.getTop() - bk(var0);
   }

   public int A(mk var1) {
      throw null;
   }

   public int B(mk var1) {
      throw null;
   }

   public int C(mk var1) {
      throw null;
   }

   public int D(mk var1) {
      throw null;
   }

   public int E(mk var1) {
      throw null;
   }

   public int F(mk var1) {
      throw null;
   }

   public Parcelable L() {
      throw null;
   }

   public View N(int var1) {
      int var3 = this.am();

      for(int var2 = 0; var2 < var3; ++var2) {
         View var5 = this.ay(var2);
         mn var4 = RecyclerView.h(var5);
         if (var4 != null && var4.b() == var1 && !var4.z() && (this.s.M.g || !var4.u())) {
            return var5;
         }
      }

      return null;
   }

   public void O(String var1) {
      RecyclerView var2 = this.s;
      if (var2 != null) {
         var2.s(var1);
      }

   }

   public void R(AccessibilityEvent var1) {
      RecyclerView var3 = this.s;
      mc var4 = var3.f;
      mk var6 = var3.M;
      if (var3 != null && var1 != null) {
         boolean var2 = true;
         if (!var3.canScrollVertically(1) && !this.s.canScrollVertically(-1) && !this.s.canScrollHorizontally(-1) && !this.s.canScrollHorizontally(1)) {
            var2 = false;
         }

         var1.setScrollable(var2);
         lq var5 = this.s.m;
         if (var5 != null) {
            var1.setItemCount(var5.a());
            return;
         }
      }

   }

   public void S(Parcelable var1) {
   }

   public void T(int var1) {
      throw null;
   }

   public boolean W() {
      throw null;
   }

   public boolean X() {
      throw null;
   }

   public boolean Y() {
      throw null;
   }

   public int a(mc var1, mk var2) {
      RecyclerView var3 = this.s;
      if (var3 != null) {
         lq var4 = var3.m;
         if (var4 != null && this.W()) {
            return var4.a();
         }
      }

      return 1;
   }

   public final void aA(View var1) {
      this.aB(var1, -1);
   }

   public final void aB(View var1, int var2) {
      this.bM(var1, var2, true);
   }

   public final void aC(View var1) {
      this.aD(var1, -1);
   }

   public final void aD(View var1, int var2) {
      this.bM(var1, var2, false);
   }

   public final void aE(View var1, Rect var2) {
      RecyclerView var3 = this.s;
      if (var3 == null) {
         var2.set(0, 0, 0, 0);
      } else {
         var2.set(var3.e(var1));
      }
   }

   public final void aF(mc var1) {
      for(int var2 = this.am() - 1; var2 >= 0; --var2) {
         View var3 = this.ay(var2);
         mn var4 = RecyclerView.h(var3);
         if (!var4.z()) {
            if (var4.s() && !var4.u() && !this.s.m.b) {
               this.aR(var2);
               var1.k(var4);
            } else {
               this.aG(var2);
               var1.l(var3);
               this.s.V.r(var4);
            }
         }
      }

   }

   public final void aG(int var1) {
      this.ay(var1);
      this.r.i(var1);
   }

   public final void aH(RecyclerView var1) {
      this.v = true;
      this.aK(var1);
   }

   public void aI(int var1) {
      RecyclerView var2 = this.s;
      if (var2 != null) {
         var2.M(var1);
      }

   }

   public void aJ(int var1) {
      RecyclerView var2 = this.s;
      if (var2 != null) {
         var2.N(var1);
      }

   }

   public void aK(RecyclerView var1) {
   }

   public final void aL(View var1, cht var2) {
      mn var3 = RecyclerView.h(var1);
      if (var3 != null && !var3.u() && !this.r.k(var3.a)) {
         RecyclerView var4 = this.s;
         this.n(var4.f, var4.M, var1, var2);
      }

   }

   public void aM(int var1) {
   }

   public final void aN(mc var1) {
      for(int var2 = this.am() - 1; var2 >= 0; --var2) {
         if (!RecyclerView.h(this.ay(var2)).z()) {
            this.aQ(var2, var1);
         }
      }

   }

   public final void aO(mc var1) {
      int var3 = var1.a.size();

      for(int var2 = var3 - 1; var2 >= 0; --var2) {
         View var6 = ((mn)var1.a.get(var2)).a;
         mn var4 = RecyclerView.h(var6);
         if (!var4.z()) {
            var4.m(false);
            if (var4.w()) {
               this.s.removeDetachedView(var6, false);
            }

            lu var5 = this.s.F;
            if (var5 != null) {
               var5.b(var4);
            }

            var4.m(true);
            var1.g(var6);
         }
      }

      var1.a.clear();
      ArrayList var7 = var1.b;
      if (var7 != null) {
         var7.clear();
      }

      if (var3 > 0) {
         this.s.invalidate();
      }

   }

   public final void aP(View var1, mc var2) {
      ju var4 = this.r;
      int var3 = var4.c.r(var1);
      if (var3 >= 0) {
         if (var4.a.g(var3)) {
            var4.l(var1);
         }

         var4.c.u(var3);
      }

      var2.j(var1);
   }

   public final void aQ(int var1, mc var2) {
      View var3 = this.ay(var1);
      this.aR(var1);
      var2.j(var3);
   }

   public final void aR(int var1) {
      if (this.ay(var1) != null) {
         ju var3 = this.r;
         var1 = var3.b(var1);
         View var2 = var3.c.s(var1);
         if (var2 != null) {
            if (var3.a.g(var1)) {
               var3.l(var2);
            }

            var3.c.u(var1);
            return;
         }
      }

   }

   public final void aS() {
      RecyclerView var1 = this.s;
      if (var1 != null) {
         var1.requestLayout();
      }

   }

   public final void aT(RecyclerView var1) {
      this.aU(MeasureSpec.makeMeasureSpec(var1.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(var1.getHeight(), 1073741824));
   }

   public final void aU(int var1, int var2) {
      this.C = MeasureSpec.getSize(var1);
      var1 = MeasureSpec.getMode(var1);
      this.A = var1;
      if (var1 == 0 && !RecyclerView.a) {
         this.C = 0;
      }

      this.D = MeasureSpec.getSize(var2);
      var1 = MeasureSpec.getMode(var2);
      this.B = var1;
      if (var1 == 0 && !RecyclerView.a) {
         this.D = 0;
      }

   }

   public final void aV(int var1, int var2) {
      RecyclerView.p(this.s, var1, var2);
   }

   public final void aW(int var1, int var2) {
      int var10 = this.am();
      if (var10 != 0) {
         int var5 = 0;
         int var9 = Integer.MIN_VALUE;
         int var4 = Integer.MIN_VALUE;
         int var8 = Integer.MAX_VALUE;

         int var3;
         int var7;
         for(var3 = Integer.MAX_VALUE; var5 < var10; var3 = var7) {
            View var12 = this.ay(var5);
            Rect var11 = this.s.k;
            RecyclerView.H(var12, var11);
            int var6 = var8;
            if (var11.left < var8) {
               var6 = var11.left;
            }

            var8 = var9;
            if (var11.right > var9) {
               var8 = var11.right;
            }

            var7 = var3;
            if (var11.top < var3) {
               var7 = var11.top;
            }

            var3 = var4;
            if (var11.bottom > var4) {
               var3 = var11.bottom;
            }

            ++var5;
            var9 = var8;
            var4 = var3;
            var8 = var6;
         }

         this.s.k.set(var8, var3, var9, var4);
         this.q(this.s.k, var1, var2);
      } else {
         this.s.x(var1, var2);
      }
   }

   public final void aX(RecyclerView var1) {
      if (var1 == null) {
         this.s = null;
         this.r = null;
         this.C = 0;
         this.D = 0;
      } else {
         this.s = var1;
         this.r = var1.h;
         this.C = var1.getWidth();
         this.D = var1.getHeight();
      }

      this.A = 1073741824;
      this.B = 1073741824;
   }

   public final void aY(mj var1) {
      mj var3 = this.t;
      if (var3 != null && var1 != var3 && var3.f) {
         var3.f();
      }

      this.t = var1;
      RecyclerView var5 = this.s;
      var5.J.d();
      if (var1.h) {
         StringBuilder var4 = new StringBuilder();
         var4.append("An instance of ");
         var4.append(var1.getClass().getSimpleName());
         var4.append(" was started more than once. Each instance of");
         var4.append(var1.getClass().getSimpleName());
         var4.append(" is intended to only be used once. You should create a new instance for each use.");
         Log.w("RecyclerView", var4.toString());
      }

      var1.c = var5;
      var1.d = this;
      int var2 = var1.b;
      if (var2 != -1) {
         var5 = var1.c;
         var5.M.a = var2;
         var1.f = true;
         var1.e = true;
         var2 = var1.b;
         var1.g = var5.n.N(var2);
         var1.c.J.b();
         var1.h = true;
      } else {
         throw new IllegalArgumentException("Invalid target position");
      }
   }

   public boolean aa() {
      throw null;
   }

   public boolean ac() {
      return false;
   }

   public void ad(int var1, int var2, mk var3, ko var4) {
   }

   public void ae(int var1, ko var2) {
   }

   public void ai(RecyclerView var1) {
   }

   public void ak(RecyclerView var1, int var2) {
      throw null;
   }

   public final int am() {
      ju var1 = this.r;
      return var1 != null ? var1.a() : 0;
   }

   public final int ao() {
      RecyclerView var1 = this.s;
      lq var2;
      if (var1 != null) {
         var2 = var1.m;
      } else {
         var2 = null;
      }

      return var2 != null ? var2.a() : 0;
   }

   public final int ap() {
      return cfy.c(this.s);
   }

   public final int aq() {
      return cfx.b(this.s);
   }

   public final int ar() {
      return cfx.c(this.s);
   }

   public final int as() {
      RecyclerView var1 = this.s;
      return var1 != null ? var1.getPaddingBottom() : 0;
   }

   public final int at() {
      RecyclerView var1 = this.s;
      return var1 != null ? var1.getPaddingLeft() : 0;
   }

   public final int au() {
      RecyclerView var1 = this.s;
      return var1 != null ? var1.getPaddingRight() : 0;
   }

   public final int av() {
      RecyclerView var1 = this.s;
      return var1 != null ? var1.getPaddingTop() : 0;
   }

   public final View ax(View var1) {
      RecyclerView var2 = this.s;
      if (var2 == null) {
         return null;
      } else {
         var1 = var2.j(var1);
         if (var1 == null) {
            return null;
         } else {
            return this.r.k(var1) ? null : var1;
         }
      }
   }

   public final View ay(int var1) {
      ju var2 = this.r;
      return var2 != null ? var2.e(var1) : null;
   }

   public final View az() {
      RecyclerView var1 = this.s;
      if (var1 == null) {
         return null;
      } else {
         View var2 = var1.getFocusedChild();
         return var2 != null && !this.r.k(var2) ? var2 : null;
      }
   }

   public int b(mc var1, mk var2) {
      RecyclerView var3 = this.s;
      if (var3 != null) {
         lq var4 = var3.m;
         if (var4 != null && this.X()) {
            return var4.a();
         }
      }

      return 1;
   }

   public final boolean ba() {
      mj var1 = this.t;
      return var1 != null && var1.f;
   }

   public boolean bb(RecyclerView var1, View var2, Rect var3, boolean var4, boolean var5) {
      int var8 = this.at();
      int var7 = this.av();
      int var10 = this.C;
      int var16 = this.au();
      int var14 = this.D;
      int var15 = this.as();
      int var9 = var2.getLeft() + var3.left - var2.getScrollX();
      int var13 = var2.getTop() + var3.top - var2.getScrollY();
      int var17 = var3.width();
      int var6 = var3.height();
      int var12 = var9 - var8;
      int var11 = var13 - var7;
      byte var20 = 0;
      var7 = Math.min(0, var12);
      var16 = var17 + var9 - (var10 - var16);
      var9 = Math.min(0, var11);
      var10 = Math.max(0, var16);
      var13 = Math.max(0, var6 + var13 - (var14 - var15));
      if (this.ap() == 1) {
         if (var10 != 0) {
            var6 = var10;
         } else {
            var6 = Math.max(var7, var16);
         }
      } else {
         var6 = var7;
         if (var7 == 0) {
            var6 = Math.min(var12, var10);
         }
      }

      if (var9 != 0) {
         var7 = var9;
      } else {
         var7 = Math.min(var11, var13);
      }

      if (var5) {
         View var19 = var1.getFocusedChild();
         if (var19 == null) {
            return false;
         }

         var10 = this.at();
         var9 = this.av();
         var12 = this.C;
         var13 = this.au();
         var14 = this.D;
         var11 = this.as();
         Rect var18 = this.s.k;
         RecyclerView.H(var19, var18);
         if (var18.left - var6 >= var12 - var13 || var18.right - var6 <= var10 || var18.top - var7 >= var14 - var11 || var18.bottom - var7 <= var9) {
            return false;
         }
      }

      if (var6 == 0) {
         if (var7 == 0) {
            return false;
         }

         var6 = var20;
      }

      if (var4) {
         var1.scrollBy(var6, var7);
      } else {
         var1.av(var6, var7);
      }

      return true;
   }

   public final boolean bc(View var1, int var2, int var3, ly var4) {
      return var1.isLayoutRequested() || !this.w || !aZ(var1.getWidth(), var2, var4.width) || !aZ(var1.getHeight(), var3, var4.height);
   }

   public int bj() {
      return 0;
   }

   public final void bl(View var1, Rect var2) {
      Rect var3 = ((ly)var1.getLayoutParams()).d;
      var2.set(-var3.left, -var3.top, var1.getWidth() + var3.right, var1.getHeight() + var3.bottom);
      if (this.s != null) {
         Matrix var4 = var1.getMatrix();
         if (var4 != null && !var4.isIdentity()) {
            RectF var5 = this.s.l;
            var5.set(var2);
            var4.mapRect(var5);
            var2.set((int)Math.floor((double)var5.left), (int)Math.floor((double)var5.top), (int)Math.ceil((double)var5.right), (int)Math.ceil((double)var5.bottom));
         }
      }

      var2.offset(var1.getLeft(), var1.getTop());
   }

   public void bn() {
   }

   public final void bo(int var1, int var2) {
      this.s.x(var1, var2);
   }

   public final void bp(Runnable var1) {
      RecyclerView var2 = this.s;
      if (var2 != null) {
         var2.removeCallbacks(var1);
      }

   }

   public final void bq(RecyclerView var1) {
      this.v = false;
      this.ai(var1);
   }

   public final boolean bv(int var1, Bundle var2) {
      if (this.s != null) {
         int var7 = this.D;
         int var8 = this.C;
         Rect var9 = new Rect();
         int var6 = var7;
         int var5 = var8;
         if (this.s.getMatrix().isIdentity()) {
            var6 = var7;
            var5 = var8;
            if (this.s.getGlobalVisibleRect(var9)) {
               var6 = var9.height();
               var5 = var9.width();
            }
         }

         switch(var1) {
         case 4096:
            if (this.s.canScrollVertically(1)) {
               var6 = var6 - this.av() - this.as();
            } else {
               var6 = 0;
            }

            if (this.s.canScrollHorizontally(1)) {
               var5 = var5 - this.at() - this.au();
            } else {
               var5 = 0;
            }
            break;
         case 8192:
            if (this.s.canScrollVertically(-1)) {
               var6 = -(var6 - this.av() - this.as());
            } else {
               var6 = 0;
            }

            if (this.s.canScrollHorizontally(-1)) {
               var5 = -(var5 - this.at() - this.au());
            } else {
               var5 = 0;
            }
            break;
         default:
            var6 = 0;
            var5 = 0;
         }

         var7 = var6;
         if (var6 == 0) {
            if (var5 == 0) {
               return false;
            }

            var7 = 0;
         }

         float var3;
         if (var2 != null) {
            var3 = var2.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0F);
            if (var3 < 0.0F) {
               return false;
            }
         } else {
            var3 = 1.0F;
         }

         if (Float.compare(var3, Float.POSITIVE_INFINITY) == 0) {
            RecyclerView var10 = this.s;
            lq var11 = var10.m;
            if (var11 == null) {
               return false;
            } else {
               switch(var1) {
               case 4096:
                  var10.af(var11.a() - 1);
                  break;
               case 8192:
                  var10.af(0);
               }

               return true;
            }
         } else {
            var6 = var7;
            var1 = var5;
            if (Float.compare(1.0F, var3) != 0) {
               var6 = var7;
               var1 = var5;
               if (Float.compare(0.0F, var3) != 0) {
                  float var4 = (float)var5;
                  var6 = (int)((float)var7 * var3);
                  var1 = (int)(var4 * var3);
               }
            }

            this.s.aw(var1, var6, true);
            return true;
         }
      } else {
         return false;
      }
   }

   public int d(int var1, mc var2, mk var3) {
      throw null;
   }

   public int e(int var1, mc var2, mk var3) {
      throw null;
   }

   public abstract ly f();

   public ly g(LayoutParams var1) {
      if (var1 instanceof ly) {
         return new ly((ly)var1);
      } else {
         return var1 instanceof MarginLayoutParams ? new ly((MarginLayoutParams)var1) : new ly(var1);
      }
   }

   public ly h(Context var1, AttributeSet var2) {
      return new ly(var1, var2);
   }

   public View j(View var1, int var2, mc var3, mk var4) {
      throw null;
   }

   public void m(mc var1, mk var2, cht var3) {
      if (this.s.canScrollVertically(-1) || this.s.canScrollHorizontally(-1)) {
         var3.g(8192);
         var3.w(true);
         var3.H();
      }

      if (this.s.canScrollVertically(1) || this.s.canScrollHorizontally(1)) {
         var3.g(4096);
         var3.w(true);
         var3.H();
      }

      var3.n(dmx.n(this.b(var1, var2), this.a(var1, var2), this.bj()));
   }

   public void n(mc var1, mk var2, View var3, cht var4) {
      int var5;
      if (this.X()) {
         var5 = bh(var3);
      } else {
         var5 = 0;
      }

      int var6;
      if (this.W()) {
         var6 = bh(var3);
      } else {
         var6 = 0;
      }

      var4.o(eze.Z(var5, 1, var6, 1, false));
   }

   public void o(mc var1, mk var2) {
      throw null;
   }

   public void p(mk var1) {
   }

   public void q(Rect var1, int var2, int var3) {
      int var8 = var1.width();
      int var6 = this.at();
      int var5 = this.au();
      int var4 = var1.height();
      int var7 = this.av();
      int var9 = this.as();
      this.aV(al(var2, var8 + var6 + var5, this.ar()), al(var3, var4 + var7 + var9, this.aq()));
   }

   public boolean s(ly var1) {
      return var1 != null;
   }

   public boolean t(int var1, Bundle var2) {
      RecyclerView var4 = this.s;
      mc var3 = var4.f;
      mk var5 = var4.M;
      return this.bv(var1, var2);
   }

   public boolean u() {
      throw null;
   }

   public void w(int var1, int var2) {
   }

   public void x() {
   }

   public void y(int var1, int var2) {
   }

   public void z(int var1, int var2) {
   }
}
