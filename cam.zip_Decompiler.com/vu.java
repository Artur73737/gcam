public final class vu implements AutoCloseable {
   final vv a;
   private final long b;
   private final qyn c;

   public vu(vv var1, long var2) {
      this.a = var1;
      this.b = var2;
      this.c = qwp.f(false);
   }

   public final void a() {
      if (this.c.b()) {
         this.a.a(this.b);
      }

   }

   public final void close() {
      this.a();
   }
}
