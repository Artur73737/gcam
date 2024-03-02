public final class bxv {
   public static final long a = car.M(0.0F, 0.0F);
   public static final long b = car.M(Float.NaN, Float.NaN);

   public static final float a(long var0) {
      if (var0 != b) {
         return Float.intBitsToFloat((int)(var0 & 4294967295L));
      } else {
         throw new IllegalStateException("DpSize is unspecified");
      }
   }

   public static final float b(long var0) {
      if (var0 != b) {
         return Float.intBitsToFloat((int)(var0 >> 32));
      } else {
         throw new IllegalStateException("DpSize is unspecified");
      }
   }

   public final boolean equals(Object var1) {
      throw null;
   }

   public final int hashCode() {
      throw null;
   }

   public final String toString() {
      throw null;
   }
}
