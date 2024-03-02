import java.util.ConcurrentModificationException;
import java.util.Iterator;

final class atk implements Iterator, qxc {
   private final aut a;
   private final int b;
   private int c;
   private final int d;

   public atk(aut var1, int var2, int var3) {
      this.a = var1;
      this.b = var3;
      this.c = var2;
      this.d = var1.g;
      if (var1.f) {
         throw new ConcurrentModificationException();
      }
   }

   public final boolean hasNext() {
      return this.c < this.b;
   }

   public final void remove() {
      c.d();
   }
}
