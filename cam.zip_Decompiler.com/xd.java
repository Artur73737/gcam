import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class xd implements Set {
   final xh a;

   public xd(xh var1) {
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
      return this.a.containsKey(var1);
   }

   public final boolean containsAll(Collection var1) {
      xh var3 = this.a;
      Iterator var4 = var1.iterator();

      boolean var2;
      while(true) {
         if (var4.hasNext()) {
            if (var3.containsKey(var4.next())) {
               continue;
            }

            var2 = false;
            break;
         }

         var2 = true;
         break;
      }

      return var2;
   }

   public final boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 instanceof Set) {
            label33: {
               Set var5 = (Set)var1;

               try {
                  if (this.size() != var5.size()) {
                     break label33;
                  }

                  var2 = this.containsAll(var5);
               } catch (NullPointerException var3) {
                  break label33;
               } catch (ClassCastException var4) {
                  break label33;
               }

               if (var2) {
                  return true;
               }
            }
         }

         var2 = false;
      }

      return var2;
   }

   public final int hashCode() {
      int var1 = this.a.d - 1;

      int var2;
      for(var2 = 0; var1 >= 0; --var1) {
         Object var4 = this.a.d(var1);
         int var3;
         if (var4 == null) {
            var3 = 0;
         } else {
            var3 = var4.hashCode();
         }

         var2 += var3;
      }

      return var2;
   }

   public final boolean isEmpty() {
      return this.a.isEmpty();
   }

   public final Iterator iterator() {
      return new xc(this.a);
   }

   public final boolean remove(Object var1) {
      int var2 = this.a.c(var1);
      if (var2 >= 0) {
         this.a.e(var2);
         return true;
      } else {
         return false;
      }
   }

   public final boolean removeAll(Collection var1) {
      xh var3 = this.a;
      int var2 = var3.d;
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         var3.remove(var4.next());
      }

      return var2 != var3.d;
   }

   public final boolean retainAll(Collection var1) {
      return this.a.a(var1);
   }

   public final int size() {
      return this.a.d;
   }

   public final Object[] toArray() {
      int var2 = this.a.d;
      Object[] var3 = new Object[var2];

      for(int var1 = 0; var1 < var2; ++var1) {
         var3[var1] = this.a.d(var1);
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
         var4[var2] = this.a.d(var2);
      }

      if (var4.length > var3) {
         var4[var3] = null;
      }

      return var4;
   }
}
