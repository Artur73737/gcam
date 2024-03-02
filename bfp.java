public final class bfp extends bga {
   public final float a;
   public final float b;

   public bfp(float var1, float var2) {
      super(false, true, 1);
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bfp)) {
         return false;
      } else {
         bfp var2 = (bfp)var1;
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
      var1.append("ReflectiveQuadTo(x=");
      var1.append(this.a);
      var1.append(", y=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
