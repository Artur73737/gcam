import java.util.ArrayList;
import java.util.List;

public final class crq {
   public final String a;
   public final boolean b;
   public final List c;
   public List d;

   public crq(String var1, boolean var2, List var3, List var4) {
      var3.getClass();
      var4.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      Object var7 = var4;
      if (var4.isEmpty()) {
         int var6 = var3.size();
         ArrayList var8 = new ArrayList(var6);
         int var5 = 0;

         while(true) {
            var7 = var8;
            if (var5 >= var6) {
               break;
            }

            var8.add("ASC");
            ++var5;
         }
      }

      this.d = (List)var7;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof crq)) {
         return false;
      } else {
         boolean var2 = this.b;
         crq var3 = (crq)var1;
         if (var2 != var3.b) {
            return false;
         } else if (!c.E(this.c, var3.c)) {
            return false;
         } else if (!c.E(this.d, var3.d)) {
            return false;
         } else {
            if (qwp.B(this.a, "index_")) {
               var2 = qwp.B(var3.a, "index_");
            } else {
               var2 = c.E(this.a, var3.a);
            }

            return var2;
         }
      }
   }

   public final int hashCode() {
      int var1;
      if (qwp.B(this.a, "index_")) {
         var1 = -1184239155;
      } else {
         var1 = this.a.hashCode();
      }

      return ((var1 * 31 + this.b) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Index{name='");
      var1.append(this.a);
      var1.append("', unique=");
      var1.append(this.b);
      var1.append(", columns=");
      var1.append(this.c);
      var1.append(", orders=");
      var1.append(this.d);
      var1.append("'}");
      return var1.toString();
   }
}
