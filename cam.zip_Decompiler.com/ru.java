public final class ru {
   public final long a;

   // $FF: synthetic method
   private ru(long var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final ru a(long var0) {
      return new ru(var0);
   }

   public static String b(long var0) {
      StringBuilder var2 = new StringBuilder();
      var2.append("RequestNumber(value=");
      var2.append(var0);
      var2.append(')');
      return var2.toString();
   }

   public final boolean equals(Object var1) {
      boolean var2 = var1 instanceof ru;
      long var3 = this.a;
      return var2 && var3 == ((ru)var1).a;
   }

   public final int hashCode() {
      return c.p(this.a);
   }

   public final String toString() {
      return b(this.a);
   }
}
