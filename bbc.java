import java.util.concurrent.CancellationException;

final class bbc extends CancellationException {
   public bbc() {
      super("The Modifier.Node was detached");
   }

   public final Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
