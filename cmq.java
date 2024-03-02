final class cmq implements cma {
   final clv a;
   final qwz b;
   final qzv c;
   final clv d;
   final qvx e;
   final qza f;
   final rjo g;

   public cmq(clv var1, qwz var2, qzv var3, clv var4, qza var5, rjo var6, qvx var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.f = var5;
      this.g = var6;
      this.e = var7;
   }

   public final void ej(cmc var1, clv var2) {
      if (var2 == this.a) {
         this.b.a = qwo.o(this.c, (qui)null, 0, new cmp(this.g, this.e, (que)null), 3);
      } else {
         if (var2 == this.d) {
            rbd var3 = (rbd)this.b.a;
            if (var3 != null) {
               qxb.r(var3);
            }

            this.b.a = null;
         }

         if (var2 == clv.ON_DESTROY) {
            this.f.gP(qsn.a);
         }

      }
   }
}
