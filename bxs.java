public final class bxs implements bxr {
   public final float a;
   public final float b;

   public bxs(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public final float a() {
      return this.a;
   }

   public final float b() {
      return this.b;
   }

   // $FF: synthetic method
   public final float eF(float var1) {
      return car.P(this, var1);
   }

   // $FF: synthetic method
   public final float eG(int var1) {
      return car.Q(this, var1);
   }

   // $FF: synthetic method
   public final float eH(long var1) {
      return car.R(this, var1);
   }

   // $FF: synthetic method
   public final float eI(float var1) {
      return car.S(this, var1);
   }

   // $FF: synthetic method
   public final int eJ(float var1) {
      return car.T(this, var1);
   }

   // $FF: synthetic method
   public final long eK(long var1) {
      return car.U(this, var1);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bxs)) {
         return false;
      } else {
         bxs var2 = (bxs)var1;
         if (Float.compare(this.a, var2.a) != 0) {
            return false;
         } else {
            return Float.compare(this.b, var2.b) == 0;
         }
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("DensityImpl(density=");
      var1.append(this.a);
      var1.append(", fontScale=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
