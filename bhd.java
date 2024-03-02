public final class bhd implements bho {
   public final int a;

   public bhd(int var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         Class var3 = this.getClass();
         Class var2;
         if (var1 != null) {
            var2 = var1.getClass();
         } else {
            var2 = null;
         }

         if (!c.E(var3, var2)) {
            return false;
         } else {
            var1.getClass();
            bhd var4 = (bhd)var1;
            return this.a == var4.a;
         }
      }
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("AndroidPointerIcon(type=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
