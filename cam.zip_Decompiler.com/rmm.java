import android.content.Context;
import android.util.Log;
import com.google.android.libraries.lens.lenslite.dynamicloading.LjhL.gThp;
import com.google.lullaby.modules.audio.nwj.OtvMV;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class rmm {
   private static final String a = rmm.class.getSimpleName();

   public static List c(Context var0) {
      LinkedHashSet var2 = new LinkedHashSet();
      int var1 = var0.getResources().getIdentifier("CronetProviderClassName", "string", var0.getPackageName());
      if (var1 != 0) {
         String var3 = var0.getResources().getString(var1);
         if (var3 != null && !var3.equals("com.google.android.gms.net.PlayServicesCronetProvider") && !var3.equals("com.google.android.gms.net.GmsCoreCronetProvider") && !var3.equals("org.chromium.net.impl.JavaCronetProvider") && !var3.equals("org.chromium.net.impl.NativeCronetProvider") && !g(var0, var3, var2, true)) {
            Log.e(a, c.aA(var3, "Unable to instantiate Cronet implementation class ", gThp.HvhQYE));
         }
      }

      g(var0, "com.google.android.gms.net.PlayServicesCronetProvider", var2, false);
      g(var0, "com.google.android.gms.net.GmsCoreCronetProvider", var2, false);
      g(var0, "org.chromium.net.impl.NativeCronetProvider", var2, false);
      g(var0, "org.chromium.net.impl.JavaCronetProvider", var2, false);
      return Collections.unmodifiableList(new ArrayList(var2));
   }

   private static void f(String var0, boolean var1, Exception var2) {
      if (var1) {
         var0 = OtvMV.ACQMrCol.concat(var0);
         Log.e(a, var0, var2);
      }

   }

   private static boolean g(Context var0, String var1, Set var2, boolean var3) {
      ClassLoader var4 = var0.getClassLoader();

      try {
         var2.add((rmm)var4.loadClass(var1).asSubclass(rmm.class).getConstructor(Context.class).newInstance(var0));
         return true;
      } catch (InstantiationException var5) {
         f(var1, var3, var5);
      } catch (InvocationTargetException var6) {
         f(var1, var3, var6);
      } catch (NoSuchMethodException var7) {
         f(var1, var3, var7);
      } catch (IllegalAccessException var8) {
         f(var1, var3, var8);
      } catch (ClassNotFoundException var9) {
         f(var1, var3, var9);
      }

      return false;
   }

   public abstract String a();

   public abstract String b();

   public abstract boolean d();

   public abstract nlz e();

   public final String toString() {
      throw null;
   }
}
