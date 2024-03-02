public final class bhg {
   public final long a;
   public final long b;

   public bhg(long var1, long var3) {
      this.a = var1;
      this.b = var3;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("HistoricalChange(uptimeMillis=");
      var1.append(this.a);
      var1.append(", position=");
      var1.append(bci.j(this.b));
      var1.append(')');
      return var1.toString();
   }
}
