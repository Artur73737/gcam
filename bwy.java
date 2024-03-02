public final class bwy {
   public final int a = 1;

   public static String a() {
      String var0;
      if (c.n(1, 1)) {
         var0 = "WordBreak.None";
      } else if (c.n(1, 2)) {
         var0 = "WordBreak.Phrase";
      } else {
         var0 = "Invalid";
      }

      return var0;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof bwy)) {
         return false;
      } else {
         int var2 = ((bwy)var1).a;
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
