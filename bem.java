// $FF: synthetic class
public final class bem implements bei {
   public final double a;
   private final int b;

   // $FF: synthetic method
   public bem(double var1, int var3) {
      this.b = var3;
      this.a = var1;
   }

   public final double a(double var1) {
      switch(this.b) {
      case 0:
         if (var1 < 0.0D) {
            var1 = 0.0D;
         }

         return Math.pow(var1, this.a);
      default:
         double var5 = 1.0D / this.a;
         double var3 = var1;
         if (var1 < 0.0D) {
            var3 = 0.0D;
         }

         return Math.pow(var3, var5);
      }
   }
}
