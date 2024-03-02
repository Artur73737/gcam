public final class brg {
   public final int a = 0;

   public final boolean equals(Object var1) {
      if (!(var1 instanceof brg)) {
         return false;
      } else {
         int var2 = ((brg)var1).a;
         return true;
      }
   }

   public final int hashCode() {
      return 0;
   }

   public final String toString() {
      String var1;
      if (c.n(0, 0)) {
         var1 = "Polite";
      } else if (c.n(0, 1)) {
         var1 = "Assertive";
      } else {
         var1 = "Unknown";
      }

      return var1;
   }
}
