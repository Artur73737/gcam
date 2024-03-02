public final class bwz {
   public final int a = 66305;

   public final boolean equals(Object var1) {
      if (!(var1 instanceof bwz)) {
         return false;
      } else {
         int var2 = ((bwz)var1).a;
         return true;
      }
   }

   public final int hashCode() {
      return 66305;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("LineBreak(strategy=");
      var1.append(bww.a());
      var1.append(", strictness=");
      var1.append(bwx.a());
      var1.append(", wordBreak=");
      var1.append(bwy.a());
      var1.append(')');
      return var1.toString();
   }
}
