public final class bwu implements bxg {
   private final long a;

   public bwu(long var1) {
      this.a = var1;
      if (var1 == bcy.f) {
         throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
      }
   }

   public final float a() {
      return bcy.a(this.a);
   }

   public final long b() {
      return this.a;
   }

   // $FF: synthetic method
   public final bxg c(bxg var1) {
      return btf.e(this, var1);
   }

   // $FF: synthetic method
   public final bxg d(qvi var1) {
      return btf.f(this, var1);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bwu)) {
         return false;
      } else {
         bwu var2 = (bwu)var1;
         return c.o(this.a, var2.a);
      }
   }

   public final int hashCode() {
      return c.p(this.a);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ColorStyle(value=");
      var1.append(bcy.h(this.a));
      var1.append(')');
      return var1.toString();
   }
}
