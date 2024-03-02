import android.os.Handler;
import java.util.concurrent.Executor;

public final class dhh implements Executor {
   final dub a;

   public dhh(dub var1) {
      this.a = var1;
   }

   public final void execute(Runnable var1) {
      ((Handler)this.a.c).post(var1);
   }
}
