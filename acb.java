public final class acb extends bba implements bkr, bln {
   public boolean a;
   private bjf b;

   public final qvt d() {
      return super.y ? (qvt)jj.n(this, aca.a) : null;
   }

   // $FF: synthetic method
   public final Object eq(lmk var1) {
      return jj.n(this, var1);
   }

   // $FF: synthetic method
   public final bkq ex() {
      return bkp.a;
   }

   public final void f(bjf var1) {
      this.b = var1;
      if (this.a) {
         if (var1.k()) {
            this.h();
         } else {
            qvt var2 = this.d();
            if (var2 != null) {
               var2.eo((Object)null);
            }

         }
      }
   }

   public final void h() {
      bjf var1 = this.b;
      if (var1 != null && var1.k()) {
         qvt var2 = this.d();
         if (var2 != null) {
            var2.eo(this.b);
         }
      }

   }
}
