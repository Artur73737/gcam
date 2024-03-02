import java.util.concurrent.Executor;

public class rjd extends rau {
   private final rja a;

   public rjd(int var1, int var2, long var3) {
      this.a = new rja(var1, var2, var3);
   }

   public final void a(qui var1, Runnable var2) {
      var1.getClass();
      rja.e(this.a, var2, false, 6);
   }

   public final Executor b() {
      return this.a;
   }

   public void close() {
      this.a.close();
   }

   public final void e(qui var1, Runnable var2) {
      rja.e(this.a, var2, true, 2);
   }

   public final void g(Runnable var1, rjf var2, boolean var3) {
      var2.getClass();
      this.a.d(var1, var2, var3);
   }
}
