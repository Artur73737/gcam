public final class bvq implements bvt {
   private final bry a;
   private final int b;

   public bvq(bry var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final String a() {
      return this.a.a;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bvq)) {
         return false;
      } else {
         String var2 = this.a();
         bvq var3 = (bvq)var1;
         if (!c.E(var2, var3.a())) {
            return false;
         } else {
            return this.b == var3.b;
         }
      }
   }

   public final int hashCode() {
      return this.a().hashCode() * 31 + this.b;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CommitTextCommand(text='");
      var1.append(this.a());
      var1.append("', newCursorPosition=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
