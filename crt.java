import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

public final class crt implements cma {
   private final cry a;

   public crt(cry var1) {
      this.a = var1;
   }

   public final void ej(cmc var1, clv var2) {
      if (var2 != clv.ON_CREATE) {
         AssertionError var11 = new AssertionError("Next event must be ON_CREATE");
         throw var11;
      } else {
         var1.getLifecycle().c(this);
         Bundle var8 = this.a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
         if (var8 != null) {
            ArrayList var9 = var8.getStringArrayList("classes_to_restore");
            if (var9 == null) {
               throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            } else {
               crv var14;
               for(Iterator var3 = var9.iterator(); var3.hasNext(); var14.a(this.a)) {
                  String var10 = (String)var3.next();

                  Class var12;
                  try {
                     var12 = Class.forName(var10, false, crt.class.getClassLoader()).asSubclass(crv.class);
                     var12.getClass();
                  } catch (ClassNotFoundException var7) {
                     throw new RuntimeException(c.aA(var10, "Class ", " wasn't found"), var7);
                  }

                  Constructor var4;
                  try {
                     var4 = var12.getDeclaredConstructor();
                  } catch (NoSuchMethodException var6) {
                     StringBuilder var15 = new StringBuilder();
                     var15.append("Class ");
                     var15.append(var12.getSimpleName());
                     var15.append(" must have default constructor in order to be automatically recreated");
                     throw new IllegalStateException(var15.toString(), var6);
                  }

                  var4.setAccessible(true);

                  try {
                     Object var13 = var4.newInstance();
                     var13.getClass();
                     var14 = (crv)var13;
                  } catch (Exception var5) {
                     throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(var10)), var5);
                  }
               }

            }
         }
      }
   }
}
