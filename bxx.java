public final class bxx {
   public final long a;

   // $FF: synthetic method
   private bxx(long var1) {
      this.a = var1;
   }

   public static final int a(long var0) {
      return (int)(var0 & 4294967295L);
   }

   public static final int b(long var0) {
      return (int)(var0 >> 32);
   }

   // $FF: synthetic method
   public static final bxx c(long var0) {
      return new bxx(var0);
   }

   public static String d(long var0) {
      StringBuilder var2 = new StringBuilder();
      var2.append(b(var0));
      var2.append(" x ");
      var2.append(a(var0));
      return var2.toString();
   }

   public final boolean equals(Object var1) {
      boolean var4 = var1 instanceof bxx;
      long var2 = this.a;
      return var4 && var2 == ((bxx)var1).a;
   }

   public final int hashCode() {
      return c.p(this.a);
   }

   public final String toString() {
      return d(this.a);
   }
}
