final class blk {
   public static final float a(long var0) {
      return Float.intBitsToFloat((int)(var0 >> 32));
   }

   public static final int b(long var0, long var2) {
      boolean var4 = c(var0);
      if (var4 != c(var2)) {
         return var4 ? -1 : 1;
      } else {
         return (int)Math.signum(a(var0) - a(var2));
      }
   }

   public static final boolean c(long var0) {
      return (int)(var0 & 4294967295L) != 0;
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
