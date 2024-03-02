public final class riu implements quh {
   private final ThreadLocal a;

   public riu(ThreadLocal var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof riu)) {
         return false;
      } else {
         riu var2 = (riu)var1;
         return c.E(this.a, var2.a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      ThreadLocal var2 = this.a;
      StringBuilder var1 = new StringBuilder();
      var1.append("ThreadLocalKey(threadLocal=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
