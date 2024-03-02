import android.app.Activity;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

public final class czj implements czh {
   public final ReentrantLock a;
   public final WeakHashMap b;
   private final czh c;

   public czj(czh var1) {
      this.c = var1;
      this.a = new ReentrantLock();
      this.b = new WeakHashMap();
   }

   public final void a(Activity var1, cyw var2) {
      var1.getClass();
      ReentrantLock var4 = this.a;
      var4.lock();

      Throwable var10000;
      label109: {
         boolean var3;
         boolean var10001;
         try {
            var3 = c.E(var2, (cyw)this.b.get(var1));
         } catch (Throwable var11) {
            var10000 = var11;
            var10001 = false;
            break label109;
         }

         if (var3) {
            var4.unlock();
            return;
         }

         try {
            cyw var5 = (cyw)this.b.put(var1, var2);
         } catch (Throwable var10) {
            var10000 = var10;
            var10001 = false;
            break label109;
         }

         var4.unlock();
         Iterator var13 = ((czm)this.c).a.c.iterator();

         while(var13.hasNext()) {
            czn var14 = (czn)var13.next();
            if (c.E(var14.a, var1)) {
               var14.a(var2);
            }
         }

         return;
      }

      Throwable var12 = var10000;
      var4.unlock();
      throw var12;
   }
}
