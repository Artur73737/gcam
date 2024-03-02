public final class aml {
   public static final aml a = new aml((bjf)null, (bsq)null);
   public final bjf b;
   public final bsq c;

   public aml(bjf var1, bsq var2) {
      this.b = var1;
      this.c = var2;
   }

   // $FF: synthetic method
   public static aml a(aml var0, bjf var1, bsq var2, int var3) {
      if ((var3 & 1) != 0) {
         var1 = var0.b;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.c;
      }

      return new aml(var1, var2);
   }
}
