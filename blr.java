final class blr extends bmo {
   public blr(bls var1) {
      super(var1);
   }

   public final bke l(long var1) {
      this.q(var1);
      axf var6 = this.D().m();
      int var5 = var6.b;
      if (var5 > 0) {
         Object[] var7 = var6.a;
         int var3 = 0;

         int var4;
         do {
            bmh var8 = ((bmd)var7[var3]).p();
            var8.getClass();
            var8.u();
            var4 = var3 + 1;
            var3 = var4;
         } while(var4 < var5);
      }

      super.w(this.D().h.a(this, this.D().v(), var1));
      return this;
   }

   public final int s(bir var1) {
      bmh var3 = (bmh)this.v();
      if (!var3.i) {
         bml var5 = var3.t;
         if (var5.p == 2) {
            bkv var4 = var3.n;
            var4.f = true;
            if (var4.b) {
               var5.e();
            }
         } else {
            var3.n.g = true;
         }
      }

      bmo var7 = ((bls)var3.d()).g;
      if (var7 != null) {
         var7.i = true;
      }

      var3.f();
      var7 = ((bls)var3.d()).g;
      if (var7 != null) {
         var7.i = false;
      }

      Integer var6 = (Integer)var3.n.h.get(var1);
      int var2;
      if (var6 != null) {
         var2 = var6;
      } else {
         var2 = Integer.MIN_VALUE;
      }

      super.l.put(var1, var2);
      return var2;
   }

   protected final void t() {
      bmh var1 = this.D().p();
      var1.getClass();
      var1.s();
   }
}
