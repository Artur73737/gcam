public final class bep {
   public final float a;
   public final float b;

   public bep(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public final float[] a() {
      float var2 = this.a;
      float var1 = this.b;
      return new float[]{var2 / var1, 1.0F, (1.0F - var2 - var1) / var1};
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bep)) {
         return false;
      } else {
         bep var2 = (bep)var1;
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
      var1.append("WhitePoint(x=");
      var1.append(this.a);
      var1.append(", y=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
