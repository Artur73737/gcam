public final class dif {
   public final String a;
   final String b;
   public final String c;
   public final dij d;

   public dif(String var1, String var2, String var3, dij var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final String toString() {
      String var5 = this.b;
      String var2 = this.c;
      String var4 = this.a;
      String var3 = this.d.toString();
      StringBuilder var1 = new StringBuilder();
      var1.append(var5);
      var1.append(var2);
      var1.append(" NS(");
      var1.append(var4);
      var1.append("), FORM (");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }
}
