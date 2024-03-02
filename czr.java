import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class czr implements ThreadFactory {
   final boolean a;
   private final AtomicInteger b;

   public czr(boolean var1) {
      this.a = var1;
      this.b = new AtomicInteger(0);
   }

   public final Thread newThread(Runnable var1) {
      var1.getClass();
      String var2;
      if (!this.a) {
         var2 = "androidx.work-";
      } else {
         var2 = "WM.task-";
      }

      StringBuilder var3 = new StringBuilder();
      var3.append(var2);
      var3.append(this.b.incrementAndGet());
      return new Thread(var1, var3.toString());
   }
}
