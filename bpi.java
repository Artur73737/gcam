public final class bpi {
   public static final auf a;
   public static final auf b;
   public static final auf c;
   public static final auf d;
   public static final auf e;
   public static final auf f;
   public static final auf g;
   private static final auf h;
   private static final auf i;
   private static final auf j;
   private static final auf k;
   private static final auf l;
   private static final auf m;
   private static final auf n;
   private static final auf o;
   private static final auf p;
   private static final auf q;
   private static final auf r;

   static {
      a = li.e(bor.i);
      h = li.e(bor.j);
      i = li.e(bor.k);
      j = li.e(bor.l);
      b = li.e(bor.m);
      k = li.e(bor.n);
      l = li.e(bor.p);
      c = li.e(bor.o);
      m = li.e(bor.q);
      d = li.e(bor.r);
      e = li.e(bor.s);
      n = li.e(bph.b);
      o = li.e(bor.t);
      p = li.e(bph.a);
      q = li.e(bph.c);
      f = li.e(bph.d);
      r = li.e(bph.e);
      g = li.e(bor.u);
   }

   public static final void a(String var0) {
      throw new IllegalStateException(c.aA(var0, "CompositionLocal ", " not present"));
   }

   public static final void b(boa var0, boe var1, qvx var2, asm var3, int var4) {
      var1.getClass();
      var3 = var3.b(874662829);
      byte var5;
      int var6;
      if ((var4 & 14) == 0) {
         if (!var3.B(var0)) {
            var5 = 2;
         } else {
            var5 = 4;
         }

         var6 = var5 | var4;
      } else {
         var6 = var4;
      }

      int var8 = var6;
      if ((var4 & 112) == 0) {
         if (!var3.B(var1)) {
            var5 = 16;
         } else {
            var5 = 32;
         }

         var8 = var6 | var5;
      }

      var6 = var8;
      if ((var4 & 896) == 0) {
         short var9;
         if (!var3.D(var2)) {
            var9 = 128;
         } else {
            var9 = 256;
         }

         var6 = var8 | var9;
      }

      if ((var6 & 731) == 146 && var3.G()) {
         var3.q();
      } else {
         li.g(new ouk[]{a.b(var0.L), h.b(var0.i), i.b(var0.G), j.b(var0.K), b.b(var0.d), k.b(var0.w), l.c(var0.A), c.c(var0.w()), m.b(var0.E), d.b(var0.F), e.b((bxy)var0.r.a()), n.b(var0.C), o.b(var0.H), p.b(var0.B), q.b(var1), f.b(var0.m), r.b(var0.e), g.b(var0.D)}, var2, var3, var6 >> 3 & 112 | 8);
      }

      aug var7 = var3.H();
      if (var7 != null) {
         var7.c = new alc(var0, var1, var2, var4, 9);
      }
   }
}
