import com.google.babelfish.device.avenh.l2l.modelutils.androidmodelextractor.MtR.NgAyRSYlmLoD;

public final class bsn {
   public final bxg a;
   public final long b;
   public final bvc c;
   public final buy d;
   public final buz e;
   public final buq f;
   public final String g;
   public final long h;
   public final bws i;
   public final bxh j;
   public final bwe k;
   public final long l;
   public final bxd m;
   public final bdq n;
   public final gf o;

   // $FF: synthetic method
   public bsn(long var1, long var3, bvc var5, buy var6, buz var7, buq var8, String var9, long var10, bws var12, long var13, bdq var15) {
      this(car.ae(var1), var3, var5, var6, var7, var8, var9, var10, var12, (bxh)null, (bwe)null, var13, (bxd)null, var15, (gf)null);
   }

   // $FF: synthetic method
   public bsn(bvc var1, buy var2, buz var3, buq var4, long var5, bws var7, long var8, int var10) {
      long var11;
      if ((var10 & 1) != 0) {
         var11 = bcy.f;
      } else {
         var11 = 0L;
      }

      long var13;
      if ((var10 & 2) != 0) {
         var13 = bxz.a;
      } else {
         var13 = 0L;
      }

      if ((var10 & 4) != 0) {
         var1 = null;
      }

      if ((var10 & 8) != 0) {
         var2 = null;
      }

      if ((var10 & 16) != 0) {
         var3 = null;
      }

      if ((var10 & 32) != 0) {
         var4 = null;
      }

      if ((var10 & 128) != 0) {
         var5 = bxz.a;
      }

      if ((var10 & 256) != 0) {
         var7 = null;
      }

      if ((var10 & 2048) != 0) {
         var8 = bcy.f;
      }

      this(var11, var13, var1, var2, var3, var4, (String)null, var5, var7, var8, (bdq)null);
   }

   public bsn(bxg var1, long var2, bvc var4, buy var5, buz var6, buq var7, String var8, long var9, bws var11, bxh var12, bwe var13, long var14, bxd var16, bdq var17, gf var18) {
      var1.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      this.f = var7;
      this.g = var8;
      this.h = var9;
      this.i = var11;
      this.j = var12;
      this.k = var13;
      this.l = var14;
      this.m = var16;
      this.n = var17;
      this.o = var18;
   }

   public final float a() {
      return this.a.a();
   }

   public final long b() {
      return this.a.b();
   }

   public final bsn c(bsn var1) {
      long var2 = var1.a.b();
      var1.a.a();
      return bso.a(this, var2, var1.b, var1.c, var1.d, var1.e, var1.f, var1.g, var1.h, var1.i, var1.j, var1.k, var1.l, var1.m, var1.n, var1.o);
   }

   public final boolean d(bsn var1) {
      var1.getClass();
      if (this == var1) {
         return true;
      } else if (!c.o(this.b, var1.b)) {
         return false;
      } else if (!c.E(this.c, var1.c)) {
         return false;
      } else if (!c.E(this.d, var1.d)) {
         return false;
      } else if (!c.E(this.e, var1.e)) {
         return false;
      } else if (!c.E(this.f, var1.f)) {
         return false;
      } else if (!c.E(this.g, var1.g)) {
         return false;
      } else if (!c.o(this.h, var1.h)) {
         return false;
      } else if (!c.E(this.i, var1.i)) {
         return false;
      } else if (!c.E(this.j, var1.j)) {
         return false;
      } else if (!c.E(this.k, var1.k)) {
         return false;
      } else if (!c.o(this.l, var1.l)) {
         return false;
      } else {
         return c.E((Object)null, (Object)null);
      }
   }

   public final boolean e(bsn var1) {
      var1.getClass();
      if (!c.E(this.a, var1.a)) {
         return false;
      } else if (!c.E(this.m, var1.m)) {
         return false;
      } else if (!c.E(this.n, var1.n)) {
         return false;
      } else {
         return c.E(this.o, var1.o);
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bsn)) {
         return false;
      } else {
         bsn var2 = (bsn)var1;
         return this.d(var2) && this.e(var2);
      }
   }

   public final int hashCode() {
      int var13 = c.p(this.b());
      int var12 = Float.floatToIntBits(this.a());
      int var14 = car.H(this.b);
      bvc var17 = this.c;
      int var11 = 0;
      int var1;
      if (var17 != null) {
         var1 = var17.p;
      } else {
         var1 = 0;
      }

      buy var18 = this.d;
      int var2;
      if (var18 != null) {
         var2 = var18.a;
      } else {
         var2 = 0;
      }

      byte var3;
      if (this.e != null) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      buq var19 = this.f;
      int var4;
      if (var19 != null) {
         var4 = var19.hashCode();
      } else {
         var4 = 0;
      }

      String var20 = this.g;
      int var5;
      if (var20 != null) {
         var5 = var20.hashCode();
      } else {
         var5 = 0;
      }

      int var15 = car.H(this.h);
      int var6;
      if (this.i != null) {
         var6 = Float.floatToIntBits(0.0F);
      } else {
         var6 = 0;
      }

      bxh var21 = this.j;
      int var7;
      if (var21 != null) {
         var7 = var21.hashCode();
      } else {
         var7 = 0;
      }

      bwe var22 = this.k;
      int var8;
      if (var22 != null) {
         var8 = var22.hashCode();
      } else {
         var8 = 0;
      }

      int var16 = c.p(this.l);
      bxd var23 = this.m;
      int var9;
      if (var23 != null) {
         var9 = var23.d;
      } else {
         var9 = 0;
      }

      bdq var24 = this.n;
      int var10;
      if (var24 != null) {
         var10 = var24.hashCode();
      } else {
         var10 = 0;
      }

      gf var25 = this.o;
      if (var25 != null) {
         var11 = var25.hashCode();
      }

      return ((((((((((((((var13 * 961 + var12) * 31 + var14) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var15) * 31 + var6) * 31 + var7) * 31 + var8) * 31 + var16) * 31 + var9) * 31 + var10) * 961 + var11;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SpanStyle(color=");
      var1.append(bcy.h(this.b()));
      var1.append(", brush=");
      var1.append((Object)null);
      var1.append(", alpha=");
      var1.append(this.a());
      var1.append(", fontSize=");
      var1.append(bxz.d(this.b));
      var1.append(", fontWeight=");
      var1.append(this.c);
      var1.append(", fontStyle=");
      var1.append(this.d);
      var1.append(", fontSynthesis=");
      var1.append(this.e);
      var1.append(", fontFamily=");
      var1.append(this.f);
      var1.append(", fontFeatureSettings=");
      var1.append(this.g);
      var1.append(", letterSpacing=");
      var1.append(bxz.d(this.h));
      var1.append(", baselineShift=");
      var1.append(this.i);
      var1.append(", textGeometricTransform=");
      var1.append(this.j);
      var1.append(NgAyRSYlmLoD.axgO);
      var1.append(this.k);
      var1.append(", background=");
      var1.append(bcy.h(this.l));
      var1.append(", textDecoration=");
      var1.append(this.m);
      var1.append(", shadow=");
      var1.append(this.n);
      var1.append(", platformStyle=");
      var1.append((Object)null);
      var1.append(", drawStyle=");
      var1.append(this.o);
      var1.append(')');
      return var1.toString();
   }
}
