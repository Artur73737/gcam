import java.util.concurrent.CancellationException;

final class aco extends CancellationException {
   public aco() {
      super("Mutation interrupted");
   }

   public final Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
