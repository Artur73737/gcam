public final class act {
   public final long a;
   public final aip b;

   public act(long var1, aip var3) {
      this.a = var1;
      this.b = var3;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         Class var3 = this.getClass();
         Class var2;
         if (var1 != null) {
            var2 = var1.getClass();
         } else {
            var2 = null;
         }

         if (!c.E(var3, var2)) {
            return false;
         } else {
            var1.getClass();
            act var4 = (act)var1;
            if (!c.o(this.a, var4.a)) {
               return false;
            } else {
               return c.E(this.b, var4.b);
            }
         }
      }
   }

   public final int hashCode() {
      return c.p(this.a) * 31 + this.b.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("OverscrollConfiguration(glowColor=");
      var1.append(bcy.h(this.a));
      var1.append(", drawPadding=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
