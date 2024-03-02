import android.graphics.Shader;

public final class bet implements bev {
   public final ber a;
   public final bes b;
   private bco c;
   private bco d;

   public bet() {
      this.a = new ber(beu.a, bxy.a, new bew(), bcl.a);
      this.b = new bes(this);
   }

   public static final long n(long var0, float var2) {
      return var2 == 1.0F ? var0 : bcy.i(var0, bcy.a(var0) * var2);
   }

   // $FF: synthetic method
   public static bco o(bet var0, long var1, gf var3, float var4, int var5) {
      bco var6 = var0.u(var3);
      var1 = n(var1, var4);
      if (!c.o(var6.g(), var1)) {
         var6.j(var1);
      }

      if (var6.c != null) {
         var6.l((Shader)null);
      }

      if (!c.E(var6.d, (Object)null)) {
         var6.z((dmw)null);
      }

      if (!c.n(var6.a, var5)) {
         var6.i(var5);
      }

      if (!c.n(var6.d(), 1)) {
         var6.k(1);
      }

      return var6;
   }

   // $FF: synthetic method
   public static bco p(bet var0, bcu var1, gf var2, float var3, int var4) {
      return var0.v(var1, var2, var3, (dmw)null, var4, 1);
   }

   private final bco u(gf var1) {
      bco var7;
      if (c.E(var1, bex.a)) {
         var7 = this.c;
         if (var7 == null) {
            var7 = eu.h();
            var7.q(0);
            this.c = var7;
         }
      } else {
         if (!(var1 instanceof bey)) {
            throw new qse();
         }

         bco var6 = this.l();
         float var3 = var6.c();
         bey var8 = (bey)var1;
         float var2 = var8.a;
         if (var3 != var2) {
            var6.p(var2);
         }

         int var4 = var6.e();
         int var5 = var8.c;
         if (!c.n(var4, var5)) {
            var6.m(var5);
         }

         var2 = var6.b();
         var3 = var8.b;
         if (var2 != var3) {
            var6.o(var3);
         }

         var4 = var6.f();
         var5 = var8.d;
         if (!c.n(var4, var5)) {
            var6.n(var5);
         }

         if (!c.E((Object)null, (Object)null)) {
            var6.r();
            return var6;
         }

         var7 = var6;
      }

      return var7;
   }

   private final bco v(bcu var1, gf var2, float var3, dmw var4, int var5, int var6) {
      bco var7 = this.u(var2);
      if (var1 != null) {
         var1.a(gf.l(this), var7, var3);
      } else if (var7.a() != var3) {
         var7.h(var3);
      }

      if (!c.E(var7.d, var4)) {
         var7.z(var4);
      }

      if (!c.n(var7.a, var5)) {
         var7.i(var5);
      }

      if (!c.n(var7.d(), var6)) {
         var7.k(var6);
      }

      return var7;
   }

   public final float a() {
      return this.a.a.a();
   }

   public final float b() {
      return this.a.a.b();
   }

   // $FF: synthetic method
   public final float eF(float var1) {
      return car.P(this, var1);
   }

   // $FF: synthetic method
   public final float eG(int var1) {
      return car.Q(this, var1);
   }

   // $FF: synthetic method
   public final float eH(long var1) {
      return car.R(this, var1);
   }

   // $FF: synthetic method
   public final float eI(float var1) {
      return car.S(this, var1);
   }

   // $FF: synthetic method
   public final int eJ(float var1) {
      return car.T(this, var1);
   }

   // $FF: synthetic method
   public final long eK(long var1) {
      return car.U(this, var1);
   }

   // $FF: synthetic method
   public final long i() {
      throw null;
   }

   // $FF: synthetic method
   public final long j() {
      return gf.l(this);
   }

   public final bxy k() {
      return this.a.b;
   }

   public final bco l() {
      bco var2 = this.d;
      bco var1 = var2;
      if (var2 == null) {
         var1 = eu.h();
         var1.q(1);
         this.d = var1;
      }

      return var1;
   }

   public final bes m() {
      return this.b;
   }

   public final void q(long var1, long var3, long var5, float var7, gf var8, int var9) {
      var8.getClass();
      this.a.c.k(bci.b(var3), bci.c(var3), bci.b(var3) + bcl.c(var5), bci.c(var3) + bcl.a(var5), o(this, var1, var8, var7, var9));
   }

   public final void r(bbf var1, long var2, gf var4) {
      throw null;
   }

   public final void s(bbf var1, bcu var2, float var3, gf var4) {
      var1.getClass();
      var4.getClass();
      this.a.c.q(var1, p(this, var2, var4, var3, 3));
   }

   public final void t(dmx var1, long var2, long var4, long var6, long var8, float var10, gf var11, dmw var12, int var13, int var14) {
      var11.getClass();
      this.a.c.s(var1, var2, var4, var6, var8, this.v((bcu)null, var11, var10, var12, var13, var14));
   }
}
