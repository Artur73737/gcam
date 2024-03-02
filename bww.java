public final class bww {
   public final int a = 1;

   public static String a() {
      String var0;
      if (c.n(1, 1)) {
         var0 = "Strategy.Simple";
      } else if (c.n(1, 2)) {
         var0 = "Strategy.HighQuality";
      } else if (c.n(1, 3)) {
         var0 = "Strategy.Balanced";
      } else {
         var0 = "Invalid";
      }

      return var0;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof bww)) {
         return false;
      } else {
         int var2 = ((bww)var1).a;
         return true;
      }
   }

   public final int hashCode() {
      return 1;
   }

   public final String toString() {
      return a();
   }
}
