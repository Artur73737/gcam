public final class bfr extends bga {
   public final float a;
   public final float b;
   public final float c;
   public final float d;
   public final float e;
   public final float f;

   public bfr(float var1, float var2, float var3, float var4, float var5, float var6) {
      super(true, false, 2);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bfr)) {
         return false;
      } else {
         bfr var2 = (bfr)var1;
         if (Float.compare(this.a, var2.a) != 0) {
            return false;
         } else if (Float.compare(this.b, var2.b) != 0) {
            return false;
         } else if (Float.compare(this.c, var2.c) != 0) {
            return false;
         } else if (Float.compare(this.d, var2.d) != 0) {
            return false;
         } else if (Float.compare(this.e, var2.e) != 0) {
            return false;
         } else {
            return Float.compare(this.f, var2.f) == 0;
         }
      }
   }

   public final int hashCode() {
      return ((((Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c)) * 31 + Float.floatToIntBits(this.d)) * 31 + Float.floatToIntBits(this.e)) * 31 + Float.floatToIntBits(this.f);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("RelativeCurveTo(dx1=");
      var1.append(this.a);
      var1.append(", dy1=");
      var1.append(this.b);
      var1.append(", dx2=");
      var1.append(this.c);
      var1.append(", dy2=");
      var1.append(this.d);
      var1.append(", dx3=");
      var1.append(this.e);
      var1.append(", dy3=");
      var1.append(this.f);
      var1.append(')');
      return var1.toString();
   }
}
