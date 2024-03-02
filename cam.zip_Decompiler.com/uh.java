public final class uh extends kf {
   public final ut a;

   public uh(ut var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof uh)) {
         return false;
      } else {
         uh var2 = (uh)var1;
         return c.E(this.a, var2.a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("RequestClose(activeCamera=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
