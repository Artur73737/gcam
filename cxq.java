import android.os.Build;
import android.util.DisplayMetrics;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import androidx.window.extensions.core.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// $FF: synthetic class
public final class cxq implements Consumer {
   public final cxt a;
   public final rdo b;

   // $FF: synthetic method
   public cxq(cxt var1, rdo var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void accept(Object var1) {
      cxt var6 = this.a;
      rdo var7 = this.b;
      Integer var14 = (Integer)var1;
      var14.getClass();
      int var2 = var14;
      int var3 = cxt.g;
      Collection var5;
      DisplayMetrics var15;
      cyx var16;
      if (var6.c >= 3) {
         var15 = var6.b.getRearDisplayMetrics();
         var15.getClass();
         var16 = cyy.a(var15);
      } else {
         List var17 = cxz.a;
         String var8 = Build.MANUFACTURER;
         var8.getClass();
         String var9 = Build.MODEL;
         var9.getClass();
         Iterator var10 = cxz.a.iterator();

         while(true) {
            boolean var4 = var10.hasNext();
            var5 = null;
            if (!var4) {
               var1 = null;
               break;
            }

            var1 = var10.next();
            cxy var11 = (cxy)var1;
            String var12 = var11.a;
            Locale var13 = Locale.US;
            var13.getClass();
            String var23 = var8.toLowerCase(var13);
            var23.getClass();
            if (c.E(var12, var23)) {
               String var21 = var11.b;
               Locale var22 = Locale.US;
               var22.getClass();
               var12 = var9.toLowerCase(var22);
               var12.getClass();
               if (c.E(var21, var12)) {
                  break;
               }
            }
         }

         cxy var18 = (cxy)var1;
         if (var18 != null) {
            var15 = var18.c;
         } else {
            var15 = var5;
         }

         if (var15 == null) {
            IllegalArgumentException var20 = new IllegalArgumentException("DeviceUtils rear display metrics entry should not be null");
            throw var20;
         }

         var16 = cyy.a(var15);
      }

      var6.d = AmbientModeSupport$AmbientCallback.a(var2);
      var6.d(cxj.a, var6.d, var16);
      rdu var19 = var7.P();
      var5 = var6.f.values();
      var5.getClass();
      var19.u(pwm.aD(var5));
   }
}
