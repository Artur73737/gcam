public final class cfr {
   private int a;
   private int b;

   public final int a() {
      return this.a | this.b;
   }

   public final void b(int var1, int var2) {
      if (var2 == 1) {
         this.b = var1;
      } else {
         this.a = var1;
      }
   }

   public final void c(int var1) {
      if (var1 == 1) {
         this.b = 0;
      } else {
         this.a = 0;
      }
   }
}
