public final class aqf {
   public final float a;
   public final float b;
   public final float c;
   public final float d;

   public aqf(float var1, float var2, float var3, float var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof aqf)) {
         return false;
      } else {
         float var2 = this.a;
         aqf var3 = (aqf)var1;
         return var2 == var3.a && this.b == var3.b && this.c == var3.c && this.d == var3.d;
      }
   }

   public final int hashCode() {
      return ((Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c)) * 31 + Float.floatToIntBits(this.d);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("RippleAlpha(draggedAlpha=");
      var1.append(this.a);
      var1.append(", focusedAlpha=");
      var1.append(this.b);
      var1.append(", hoveredAlpha=");
      var1.append(this.c);
      var1.append(", pressedAlpha=");
      var1.append(this.d);
      var1.append(')');
      return var1.toString();
   }
}
