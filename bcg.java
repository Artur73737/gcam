public final class bcg {
   public static final long a = es.k(0.0F, 0.0F);

   public static final float a(long var0) {
      return Float.intBitsToFloat((int)(var0 >> 32));
   }

   public static final float b(long var0) {
      return Float.intBitsToFloat((int)(var0 & 4294967295L));
   }

   public static String c(long var0) {
      StringBuilder var2;
      String var3;
      if (a(var0) == b(var0)) {
         var2 = new StringBuilder();
         var2.append("CornerRadius.circular(");
         var2.append(er.k(a(var0)));
         var2.append(')');
         var3 = var2.toString();
      } else {
         var2 = new StringBuilder();
         var2.append("CornerRadius.elliptical(");
         var2.append(er.k(a(var0)));
         var2.append(", ");
         var2.append(er.k(b(var0)));
         var2.append(')');
         var3 = var2.toString();
      }

      return var3;
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
