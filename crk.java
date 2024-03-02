import java.util.concurrent.atomic.AtomicInteger;

public final class crk implements qug {
   public static final bbd c = new bbd();
   public final quf a;
   public final AtomicInteger b;

   public crk(quf var1) {
      this.a = var1;
      this.b = new AtomicInteger(0);
   }

   public final void a() {
      if (this.b.decrementAndGet() < 0) {
         throw new IllegalStateException("Transaction was never started or was already released.");
      }
   }

   public final Object fold(Object var1, qvx var2) {
      return quy.i(this, var1, var2);
   }

   public final qug get(quh var1) {
      return quy.j(this, var1);
   }

   public final quh getKey() {
      return c;
   }

   public final qui minusKey(quh var1) {
      return quy.k(this, var1);
   }

   public final qui plus(qui var1) {
      return quy.l(this, var1);
   }
}
