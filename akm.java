import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

final class akm implements bkm {
   private final Map a;
   private final ve b;

   public akm(ve var1) {
      var1.getClass();
      super();
      this.b = var1;
      this.a = new LinkedHashMap();
   }

   public final void a(bkl var1) {
      var1.getClass();
      this.a.clear();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         Object var3 = var4.next();
         this.b.b(var3);
         Integer var5 = (Integer)this.a.get((Object)null);
         int var2;
         if (var5 != null) {
            var2 = var5;
         } else {
            var2 = 0;
         }

         if (var2 == 7) {
            var4.remove();
         } else {
            this.a.put((Object)null, var2 + 1);
         }
      }

   }

   public final boolean b(Object var1, Object var2) {
      this.b.b(var1);
      this.b.b(var2);
      return c.E((Object)null, (Object)null);
   }
}
