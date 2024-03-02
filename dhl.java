public final class dhl extends Exception {
   public final int a;

   public dhl(String var1, int var2) {
      super(var1);
      this.a = var2;
   }

   public dhl(String var1, int var2, Throwable var3) {
      super(var1, var3);
      this.a = var2;
   }
}
