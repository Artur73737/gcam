import java.util.List;

public final class bmj extends bke implements bjs, bkw {
   public boolean f;
   public int g;
   public int h;
   public boolean i;
   public boolean j;
   public boolean k;
   public long l;
   public qvt m;
   public boolean n;
   public Object o;
   public boolean p;
   public final bkv q;
   public boolean r;
   public boolean s;
   public float t;
   public final bml u;
   public int v;
   private final axf w;

   public bmj(bml var1) {
      this.u = var1;
      this.g = Integer.MAX_VALUE;
      this.h = Integer.MAX_VALUE;
      this.v = 3;
      this.l = bxw.a;
      this.n = true;
      this.q = new bme(this);
      this.w = new axf(new bmj[16]);
      this.r = true;
   }

   private final void x() {
      boolean var4 = this.p;
      this.p = true;
      bmd var6 = this.u.a;
      if (!var4) {
         if (var6.ac()) {
            bmd.ap(var6, true, 2);
         } else if (var6.ab()) {
            bmd.an(var6, true, 2);
         }
      }

      bmz var5 = var6.s();

      for(bmz var7 = var6.r().o; !c.E(var5, var7) && var5 != null; var5 = var5.o) {
         if (var5.s) {
            var5.Y();
         }
      }

      axf var8 = var6.m();
      int var3 = var8.b;
      if (var3 > 0) {
         Object[] var9 = var8.a;
         int var1 = 0;

         int var2;
         do {
            bmd var10 = (bmd)var9[var1];
            if (var10.j() != Integer.MAX_VALUE) {
               var10.q().x();
               var6.V(var10);
            }

            var2 = var1 + 1;
            var1 = var2;
         } while(var2 < var3);
      }

   }

   public final bkv a() {
      return this.q;
   }

   public final bkw b() {
      bmd var1 = this.u.a.n();
      if (var1 != null) {
         bml var2 = var1.o;
         if (var2 != null) {
            return var2.n;
         }
      }

      return null;
   }

   public final Object c() {
      return this.o;
   }

   public final bmz d() {
      return this.u.a.r();
   }

   public final void e(qvt var1) {
      axf var5 = this.u.a.m();
      int var4 = var5.b;
      if (var4 > 0) {
         Object[] var6 = var5.a;
         int var2 = 0;

         int var3;
         do {
            var1.eo(((bmd)var6[var2]).o.n);
            var3 = var2 + 1;
            var2 = var3;
         } while(var3 < var4);
      }

   }

   public final void f() {
      this.s = true;
      this.q.g();
      bml var4 = this.u;
      int var1;
      if (var4.d) {
         axf var5 = var4.a.m();
         int var3 = var5.b;
         if (var3 > 0) {
            Object[] var6 = var5.a;
            var1 = 0;

            int var2;
            do {
               bmd var9 = (bmd)var6[var1];
               if (var9.ac() && var9.ah() == 1 && bmd.al(var9)) {
                  bmd.ap(var4.a, false, 3);
               }

               var2 = var1 + 1;
               var1 = var2;
            } while(var2 < var3);
         }
      }

      if (this.u.e || !this.k && !this.d().i && this.u.d) {
         var4 = this.u;
         var4.d = false;
         var1 = var4.p;
         var4.p = 3;
         var4.i(false);
         bmd var7 = this.u.a;
         bmg.a(var7).j.b(var7, false, new us(this, var7, 11));
         this.u.p = var1;
         if (this.d().i && this.u.k) {
            this.g();
         }

         this.u.e = false;
      }

      bkv var8 = this.q;
      if (var8.d) {
         var8.e = true;
      }

      if (var8.b && var8.j()) {
         this.q.f();
      }

      this.s = false;
   }

   public final void g() {
      bmd.ao(this.u.a);
   }

   public final void h() {
      bmd.ap(this.u.a, false, 3);
   }

   public final boolean i() {
      return this.p;
   }

   public final List j() {
      this.u.a.Y();
      if (!this.r) {
         return this.w.e();
      } else {
         bmd var5 = this.u.a;
         axf var4 = this.w;
         axf var6 = var5.m();
         int var3 = var6.b;
         if (var3 > 0) {
            Object[] var8 = var6.a;
            int var1 = 0;

            int var2;
            do {
               bmd var7 = (bmd)var8[var1];
               if (var4.b <= var1) {
                  var4.p(var7.o.n);
               } else {
                  var4.d(var1, var7.o.n);
               }

               var2 = var1 + 1;
               var1 = var2;
            } while(var2 < var3);
         }

         var4.i(var5.y().size(), var4.b);
         this.r = false;
         return this.w.e();
      }
   }

   public final void k() {
      if (this.p) {
         int var1 = 0;
         this.p = false;
         axf var4 = this.u.a.m();
         int var3 = var4.b;
         if (var3 > 0) {
            Object[] var5 = var4.a;

            int var2;
            do {
               ((bmd)var5[var1]).q().k();
               var2 = var1 + 1;
               var1 = var2;
            } while(var2 < var3);
         }
      }

   }

