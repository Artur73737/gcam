public final class bxq {
   public static final int[] a = new int[]{18, 20, 17, 15};
   public static final car c = new car();
   private static final int[] d = new int[]{65535, 262143, 32767, 8191};
   private static final int[] e = new int[]{32767, 8191, 65535, 262143};
   public final long b;

   // $FF: synthetic method
   private bxq(long var1) {
      this.b = var1;
   }

   public static final int a(long var0) {
      int[] var4 = e;
      int var2 = l(var0);
      int var3 = var4[var2];
      var2 = (int)(var0 >> a[var2] + 31) & var3;
      return var2 == 0 ? Integer.MAX_VALUE : var2 - 1;
   }

   public static final int b(long var0) {
      int var2 = d[l(var0)];
      var2 &= (int)(var0 >> 33);
      return var2 == 0 ? Integer.MAX_VALUE : var2 - 1;
   }

   public static final int c(long var0) {
      int[] var4 = e;
      int var2 = l(var0);
      int var3 = var4[var2];
      return (int)(var0 >> a[var2]) & var3;
   }

   public static final int d(long var0) {
      int var2 = d[l(var0)];
      return (int)(var0 >> 2) & var2;
   }

   // $FF: synthetic method
   public static final bxq e(long var0) {
      return new bxq(var0);
   }

   public static String f(long var0) {
      int var2 = b(var0);
      String var4 = "Infinity";
      String var3;
      if (var2 == Integer.MAX_VALUE) {
         var3 = "Infinity";
      } else {
         var3 = String.valueOf(var2);
      }

      var2 = a(var0);
      if (var2 != Integer.MAX_VALUE) {
         var4 = String.valueOf(var2);
      }

      StringBuilder var5 = new StringBuilder();
      var5.append("Constraints(minWidth = ");
      var5.append(d(var0));
      var5.append(", maxWidth = ");
      var5.append(var3);
      var5.append(", minHeight = ");
      var5.append(c(var0));
      var5.append(", maxHeight = ");
      var5.append(var4);
      var5.append(')');
      return var5.toString();
   }

   public static final boolean g(long var0) {
      int[] var4 = e;
      int var3 = l(var0);
      int var2 = var4[var3];
      return ((int)(var0 >> a[var3] + 31) & var2) != 0;
   }

   public static final boolean h(long var0) {
      int var2 = d[l(var0)];
      return ((int)(var0 >> 33) & var2) != 0;
   }

   public static final boolean i(long var0) {
      return a(var0) == c(var0);
   }

   public static final boolean j(long var0) {
      return b(var0) == d(var0);
   }

   // $FF: synthetic method
   public static long k(long var0, int var2, int var3, int var4, int var5, int var6) {
      if ((var6 & 1) != 0) {
         var2 = d(var0);
      }

      if ((var6 & 2) != 0) {
         var3 = b(var0);
      }

      if ((var6 & 4) != 0) {
         var4 = c(var0);
      }

      if ((var6 & 8) != 0) {
         var5 = a(var0);
      }

      if (var4 >= 0 && var2 >= 0) {
         if (var3 >= var2) {
            if (var5 >= var4) {
               return car.ab(var2, var3, var4, var5);
            } else {
               throw new IllegalArgumentException(c.aJ((byte)41, var4, var5, "maxHeight(", ") must be >= minHeight("));
            }
         } else {
            throw new IllegalArgumentException(c.aJ((byte)41, var2, var3, "maxWidth(", ") must be >= minWidth("));
         }
      } else {
         throw new IllegalArgumentException(c.aI(var2, var4, "minHeight(", ") and minWidth(", ") must be >= 0"));
      }
   }

   private static final int l(long var0) {
      return (int)(var0 & 3L);
   }

   public final boolean equals(Object var1) {
      boolean var2 = var1 instanceof bxq;
      long var3 = this.b;
      return var2 && var3 == ((bxq)var1).b;
   }

   public final int hashCode() {
      return c.p(this.b);
   }

   public final String toString() {
      return f(this.b);
   }
}
