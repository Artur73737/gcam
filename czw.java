import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class czw extends dao {
   private static final String b = dae.b("DelegatingWkrFctry");
   public final List a = new CopyOnWriteArrayList();

   public final dad a(Context var1, String var2, WorkerParameters var3) {
      Iterator var4 = this.a.iterator();

      while(var4.hasNext()) {
         dao var5 = (dao)var4.next();

         dad var8;
         try {
            var8 = var5.a(var1, var2, var3);
         } catch (Throwable var7) {
            var2 = c.aA(var2, "Unable to instantiate a ListenableWorker (", ")");
            dae.a();
            Log.e(b, var2, var7);
            throw var7;
         }

         if (var8 != null) {
            return var8;
         }
      }

      return null;
   }
}
