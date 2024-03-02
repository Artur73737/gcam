public final class aop {
   public final alt a;
   public final alt b;
   private final alt c;

   public aop() {
      this((byte[])null);
   }

   // $FF: synthetic method
   public aop(byte[] var1) {
      alz var3 = ama.b(4.0F);
      alz var4 = ama.b(4.0F);
      alz var2 = ama.b(0.0F);
      super();
      this.a = var3;
      this.c = var4;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof aop)) {
         return false;
      } else {
         alt var2 = this.a;
         aop var3 = (aop)var1;
         if (!c.E(var2, var3.a)) {
            return false;
         } else if (!c.E(this.c, var3.c)) {
            return false;
         } else {
            return c.E(this.b, var3.b);
         }
      }
   }

   public final int hashCode() {
      return (this.a.hashCode() * 31 + this.c.hashCode()) * 31 + this.b.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Shapes(small=");
      var1.append(this.a);
      var1.append(", medium=");
      var1.append(this.c);
      var1.append(", large=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
