public final class aro implements bji {
   private final long a;

   public aro(long var1) {
      this.a = var1;
   }

   public final bju a(bjw var1, bjs var2, long var3) {
      bke var7 = var2.l(var3);
      int var6 = Math.max(var7.a, var1.eJ(bxv.b(this.a)));
      int var5 = Math.max(var7.b, var1.eJ(bxv.a(this.a)));
      return ja.g(var1, var6, var5, new arn(var6, var7, var5, 0));
   }

   public final boolean equals(Object var1) {
      aro var2;
      if (var1 instanceof aro) {
         var2 = (aro)var1;
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
