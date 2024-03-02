public final class ry {
   public final int a;

   // $FF: synthetic method
   private ry(int var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final ry a(int var0) {
      return new ry(var0);
   }

   public static String b(int var0) {
      return c.aE(var0, "Stream-");
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof ry;
      int var2 = this.a;
      return var3 && var2 == ((ry)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      return b(this.a);
   }
}
