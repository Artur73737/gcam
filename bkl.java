import j$.lang.Iterable$_CC;
import j$.util.Collection$_CC;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public final class bkl implements Collection, j$.util.Collection, qxc {
   private final Set a;

   public bkl() {
      this((byte[])null);
   }

   // $FF: synthetic method
   public bkl(byte[] var1) {
      LinkedHashSet var2 = new LinkedHashSet();
      super();
      this.a = var2;
   }

   public final boolean a(Object var1) {
      return this.a.add(var1);
   }

   public final boolean addAll(Collection var1) {
      return c.h();
   }

   public final void clear() {
      this.a.clear();
   }

   public final boolean contains(Object var1) {
      return this.a.contains(var1);
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
      return this.a.iterator();
   }

   // $FF: synthetic method
   public final Stream parallelStream() {
      return Collection$_CC.$default$parallelStream(this);
   }

   public final boolean remove(Object var1) {
      return this.a.remove(var1);
   }

   public final boolean removeAll(Collection var1) {
      var1.getClass();
      return this.a.remove(var1);
   }

   public final boolean removeIf(Predicate var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final boolean retainAll(Collection var1) {
      var1.getClass();
      return this.a.retainAll(var1);
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
}
