public final class bsf {
   public final bsg a;
   public final int b;
   public final int c;

   public bsf(bsg var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bsf)) {
         return false;
      } else {
         bsf var2 = (bsf)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else if (this.b != var2.b) {
            return false;
         } else {
            return this.c == var2.c;
         }
      }
   }

   public final int hashCode() {
      return (this.a.hashCode() * 31 + this.b) * 31 + this.c;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ParagraphIntrinsicInfo(intrinsics=");
      var1.append(this.a);
      var1.append(", startIndex=");
      var1.append(this.b);
      var1.append(", endIndex=");
      var1.append(this.c);
      var1.append(')');
      return var1.toString();
   }
}
