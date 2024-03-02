public final class bas {
   private final float a;

   public bas(float var1) {
      this.a = var1;
   }

   public final int a(int var1, bxy var2) {
      float var3;
      if (var2 == bxy.a) {
         var3 = this.a;
      } else {
         var3 = -this.a;
      }

      return qxg.e((float)var1 / 2.0F * (var3 + 1.0F));
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bas)) {
         return false;
      } else {
         bas var2 = (bas)var1;
         return Float.compare(this.a, var2.a) == 0;
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.a);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Horizontal(bias=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
