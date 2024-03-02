public final class bws {
   public final float a = 0.0F;

   public final boolean equals(Object var1) {
      if (var1 instanceof bws) {
         float var2 = ((bws)var1).a;
         if (Float.compare(0.0F, 0.0F) == 0) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return Float.floatToIntBits(0.0F);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("BaselineShift(multiplier=");
      var1.append(0.0F);
      var1.append(')');
      return var1.toString();
   }
}
