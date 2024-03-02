public abstract class cqw extends crj {
   public cqw(crc var1) {
      super(var1);
   }

   public final int a(Object var1) {
      csp var3 = this.e();

      int var2;
      try {
         this.b(var3, var1);
         var2 = var3.a();
      } finally {
         this.g(var3);
      }

      return var2;
   }

   protected abstract void b(csp var1, Object var2);
}
