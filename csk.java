final class csk extends RuntimeException {
   public final Throwable a;
   public final int b;

   public csk(int var1, Throwable var2) {
      super(var2);
      this.b = var1;
      this.a = var2;
   }

   public final Throwable getCause() {
      return this.a;
   }
}
