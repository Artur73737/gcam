import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class brl implements Iterable, qxc {
   public final Map a = new LinkedHashMap();
   public boolean b;
   public boolean c;

   public final Object a(bru var1) {
      Object var2 = this.a.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         throw new IllegalStateException(c.aF(var1, "Key not present: ", " - consider getOrElse or getOrNull"));
      }
   }

   public final Object b(bru var1, qvi var2) {
      Object var3 = this.a.get(var1);
      Object var4 = var3;
      if (var3 == null) {
         var4 = var2.a();
      }

      return var4;
   }

   public final void c(bru var1, Object var2) {
      if (var2 instanceof brc && this.d(var1)) {
         Object var3 = this.a.get(var1);
         var3.getClass();
         brc var4 = (brc)var3;
         this.a.put(var1, new brc(((brc)var2).a));
      } else {
         this.a.put(var1, var2);
      }
   }

   public final boolean d(bru var1) {
      var1.getClass();
      return this.a.containsKey(var1);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof brl)) {
         return false;
      } else {
         Map var2 = this.a;
         brl var3 = (brl)var1;
         if (!c.E(var2, var3.a)) {
            return false;
         } else if (this.b != var3.b) {
            return false;
         } else {
            return this.c == var3.c;
         }
      }
   }

   public final int hashCode() {
      return (this.a.hashCode() * 31 + c.m(this.b)) * 31 + c.m(this.c);
   }

   public final Iterator iterator() {
      return this.a.entrySet().iterator();
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder();
      String var2;
      if (this.b) {
         var3.append("mergeDescendants=true");
         var2 = ", ";
      } else {
         var2 = "";
      }

      String var1 = var2;
      if (this.c) {
         var3.append(var2);
         var3.append("isClearingSemantics=true");
         var1 = ", ";
      }

      for(Iterator var8 = this.a.entrySet().iterator(); var8.hasNext(); var1 = ", ") {
         Entry var5 = (Entry)var8.next();
         bru var4 = (bru)var5.getKey();
         Object var6 = var5.getValue();
         var3.append(var1);
         var3.append(var4.a);
         var3.append(" : ");
         var3.append(var6);
      }

      StringBuilder var7 = new StringBuilder();
      var7.append(bof.c(this));
      var7.append("{ ");
      var7.append(var3);
      var7.append(" }");
      return var7.toString();
   }
}
