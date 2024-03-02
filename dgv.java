import java.util.HashMap;
import java.util.Map;

public final class dgv {
   public final Map a = new HashMap();
   public final Map b = new HashMap();
   public final Object c = new Object();
   public final gfv d;

   static {
      dae.b("WorkTimer");
   }

   public dgv(gfv var1) {
      this.d = var1;
   }

   public final void a(deq var1) {
      Object var2 = this.c;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            if ((dgu)this.a.remove(var1) != null) {
               dae.a();
               StringBuilder var3 = new StringBuilder();
               var3.append("Stopping timer for ");
               var3.append(var1);
               this.b.remove(var1);
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            return;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }
}
