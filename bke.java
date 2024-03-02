public abstract class bke implements bjx {
   public int a;
   public int b;
   public long c = car.I(0, 0);
   public long d;
   public long e;

   public bke() {
      this.d = bkf.b;
      this.e = bxw.a;
   }

   private final void eO() {
      this.a = qxb.m(bxx.b(this.c), bxq.d(this.d), bxq.b(this.d));
      int var1 = bxx.a(this.c);
      long var5 = this.d;
      var1 = qxb.m(var1, bxq.c(var5), bxq.a(var5));
      this.b = var1;
      int var4 = this.a;
      var5 = this.c;
      int var2 = bxx.b(var5);
      int var3 = bxx.a(var5);
      this.e = car.K((var4 - var2) / 2, (var1 - var3) / 2);
   }

   // $FF: synthetic method
   public Object c() {
      throw null;
   }

   public int n() {
      return bxx.a(this.c);
   }

   public int o() {
      return bxx.b(this.c);
   }

   protected final void p(long var1) {
      if (!c.o(this.c, var1)) {
         this.c = var1;
         this.eO();
      }

   }

   protected final void q(long var1) {
      if (!c.o(this.d, var1)) {
         this.d = var1;
         this.eO();
      }

   }

   public abstract void r(long var1, qvt var3);
}
