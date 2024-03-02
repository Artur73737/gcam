public final class zd extends zh {
   public float a;

   public zd(float var1) {
      this.a = var1;
   }

   public final float a(int var1) {
      return var1 == 0 ? this.a : 0.0F;
   }

   public final int b() {
      return 1;
   }

   public final void d() {
      this.a = 0.0F;
   }

   public final void e(int var1, float var2) {
      if (var1 == 0) {
         this.a = var2;
      }

   }

   public final boolean equals(Object var1) {
      return var1 instanceof zd && ((zd)var1).a == this.a;
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.a);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("AnimationVector1D: value = ");
      var1.append(this.a);
      return var1.toString();
   }
}
