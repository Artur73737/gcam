import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public final class cnf {
   public static final List a = pwm.aS(new Class[]{Application.class, cmx.class});
   public static final List b = pwm.ak(cmx.class);

   public static final cnh a(Class var0, Constructor var1, Object... var2) {
      StringBuilder var7;
      try {
         cnh var6 = (cnh)var1.newInstance(Arrays.copyOf(var2, var2.length));
         return var6;
      } catch (IllegalAccessException var3) {
         var7 = new StringBuilder();
         var7.append("Failed to access ");
         var7.append(var0);
         throw new RuntimeException("Failed to access ".concat(var0.toString()), var3);
      } catch (InstantiationException var4) {
         throw new RuntimeException(c.aF(var0, "A ", " cannot be instantiated."), var4);
      } catch (InvocationTargetException var5) {
         var7 = new StringBuilder();
         var7.append("An exception happened in constructor of ");
         var7.append(var0);
         throw new RuntimeException("An exception happened in constructor of ".concat(var0.toString()), var5.getCause());
      }
   }

   public static final Constructor b(Class var0, List var1) {
      var1.getClass();
      Constructor[] var4 = var0.getConstructors();
      var4.getClass();

      for(int var2 = 0; var2 < var4.length; ++var2) {
         Constructor var3 = var4[var2];
         Class[] var5 = var3.getParameterTypes();
         var5.getClass();
         List var6 = pwm.ba(var5);
         if (c.E(var1, var6)) {
            var3.getClass();
            return var3;
         }

         if (var1.size() == var6.size() && var6.containsAll(var1)) {
            StringBuilder var7 = new StringBuilder();
            var7.append("Class ");
            var7.append(var0.getSimpleName());
            var7.append(" must have parameters in the proper order: ");
            var7.append(var1);
            throw new UnsupportedOperationException(var7.toString());
         }
      }

      return null;
   }
}
