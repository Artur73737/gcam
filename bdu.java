public final class bdu {
   public final int a;

   // $FF: synthetic method
   public bdu(int var1) {
      this.a = var1;
   }

   public static String a(int var0) {
      String var1;
      if (c.n(var0, 0)) {
         var1 = "Butt";
      } else if (c.n(var0, 1)) {
         var1 = "Round";
      } else if (c.n(var0, 2)) {
         var1 = "Square";
      } else {
         var1 = "Unknown";
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof bdu;
      int var2 = this.a;
      return var3 && var2 == ((bdu)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      return a(this.a);
   }
}
