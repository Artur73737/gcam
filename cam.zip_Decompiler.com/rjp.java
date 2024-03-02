public final class rjp {
   public static final riq a = new riq("UNLOCK_FAIL");
   public static final riq b;
   public static final riq c;
   public static final rjk d;
   public static final rjk e;

   static {
      riq var1 = new riq("LOCKED");
      b = var1;
      riq var0 = new riq("UNLOCKED");
      c = var0;
      d = new rjk(var1);
      e = new rjk(var0);
   }

   public static final rjo a() {
      return new rjo();
   }
}
