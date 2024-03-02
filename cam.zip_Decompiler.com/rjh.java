import java.util.concurrent.TimeUnit;

public final class rjh {
   public static final long a = qwo.u("kotlinx.coroutines.scheduler.resolution.ns", 100000L);
   public static final int b;
   public static final int c;
   public static final long d;
   public static final rjf e;
   public static final rjf f;

   static {
      b = qwo.t("kotlinx.coroutines.scheduler.core.pool.size", qxb.k(rir.a, 2), 1, 0, 8);
      c = qwo.t("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
      d = TimeUnit.SECONDS.toNanos(qwo.u("kotlinx.coroutines.scheduler.keep.alive.sec", 60L));
      e = new rjf(0);
      f = new rjf(1);
   }
}
