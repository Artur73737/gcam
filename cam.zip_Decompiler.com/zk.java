public final class zk implements zm {
   private final float a;
   private final float b;
   private final float c;
   private final float d;

   public zk(float var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = 1.0F;
      if (Float.isNaN(var1) || Float.isNaN(var2) || Float.isNaN(var3) || Float.isNaN(1.0F)) {
         StringBuilder var4 = new StringBuilder();
         var4.append("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ");
         var4.append(var1);
         var4.append(", ");
         var4.append(var2);
         var4.append(", ");
         var4.append(var3);
         var4.append(", ");
         var4.append(1.0F);
         var4.append('.');
         throw new IllegalArgumentException(var4.toString());
      }
   }

   private static final float b(float var0, float var1, float var2) {
      float var3 = 1.0F - var2;
      return var0 * 3.0F * var3 * var3 * var2 + var1 * 3.0F * var3 * var2 * var2 + var2 * var2 * var2;
   }

   public final float a(float var1) {
      float var3 = 0.0F;
      if (var1 > 0.0F && var1 < 1.0F) {
         float var2 = 1.0F;

         while(true) {
            float var6 = this.a;
            float var5 = this.c;
            float var4 = (var3 + var2) / 2.0F;
            var5 = b(var6, var5, var4);
            if (Math.abs(var1 - var5) < 0.001F) {
               return b(this.b, 1.0F, var4);
            }

            if (var5 < var1) {
               var3 = var4;
            } else {
               var2 = var4;
            }
         }
      } else {
         return var1;
      }
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof zk) {
         float var2 = this.a;
         zk var3 = (zk)var1;
         if (var2 == var3.a && this.b == var3.b && this.c == var3.c) {
            var2 = var3.d;
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return ((Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c)) * 31 + Float.floatToIntBits(1.0F);
   }
}
