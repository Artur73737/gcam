public final class bgq {
   public static final long a = hf.g(4);
   public static final long b = hf.g(19);
   public static final long c = hf.g(20);
   public static final long d = hf.g(21);
   public static final long e = hf.g(22);
   public static final long f = hf.g(23);
   public static final long g = hf.g(61);
   public static final long h = hf.g(66);
   public static final long i = hf.g(111);
   public static final long j = hf.g(160);
   private final long k;

   // $FF: synthetic method
   private bgq(long var1) {
      this.k = var1;
   }

   // $FF: synthetic method
   public static final bgq a(long var0) {
      return new bgq(var0);
   }

   public final boolean equals(Object var1) {
      boolean var2 = var1 instanceof bgq;
      long var3 = this.k;
      return var2 && var3 == ((bgq)var1).k;
   }

   public final int hashCode() {
      return c.p(this.k);
   }

   public final String toString() {
      long var1 = this.k;
      StringBuilder var3 = new StringBuilder();
      var3.append("Key code: ");
      var3.append(var1);
      return var3.toString();
   }
}
