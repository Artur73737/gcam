public final class beq extends bec {
   public beq() {
      super("Generic XYZ", 12884901889L, 14);
   }

   private static final float g(float var0) {
      return qxb.j(var0, -2.0F, 2.0F);
   }

   public final float a(int var1) {
      return 2.0F;
   }

   public final float b(int var1) {
      return -2.0F;
   }

   public final float c(float var1, float var2, float var3) {
      return g(var3);
   }

   public final long d(float var1, float var2, float var3) {
      var1 = g(var1);
      var2 = g(var2);
      long var4 = (long)Float.floatToIntBits(var1);
      return (long)Float.floatToIntBits(var2) & 4294967295L | var4 << 32;
   }

   public final long e(float var1, float var2, float var3, float var4, bec var5) {
      return bcq.k(g(var1), g(var2), g(var3), var4, var5);
   }
}
