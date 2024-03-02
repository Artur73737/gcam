public final class awl extends awu {
   public static final awl a = new awl();

   private awl() {
      super(2, 0, 2);
   }

   public final String a(int var1) {
      String var2;
      if (c.n(var1, 0)) {
         var2 = "removeIndex";
      } else if (c.n(var1, 1)) {
         var2 = "count";
      } else {
         var2 = super.a(var1);
      }

      return var2;
   }

   public final void b(aww var1, asf var2, auw var3, asv var4) {
      var2.j(var1.a(0), var1.a(1));
   }
}
