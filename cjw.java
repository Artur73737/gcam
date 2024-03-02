public final class cjw {
   double a = Math.sqrt(1500.0D);
   double b = 0.5D;
   public double c;
   public double d;
   private boolean e = false;
   private double f;
   private double g;
   private double h;
   private double i = Double.MAX_VALUE;
   private final cjo j = new cjo();

   public cjw() {
   }

   public cjw(float var1) {
      this.i = (double)var1;
   }

   public final float a() {
      return (float)this.i;
   }

   final cjo b(double var1, double var3, long var5) {
      double var7;
      double var9;
      double var11;
      if (!this.e) {
         if (this.i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
         }

         var11 = this.b;
         if (var11 > 1.0D) {
            var9 = -var11;
            var7 = this.a;
            this.f = var9 * var7 + var7 * Math.sqrt(var11 * var11 - 1.0D);
            var11 = this.b;
            var7 = -var11;
            var9 = this.a;
            this.g = var7 * var9 - var9 * Math.sqrt(var11 * var11 - 1.0D);
         } else if (var11 >= 0.0D && var11 < 1.0D) {
            this.h = this.a * Math.sqrt(1.0D - var11 * var11);
         }

         this.e = true;
      }

      var7 = (double)var5;
      var9 = var1 - this.i;
      var11 = this.b;
      Double.isNaN(var7);
      var7 /= 1000.0D;
      double var13;
      double var15;
      double var17;
      if (var11 > 1.0D) {
         var11 = this.g;
         var1 = (var11 * var9 - var3) / (var11 - this.f);
         var9 -= var1;
         var13 = Math.pow(2.718281828459045D, var11 * var7);
         var11 = Math.pow(2.718281828459045D, this.f * var7);
         var15 = this.g;
         var17 = Math.pow(2.718281828459045D, var15 * var7);
         var3 = this.f;
         var3 = var9 * var15 * var17 + var1 * var3 * Math.pow(2.718281828459045D, var3 * var7);
         var1 = var13 * var9 + var11 * var1;
      } else if (var11 == 1.0D) {
         var1 = this.a;
         var3 += var1 * var9;
         var9 += var3 * var7;
         var1 = Math.pow(2.718281828459045D, -var1 * var7) * var9;
         var11 = Math.pow(2.718281828459045D, -this.a * var7);
         var13 = -this.a;
         var3 = var9 * var11 * var13 + var3 * Math.pow(2.718281828459045D, var7 * var13);
      } else {
         double var19 = 1.0D / this.h;
         var17 = this.a;
         var15 = Math.pow(2.718281828459045D, -var11 * var17 * var7);
         var1 = Math.cos(this.h * var7);
         var13 = this.h;
         var3 = var19 * (var11 * var17 * var9 + var3);
         var1 = var15 * (var1 * var9 + Math.sin(var13 * var7) * var3);
         var15 = this.a;
         var13 = -var15;
         var11 = this.b;
         var17 = Math.pow(2.718281828459045D, -var11 * var15 * var7);
         var19 = this.h;
         var15 = -var19;
         var19 = Math.sin(var19 * var7);
         double var21 = this.h;
         var3 = var13 * var1 * var11 + var17 * (var15 * var9 * var19 + var3 * var21 * Math.cos(var21 * var7));
      }

      cjo var23 = this.j;
      var23.a = (float)(var1 + this.i);
      var23.b = (float)var3;
      return var23;
   }

   public final void c(float var1) {
      if (!(var1 < 0.0F)) {
         this.b = (double)var1;
         this.e = false;
      } else {
         throw new IllegalArgumentException("Damping ratio must be non-negative");
      }
   }

   public final void d(float var1) {
      this.i = (double)var1;
   }

   public final void e(float var1) {
      if (!(var1 <= 0.0F)) {
         this.a = Math.sqrt((double)var1);
         this.e = false;
      } else {
         throw new IllegalArgumentException("Spring stiffness constant must be positive.");
      }
   }
}
