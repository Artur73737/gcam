public final class bgp {
   public final int a;

   // $FF: synthetic method
   private bgp(int var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final bgp a(int var0) {
      return new bgp(var0);
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof bgp;
      int var2 = this.a;
      return var3 && var2 == ((bgp)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      int var1 = this.a;
      String var2;
      if (c.n(var1, 1)) {
         var2 = "Touch";
      } else if (c.n(var1, 2)) {
         var2 = "Keyboard";
      } else {
         var2 = "Error";
      }

      return var2;
   }
}
