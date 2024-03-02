import android.os.Binder;
import androidx.window.extensions.area.WindowAreaComponent;
import java.util.HashMap;

public final class cxv {
   public cyx a;
   public final cxu b;
   public final Binder c;
   public final WindowAreaComponent d;
   public final HashMap e;

   public cxv(cyx var1, cxu var2, Binder var3, WindowAreaComponent var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = new HashMap();
   }

   public final cxl a(cxj var1) {
      return (cxl)this.e.get(var1);
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof cxv) {
         cyx var2 = this.a;
         cxv var3 = (cxv)var1;
         if (c.E(var2, var3.a) && c.E(this.b, var3.b) && c.E(this.e.entrySet(), var3.e.entrySet())) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.e.entrySet().hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("WindowAreaInfo{ Metrics: ");
      var1.append(this.a);
      var1.append(", type: ");
      var1.append(this.b);
      var1.append(", Capabilities: ");
      var1.append(this.e.entrySet());
      var1.append(" }");
      return var1.toString();
   }
}
