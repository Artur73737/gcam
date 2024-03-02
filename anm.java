public final class anm {
   public final long a;
   public final long b;
   private final long c;
   private final long d;

   public anm(long var1, long var3, long var5, long var7) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         anm var2 = (anm)var1;
         if (!c.o(this.a, var2.a)) {
            return false;
         } else if (!c.o(this.b, var2.b)) {
            return false;
         } else if (!c.o(this.c, var2.c)) {
            return false;
         } else {
            return c.o(this.d, var2.d);
         }
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return ((c.p(this.a) * 31 + c.p(this.b)) * 31 + c.p(this.c)) * 31 + c.p(this.d);
   }
}
