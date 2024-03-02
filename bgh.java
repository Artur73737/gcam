import java.util.Iterator;
import java.util.Map.Entry;

public final class bgh implements Iterator, qxc {
   public final Iterator a;
   private final int b;

   public bgh(ayc var1, int var2) {
      this.b = var2;
      var1.getClass();
      super();
      ayk[] var3 = new ayk[8];

      for(var2 = 0; var2 < 8; ++var2) {
         var3[var2] = new ayn(this);
      }

      this.a = new ayd(var1, var3);
   }

   public bgh(bgi var1, int var2) {
      this.b = var2;
      this.a = var1.j.iterator();
   }

   public final boolean hasNext() {
      switch(this.b) {
      case 0:
         return this.a.hasNext();
      default:
         return ((ayb)this.a).c;
      }
   }

   // $FF: synthetic method
   public final Object next() {
      switch(this.b) {
      case 0:
         return (gh)this.a.next();
      default:
         return (Entry)((ayb)this.a).next();
      }
   }

   public final void remove() {
      switch(this.b) {
      case 0:
         c.d();
         return;
      default:
         ((ayb)this.a).remove();
      }
   }
}
