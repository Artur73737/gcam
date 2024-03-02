public final class bxe {
   public final int a;

   // $FF: synthetic method
   public bxe(int var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof bxe;
      int var2 = this.a;
      return var3 && var2 == ((bxe)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      int var1 = this.a;
      String var2;
      if (c.n(var1, 1)) {
         var2 = "Ltr";
      } else if (c.n(var1, 2)) {
         var2 = "Rtl";
      } else if (c.n(var1, 3)) {
         var2 = "Content";
      } else if (c.n(var1, 4)) {
         var2 = "ContentOrLtr";
      } else if (c.n(var1, 5)) {
         var2 = "ContentOrRtl";
      } else {
         var2 = "Invalid";
      }

      return var2;
   }
}
