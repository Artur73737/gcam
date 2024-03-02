public final class bsm {
   public final bsl a;
   public final bsk b;

   public bsm() {
      this(new bsk((byte[])null));
   }

   public bsm(bsk var1) {
      this.a = null;
      this.b = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bsm)) {
         return false;
      } else {
         bsk var2 = this.b;
         bsm var3 = (bsm)var1;
         if (!c.E(var2, var3.b)) {
            return false;
         } else {
            bsl var4 = var3.a;
            return c.E((Object)null, (Object)null);
         }
      }
   }

   public final int hashCode() {
      return 38347;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("PlatformTextStyle(spanStyle=");
      var1.append((Object)null);
      var1.append(", paragraphSyle=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
