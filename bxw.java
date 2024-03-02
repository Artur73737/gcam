public final class bxw {
   public static final long a = car.K(0, 0);
   public final long b;

   // $FF: synthetic method
   private bxw(long var1) {
      this.b = var1;
   }

   public static final int a(long var0) {
      return (int)(var0 >> 32);
   }

   public static final int b(long var0) {
      return (int)(var0 & 4294967295L);
   }

   // $FF: synthetic method
   public static final bxw c(long var0) {
      return new bxw(var0);
   }

   public static String d(long var0) {
      StringBuilder var2 = new StringBuilder();
      var2.append('(');
      var2.append(a(var0));
      var2.append(", ");
      var2.append(b(var0));
      var2.append(')');
      return var2.toString();
   }

   public final boolean equals(Object var1) {
      boolean var4 = var1 instanceof bxw;
      long var2 = this.b;
      return var4 && var2 == ((bxw)var1).b;
   }

   public final int hashCode() {
      return c.p(this.b);
   }

   public final String toString() {
      return d(this.b);
   }
}
