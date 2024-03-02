import java.util.ListIterator;

public final class aaf implements avi {
   public zh a;
   final jed b;
   private final att c;
   private final att d;
   private final att e;
   private final att f;
   private final att g;
   private final att h;
   private final zp i;
   private final avc j;
   private final bpe k;

   public aaf(jed var1, Object var2, zh var3, bpe var4) {
      var3.getClass();
      this.b = var1;
      super();
      this.k = var4;
      this.c = sg.d(var2);
      Object var8 = null;
      this.d = sg.d(sq.h(0.0F, (Object)null, 7));
      this.e = sg.d(new aac(this.d(), var4, var2, this.o(), var3));
      this.f = sg.d(true);
      this.j = lg.e(0L);
      int var6 = 0;
      this.g = sg.d(false);
      this.h = sg.d(var2);
      this.a = var3;
      Float var10 = (Float)aau.a.get(var4);
      if (var10 != null) {
         float var5 = var10.floatValue();
         zh var9 = (zh)((qvt)var4.a).eo(var2);

         for(int var7 = var9.b(); var6 < var7; ++var6) {
            var9.e(var6, var5);
         }

         var8 = ((qvt)this.k.b).eo(var9);
      }

      this.i = sq.h(0.0F, var8, 3);
   }

   // $FF: synthetic method
   static void n(aaf var0, Object var1, boolean var2, int var3) {
      Object var6 = var1;
      if ((var3 & 1) != 0) {
         var6 = var0.a();
      }

      boolean var11;
      if ((var3 & 2) != 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      zp var8;
      if (var11 & var2) {
         if (var0.d() instanceof zx) {
            var8 = var0.d();
         } else {
            var8 = var0.i;
         }
      } else {
         var8 = var0.d();
      }

      aac var9 = new aac(var8, var0.k, var6, var0.o(), var0.a);
      var0.e.b(var9);
      jed var10 = var0.b;
      var10.n(true);
      if (var10.q()) {
         ListIterator var7 = ((azw)var10.a).listIterator();
         long var4 = 0L;

         while(var7.hasNext()) {
            aaf var12 = (aaf)var7.next();
            var4 = Math.max(var4, var12.b());
            var12.m();
         }

         var10.n(false);
      }

   }

   private final Object o() {
      return this.c.a();
   }

   private final void p(zp var1) {
      this.d.b(var1);
   }

   private final void q(Object var1) {
      this.c.b(var1);
   }

   public final Object a() {
      return this.h.a();
   }

   public final long b() {
      return this.e().c;
   }

   public final long c() {
      return this.j.f();
   }

   public final zp d() {
      return (zp)this.d.a();
   }

   public final aac e() {
      return (aac)this.e.a();
   }

   public final void f(boolean var1) {
      this.f.b(var1);
   }

   public final void g(boolean var1) {
      this.g.b(var1);
   }

   public final void h(long var1) {
      this.j.h(var1);
   }

   public final void i(Object var1) {
      this.h.b(var1);
   }

   public final void j(Object var1, Object var2, zp var3) {
      var3.getClass();
      this.q(var2);
      this.p(var3);
      if (!c.E(this.e().a, var1) || !c.E(this.e().b, var2)) {
         n(this, var1, false, 2);
      }
   }

   public final void k(Object var1, zp var2) {
      var2.getClass();
      if (!c.E(this.o(), var1) || (Boolean)this.g.a()) {
         this.q(var1);
         this.p(var2);
         n(this, (Object)null, this.l() ^ true, 1);
         this.f(false);
         this.h(this.b.c());
         this.g(false);
      }
   }

   public final boolean l() {
      return (Boolean)this.f.a();
   }

   public final void m() {
      this.i(this.e().c(0L));
      this.a = this.e().b(0L);
   }
}
