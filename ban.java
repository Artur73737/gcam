public final class ban extends azk {
   private final azk a;
   private final boolean b;
   private final qvt c;

   public ban(azk var1, qvt var2, boolean var3) {
      qvt var5;
      label11: {
         super(0, azo.a);
         this.a = var1;
         this.b = var3;
         if (var1 != null) {
            qvt var4 = var1.j();
            var5 = var4;
            if (var4 != null) {
               break label11;
            }
         }

         var5 = ((azf)azp.g.get()).a;
      }

      this.c = azp.p(var2, var5, false);
   }

   private final azk a() {
      azk var2 = this.a;
      azk var1 = var2;
      if (var2 == null) {
         Object var3 = azp.g.get();
         var3.getClass();
         var1 = (azk)var3;
      }

      return var1;
   }

   public final azk b(qvt var1) {
      var1 = azp.y(var1, this.c);
      return azp.x(this.a().b((qvt)null), var1);
   }

   public final void c() {
      this.C();
      if (this.b) {
         azk var1 = this.a;
         if (var1 != null) {
            var1.c();
         }
      }

   }

   public final void d() {
      this.a().d();
   }

   // $FF: synthetic method
   public final void e() {
      dp.l();
   }

   // $FF: synthetic method
   public final void f() {
      dp.l();
   }

   public final qvt j() {
      return this.c;
   }

   public final qvt k() {
      return null;
   }

   public final void n(bai var1) {
      this.a().n(var1);
   }

   public final boolean s() {
      return this.a().s();
   }

   public final int u() {
      return this.a().u();
   }

   public final azo w() {
      return this.a().w();
   }
}
