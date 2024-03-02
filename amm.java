public final class amm {
   public final bry a;
   public bry b;
   public boolean c;
   public amf d;

   public amm(bry var1, bry var2) {
      var1.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = false;
      this.d = null;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof amm)) {
         return false;
      } else {
         amm var2 = (amm)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else if (!c.E(this.b, var2.b)) {
            return false;
         } else if (this.c != var2.c) {
            return false;
         } else {
            return c.E(this.d, var2.d);
         }
      }
   }

   public final int hashCode() {
      int var2 = this.a.hashCode();
      int var3 = this.b.hashCode();
      byte var4 = this.c;
      amf var5 = this.d;
      int var1;
      if (var5 == null) {
         var1 = 0;
      } else {
         var1 = var5.hashCode();
      }

      return ((var2 * 31 + var3) * 31 + var4) * 31 + var1;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TextSubstitutionValue(original=");
      var1.append(this.a);
      var1.append(", substitution=");
      var1.append(this.b);
      var1.append(", isShowingSubstitution=");
      var1.append(this.c);
      var1.append(", layoutCache=");
      var1.append(this.d);
      var1.append(')');
      return var1.toString();
   }
}
