import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import java.util.concurrent.TimeUnit;

public abstract class lru extends JobService {
   public static final long a;

   static {
      a = TimeUnit.DAYS.toMillis(1L);
   }

   public abstract mzw a(Context var1);

   public final boolean onStartJob(JobParameters var1) {
      mzw var4 = this.a(this);
      long var2 = TimeUnit.DAYS.toMillis(30L);
      Object var6 = var4.a;
      mge var5 = new mge(var2, 1);
      osh.aE(((lsa)var6).a(var5), new eqy(this, var1, 2), pre.a);
      return true;
   }

   public final boolean onStopJob(JobParameters var1) {
      return true;
   }
}
