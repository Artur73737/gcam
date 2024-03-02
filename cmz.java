public final class cmz implements cma {
   public final cmx a;
   public boolean b;
   private final String c;

   public cmz(String var1, cmx var2) {
      this.c = var1;
      this.a = var2;
   }

   public final void b(crx var1, clx var2) {
      if (!this.b) {
         this.b = true;
         var2.a(this);
         var1.b(this.c, this.a.f);
      } else {
         throw new IllegalStateException("Already attached to lifecycleOwner");
      }
   }

   public final void ej(cmc var1, clv var2) {
      if (var2 == clv.ON_DESTROY) {
         this.b = false;
         var1.getLifecycle().c(this);
      }

   }
}
