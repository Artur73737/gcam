import android.app.Activity;
import java.util.concurrent.Executor;

public final class czn {
   public final Activity a;
   public final cew b;
   public cyw c;
   private final Executor d;

   public czn(Activity var1, Executor var2, cew var3) {
      this.a = var1;
      this.d = var2;
      this.b = var3;
   }

   public final void a(cyw var1) {
      this.c = var1;
      this.d.execute(new ay(this, var1, 16, (byte[])null));
   }
}
