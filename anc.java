public final class anc {
   public final long a;
   private final long b;

   public anc(long var1, long var3) {
      this.b = var1;
      this.a = var3;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof anc)) {
         return false;
      } else {
         long var2 = this.b;
         anc var4 = (anc)var1;
         if (!c.o(var2, var4.b)) {
            return false;
         } else {
            return c.o(this.a, var4.a);
         }
      }
   }

   public final int hashCode() {
      return c.p(this.b) * 31 + c.p(this.a);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SelectionColors(selectionHandleColor=");
      var1.append(bcy.h(this.b));
      var1.append(", selectionBackgroundColor=");
      var1.append(bcy.h(this.a));
      var1.append(')');
      return var1.toString();
   }
}
