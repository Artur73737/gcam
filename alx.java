public final class alx implements alu {
   private final float a;

   public alx(float var1) {
      this.a = var1;
      if (var1 < 0.0F || var1 > 100.0F) {
         throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
      }
   }

   public final float a(long var1, bxr var3) {
      return bcl.b(var1) * (this.a / 100.0F);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof alx)) {
         return false;
      } else {
         alx var2 = (alx)var1;
         return Float.compare(this.a, var2.a) == 0;
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.a);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CornerSize(size = ");
      var1.append(this.a);
      var1.append("%)");
      return var1.toString();
   }
}
