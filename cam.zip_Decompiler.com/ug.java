import java.util.List;
import java.util.Map;

public final class ug {
   public final List a;
   public final Map b;

   public ug(List var1, Map var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ug)) {
         return false;
      } else {
         ug var2 = (ug)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else {
            return c.E(this.b, var2.b);
         }
      }
   }

   public final int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("OutputConfigurations(all=");
      var1.append(this.a);
      var1.append(", deferred=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
