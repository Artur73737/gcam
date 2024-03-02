import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class cqf {
   public static final int a = 0;
   private static final Class[] b = new Class[]{Context.class, AttributeSet.class};
   private static final HashMap c = new HashMap();

   public static final Preference a(XmlPullParser param0, PreferenceGroup param1, Context param2, Object[] param3, cqg param4, String[] param5) {
      // $FF: Couldn't be decompiled
   }

   private static final void b(XmlPullParser var0, Preference var1, AttributeSet var2, Context var3, Object[] var4, cqg var5, String[] var6) {
      int var9 = var0.getDepth();

      label67:
      while(true) {
         int var8 = var0.next();
         int var7 = var8;
         if (var8 == 3) {
            if (var0.getDepth() <= var9) {
               break;
            }

            var7 = 3;
         }

         if (var7 == 1) {
            break;
         }

         if (var7 == 2) {
            String var10 = var0.getName();
            XmlPullParserException var15;
            if ("intent".equals(var10)) {
               Intent var18;
               try {
                  var18 = Intent.parseIntent(var3.getResources(), var0, var2);
               } catch (IOException var11) {
                  var15 = new XmlPullParserException("Error parsing preference");
                  var15.initCause(var11);
                  throw var15;
               }

               var1.s = var18;
            } else if ("extra".equals(var10)) {
               var3.getResources().parseBundleExtra("extra", var2, var1.t());

               IOException var10000;
               label59: {
                  boolean var10001;
                  try {
                     var7 = var0.getDepth();
                  } catch (IOException var14) {
                     var10000 = var14;
                     var10001 = false;
                     break label59;
                  }

                  while(true) {
                     try {
                        var8 = var0.next();
                     } catch (IOException var13) {
                        var10000 = var13;
                        var10001 = false;
                        break;
                     }

                     if (var8 == 1) {
                        continue label67;
                     }

                     if (var8 == 3) {
                        try {
                           var8 = var0.getDepth();
                        } catch (IOException var12) {
                           var10000 = var12;
                           var10001 = false;
                           break;
                        }

                        if (var8 <= var7) {
                           continue label67;
                        }
                     }
                  }
               }

               IOException var16 = var10000;
               var15 = new XmlPullParserException("Error parsing preference");
               var15.initCause(var16);
               throw var15;
            } else {
               Preference var17 = d(var10, var2, var3, var4, var6);
               ((PreferenceGroup)var1).ak(var17);
               b(var0, var17, var2, var3, var4, var5, var6);
            }
         }
      }

   }

   private static final Preference c(String param0, String[] param1, AttributeSet param2, Context param3, Object[] param4) {
      // $FF: Couldn't be decompiled
   }

   private static final Preference d(String var0, AttributeSet var1, Context var2, Object[] var3, String[] var4) {
      Preference var9;
      Preference var10;
      label35: {
         InflateException var8;
         try {
            if (var0.indexOf(46) == -1) {
               var10 = c(var0, var4, var1, var2, var3);
               break label35;
            }

            var10 = c(var0, (String[])null, var1, var2, var3);
         } catch (InflateException var5) {
            throw var5;
         } catch (ClassNotFoundException var6) {
            var8 = new InflateException(c.aG(var0, var1, ": Error inflating class (not found)"));
            var8.initCause(var6);
            throw var8;
         } catch (Exception var7) {
            var8 = new InflateException(c.aG(var0, var1, ": Error inflating class "));
            var8.initCause(var7);
            throw var8;
         }

         var9 = var10;
         return var9;
      }

      var9 = var10;
      return var9;
   }
}