   public final bke l(long var1) {
      bmd var6 = this.u.a;
      if (var6.r == 3) {
         var6.A();
      }

      bml var9 = this.u;
      boolean var5 = var9.k(var9.a);
      byte var3 = 1;
      if (var5) {
         this.i = true;
         this.q(var1);
         bmh var10 = this.u.o;
         var10.getClass();
         var10.u();
         var10.l(var1);
      }

      bmd var7 = this.u.a;
      var6 = var7.n();
      if (var6 != null) {
         if (this.v != 3 && !var7.m) {
            throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
         }

         int var4 = var6.ag();
         if (var4 == 0) {
            throw null;
         }

         switch(var4 - 1) {
         case 1:
         default:
            StringBuilder var11 = new StringBuilder();
            var11.append("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
            int var8 = var6.ag();
            var11.append(jl.k(var8));
            throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(jl.k(var8)));
         case 2:
            var3 = 2;
         case 0:
            this.v = var3;
         }
      } else {
         this.v = 3;
      }

      this.u(var1);
      return this;
   }

   public final int m(bir var1) {
      bmd var3 = this.u.a.n();
      if (var3 != null && var3.ag() == 1) {
         this.q.c = true;
      } else {
         var3 = this.u.a.n();
         if (var3 != null && var3.ag() == 3) {
            this.q.d = true;
         }
      }

      this.k = true;
      int var2 = this.u.a().m(var1);
      this.k = false;
      return var2;
   }

   public final int n() {
      return this.u.a().n();
   }

   public final int o() {
      return this.u.a().o();
   }

   public final void r(long var1, qvt var3) {
      bml var4;
      if (!c.o(var1, this.l)) {
         var4 = this.u;
         if (var4.l || var4.k) {
            var4.d = true;
         }

         this.s();
      }

      var4 = this.u;
      if (var4.k(var4.a)) {
         bxy var6 = bkd.a;
         bml var5 = this.u;
         bmh var7 = var5.o;
         var7.getClass();
         bmd var8 = var5.a.n();
         if (var8 != null) {
            var8.o.i = 0;
         }

         var7.h = Integer.MAX_VALUE;
         bkd.b(var7, bxw.a(var1), bxw.b(var1));
      }

      this.v(var1, var3);
   }

   public final void s() {
      bml var4 = this.u;
      if (var4.m > 0) {
         axf var7 = var4.a.m();
         int var3 = var7.b;
         if (var3 > 0) {
            Object[] var8 = var7.a;
            int var1 = 0;

            int var2;
            do {
               bmd var6 = (bmd)var8[var1];
               bml var5 = var6.o;
               if ((var5.k || var5.l) && !var5.d) {
                  bmd.ao(var6);
               }

               var5.n.s();
               var2 = var1 + 1;
               var1 = var2;
            } while(var2 < var3);
         }
      }

   }

   public final void t() {
      bmd var3 = this.u.a.n();
      this.d();
      bmd var4 = this.u.a;
      bmz var2 = var4.s();

      for(bmz var6 = var4.r(); var2 != var6; var2 = ((blx)var2).o) {
         var2.getClass();
      }

      if (!this.p) {
         if (var3 != null) {
            var3.G();
         }

         this.x();
      }

      if (var3 != null) {
         if (!this.f && var3.ag() == 3) {
            if (this.h != Integer.MAX_VALUE) {
               throw new IllegalStateException("Place was called on a node which was placed already");
            }

            bml var5 = var3.o;
            int var1 = var5.j;
            this.h = var1;
            var5.j = var1 + 1;
         }
      } else {
         this.h = 0;
      }

      this.f();
   }

   public final boolean u(long var1) {
      boa var8 = bmg.a(this.u.a);
      bmd var7 = this.u.a;
      bmd var9 = var7.n();
      boolean var3 = var7.m;
      boolean var4 = false;
      if (!var3) {
         if (var9 != null && var9.m) {
            var3 = true;
         } else {
            var3 = false;
         }
      } else {
         var3 = true;
      }

      var7.m = var3;
      if (!var7.ac() && c.o(super.d, var1)) {
         var8.e(this.u.a, false);
         this.u.a.W();
         return false;
      } else {
         this.q.f = false;
         this.e(axa.u);
         this.i = true;
         long var5 = this.u.a().c;
         this.q(var1);
         bml var10 = this.u;
         if (var10.p == 5) {
            var10.p = 1;
            var10.c = false;
            bmg.a(var10.a).j.c(var10.a, false, new bmk(var10, var1, 2));
            if (var10.p == 1) {
               var10.d();
               var10.p = 5;
            }

            if (c.o(this.u.a().c, var5) && this.u.a().a == super.a) {
               if (this.u.a().b != super.b) {
                  var3 = true;
               } else {
                  var3 = var4;
               }
            } else {
               var3 = true;
            }

            this.p(car.I(this.u.a().a, this.u.a().b));
            return var3;
         } else {
            throw new IllegalStateException("layout state is not idle before measure starts");
         }
      }
   }

   public final void v(long var1, qvt var3) {
      bml var6 = this.u;
      var6.p = 3;
      this.l = var1;
      this.m = var3;
      this.j = true;
      boa var7 = bmg.a(var6.a);
      var6 = this.u;
      if (!var6.d && this.p) {
         bmz var8 = var6.a();
         long var4 = var8.e;
         var8.al(car.K(bxw.a(var1) + bxw.a(var4), bxw.b(var1) + bxw.b(var4)), var3);
         this.t();
      } else {
         this.q.g = false;
         var6.h(false);
         bng var9 = var7.j;
         var6 = this.u;
         var9.a(var6.a, false, new bmi(var3, var6, var1));
      }

      this.u.p = 5;
   }

   public final void w() {
      this.v = 3;
   }
}
