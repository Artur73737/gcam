import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class bal implements List, qxc {
   public int a;
   private final azw b;
   private final int c;
   private int d;

   public bal(azw var1, int var2, int var3) {
      this.b = var1;
      this.c = var2;
      this.d = var1.a();
      this.a = var3 - var2;
   }

   private final void b() {
      if (this.b.a() != this.d) {
         throw new ConcurrentModificationException();
      }
   }

   public final Object a(int var1) {
      this.b();
      Object var2 = this.b.g(this.c + var1);
      --this.a;
      this.d = this.b.a();
      return var2;
   }

   public final void add(int var1, Object var2) {
      this.b();
      this.b.add(this.c + var1, var2);
      ++this.a;
      this.d = this.b.a();
   }

   public final boolean add(Object var1) {
      this.b();
      this.b.add(this.c + this.a, var1);
      ++this.a;
      this.d = this.b.a();
      return true;
   }

   public final boolean addAll(int var1, Collection var2) {
      var2.getClass();
      this.b();
      boolean var3 = this.b.addAll(var1 + this.c, var2);
      if (var3) {
         this.a += var2.size();
         this.d = this.b.a();
      }

      return var3;
   }

   public final boolean addAll(Collection var1) {
      var1.getClass();
      return this.addAll(this.a, var1);
   }

   public final void clear() {
      // $FF: Couldn't be decompiled
   }

   public final boolean contains(Object var1) {
      return this.indexOf(var1) >= 0;
   }

   public final boolean containsAll(Collection var1) {
      var1.getClass();
      boolean var3 = var1.isEmpty();
      boolean var2 = true;
      if (!var3) {
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            if (!this.contains(var4.next())) {
               var2 = false;
               break;
            }
         }
      }

      return var2;
   }

   public final Object get(int var1) {
      this.b();
      azx.a(var1, this.a);
      return this.b.get(this.c + var1);
   }

   public final int indexOf(Object var1) {
      this.b();
      int var2 = this.c;
      qtj var3 = qxb.p(var2, this.a + var2).a();

      do {
         if (!var3.a) {
            return -1;
         }

         var2 = var3.a();
      } while(!c.E(var1, this.b.get(var2)));

      return var2 - this.c;
   }

   public final boolean isEmpty() {
      return this.a == 0;
   }

   public final Iterator iterator() {
      return this.listIterator();
   }

   public final int lastIndexOf(Object var1) {
      this.b();

      for(int var2 = this.c + this.a - 1; var2 >= this.c; --var2) {
         if (c.E(var1, this.b.get(var2))) {
            return var2 - this.c;
         }
      }

      return -1;
   }

   public final ListIterator listIterator() {
      return this.listIterator(0);
   }

   public final ListIterator listIterator(int var1) {
      this.b();
      qwx var2 = new qwx();
      var2.a = var1 - 1;
      return new bak(var2, this);
   }

   public final boolean remove(Object var1) {
      int var2 = this.indexOf(var1);
      if (var2 >= 0) {
         this.a(var2);
         return true;
      } else {
         return false;
      }
   }

   public final boolean removeAll(Collection var1) {
      var1.getClass();
      Iterator var3 = var1.iterator();
      boolean var2 = false;

      while(true) {
         while(var3.hasNext()) {
            if (!this.remove(var3.next()) && !var2) {
               var2 = false;
            } else {
               var2 = true;
            }
         }

         return var2;
      }
   }

   public final boolean retainAll(Collection param1) {
      // $FF: Couldn't be decompiled
   }

   public final Object set(int var1, Object var2) {
      azx.a(var1, this.a);
      this.b();
      var2 = this.b.set(var1 + this.c, var2);
      this.d = this.b.a();
      return var2;
   }

   public final int size() {
      return this.a;
   }

   public final List subList(int var1, int var2) {
      if (var1 >= 0 && var1 <= var2 && var2 <= this.a) {
         this.b();
         azw var4 = this.b;
         int var3 = this.c;
         return new bal(var4, var1 + var3, var2 + var3);
      } else {
         throw new IllegalArgumentException("fromIndex or toIndex are out of bounds");
      }
   }

   public final Object[] toArray() {
      return qwk.a(this);
   }

   public final Object[] toArray(Object[] var1) {
      var1.getClass();
      return qwk.b(this, var1);
   }
}
