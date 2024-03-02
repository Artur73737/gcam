public final class bum {
   private final bup a;
   private final Object b;

   public bum(bup var1) {
      var1.getClass();
      super();
      this.a = var1;
      this.b = null;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bum)) {
         return false;
      } else {
         bum var2 = (bum)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else {
            var1 = var2.b;
            return c.E((Object)null, (Object)null);
         }
      }
   }

   public final int hashCode() {
      return this.a.hashCode() * 31;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Key(font=");
      var1.append(this.a);
      var1.append(", loaderKey=");
      var1.append((Object)null);
      var1.append(')');
      return var1.toString();
   }
}
