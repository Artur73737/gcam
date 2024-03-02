import java.util.Iterator;

public final class dhy implements Iterator {
   public final dik a;
   public String b = null;
   private Iterator c = null;

   public dhy(dia var1) {
      dik var2 = new dik();
      this.a = var2;
      did var3 = var1.a;
      if (!var2.h(256)) {
         this.c = new dhw(this, var3, (String)null, 1);
      } else {
         this.c = new dhx(this, var3);
      }
   }

   public final boolean hasNext() {
      return this.c.hasNext();
   }

   public final Object next() {
      return this.c.next();
   }

   public final void remove() {
      throw new UnsupportedOperationException("The XMPIterator does not support remove().");
   }
}
