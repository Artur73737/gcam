import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;

public final class csi implements csa {
   public static final String[] a;
   private static final String[] c;
   public final SQLiteDatabase b;

   static {
      a = new String[]{"", " OR ROLLBACK ", " OR ABORT ", TRoaEYDrhZZT.iNBrphz, " OR IGNORE ", " OR REPLACE "};
      c = new String[0];
   }

   public csi(SQLiteDatabase var1) {
      this.b = var1;
   }

   public final Cursor a(csg var1) {
      bwi var2 = new bwi(var1, 2);
      Cursor var3 = this.b.rawQueryWithFactory(new csh(var2), var1.b(), c, (String)null);
      var3.getClass();
      return var3;
   }

   public final Cursor b(String var1) {
      return this.a(new crz(var1));
   }

   public final String c() {
      return this.b.getPath();
   }

   public final void close() {
      this.b.close();
   }

   public final void d() {
      this.b.beginTransaction();
   }

   public final void e() {
      this.b.beginTransactionNonExclusive();
   }

   public final void f() {
      this.b.endTransaction();
   }

   public final void g(String var1) {
      this.b.execSQL(var1);
   }

   public final void h() {
      this.b.setTransactionSuccessful();
   }

   public final boolean i() {
      return this.b.inTransaction();
   }

   public final boolean j() {
      return this.b.isOpen();
   }

   public final boolean k() {
      return this.b.isWriteAheadLoggingEnabled();
   }

   public final csp l(String var1) {
      SQLiteStatement var2 = this.b.compileStatement(var1);
      var2.getClass();
      return new csp(var2);
   }

   public final void m(Object[] var1) {
      this.b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", var1);
   }
}
