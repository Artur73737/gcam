public final class aoc {
   private final float a = 0.5F;

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof aoc)) {
         return false;
      } else {
         float var2 = ((aoc)var1).a;
         return Float.compare(0.5F, 0.5F) == 0;
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(0.5F);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("FractionalThreshold(fraction=");
      var1.append(0.5F);
      var1.append(')');
      return var1.toString();
   }
}
