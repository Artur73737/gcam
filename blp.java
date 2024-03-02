import j$.lang.Iterable$_CC;
import j$.util.Collection$_CC;
import j$.util.List$_CC;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

final class blp implements List, j$.util.List, qxc {
   final blq a;
   private final int b;
   private final int c;

   public blp(blq var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final int a() {
      return this.c - this.b;
   }

   public final boolean addAll(int var1, Collection var2) {
      return c.i();
   }

   public final boolean addAll(Collection var1) {
      return c.h();
   }

   public final void clear() {
      c.d();
   }

   public final boolean containsAll(Collection var1) {
      var1.getClass();
      Iterator var2 = var1.iterator();

      do {
         if (!var2.hasNext()) {
            return true;
         }
      } while(this.contains((bba)var2.next()));

      return false;
   }

   // $FF: synthetic method
   public final void forEach(Consumer var1) {
      Iterable$_CC.$default$forEach(this, var1);
   }

   public final boolean isEmpty() {
      return this.a() == 0;
   }

   public final Iterator iterator() {
      blq var2 = this.a;
      int var1 = this.b;
      return new blo(var2, var1, var1, this.c);
   }

   public final ListIterator listIterator() {
      blq var2 = this.a;
      int var1 = this.b;
      return new blo(var2, var1, var1, this.c);
   }

   public final ListIterator listIterator(int var1) {
      blq var3 = this.a;
      int var2 = this.b;
      return new blo(var3, var1 + var2, var2, this.c);
   }

   // $FF: synthetic method
   public final Stream parallelStream() {
      return Collection$_CC.$default$parallelStream(this);
   }

   public final boolean remove(Object var1) {
      return c.g();
   }

   public final boolean removeAll(Collection var1) {
      return c.h();
   }

   // $FF: synthetic method
   public final boolean removeIf(Predicate var1) {
      return Collection$_CC.$default$removeIf(this, var1);
   }

   public final void replaceAll(UnaryOperator var1) {
      c.e();
   }

   public final boolean retainAll(Collection var1) {
      return c.h();
   }

   public final void sort(Comparator var1) {
      c.f();
   }

   // $FF: synthetic method
   public final Spliterator spliterator() {
      return List$_CC.$default$spliterator(this);
   }

   // $FF: synthetic method
   public final Stream stream() {
      return Collection$_CC.$default$stream(this);
   }

   public final List subList(int var1, int var2) {
      blq var4 = this.a;
      int var3 = this.b;
      return new blp(var4, var1 + var3, var3 + var2);
   }

   public final Object[] toArray() {
      return qwk.a(this);
   }

   // $FF: synthetic method
   public final Object[] toArray(IntFunction var1) {
      return Collection$_CC.$default$toArray(this, var1);
   }

   public final Object[] toArray(Object[] var1) {
      var1.getClass();
      return qwk.b(this, var1);
   }
}
