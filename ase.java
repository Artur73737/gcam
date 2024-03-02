import java.util.ArrayList;
import java.util.List;

public abstract class ase implements asf {
   public final Object a;
   public Object b;
   private final List c;

   public ase(Object var1) {
      this.a = var1;
      this.c = new ArrayList();
      this.b = var1;
   }

   public final Object a() {
      return this.b;
   }

   public final void b() {
      this.c.clear();
      this.b = this.a;
      this.d();
   }

   public final void c(Object var1) {
      this.c.add(this.b);
      this.b = var1;
   }

   protected abstract void d();

   // $FF: synthetic method
   public void e() {
   }

   public final void f() {
      if (!this.c.isEmpty()) {
         List var1 = this.c;
         this.b = var1.remove(var1.size() - 1);
      } else {
         throw new IllegalStateException("empty stack");
      }
   }
}
