import java.util.Map;
import java.util.Set;

public final class crr {
   public final String a;
   public final Map b;
   public final Set c;
   public final Set d;

   public crr(String var1, Map var2, Set var3, Set var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof crr)) {
         return false;
      } else {
         String var2 = this.a;
         crr var3 = (crr)var1;
         if (!c.E(var2, var3.a)) {
            return false;
         } else if (!c.E(this.b, var3.b)) {
            return false;
         } else if (!c.E(this.c, var3.c)) {
            return false;
         } else {
            Set var5 = this.d;
            if (var5 != null) {
               Set var4 = var3.d;
               if (var4 != null) {
                  return c.E(var5, var4);
               }
            }

            return true;
         }
      }
   }

   public final int hashCode() {
      return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TableInfo{name='");
      var1.append(this.a);
      var1.append("', columns=");
      var1.append(this.b);
      var1.append(", foreignKeys=");
      var1.append(this.c);
      var1.append(", indices=");
      var1.append(this.d);
      var1.append('}');
      return var1.toString();
   }
}
