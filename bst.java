public final class bst {
   public final String a;

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bst)) {
         return false;
      } else {
         return c.E(this.a, ((bst)var1).a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      throw null;
   }
}
