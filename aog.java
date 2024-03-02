public final class aog implements bji {
   private final long a;

   public aog(long var1) {
      this.a = var1;
   }

   public final bju a(bjw var1, bjs var2, long var3) {
      bke var7 = var2.l(var3);
      int var5 = Math.max(var7.a, var1.eJ(bxv.b(this.a)));
      int var6 = Math.max(var7.b, var1.eJ(bxv.a(this.a)));
      return ja.g(var1, var5, var6, new arn(var5, var7, var6, 1));
   }

   public final boolean equals(Object var1) {
      aog var2;
      if (var1 instanceof aog) {
         var2 = (aog)var1;
      } else {
         var2 = null;
      }

      return var2 == null ? false : c.o(this.a, var2.a);
   }

   // $FF: synthetic method
   public final bbb g(bbb var1) {
      return bax.a(this, var1);
   }

   // $FF: synthetic method
   public final Object h(Object var1, qvx var2) {
      return dq.j(this, var1, var2);
   }

   public final int hashCode() {
      return c.p(this.a);
   }

   // $FF: synthetic method
   public final boolean i(qvt var1) {
      return dq.k(this, var1);
   }
}
