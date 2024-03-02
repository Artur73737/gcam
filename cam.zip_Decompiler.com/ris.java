public final class ris {
   public static final riq a = new riq("NO_THREAD_ELEMENTS");
   private static final qvx b;
   private static final qvx c;
   private static final qvx d;

   static {
      b = rhe.c;
      c = rhe.d;
      d = rhe.e;
   }

   public static final Object a(qui var0) {
      var0.getClass();
      Object var1 = var0.fold(0, b);
      var1.getClass();
      return var1;
   }

   public static final Object b(qui var0, Object var1) {
      var0.getClass();
      Object var2 = var1;
      if (var1 == null) {
         var2 = a(var0);
      }

      Object var3;
      if (var2 == 0) {
         var3 = a;
      } else if (var2 instanceof Integer) {
         var3 = var0.fold(new rix(var0, ((Number)var2).intValue()), d);
      } else {
         var3 = ((rca)var2).gH(var0);
      }

      return var3;
   }

   public static final void c(qui var0, Object var1) {
      var0.getClass();
      if (var1 != a) {
         if (!(var1 instanceof rix)) {
            Object var5 = var0.fold((Object)null, c);
            var5.getClass();
            ((rca)var5).gI(var1);
         } else {
            rix var6 = (rix)var1;
            int var2 = var6.c.length - 1;
            if (var2 >= 0) {
               while(true) {
                  int var3 = var2 - 1;
                  rca var4 = var6.c[var2];
                  var4.getClass();
                  var4.gI(var6.b[var2]);
                  if (var3 < 0) {
                     break;
                  }

                  var2 = var3;
               }
            }

         }
      }
   }
}
