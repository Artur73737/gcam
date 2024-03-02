public final class bwx {
   public final int a = 3;

   public static String a() {
      String var0;
      if (c.n(3, 1)) {
         var0 = "Strictness.None";
      } else if (c.n(3, 2)) {
         var0 = "Strictness.Loose";
      } else if (c.n(3, 3)) {
         var0 = "Strictness.Normal";
      } else if (c.n(3, 4)) {
         var0 = "Strictness.Strict";
      } else {
         var0 = "Invalid";
      }

      return var0;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof bwx)) {
         return false;
      } else {
         int var2 = ((bwx)var1).a;
         return true;
      }
   }

   public final int hashCode() {
      return 3;
   }

   public final String toString() {
      return a();
   }
}
