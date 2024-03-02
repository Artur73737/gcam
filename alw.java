public final class alw implements alu {
   private final float a;

   public alw(float var1) {
      this.a = var1;
   }

   public final float a(long var1, bxr var3) {
      return var3.eI(this.a);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof alw)) {
         return false;
      } else {
         alw var2 = (alw)var1;
         return bxt.c(this.a, var2.a);
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.a);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CornerSize(size = ");
      var1.append(this.a);
      var1.append(".dp)");
      return var1.toString();
   }
}
