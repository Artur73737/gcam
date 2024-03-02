public final class buf implements bvh {
   public final int a;

   public buf(int var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof buf)) {
         return false;
      } else {
         buf var2 = (buf)var1;
         return this.a == var2.a;
      }
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("AndroidFontResolveInterceptor(fontWeightAdjustment=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
