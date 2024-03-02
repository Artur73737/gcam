import j$.lang.Iterable$_CC;
import j$.util.Collection$_CC;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public final class bwe implements Collection, j$.util.Collection, qxc {
   public final List a;
   private final int b;

   public bwe(List var1) {
      this.a = var1;
      this.b = var1.size();
   }

   public final boolean addAll(Collection var1) {
      return c.h();
   }

   public final void clear() {
      c.d();
   }

   public final boolean containsAll(Collection var1) {
      var1.getClass();
      return this.a.containsAll(var1);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bwe)) {
         return false;
      } else {
         return c.E(this.a, ((bwe)var1).a);
      }
   }

   // $FF: synthetic method
   public final void forEach(Consumer var1) {
      Iterable$_CC.$default$forEach(this, var1);
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final boolean isEmpty() {
      return this.a.isEmpty();
   }

   public final Iterator iterator() {
      return this.a.iterator();
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

   public final boolean removeIf(Predicate var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final boolean retainAll(Collection var1) {
      return c.h();
   }

   public final int size() {
      return this.b;
   }

   // $FF: synthetic method
   public final Spliterator spliterator() {
      return Collection$_CC.$default$spliterator(this);
   }

   // $FF: synthetic method
   public final Stream stream() {
      return Collection$_CC.$default$stream(this);
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
      var1.append("LocaleList(localeList=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
