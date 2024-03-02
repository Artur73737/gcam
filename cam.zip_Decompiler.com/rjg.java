public final class rjg extends rje {
   public final Runnable a;

   public rjg(Runnable var1, long var2, rjf var4) {
      super(var2, var4);
      this.a = var1;
   }

   public final void run() {
      try {
         this.a.run();
      } finally {
         ;
      }
   }

   public final String toString() {
      String var3 = qzy.a(this.a);
      String var4 = qzy.b(this.a);
      long var1 = this.g;
      rjf var6 = this.h;
      StringBuilder var5 = new StringBuilder();
      var5.append("Task[");
      var5.append(var3);
      var5.append("@");
      var5.append(var4);
      var5.append(", ");
      var5.append(var1);
      var5.append(", ");
      var5.append(var6);
      var5.append("]");
      return var5.toString();
   }
}
