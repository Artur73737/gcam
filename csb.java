import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.lullaby.modules.audio.nwj.OtvMV;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class csb {
   public final int a;
   public cqv b;
   public final crg c;
   public final String d;
   public final String e;

   public csb(int var1) {
      this.a = var1;
   }

   public csb(cqv var1, crg var2, String var3, String var4) {
      this(var2.a);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public static final void a(String var0) {
      if (!var0.equalsIgnoreCase(":memory:")) {
         int var2 = var0.length() - 1;
         int var1 = 0;
         boolean var3 = false;

         while(var1 <= var2) {
            int var4;
            if (!var3) {
               var4 = var1;
            } else {
               var4 = var2;
            }

            var4 = qwp.a(var0.charAt(var4), 32);
            if (!var3) {
               if (var4 > 0) {
                  var3 = true;
               } else {
                  ++var1;
               }
            } else {
               if (var4 > 0) {
                  break;
               }

               --var2;
            }
         }

         if (var0.subSequence(var1, var2 + 1).toString().length() != 0) {
            Log.w("SupportSQLite", "deleting the database file: ".concat(var0));

            try {
               File var5 = new File(var0);
               SQLiteDatabase.deleteDatabase(var5);
               return;
            } catch (Exception var6) {
               Log.w("SupportSQLite", "delete failed: ", var6);
               return;
            }
         }
      }

   }

   public final void b(csa var1, int var2, int var3) {
      cqv var7 = this.b;
      if (var7 != null) {
         gfv var9 = var7.n;
         Object var14;
         if (var2 == var3) {
            var14 = qtf.a;
         } else {
            label107: {
               boolean var4;
               if (var3 > var2) {
                  var4 = true;
               } else {
                  var4 = false;
               }

               ArrayList var8 = new ArrayList();
               int var5 = var2;

               while(true) {
                  if (var4) {
                     if (var5 >= var3) {
                        break;
                     }
                  } else if (var5 <= var3) {
                     break;
                  }

                  TreeMap var10 = (TreeMap)((Map)var9.a).get(var5);
                  if (var10 == null) {
                     var14 = null;
                     break label107;
                  }

                  if (var4) {
                     var14 = var10.descendingKeySet();
                  } else {
                     var14 = var10.keySet();
                  }

                  Iterator var11 = ((Set)var14).iterator();

                  boolean var6;
                  while(true) {
                     if (var11.hasNext()) {
                        Integer var15 = (Integer)var11.next();
                        int var13;
                        if (var4) {
                           var15.getClass();
                           var13 = var15;
                           if (var5 + 1 > var13 || var13 > var3) {
                              continue;
                           }
                        } else {
                           var15.getClass();
                           var13 = var15;
                           if (var3 > var13 || var13 >= var5) {
                              continue;
                           }
                        }

                        Object var16 = var10.get(var15);
                        var16.getClass();
                        var8.add(var16);
                        var5 = var15;
                        var6 = true;
                        break;
                     }

                     var6 = false;
                     break;
                  }

                  if (!var6) {
                     var14 = null;
                     break label107;
                  }
               }

               var14 = var8;
            }
         }

         if (var14 != null) {
            this.c.e(var1);
            Iterator var17 = ((Iterable)var14).iterator();

            while(var17.hasNext()) {
               ((crl)var17.next()).a(var1);
            }

            prv var18 = this.c.g(var1);
            if (var18.a) {
               this.c.d(var1);
               this.c(var1);
               return;
            }

            throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(var18.b)));
         }
      }

      var7 = this.b;
      if (var7 == null || (var2 <= var3 || !var7.i) && var7.h && !var7.j.contains(var2)) {
         IllegalStateException var12 = new IllegalStateException(c.aI(var3, var2, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
         throw var12;
      } else {
         this.c.b(var1);
         this.c.a(var1);
      }
   }

   public final void c(csa var1) {
      var1.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
      String var2 = this.d;
      StringBuilder var3 = new StringBuilder();
      var3.append(OtvMV.gxRcT);
      var3.append(var2);
      var3.append("')");
      var1.g(var3.toString());
   }
}
