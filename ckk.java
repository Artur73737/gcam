final class ckk {
   public final long a;
   public final long b;

   public ckk(long var1, long var3) {
      if (var3 == 0L) {
         this.a = 0L;
         this.b = 1L;
      } else {
         this.a = var1;
         this.b = var3;
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.a);
      var1.append("/");
      var1.append(this.b);
      return var1.toString();
   }
}
