import com.google.googlex.gcam.base.HmAh.RbaSbznIXS;

public final class ber {
   public bxr a;
   public bxy b;
   public bcw c;
   public long d;

   public ber(bxr var1, bxy var2, bcw var3, long var4) {
      var2.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final void a(bcw var1) {
      var1.getClass();
      this.c = var1;
   }

   public final void b(bxr var1) {
      var1.getClass();
      this.a = var1;
   }

   public final void c(bxy var1) {
      var1.getClass();
      this.b = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ber)) {
         return false;
      } else {
         ber var2 = (ber)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else if (this.b != var2.b) {
            return false;
         } else if (!c.E(this.c, var2.c)) {
            return false;
         } else {
            return c.o(this.d, var2.d);
         }
      }
   }

   public final int hashCode() {
      return ((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + c.p(this.d);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("DrawParams(density=");
      var1.append(this.a);
      var1.append(", layoutDirection=");
      var1.append(this.b);
      var1.append(RbaSbznIXS.XjfZ);
      var1.append(this.c);
      var1.append(", size=");
      var1.append(bcl.e(this.d));
      var1.append(')');
      return var1.toString();
   }
}
