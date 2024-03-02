import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class cnh {
   public final Map h = new HashMap();
   public final Set i = new LinkedHashSet();
   public volatile boolean j = false;

   public static void g(Object var0) {
      if (var0 instanceof Closeable) {
         try {
            ((Closeable)var0).close();
         } catch (IOException var1) {
            throw new RuntimeException(var1);
         }
      }
   }

   public void d() {
   }
}
