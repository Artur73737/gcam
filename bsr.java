public final class bsr {
   public static final long a = lb.f(0, 0);

   public static final int a(long var0) {
      return (int)(var0 & 4294967295L);
   }

   public static final int b(long var0) {
      int var2;
      if (d(var0) > a(var0)) {
         var2 = d(var0);
      } else {
         var2 = a(var0);
      }

      return var2;
   }

   public static final int c(long var0) {
      int var2;
      if (d(var0) > a(var0)) {
         var2 = a(var0);
      } else {
         var2 = d(var0);
      }

      return var2;
   }

   public static final int d(long var0) {
      return (int)(var0 >> 32);
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
