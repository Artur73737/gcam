import android.database.sqlite.SQLiteStatement;

public final class csp extends cso implements csf {
   private final SQLiteStatement a;

   public csp(SQLiteStatement var1) {
      super(var1);
      this.a = var1;
   }

   public final int a() {
      return this.a.executeUpdateDelete();
   }

   public final void b() {
      this.a.executeInsert();
   }
}
