public final class brc {
   public final qsa a;
   private final String b = null;

   public brc(qsa var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof brc)) {
         return false;
      } else {
         brc var3 = (brc)var1;
         String var2 = var3.b;
         if (!c.E((Object)null, (Object)null)) {
            return false;
         } else {
            return c.E(this.a, var3.a);
         }
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("AccessibilityAction(label=null, action=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
