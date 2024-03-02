public final class bfl extends bga {
   public final float a;
   public final float b;

   public bfl(float var1, float var2) {
      super(false, false, 3);
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bfl)) {
         return false;
      } else {
         bfl var2 = (bfl)var1;
         if (Float.compare(this.a, var2.a) != 0) {
            return false;
         } else {
            return Float.compare(this.b, var2.b) == 0;
         }
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("LineTo(x=");
      var1.append(this.a);
      var1.append(", y=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
