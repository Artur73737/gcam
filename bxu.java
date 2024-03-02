public final class bxu {
   public static final long a;
   public final long b;

   static {
      car.L(0.0F, 0.0F);
      a = car.L(Float.NaN, Float.NaN);
   }

   // $FF: synthetic method
   public bxu(long var1) {
      this.b = var1;
   }

   public static final float a(long var0) {
      if (var0 != a) {
         return Float.intBitsToFloat((int)(var0 >> 32));
      } else {
         throw new IllegalStateException("DpOffset is unspecified");
      }
   }

   public static final float b(long var0) {
      if (var0 != a) {
         return Float.intBitsToFloat((int)(var0 & 4294967295L));
      } else {
         throw new IllegalStateException("DpOffset is unspecified");
      }
   }

   public final boolean equals(Object var1) {
      boolean var2 = var1 instanceof bxu;
      long var3 = this.b;
      return var2 && var3 == ((bxu)var1).b;
   }

   public final int hashCode() {
      return c.p(this.b);
   }

   public final String toString() {
      long var1 = this.b;
      String var4;
      if (var1 != a) {
         StringBuilder var3 = new StringBuilder();
         var3.append('(');
         var3.append(bxt.b(a(var1)));
         var3.append(", ");
         var3.append(bxt.b(b(var1)));
         var3.append(')');
         var4 = var3.toString();
      } else {
         var4 = "DpOffset.Unspecified";
      }

      return var4;
   }
}
