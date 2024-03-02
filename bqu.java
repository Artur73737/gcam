public final class bqu implements ass, cma {
   public final boa a;
   public final ass b;
   public boolean c;
   public clx d;
   public qvx e;

   public bqu(boa var1, ass var2) {
      this.a = var1;
      this.b = var2;
      qvx var3 = bpg.a;
      this.e = bpg.a;
   }

   public final void b() {
      if (!this.c) {
         this.c = true;
         this.a.setTag(2131428544, (Object)null);
         clx var1 = this.d;
         if (var1 != null) {
            var1.c(this);
         }
      }

      this.b.b();
   }

   public final void c(qvx var1) {
      var1.getClass();
      boa var2 = this.a;
      bos var4 = new bos(this, var1, 4);
      bpe var3 = var2.v();
      if (var3 != null) {
         var4.eo(var3);
      }

      if (!var2.isAttachedToWindow()) {
         var2.q = var4;
      }

   }

   public final void ej(cmc var1, clv var2) {
      if (var2 == clv.ON_DESTROY) {
         this.b();
      } else {
         if (var2 == clv.ON_CREATE && !this.c) {
            this.c(this.e);
         }

      }
   }
}
