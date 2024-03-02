import j$.lang.Iterable$_CC;
import j$.util.Collection$_CC;
import j$.util.List$_CC;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public final class but extends buq implements List, j$.util.List, qxc {
   public final List f;
   private final List g;

   public but(List var1) {
      this.g = var1;
      if (!var1.isEmpty()) {
         this.f = new ArrayList(var1);
      } else {
         throw new IllegalStateException("At least one font should be passed to FontFamily");
      }
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
      return this.g.containsAll(var1);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof but)) {
         return false;
      } else {
         return c.E(this.f, ((but)var1).f);
      }
   }

   // $FF: synthetic method
   public final void forEach(Consumer var1) {
      Iterable$_CC.$default$forEach(this, var1);
   }

   public final int hashCode() {
      return this.f.hashCode();
   }

   public final boolean isEmpty() {
      return this.g.isEmpty();
   }

   public final Iterator iterator() {
      return this.g.iterator();
   }

   public final ListIterator listIterator() {
      return this.g.listIterator();
   }

   public final ListIterator listIterator(int var1) {
      return this.g.listIterator(var1);
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
      return this.g.subList(var1, var2);
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

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("FontListFontFamily(fonts=");
      var1.append(this.f);
      var1.append(')');
      return var1.toString();
   }
}
