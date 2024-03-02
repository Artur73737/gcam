import com.google.babelfish.device.avenh.l2l.modelutils.androidmodelextractor.MtR.NgAyRSYlmLoD;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class u implements Serializable {
   private static final long serialVersionUID = 1L;
   public boolean a = false;
   public final List b = new ArrayList();

   public u() {
   }

   public final void a(t var1) {
      String var3 = var1.a;
      Iterator var2 = this.b.iterator();

      do {
         if (!var2.hasNext()) {
            this.b.add(var1);
            return;
         }
      } while(!var3.equals(((t)var2.next()).a));

      throw new IllegalArgumentException("Duplicate keyword: ".concat(String.valueOf(var3)));
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder();

      t var1;
      for(Iterator var3 = this.b.iterator(); var3.hasNext(); var2.append(var1)) {
         var1 = (t)var3.next();
         if (var2.length() != 0) {
            var2.append(NgAyRSYlmLoD.bEFd);
         }
      }

      return var2.toString();
   }
}
