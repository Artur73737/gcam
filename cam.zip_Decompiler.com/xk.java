import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class xk implements Iterator, qxc {
   private int a;
   private int b;
   private boolean c;

   public xk(int var1) {
      this.a = var1;
   }

   protected abstract Object a(int var1);

   protected abstract void b(int var1);

   public final boolean hasNext() {
      return this.b < this.a;
   }

   public final Object next() {
      if (this.hasNext()) {
         Object var1 = this.a(this.b);
         ++this.b;
         this.c = true;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public final void remove() {
      if (this.c) {
         int var1 = this.b - 1;
         this.b = var1;
         this.b(var1);
         --this.a;
         this.c = false;
      } else {
         throw new IllegalStateException("Call next() before removing an element.");
      }
   }
}
