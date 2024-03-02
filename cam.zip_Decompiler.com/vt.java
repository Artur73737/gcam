public final class vt {
   public final long a;

   // $FF: synthetic method
   private vt(long var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final vt a(long var0) {
      return new vt(var0);
   }

   public static String b(long var0) {
      StringBuilder var2 = new StringBuilder();
      var2.append("TimestampNs(value=");
      var2.append(var0);
      var2.append(')');
      return var2.toString();
   }

   public final boolean equals(Object var1) {
      boolean var4 = var1 instanceof vt;
      long var2 = this.a;
      return var4 && var2 == ((vt)var1).a;
   }

   public final int hashCode() {
      return c.p(this.a);
   }

   public final String toString() {
      return b(this.a);
   }
}
