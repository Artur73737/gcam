public final class yh {
   public static final yh a = new yh(new yq((yi)null, 15));
   public final yq b;

   public yh() {
   }

   public yh(yq var1) {
      this.b = var1;
   }

   public final boolean equals(Object var1) {
      return var1 instanceof yh && c.E(((yh)var1).b, this.b);
   }

   public final int hashCode() {
      return this.b.hashCode();
   }

   public final String toString() {
      String var1;
      if (c.E(this, a)) {
         var1 = "ExitTransition.None";
      } else {
         yq var3 = this.b;
         StringBuilder var2 = new StringBuilder();
         var2.append("ExitTransition: \nFade - ");
         yi var4 = var3.a;
         if (var4 != null) {
            var1 = var4.toString();
         } else {
            var1 = null;
         }

         var2.append(var1);
         var2.append(",\nSlide - null,\nShrink - null,\nScale - null");
         var1 = var2.toString();
      }

      return var1;
   }
}
