public abstract class bnp implements bnu {
   protected String a;
   private final int[] b = new int[2];

   protected final String a() {
      String var1 = this.a;
      if (var1 != null) {
         return var1;
      } else {
         qwp.b("text");
         return null;
      }
   }

   protected final int[] b(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0 && var1 != var2) {
         int[] var3 = this.b;
         var3[0] = var1;
         var3[1] = var2;
         return var3;
      } else {
         return null;
      }
   }
}
