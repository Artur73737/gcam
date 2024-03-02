public final class cxl {
   public final cxk a;
   private final cxj b;

   public cxl(cxj var1, cxk var2) {
      var2.getClass();
      super();
      this.b = var1;
      this.a = var2;
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof cxl) {
         cxj var2 = this.b;
         cxl var3 = (cxl)var1;
         if (c.E(var2, var3.b) && c.E(this.a, var3.a)) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return this.b.hashCode() * 31 + this.a.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Operation: ");
      var1.append(this.b);
      var1.append(": Status: ");
      var1.append(this.a);
      return var1.toString();
   }
}
