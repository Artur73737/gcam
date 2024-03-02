public final class bmt {
   public static final bms a;

   static {
      bms var0 = new bms();
      var0.r = -1;
      a = var0;
   }

   public static final int a(baz var0, baz var1) {
      var0.getClass();
      var1.getClass();
      byte var2;
      if (c.E(var0, var1)) {
         var2 = 2;
      } else {
         if (var0.getClass() == var1.getClass()) {
            return 1;
         }

         var2 = 0;
      }

      return var2;
   }
}
