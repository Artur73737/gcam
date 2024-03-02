import java.util.concurrent.CancellationException;

public final class rgu extends CancellationException {
   public rgu() {
      super("Child of the scoped flow was cancelled");
   }

   public final Throwable fillInStackTrace() {
      if (qzx.a) {
         return super.fillInStackTrace();
      } else {
         this.setStackTrace(new StackTraceElement[0]);
         return this;
      }
   }
}
