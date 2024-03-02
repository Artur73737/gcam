import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.MissingResourceException;
import java.util.Properties;

public final class a {
   private static final Properties a;

   static {
      Properties var1 = new Properties();
      a = var1;

      label43: {
         label42: {
            label47: {
               InputStream var0;
               boolean var10001;
               label40: {
                  try {
                     if (System.getSecurityManager() != null) {
                        b var8 = new b(c.class);
                        var0 = (InputStream)AccessController.doPrivileged(var8);
                        break label40;
                     }
                  } catch (MissingResourceException var6) {
                     var10001 = false;
                     break label42;
                  } catch (IOException var7) {
                     var10001 = false;
                     break label47;
                  }

                  try {
                     var0 = c.class.getResourceAsStream("/android/icumessageformat/ICUConfig.properties");
                  } catch (MissingResourceException var4) {
                     var10001 = false;
                     break label42;
                  } catch (IOException var5) {
                     var10001 = false;
                     break label47;
                  }
               }

               if (var0 == null) {
                  break label43;
               }

               try {
                  var1.load(var0);
                  break label43;
               } catch (MissingResourceException var2) {
                  var10001 = false;
                  break label42;
               } catch (IOException var3) {
                  var10001 = false;
               }
            }

            return;
         }

         return;
      }

   }

   public static String a() {
      String var0;
      if (System.getSecurityManager() != null) {
         try {
            qaq var3 = new qaq(1);
            var0 = (String)AccessController.doPrivileged(var3);
         } catch (AccessControlException var2) {
            var0 = null;
         }
      } else {
         var0 = System.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode");
      }

      String var1 = var0;
      if (var0 == null) {
         var1 = a.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL");
      }

      return var1;
   }
}
