import java.util.Iterator;

final class dic implements Iterator {
   final Iterator a;

   public dic(Iterator var1) {
      this.a = var1;
   }

   public final boolean hasNext() {
      return this.a.hasNext();
   }

   public final Object next() {
      return this.a.next();
   }

   public final void remove() {
      throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
   }
}
