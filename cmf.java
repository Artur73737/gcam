import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.wear.ambient.AmbientDelegate;

public class cmf extends Service implements cmc {
   private final AmbientDelegate a = new AmbientDelegate(this);

   public final clx getLifecycle() {
      return (clx)this.a.b;
   }

   public final IBinder onBind(Intent var1) {
      var1.getClass();
      this.a.n(clv.ON_START);
      return null;
   }

   public void onCreate() {
      this.a.n(clv.ON_CREATE);
      super.onCreate();
   }

   public void onDestroy() {
      AmbientDelegate var1 = this.a;
      var1.n(clv.ON_STOP);
      var1.n(clv.ON_DESTROY);
      super.onDestroy();
   }

   public final void onStart(Intent var1, int var2) {
      this.a.n(clv.ON_START);
      super.onStart(var1, var2);
   }
}
