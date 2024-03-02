public enum rlm implements qfr {
   a,
   b,
   c;

   private static final rlm[] e;
   public final int d;

   static {
      rlm var2 = new rlm("UNKNOWN", 0, 0);
      a = var2;
      rlm var0 = new rlm("CREDENTIAL_ENCRYPTED", 1, 1);
      b = var0;
      rlm var1 = new rlm("DEVICE_ENCRYPTED", 2, 2);
      c = var1;
      e = new rlm[]{var2, var0, var1};
   }

   private rlm(int var3) {
      this.d = var3;
   }

   public final int a() {
      return this.d;
   }

   public final String toString() {
      return Integer.toString(this.d);
   }
}
