public final class brj {
   public final qvi a;
   public final qvi b;

   public brj(qvi var1, qvi var2) {
      this.a = var1;
      this.b = var2;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ScrollAxisRange(value=");
      var1.append(((Number)this.a.a()).floatValue());
      var1.append(", maxValue=");
      var1.append(((Number)this.b.a()).floatValue());
      var1.append(", reverseScrolling=false)");
      return var1.toString();
   }
}
