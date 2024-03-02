import java.util.ListIterator;

final class blo implements ListIterator, qxc {
   final blq a;
   private int b;
   private final int c;
   private final int d;

   // $FF: synthetic method
   public blo(blq var1, int var2, int var3) {
      if (1 == (var3 & 1)) {
         var2 = 0;
      }

      this(var1, var2, 0, var1.d);
   }

   public blo(blq var1, int var2, int var3, int var4) {
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final boolean hasNext() {
      return this.b < this.d;
   }

   public final boolean hasPrevious() {
      return this.b > this.c;
   }

   public final int nextIndex() {
      return this.b - this.c;
   }

   public final int previousIndex() {
      return this.b - this.c - 1;
   }

   public final void remove() {
      c.d();
   }
}
