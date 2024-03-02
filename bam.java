public final class bam extends azg {
   private final azg k;
   private final boolean l;
   private final boolean m;

   public bam(azg var1, qvt var2, qvt var3, boolean var4, boolean var5) {
      qvt var6;
      azo var8;
      label16: {
         var8 = azo.a;
         if (var1 != null) {
            qvt var7 = var1.a;
            var6 = var7;
            if (var7 != null) {
               break label16;
            }
         }

         var6 = ((azf)azp.g.get()).a;
      }

      var6 = azp.p(var2, var6, var4);
      if (var1 != null) {
         var2 = var1.b;
      } else {
         var2 = ((azf)azp.g.get()).b;
      }

      super(0, var8, var6, azp.q(var3, var2));
      this.k = var1;
      this.l = var4;
      this.m = var5;
   }

   private final azg E() {
      azg var2 = this.k;
      azg var1 = var2;
      if (var2 == null) {
         Object var3 = azp.g.get();
         var3.getClass();
         var1 = (azg)var3;
      }

      return var1;
   }

   public final void A(azo var1) {
      baa.a();
      throw new qsc();
   }

   public final azg a(qvt var1, qvt var2) {
      var1 = azp.y(var1, super.a);
      var2 = azp.q(var2, super.b);
      Object var3;
      if (!this.l) {
         var3 = new bam(this.E().a((qvt)null, var2), var1, var2, false, true);
      } else {
         var3 = this.E().a(var1, var2);
      }

      return (azg)var3;
   }

   public final azk b(qvt var1) {
      var1 = azp.y(var1, super.a);
      azk var2;
      if (!this.l) {
         var2 = azp.x(this.E().b((qvt)null), var1);
      } else {
         var2 = this.E().b(var1);
      }

      return var2;
   }

   public final void c() {
      this.C();
      if (this.m) {
         azg var1 = this.k;
         if (var1 != null) {
            var1.c();
         }
      }

   }

   public final void d() {
      this.E().d();
   }

   // $FF: synthetic method
   public final void e() {
      dp.l();
   }

   // $FF: synthetic method
   public final void f() {
      dp.l();
   }

   public final dq g() {
      return this.E().g();
   }

   public final int h() {
      return this.E().h();
   }

   public final axb i() {
      return this.E().i();
   }

   public final void n(bai var1) {
      this.E().n(var1);
   }

   public final void q(axb var1) {
      baa.a();
      throw new qsc();
   }

   public final void r(int var1) {
      this.E().r(var1);
   }

   public final boolean s() {
      this.E().s();
      return false;
   }

   public final int u() {
      return this.E().u();
   }

   public final azo w() {
      return this.E().w();
   }

   public final void z(int var1) {
      baa.a();
      throw new qsc();
   }
}
