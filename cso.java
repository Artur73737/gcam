import android.database.sqlite.SQLiteProgram;

public class cso implements csf {
   private final SQLiteProgram a;

   public cso(SQLiteProgram var1) {
      this.a = var1;
   }

   public final void c(int var1, byte[] var2) {
      this.a.bindBlob(var1, var2);
   }

   public final void close() {
      this.a.close();
   }

   public final void d(int var1, double var2) {
      this.a.bindDouble(var1, var2);
   }

   public final void e(int var1, long var2) {
      this.a.bindLong(var1, var2);
   }

   public final void f(int var1) {
      this.a.bindNull(var1);
   }

   public final void g(int var1, String var2) {
      this.a.bindString(var1, var2);
   }
}
