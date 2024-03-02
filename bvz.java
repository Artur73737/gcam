public final class bvz implements bvt {
   private final int a;
   private final int b;

   public bvz(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bvz)) {
         return false;
      } else {
         int var2 = this.a;
         bvz var3 = (bvz)var1;
         if (var2 != var3.a) {
            return false;
         } else {
            return this.b == var3.b;
         }
      }
   }

   public final int hashCode() {
      return this.a * 31 + this.b;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SetSelectionCommand(start=");
      var1.append(this.a);
      var1.append(", end=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
