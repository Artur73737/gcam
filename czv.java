import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class czv {
   public static final czv a = cby.i(new HashMap());
   private static final String c = dae.b("Data");
   public Map b;

   czv() {
   }

   public czv(czv var1) {
      this.b = new HashMap(var1.b);
   }

   public czv(Map var1) {
      this.b = new HashMap(var1);
   }

   public static czv a(byte[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static byte[] c(czv param0) {
      // $FF: Couldn't be decompiled
   }

   public final Map b() {
      return Collections.unmodifiableMap(this.b);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         czv var6 = (czv)var1;
         Set var3 = this.b.keySet();
         if (!var3.equals(var6.b.keySet())) {
            return false;
         } else {
            Iterator var4 = var3.iterator();

            boolean var2;
            do {
               if (!var4.hasNext()) {
                  return true;
               }

               String var5 = (String)var4.next();
               Object var7 = this.b.get(var5);
               Object var8 = var6.b.get(var5);
               if (var7 != null && var8 != null) {
                  if (var7 instanceof Object[] && var8 instanceof Object[]) {
                     var2 = Arrays.deepEquals((Object[])var7, (Object[])var8);
                  } else {
                     var2 = var7.equals(var8);
                  }
               } else if (var7 == var8) {
                  var2 = true;
               } else {
                  var2 = false;
               }
            } while(var2);

            return false;
         }
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return this.b.hashCode() * 31;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("Data {");
      if (!this.b.isEmpty()) {
         for(Iterator var2 = this.b.keySet().iterator(); var2.hasNext(); var1.append(", ")) {
            String var3 = (String)var2.next();
            var1.append(var3);
            var1.append(" : ");
            Object var4 = this.b.get(var3);
            if (var4 instanceof Object[]) {
               var1.append(Arrays.toString((Object[])var4));
            } else {
               var1.append(var4);
            }
         }
      }

      var1.append("}");
      return var1.toString();
   }
}
