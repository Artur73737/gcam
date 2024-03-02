import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import java.util.Map;

public final class bwi extends qwq implements qvz {
   final Object a;
   private final int b;

   public bwi(Object var1, int var2) {
      super(4);
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object d(Object var1, Object var2, Object var3, Object var4) {
      switch(this.b) {
      case 0:
         buq var6 = (buq)var1;
         bvc var9 = (bvc)var2;
         int var5 = ((buy)var3).a;
         buz var12 = (buz)var4;
         var9.getClass();
         avi var7 = ((bwj)this.a).g.f(var6, var9, var5);
         Typeface var11;
         if (!(var7 instanceof bvn)) {
            bbf var8 = new bbf(var7, ((bwj)this.a).f);
            ((bwj)this.a).f = var8;
            var1 = var8.a;
            var1.getClass();
            var11 = (Typeface)var1;
         } else {
            var1 = var7.a();
            var1.getClass();
            var11 = (Typeface)var1;
         }

         return var11;
      case 1:
         ((Number)var1).floatValue();
         ((Number)var2).floatValue();
         if ((((Number)var4).intValue() & 11) == 2 && ((asm)var3).G()) {
            ((asm)var3).q();
         } else {
            gh.e(((bff)this.a).e, (Map)null, (asm)var3, 0, 2);
         }

         return qsn.a;
      default:
         SQLiteDatabase var14 = (SQLiteDatabase)var1;
         SQLiteCursorDriver var15 = (SQLiteCursorDriver)var2;
         String var10 = (String)var3;
         SQLiteQuery var13 = (SQLiteQuery)var4;
         var4 = this.a;
         var13.getClass();
         ((csg)var4).h(new cso(var13));
         return new SQLiteCursor(var15, var10, var13);
      }
   }
}
