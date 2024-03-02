public final class anz {
   public final Object a;
   public final qvy b;

   public anz(Object var1, qvy var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof anz)) {
         return false;
      } else {
         anz var2 = (anz)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else {
            return c.E(this.b, var2.b);
         }
      }
   }

   public final int hashCode() {
      Object var2 = this.a;
      int var1;
      if (var2 == null) {
         var1 = 0;
      } else {
         var1 = var2.hashCode();
      }

      return var1 * 31 + this.b.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("FadeInFadeOutAnimationItem(key=");
      var1.append(this.a);
      var1.append(", transition=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
