public final class zj {
   public double a;
   public double b;

   public zj(double var1, double var3) {
      this.a = var1;
      this.b = var3;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof zj)) {
         return false;
      } else {
         zj var2 = (zj)var1;
         if (Double.compare(this.a, var2.a) != 0) {
            return false;
         } else {
            return Double.compare(this.b, var2.b) == 0;
         }
      }
   }

   public final int hashCode() {
      return do.s(this.a) * 31 + do.s(this.b);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ComplexDouble(_real=");
      var1.append(this.a);
      var1.append(", _imaginary=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
