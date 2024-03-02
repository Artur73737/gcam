import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public final class czf implements czb {
   private final WindowLayoutComponent a;
   private final ReentrantLock b;
   private final Map c;
   private final Map d;

   public czf(WindowLayoutComponent var1) {
      this.a = var1;
      this.b = new ReentrantLock();
      this.c = new LinkedHashMap();
      this.d = new LinkedHashMap();
   }

   public final void a(Context var1, Executor var2, cew var3) {
      ReentrantLock var4 = this.b;
      var4.lock();

      label129: {
         Throwable var10000;
         label133: {
            boolean var10001;
            czg var18;
            try {
               var18 = (czg)this.c.get(var1);
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label133;
            }

            qsn var19;
            if (var18 != null) {
               try {
                  var18.addListener(var3);
                  this.d.put(var3, var1);
                  var19 = qsn.a;
               } catch (Throwable var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label133;
               }
            } else {
               var19 = null;
            }

            if (var19 != null) {
               break label129;
            }

            label120:
            try {
               var18 = new czg(var1);
               this.c.put(var1, var18);
               this.d.put(var3, var1);
               var18.addListener(var3);
               this.a.addWindowLayoutInfoListener(var1, var18);
               break label129;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label120;
            }
         }

         Throwable var17 = var10000;
         var4.unlock();
         throw var17;
      }

      var4.unlock();
   }

   public final void b(cew var1) {
      ReentrantLock var2 = this.b;
      var2.lock();

      Throwable var10000;
      label156: {
         boolean var10001;
         Context var4;
         try {
            var4 = (Context)this.d.get(var1);
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label156;
         }

         if (var4 == null) {
            var2.unlock();
            return;
         }

         czg var3;
         try {
            var3 = (czg)this.c.get(var4);
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label156;
         }

         if (var3 == null) {
            var2.unlock();
            return;
         }

         try {
            var3.removeListener(var1);
            this.d.remove(var1);
            if (var3.isEmpty()) {
               this.c.remove(var4);
               this.a.removeWindowLayoutInfoListener(var3);
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label156;
         }

         var2.unlock();
         return;
      }

      Throwable var17 = var10000;
      var2.unlock();
      throw var17;
   }
}
