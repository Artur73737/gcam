public final class bul {
   public final Object a;

   // $FF: synthetic method
   private bul(Object var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final bul a(Object var0) {
      return new bul(var0);
   }

   public final boolean equals(Object var1) {
      boolean var2 = var1 instanceof bul;
      Object var3 = this.a;
      return var2 && c.E(var3, ((bul)var1).a);
   }

   public final int hashCode() {
      Object var1 = this.a;
      return var1 == null ? 0 : var1.hashCode();
   }

   public final String toString() {
      Object var1 = this.a;
      StringBuilder var2 = new StringBuilder();
      var2.append("AsyncTypefaceResult(result=");
      var2.append(var1);
      var2.append(')');
      return var2.toString();
   }
}
