import java.util.concurrent.CancellationException;

final class bic extends CancellationException {
   public bic() {
      super("Pointer input was reset");
   }

   public final Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
