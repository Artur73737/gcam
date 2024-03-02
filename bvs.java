public final class bvs implements bvt {
   private final int a;
   private final int b;

   public bvs(int var1, int var2) {
      this.a = var1;
      this.b = var2;
      if (var1 < 0 || var2 < 0) {
         StringBuilder var3 = new StringBuilder();
         var3.append("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ");
         var3.append(var1);
         var3.append(" and ");
         var3.append(var2);
         var3.append(" respectively.");
         throw new IllegalArgumentException(var3.toString());
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bvs)) {
         return false;
      } else {
         int var2 = this.a;
         bvs var3 = (bvs)var1;
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
      var1.append("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
      var1.append(this.a);
      var1.append(", lengthAfterCursor=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
