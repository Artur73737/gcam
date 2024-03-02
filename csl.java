import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.util.Map;
import java.util.UUID;

public final class csl extends SQLiteOpenHelper {
   private final Context a;
   private final csb b;
   private final boolean c;
   private boolean d;
   private final csq e;
   private boolean f;
   private final pde g;

   public csl(Context var1, String var2, pde var3, csb var4, boolean var5) {
      super(var1, var2, (CursorFactory)null, var4.a, new csj(var3));
      this.a = var1;
      this.g = var3;
      this.b = var4;
      this.c = var5;
      String var6 = var2;
      if (var2 == null) {
         var6 = UUID.randomUUID().toString();
         var6.getClass();
      }

      this.e = new csq(var6, var1.getCacheDir());
   }

   private final SQLiteDatabase c() {
      SQLiteDatabase var1 = super.getWritableDatabase();
      var1.getClass();
      return var1;
   }

   public final csi a(SQLiteDatabase var1) {
      var1.getClass();
      return cbw.i(this.g, var1);
   }

   public final csa b() {
      // $FF: Couldn't be decompiled
   }

   public final void close() {
      try {
         csq var3 = this.e;
         Map var2 = csq.a;
         boolean var1 = var3.b;
         var3.a(false);
         super.close();
         this.g.a = null;
         this.f = false;
      } finally {
         this.e.b();
      }

   }

   public final void onConfigure(SQLiteDatabase var1) {
      var1.getClass();
      if (!this.d && this.b.a != var1.getVersion()) {
         var1.setMaxSqlCacheSize(1);
      }

      try {
         this.a(var1);
      } catch (Throwable var3) {
         throw new csk(1, var3);
      }
   }

