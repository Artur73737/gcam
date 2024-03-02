import java.util.ArrayList;

public final class ria {
   public static final Object a(Object var0, Object var1) {
      boolean var2 = qzx.a;
      if (var0 == null) {
         var0 = var1;
      } else if (var0 instanceof ArrayList) {
         ((ArrayList)var0).add(var1);
      } else {
         ArrayList var3 = new ArrayList(4);
         var3.add(var0);
         var3.add(var1);
         var0 = var3;
      }

      return var0;
   }

   public final boolean equals(Object var1) {
      throw null;
   }

   public final int hashCode() {
      throw null;
   }

   public final String toString() {
      throw null;
   }
}
