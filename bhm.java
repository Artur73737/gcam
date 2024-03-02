import java.util.concurrent.CancellationException;

public final class bhm extends CancellationException {
   public bhm(long var1) {
      super(nx.b(var1, "Timed out waiting for ", " ms"));
   }

   public final Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
