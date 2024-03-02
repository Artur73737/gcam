import android.app.Application;
import android.os.SystemClock;
import com.pairip.StartupLauncher;
import java.util.Iterator;

public class hhc extends Application {
   protected static final long i;
   public final hfy j = new hfy();

   static {
      StartupLauncher.launch();
      i = SystemClock.elapsedRealtimeNanos();
   }

   public void onCreate() {
      hfy var1 = this.j;
      hfq var2 = hfq.d;
      var1.e(var2);
      var1.d = var2;
      super.onCreate();
   }

   public final void onTerminate() {
      hfy var1 = this.j;
      var1.a(var1.d);
      Iterator var3 = var1.a.iterator();

      while(var3.hasNext()) {
         hgy var2 = (hgy)var3.next();
         if (var2 instanceof hge) {
            ((hge)var2).a();
         }
      }

      super.onTerminate();
   }
}
