import android.app.Application;
import java.lang.reflect.InvocationTargetException;

public final class cni extends cnk {
   public static cni a;
   public static final cno b;
   private final Application e;

   static {
      b = cna.a;
   }

   public cni() {
      this((Application)null);
   }

   public cni(Application var1) {
      this.e = var1;
   }

   private final cnh c(Class var1, Application var2) {
      cnh var8;
      if (clh.class.isAssignableFrom(var1)) {
         StringBuilder var3;
         StringBuilder var9;
         cnh var10;
         try {
            var10 = (cnh)var1.getConstructor(Application.class).newInstance(var2);
         } catch (NoSuchMethodException var4) {
            var3 = new StringBuilder();
            var3.append("Cannot create an instance of ");
            var3.append(var1);
            throw new RuntimeException("Cannot create an instance of ".concat(var1.toString()), var4);
         } catch (IllegalAccessException var5) {
            var9 = new StringBuilder();
            var9.append("Cannot create an instance of ");
            var9.append(var1);
            throw new RuntimeException("Cannot create an instance of ".concat(var1.toString()), var5);
         } catch (InstantiationException var6) {
            var3 = new StringBuilder();
            var3.append("Cannot create an instance of ");
            var3.append(var1);
            throw new RuntimeException("Cannot create an instance of ".concat(var1.toString()), var6);
         } catch (InvocationTargetException var7) {
            var9 = new StringBuilder();
            var9.append("Cannot create an instance of ");
            var9.append(var1);
            throw new RuntimeException("Cannot create an instance of ".concat(var1.toString()), var7);
         }

         var10.getClass();
         var8 = var10;
      } else {
         var8 = super.a(var1);
      }

      return var8;
   }

   public final cnh a(Class var1) {
      Application var2 = this.e;
      if (var2 != null) {
         return this.c(var1, var2);
      } else {
         throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
      }
   }

   public final cnh b(Class var1, cnp var2) {
      cnh var3;
      if (this.e != null) {
         var3 = this.a(var1);
      } else {
         Application var4 = (Application)var2.a(b);
         if (var4 != null) {
            var3 = this.c(var1, var4);
         } else {
            if (clh.class.isAssignableFrom(var1)) {
               throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }

            var3 = super.a(var1);
         }
      }

      return var3;
   }
}
