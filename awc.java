public final class awc extends awu {
   public static final awc a = new awc();

   private awc() {
      super(1, 2);
   }

   public final String a(int var1) {
      String var2;
      if (c.n(var1, 0)) {
         var2 = "insertIndex";
      } else {
         var2 = super.a(var1);
      }

      return var2;
   }

   public final void b(aww var1, asf var2, auw var3, asv var4) {
      Object var6 = ((qvi)var1.c(0)).a();
      nxj var7 = (nxj)var1.c(1);
      int var5 = var1.a(0);
      var7.getClass();
      var3.J(var3.T(var7), var6);
      var2.h(var5, var6);
      var2.c(var6);
   }

   public final String c(int var1) {
      String var2;
      if (c.n(var1, 0)) {
         var2 = "factory";
      } else if (c.n(var1, 1)) {
         var2 = "groupAnchor";
      } else {
         var2 = super.c(var1);
      }

      return var2;
   }
}
