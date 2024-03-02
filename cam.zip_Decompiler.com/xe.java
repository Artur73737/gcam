import java.util.Iterator;
import java.util.Map.Entry;

final class xe implements Iterator, Entry {
   int a;
   int b;
   boolean c;
   final xh d;

   public xe(xh var1) {
      this.d = var1;
      this.a = var1.d - 1;
      this.b = -1;
   }

   public final boolean equals(Object var1) {
      if (this.c) {
         if (!(var1 instanceof Entry)) {
            return false;
         } else {
            Entry var2 = (Entry)var1;
            return c.E(var2.getKey(), this.d.d(this.b)) && c.E(var2.getValue(), this.d.g(this.b));
         }
      } else {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
   }

   public final Object getKey() {
      if (this.c) {
         return this.d.d(this.b);
      } else {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
   }

   public final Object getValue() {
      if (this.c) {
         return this.d.g(this.b);
      } else {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
   }

   public final boolean hasNext() {
      return this.b < this.a;
   }

   public final int hashCode() {
      if (this.c) {
         Object var3 = this.d.d(this.b);
         Object var4 = this.d.g(this.b);
         int var2 = 0;
         int var1;
         if (var3 == null) {
            var1 = 0;
         } else {
            var1 = var3.hashCode();
         }

         if (var4 != null) {
            var2 = var4.hashCode();
         }

         return var1 ^ var2;
      } else {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
   }

   public final void remove() {
      if (this.c) {
         this.d.e(this.b);
         --this.b;
         --this.a;
         this.c = false;
      } else {
         throw new IllegalStateException();
      }
   }

   public final Object setValue(Object var1) {
      if (this.c) {
         return this.d.f(this.b, var1);
      } else {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.getKey());
      var1.append("=");
      var1.append(this.getValue());
      return var1.toString();
   }
}
