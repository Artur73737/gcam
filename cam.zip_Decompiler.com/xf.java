import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

final class xf implements Collection {
   final xh a;

   public xf(xh var1) {
      this.a = var1;
   }

   public final boolean add(Object var1) {
      throw new UnsupportedOperationException();
   }

   public final boolean addAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   public final void clear() {
      this.a.clear();
   }

   public final boolean contains(Object var1) {
      return this.a.b(var1) >= 0;
   }

   public final boolean containsAll(Collection var1) {
      Iterator var2 = var1.iterator();

      do {
         if (!var2.hasNext()) {
            return true;
         }
      } while(this.contains(var2.next()));

      return false;
   }

   public final boolean isEmpty() {
      return this.a.isEmpty();
   }

   public final Iterator iterator() {
      return new xg(this.a);
   }

   public final boolean remove(Object var1) {
      int var2 = this.a.b(var1);
      if (var2 >= 0) {
         this.a.e(var2);
         return true;
      } else {
         return false;
      }
   }

   public final boolean removeAll(Collection var1) {
      int var3 = this.a.d;
      int var2 = 0;

      int var4;
      boolean var6;
      for(var6 = false; var2 < var3; var3 = var4) {
         var4 = var3;
         int var5 = var2;
         if (var1.contains(this.a.g(var2))) {
            this.a.e(var2);
            var4 = var3 - 1;
            var5 = var2 - 1;
            var6 = true;
         }

         var2 = var5 + 1;
      }

      return var6;
   }

   public final boolean retainAll(Collection var1) {
      int var3 = this.a.d;
      int var2 = 0;

      int var5;
      boolean var6;
      for(var6 = false; var2 < var3; var3 = var5) {
         var5 = var3;
         int var4 = var2;
         if (!var1.contains(this.a.g(var2))) {
            this.a.e(var2);
            var5 = var3 - 1;
            var4 = var2 - 1;
            var6 = true;
         }

         var2 = var4 + 1;
      }

      return var6;
   }

   public final int size() {
      return this.a.d;
   }

   public final Object[] toArray() {
      int var2 = this.a.d;
      Object[] var3 = new Object[var2];

      for(int var1 = 0; var1 < var2; ++var1) {
         var3[var1] = this.a.g(var1);
      }

      return var3;
   }

   public final Object[] toArray(Object[] var1) {
      int var3 = this.size();
      Object[] var4 = var1;
      if (var1.length < var3) {
         var4 = (Object[])Array.newInstance(var1.getClass().getComponentType(), var3);
      }

      for(int var2 = 0; var2 < var3; ++var2) {
         var4[var2] = this.a.g(var2);
      }

      if (var4.length > var3) {
         var4[var3] = null;
      }

      return var4;
   }
}
