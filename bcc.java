public enum bcc implements bcb {
   a,
   b,
   c,
   d;

   private static final bcc[] e;

   static {
      bcc var3 = new bcc("Active", 0);
      a = var3;
      bcc var2 = new bcc("ActiveParent", 1);
      b = var2;
      bcc var1 = new bcc("Captured", 2);
      c = var1;
      bcc var0 = new bcc("Inactive", 3);
      d = var0;
      e = new bcc[]{var3, var2, var1, var0};
   }

   public final boolean a() {
      switch(this.ordinal()) {
      case 0:
      case 2:
         return true;
      case 1:
      case 3:
         return false;
      default:
         throw new qse();
      }
   }
}
