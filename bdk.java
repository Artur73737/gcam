public final class bdk {
   public final int a;

   // $FF: synthetic method
   public bdk(int var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof bdk;
      int var2 = this.a;
      return var3 && var2 == ((bdk)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      int var1 = this.a;
      String var2;
      if (c.n(var1, 0)) {
         var2 = "NonZero";
      } else if (c.n(var1, 1)) {
         var2 = "EvenOdd";
      } else {
         var2 = "Unknown";
      }

      return var2;
   }
}
