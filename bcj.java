public final class bcj {
   public static final bcj a = new bcj(0.0F, 0.0F, 0.0F, 0.0F);
   public final float b;
   public final float c;
   public final float d;
   public final float e;

   public bcj(float var1, float var2, float var3, float var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final float a() {
      return this.e - this.c;
   }

   public final float b() {
      return this.d - this.b;
   }

   public final long c() {
      return es.i(this.b + this.b() / 2.0F, this.c + this.a() / 2.0F);
   }

   public final long d() {
      return et.k(this.b(), this.a());
   }

   public final bcj e(bcj var1) {
      return new bcj(Math.max(this.b, var1.b), Math.max(this.c, var1.c), Math.min(this.d, var1.d), Math.min(this.e, var1.e));
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bcj)) {
         return false;
      } else {
         bcj var2 = (bcj)var1;
         if (Float.compare(this.b, var2.b) != 0) {
            return false;
         } else if (Float.compare(this.c, var2.c) != 0) {
            return false;
         } else if (Float.compare(this.d, var2.d) != 0) {
            return false;
         } else {
            return Float.compare(this.e, var2.e) == 0;
         }
      }
   }

   public final bcj f(float var1, float var2) {
      return new bcj(this.b + var1, this.c + var2, this.d + var1, this.e + var2);
   }

   public final bcj g(long var1) {
      return new bcj(this.b + bci.b(var1), this.c + bci.c(var1), this.d + bci.b(var1), this.e + bci.c(var1));
   }

   public final int hashCode() {
      return ((Float.floatToIntBits(this.b) * 31 + Float.floatToIntBits(this.c)) * 31 + Float.floatToIntBits(this.d)) * 31 + Float.floatToIntBits(this.e);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Rect.fromLTRB(");
      var1.append(er.k(this.b));
      var1.append(", ");
      var1.append(er.k(this.c));
      var1.append(", ");
      var1.append(er.k(this.d));
      var1.append(", ");
      var1.append(er.k(this.e));
      var1.append(')');
      return var1.toString();
   }
}
