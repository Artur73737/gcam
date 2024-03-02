public final class akf {
   public final int a;
   public final int b;

   public akf(int var1, int var2) {
      this.a = var1;
      this.b = var2;
      if (var1 >= 0) {
         if (var2 < var1) {
            throw new IllegalArgumentException("end index greater than start");
         }
      } else {
         throw new IllegalArgumentException("negative start index");
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof akf)) {
         return false;
      } else {
         akf var2 = (akf)var1;
         if (this.a != var2.a) {
            return false;
         } else {
            return this.b == var2.b;
         }
      }
   }

   public final int hashCode() {
      return this.a * 31 + this.b;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Interval(start=");
      var1.append(this.a);
      var1.append(", end=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
