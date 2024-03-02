import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class rhr {
   public static final Method a;

   static {
      Method var0;
      try {
         var0 = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
      } finally {
         ;
      }

      a = var0;
   }
}
