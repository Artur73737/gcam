public final class bfz extends bga {
   public final float a;

   public bfz(float var1) {
      super(false, false, 3);
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bfz)) {
         return false;
      } else {
         bfz var2 = (bfz)var1;
         return Float.compare(this.a, var2.a) == 0;
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.a);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("VerticalTo(y=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
