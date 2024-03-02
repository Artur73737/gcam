public final class bwv {
   public final int a = 1;

   public final boolean equals(Object var1) {
      if (!(var1 instanceof bwv)) {
         return false;
      } else {
         int var2 = ((bwv)var1).a;
         return true;
      }
   }

   public final int hashCode() {
      return 1;
   }

   public final String toString() {
      String var1;
      if (c.n(1, 1)) {
         var1 = "Hyphens.None";
      } else if (c.n(1, 2)) {
         var1 = "Hyphens.Auto";
      } else {
         var1 = "Invalid";
      }

      return var1;
   }
}
