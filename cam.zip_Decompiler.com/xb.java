import java.util.AbstractSet;
import java.util.Iterator;

final class xb extends AbstractSet {
   final xh a;

   public xb(xh var1) {
      this.a = var1;
   }

   public final Iterator iterator() {
      return new xe(this.a);
   }

   public final int size() {
      return this.a.d;
   }
}
