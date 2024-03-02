public final class yi {
   public final zp a;
   private final float b = 0.0F;

   public yi(zp var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof yi)) {
         return false;
      } else {
         yi var3 = (yi)var1;
         float var2 = var3.b;
         if (Float.compare(0.0F, 0.0F) != 0) {
            return false;
         } else {
            return c.E(this.a, var3.a);
         }
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(0.0F) * 31 + this.a.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Fade(alpha=");
      var1.append(0.0F);
      var1.append(", animationSpec=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
