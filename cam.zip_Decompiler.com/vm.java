import com.google.babelfish.device.avenh.l2l.modelutils.androidmodelextractor.MtR.NgAyRSYlmLoD;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public final class vm {
   public static final int[] a = new int[]{19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
   public static final ThreadFactory b;

   static {
      ThreadFactory var0 = Executors.defaultThreadFactory();
      var0.getClass();
      b = var0;
   }

   public static final ScheduledExecutorService a(ThreadFactory var0, int var1) {
      if (var1 > 0) {
         ScheduledExecutorService var2 = Executors.newScheduledThreadPool(var1, var0);
         var2.getClass();
         return var2;
      } else {
         throw new IllegalArgumentException(c.aK(var1, "Threads (", NgAyRSYlmLoD.XkwSNcvqcnGEbk));
      }
   }

   public static final ThreadFactory b(ThreadFactory var0, int var1) {
      return new vl(var1, var0);
   }

   public static final ThreadFactory c(ThreadFactory var0, String var1) {
      var0.getClass();
      return new psr(var0, var1, qwp.g(0), 1);
   }
}
