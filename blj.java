import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class blj {
   public final Object a;
   public final Object b;

   public blj() {
      this.a = new bli();
      this.b = new bli();
   }

   public blj(TextView var1) {
      this.a = var1;
      this.b = new gfv(var1);
   }

   public blj(bjf var1) {
      this.b = var1;
      this.a = new bhk();
   }

   public blj(Object var1) {
      this.a = sg.d(var1);
      sg.d(var1);
      this.b = sg.d(false);
   }

   public blj(Object var1, Object var2) {
      this.b = var1;
      this.a = var2;
   }

   public blj(nt var1) {
      this.b = var1;
      this.a = new lft((byte[])null);
   }

   public blj(pi var1, pr var2) {
      this.a = var1;
      this.b = var2;
   }

   public blj(xl var1, blj var2) {
      this.a = var1;
      this.b = var2;
   }

   public blj(zt var1, rbd var2) {
      var1.getClass();
      super();
      this.a = var1;
      this.b = var2;
   }

   public blj(byte[] var1, byte[] var2) {
      this.a = new awy();
      this.b = new awy();
   }

   public blj(byte[] var1, char[] var2) {
      this.a = new Object();
      this.b = new LinkedHashMap();
   }

   public blj(char[] var1) {
      this.a = new AtomicReference((Object)null);
      this.b = rjp.a();
   }

   public blj(char[] var1, byte[] var2) {
      this.b = new xo();
      this.a = new xl();
   }

   // $FF: synthetic method
   public static Object x(blj var0, qvt var1, que var2) {
      return qzy.g(new zv(zt.a, var0, var1, (que)null), var2);
   }

   public final void a(bmd var1, boolean var2) {
      if (var2) {
         ((bli)this.a).b(var1);
      } else {
         if (!((bli)this.a).a.contains(var1)) {
            ((bli)this.b).b(var1);
         }

      }
   }

   public final boolean b() {
      return ((bli)this.b).c() && ((bli)this.a).c();
   }

   public final boolean c() {
      return !this.b();
   }

   public final boolean d(bmd var1, boolean var2) {
      var1.getClass();
      if (var2) {
         var2 = ((bli)this.a).d(var1);
      } else {
         var2 = ((bli)this.b).d(var1);
      }

      return var2;
   }

   public final void e(bmd var1) {
      ((bli)this.a).d(var1);
      ((bli)this.b).d(var1);
   }

   public final boolean f(long var1) {
      Object var6 = ((blj)this.b).b;
      int var4 = ((List)var6).size();
      int var3 = 0;

      Object var5;
      while(true) {
         if (var3 >= var4) {
            var5 = null;
            break;
         }

         var5 = ((List)var6).get(var3);
         if (c.o(((bhy)var5).a, var1)) {
            break;
         }

         ++var3;
      }

      bhy var7 = (bhy)var5;
      return var7 != null ? var7.h : false;
   }

   public final boolean g() {
      return this.a != ays.a;
   }

   public final boolean h() {
      return this.b != ays.a;
   }

   public final blj i(Object var1) {
      return new blj(this.b, var1);
   }

   public final void j(boolean var1) {
      ((att)this.b).b(var1);
   }

   public final void k(String var1, int var2, boolean var3) {
      var1.getClass();
      Object var4 = this.a;
      synchronized(var4){}

      vd var9;
      try {
         var9 = (vd)((Map)this.b).get(qu.a(var1));
      } finally {
         ;
      }

      if (var9 != null) {
         wk var5 = var9.h;
         rg var13 = new rg(var2, var3);
         StringBuilder var10 = new StringBuilder();
         var10.append(var5);
         var10.append(" onGraphError(");
         var10.append(var13);
         var10.append(')');
         rga var6 = var5.g;

         Object var12;
         Object var14;
         do {
            var14 = var6.b();
            ja var11 = (ja)var14;
            if (!(var11 instanceof rk) && !(var11 instanceof rj)) {
               var12 = var13;
            } else {
               var12 = rj.a;
            }
         } while(!var6.e(var14, var12));

      }
   }

   public final lt l(mn var1, int var2) {
      int var3 = ((xo)this.b).c(var1);
      if (var3 < 0) {
         return null;
      } else {
         nu var5 = (nu)((xo)this.b).g(var3);
         if (var5 != null) {
            int var4 = var5.b;
            if ((var4 & var2) != 0) {
               var4 &= ~var2;
               var5.b = var4;
               lt var6;
               if (var2 == 4) {
                  var6 = var5.c;
               } else {
                  if (var2 != 8) {
                     throw new IllegalArgumentException("Must provide flag PRE or POST");
                  }

                  var6 = var5.d;
               }

               if ((var4 & 12) == 0) {
                  ((xo)this.b).e(var3);
                  nu.b(var5);
               }

               return var6;
            }
         }

         return null;
      }
   }

   public final void m(mn var1) {
      nu var2 = (nu)((xo)this.b).get(var1);
      nu var3;
      if (var2 == null) {
         var2 = nu.a();
         ((xo)this.b).put(var1, var2);
         var3 = var2;
      } else {
         var3 = var2;
      }

      var3.b |= 1;
   }

   public final void n(long var1, mn var3) {
      ((xl)this.a).g(var1, var3);
   }

   public final void o(mn var1, lt var2) {
      nu var3 = (nu)((xo)this.b).get(var1);
      nu var4;
      if (var3 == null) {
         var3 = nu.a();
         ((xo)this.b).put(var1, var3);
         var4 = var3;
      } else {
         var4 = var3;
      }

      var4.d = var2;
      var4.b |= 8;
   }

   public final void p(mn var1, lt var2) {
      nu var3 = (nu)((xo)this.b).get(var1);
      nu var4;
      if (var3 == null) {
         var3 = nu.a();
         ((xo)this.b).put(var1, var3);
         var4 = var3;
      } else {
         var4 = var3;
      }

      var4.c = var2;
      var4.b |= 4;
   }

   public final void q() {
      ((xo)this.b).clear();
      ((xl)this.a).f();
   }

   public final void r(mn var1) {
      nu var2 = (nu)((xo)this.b).get(var1);
      if (var2 != null) {
         var2.b &= -2;
      }
   }

   public final void s(mn var1) {
      for(int var2 = ((xl)this.a).b() - 1; var2 >= 0; --var2) {
         if (var1 == ((xl)this.a).e(var2)) {
            xl var6 = (xl)this.a;
            Object[] var3 = var6.c;
            Object var5 = var3[var2];
            Object var4 = xm.a;
            if (var5 != var4) {
               var3[var2] = var4;
               var6.a = true;
            }
            break;
         }
      }

      nu var7 = (nu)((xo)this.b).remove(var1);
      if (var7 != null) {
         nu.b(var7);
      }

   }

   public final boolean t(mn var1) {
      nu var2 = (nu)((xo)this.b).get(var1);
      return var2 != null && (var2.b & 1) != 0;
   }

   public final View u(int var1, int var2, int var3, int var4) {
      int var7 = ((nt)this.b).d();
      int var8 = ((nt)this.b).c();
      View var11 = null;

      byte var14;
      for(int var5 = var1; var5 != var2; var5 += var14) {
         View var12 = ((nt)this.b).e(var5);
         int var6 = ((nt)this.b).b(var12);
         int var9 = ((nt)this.b).a(var12);
         ((lft)this.a).d(var7, var8, var6, var9);
         ((lft)this.a).c();
         ((lft)this.a).b(var3);
         lft var13 = (lft)this.a;
         if (var13.e()) {
            return var12;
         }

         var13.c();
         ((lft)this.a).b(var4);
         boolean var10 = ((lft)this.a).e();
         var14 = 1;
         if (var10) {
            var11 = var12;
         }

         if (var2 <= var1) {
            var14 = -1;
         }
      }

      return var11;
   }

   public final boolean v(View var1) {
      Object var6 = this.a;
      int var4 = ((nt)this.b).d();
      int var2 = ((nt)this.b).c();
      int var5 = ((nt)this.b).b(var1);
      int var3 = ((nt)this.b).a(var1);
      ((lft)var6).d(var4, var2, var5, var3);
      ((lft)this.a).c();
      ((lft)this.a).b(24579);
      return ((lft)this.a).e();
   }

   public final void w(AttributeSet var1, int var2) {
      TypedArray var12 = ((TextView)this.a).getContext().obtainStyledAttributes(var1, fq.i, var2, 0);

      boolean var3;
      label72: {
         Throwable var10000;
         label76: {
            boolean var10001;
            boolean var4;
            try {
               var4 = var12.hasValue(14);
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               break label76;
            }

            var3 = true;
            if (!var4) {
               break label72;
            }

            label67:
            try {
               var3 = var12.getBoolean(14, true);
               break label72;
            } catch (Throwable var10) {
               var10000 = var10;
               var10001 = false;
               break label67;
            }
         }

         Throwable var5 = var10000;
         var12.recycle();
         throw var5;
      }

      var12.recycle();
      Object var13 = ((gfv)this.b).a;
      ckf.b();
      ((ckf)var13).a.a = var3;
   }
}
