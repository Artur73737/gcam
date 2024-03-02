public class cc {
   public static final int a = 0;
   private static final xo b = new xo();

   public static Class a(ClassLoader var0, String var1) {
      xo var4 = b;
      xo var3 = (xo)var4.get(var0);
      xo var2 = var3;
      if (var3 == null) {
         var2 = new xo();
         var4.put(var0, var2);
      }

      Class var6 = (Class)var2.get(var1);
      if (var6 == null) {
         Class var5 = Class.forName(var1, false, var0);
         var2.put(var1, var5);
         return var5;
      } else {
         return var6;
      }
   }

   public bv b(String var1) {
      throw null;
   }
}
