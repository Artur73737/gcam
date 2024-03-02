public abstract class cqx extends crj {
   public cqx(crc var1) {
      super(var1);
   }

   public final void a(Object var1) {
      csp var2 = this.e();

      try {
         this.b(var2, var1);
         var2.b();
      } finally {
         this.g(var2);
      }

   }

   protected abstract void b(csp var1, Object var2);

   public final void c(Object var1) {
      csp var2 = this.e();

      try {
         this.b(var2, var1);
         var2.b();
      } finally {
         this.g(var2);
      }

   }
}
