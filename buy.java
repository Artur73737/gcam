public final class buy {
   public final int a;

   // $FF: synthetic method
   private buy(int var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final buy a(int var0) {
      return new buy(var0);
   }

   public static String b(int var0) {
      String var1;
      if (c.n(var0, 0)) {
         var1 = "Normal";
      } else if (c.n(var0, 1)) {
         var1 = "Italic";
      } else {
         var1 = "Invalid";
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof buy;
      int var2 = this.a;
      return var3 && var2 == ((buy)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      return b(this.a);
   }
}
