import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dhj {
   public static final int a = 0;

   static {
      dae.b("DiagnosticsWrkr");
   }

   public static final void a(der var0, dfv var1, del var2, List var3) {
      Iterator var6 = var3.iterator();

      while(var6.hasNext()) {
         dfb var7 = (dfb)var6.next();
         dek var32 = dca.b(var2, deb.b(var7));
         Integer var33;
         if (var32 != null) {
            var33 = var32.c;
         } else {
            var33 = null;
         }

         String var5 = var7.a;
         crh var8 = crh.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
         var8.g(1, var5);
         det var35 = (det)var0;
         var35.a.l();
         Cursor var9 = cbm.g(var35.a, var8, false);

         ArrayList var10;
         label284: {
            Throwable var10000;
            label283: {
               boolean var10001;
               try {
                  var10 = new ArrayList(var9.getCount());
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label283;
               }

               while(true) {
                  label278: {
                     label277: {
                        try {
                           if (!var9.moveToNext()) {
                              break label284;
                           }

                           if (var9.isNull(0)) {
                              break label277;
                           }
                        } catch (Throwable var29) {
                           var10000 = var29;
                           var10001 = false;
                           break;
                        }

                        try {
                           var5 = var9.getString(0);
                           break label278;
                        } catch (Throwable var28) {
                           var10000 = var28;
                           var10001 = false;
                           break;
                        }
                     }

                     var5 = null;
                  }

                  try {
                     var10.add(var5);
                  } catch (Throwable var27) {
                     var10000 = var27;
                     var10001 = false;
                     break;
                  }
               }
            }

            Throwable var31 = var10000;
            var9.close();
            var8.j();
            throw var31;
         }

         var9.close();
         var8.j();
         String var37 = pwm.aN(var10, ",", (CharSequence)null, (CharSequence)null, (qvt)null, 62);
         String var38 = pwm.aN(var1.a(var7.a), ",", (CharSequence)null, (CharSequence)null, (qvt)null, 62);
         StringBuilder var36 = new StringBuilder();
         var36.append('\n');
         var36.append(var7.a);
         var36.append("\t ");
         var36.append(var7.b);
         var36.append("\t ");
         var36.append(var33);
         var36.append("\t ");
         int var4 = var7.u;
         String var34 = ccb.f(var4);
         if (var4 == 0) {
            throw null;
         }

         var36.append(var34);
         var36.append("\t ");
         var36.append(var37);
         var36.append("\t ");
         var36.append(var38);
         var36.append('\t');
      }

   }
}
