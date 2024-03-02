import java.util.concurrent.CopyOnWriteArrayList;

public abstract class ot {
   public boolean b;
   public final CopyOnWriteArrayList c;
   public qvi d;

   public ot(boolean var1) {
      this.b = var1;
      this.c = new CopyOnWriteArrayList();
   }

   public abstract void a();

   public final void b(om var1) {
      this.c.add(var1);
   }

   public final void c(om var1) {
      this.c.remove(var1);
   }

   public final void d(boolean var1) {
      this.b = var1;
      qvi var2 = this.d;
      if (var2 != null) {
         var2.a();
      }

   }
}
