public final class arq {
   public final alt a;
   public final alt b;
   public final alt c;
   public final alt d;
   public final alt e;

   public arq() {
      this((byte[])null);
   }

   public arq(alt var1, alt var2, alt var3, alt var4, alt var5) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      var4.getClass();
      var5.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   // $FF: synthetic method
   public arq(byte[] var1) {
      alt var2 = arp.a;
      this(arp.a, arp.b, arp.c, arp.d, arp.e);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof arq)) {
         return false;
      } else {
         alt var2 = this.a;
         arq var3 = (arq)var1;
         if (!c.E(var2, var3.a)) {
            return false;
         } else if (!c.E(this.b, var3.b)) {
            return false;
         } else if (!c.E(this.c, var3.c)) {
            return false;
         } else if (!c.E(this.d, var3.d)) {
            return false;
         } else {
            return c.E(this.e, var3.e);
         }
      }
   }

   public final int hashCode() {
      return (((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Shapes(extraSmall=");
      var1.append(this.a);
      var1.append(", small=");
      var1.append(this.b);
      var1.append(", medium=");
      var1.append(this.c);
      var1.append(", large=");
      var1.append(this.d);
      var1.append(", extraLarge=");
      var1.append(this.e);
      var1.append(')');
      return var1.toString();
   }
}
