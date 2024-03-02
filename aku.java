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

public final class aku implements List, j$.util.List, qxc {
   public final List a;

   public aku() {
      azw var1 = new azw();
      super();
      this.a = var1;
   }

   public final int a() {
      return ((azw)this.a).b();
   }

   public final boolean addAll(int var1, Collection var2) {
      return c.i();
   }

   public final boolean addAll(Collection var1) {
      return c.h();
   }

   public final aks b(int var1) {
      return (aks)this.a.get(var1);
   }

   public final void clear() {
      c.d();
   }

   public final boolean containsAll(Collection var1) {
      var1.getClass();
      return this.a.containsAll(var1);
   }

   // $FF: synthetic method
   public final void forEach(Consumer var1) {
      Iterable$_CC.$default$forEach(this, var1);
   }

   public final boolean isEmpty() {
      return this.a.isEmpty();
   }

   public final Iterator iterator() {
      return ((azw)this.a).listIterator();
   }

   public final ListIterator listIterator() {
      return this.a.listIterator();
   }

   public final ListIterator listIterator(int var1) {
      return this.a.listIterator(var1);
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
      return this.a.subList(var1, var2);
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
