public final class aae {
   public final Object a;
   public final Object b;

   public aae(Object var1, Object var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   public final boolean a(Object var1, Object var2) {
      return c.E(var1, this.a) && c.E(var2, this.b);
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof aae) {
         Object var2 = this.a;
         aae var3 = (aae)var1;
         if (c.E(var2, var3.a) && c.E(this.b, var3.b)) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      Object var3 = this.a;
      int var2 = 0;
      int var1;
      if (var3 != null) {
         var1 = var3.hashCode();
      } else {
         var1 = 0;
      }

      var3 = this.b;
      if (var3 != null) {
         var2 = var3.hashCode();
      }

      return var1 * 31 + var2;
   }
}
