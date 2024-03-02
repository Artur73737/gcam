import java.util.concurrent.CancellationException;

final class zu extends CancellationException {
   public zu() {
      super("Mutation interrupted");
   }

   public final Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
