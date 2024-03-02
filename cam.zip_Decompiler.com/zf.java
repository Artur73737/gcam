public final class zf extends zh {
   private float a;
   private float b;
   private float c;

   public zf(float var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final float a(int var1) {
      switch(var1) {
      case 0:
         return this.a;
      case 1:
         return this.b;
      case 2:
         return this.c;
      default:
         return 0.0F;
      }
   }

   public final int b() {
      return 3;
   }

   public final void d() {
      this.a = 0.0F;
      this.b = 0.0F;
      this.c = 0.0F;
   }

   public final void e(int var1, float var2) {
      switch(var1) {
      case 0:
         this.a = var2;
         return;
      case 1:
         this.b = var2;
         return;
      case 2:
         this.c = var2;
         return;
      default:
      }
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof zf) {
         zf var2 = (zf)var1;
         if (var2.a == this.a && var2.b == this.b && var2.c == this.c) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return (Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("AnimationVector3D: v1 = ");
      var1.append(this.a);
      var1.append(", v2 = ");
      var1.append(this.b);
      var1.append(", v3 = ");
      var1.append(this.c);
      return var1.toString();
   }
}
