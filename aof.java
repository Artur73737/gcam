import java.util.Map;

public final class aof {
   private final Map a;

   public aof(Map var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof aof) ? false : c.E(this.a, ((aof)var1).a);
      }
   }

   public final int hashCode() {
      return 0;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("MapDraggableAnchors(");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
