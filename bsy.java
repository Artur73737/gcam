final class bsy {
   public final int a;
   public final int b;
   public final boolean c;

   public bsy(int var1, int var2, boolean var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bsy)) {
         return false;
      } else {
         bsy var2 = (bsy)var1;
         if (this.a != var2.a) {
            return false;
         } else if (this.b != var2.b) {
            return false;
         } else {
            return this.c == var2.c;
         }
      }
   }

   public final int hashCode() {
      return (this.a * 31 + this.b) * 31 + this.c;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("BidiRun(start=");
      var1.append(this.a);
      var1.append(", end=");
      var1.append(this.b);
      var1.append(", isRtl=");
      var1.append(this.c);
      var1.append(')');
      return var1.toString();
   }
}
