public final class aak implements zp {
   private final int a;
   private final int b;
   private final zm c;

   public aak() {
      this(0, (zm)null, 7);
   }

   public aak(int var1, int var2, zm var3) {
      var3.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   // $FF: synthetic method
   public aak(int var1, zm var2, int var3) {
      if ((var3 & 4) != 0) {
         var2 = zo.a;
      }

      if (1 == (var3 & 1)) {
         var1 = 300;
      }

      this(var1, 0, var2);
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof aak) {
         aak var2 = (aak)var1;
         if (var2.a == this.a && var2.b == this.b && c.E(var2.c, this.c)) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return (this.a * 31 + this.c.hashCode()) * 31 + this.b;
   }
}
