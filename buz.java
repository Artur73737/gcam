public final class buz {
   public final int a = 1;

   // $FF: synthetic method
   private buz() {
   }

   // $FF: synthetic method
   public static final buz a() {
      return new buz();
   }

   public static String b() {
      String var0;
      if (c.n(1, 0)) {
         var0 = "None";
      } else if (c.n(1, 1)) {
         var0 = "All";
      } else if (c.n(1, 2)) {
         var0 = "Weight";
      } else if (c.n(1, 3)) {
         var0 = "Style";
      } else {
         var0 = "Invalid";
      }

      return var0;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof buz)) {
         return false;
      } else {
         int var2 = ((buz)var1).a;
         return true;
      }
   }

   public final int hashCode() {
      return 1;
   }

   public final String toString() {
      return b();
   }
}
