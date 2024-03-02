import java.util.ConcurrentModificationException;
import java.util.Iterator;

final class auu implements Iterable, qxc, bao {
   private final aut a;
   private final int b;
   private final int c;

   public auu(aut var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final Iterator iterator() {
      aut var2 = this.a;
      if (var2.g == this.c) {
         int var1 = this.b;
         return new atk(var2, var1 + 1, var1 + pu.f(var2.a, var1));
      } else {
         throw new ConcurrentModificationException();
      }
   }
}
