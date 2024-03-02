public final class zw {
   public float a = 1.0F;
   public double b = Math.sqrt(50.0D);
   public boolean c;
   public float d = 1.0F;
   private double e;
   private double f;
   private double g;

   public final float a() {
      double var1 = this.b;
      return (float)(var1 * var1);
   }

   public final long b(float var1, float var2, long var3) {
      double var5;
      double var7;
      double var9;
      float var25;
      if (!this.c) {
         if (this.a == Float.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
         }

         var25 = this.d;
         var5 = (double)var25;
         Double.isNaN(var5);
         Double.isNaN(var5);
         var5 *= var5;
         if (var25 > 1.0F) {
            var25 = -var25;
            var7 = this.b;
            var9 = (double)var25;
            Double.isNaN(var9);
            --var5;
            this.e = var9 * var7 + var7 * Math.sqrt(var5);
            var25 = -this.d;
            var7 = this.b;
            var9 = (double)var25;
            Double.isNaN(var9);
            this.f = var9 * var7 - var7 * Math.sqrt(var5);
         } else if (var25 >= 0.0F && var25 < 1.0F) {
            this.g = this.b * Math.sqrt(1.0D - var5);
         }

         this.c = true;
      }

      var25 = var1 - this.a;
      var5 = (double)var3;
      var1 = this.d;
      Double.isNaN(var5);
      var5 /= 1000.0D;
      double var11;
      double var13;
      double var15;
      double var17;
      double var19;
      if (var1 > 1.0F) {
         var9 = (double)var25;
         var11 = this.f;
         Double.isNaN(var9);
         var7 = (double)var2;
         var13 = this.e;
         Double.isNaN(var7);
         var7 = (var11 * var9 - var7) / (var11 - var13);
         Double.isNaN(var9);
         var9 -= var7;
         var13 = Math.exp(var11 * var5);
         var11 = Math.exp(this.e * var5);
         var15 = this.f;
         var19 = Math.exp(var15 * var5);
         var17 = this.e;
         var5 = var9 * var15 * var19 + var7 * var17 * Math.exp(var17 * var5);
         var7 = var13 * var9 + var11 * var7;
      } else if (var1 == 1.0F) {
         var7 = (double)var2;
         var11 = this.b;
         var9 = (double)var25;
         Double.isNaN(var9);
         Double.isNaN(var7);
         var7 += var11 * var9;
         var11 = -var11;
         Double.isNaN(var9);
         var9 += var7 * var5;
         var11 = Math.exp(var11 * var5);
         var15 = Math.exp(-this.b * var5);
         var13 = -this.b;
         var5 = var9 * var15 * var13 + var7 * Math.exp(var5 * var13);
         var7 = var11 * var9;
      } else {
         var7 = 1.0D / this.g;
         double var21 = (double)var1;
         var11 = this.b;
         Double.isNaN(var21);
         var9 = (double)var25;
         var19 = (double)var2;
         var13 = (double)(-var1);
         Double.isNaN(var13);
         var13 = Math.exp(var13 * var11 * var5);
         var15 = Math.cos(this.g * var5);
         Double.isNaN(var9);
         var17 = this.g;
         Double.isNaN(var9);
         Double.isNaN(var19);
         var11 = var7 * (var21 * var11 * var9 + var19);
         var7 = var13 * (var15 * var9 + Math.sin(var17 * var5) * var11);
         var17 = this.b;
         var15 = -var17;
         var1 = this.d;
         var13 = (double)var1;
         var19 = (double)(-var1);
         Double.isNaN(var19);
         var19 = Math.exp(var19 * var17 * var5);
         var21 = this.g;
         var17 = -var21;
         Double.isNaN(var9);
         var21 = Math.sin(var21 * var5);
         double var23 = this.g;
         var5 = Math.cos(var23 * var5);
         Double.isNaN(var13);
         var5 = var19 * (var17 * var9 * var21 + var11 * var23 * var5) + var7 * var15 * var13;
      }

      var9 = (double)this.a;
      Double.isNaN(var9);
      var3 = (long)Float.floatToIntBits((float)(var7 + var9));
      return (long)Float.floatToIntBits((float)var5) & 4294967295L | var3 << 32;
   }
}
