public final class cxk {
   public static final cxk a = new cxk("UNKNOWN");
   public static final cxk b = new cxk("UNSUPPORTED");
   public static final cxk c = new cxk("UNAVAILABLE");
   public static final cxk d = new cxk("AVAILABLE");
   public static final cxk e = new cxk("ACTIVE");
   private final String f;

   private cxk(String var1) {
      this.f = var1;
   }

   public final String toString() {
      return this.f;
   }
}
