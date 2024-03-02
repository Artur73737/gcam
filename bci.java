public final class bci {
   public static final long a = es.i(0.0F, 0.0F);
   public static final long b = es.i(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
   public static final long c = es.i(Float.NaN, Float.NaN);
   public final long d;

   // $FF: synthetic method
   private bci(long var1) {
      this.d = var1;
   }

   public static final float a(long var0) {
      return (float)Math.sqrt((double)(b(var0) * b(var0) + c(var0) * c(var0)));
   }

   public static final float b(long var0) {
      if (var0 != c) {
         return Float.intBitsToFloat((int)(var0 >> 32));
      } else {
         throw new IllegalStateException("Offset is unspecified");
      }
   }

   public static final float c(long var0) {
      if (var0 != c) {
         return Float.intBitsToFloat((int)(var0 & 4294967295L));
      } else {
         throw new IllegalStateException("Offset is unspecified");
      }
   }

   public static final long d(long var0, float var2) {
      return es.i(b(var0) / var2, c(var0) / var2);
   }

   public static final long e(long var0, long var2) {
      return es.i(b(var0) - b(var2), c(var0) - c(var2));
   }

   public static final long f(long var0, long var2) {
      return es.i(b(var0) + b(var2), c(var0) + c(var2));
   }

   public static final long g(long var0, float var2) {
      return es.i(b(var0) * var2, c(var0) * var2);
   }

   public static final long h(long var0) {
      return es.i(-b(var0), -c(var0));
   }

   // $FF: synthetic method
   public static final bci i(long var0) {
      return new bci(var0);
   }

   public static String j(long var0) {
      String var3;
      if (var0 != c) {
         StringBuilder var2 = new StringBuilder();
         var2.append("Offset(");
         var2.append(er.k(b(var0)));
         var2.append(", ");
         var2.append(er.k(c(var0)));
         var2.append(')');
         var3 = var2.toString();
      } else {
         var3 = "Offset.Unspecified";
      }

      return var3;
   }

   // $FF: synthetic method
   public static long k(long var0, int var2) {
      float var4 = 0.0F;
      float var3;
      if ((var2 & 1) != 0) {
         var3 = b(var0);
      } else {
         var3 = 0.0F;
      }

      if ((var2 & 2) != 0) {
         var4 = c(var0);
      }

      return es.i(var3, var4);
   }

   public final boolean equals(Object var1) {
      boolean var2 = var1 instanceof bci;
      long var3 = this.d;
      return var2 && var3 == ((bci)var1).d;
   }

   public final int hashCode() {
      return c.p(this.d);
   }

   public final String toString() {
      return j(this.d);
   }
}
