import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class epm extends JobService {
   public static final long e;

   static {
      e = TimeUnit.DAYS.toMillis(1L);
   }

   public abstract psd b();

   public abstract psd c();

   protected abstract ExecutorService d();

   public final boolean onStartJob(JobParameters var1) {
      osh.aE(pqp.j(prx.q(this.b()), new epg(this, 2), this.d()), new eqy(this, var1, 1), this.d());
      return true;
   }

   public final boolean onStopJob(JobParameters var1) {
      return true;
   }
}
