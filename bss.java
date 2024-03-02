import com.google.android.libraries.memorymonitor.Xhk.PUdPFKr;

public final class bss {
   public static final bss a = new bss(0L, 0L, (bvc)null, (buy)null, (buq)null, (String)null, 0L, (bdq)null, 0L, 16777215);
   public final bsn b;
   public final bsh c;
   public final bsm d;

   // $FF: synthetic method
   public bss(long var1, long var3, bvc var5, buy var6, buq var7, String var8, long var9, bdq var11, long var12, int var14) {
      if ((var14 & 1) != 0) {
         var1 = bcy.f;
      }

      if ((var14 & 2) != 0) {
         var3 = bxz.a;
      }

      if ((var14 & 4) != 0) {
         var5 = null;
      }

      if ((var14 & 8) != 0) {
         var6 = null;
      }

      if ((var14 & 32) != 0) {
         var7 = null;
      }

      if ((var14 & 64) != 0) {
         var8 = null;
      }

      if ((var14 & 128) != 0) {
         var9 = bxz.a;
      }

      long var15;
      if ((var14 & 2048) != 0) {
         var15 = bcy.f;
      } else {
         var15 = 0L;
      }

      if ((var14 & 8192) != 0) {
         var11 = null;
      }

      if ((var14 & 131072) != 0) {
         var12 = bxz.a;
      }

      this(new bsn(var1, var3, var5, var6, (buz)null, var7, var8, var9, (bws)null, var15, var11), new bsh((bxc)null, (bxe)null, var12, (bxi)null, (bsk)null, (bxb)null, (bwz)null, (bwv)null, (bxj)null), (bsm)null);
   }

   public bss(bsn var1, bsh var2) {
      bsk var3 = var2.e;
      bsm var4;
      if (var3 == null) {
         var4 = null;
      } else {
         var4 = new bsm(var3);
      }

      this(var1, var2, var4);
   }

