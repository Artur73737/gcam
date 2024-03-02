public final class rjj extends qyy {
   private final int a;
   private final rht b;

   public rjj(rht var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void b(Throwable var1) {
      rht var3 = this.b;
      int var2 = this.a;
      riq var4 = rjr.e;
      var3.d.k(var2).c(var4);
      if (var3.c.b() == rjr.f && !var3.d()) {
         var3.c();
      }

   }

   public final String toString() {
      rht var2 = this.b;
      int var1 = this.a;
      StringBuilder var3 = new StringBuilder();
      var3.append("CancelSemaphoreAcquisitionHandler[");
      var3.append(var2);
      var3.append(", ");
      var3.append(var1);
      var3.append("]");
      return var3.toString();
   }
}
