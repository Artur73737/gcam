import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public final class bvb {
   public final List a;

   public bvb(bva... var1) {
      LinkedHashMap var7 = new LinkedHashMap();
      ArrayList var4 = new ArrayList();
      Iterator var6 = var7.entrySet().iterator();

      while(var6.hasNext()) {
         Entry var5 = (Entry)var6.next();
         String var8 = (String)var5.getKey();
         List var11 = (List)var5.getValue();
         if (var11.size() != 1) {
            StringBuilder var10 = new StringBuilder();
            var10.append('\'');
            var10.append(var8);
            var10.append("' must be unique. Actual [ [");
            var10.append(pwm.aN(var11, (CharSequence)null, (CharSequence)null, (CharSequence)null, (qvt)null, 63));
            var10.append(']');
            throw new IllegalArgumentException(var10.toString());
         }

         pwm.aJ(var4, var11);
      }

      ArrayList var9 = new ArrayList(var4);
      this.a = var9;
      int var3 = var9.size();

      for(int var2 = 0; var2 < var3 && !((bva)var9.get(var2)).b(); ++var2) {
      }

   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bvb)) {
         return false;
      } else {
         return c.E(this.a, ((bvb)var1).a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }
}
