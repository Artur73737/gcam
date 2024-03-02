public final class rit implements rca {
   private final Object a;
   private final ThreadLocal b;
   private final quh c;

   public rit(Object var1, ThreadLocal var2) {
      this.a = var1;
      this.b = var2;
      this.c = new riu(var2);
   }

   public final Object fold(Object var1, qvx var2) {
      return quy.i(this, var1, var2);
   }

   public final Object gH(qui var1) {
      Object var2 = this.b.get();
      this.b.set(this.a);
      return var2;
   }

   public final void gI(Object var1) {
      this.b.set(var1);
   }

   public final qug get(quh var1) {
      var1.getClass();
      return c.E(this.c, var1) ? this : null;
   }

   public final quh getKey() {
      return this.c;
   }

   public final qui minusKey(quh var1) {
      var1.getClass();
      return (qui)(c.E(this.c, var1) ? quj.a : this);
   }

   public final qui plus(qui var1) {
      var1.getClass();
      return quy.l(this, var1);
   }

   public final String toString() {
      Object var3 = this.a;
      ThreadLocal var1 = this.b;
      StringBuilder var2 = new StringBuilder();
      var2.append("ThreadLocal(value=");
      var2.append(var3);
      var2.append(", threadLocal = ");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
