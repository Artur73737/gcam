public abstract class dil {
   public int a = 0;

   public dil() {
   }

   public dil(int var1) {
      this.b(var1);
      this.g(var1);
   }

   private final void b(int var1) {
      int var2 = ~this.a() & var1;
      if (var2 == 0) {
         this.e(var1);
      } else {
         String var3 = Integer.toHexString(var2);
         StringBuilder var4 = new StringBuilder();
         var4.append("The option bit(s) 0x");
         var4.append(var3);
         var4.append(" are invalid!");
         throw new dhl(var4.toString(), 103);
      }
   }

   protected abstract int a();

   protected void e(int var1) {
   }

   public final boolean equals(Object var1) {
      return this.a == ((dil)var1).a;
   }

   public final void f(int var1, boolean var2) {
      if (var2) {
         var1 |= this.a;
      } else {
         var1 = ~var1 & this.a;
      }

      this.a = var1;
   }

   public final void g(int var1) {
      this.b(var1);
      this.a = var1;
   }

   public final boolean h(int var1) {
      return (var1 & this.a) != 0;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      return "0x".concat(String.valueOf(Integer.toHexString(this.a)));
   }
}
