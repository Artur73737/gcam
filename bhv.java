public final class bhv {
   private final long a;

   // $FF: synthetic method
   private bhv(long var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final bhv a(long var0) {
      return new bhv(var0);
   }

   public static String b(long var0) {
      StringBuilder var2 = new StringBuilder();
      var2.append("PointerId(value=");
      var2.append(var0);
      var2.append(')');
      return var2.toString();
   }

   public static boolean c(long var0, Object var2) {
      if (!(var2 instanceof bhv)) {
         return false;
      } else {
         return var0 == ((bhv)var2).a;
      }
   }

   public final boolean equals(Object var1) {
      return c(this.a, var1);
   }

   public final int hashCode() {
      return c.p(this.a);
   }

   public final String toString() {
      return b(this.a);
   }
}
