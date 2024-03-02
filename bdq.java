public final class bdq {
   public static final bdq a;
   public final long b;
   public final long c;
   public final float d;

   static {
      a = new bdq(bcq.j(4278190080L), bci.a, 0.0F);
   }

   public bdq(long var1, long var3, float var5) {
      this.b = var1;
      this.c = var3;
      this.d = var5;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bdq)) {
         return false;
      } else {
         long var2 = this.b;
         bdq var4 = (bdq)var1;
         if (!c.o(var2, var4.b)) {
            return false;
         } else if (!c.o(this.c, var4.c)) {
            return false;
         } else {
            return this.d == var4.d;
         }
      }
   }

   public final int hashCode() {
      return (c.p(this.b) * 31 + c.p(this.c)) * 31 + Float.floatToIntBits(this.d);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Shadow(color=");
      var1.append(bcy.h(this.b));
      var1.append(", offset=");
      var1.append(bci.j(this.c));
      var1.append(", blurRadius=");
      var1.append(this.d);
      var1.append(')');
      return var1.toString();
   }
}
