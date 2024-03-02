final class rjm extends ric {
   public volatile Object owner;

   public rjm(Object var1) {
      this.owner = var1;
   }

   public final String toString() {
      Object var1 = this.owner;
      StringBuilder var2 = new StringBuilder();
      var2.append("LockedQueue[");
      var2.append(var1);
      var2.append("]");
      return var2.toString();
   }
}
