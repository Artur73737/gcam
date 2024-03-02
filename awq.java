public final class awq extends awu {
   public static final awq a = new awq();

   private awq() {
      super(0, 2, 1);
   }

   public final void b(aww var1, asf var2, auw var3, asv var4) {
      Object var5 = var1.c(0);
      ((qvx)var1.c(1)).a(var2.a(), var5);
   }

   public final String c(int var1) {
      String var2;
      if (c.n(var1, 0)) {
         var2 = "value";
      } else if (c.n(var1, 1)) {
         var2 = "block";
      } else {
         var2 = super.c(var1);
      }

      return var2;
   }
}
