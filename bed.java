// $FF: synthetic class
public final class bed implements bei {
   public static final bed a = new bed(0);
   public static final bed b = new bed(1);
   public static final bed c = new bed(2);
   private final int d;

   // $FF: synthetic method
   private bed(int var1) {
      this.d = var1;
   }

   public final double a(double var1) {
      double var3;
      switch(this.d) {
      case 0:
         if (var1 < 0.0D) {
            var3 = -var1;
         } else {
            var3 = var1;
         }

         return Math.copySign(bdb.f(var3, 0.9478672985781991D, 0.05213270142180095D, 0.07739938080495357D, 0.04045D, 2.4D), var1);
      case 1:
         if (var1 < 0.0D) {
            var3 = -var1;
         } else {
            var3 = var1;
         }

         return Math.copySign(bdb.e(var3, 0.9478672985781991D, 0.05213270142180095D, 0.07739938080495357D, 0.04045D, 2.4D), var1);
      default:
         return var1;
      }
   }
}
