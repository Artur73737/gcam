public final class brx {
   public final Object a;
   public final int b;
   public final int c;
   public final String d;

   public brx(Object var1, int var2, int var3) {
      this(var1, var2, var3, (byte[])null);
   }

   public brx(Object var1, int var2, int var3, byte[] var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = "";
      if (var2 > var3) {
         throw new IllegalArgumentException("Reversed range is not supported");
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof brx)) {
         return false;
      } else {
         brx var2 = (brx)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else if (this.b != var2.b) {
            return false;
         } else if (this.c != var2.c) {
            return false;
         } else {
            return c.E(this.d, var2.d);
         }
      }
   }

   public final int hashCode() {
      return ((this.a.hashCode() * 31 + this.b) * 31 + this.c) * 31 + this.d.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Range(item=");
      var1.append(this.a);
      var1.append(", start=");
      var1.append(this.b);
      var1.append(", end=");
      var1.append(this.c);
      var1.append(", tag=");
      var1.append(this.d);
      var1.append(')');
      return var1.toString();
   }
}
