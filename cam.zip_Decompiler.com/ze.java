public final class ze extends zh {
   public float a;
   public float b;

   public ze(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public final float a(int var1) {
      switch(var1) {
      case 0:
         return this.a;
      case 1:
         return this.b;
      default:
         return 0.0F;
      }
   }

   public final int b() {
      return 2;
   }

   public final void d() {
      this.a = 0.0F;
      this.b = 0.0F;
   }

   public final void e(int var1, float var2) {
      switch(var1) {
      case 0:
         this.a = var2;
         return;
      case 1:
         this.b = var2;
         return;
      default:
      }
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof ze) {
         ze var2 = (ze)var1;
         if (var2.a == this.a && var2.b == this.b) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("AnimationVector2D: v1 = ");
      var1.append(this.a);
      var1.append(", v2 = ");
      var1.append(this.b);
      return var1.toString();
   }
}
