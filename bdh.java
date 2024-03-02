public final class bdh extends bdn {
   public final bcj a;

   public bdh(bcj var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bdh)) {
         return false;
      } else {
         return c.E(this.a, ((bdh)var1).a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }
}
