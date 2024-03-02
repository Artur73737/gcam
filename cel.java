import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

final class cel {
   static Cursor a(ContentResolver var0, Uri var1, String[] var2, String var3, String[] var4, String var5, Object var6) {
      return var0.query(var1, var2, var3, var4, var5, (CancellationSignal)var6);
   }
}
