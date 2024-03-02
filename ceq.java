import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ceq {
   public static final xn a = new xn(16);
   public static final ExecutorService b;
   public static final Object c;
   public static final xo d;

   static {
      nao var0 = new nao(1);
      ThreadPoolExecutor var1 = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), var0);
      var1.allowCoreThreadTimeOut(true);
      b = var1;
      c = new Object();
      d = new xo();
   }

   public static String a(cen var0, int var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(var0.e);
      var2.append("-");
      var2.append(var1);
      return var2.toString();
   }

   public static nbu b(String param0, Context param1, cen param2, int param3) {
      // $FF: Couldn't be decompiled
   }
}
