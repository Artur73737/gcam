import java.util.ArrayList;

public final class bxd {
   public static final bxd a = new bxd(0);
   public static final bxd b = new bxd(1);
   public static final bxd c = new bxd(2);
   public final int d;

   public bxd(int var1) {
      this.d = var1;
   }

   public final boolean a(bxd var1) {
      int var2 = this.d;
      return (var1.d | var2) == var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bxd)) {
         return false;
      } else {
         return this.d == ((bxd)var1).d;
      }
   }

   public final int hashCode() {
      return this.d;
   }

   public final String toString() {
      if (this.d == 0) {
         return "TextDecoration.None";
      } else {
         ArrayList var1 = new ArrayList();
         if ((this.d & b.d) != 0) {
            var1.add("Underline");
         }

         if ((this.d & c.d) != 0) {
            var1.add("LineThrough");
         }

         if (var1.size() == 1) {
            return "TextDecoration.".concat(String.valueOf((String)var1.get(0)));
         } else {
            StringBuilder var2 = new StringBuilder();
            var2.append("TextDecoration[");
            var2.append(lb.g(var1, ", ", (qvt)null, 62));
            var2.append(']');
            return var2.toString();
         }
      }
   }
}
