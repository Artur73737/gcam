public final class bcl {
   public static final long a = et.k(0.0F, 0.0F);
   public static final long b = et.k(Float.NaN, Float.NaN);
   public final long c;

   // $FF: synthetic method
   private bcl(long var1) {
      this.c = var1;
   }

   public static final float a(long var0) {
      if (var0 != b) {
         return Float.intBitsToFloat((int)(var0 & 4294967295L));
      } else {
         throw new IllegalStateException("Size is unspecified");
      }
   }

   public static final float b(long var0) {
      return Math.min(Math.abs(c(var0)), Math.abs(a(var0)));
   }

   public static final float c(long var0) {
      if (var0 != b) {
         return Float.intBitsToFloat((int)(var0 >> 32));
      } else {
         throw new IllegalStateException("Size is unspecified");
      }
   }

   // $FF: synthetic method
   public static final bcl d(long var0) {
      return new bcl(var0);
   }

   public static String e(long var0) {
      String var3;
      if (var0 != b) {
         StringBuilder var2 = new StringBuilder();
         var2.append("Size(");
         var2.append(er.k(c(var0)));
         var2.append(", ");
         var2.append(er.k(a(var0)));
         var2.append(')');
         var3 = var2.toString();
      } else {
         var3 = "Size.Unspecified";
      }

      return var3;
   }

   public static boolean f(long var0, Object var2) {
      if (!(var2 instanceof bcl)) {
         return false;
      } else {
         return var0 == ((bcl)var2).c;
      }
   }

   public static final boolean g(long var0) {
      return c(var0) <= 0.0F || a(var0) <= 0.0F;
   }

   public final boolean equals(Object var1) {
      return f(this.c, var1);
   }

   public final int hashCode() {
      return c.p(this.c);
   }

   public final String toString() {
      return e(this.c);
   }
}
