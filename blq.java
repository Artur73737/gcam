import j$.lang.Iterable$_CC;
import j$.util.Collection$_CC;
import j$.util.List$_CC;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public final class blq implements List, j$.util.List, qxc {
   public Object[] a = new Object[16];
   public long[] b = new long[16];
   public int c = -1;
   public int d;

   public final long a() {
      long var3 = jk.j(Float.POSITIVE_INFINITY, false);
      int var1 = this.c + 1;
      int var2 = pwm.al(this);
      long var5 = var3;
      if (var1 <= var2) {
         while(true) {
            var5 = this.b[var1];
            if (blk.b(var5, var3) < 0) {
               var3 = var5;
            }

            if (blk.a(var3) < 0.0F && blk.c(var3)) {
               return var3;
            }

            var5 = var3;
            if (var1 == var2) {
               break;
            }

            ++var1;
         }
      }

      return var5;
   }

   public final boolean addAll(int var1, Collection var2) {
      return c.i();
   }

   public final boolean addAll(Collection var1) {
      return c.h();
   }

   public final void b(bba var1, float var2, boolean var3, qvi var4) {
      int var5 = this.c;
      int var7 = var5 + 1;
      this.c = var7;
      Object[] var8 = this.a;
      int var6 = var8.length;
      if (var7 >= var6) {
         var6 += 16;
         var8 = Arrays.copyOf(var8, var6);
         var8.getClass();
         this.a = var8;
         long[] var9 = Arrays.copyOf(this.b, var6);
         var9.getClass();
         this.b = var9;
      }

      var8 = this.a;
      var6 = this.c;
      var8[var6] = var1;
      this.b[var6] = jk.j(var2, var3);
      this.c();
      var4.a();
      this.c = var5;
   }

   public final void c() {
      int var1 = this.c + 1;
      int var2 = pwm.al(this);
      if (var1 <= var2) {
         while(true) {
            this.a[var1] = null;
            if (var1 == var2) {
               break;
            }

            ++var1;
         }
      }

      this.d = this.c + 1;
   }

   public final void clear() {
      this.c = -1;
      this.c();
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

   public final boolean d(float var1, boolean var2) {
      if (this.c != pwm.al(this)) {
         long var3 = jk.j(var1, var2);
         return blk.b(this.a(), var3) > 0;
      } else {
         return true;
      }
   }

   // $FF: synthetic method
   public final void forEach(Consumer var1) {
      Iterable$_CC.$default$forEach(this, var1);
   }

   public final boolean isEmpty() {
      return this.d == 0;
   }

   public final Iterator iterator() {
      return new blo(this, 0, 7);
   }

   public final ListIterator listIterator() {
      return new blo(this, 0, 7);
   }

   public final ListIterator listIterator(int var1) {
      return new blo(this, var1, 6);
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

   public final int size() {
      return this.d;
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
      return new blp(this, var1, var2);
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
