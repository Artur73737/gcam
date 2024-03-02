import com.google.googlex.gcam.base.HmAh.RbaSbznIXS;

public final class bdv {
   public final int a;

   // $FF: synthetic method
   public bdv(int var1) {
      this.a = var1;
   }

   public static String a(int var0) {
      String var1;
      if (c.n(var0, 0)) {
         var1 = RbaSbznIXS.rjYOJOx;
      } else if (c.n(var0, 1)) {
         var1 = "Round";
      } else if (c.n(var0, 2)) {
         var1 = "Bevel";
      } else {
         var1 = "Unknown";
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof bdv;
      int var2 = this.a;
      return var3 && var2 == ((bdv)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      return a(this.a);
   }
}
