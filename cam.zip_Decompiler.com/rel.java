// $FF: synthetic class
public final class rel {
   private static final qvt a;
   private static final qvx b;

   static {
      a = rek.a;
      b = rhe.b;
   }

   public static final ree a(ree var0) {
      if (var0 instanceof rfy) {
         return var0;
      } else {
         boolean var1 = var0 instanceof red;
         qvt var2 = a;
         qvx var3 = b;
         if (var1) {
            red var4 = (red)var0;
            if (var4.a == var2 && var4.b == var3) {
               return var0;
            }
         }

         return new red(var0, var2, var3);
      }
   }
}
