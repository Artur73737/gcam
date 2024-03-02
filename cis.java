import android.widget.TextView;

public final class cis {
   public static int a(TextView var0) {
      return var0.getMaxLines();
   }

   static int b(TextView var0) {
      return var0.getMinLines();
   }

   public static boolean c(TextView var0) {
      return var0.getIncludeFontPadding();
   }

   public static final cly d(cmc var0) {
      clx var1 = var0.getLifecycle();
      var1.getClass();

      cly var3;
      while(true) {
         var3 = (cly)var1.a.get();
         if (var3 != null) {
            break;
         }

         rbg var4 = qzy.n();
         qzr var2 = rah.a;
         var3 = new cly(var1, var4.plus(rij.a.h()));
         if (c.v(var1.a, var3)) {
            qwo.o(var3, rij.a.h(), 0, new clz(var3, (que)null), 2);
            break;
         }
      }

      return var3;
   }
}
