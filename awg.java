public final class awg extends awu {
   public static final awg a = new awg();

   private awg() {
      super(3, 0, 2);
   }

   public final String a(int var1) {
      String var2;
      if (c.n(var1, 0)) {
         var2 = "from";
      } else if (c.n(var1, 1)) {
         var2 = "to";
      } else if (c.n(var1, 2)) {
         var2 = "count";
      } else {
         var2 = super.a(var1);
      }

      return var2;
   }

   public final void b(aww var1, asf var2, auw var3, asv var4) {
      var2.i(var1.a(0), var1.a(1), var1.a(2));
   }
}
