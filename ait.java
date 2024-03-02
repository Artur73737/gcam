public final class ait {
   public float a;
   public boolean b;
   public ail c;

   public ait() {
      this((byte[])null);
   }

   // $FF: synthetic method
   public ait(byte[] var1) {
      this.a = 0.0F;
      this.b = true;
      this.c = null;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ait)) {
         return false;
      } else {
         ait var2 = (ait)var1;
         if (Float.compare(this.a, var2.a) != 0) {
            return false;
         } else if (this.b != var2.b) {
            return false;
         } else {
            ail var3 = var2.c;
            return c.E((Object)null, (Object)null);
         }
      }
   }

   public final int hashCode() {
      return (Float.floatToIntBits(this.a) * 31 + this.b) * 31;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("RowColumnParentData(weight=");
      var1.append(this.a);
      var1.append(", fill=");
      var1.append(this.b);
      var1.append(", crossAxisAlignment=");
      var1.append((Object)null);
      var1.append(')');
      return var1.toString();
   }
}
