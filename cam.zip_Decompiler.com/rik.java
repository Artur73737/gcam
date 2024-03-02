public abstract class rik {
   private final qyq a;

   public rik() {
   }

   public rik(byte[] var1) {
      this.a = qwp.i(rho.a);
   }

   public abstract Object a(Object var1);

   public abstract void b(Object var1, Object var2);

   public final Object c(Object var1) {
      Object var4 = this.a.a;
      Object var3 = var4;
      if (var4 == rho.a) {
         var4 = this.a(var1);
         boolean var2 = qzx.a;
         var3 = this.a.a;
         Object var5 = rho.a;
         if (var3 == var5) {
            var3 = var4;
            if (!this.a.d(var5, var4)) {
               var3 = this.a.a;
            }
         }
      }

      this.b(var1, var3);
      return var3;
   }

   public final String toString() {
      String var3 = qzy.a(this);
      String var2 = qzy.b(this);
      StringBuilder var1 = new StringBuilder();
      var1.append(var3);
      var1.append("@");
      var1.append(var2);
      return var1.toString();
   }
}
