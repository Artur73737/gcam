import android.util.Log;
import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class rf {
   public static final qyo a = qwp.g(0);
   public final Object b = new Object();
   public final Map c = new LinkedHashMap();
   public final Set d = new LinkedHashSet();

   public final AutoCloseable a(Surface var1) {
      var1.getClass();
      if (!var1.isValid()) {
         Log.w("CXCP", c.aF(var1, "registerSurface: Surface ", " isn't valid!"));
      }

      Object var3 = this.b;
      synchronized(var3){}

      re var4;
      List var27;
      label278: {
         Throwable var10000;
         label284: {
            Integer var5;
            boolean var10001;
            try {
               var4 = new re(this, var1);
               var5 = (Integer)this.c.get(var1);
            } catch (Throwable var25) {
               var10000 = var25;
               var10001 = false;
               break label284;
            }

            int var2;
            if (var5 != null) {
               try {
                  var2 = var5;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label284;
               }
            } else {
               var2 = 0;
            }

            ++var2;

            StringBuilder var29;
            try {
               this.c.put(var1, var2);
               var29 = new StringBuilder();
               var29.append("registerSurface: surface=");
               var29.append(var1);
               var29.append(", surfaceToken=");
               var29.append(var4);
               var29.append(", newUseCount=");
               var29.append(var2);
               var29.append("");
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label284;
            }

            if (var2 != 1) {
               var27 = null;
               break label278;
            }

            label264:
            try {
               var29 = new StringBuilder();
               var29.append("Surface ");
               var29.append(var1);
               var29.append(" has become active");
               var27 = pwm.aD(this.d);
               break label278;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label264;
            }
         }

         Throwable var26 = var10000;
         throw var26;
      }

      if (var27 != null) {
         Iterator var28 = var27.iterator();

         while(var28.hasNext()) {
            ((rd)var28.next()).a();
         }
      }

      return var4;
   }
}
