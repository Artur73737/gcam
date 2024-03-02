import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public abstract class mih extends ContentProvider {
   public abstract void a(PrintWriter var1);

   public final int delete(Uri var1, String var2, String[] var3) {
      throw new UnsupportedOperationException("BasicDebugDumper does not support delete");
   }

   public final void dump(FileDescriptor var1, PrintWriter var2, String[] var3) {
      try {
         Arrays.asList(var3);
         this.a(var2);
      } catch (Exception var4) {
         var2.flush();
         var4.printStackTrace(var2);
         var2.flush();
      }
   }

   public final String getType(Uri var1) {
      return "text/plain";
   }

   public final Uri insert(Uri var1, ContentValues var2) {
      throw new UnsupportedOperationException("BasicDebugDumper does not support insert");
   }

   public final boolean onCreate() {
      return true;
   }

   public final Cursor query(Uri var1, String[] var2, String var3, String[] var4, String var5) {
      throw new UnsupportedOperationException("BasicDebugDumper does not support query");
   }

   public final int update(Uri var1, ContentValues var2, String var3, String[] var4) {
      throw new UnsupportedOperationException("BasicDebugDumper does not support update");
   }
}
