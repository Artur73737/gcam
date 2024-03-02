import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

public final class bqr extends ContentObserver {
   final rdb a;

   public bqr(rdb var1, Handler var2) {
      super(var2);
      this.a = var1;
   }

   public final void onChange(boolean var1, Uri var2) {
      this.a.u(qsn.a);
   }
}
