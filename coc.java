import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class coc {
   private static Handler a;
   public final FutureTask c = new cob(this, new dgf(this, 1));
   public final AtomicBoolean d = new AtomicBoolean();
   public final AtomicBoolean e = new AtomicBoolean();
   public volatile int f = 1;

   public abstract Object a();

   public void b(Object var1) {
      throw null;
   }

   public void c() {
      throw null;
   }

   public final void d(Object var1) {
      synchronized(coc.class){}

      Handler var2;
      label136: {
         Throwable var10000;
         boolean var10001;
         label131: {
            try {
               if (a == null) {
                  var2 = new Handler(Looper.getMainLooper());
                  a = var2;
               }
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label131;
            }

            label128:
            try {
               var2 = a;
               break label136;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label128;
            }
         }

         while(true) {
            Throwable var15 = var10000;

            try {
               throw var15;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               continue;
            }
         }
      }

      var2.post(new ay(this, var1, 13, (char[])null));
   }

   final void e(Object var1) {
      if (!this.e.get()) {
         this.d(var1);
      }

   }

   public final boolean f() {
      return this.d.get();
   }
}
