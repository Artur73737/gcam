public final class bid {
   private final int a;

   // $FF: synthetic method
   private bid(int var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final bid a(int var0) {
      return new bid(var0);
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof bid;
      int var2 = this.a;
      return var3 && var2 == ((bid)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      int var1 = this.a;
      StringBuilder var2 = new StringBuilder();
      var2.append("PointerKeyboardModifiers(packedValue=");
      var2.append(var1);
      var2.append(')');
      return var2.toString();
   }
}