   public final void onCreate(SQLiteDatabase var1) {
      var1.getClass();

      Throwable var10000;
      label735: {
         Cursor var97;
         csb var5;
         csi var6;
         boolean var10001;
         try {
            var5 = this.b;
            var6 = this.a(var1);
            var97 = var6.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
         } catch (Throwable var96) {
            var10000 = var96;
            var10001 = false;
            break label735;
         }

         boolean var2;
         label736: {
            label737: {
               boolean var4;
               try {
                  var4 = var97.moveToFirst();
               } catch (Throwable var95) {
                  var10000 = var95;
                  var10001 = false;
                  break label737;
               }

               var2 = false;
               if (!var4) {
                  break label736;
               }

               int var3;
               try {
                  var3 = var97.getInt(0);
               } catch (Throwable var94) {
                  var10000 = var94;
                  var10001 = false;
                  break label737;
               }

               if (var3 == 0) {
                  var2 = true;
               }
               break label736;
            }

            Throwable var100 = var10000;

            try {
               throw var100;
            } finally {
               try {
                  qwl.g(var97, var100);
               } catch (Throwable var88) {
                  var10000 = var88;
                  var10001 = false;
                  break label735;
               }
            }
         }

         try {
            qwl.g(var97, (Throwable)null);
            var5.c.a(var6);
         } catch (Throwable var93) {
            var10000 = var93;
            var10001 = false;
            break label735;
         }

         prv var98;
         label712: {
            if (!var2) {
               try {
                  var98 = var5.c.g(var6);
                  if (!var98.a) {
                     break label712;
                  }
               } catch (Throwable var92) {
                  var10000 = var92;
                  var10001 = false;
                  break label735;
               }
            }

            try {
               var5.c(var6);
               var5.c.f();
               return;
            } catch (Throwable var91) {
               var10000 = var91;
               var10001 = false;
               break label735;
            }
         }

         label704:
         try {
            IllegalStateException var101 = new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(var98.b)));
            throw var101;
         } catch (Throwable var90) {
            var10000 = var90;
            var10001 = false;
            break label704;
         }
      }

      Throwable var99 = var10000;
      throw new csk(2, var99);
   }

   public final void onDowngrade(SQLiteDatabase var1, int var2, int var3) {
      var1.getClass();
      this.d = true;

      try {
         this.b.b(this.a(var1), var2, var3);
      } catch (Throwable var5) {
         throw new csk(4, var5);
      }
   }

   public final void onOpen(SQLiteDatabase var1) {
      Throwable var10000;
      label1607: {
         var1.getClass();
         if (!this.d) {
            label1609: {
               csb var3;
               csi var4;
               boolean var10001;
               Cursor var216;
               try {
                  var3 = this.b;
                  var4 = this.a(var1);
                  var216 = var4.b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
               } catch (Throwable var211) {
                  var10000 = var211;
                  var10001 = false;
                  break label1607;
               }

               boolean var219;
               label1603: {
                  label1602: {
                     int var2;
                     try {
                        if (!var216.moveToFirst()) {
                           break label1602;
                        }

                        var2 = var216.getInt(0);
                     } catch (Throwable var215) {
                        Throwable var224 = var215;

                        try {
                           throw var224;
                        } finally {
                           try {
                              qwl.g(var216, var224);
                           } catch (Throwable var203) {
                              var10000 = var203;
                              var10001 = false;
                              break label1607;
                           }
                        }
                     }

                     if (var2 != 0) {
                        var219 = true;
                        break label1603;
                     }
                  }

                  var219 = false;
               }

               try {
                  qwl.g(var216, (Throwable)null);
               } catch (Throwable var210) {
                  var10000 = var210;
                  var10001 = false;
                  break label1607;
               }

               String var220;
               label1592: {
                  prv var217;
                  label1611: {
                     if (var219) {
                        Cursor var5;
                        try {
                           crz var218 = new crz("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                           var5 = var4.a(var218);
                        } catch (Throwable var209) {
                           var10000 = var209;
                           var10001 = false;
                           break label1607;
                        }

                        label1586: {
                           try {
                              if (var5.moveToFirst()) {
                                 var220 = var5.getString(0);
                                 break label1586;
                              }
                           } catch (Throwable var214) {
                              Throwable var223 = var214;

                              try {
                                 throw var223;
                              } finally {
                                 try {
                                    qwl.g(var5, var223);
                                 } catch (Throwable var202) {
                                    var10000 = var202;
                                    var10001 = false;
                                    break label1607;
                                 }
                              }
                           }

                           var220 = null;
                        }

                        try {
                           qwl.g(var5, (Throwable)null);
                           if (!c.E(var3.d, var220) && !c.E(var3.e, var220)) {
                              break label1592;
                           }
                        } catch (Throwable var212) {
                           var10000 = var212;
                           var10001 = false;
                           break label1607;
                        }
                     } else {
                        try {
                           var217 = var3.c.g(var4);
                           if (!var217.a) {
                              break label1611;
                           }

                           var3.c.d(var4);
                           var3.c(var4);
                        } catch (Throwable var213) {
                           var10000 = var213;
                           var10001 = false;
                           break label1607;
                        }
                     }

                     try {
                        var3.c.c(var4);
                        var3.b = null;
                        break label1609;
                     } catch (Throwable var208) {
                        var10000 = var208;
                        var10001 = false;
                        break label1607;
                     }
                  }

                  try {
                     IllegalStateException var222 = new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(var217.b)));
                     throw var222;
                  } catch (Throwable var207) {
                     var10000 = var207;
                     var10001 = false;
                     break label1607;
                  }
               }

               try {
                  StringBuilder var225 = new StringBuilder();
                  var225.append("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ");
                  var225.append(var3.d);
                  var225.append(", found: ");
                  var225.append(var220);
                  IllegalStateException var226 = new IllegalStateException(var225.toString());
                  throw var226;
               } catch (Throwable var206) {
                  var10000 = var206;
                  var10001 = false;
                  break label1607;
               }
            }
         }

         this.f = true;
         return;
      }

      Throwable var221 = var10000;
      throw new csk(5, var221);
   }

   public final void onUpgrade(SQLiteDatabase var1, int var2, int var3) {
      var1.getClass();
      this.d = true;

      try {
         this.b.b(this.a(var1), var2, var3);
      } catch (Throwable var5) {
         throw new csk(3, var5);
      }
   }
}
