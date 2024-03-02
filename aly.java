public final class aly implements alu {
   private final float a;

   public aly(float var1) {
      this.a = var1;
   }

   public final float a(long var1, bxr var3) {
      return this.a;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof aly)) {
         return false;
      } else {
         aly var2 = (aly)var1;
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
      var1.append(".px)");
      return var1.toString();
   }
}
