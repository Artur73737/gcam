public final class cng implements Runnable {
   private final clv a;
   private boolean b;
   private final clx c;

   public cng(clx var1, clv var2) {
      var2.getClass();
      super();
      this.c = var1;
      this.a = var2;
   }

   public final void run() {
      if (!this.b) {
         this.c.b(this.a);
         this.b = true;
      }

   }
}
