import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public final class cze implements czb {
   private final WindowLayoutComponent a;
   private final cyd b;
   private final ReentrantLock c;
   private final Map d;
   private final Map e;
   private final Map f;

   public cze(WindowLayoutComponent var1, cyd var2) {
      this.a = var1;
      this.b = var2;
      this.c = new ReentrantLock();
      this.d = new LinkedHashMap();
      this.e = new LinkedHashMap();
      this.f = new LinkedHashMap();
   }

   public final void a(Context var1, Executor var2, cew var3) {
      ReentrantLock var4 = this.c;
      var4.lock();

      label129: {
         Throwable var10000;
         label133: {
            boolean var10001;
            czg var23;
            try {
               var23 = (czg)this.d.get(var1);
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label133;
            }

            qsn var24;
            if (var23 != null) {
               try {
                  var23.addListener(var3);
                  this.e.put(var3, var1);
                  var24 = qsn.a;
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label133;
               }
            } else {
               var24 = null;
            }

            if (var24 != null) {
               break label129;
            }

            label120:
            try {
               var23 = new czg(var1);
               this.d.put(var1, var23);
               this.e.put(var3, var1);
               var23.addListener(var3);
               cyd var5 = this.b;
               WindowLayoutComponent var25 = this.a;
               qxs var8 = qxa.a(WindowLayoutInfo.class);
               knn var7 = new knn(var23, 1, (byte[])null);
               cyb var6 = new cyb(var8, var7);
               Object var27 = Proxy.newProxyInstance(var5.a, new Class[]{var5.a()}, var6);
               var27.getClass();
               var25.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, var5.a()).invoke(var25, var1, var27);
               Method var22 = var25.getClass().getMethod("removeWindowLayoutInfoListener", var5.a());
               cyc var26 = new cyc(var22, var25, var27);
               this.f.put(var23, var26);
               break label129;
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break label120;
            }
         }

         Throwable var21 = var10000;
         var4.unlock();
         throw var21;
      }

      var4.unlock();
   }

   public final void b(cew var1) {
      ReentrantLock var2 = this.c;
      var2.lock();

      Throwable var10000;
      label225: {
         Context var3;
         boolean var10001;
         try {
            var3 = (Context)this.e.get(var1);
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label225;
         }

         if (var3 == null) {
            var2.unlock();
            return;
         }

         czg var4;
         try {
            var4 = (czg)this.d.get(var3);
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label225;
         }

         if (var4 == null) {
            var2.unlock();
            return;
         }

         label211: {
            cyc var28;
            try {
               var4.removeListener(var1);
               this.e.remove(var1);
               if (!var4.isEmpty()) {
                  break label211;
               }

               this.d.remove(var3);
               var28 = (cyc)this.f.remove(var4);
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label225;
            }

            if (var28 != null) {
               try {
                  Object var26 = var28.c;
                  Object var27 = var28.a;
                  Object var29 = var28.b;
                  ((Method)var26).invoke(var27, var29);
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label225;
               }
            }
         }

         var2.unlock();
         return;
      }

      Throwable var25 = var10000;
      var2.unlock();
      throw var25;
   }
}
