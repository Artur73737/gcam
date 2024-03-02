import java.util.HashMap;
import java.util.Iterator;

public final class cr extends cnh {
   public static final cnj a = new cnw(1);
   public final HashMap b = new HashMap();
   public final HashMap c = new HashMap();
   public final HashMap d = new HashMap();
   public final boolean e;
   public boolean f = false;
   public boolean g = false;

   public cr(boolean var1) {
      this.e = var1;
   }

   final void a(bv var1) {
      if (!this.g) {
         if (!this.b.containsKey(var1.k)) {
            this.b.put(var1.k, var1);
            if (cp.S(2)) {
               StringBuilder var2 = new StringBuilder();
               var2.append("Updating retained Fragments: Added ");
               var2.append(var1);
            }

         }
      }
   }

   public final void b(bv var1) {
      if (cp.S(3)) {
         StringBuilder var2 = new StringBuilder();
         var2.append("Clearing non-config state for ");
         var2.append(var1);
      }

      this.c(var1.k);
   }

   public final void c(String var1) {
      cr var2 = (cr)this.c.get(var1);
      if (var2 != null) {
         var2.d();
         this.c.remove(var1);
      }

      gfv var3 = (gfv)this.d.get(var1);
      if (var3 != null) {
         var3.z();
         this.d.remove(var1);
      }

   }

   public final void d() {
      if (cp.S(3)) {
         StringBuilder var1 = new StringBuilder();
         var1.append("onCleared called for ");
         var1.append(this);
      }

      this.f = true;
   }

   final void e(bv var1) {
      if (!this.g) {
         if (this.b.remove(var1.k) != null && cp.S(2)) {
            StringBuilder var2 = new StringBuilder();
            var2.append("Updating retained Fragments: Removed ");
            var2.append(var1);
         }

      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         cr var2 = (cr)var1;
         return this.b.equals(var2.b) && this.c.equals(var2.c) && this.d.equals(var2.d);
      } else {
         return false;
      }
   }

   public final boolean f(bv var1) {
      if (!this.b.containsKey(var1.k)) {
         return true;
      } else {
         return this.e ? this.f : true;
      }
   }

   public final int hashCode() {
      return (this.b.hashCode() * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("FragmentManagerViewModel{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append("} Fragments (");
      Iterator var2 = this.b.values().iterator();

      while(var2.hasNext()) {
         var1.append(var2.next());
         if (var2.hasNext()) {
            var1.append(", ");
         }
      }

      var1.append(") Child Non Config (");
      var2 = this.c.keySet().iterator();

      while(var2.hasNext()) {
         var1.append((String)var2.next());
         if (var2.hasNext()) {
            var1.append(", ");
         }
      }

      var1.append(") ViewModelStores (");
      var2 = this.d.keySet().iterator();

      while(var2.hasNext()) {
         var1.append((String)var2.next());
         if (var2.hasNext()) {
            var1.append(", ");
         }
      }

      var1.append(')');
      return var1.toString();
   }
}
