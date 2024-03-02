public final class rw {
   private final int a = 4;
   private final sj b = null;

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof rw)) {
         return false;
      } else {
         rw var3 = (rw)var1;
         int var2 = var3.a;
         if (!c.n(4, 4)) {
            return false;
         } else {
            sj var4 = var3.b;
            return c.E((Object)null, (Object)null);
         }
      }
   }

   public final int hashCode() {
      return 124;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Result3A(status=");
      var1.append("Status(value=4)");
      var1.append(", frameMetadata=");
      var1.append((Object)null);
      var1.append(')');
      return var1.toString();
   }
}
