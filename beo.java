public final class beo {
   public final double a;
   public final double b;
   public final double c;
   public final double d;
   public final double e;
   public final double f;
   public final double g;

   // $FF: synthetic method
   public beo(double var1, double var3, double var5, double var7, double var9) {
      this(var1, var3, var5, var7, var9, 0.0D, 0.0D);
   }

   public beo(double var1, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = var9;
      this.f = var11;
      this.g = var13;
      if (!Double.isNaN(var3) && !Double.isNaN(var5) && !Double.isNaN(var7) && !Double.isNaN(var9) && !Double.isNaN(var11) && !Double.isNaN(var13) && !Double.isNaN(var1)) {
         if (var9 >= 0.0D && var9 <= 1.0D) {
            if (var9 == 0.0D && (var3 == 0.0D || var1 == 0.0D)) {
               throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
            } else if (var9 >= 1.0D && var7 == 0.0D) {
               throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
            } else if ((var3 == 0.0D || var1 == 0.0D) && var7 == 0.0D) {
               throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
            } else if (!(var7 < 0.0D)) {
               if (var3 < 0.0D || var1 < 0.0D) {
                  throw new IllegalArgumentException("The transfer function must be positive or increasing");
               }
            } else {
               throw new IllegalArgumentException("The transfer function must be increasing");
            }
         } else {
            StringBuilder var15 = new StringBuilder();
            var15.append("Parameter d must be in the range [0..1], was ");
            var15.append(var9);
            throw new IllegalArgumentException(var15.toString());
         }
      } else {
         throw new IllegalArgumentException("Parameters cannot be NaN");
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof beo)) {
         return false;
      } else {
         beo var2 = (beo)var1;
         if (Double.compare(this.a, var2.a) != 0) {
            return false;
         } else if (Double.compare(this.b, var2.b) != 0) {
            return false;
         } else if (Double.compare(this.c, var2.c) != 0) {
            return false;
         } else if (Double.compare(this.d, var2.d) != 0) {
            return false;
         } else if (Double.compare(this.e, var2.e) != 0) {
            return false;
         } else if (Double.compare(this.f, var2.f) != 0) {
            return false;
         } else {
            return Double.compare(this.g, var2.g) == 0;
         }
      }
   }

   public final int hashCode() {
      return (((((gf.o(this.a) * 31 + gf.o(this.b)) * 31 + gf.o(this.c)) * 31 + gf.o(this.d)) * 31 + gf.o(this.e)) * 31 + gf.o(this.f)) * 31 + gf.o(this.g);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TransferParameters(gamma=");
      var1.append(this.a);
      var1.append(", a=");
      var1.append(this.b);
      var1.append(", b=");
      var1.append(this.c);
      var1.append(", c=");
      var1.append(this.d);
      var1.append(", d=");
      var1.append(this.e);
      var1.append(", e=");
      var1.append(this.f);
      var1.append(", f=");
      var1.append(this.g);
      var1.append(')');
      return var1.toString();
   }
}
