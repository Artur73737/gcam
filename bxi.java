public final class bxi {
   public static final bxi a = new bxi(car.E(0), car.E(0));
   public final long b;
   public final long c;

   public bxi(long var1, long var3) {
      this.b = var1;
      this.c = var3;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bxi)) {
         return false;
      } else {
         long var2 = this.b;
         bxi var4 = (bxi)var1;
         if (!c.o(var2, var4.b)) {
            return false;
         } else {
            return c.o(this.c, var4.c);
         }
      }
   }

   public final int hashCode() {
      return car.H(this.b) * 31 + car.H(this.c);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TextIndent(firstLine=");
      var1.append(bxz.d(this.b));
      var1.append(", restLine=");
      var1.append(bxz.d(this.c));
      var1.append(')');
      return var1.toString();
   }
}
