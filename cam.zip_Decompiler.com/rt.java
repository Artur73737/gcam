import java.util.List;
import java.util.Map;

public final class rt {
   public final List a;
   public final Map b;
   public final List c;
   private final Map d;
   private final rv e;

   public rt(List var1, Map var2, Map var3, List var4) {
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.c = var4;
      this.e = null;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof rt)) {
         return false;
      } else {
         rt var2 = (rt)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else if (!c.E(this.b, var2.b)) {
            return false;
         } else if (!c.E(this.d, var2.d)) {
            return false;
         } else if (!c.E(this.c, var2.c)) {
            return false;
         } else {
            rv var3 = var2.e;
            return c.E((Object)null, (Object)null);
         }
      }
   }

   public final int hashCode() {
      return (this.a.hashCode() * 29791 + this.c.hashCode()) * 31;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Request(streams=");
      var1.append(this.a);
      var1.append(", parameters=");
      var1.append(this.b);
      var1.append(", extras=");
      var1.append(this.d);
      var1.append(", listeners=");
      var1.append(this.c);
      var1.append(", template=");
      var1.append((Object)null);
      var1.append(')');
      return var1.toString();
   }
}
