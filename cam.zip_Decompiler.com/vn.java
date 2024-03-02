public final class vn {
   public final long a;

   // $FF: synthetic method
   private vn(long var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final vn a(long var0) {
      return new vn(var0);
   }

   public final boolean equals(Object var1) {
      boolean var4 = var1 instanceof vn;
      long var2 = this.a;
      return var4 && var2 == ((vn)var1).a;
   }

   public final int hashCode() {
      return c.p(this.a);
   }

   public final String toString() {
      long var1 = this.a;
      StringBuilder var3 = new StringBuilder();
      var3.append("DurationNs(value=");
      var3.append(var1);
      var3.append(')');
      return var3.toString();
   }
}
