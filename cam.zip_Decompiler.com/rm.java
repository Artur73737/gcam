public final class rm {
   private final int a;
   private final int b;
   private final jk c;

   public rm() {
      this((byte[])null);
   }

   // $FF: synthetic method
   public rm(byte[] var1) {
      jk var2 = new jk();
      super();
      this.a = 0;
      this.b = 0;
      this.c = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof rm)) {
         return false;
      } else {
         rm var3 = (rm)var1;
         int var2 = var3.a;
         var2 = var3.b;
         return c.E(this.c, var3.c);
      }
   }

   public final int hashCode() {
      return this.c.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("MetadataTransform(past=0, future=0, transformFn=");
      var1.append(this.c);
      var1.append(')');
      return var1.toString();
   }
}
