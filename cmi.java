public final class cmi extends cmj implements cma {
   final cmc a;
   final cmk b;

   public cmi(cmk var1, cmc var2, cmm var3) {
      super(var1, var3);
      this.b = var1;
      this.a = var2;
   }

   public final boolean a() {
      return this.a.getLifecycle().b.a(clw.d);
   }

   public final void b() {
      this.a.getLifecycle().c(this);
   }

   public final boolean c(cmc var1) {
      return this.a == var1;
   }

   public final void ej(cmc var1, clv var2) {
      clw var4 = this.a.getLifecycle().b;
      if (var4 == clw.a) {
         this.b.g(this.c);
      } else {
         clw var3;
         for(clw var5 = null; var5 != var4; var4 = var3) {
            this.d(this.a());
            var3 = this.a.getLifecycle().b;
            var5 = var4;
         }

      }
   }
}
