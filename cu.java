import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class cu {
   public final ArrayList a = new ArrayList();
   public final HashMap b = new HashMap();
   public final HashMap c = new HashMap();
   public cr d;

   public final Bundle a(String var1, Bundle var2) {
      return var2 != null ? (Bundle)this.c.put(var1, var2) : (Bundle)this.c.remove(var1);
   }

   public final bv b(String var1) {
      llo var2 = (llo)this.b.get(var1);
      return var2 != null ? (bv)var2.c : null;
   }

   final bv c(String var1) {
      Iterator var3 = this.b.values().iterator();

      while(var3.hasNext()) {
         llo var2 = (llo)var3.next();
         if (var2 != null) {
            Object var5 = var2.c;
            bv var4 = (bv)var5;
            if (!var1.equals(var4.k)) {
               var5 = var4.B.a.c(var1);
            }

            if (var5 != null) {
               return (bv)var5;
            }
         }
      }

      return null;
   }

   public final List d() {
      ArrayList var3 = new ArrayList();
      Iterator var1 = this.b.values().iterator();

      while(var1.hasNext()) {
         llo var2 = (llo)var1.next();
         if (var2 != null) {
            var3.add(var2);
         }
      }

      return var3;
   }

   final List e() {
      ArrayList var1 = new ArrayList();
      Iterator var3 = this.b.values().iterator();

      while(var3.hasNext()) {
         llo var2 = (llo)var3.next();
         if (var2 != null) {
            var1.add(var2.c);
         } else {
            var1.add((Object)null);
         }
      }

      return var1;
   }

   final List f() {
      // $FF: Couldn't be decompiled
   }

   final void g(bv param1) {
      // $FF: Couldn't be decompiled
   }

   final void h() {
      this.b.values().removeAll(Collections.singleton((Object)null));
   }

   final void i(bv param1) {
      // $FF: Couldn't be decompiled
   }

   final boolean j(String var1) {
      return this.b.get(var1) != null;
   }

   public final llo k(String var1) {
      return (llo)this.b.get(var1);
   }

   final void l(llo var1) {
      Object var2 = var1.c;
      bv var3 = (bv)var2;
      if (!this.j(var3.k)) {
         this.b.put(var3.k, var1);
         if (var3.J) {
            if (var3.I) {
               this.d.a(var3);
            } else {
               this.d.e(var3);
            }

            var3.J = false;
         }

         if (cp.S(2)) {
            StringBuilder var4 = new StringBuilder();
            var4.append("Added fragment to active set ");
            var4.append(var2);
         }

      }
   }

   public final void m(llo var1) {
      Object var2 = var1.c;
      bv var3 = (bv)var2;
      if (var3.I) {
         this.d.e(var3);
      }

      if (this.b.get(var3.k) == var1) {
         if ((llo)this.b.put(var3.k, (Object)null) != null) {
            if (cp.S(2)) {
               StringBuilder var4 = new StringBuilder();
               var4.append("Removed fragment from active set ");
               var4.append(var2);
            }

         }
      }
   }
}
