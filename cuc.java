import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class cuc {
   public final Map a = new HashMap();
   public View b;
   final ArrayList c = new ArrayList();

   @Deprecated
   public cuc() {
   }

   public cuc(View var1) {
      this.b = var1;
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof cuc) {
         View var2 = this.b;
         cuc var3 = (cuc)var1;
         if (var2 == var3.b && this.a.equals(var3.a)) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return this.b.hashCode() * 31 + this.a.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TransitionValues@");
      var1.append(Integer.toHexString(this.hashCode()));
      var1.append(":\n");
      String var2 = var1.toString();
      var1 = new StringBuilder();
      var1.append(var2);
      var1.append("    view = ");
      var1.append(this.b);
      var1.append("\n");
      String var5 = var1.toString().concat("    values:");

      StringBuilder var4;
      for(Iterator var6 = this.a.keySet().iterator(); var6.hasNext(); var5 = var4.toString()) {
         String var3 = (String)var6.next();
         var4 = new StringBuilder();
         var4.append(var5);
         var4.append("    ");
         var4.append(var3);
         var4.append(": ");
         var4.append(this.a.get(var3));
         var4.append("\n");
      }

      return var5;
   }
}
