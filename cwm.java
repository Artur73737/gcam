import android.content.Context;
import android.util.Log;
import com.google.android.libraries.memorymonitor.Xhk.PUdPFKr;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class cwm {
   public static final boolean a(Context var0) {
      var0.getClass();
      return var0.getPackageManager().hasSystemFeature(PUdPFKr.anAkKtQLe);
   }

   public static final boolean b(String var0, qvi var1) {
      boolean var3 = false;

      boolean var2;
      label45: {
         label35: {
            boolean var10001;
            try {
               var2 = (Boolean)var1.a();
            } catch (ClassNotFoundException var6) {
               var10001 = false;
               break label45;
            } catch (NoSuchMethodException var7) {
               var10001 = false;
               break label35;
            }

            if (var2) {
               return var2;
            }

            try {
               Log.e("ReflectionGuard", var0);
               return var2;
            } catch (ClassNotFoundException var4) {
               var10001 = false;
               break label45;
            } catch (NoSuchMethodException var5) {
               var10001 = false;
            }
         }

         Log.e("ReflectionGuard", "NoSuchMethod: ".concat(var0));
         var2 = var3;
         return var2;
      }

      Log.e("ReflectionGuard", "ClassNotFound: ".concat(var0));
      var2 = var3;
      return var2;
   }

   public static final boolean c(qvi var0) {
      boolean var1 = false;

      try {
         var0.a();
      } catch (ClassNotFoundException var2) {
         return var1;
      } catch (NoClassDefFoundError var3) {
         return var1;
      }

      var1 = true;
      return var1;
   }

   public static final boolean d(Method var0, Class var1) {
      return var0.getReturnType().equals(var1);
   }

   public static final boolean e(Method var0) {
      return Modifier.isPublic(var0.getModifiers());
   }

   public static final boolean f(Class var0, Class var1) {
      Method[] var4 = var1.getMethods();
      var4.getClass();
      boolean var3 = false;
      int var2 = 0;

      while(true) {
         if (var2 >= var4.length) {
            var3 = true;
            break;
         }

         Method var6 = var4[var2];
         StringBuilder var5 = new StringBuilder();
         var5.append(var0.getName());
         var5.append('#');
         var5.append(var6.getName());
         var5.append(" is not valid");
         if (!b(var5.toString(), new us(var0, var6, 17, (byte[])null))) {
            break;
         }

         ++var2;
      }

      return var3;
   }

   public static final boolean g(Method var0, qxs var1) {
      return d(var0, ((qwj)var1).d);
   }
}
