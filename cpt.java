import android.os.CancellationSignal;
import android.view.Window;
import android.view.WindowInsets.Type;
import java.util.Map;
import java.util.concurrent.Callable;

public final class cpt {
   static void a(Window var0) {
      var0.getDecorView().getWindowInsetsController().show(Type.ime());
   }

   public static final Object b(crc var0, boolean var1, CancellationSignal var2, Callable var3, que var4) {
      Object var7;
      if (var0.s() && var0.r()) {
         var7 = var3.call();
      } else {
         crk var5 = (crk)var4.n().get(crk.c);
         if (var5 != null) {
            var7 = var5.a;
         } else if (var1) {
            var7 = cbi.d(var0);
         } else {
            Map var6 = var0.j;
            Object var9 = var6.get("QueryDispatcher");
            if (var9 == null) {
               var7 = qxb.t(var0.h());
               var6.put("QueryDispatcher", var7);
            } else {
               var7 = var9;
            }

            var7 = (qzr)var7;
         }

         qza var10 = new qza(quy.h(var4), 1);
         var10.r();
         var10.s(new bos(var2, qwo.o(raw.a, (qui)var7, 0, new cqu(var3, var10, (que)null), 2), 6));
         Object var8 = var10.c();
         var7 = var8;
         if (var8 == qul.a) {
            var4.getClass();
            return var8;
         }
      }

      return var7;
   }

   public static final Object c(crc var0, Callable var1, que var2) {
      Object var4;
      if (var0.s() && var0.r()) {
         var4 = var1.call();
      } else {
         crk var3 = (crk)var2.n().get(crk.c);
         if (var3 != null) {
            var4 = var3.a;
         } else {
            var4 = cbi.d(var0);
         }

         var4 = qwo.k((qui)var4, new cqt(var1, (que)null), var2);
      }

      return var4;
   }
}
