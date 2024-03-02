public final class bcy {
   public static final long a = bcq.j(4278190080L);
   public static final long b;
   public static final long c;
   public static final long d;
   public static final long e;
   public static final long f;
   public final long g;

   static {
      bcq.j(4282664004L);
      bcq.j(4287137928L);
      bcq.j(4291611852L);
      b = bcq.j(4294967295L);
      c = bcq.j(4294901760L);
      bcq.j(4278255360L);
      d = bcq.j(4278190335L);
      bcq.j(4294967040L);
      bcq.j(4278255615L);
      bcq.j(4294902015L);
      e = bcq.i(0);
      float[] var0 = bee.a;
      f = bcq.k(0.0F, 0.0F, 0.0F, 0.0F, bee.s);
   }

   // $FF: synthetic method
   private bcy(long var1) {
      this.g = var1;
   }

   public static final float a(long var0) {
      float var2;
      float var3;
      if ((63L & var0) == 0L) {
         var3 = (float)pwm.bp(var0 >>> 56);
         var2 = 255.0F;
      } else {
         var3 = (float)pwm.bp(var0 >>> 6 & 1023L);
         var2 = 1023.0F;
      }

      return var3 / var2;
   }

   public static final float b(long var0) {
      float var2;
      if ((63L & var0) == 0L) {
         var2 = (float)pwm.bp(var0 >>> 32 & 255L) / 255.0F;
      } else {
         int var3 = bdc.a;
         var2 = bdc.a((short)((int)(var0 >>> 16 & 65535L)));
      }

      return var2;
   }

   public static final float c(long var0) {
      float var2;
      if ((63L & var0) == 0L) {
         var2 = (float)pwm.bp(var0 >>> 40 & 255L) / 255.0F;
      } else {
         int var3 = bdc.a;
         var2 = bdc.a((short)((int)(var0 >>> 32 & 65535L)));
      }

      return var2;
   }

   public static final float d(long var0) {
      long var4 = var0 >>> 48;
      float var2;
      if ((63L & var0) == 0L) {
         var2 = (float)pwm.bp(var4 & 255L) / 255.0F;
      } else {
         int var3 = bdc.a;
         var2 = bdc.a((short)((int)var4));
      }

      return var2;
   }

   public static final long e(long var0, bec var2) {
      var2.getClass();
      bec var3 = g(var0);
      if (c.E(var2, var3)) {
         return var0;
      } else {
         var3.getClass();
         float[] var4 = bee.a;
         ben var7 = bee.c;
         Object var5;
         if (var3 == var7) {
            if (var2 == var7) {
               var5 = beh.a;
               return ((beh)var5).a(d(var0), c(var0), b(var0), a(var0));
            }

            if (var2 == bee.t && c.n(0, 0)) {
               var5 = beh.b;
               return ((beh)var5).a(d(var0), c(var0), b(var0), a(var0));
            }
         } else if (var3 == bee.t && var2 == var7 && c.n(0, 0)) {
            var5 = beh.c;
            return ((beh)var5).a(d(var0), c(var0), b(var0), a(var0));
         }

         if (var3 == var2) {
            beh var6 = beh.a;
            var5 = bdb.d(var3);
         } else if (c.o(var3.b, 12884901888L) && c.o(var2.b, 12884901888L)) {
            var5 = new beg((ben)var3, (ben)var2);
         } else {
            var5 = new beh(var3, var2, 0);
         }

         return ((beh)var5).a(d(var0), c(var0), b(var0), a(var0));
      }
   }

   // $FF: synthetic method
   public static final bcy f(long var0) {
      return new bcy(var0);
   }

   public static final bec g(long var0) {
      float[] var2 = bee.a;
      return bee.u[(int)(var0 & 63L)];
   }

   public static String h(long var0) {
      StringBuilder var2 = new StringBuilder();
      var2.append("Color(");
      var2.append(d(var0));
      var2.append(", ");
      var2.append(c(var0));
      var2.append(", ");
      var2.append(b(var0));
      var2.append(", ");
      var2.append(a(var0));
      var2.append(", ");
      var2.append(g(var0).a);
      var2.append(')');
      return var2.toString();
   }

   // $FF: synthetic method
   public static long i(long var0, float var2) {
      return bcq.k(d(var0), c(var0), b(var0), var2, g(var0));
   }

   public final boolean equals(Object var1) {
      boolean var2 = var1 instanceof bcy;
      long var3 = this.g;
      return var2 && var3 == ((bcy)var1).g;
   }

   public final int hashCode() {
      return c.p(this.g);
   }

   public final String toString() {
      return h(this.g);
   }
}
