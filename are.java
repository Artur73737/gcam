public final class are {
   public final long a;
   public final long b;
   public final long c;
   public final long d;

   public are(long var1, long var3, long var5, long var7) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && var1 instanceof are) {
         long var2 = this.a;
         are var4 = (are)var1;
         if (!c.o(var2, var4.a)) {
            return false;
         } else if (!c.o(this.b, var4.b)) {
            return false;
         } else if (!c.o(this.c, var4.c)) {
            return false;
         } else {
            return c.o(this.d, var4.d);
         }
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return ((c.p(this.a) * 31 + c.p(this.b)) * 31 + c.p(this.c)) * 31 + c.p(this.d);
   }
}
