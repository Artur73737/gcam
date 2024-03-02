public final class bdg extends bdn {
   public final bbf a;

   public bdg(bbf var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bdg)) {
         return false;
      } else {
         return c.E(this.a, ((bdg)var1).a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }
}
