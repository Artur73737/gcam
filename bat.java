public final class bat {
   private final float a;

   public bat(float var1) {
      this.a = var1;
   }

   public final int a(int var1, int var2) {
      float var3 = this.a;
      return qxg.e((float)(var2 - var1) / 2.0F * (var3 + 1.0F));
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bat)) {
         return false;
      } else {
         bat var2 = (bat)var1;
         return Float.compare(this.a, var2.a) == 0;
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.a);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Vertical(bias=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
