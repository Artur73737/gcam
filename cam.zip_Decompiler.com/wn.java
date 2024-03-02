import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class wn implements rs {
   private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

   private final void l() {
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         wo var1 = (wo)var2.next();
         if (var1.b()) {
            this.a.remove(var1);
         }
      }

   }

   public final void a(rt var1) {
      var1.getClass();
   }

   public final void b(tj var1) {
      var1.getClass();
   }

   public final void c(tj var1) {
      var1.getClass();
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         ((wo)var2.next()).a();
      }

   }

   public final void d(tj var1) {
      var1.getClass();
   }

   public final void e(long var1, int var3) {
   }

   public final void f() {
   }

   public final void g() {
   }

   public final void h(tj var1) {
      var1.getClass();
   }

   public final void i(long var1, long var3) {
   }

   public final void j() {
      this.l();
   }

   public final void k(si var1) {
      this.l();
   }
}
