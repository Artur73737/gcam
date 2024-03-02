import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

// $FF: synthetic class
public final class csh implements CursorFactory {
   public final qvz a;

   // $FF: synthetic method
   public csh(qvz var1) {
      this.a = var1;
   }

   public final Cursor newCursor(SQLiteDatabase var1, SQLiteCursorDriver var2, String var3, SQLiteQuery var4) {
      qvz var5 = this.a;
      String[] var6 = csi.a;
      return (Cursor)var5.d(var1, var2, var3, var4);
   }
}
