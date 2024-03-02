public final class ajs {
   public boolean a;
   public Object b;
   public final akr c;
   public final ava d;
   private final ava e;

   public ajs() {
      this(0, 0);
   }

   public ajs(int var1, int var2) {
      this.e = lg.d(var1);
      this.d = lg.d(var2);
      this.c = new akr(var1);
   }

   public final int a() {
      return this.e.f();
   }

   public final void b(int var1) {
      this.e.h(var1);
   }

   public final void c(int var1, int var2) {
      if ((float)var1 >= 0.0F) {
         this.b(var1);
         this.c.c(var1);
         this.d.h(var2);
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("Index should be non-negative (");
         var3.append(var1);
         var3.append(')');
         throw new IllegalArgumentException(var3.toString());
      }
   }
}
