public final class bxj {
   public static final bxj a = new bxj(2, false);
   private static final bxj d = new bxj(1, true);
   public final int b;
   public final boolean c;

   private bxj(int var1, boolean var2) {
      this.b = var1;
      this.c = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bxj)) {
         return false;
      } else {
         int var2 = this.b;
         bxj var3 = (bxj)var1;
         if (!c.n(var2, var3.b)) {
            return false;
         } else {
            return this.c == var3.c;
         }
      }
   }

   public final int hashCode() {
      return this.b * 31 + c.m(this.c);
   }

   public final String toString() {
      String var1;
      if (c.E(this, a)) {
         var1 = "TextMotion.Static";
      } else if (c.E(this, d)) {
         var1 = "TextMotion.Animated";
      } else {
         var1 = "Invalid";
      }

      return var1;
   }
}
