import android.os.Looper;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;

public final class cjf {
   private static final ThreadLocal j = new ThreadLocal();
   public final xo a = new xo();
   public final ArrayList b = new ArrayList();
   public final Runnable c = new nj(this, 13);
   public long d = 0L;
   public boolean e = false;
   public float f = 1.0F;
   public cje g;
   public final AmbientMode$AmbientController h = new AmbientMode$AmbientController(this);
   public final ebt i;

   public cjf(ebt var1) {
      this.i = var1;
   }

   public static cjf a() {
      ThreadLocal var0 = j;
      if (var0.get() == null) {
         var0.set(new cjf(new ebt((byte[])null, (byte[])null, (byte[])null)));
      }

      return (cjf)var0.get();
   }

   public final boolean b() {
      ebt var1 = this.i;
      return Thread.currentThread() == ((Looper)var1.a).getThread();
   }
}
