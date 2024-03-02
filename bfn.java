public final class bfn extends bga {
   public final float a;
   public final float b;
   public final float c;
   public final float d;

   public bfn(float var1, float var2, float var3, float var4) {
      super(false, true, 1);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bfn)) {
         return false;
      } else {
         bfn var2 = (bfn)var1;
         if (Float.compare(this.a, var2.a) != 0) {
            return false;
         } else if (Float.compare(this.b, var2.b) != 0) {
            return false;
         } else if (Float.compare(this.c, var2.c) != 0) {
            return false;
         } else {
            return Float.compare(this.d, var2.d) == 0;
         }
      }
   }

   public final int hashCode() {
      return ((Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c)) * 31 + Float.floatToIntBits(this.d);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("QuadTo(x1=");
      var1.append(this.a);
      var1.append(", y1=");
      var1.append(this.b);
      var1.append(", x2=");
      var1.append(this.c);
      var1.append(", y2=");
      var1.append(this.d);
      var1.append(')');
      return var1.toString();
   }
}
