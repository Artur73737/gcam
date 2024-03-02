import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class did implements Comparable {
   public String a;
   public String b;
   public did c;
   public List d;
   public din e;
   public boolean f;
   public boolean g;
   public boolean h;
   public boolean i;
   private List j;

   public did(String var1, din var2) {
      this(var1, (String)null, var2);
   }

   public did(String var1, String var2, din var3) {
      this.j = null;
      this.d = null;
      this.a = var1;
      this.b = var2;
      this.e = var3;
   }

   private final List u() {
      if (this.d == null) {
         this.d = new ArrayList(0);
      }

      return this.d;
   }

   private final void v(String var1) {
      if (!"[]".equals(var1) && this.c(var1) != null) {
         throw new dhl(c.aA(var1, "Duplicate property or field node '", "'"), 203);
      }
   }

   private final boolean w() {
      return "xml:lang".equals(this.a);
   }

   private final boolean x() {
      return "rdf:type".equals(this.a);
   }

   private static final did y(List var0, String var1) {
      if (var0 != null) {
         Iterator var2 = var0.iterator();

         while(var2.hasNext()) {
            did var3 = (did)var2.next();
            if (var3.a.equals(var1)) {
               return var3;
            }
         }
      }

      return null;
   }

   public final int a() {
      List var1 = this.j;
      return var1 != null ? var1.size() : 0;
   }

   public final int b() {
      List var1 = this.d;
      return var1 != null ? var1.size() : 0;
   }

   public final did c(String var1) {
      return y(this.j(), var1);
   }

   public final Object clone() {
      din var1;
      try {
         var1 = new din(this.g().a);
      } catch (dhl var3) {
         var1 = new din();
      }

      did var8 = new did(this.a, this.b, var1);

      boolean var10001;
      Iterator var2;
      try {
         var2 = this.h();
      } catch (dhl var6) {
         var10001 = false;
         return var8;
      }

      while(true) {
         try {
            if (!var2.hasNext()) {
               break;
            }

            var8.k((did)((did)var2.next()).clone());
         } catch (dhl var7) {
            var10001 = false;
            return var8;
         }
      }

      try {
         var2 = this.i();
      } catch (dhl var5) {
         var10001 = false;
         return var8;
      }

      while(true) {
         try {
            if (!var2.hasNext()) {
               break;
            }

            var8.m((did)((did)var2.next()).clone());
         } catch (dhl var4) {
            var10001 = false;
            break;
         }
      }

      return var8;
   }

   public final int compareTo(Object var1) {
      return this.g().n() ? this.b.compareTo(((did)var1).b) : this.a.compareTo(((did)var1).a);
   }

   public final did d(String var1) {
      return y(this.d, var1);
   }

   public final did e(int var1) {
      return (did)this.j().get(var1 - 1);
   }

   public final did f(int var1) {
      return (did)this.u().get(var1 - 1);
   }

   public final din g() {
      if (this.e == null) {
         this.e = new din();
      }

      return this.e;
   }

   public final Iterator h() {
      return (Iterator)(this.j != null ? this.j().iterator() : Collections.EMPTY_LIST.listIterator());
   }

   public final Iterator i() {
      return (Iterator)(this.d != null ? new dic(this.u().iterator()) : Collections.EMPTY_LIST.iterator());
   }

   public final List j() {
      if (this.j == null) {
         this.j = new ArrayList(0);
      }

      return this.j;
   }

   public final void k(did var1) {
      this.v(var1.a);
      var1.c = this;
      this.j().add(var1);
   }

   public final void l(int var1, did var2) {
      this.v(var2.a);
      var2.c = this;
      this.j().add(var1 - 1, var2);
   }

   public final void m(did var1) {
      String var2 = var1.a;
      if (!"[]".equals(var2) && this.d(var2) != null) {
         throw new dhl(c.aA(var2, "Duplicate '", "' qualifier"), 203);
      } else {
         var1.c = this;
         var1.g().f(32, true);
         this.g().v(true);
         if (var1.w()) {
            this.e.u(true);
            this.u().add(0, var1);
         } else if (var1.x()) {
            this.e.w(true);
            this.u().add(this.e.c(), var1);
         } else {
            this.u().add(var1);
         }
      }
   }

   public final void n() {
      if (this.j.isEmpty()) {
         this.j = null;
      }

   }

   public final void o(did var1) {
      this.j().remove(var1);
      this.n();
   }

   public final void p() {
      this.j = null;
   }

   public final void q(did var1) {
      din var2 = this.g();
      if (var1.w()) {
         var2.u(false);
      } else if (var1.x()) {
         var2.w(false);
      }

      this.u().remove(var1);
      if (this.d.isEmpty()) {
         var2.v(false);
         this.d = null;
      }

   }

   public final void r() {
      if (this.t()) {
         did[] var4 = (did[])this.u().toArray(new did[this.b()]);
         byte var2 = 0;
         int var1 = 0;

         while(true) {
            int var3 = var4.length;
            if (var3 <= var1 || !"xml:lang".equals(var4[var1].a) && !"rdf:type".equals(var4[var1].a)) {
               Arrays.sort(var4, var1, var3);
               ListIterator var5 = this.d.listIterator();

               for(var1 = var2; var1 < var4.length; ++var1) {
                  var5.next();
                  var5.set(var4[var1]);
                  var4[var1].r();
               }
               break;
            }

            var4[var1].r();
            ++var1;
         }
      }

      if (this.s()) {
         if (!this.g().d()) {
            Collections.sort(this.j);
         }

         Iterator var6 = this.h();

         while(var6.hasNext()) {
            ((did)var6.next()).r();
         }
      }

   }

   public final boolean s() {
      List var1 = this.j;
      return var1 != null && var1.size() > 0;
   }

   public final boolean t() {
      List var1 = this.d;
      return var1 != null && var1.size() > 0;
   }
}
