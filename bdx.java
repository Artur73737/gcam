public final class bdx {
   public static final long a = bdn.a(0.5F, 0.5F);
   public final long b;

   // $FF: synthetic method
   private bdx(long var1) {
      this.b = var1;
   }

   public static final float a(long var0) {
      return Float.intBitsToFloat((int)(var0 >> 32));
   }

   public static final float b(long var0) {
      return Float.intBitsToFloat((int)(var0 & 4294967295L));
   }

   // $FF: synthetic method
   public static final bdx c(long var0) {
      return new bdx(var0);
   }

   public static String d(long var0) {
      StringBuilder var2 = new StringBuilder();
      var2.append("TransformOrigin(packedValue=");
      var2.append(var0);
      var2.append(')');
      return var2.toString();
   }

   public final boolean equals(Object var1) {
      boolean var4 = var1 instanceof bdx;
      long var2 = this.b;
      return var4 && var2 == ((bdx)var1).b;
   }

   public final int hashCode() {
      return c.p(this.b);
   }

   public final String toString() {
      return d(this.b);
   }
}