   public bss(bsn var1, bsh var2, bsm var3) {
      super();
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   // $FF: synthetic method
   public static bss u(bss var0, long var1, long var3, bvc var5, long var6, long var8, int var10) {
      if ((var10 & 1) != 0) {
         var1 = bcy.f;
      }

      if ((var10 & 2) != 0) {
         var3 = bxz.a;
      }

      if ((var10 & 4) != 0) {
         var5 = null;
      }

      if ((var10 & 128) != 0) {
         var6 = bxz.a;
      }

      long var11;
      if ((var10 & 2048) != 0) {
         var11 = bcy.f;
      } else {
         var11 = 0L;
      }

      if ((var10 & 131072) != 0) {
         var8 = bxz.a;
      }

      bsn var14 = bso.a(var0.b, var1, var3, var5, (buy)null, (buz)null, (buq)null, (String)null, var6, (bws)null, (bxh)null, (bwe)null, var11, (bxd)null, (bdq)null, (gf)null);
      bsh var13 = bsi.a(var0.c, (bxc)null, (bxe)null, var8, (bxi)null, (bsk)null, (bxb)null, (bwz)null, (bwv)null, (bxj)null);
      return var0.b == var14 && var0.c == var13 ? var0 : new bss(var14, var13);
   }

   // $FF: synthetic method
   public static bss w(bss var0, long var1, bvc var3, buq var4, long var5, gf var7, long var8, bsm var10, bxb var11, int var12) {
      long var13;
      if ((var12 & 1) != 0) {
         var13 = var0.b.b();
      } else {
         var13 = 0L;
      }

      if ((var12 & 2) != 0) {
         var1 = var0.b.b;
      }

      if ((var12 & 4) != 0) {
         var3 = var0.b.c;
      }

      buy var17;
      if ((var12 & 8) != 0) {
         var17 = var0.b.d;
      } else {
         var17 = null;
      }

      buz var18;
      if ((var12 & 16) != 0) {
         var18 = var0.b.e;
      } else {
         var18 = null;
      }

      if ((var12 & 32) != 0) {
         var4 = var0.b.f;
      }

      String var19;
      if ((var12 & 64) != 0) {
         var19 = var0.b.g;
      } else {
         var19 = null;
      }

      if ((var12 & 128) != 0) {
         var5 = var0.b.h;
      }

      bws var20;
      if ((var12 & 256) != 0) {
         var20 = var0.b.i;
      } else {
         var20 = null;
      }

      bxh var21;
      if ((var12 & 512) != 0) {
         var21 = var0.b.j;
      } else {
         var21 = null;
      }

      bwe var22;
      if ((var12 & 1024) != 0) {
         var22 = var0.b.k;
      } else {
         var22 = null;
      }

      long var15;
      if ((var12 & 2048) != 0) {
         var15 = var0.b.l;
      } else {
         var15 = 0L;
      }

      bxd var23;
      if ((var12 & 4096) != 0) {
         var23 = var0.b.m;
      } else {
         var23 = null;
      }

      bdq var24;
      if ((var12 & 8192) != 0) {
         var24 = var0.b.n;
      } else {
         var24 = null;
      }

      gf var25;
      if ((var12 & 16384) != 0) {
         var25 = var0.b.o;
      } else {
         var25 = var7;
      }

      bxc var34;
      if (('耀' & var12) != 0) {
         var34 = var0.c.a;
      } else {
         var34 = null;
      }

      bxe var26;
      if ((65536 & var12) != 0) {
         var26 = var0.c.b;
      } else {
         var26 = null;
      }

      if ((131072 & var12) != 0) {
         var8 = var0.c.c;
      }

      bxi var27;
      if ((262144 & var12) != 0) {
         var27 = var0.c.d;
      } else {
         var27 = null;
      }

      if ((524288 & var12) != 0) {
         var10 = var0.d;
      }

      if ((var12 & 1048576) != 0) {
         var11 = var0.c.f;
      }

      bsh var30 = var0.c;
      bwz var29 = var30.g;
      bwv var28 = var30.h;
      bxj var35 = var30.i;
      bxg var31;
      if (c.o(var13, var0.b.b())) {
         var31 = var0.b.a;
      } else {
         var31 = car.ae(var13);
      }

      bsn var33 = new bsn(var31, var1, var3, var17, var18, var4, var19, var5, var20, var21, var22, var15, var23, var24, var25);
      bsk var32;
      if (var10 != null) {
         var32 = var10.b;
      } else {
         var32 = null;
      }

      return new bss(var33, new bsh(var34, var26, var8, var27, var32, var11, var29, var28, var35), var10);
   }

   public final float a() {
      return this.b.a();
   }

   public final long b() {
      return this.b.b();
   }

   public final long c() {
      return this.b.h;
   }

   public final long d() {
      return this.c.c;
   }

   public final bdq e() {
      return this.b.n;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bss)) {
         return false;
      } else {
         bsn var2 = this.b;
         bss var3 = (bss)var1;
         if (!c.E(var2, var3.b)) {
            return false;
         } else if (!c.E(this.c, var3.c)) {
            return false;
         } else {
            return c.E(this.d, var3.d);
         }
      }
   }

   public final bss f(bss var1) {
      return c.E(var1, a) ? this : new bss(this.b.c(var1.b), this.c.a(var1.c));
   }

   public final buq g() {
      return this.b.f;
   }

   public final buy h() {
      return this.b.d;
   }

   public final int hashCode() {
      int var3 = this.b.hashCode();
      int var2 = this.c.hashCode();
      char var1;
      if (this.d != null) {
         var1 = '闋';
      } else {
         var1 = 0;
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public final buz i() {
      return this.b.e;
   }

   public final bvc j() {
      return this.b.c;
   }

   public final bwe k() {
      return this.b.k;
   }

   public final bwz l() {
      return this.c.g;
   }

   public final bxb m() {
      return this.c.f;
   }

   public final bxc n() {
      return this.c.a;
   }

   public final bxd o() {
      return this.b.m;
   }

   public final bxe p() {
      return this.c.b;
   }

   public final bxi q() {
      return this.c.d;
   }

   public final bxj r() {
      return this.c.i;
   }

   public final boolean s(bss var1) {
      var1.getClass();
      return this == var1 || this.b.e(var1.b);
   }

   public final boolean t(bss var1) {
      boolean var2 = true;
      if (this != var1) {
         if (c.E(this.c, var1.c)) {
            if (!this.b.d(var1.b)) {
               return false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TextStyle(color=");
      var1.append(bcy.h(this.b()));
      var1.append(", brush=");
      var1.append((Object)null);
      var1.append(", alpha=");
      var1.append(this.a());
      var1.append(PUdPFKr.QqQYYzl);
      var1.append(bxz.d(this.b.b));
      var1.append(", fontWeight=");
      var1.append(this.j());
      var1.append(", fontStyle=");
      var1.append(this.h());
      var1.append(", fontSynthesis=");
      var1.append(this.i());
      var1.append(", fontFamily=");
      var1.append(this.g());
      var1.append(", fontFeatureSettings=");
      var1.append(this.b.g);
      var1.append(", letterSpacing=");
      var1.append(bxz.d(this.c()));
      var1.append(", baselineShift=");
      var1.append(this.b.i);
      var1.append(", textGeometricTransform=");
      var1.append(this.b.j);
      var1.append(", localeList=");
      var1.append(this.k());
      var1.append(", background=");
      var1.append(bcy.h(this.b.l));
      var1.append(", textDecoration=");
      var1.append(this.o());
      var1.append(", shadow=");
      var1.append(this.e());
      var1.append(", drawStyle=");
      var1.append(this.v());
      var1.append(", textAlign=");
      var1.append(this.n());
      var1.append(", textDirection=");
      var1.append(this.p());
      var1.append(", lineHeight=");
      var1.append(bxz.d(this.d()));
      var1.append(", textIndent=");
      var1.append(this.q());
      var1.append(", platformStyle=");
      var1.append(this.d);
      var1.append(", lineHeightStyle=");
      var1.append(this.m());
      var1.append(", lineBreak=");
      var1.append(this.l());
      var1.append(", hyphens=");
      var1.append(this.c.h);
      var1.append(", textMotion=");
      var1.append(this.r());
      var1.append(')');
      return var1.toString();
   }

   public final gf v() {
      return this.b.o;
   }
}
