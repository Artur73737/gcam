package com.google.android.apps.camera.debug.shottracker.db;

import android.content.Context;
import android.database.Cursor;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DbDebugDumper extends .mih {
   private static final DateTimeFormatter a = DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS").withZone(ZoneId.systemDefault());

   private static void b(Map var0, List var1, PrintWriter var2) {
      PrintWriter var21 = var2;
      Iterator var30 = var1.iterator();
      long var6 = Long.MAX_VALUE;
      Instant var20 = null;

      while(var30.hasNext()) {
         .fqw var23 = (.fqw)var30.next();
         .fqq var22 = (.fqq)var0.get(var23.b);
         if (var22 != null) {
            long var8;
            String var24;
            String var27;
            Instant var28;
            PrintWriter var35;
            if (var23.b != var6) {
               if (var6 < Long.MAX_VALUE) {
                  var21.println("");
                  var2.flush();
               }

               long var16 = var22.a;
               String var34 = var22.i;
               var6 = var22.j;
               var24 = var22.b;
               var27 = var22.h;
               long var10 = var22.c;
               long var12 = var22.d;
               var8 = var22.e;
               long var18 = var22.f;
               long var14 = var22.g;
               boolean var5 = var22.l;
               StringBuilder var29 = new StringBuilder();
               var29.append(var16);
               var29.append(" ");
               var29.append(var34);
               var29.append("[pid=");
               var29.append(var6);
               var29.append("] title=");
               var29.append(var24);
               var29.append(" captureSessionType=");
               var29.append(var27);
               var29.append(" start=");
               var29.append(var10);
               var29.append(" persisted=");
               var29.append(var12);
               var29.append(" canceled=");
               var29.append(var8);
               var29.append(" deleted=");
               var29.append(var18);
               var29.append(" mostRecentEvent=");
               var29.append(var14);
               var29.append(" failed=");
               var29.append(var5);
               var27 = var29.toString();
               var35 = var2;
               var2.println(var27);
               var28 = null;
            } else {
               PrintWriter var31 = var21;
               var28 = var20;
               var35 = var31;
            }

            Instant var32 = Instant.ofEpochMilli(var23.c);
            Duration var33;
            if (var28 == null) {
               var33 = Duration.ZERO;
            } else {
               var33 = Duration.between(var28, var32);
            }

            var8 = var23.c;
            var24 = a.format(var32);
            var6 = var33.toMillis();
            if (var6 >= 1000L) {
               double var3 = (double)var6;
               Double.isNaN(var3);
               var27 = String.format("%10.3fs", var3 / 1000.0D);
            } else {
               var27 = String.format("      .%03ds", var6);
            }

            String var25 = var23.d;
            StringBuilder var26 = new StringBuilder();
            var26.append("  ");
            var26.append(var8);
            var26.append("  ");
            var26.append(var24);
            var26.append(var27);
            var26.append(": ");
            var26.append(var25);
            var35.println(var26.toString());
            var6 = var23.b;
            var21 = var35;
            var20 = var32;
         }
      }

      var2.flush();
   }

   public final void a(PrintWriter var1) {
      Context var15 = this.getContext();
      var15.getClass();
      .crb var834 = .cbj.f(var15, ShotDatabase.class, "shot_db");
      var834.c();
      ShotDatabase var17 = (ShotDatabase)var834.a();
      .fqi var16 = var17.w();
      .crh var835 = .crh.a("SELECT * FROM shots ORDER BY shot_id", 0);
      .fqo var836 = (.fqo)var16;
      var836.a.l();
      Cursor var19 = .cbm.g(var836.a, var835, false);
      .crh var837 = var835;

      Throwable var833;
      label8029: {
         Throwable var10000;
         label8033: {
            int var5;
            boolean var10001;
            try {
               var5 = .cbm.i(var19, "shot_id");
            } catch (Throwable var832) {
               var10000 = var832;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            int var11;
            try {
               var11 = .cbm.i(var19, "title");
            } catch (Throwable var831) {
               var10000 = var831;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            int var9;
            try {
               var9 = .cbm.i(var19, "start_millis");
            } catch (Throwable var830) {
               var10000 = var830;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            int var8;
            try {
               var8 = .cbm.i(var19, "persisted_millis");
            } catch (Throwable var829) {
               var10000 = var829;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            int var3;
            try {
               var3 = .cbm.i(var19, "canceled_millis");
            } catch (Throwable var828) {
               var10000 = var828;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            int var7;
            try {
               var7 = .cbm.i(var19, "deleted_millis");
            } catch (Throwable var827) {
               var10000 = var827;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            int var10;
            try {
               var10 = .cbm.i(var19, "most_recent_event_millis");
            } catch (Throwable var826) {
               var10000 = var826;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            int var13;
            try {
               var13 = .cbm.i(var19, "capture_session_type");
            } catch (Throwable var825) {
               var10000 = var825;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            int var12;
            try {
               var12 = .cbm.i(var19, "capture_session_shot_id");
            } catch (Throwable var824) {
               var10000 = var824;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            int var6;
            try {
               var6 = .cbm.i(var19, "pid");
            } catch (Throwable var823) {
               var10000 = var823;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            int var2;
            try {
               var2 = .cbm.i(var19, "stuck");
            } catch (Throwable var822) {
               var10000 = var822;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            int var4;
            try {
               var4 = .cbm.i(var19, "failed");
            } catch (Throwable var821) {
               var10000 = var821;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            ArrayList var18;
            try {
               var18 = new ArrayList;
            } catch (Throwable var820) {
               var10000 = var820;
               var10001 = false;
               break label8033;
            }

            var837 = var835;

            try {
               var18.<init>(var19.getCount());
            } catch (Throwable var819) {
               var10000 = var819;
               var10001 = false;
               break label8033;
            }

            while(true) {
               var837 = var835;

               boolean var14;
               try {
                  var14 = var19.moveToNext();
               } catch (Throwable var809) {
                  var10000 = var809;
                  var10001 = false;
                  break;
               }

               if (!var14) {
                  var19.close();
                  var835.j();
                  .fqr var838 = var17.x();
                  var837 = .crh.a("SELECT * FROM shot_log ORDER BY shot_id DESC, sequence", 0);
                  .fqv var839 = (.fqv)var838;
                  var839.a.l();
                  var19 = .cbm.g(var839.a, var837, false);

                  ArrayList var840;
                  label7910: {
                     label7909: {
                        try {
                           var3 = .cbm.i(var19, "sequence");
                           var2 = .cbm.i(var19, "shot_id");
                           var4 = .cbm.i(var19, "time_millis");
                           var5 = .cbm.i(var19, "message");
                           var840 = new ArrayList(var19.getCount());
                        } catch (Throwable var808) {
                           var10000 = var808;
                           var10001 = false;
                           break label7909;
                        }

                        while(true) {
                           .fqw var20;
                           label8043: {
                              try {
                                 if (!var19.moveToNext()) {
                                    break label7910;
                                 }

                                 var20 = new .fqw();
                                 var20.a = var19.getInt(var3);
                                 var20.b = var19.getLong(var2);
                                 var20.c = var19.getLong(var4);
                                 if (var19.isNull(var5)) {
                                    var20.d = null;
                                    break label8043;
                                 }
                              } catch (Throwable var807) {
                                 var10000 = var807;
                                 var10001 = false;
                                 break;
                              }

                              try {
                                 var20.d = var19.getString(var5);
                              } catch (Throwable var806) {
                                 var10000 = var806;
                                 var10001 = false;
                                 break;
                              }
                           }

                           try {
                              var840.add(var20);
                           } catch (Throwable var805) {
                              var10000 = var805;
                              var10001 = false;
                              break;
                           }
                        }
                     }

                     var833 = var10000;
                     var19.close();
                     var837.j();
                     throw var833;
                  }

                  var19.close();
                  var837.j();
                  HashMap var847 = new HashMap();
                  HashMap var844 = new HashMap();
                  Iterator var845 = var18.iterator();

                  while(true) {
                     while(var845.hasNext()) {
                        .fqq var842 = (.fqq)var845.next();
                        if (!var842.l && (var842.d != 0L || var842.e != 0L || var842.f != 0L)) {
                           var847.put(var842.a, var842);
                        } else {
                           var844.put(var842.a, var842);
                        }
                     }

                     var2 = var844.size();
                     var3 = var847.size();
                     StringBuilder var843 = new StringBuilder();
                     var843.append("DUMPING: ");
                     var843.append(var2);
                     var843.append(" SUSPECT, ");
                     var843.append(var3);
                     var843.append(" OK");
                     var1.println(var843.toString());
                     var1.flush();
                     if (!var844.isEmpty()) {
                        var1.println("\nSUSPECT SHOTS");
                        b(var844, var840, var1);
                     }

                     if (!var847.isEmpty()) {
                        var1.println("\nOK SHOTS");
                        b(var847, var840, var1);
                     }

                     var2 = var844.size();
                     var3 = var847.size();
                     StringBuilder var841 = new StringBuilder();
                     var841.append("\nDUMPED: ");
                     var841.append(var2);
                     var841.append(" SUSPECT, ");
                     var841.append(var3);
                     var841.append(" OK");
                     var1.println(var841.toString());
                     var1.flush();
                     var17.n();
                     return;
                  }
               }

               label8042: {
                  .fqq var846;
                  label7968: {
                     try {
                        var846 = new .fqq();
                        var846.a = var19.getLong(var5);
                        if (var19.isNull(var11)) {
                           var846.b = null;
                           break label7968;
                        }
                     } catch (Throwable var818) {
                        var10000 = var818;
                        var10001 = false;
                        break label8042;
                     }

                     try {
                        var846.b = var19.getString(var11);
                     } catch (Throwable var817) {
                        var10000 = var817;
                        var10001 = false;
                        break label8042;
                     }
                  }

                  label7957: {
                     try {
                        var846.c = var19.getLong(var9);
                        var846.d = var19.getLong(var8);
                        var846.e = var19.getLong(var3);
                        var846.f = var19.getLong(var7);
                        var846.g = var19.getLong(var10);
                        if (var19.isNull(var13)) {
                           var846.h = null;
                           break label7957;
                        }
                     } catch (Throwable var816) {
                        var10000 = var816;
                        var10001 = false;
                        break label8042;
                     }

                     try {
                        var846.h = var19.getString(var13);
                     } catch (Throwable var815) {
                        var10000 = var815;
                        var10001 = false;
                        break label8042;
                     }
                  }

                  label8044: {
                     try {
                        if (var19.isNull(var12)) {
                           var846.i = null;
                           break label8044;
                        }
                     } catch (Throwable var814) {
                        var10000 = var814;
                        var10001 = false;
                        break label8042;
                     }

                     try {
                        var846.i = var19.getString(var12);
                     } catch (Throwable var813) {
                        var10000 = var813;
                        var10001 = false;
                        break label8042;
                     }
                  }

                  label7937: {
                     label7936: {
                        try {
                           var846.j = var19.getLong(var6);
                           if (var19.getInt(var2) != 0) {
                              break label7936;
                           }
                        } catch (Throwable var812) {
                           var10000 = var812;
                           var10001 = false;
                           break label8042;
                        }

                        var14 = false;
                        break label7937;
                     }

                     var14 = true;
                  }

                  label7929: {
                     label7928: {
                        try {
                           var846.k = var14;
                           if (var19.getInt(var4) != 0) {
                              break label7928;
                           }
                        } catch (Throwable var811) {
                           var10000 = var811;
                           var10001 = false;
                           break label8042;
                        }

                        var14 = false;
                        break label7929;
                     }

                     var14 = true;
                  }

                  label7922:
                  try {
                     var846.l = var14;
                     var18.add(var846);
                     continue;
                  } catch (Throwable var810) {
                     var10000 = var810;
                     var10001 = false;
                     break label7922;
                  }
               }

               var833 = var10000;
               break label8029;
            }
         }

         var833 = var10000;
         var835 = var837;
      }

      var19.close();
      var835.j();
      throw var833;
   }
}
