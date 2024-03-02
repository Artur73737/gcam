import java.util.concurrent.Executor;

public final class rjb extends rau implements Executor {
   public static final rjb a = new rjb();
   private static final qzr b;

   static {
      rji var1 = rji.a;
      int var0 = qwo.t("kotlinx.coroutines.io.parallelism", qxb.k(64, rir.a), 0, 0, 12);
      if (var0 > 0) {
         b = new rib(var1, var0);
      } else {
         throw new IllegalArgumentException(c.aE(var0, "Expected positive parallelism level, but got "));
      }
   }

   private rjb() {
   }

   public final void a(qui var1, Runnable var2) {
      var1.getClass();
      b.a(var1, var2);
   }

   public final Executor b() {
      return this;
   }

   public final void close() {
      throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
   }

   public final void e(qui var1, Runnable var2) {
      b.e(var1, var2);
   }

   public final void execute(Runnable var1) {
      var1.getClass();
      this.a(quj.a, var1);
   }

   public final String toString() {
      return "Dispatchers.IO";
   }
}
