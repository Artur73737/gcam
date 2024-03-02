public final class bmh extends bke implements bjs, bkw {
   public boolean f;
   public int g;
   public int h;
   public boolean i;
   public boolean j;
   public bxq k;
   public long l;
   public boolean m;
   public final bkv n;
   public final axf o;
   public boolean p;
   public boolean q;
   public boolean r;
   public Object s;
   public final bml t;
   public int u;
   private boolean v;

   public bmh(bml var1) {
      this.t = var1;
      this.g = Integer.MAX_VALUE;
      this.h = Integer.MAX_VALUE;
      this.u = 3;
      this.l = bxw.a;
      this.n = new bmm(this);
      this.o = new axf(new bmh[16]);
      this.p = true;
      this.r = true;
      this.s = var1.n.o;
   }

   private final void v() {
      boolean var4 = this.m;
      this.m = true;
      if (!var4) {
         bml var5 = this.t;
         if (var5.f) {
            bmd.an(var5.a, true, 2);
         }
      }

      axf var8 = this.t.a.m();
      int var3 = var8.b;
      if (var3 > 0) {
         Object[] var7 = var8.a;
         int var1 = 0;

         int var2;
         do {
            bmd var6 = (bmd)var7[var1];
            if (var6.j() != Integer.MAX_VALUE) {
               bmh var9 = var6.p();
               var9.getClass();
               var9.v();
               var6.V(var6);
            }

            var2 = var1 + 1;
            var1 = var2;
         } while(var2 < var3);
      }

   }

   public final bkv a() {
      return this.n;
   }

   public final bkw b() {
      bmd var1 = this.t.a.n();
      if (var1 != null) {
         bml var2 = var1.o;
         if (var2 != null) {
            return var2.o;
         }
      }

      return null;
   }

   public final Object c() {
      return this.s;
   }

   public final bmz d() {
      return this.t.a.r();
   }

   public final void e(qvt var1) {
      axf var5 = this.t.a.m();
      int var4 = var5.b;
      if (var4 > 0) {
         Object[] var6 = var5.a;
         int var2 = 0;

         int var3;
         do {
            bmh var7 = ((bmd)var6[var2]).o.o;
            var7.getClass();
            var1.eo(var7);
            var3 = var2 + 1;
            var2 = var3;
         } while(var3 < var4);
      }

   }

   public final void f() {
      this.q = true;
      this.n.g();
      bml var4 = this.t;
      int var1;
      if (var4.g) {
         axf var5 = var4.a.m();
         int var3 = var5.b;
         if (var3 > 0) {
            Object[] var10 = var5.a;
            var1 = 0;

            int var2;
            do {
               bmd var6 = (bmd)var10[var1];
               if (var6.ab() && var6.ai() == 1) {
                  bmh var13 = var6.o.o;
                  var13.getClass();
                  bxq var7 = this.k;
                  var7.getClass();
                  if (var13.t(var7.b)) {
                     bmd.an(var4.a, false, 3);
                  }
               }

               var2 = var1 + 1;
               var1 = var2;
            } while(var2 < var3);
         }
      }

      bmo var8 = ((bls)this.d()).g;
      var8.getClass();
      bml var11 = this.t;
      if (var11.h || !this.i && !var8.i && var11.g) {
         var11.g = false;
         var1 = var11.p;
         var11.p = 4;
         boa var12 = bmg.a(var11.a);
         this.t.i(false);
         var12.j.b(this.t.a, true, new us(this, var8, 10, (byte[])null));
         var11 = this.t;
         var11.p = var1;
         if (var11.k && var8.i) {
            this.g();
         }

         this.t.h = false;
      }

      bkv var9 = this.n;
      if (var9.d) {
         var9.e = true;
      }

      if (var9.b && var9.j()) {
         this.n.f();
      }

      this.q = false;
   }

   public final void g() {
      bmd.am(this.t.a);
   }

   public final void h() {
      bmd.an(this.t.a, false, 3);
   }

   public final boolean i() {
      return this.m;
   }

   public final void j() {
      if (this.m) {
         int var1 = 0;
         this.m = false;
         axf var4 = this.t.a.m();
         int var3 = var4.b;
         if (var3 > 0) {
            Object[] var5 = var4.a;

            int var2;
            do {
               bmh var6 = ((bmd)var5[var1]).o.o;
               var6.getClass();
               var6.j();
               var2 = var1 + 1;
               var1 = var2;
            } while(var2 < var3);
         }
      }

   }

   public final void k() {
      bml var4 = this.t;
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
                  bmd.am(var6);
               }

               bmh var9 = var5.o;
               if (var9 != null) {
                  var9.k();
               }

               var2 = var1 + 1;
               var1 = var2;
            } while(var2 < var3);
         }
      }

   }

   public final bke l(long var1) {
      byte var3;
      bmd var5;
      label49: {
         var5 = this.t.a.n();
         var3 = 2;
         if (var5 == null || var5.ag() != 2) {
            var5 = this.t.a.n();
            if (var5 == null || var5.ag() != 4) {
               break label49;
            }
         }

         this.t.b = false;
      }

      bmd var6 = this.t.a;
      var5 = var6.n();
      if (var5 != null) {
         if (this.u != 3 && !var6.m) {
            throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
         }

         int var4 = var5.ag();
         if (var4 == 0) {
            throw null;
         }

         switch(var4 - 1) {
         case 0:
         case 1:
            var3 = 1;
         case 2:
         case 3:
            this.u = var3;
            break;
         default:
            StringBuilder var8 = new StringBuilder();
            var8.append("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
            int var7 = var5.ag();
            var8.append(jl.k(var7));
            throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(jl.k(var7)));
         }
      } else {
         this.u = 3;
      }

      var5 = this.t.a;
      if (var5.r == 3) {
         var5.A();
      }

      this.t(var1);
      return this;
   }

   public final int m(bir var1) {
      bmd var3 = this.t.a.n();
      if (var3 != null && var3.ag() == 2) {
         this.n.c = true;
      } else {
         var3 = this.t.a.n();
         if (var3 != null && var3.ag() == 4) {
            this.n.d = true;
         }
      }

      this.i = true;
      bmo var4 = this.t.a().u();
      var4.getClass();
      int var2 = var4.m(var1);
      this.i = false;
      return var2;
   }

   public final int n() {
      bmo var1 = this.t.a().u();
      var1.getClass();
      return var1.n();
   }

   public final int o() {
      bmo var1 = this.t.a().u();
      var1.getClass();
      return var1.o();
   }

   public final void r(long var1, qvt var3) {
      bml var5 = this.t;
      var5.p = 4;
      this.j = true;
      if (!c.o(var1, this.l)) {
         if (var5.l || var5.k) {
            var5.g = true;
         }

         this.k();
      }

      boa var4 = bmg.a(this.t.a);
      var5 = this.t;
      if (!var5.g && this.m) {
         this.s();
      } else {
         var5.h(false);
         this.n.g = false;
         bng var6 = var4.j;
         bml var7 = this.t;
         var6.a(var7.a, true, new bmk(var7, var1, 1));
      }

      this.l = var1;
      this.t.p = 5;
   }

   public final void s() {
      bmd var2 = this.t.a.n();
      if (!this.m) {
         this.v();
      }

      if (var2 != null) {
         if (!this.f && (var2.ag() == 3 || var2.ag() == 4)) {
            if (this.h != Integer.MAX_VALUE) {
               throw new IllegalStateException("Place was called on a node which was placed already");
            }

            bml var3 = var2.o;
            int var1 = var3.i;
            this.h = var1;
            var3.i = var1 + 1;
         }
      } else {
         this.h = 0;
      }

      this.f();
   }

   public final boolean t(long var1) {
      bmd var6 = this.t.a;
      bmd var7 = var6.n();
      boolean var3;
      if (!var6.m) {
         if (var7 != null && var7.m) {
            var3 = true;
         } else {
            var3 = false;
         }
      } else {
         var3 = true;
      }

      var6.m = var3;
      if (!var6.ab()) {
         bxq var8 = this.k;
         if (var8 != null && c.o(var8.b, var1)) {
            var7 = this.t.a;
            boa var10 = var7.s;
            if (var10 != null) {
               var10.e(var7, true);
            }

            this.t.a.W();
            return false;
         }
      }

      this.k = bxq.e(var1);
      this.n.f = false;
      this.e(axa.r);
      long var4;
      if (this.v) {
         var4 = super.c;
      } else {
         var4 = car.I(Integer.MIN_VALUE, Integer.MIN_VALUE);
      }

      this.v = true;
      bmo var9 = this.t.a().u();
      if (var9 != null) {
         bml var11 = this.t;
         var11.p = 2;
         var11.f = false;
         bmg.a(var11.a).j.c(var11.a, true, new bmk(var11, var1, 0));
         var11.e();
         if (var11.k(var11.a)) {
            var11.d();
         } else {
            var11.f();
         }

         var11.p = 5;
         this.p(car.I(var9.a, var9.b));
         return bxx.b(var4) != var9.a || bxx.a(var4) != var9.b;
      } else {
         throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
      }
   }

   public final void u() {
      this.u = 3;
   }
}
