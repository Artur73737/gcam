public final class cyp {
   public final cya a;
   public final cyn b;
   private final cyo c;

   public cyp(cya var1, cyo var2, cyn var3) {
      this.a = var1;
      this.c = var2;
      this.b = var3;
      if (var1.b() == 0 && var1.a() == 0) {
         throw new IllegalArgumentException("Bounds must be non zero");
      } else if (var1.a != 0 && var1.b != 0) {
         throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
      }
   }

   public final cym a() {
      cya var1 = this.a;
      cym var2;
      if (var1.b() > var1.a()) {
         var2 = cym.b;
      } else {
         var2 = cym.a;
      }

      return var2;
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
            cyp var4 = (cyp)var1;
            if (!c.E(this.a, var4.a)) {
               return false;
            } else if (c.E(this.c, var4.c)) {
               return c.E(this.b, var4.b);
            } else {
               return false;
            }
         }
      }
   }

   public final int hashCode() {
      return (this.a.hashCode() * 31 + this.c.hashCode()) * 31 + this.b.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(cyp.class.getSimpleName());
      var1.append(" { ");
      var1.append(this.a);
      var1.append(", type=");
      var1.append(this.c);
      var1.append(", state=");
      var1.append(this.b);
      var1.append(" }");
      return var1.toString();
   }
}
