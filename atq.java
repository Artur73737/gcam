import java.util.concurrent.CancellationException;

final class atq extends CancellationException {
   public atq() {
      super("The coroutine scope left the composition");
   }

   public final Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
