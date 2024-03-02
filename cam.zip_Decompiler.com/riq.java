public final class riq {
   public final String a;

   public riq(String var1) {
      this.a = var1;
   }

   public final String toString() {
      String var2 = this.a;
      StringBuilder var1 = new StringBuilder();
      var1.append("<");
      var1.append(var2);
      var1.append(">");
      return var1.toString();
   }
}
