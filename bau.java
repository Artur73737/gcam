public final class bau implements bar {
   private final float b;
   private final float c;

   public bau(float var1, float var2) {
      this.b = var1;
      this.c = var2;
   }

   public final long a(long var1, long var3, bxy var5) {
      var5.getClass();
      float var6;
      if (var5 == bxy.a) {
         var6 = this.b;
      } else {
         var6 = -this.b;
      }

      int var10 = bxx.a(var1);
      int var12 = bxx.a(var3);
      int var9 = bxx.b(var1);
      int var11 = bxx.b(var3);
      float var7 = this.c;
      float var8 = (float)(var12 - var10) / 2.0F;
      return car.K(qxg.e((float)(var11 - var9) / 2.0F * (var6 + 1.0F)), qxg.e(var8 * (var7 + 1.0F)));
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bau)) {
         return false;
      } else {
         bau var2 = (bau)var1;
         if (Float.compare(this.b, var2.b) != 0) {
            return false;
         } else {
            return Float.compare(this.c, var2.c) == 0;
         }
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.b) * 31 + Float.floatToIntBits(this.c);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("BiasAlignment(horizontalBias=");
      var1.append(this.b);
      var1.append(", verticalBias=");
      var1.append(this.c);
      var1.append(')');
      return var1.toString();
   }
}
